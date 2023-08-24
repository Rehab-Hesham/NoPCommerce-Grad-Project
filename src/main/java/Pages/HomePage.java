package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{

    By registrationButton = By.xpath("//a[@href='register?returnUrl=%2F']");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegistrationButton(){
        clickOnElement(registrationButton);
    }
}
