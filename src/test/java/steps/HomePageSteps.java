package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

public class HomePageSteps extends DriverFactory {

    @Then("^I should get a welcome message$")
    public void submit_sing_in() throws Throwable {
        Assert.assertTrue(new HomePage(driver).isSignOutLinkDisplayed());
    }
}
