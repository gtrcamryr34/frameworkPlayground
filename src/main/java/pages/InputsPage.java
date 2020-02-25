package pages;

import controller.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InputsPage extends BasePage {


    private static String loginUrl = "http://the-internet.herokuapp.com/inputs";
    private String title = "Inputs";
    private String expectedInputHeader = "Number";
    //private static String actualInputsConfirmationTitle = driver.getTitle();
    private By actualInputHeader = By.xpath("/html/body/div[2]/div/div/div/div/p");

    private By integerTextBox = By.xpath("//*[@id=\"content\"]/div/div/div/input");

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void verifyInputsHeader() {
        Assert.assertEquals(find(actualInputHeader).getText(), expectedInputHeader);
   }

   public void enterIntegers(String Integers) {
        type(Integers, integerTextBox);
   }

    private String numberInput = "2020";
    //This "numberInput" is in TestData; hence it is not used from here

    public void verifyEnteredInteger() {
        Assert.assertEquals(find(integerTextBox).getAttribute("value"), TestData.Integers);
    }

}
