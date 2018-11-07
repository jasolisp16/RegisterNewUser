package steps;

import cucumber.api.java.en.When;
import pages.SignupPage;

public class SingupPageSteps extends DriverFactory {

    @When("^I register my data correctly")
    public void register_my_data_correctly() throws Throwable {
        new SignupPage(driver).chooses_to_sign_up();
    }
}
