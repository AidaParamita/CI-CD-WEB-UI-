Feature: View Detail Items

  #Background: 
    #Given I open browser login
    #When I fill correct email <email> and password <password>
    #And I click button login
    #And I can login

Scenario Outline: User view detail items - without login
    When User in homepage
    And User select product
    And User click button Detail
    Then User can see detail product
    
        Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |