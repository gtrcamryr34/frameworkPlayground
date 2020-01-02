package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeScreen extends BasePage {

    protected WebDriver driver;
    private String pageUrl = "http://the-internet.herokuapp.com";

    private By formAuthlinkLocator = By.linkText("Form Authentication");
    private By forgotPasswordLocator = By.linkText("Forgot Password");
    private By checkBoxlocator = By.linkText ("Checkboxes");
    private By checkBoxoption1 = By.xpath ("//*[@id=\"checkboxes\"]/input[1]");
    private By checkBoxoption2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");

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

    public void clickCheckboxes() {click(checkBoxlocator);}

    public void clickoption1() {click (checkBoxoption1);}

    public void clickoption2() {click ( checkBoxoption2 );}
}
