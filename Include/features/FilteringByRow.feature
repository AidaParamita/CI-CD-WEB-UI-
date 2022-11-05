Feature: Filtering By Row

  Background:
  Given I open browser login
  When I fill correct email <email> and password <password>
  And I click button login
  And I can login
  
  Scenario Outline: User filtering list transaction with row 
    When User in homepage
    And User select product
    And User click button Beli
    And click icon Keranjang to see product
    And User click button Bayar
    And User can see all transaction product
    Then User filtering with row

    Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |