package Steps;

import Pages.Currencies;
import TestBase.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class T3_CurrenciesTest extends TestBase {
    Currencies currenciesObject = new Currencies(driver);



    @Given("user is on home page")
    public void user_is_on_home_page() {
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @When("user clicks on Pound currency")
    public void user_clicks_on_Pound_currency() {
        currenciesObject.selectPoundCurrency();

    }
    @Then("Pound symbol is shown on products")
    public void Pound_symbol_is_shown_on_products() {
        String text = driver.findElements(By.xpath("//span[@class='price actual-price']")).get(0).getText();
        Assert.assertTrue(text.contains("£"));
        String text1 = driver.findElements(By.xpath("//span[@class='price actual-price']")).get(1).getText();
        Assert.assertTrue(text1.contains("£"));
        String text2 = driver.findElements(By.xpath("//span[@class='price actual-price']")).get(2).getText();
        Assert.assertTrue(text2.contains("£"));
        String text3 = driver.findElements(By.xpath("//span[@class='price actual-price']")).get(3).getText();
        Assert.assertTrue(text3.contains("£"));
    }
}
