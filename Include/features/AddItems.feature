Feature: Add Items

  Scenario Outline: Add items - without login
    When User in homepage
    And User select product
    And User click button Beli
    And click icon Keranjang to see product
    Then User can add items

    Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |

  #Scenario Outline: Add items

    #And User select product
    #And User click button Beli
    #And click icon Keranjang to see product
    #Then User can add items
#
    #Examples: 
      #| email          | password |
      #| olaf@gmail.com | olafaja  |
