@Mobile
Feature: Validate the mobile page module

  Background: 
    Given Login to application

  Scenario: Checkout the iphone16 from mobile module
    When Select the Mobile Module
    And Select the mobile "Iphone 16"
    And Click the add to cart button
    And Checkout the product
    Then Validate the paymant gateway page

  Scenario: Checkout the samsung s25 from mobile module
    When Select the Mobile Module
    When Select the mobile "Samsung s25"
    And Click the add to cart button
    And Checkout the product
    Then Validate the paymant gateway page
    
    
    
