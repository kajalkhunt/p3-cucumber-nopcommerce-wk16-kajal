  @Regression

  Feature: Computer page Test
  As user I want to navigate computer page and build my own computer and add to cart

 @sanity
  Scenario: Verify User Should Navigate To Computer Page Successfully
    Given I am on homepage
    When  I click on Computers
    Then  I should navigate to Computer page successfully

 @sanity
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given I am on Computers
    When  I click on Computers
    And   I click on Desktops
    Then  I should nevigate to desktop page successfully


    @smoke
  Scenario Outline: Verify That User Should Build Your Own Computer And Add To Cart Successfully
    Given I am on homepage
    When  I click on Computers
    And   I click on Desktops
    And    I select product "Build your own computer"
      And     I select processor "<processor>"
      And     I select RAM "<ram>"
      And     I select HDD "<hdd>"
      And     I select OS "<os>"
      And     I select Software "<software>"
      And     I click on Add to Cart Button
      Then    I can add product to cart successfully
    Examples:
      | processor                                       | ram           | hdd               | os                       | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]     | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00]  | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]     | Total Commander [+$5.00]   |

















#  As user I want to login into nop commerce website
#
##  @smoke
#  Scenario: User Should Navigate To Computer Page Successfully
#    Given I am on homepage
#    When I click on Computers Tab
#    Then I should navigate to computers page successfully
#
#  Scenario: Verify User Should Navigate To Desktops Page Successfully
#    Given I am on homepage
#    When  I click on Computers Tab
#    And   I click on Desktop link
#    And   I verify Desktop Text
#    Then I should navigate to computers page successfully
#
#  Scenario: Verify That User Should Build Your Own Computer And Add Them To Cart Successfully
#    Given

#   @smoke @sanity @bug
#  Scenario: User should login successfully with valid credentials
#    Given  I am on homepage
#    When I click on login link
#    And I enter email "primeeight@gmail.com"
#    And I enter password "abc123"
#    And I click on login button
#    Then I should login successfully
#
##     @sanity
#  Scenario Outline: Verify the error message with invalid credentials
#    Given  I am on homepage
#    When I click on login link
#    And I enter email "<email>"
#    And I enter password "<password>"
#    And I click on login button
#    Then I should see the error message "<errorMessage>"
#    Examples:
#      | email              | password | errorMessage                                                                                |
#      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
#      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
#      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
#
