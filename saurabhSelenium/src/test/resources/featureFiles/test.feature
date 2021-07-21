Feature: Login Action
  @test1
  Scenario: Successful login with Valid credentials
    Given User is on home page
    When User selects the Departure and Destination cities
    And chooses the third flight
    And Enters all the user information
    Then User is displayed with confirmation page




