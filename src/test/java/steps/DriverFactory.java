package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory(){

        //System.setProperty("webdriver.gecko.driver", "C:\\webDriver\\geckodriver.exe");
        //driver = new FirefoxDriver();
    }

    public String getProjectPath() {
        String projectLocation = System.getProperty("user.dir");
        return projectLocation;
    }
}
