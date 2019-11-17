package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {

    private String pageUrl = "http://the-internet.herokuapp.com/secure";

    private By successMessage = By.id("flash");
    private By logoutButton = By.xpath("//a[@class='button secondary radius']");


    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public boolean isLogoutButtonAvailable() {
        return find(logoutButton).isDisplayed();
    }

    public String getSuccessMessage(){
        return find(successMessage).getText();
    }

    public String getCurrentUrl() {
      return driver.getCurrentUrl();
    }

    public void clickLogout() {
        click(logoutButton);
    }
}
