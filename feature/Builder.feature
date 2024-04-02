Feature: Dealer Management on 99Acres Website

  @tag
  Scenario Outline: post property 
    Given User on 99Acres Home Page
    When User click on the Dealers button
    And user click on the post property button
    And User add the basic details <phn_no>
    Then the property status should be updated successfully
    Examples:
    |phn_no    |
    |"9392679793"|
    |"9542447478"|
   
  Scenario: Dealer services
    Given User on 99Acres Home Page
    And User click on the Dealer services
    And User click Builder plans button
    And User click on the add your property details 
    And User click on the commercial
    And User click on the view plans
    Then Related plans will be visible
    
     
  Scenario: My99acres
    Given User on 99Acres Home Page
    When User click on Dealers
    And User click on Research 
    And User go to Customer services
    And User enter "Rental Agreement" in search by keywords box
    Then You can find queries on rental agreement below
  
  Scenario: Call me back
    Given User on 99Acres Home Page
    When User click on Dealer
    And User click on the Research 
    And User go to Customer service
    And User click on call me back
    Then User can give details
    
   Scenario: Homeloans 
     Given User on 99Acres Home Page 
     When User click on the Dealers
     And User click on the Advice
     And User click on the Customer
     And User click on Homeloans 
     And User click on Banks 
     And User click on the getmethisdeal
     Then User needs to submit details 
   
   
