Feature: Reduce Items

Scenario Outline: User reduce items - without login

    When User in homepage
    And User select product
    And User click button Beli
    And click icon Keranjang to see product
    Then User can reduce items
    
        Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |