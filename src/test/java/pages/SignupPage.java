package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.SecureRandom;

public class SignupPage {

    WebDriver driver;

    @FindBy(name = "firstName")
    private WebElement firstNameTextBox;

    @FindBy(name = "lastName")
    private WebElement lastNameTextBox;

    @FindBy(name = "phone")
    private WebElement phoneTextBox;

    @FindBy(name = "userName")
    private WebElement emailTextBox;

    @FindBy(name = "email")
    private WebElement userNameTextBox;

    @FindBy(name = "password")
    private WebElement passwordTextBox;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordTextBox;

    @FindBy(name = "register")
    private WebElement singUpButton;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void chooses_to_sign_up() throws Throwable {
        //this.driver.findElement(By.linkText("REGISTER")).click();
        firstNameTextBox.sendKeys("Adrian");
        lastNameTextBox.sendKeys("Solis");
        phoneTextBox.sendKeys("9999999999");
        emailTextBox.sendKeys("test_email@somedomain.com");
        userNameTextBox.sendKeys("adrian.solis7");
        passwordTextBox.sendKeys("12345678910");
        confirmPasswordTextBox.sendKeys("12345678910");
        submit_format();
    }

    public void submit_format() throws Throwable {
        singUpButton.click();
    }

    public String createRandomUserName(){
        char[] ch = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] c = new char[7];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 7; i++) {
            c[i] = ch[random.nextInt(ch.length)];
        }

        return new String(c);
    }
}
