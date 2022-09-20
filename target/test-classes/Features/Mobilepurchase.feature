#Author: your.madhes@your.domain.com

Feature: mobile purchase validation in flipkart 

  Background:
   Given user enter the url 
    And  user login
    
  Scenario: mobile purchase by list
    When user search the mobile by list
    | realme mobile | oneplus mobile |
    And  user select the mobile 
    And  windows handling
    Then user add to the cart selected mobile
    And  screenshot the cart page

  Scenario Outline: mobile purchase by scenario outline
    When user search the mobile by outline "<Mobiles>"
    And user select the mobile 
    And windows handling
    Then user add to the cart selected mobile
    And screenshot the cart page

    Examples: 
      | Mobiles |
      | samsung mobiles |
      | iPhone mobiles |
