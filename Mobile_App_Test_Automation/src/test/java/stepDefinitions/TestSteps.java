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
}
