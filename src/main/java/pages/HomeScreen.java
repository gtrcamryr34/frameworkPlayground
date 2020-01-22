package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BasePage {

    protected WebDriver driver;
    private String pageUrl = "http://the-internet.herokuapp.com";

    private By formAuthlinkLocator = By.linkText("Form Authentication");
    private By forgotPasswordLocator = By.linkText("Forgot Password");
    private By inputs = By.linkText("Inputs");

    public HomeScreen(WebDriver driver) {
        super(driver);
    }
    public void openPage() throws Exception {
        openUrl(pageUrl);
    }

    public void clickFormAuth() {
       click(formAuthlinkLocator);
    }

    public void clickForgotPassword() {
        click(forgotPasswordLocator);
    }

    public void clickInputs() { click(inputs);}

}
