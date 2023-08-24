package Steps;

import Pages.LoginPage;
import TestBase.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class T2_LoginTest extends TestBase {

    LoginPage loginPageObject = new LoginPage (driver);



    @Given("user is on login page")
    public void userIsOnLoginPage() {
        Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Login");
    }

    @When("user login using valid email")
    public void user_login_using_valid_email() {
        loginPageObject.setEmailField();
    }
    @Then("user login using valid password")
    public void user_login_using_valid_password() {
        loginPageObject.setPasswordField();
    }
    @Then("user press on login button")
    public void user_press_on_login_button() {
        loginPageObject.clickOnLogin();
    }
    @Then("user loggedin successfully")
    public void user_loggedin_successfully() {
        Assert.assertEquals(driver.getTitle(),"nopCommerce demo store");
    }

    @And("user logout to homepage")
    public void userLogoutToHomepage() {
        loginPageObject.clickOnLogOut();
    }

    @Then("user went back to login page")
    public void user_went_back_to_login_page() {
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @Then("user login using invalid email")
    public void user_login_using_invalid_email() {
        loginPageObject.setWrongEmail();
    }

    @Then("user login using invalid password")
    public void user_login_using_invalid_password() {
        loginPageObject.setWrongPassword();
    }

    @Then("user press on login button with invalid data")
    public void user_press_on_login_button_with_invalid_data() {
        loginPageObject.clickOnLogin();
    }

    @Then("user login is unsuccessful")
    public void user_login_is_unsuccessful() {
        Assert.assertTrue(loginPageObject.invalidCredentialMessage().contains("Error occurred while login. Please enter valid information and try again"));

    }


}