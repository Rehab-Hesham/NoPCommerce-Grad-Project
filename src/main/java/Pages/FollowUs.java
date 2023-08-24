package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FollowUs extends PageBase{

    By Facebook = By.xpath("//a[@href='http://www.facebook.com/nopCommerce']");
    By Twitter = By.xpath("//a[@href='https://twitter.com/nopCommerce']");
    By Youtube = By.xpath("//a[@href='http://www.youtube.com/user/nopCommerce']");
    By Rss = By.xpath("//a[@href='/news/rss/1']");



    public FollowUs(WebDriver driver) {
        super(driver);
    }

    public void clickOnFacebook(){clickOnElement(Facebook);}
    public void clickOnTwitter(){clickOnElement(Twitter);}
    public void clickOnYoutube(){clickOnElement(Youtube);}
    public void clickOnRss(){clickOnElement(Rss);}



}