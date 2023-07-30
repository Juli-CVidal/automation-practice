Feature: Verify navbar functionality

  @Navbar
  Scenario: User clicks Home Title
    Given the user is on the sub page
    When the user clicks on the "HOME LINK"
    Then the user is redirected to "HOME PAGE"

