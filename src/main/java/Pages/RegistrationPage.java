package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Pages.PageBase {
    By genderField = By.xpath("//input[@id='gender-female']");
    By firstNameField = By.xpath("//input[@name='FirstName']");
    By lastNameField = By.xpath("//input[@name='LastName']");
    By dayDropdown = By.xpath("//select[@name='DateOfBirthDay']");
    By monthDropdown = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearDropdown = By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.xpath("//input[@name='Email']");
    By passwordField = By.xpath("//input[@name='Password']");
    By confPasswordField = By.xpath("//input[@name='ConfirmPassword']");
    By registrationButton = By.id("register-button");

    By loginButton = By.className("ico-login");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnGenderField() { clickOnElement(genderField);}
    public void setFirstNameField() {setElementText(firstNameField,"Tester");}
    public void setLastNameField (){setElementText(lastNameField,"Jessy");}
    public void selectBirthDateDay (){
        Select birthDateDay = new Select(driver.findElement(dayDropdown));
        birthDateDay.selectByValue("29");
    }
    public void selectBirthDateMonth (){
        Select birthDateMonth = new Select(driver.findElement(monthDropdown));
        birthDateMonth.selectByValue("9");
    }
    public void selectBirthDateYear (){
        Select birthDateYear = new Select(driver.findElement(yearDropdown));
        birthDateYear.selectByValue("1997");
    }

    public void setEmailField() {setElementText(emailField,"test@example.com");}

    public void setPasswordField(){setElementText(passwordField,"Test12345");}
    public void setConfPasswordField(){setElementText(confPasswordField,"Test12345");}
    public void clickOnRegistrationButton(){clickOnElement(registrationButton);}

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

}
