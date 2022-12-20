Feature: Register

Scenario: verify User Should Navigate To Register Page Successfully
  Given I am on homepage
  When I click on register link
  Then I should navigate to register page successfully

  Scenario: Verify That First Name LastName Email Password And Confirm Password Fields Are Mandatory
    Given  I am on homepage
    When   I click on register link
    And    I click on register button
    And   I verify first msg error msg
    And   I verify last name msg error message
    And   I Verify the email error message
    And   I Verify the password error message
    Then   I Verify the confirm password error message

@Test
  Scenario Outline: User Should Create Account Successfully
    Given I am on homepage
    When I click on register link
    And I select gender"<gender>"
    And I enter First Name"<firstName>"
    And I enter Last Name"<lastName>"
    And I select Date of Birth "<dateOfBirth>"
    And I select Birth month "<birthMonth>"
    And I select Birth year "<birthYear>"
    And I enter email"<email>"
    And I enter Password "<password>"
    And I confirm Password "<confirmPassword>"
    And I click on register button
    Then Registered Successfully
    Examples:
     |  gender    | firstName | lastName | dateOfBirth | birthMonth | birthYear  |       email        | password | confirmPassword |
     |   Male     |   Yash    |  Chopra  |     16      |  December   |   1965     | YChopra3@gmail.com |  abc123  |     abc123      |
