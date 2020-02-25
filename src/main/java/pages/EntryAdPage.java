package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EntryAdPage extends BasePage{


    public EntryAdPage(WebDriver driver) {
        super(driver);
    }
    private String loginURL = "http://the-internet.herokuapp.com/entry_ad";
    private String title = "Entry Ad";
    private String expectedEntryAdConfirmationTitle = "Entry Ad";
    private String actualEntryAdConfirmationTitle = driver.getTitle();
    private By actualEntryAdConfirmation = By.xpath("//*[@id=\"content\"]/div[1]/h3");

    private By actualModalBox = By.xpath("//*[@id=\"modal\"]/div[2]");

    private String expectedModalBoxTitle = "This is a modal window";
    private By actualModalBoxTitle = By.xpath("//*[@id=\"modal\"]/div[2]/div[1]");

    private String expectedModalText = "It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).";
    private By actualModalText = By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/p/text()");

    private By modalPopUpBoxClose = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");


    public void verifyEntryAdPageURL() {
          Assert.assertEquals(find(actualEntryAdConfirmation).getText(), expectedEntryAdConfirmationTitle);
       }

    public void verifyEntryAdModalBOx() {
        Assert.assertEquals(find(actualModalBoxTitle).getText(), expectedModalBoxTitle);
}

    public void verifyModalText () {
        Assert.assertEquals(find(actualModalText).getText(), expectedModalText);
    }

}



