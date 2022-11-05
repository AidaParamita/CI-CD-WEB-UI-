Feature: Pay The Items

Scenario Outline: Pay the Items - without login
    When User in homepage
    And User select product
    And User click button Beli
    And click icon Keranjang to see product
    And User click button Bayar
    Then user go to login page 
    
        Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |