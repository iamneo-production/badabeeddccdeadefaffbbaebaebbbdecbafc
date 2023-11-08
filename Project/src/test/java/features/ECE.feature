# Feature: Testing ELC Website Functionality

#   Background:
#     Given I am on ELC Website


#   Scenario: Search for a product
#     When I input the text "Peppa pig" into the search box    
#     And I click on the first option from the auto-populated list
#     Then I confirm that the search results page contains the label "Peppa Pig"


#   # Scenario: Filter products by price range
#   #   When I hover the mouse over the "Shop by age" menu and click the "0-3 months" category
#   #   And I scroll down until I locate the "Price" option on the left side of the page
#   #   And I click the value "£15 - £29.99" from the price range options
#   #   Then I verify the total number of results found based on the selected price range


#   # Scenario: Filter products by brand in "Offers" > "Wooden Toys"
#   #   When I click on the "Offers" menu
#   #   And I scroll down until I reach the "Brands" filter
#   #   And I click on the "Show more" link
#   #   And I click the checkbox of "Paw patrol"
#   #   Then I verify whether the name of the chosen brand is available on the page


Feature: YesStyle Website Testing

  Scenario Outline: Search for Face Creams with Japanese Brands
    Given I launch the web browser and navigate to the URL "https://www.yesstyle.com/"
      When I click on the search icon in the top navigation bar
      And I input "Face creams " in the search bar
      And I click on the first result that lists "Face creams" in the displayed suggestion list
      And I check the "Japanese Brands" checkbox under the "Featured" section on the left side
      Then I should see the filter "Japanese Brands" applied in the "Refined By" section on the top left side

  

  Scenario: Add a Briefcase to the Bag and Verify Select Size/Color Popup
    Given I launch the web browser and navigate to the URL "https://www.yesstyle.com/"
      When I hover over "MEN" in the top navigation bar and click the "BAGS" category
      And I click on "Briefcases" in the category filter on the left side
      And I click on the first briefcase product displayed
      And I click on the "ADD TO BAG" button
      Then I should see a pop-up containing the label "Select size or color" and capture a screenshot

  Scenario: Verify "Style Dials" Page
    Given I launch the web browser and navigate to the URL "https://www.yesstyle.com/"
    When I click on the "BLOG" in the top navigation bar, and I am redirected to a new tab
    And I hover over "MULTIMEDIA" in the top navigation bar and click on "Style Dials"
    Then I should see the header label "STYLE DIALS" on the redirected page and capture a screenshot
