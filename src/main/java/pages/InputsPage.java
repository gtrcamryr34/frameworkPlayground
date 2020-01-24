package pages;

import controller.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Driver;

public class InputsPage extends BasePage {


    private static String loginUrl = "http://the-internet.herokuapp.com/inputs";

    private String title = "Inputs";
    private String expectedInputConfirmationTitle = "Inputs";
    private String actualInputsConfirmationTitle = driver.getTitle();
    private By actualInputConfirmation = By.xpath("//*[@id=\"content\"]/div/div/h3");
    private By  integers = By.xpath("//*[@id=\"content\"]/div/div/div/input");


    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyInputsURL() {
        Assert.assertEquals(driver.getCurrentUrl(), loginUrl);
    }

    public void enterInteger(String num) {
        type(num, integers);
    }

    public void verifyEnteredInteger() {
        Assert.assertEquals(find(integers).getAttribute("value"), TestData.INPUT);
    }

}
