Feature: Filtering By Product
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
    And User filtering product with click Product
    Then transaction will filtering by product

    Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |