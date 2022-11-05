Feature: Buy Items

  Background: 
    Given I open browser login
    When I fill correct email <email> and password <password>
    And I click button login
    And I can login

  Scenario Outline: User buy items - without login
    When User in homepage
    And User select product
    And User click button Beli
    Then click icon Keranjang to see product

    Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |
