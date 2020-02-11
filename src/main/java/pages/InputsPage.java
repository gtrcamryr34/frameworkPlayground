package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.Driver;

public class InputsPage extends BasePage {


    private static String loginUrl = "http://the-internet.herokuapp.com/inputs";

    private static String title = "Inputs";
    private static String expectedInputConfirmationTitle = "Number";
    //private static String actualInputsConfirmationTitle = driver.getTitle();
    private static By actualInputConfirmation = By.xpath("/html/body/div[2]/div/div/div/div/p");


    private By integerTextBox = By.xpath("By.xpath(\"//*[@id=\\\"content\\\"]/div/div/div/input");

    public InputsPage(WebDriver driver) {

        super(driver);
    }

    public static void verifyInputsURL() {
        Assert.assertEquals(actualInputConfirmation, expectedInputConfirmationTitle);
   }

   public void enterIntegers(String Integers) {

        type(Integers, integerTextBox);
   }


    private String numberInput = "2020";


}
