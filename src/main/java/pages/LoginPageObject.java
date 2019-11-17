package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {

    private String loginUrl = "http://the-internet.herokuapp.com/login";
    private String title = "Login Page";
    //Objects
    private By loginPageTitle = By.xpath("//*[@id=\"content\"]/div/h2");
    private By userNameElement = By.name("username");
    private By passwordElement = By.name("password");
    private By loginButton = By.tagName("button");
    private By loggedOutMessage = By.id("flash");


    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    public String loginPageURL() {
        return loginUrl;
    }

    public String verifyLoginTitle() {
        verify(loginPageTitle);
        return null;
    }

    public void Login(String username, String password) {
        type(username, userNameElement);
        type(password, passwordElement);
        click(loginButton);
    }

    public String verifyLogoutMessage() {
       return find(loggedOutMessage).getText();
    }
}
