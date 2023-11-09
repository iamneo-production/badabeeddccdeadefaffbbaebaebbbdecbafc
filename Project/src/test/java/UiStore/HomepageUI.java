package UiStore;

import org.openqa.selenium.By;

public class HomepageUI {
    

    public By searchBar() {
        return By.xpath("//*[@id=\\\"__next\\\"]/header/div/div/div[1]/button[2]/i");
          
    }

    public By japanBrand() {
        return By.xpath("//body/div[3]/main[1]/div[3]/div[1]/div[1]/div[2]/v-accordion[3]/v-pane[1]/v-pane-content[1]/div[1]/ul[1]/li[8]/md-checkbox[1]/div[1]");
    }

    public By refinedBy() {
        return By.xpath("//input[@id='dep_datepicker']");
    }

    
   
}
