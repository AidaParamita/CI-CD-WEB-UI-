Feature: Login

  Scenario Outline: User log in into website using existing acount
    Given I open browser login
    When I fill correct email <email> and password <password>
    And I click button login
    Then I can login

    Examples: 
      | email          | password |
      | olaf@gmail.com | olafaja  |
      | cat@gmail.com  | cataja   |