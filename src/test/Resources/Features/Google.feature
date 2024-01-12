Feature: Google title


Background: 
Given open browser
 

  @T1   
  Scenario: Test the google title
    When open google page
    Then validates title of the page with expected value

 

  @T2
  Scenario: Test the google title
      When open google page
    Then validates title of the page with expected value
 

 