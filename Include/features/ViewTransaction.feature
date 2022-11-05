Feature: View Transaction

  #Background:
  #Given I open browser login
  #When I fill correct email <email> and password <password>
  #And I click button login
  #And I can login
  Scenario Outline: User view transaction - without login
    When User in homepage
    And User select product
    And User click button Beli
    And click icon Keranjang to see product
    And User click button Bayar
    Then user go to login page 

    Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |
