package stepDefinitions;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;


public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;


    public TestSteps(ContextSetup setup){
       this.setup = setup;
       this.testingApp = setup.pageObjectManager.getAdditionPage();
    }



    @Given("the main menu bar is visible.")
    public void theMainMenuBarIsVisible() throws InterruptedException {
        Assert.assertTrue(testingApp.menubar().isDisplayed());
        Thread.sleep(2000);
    }

    @When("click on the menu bar.")
    public void clickOnTheMenuBar() {
        testingApp.menubar().click();
    }

    @Then("the menu page should appear.")
    public void theMenuPageShouldAppear() throws InterruptedException {
        Assert.assertTrue(testingApp.MenuPage().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the  New List")
    public void selectNewList() {
        testingApp.New_list().click();
    }

    @Then("the task field should be shown.")
    public void theTaskFieldShouldBeShown() throws InterruptedException {
        Assert.assertTrue(testingApp.textFild().isDisplayed());
        Thread.sleep(2000);
    }

    @When("input the task name.")
    public void inputTheTaskName() throws InterruptedException {
        testingApp.textFild().sendKeys("Test1");
        Thread.sleep(2000);
    }

    @And("click the create button.")
    public void clickTheCreateButton() {
      testingApp.Create().click();
    }

    @And("there is a to-do item with text {string}")
    public void thereIsAToDoItemWithText(String arg0) {

    }

    @Given("the user is on the to-do app homepage")
    public void theUserIsOnTheToDoAppHomepage() {

    }

    @When("the user marks the to-do item with text {string} as completed")
    public void theUserMarksTheToDoItemWithTextAsCompleted(String arg0) {

    }

    @Then("the to-do item with text {string} should be marked as completed in the to-do list")
    public void theToDoItemWithTextShouldBeMarkedAsCompletedInTheToDoList(String arg0) {

    }

    @Then("the to-do item with text {string} should be removed from the to-do list")
    public void theToDoItemWithTextShouldBeRemovedFromTheToDoList(String arg0) {

    }

    @When("the user deletes the to-do item with text {string}")
    public void theUserDeletesTheToDoItemWithText(String arg0) {

    }

    @When("the user views the to-do list")
    public void theUserViewsTheToDoList() {

    }

    @Then("all existing to-do items should be displayed")
    public void allExistingToDoItemsShouldBeDisplayed() {

    }

    @Then("only completed to-do items should be displayed")
    public void onlyCompletedToDoItemsShouldBeDisplayed() {
        
    }

    @When("the user views the completed to-do items")
    public void theUserViewsTheCompletedToDoItems() {
    }

    @When("the user views the active to-do items")
    public void theUserViewsTheActiveToDoItems() {
    }

    @Then("only active \\(not completed) to-do items should be displayed")
    public void onlyActiveNotCompletedToDoItemsShouldBeDisplayed() {
    }

    @When("the user edits the to-do item with text {string} to {string}")
    public void theUserEditsTheToDoItemWithTextTo(String arg0, String arg1) {
    }

    @Then("the to-do item with text {string} should be displayed in the to-do list")
    public void theToDoItemWithTextShouldBeDisplayedInTheToDoList(String arg0) {
    }

    @And("the to-do item with text {string} should not be present in the to-do list")
    public void theToDoItemWithTextShouldNotBePresentInTheToDoList(String arg0) {
    }

    @When("the user clears all completed to-do items")
    public void theUserClearsAllCompletedToDoItems() {
    }

    @Then("no completed to-do items should be present in the to-do list")
    public void noCompletedToDoItemsShouldBePresentInTheToDoList() {
    }

    @When("the user sets a due date {string} for the to-do item with text {string}")
    public void theUserSetsADueDateForTheToDoItemWithText(String arg0, String arg1) {
    }

    @Then("the to-do item with text {string} should display the due date {string}")
    public void theToDoItemWithTextShouldDisplayTheDueDate(String arg0, String arg1) {
    }
}
