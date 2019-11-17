package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void openUrl(String url) {
        driver.get(url);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected void verify(By locator) {
        find(locator).isDisplayed();
    }

    protected void type(String text, By locator) {
        find(locator).sendKeys(text);
    }
}


