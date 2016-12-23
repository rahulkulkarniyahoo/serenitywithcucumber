Feature: Searching by keyword



  @Test
  Scenario: Serenity And Cucumber Combined Trial
    Given User opens Google website
    When User enters value "HelloWorld"
    Then User can see "HelloWorld" on the page


    @Mail
    Scenario: Access UAT website and login
      Given User opens dailymailplus website
      When user enters userid and password
      Then user can log in

  @Mail123
  Scenario: Access Salesforce Website
    Given User opens dailymailplus website
    When user enters userid and password
    Then user can log in
