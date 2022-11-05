Feature: Select Category

  #Background: 
    #Given I open browser login
    #When I fill correct email <email> and password <password>
    #And I click button login
    #And I can login

Scenario Outline: User can select category - for search a product base on category
    When User in homepage
    And User select product
    And User choose category
    And click category
    Then User can see product
    
        Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |