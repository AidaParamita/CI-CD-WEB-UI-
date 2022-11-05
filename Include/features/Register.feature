Feature: Register

  Scenario Outline: User create new account - with fill all field
    Given I open browser regis
    When I fill correct fullname <fullname> and email <email> and password <password>
    And I click button register
    Then I can register

    Examples: 
      | fullname | email             | password   |
      | Taylor4  | taylor4@gmail.com | taylor4aja |
      |          | bagus3@gmail.com  | bagus3aja  |