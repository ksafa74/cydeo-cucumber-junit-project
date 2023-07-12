Feature: Etsy search functionality

  Agile Story: As a user, I should be able to type a keyword and see information
  relating to that keyword.

  Scenario: Etsy Title Verification

    Given user is on the Etsy homepage
    Then user should see expected title
    # expected title: Etsy - Shop for handmade, vintage, custom, and unique gifts for
    #everyone

  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    Given user is on the Etsy homepage
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    Given user is on the Etsy homepage
    When User types "Metal Spoon" in the search box
    And User clicks search button
    Then User sees "Metal spoon - Etsy" is in the title


