package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage extends PageBase {

    By SignupNameField = By.name("TesterJessy");

    By SignupEmailField = By.xpath("//input[@id='Email']");
    By SignupButton = By.xpath("//button[@id='register-button']");

    public SignupLoginPage(WebDriver driver) {super(driver); }

    public void  setSignupName(){
        setElementText(SignupNameField , "TesterJessy");
    }
    public void setSignupEmail () {
        setElementText(SignupEmailField, "test@example.com");
    }
    public void clickOnSignupButton(){
        clickOnElement(SignupButton);
    }
}
