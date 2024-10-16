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
    Scenario: Mark a to-do item as completed
    Given the user is on the to-do app homepage
    And there is a to-do item with text "<todo_text>"
    When the user marks the to-do item with text "<todo_text>" as completed
    Then the to-do item with text "<todo_text>" should be marked as completed in the to-do list

   @MobileTest
    Scenario: Delete a to-do item
    Given the user is on the to-do app homepage
    And there is a to-do item with text "<todo_text>"
    When the user deletes the to-do item with text "<todo_text>"
    Then the to-do item with text "<todo_text>" should be removed from the to-do list


   @MobileTest
  Scenario: View all to-do items
    Given the user is on the to-do app homepage
    When the user views the to-do list
    Then all existing to-do items should be displayed
  @MobileTest
  Scenario: View completed to-do items
    Given the user is on the to-do app homepage
    When the user views the completed to-do items
    Then only completed to-do items should be displayed
  @MobileTest
  Scenario: View active to-do items
    Given the user is on the to-do app homepage
    When the user views the active to-do items
    Then only active (not completed) to-do items should be displayed
  @MobileTest
  Scenario: Edit a to-do item
    Given the user is on the to-do app homepage
    And there is a to-do item with text "<old_todo_text>"
    When the user edits the to-do item with text "<old_todo_text>" to "<new_todo_text>"
    Then the to-do item with text "<new_todo_text>" should be displayed in the to-do list
    And the to-do item with text "<old_todo_text>" should not be present in the to-do list

  @MobileTest
  Scenario: Clear all completed to-do items
    Given the user is on the to-do app homepage
    When the user clears all completed to-do items
    Then no completed to-do items should be present in the to-do list
  @MobileTest
  Scenario: Set due date for a to-do item
    Given the user is on the to-do app homepage
    And there is a to-do item with text "<todo_text>"
    When the user sets a due date "<due_date>" for the to-do item with text "<todo_text>"
    Then the to-do item with text "<todo_text>" should display the due date "<due_date>"

