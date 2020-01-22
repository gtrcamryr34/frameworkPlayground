package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.Driver;

public class InputsPage extends BasePage {


    private static String loginUrl = "http://the-internet.herokuapp.com/inputs";

    private String title = "Inputs";
    private String expectedInputConfirmationTitle = "Inputs";
    private String actualInputsConfirmationTitle = driver.getTitle();
    private By actualInputConfirmation = By.xpath("//*[@id=\"content\"]/div/div/h3");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyInputsURL() {
        Assert.assertEquals(driver.getCurrentUrl(), loginUrl);
    }


    private String numberInput = "2020";



}
