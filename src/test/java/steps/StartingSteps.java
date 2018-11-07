package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartingSteps extends DriverFactory {

    @Before
    public void presetup(){
        String projectLocation = getProjectPath();
        System.setProperty("webdriver.gecko.driver", projectLocation+"\\src\\lib\\geckodriver\\geckodriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\webDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        System.out.println("aksdnkas");
    }

    @Given("^I am new user$")
    public void setup() throws Throwable {
        driver.get("http://newtours.demoaut.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("REGISTER")).click();
        //driver.findElement(By.name("firstName")).sendKeys("NOMBRE");
    }
}
