
Feature: YesStyle Website Testing

  Scenario: Search for Face Creams with Japanese Brands
    
    Given I am on YesStyle Website 
      When I click on the search icon in the top navigation bar and search for "Face Creams"
      And I check the "Japanese Brands" checkbox under the "Featured" section on the left side
      Then I should see the filter "Japanese Brands" applied in the "Refined By" section on the top left side

  # Scenario: Add a Briefcase to the Bag and Verify Select Size/Color Popup

  #    Given I am on YesStyle Website to search Bags
  #     When I hover over "MEN" in the top navigation bar and click the "BAGS" category
  #     And I click on "Briefcases" in the category filter on the left side
  #     And I click on the first briefcase product displayed
  #     And I click on the "ADD TO BAG" button
  #     Then I should see a pop-up containing the label "Select size or color" and capture a screenshot

  # Scenario: Verify "Style Dials" Page

  #  Given I am on YesStyle Website to search Blogs
  #   When I click on the "BLOG" in the top navigation bar, and I am redirected to a new tab
  #   And I hover over "MULTIMEDIA" in the top navigation bar and click on "Style Dials"
  #   Then I should see the header label "STYLE DIALS" on the redirected page and capture a screenshot
