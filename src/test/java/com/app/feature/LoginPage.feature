Feature: Validate the Login Page Module

  @smoke
  Scenario: Validate the correct username and password
    Given Load the browser
    And Load the URL
    When Enter the username "Aiite"
    And Enter the password "Aiitewnrbe"
    And Click the login button
    Then Validate the home page

  @Sanity
  Scenario: Validate the incorrect username and correct password
    Given Load the browser
    And Load the URL
    When Enter the username "Aiitcjsdvjfvjsdvfdse"
    And Enter the password "Aiitewnrbjhfvhsdfhudse"
    And Click the login button
    Then Validate the home page

  @test
  Scenario Outline: Validate the user and pass
    When Enter the user "<username>"
    And Enter the pass "<password>"
    Examples: 
      | username | password       |
      | Aiite1   | Aiweyurgwehf   |
      | Aiite2   | sjhdfhsdgfgd   |
      | Aiite3   | sdkjfhsfhdsahv |
