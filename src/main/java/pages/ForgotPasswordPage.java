package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.net.URL;

public class ForgotPasswordPage extends BasePage {

    private String loginUrl = "http://the-internet.herokuapp.com/forgot_password";
    private String title = "Forgot Password";
    private String expectedConfirmationTitle = "Your e-mail's been sent!";

    private By emailTextEdit = By.name("email");
    private By actualConfirmationTitle = By.xpath("//*[@id=\"content\"]");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void verifyURL() {
        Assert.assertEquals(driver.getCurrentUrl(), loginUrl);
    }

    public void enterEmailAddress(String email) {
        type(email, emailTextEdit);
    }

    public void submitEmailAddress() {
        submit(emailTextEdit);
    }

    public void verifyConfirmationText() {
        Assert.assertEquals(find(actualConfirmationTitle).getText(), expectedConfirmationTitle);
    }
}
