package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void openUrl(String url)  {
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

    protected void submit(By locator) {
        find(locator).submit();
    }

    protected void contextRClick(WebElement element) {
        Actions action = new Actions(driver);
        action.contextClick(element).perform();

    }



}


