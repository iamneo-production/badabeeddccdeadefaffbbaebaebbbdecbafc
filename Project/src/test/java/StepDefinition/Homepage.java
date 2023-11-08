package StepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;

import Pages.Testcase1;
import Pages.Url;
import Utils.Base;
import Utils.Reporter;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage{
    ExtentReports extent = new ExtentReports();
    private Url url;
    private Testcase1 testcase1;
    private WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    Base base = new Base();

    public Homepage() { 
    }

    @Before
    public void setUp() throws MalformedURLException {
       extent = Reporter.generateExtentReport();
    }
    
    @Given("^I am on YesStyle Website$")
    public void i_am_on_YesStyle_Website() throws Throwable{
        driver = base.openBrowser();
        driver.manage().window().maximize();
        url = new Url(driver);
        testcase1 = new Testcase1(driver);
        System.out.println("Testing im on ELC Website");
        url.LaunchSite(driver);
    }

    @When("^I click on the search icon in the top navigation bar$")
    public void i_click_on_the_search_icon_in_the_top_navigation_bar() throws Throwable {
        
    }

    @When("^I input \"([^\"]*)\" in the search bar$")
    public void i_input_in_the_search_bar(String arg1) throws Throwable {
       
    }

    @When("^I click on the first result that lists \"([^\"]*)\" in the displayed suggestion list$")
    public void i_click_on_the_first_result_that_lists_in_the_displayed_suggestion_list(String arg1) throws Throwable {
       
    }

    @When("^I check the \"([^\"]*)\" checkbox under the \"([^\"]*)\" section on the left side$")
    public void i_check_the_checkbox_under_the_section_on_the_left_side(String arg1, String arg2) throws Throwable {
        
    }

    @Then("^I should see the filter \"([^\"]*)\" applied in the \"([^\"]*)\" section on the top left side$")
    public void i_should_see_the_filter_applied_in_the_section_on_the_top_left_side(String arg1, String arg2) throws Throwable {
        
    
    }

    @After
    public void tearDown() {
        System.out.println("Quit Driver");
        if(driver != null) {
            driver.quit();
        }
        extent.flush();
    }

}
