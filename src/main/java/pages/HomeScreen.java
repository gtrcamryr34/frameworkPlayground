package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BasePage {

    protected WebDriver driver;
    private String pageUrl = "http://the-internet.herokuapp.com";

    private By formAuthLinkLocator = By.linkText("Form Authentication");
    private By forgotPasswordLocator = By.linkText("Forgot Password");
    private By inputsPageLocator = By.linkText("Inputs");
    private By entryAdPageLocator = By.linkText("Entry Ad");
    private By entryAdModalBoxCloseLocator = By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p");

    public HomeScreen(WebDriver driver) {
        super(driver);
    }
    public void openPage() throws Exception {
        openUrl(pageUrl);
    }

    public void clickFormAuth() {
       click(formAuthLinkLocator);
    }

    public void clickForgotPassword() {
        click(forgotPasswordLocator);
    }

    public void clickInputs() { click(inputsPageLocator);}

    public void clickEntryAd() { click(entryAdPageLocator);}

    public void clickModalBoxClose() {click(entryAdModalBoxCloseLocator);}

}
