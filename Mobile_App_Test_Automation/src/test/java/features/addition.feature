Feature: Testing ToDodo
  @MobileTest
  Scenario: Create a New Task
    Given the main menu bar is visible.
     When  click on the menu bar.
     Then the menu page should appear.
     When  Click on the  New List
     Then the task field should be shown.
     When  input the task name.
     And click the create button.

  @MobileTest

