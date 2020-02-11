package test;

import controller.TestUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.InputsPage;

import java.sql.Driver;

public class InputsPageTest extends TestUtilities {


    @Test

    public void inputsTest() throws Exception {
        HomeScreen homeScreen = new HomeScreen(driver);
        InputsPage inputsPage = new InputsPage(driver);


        homeScreen.openPage();
        homeScreen.clickInputs();

         inputsPage.verifyInputsURL();

        inputsPage.enterIntegers("2020");
        inputsPage.verifyEnteredInteger();

       //WebElement integers = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
       //integers.sendKeys("2020");

    }

   @AfterTest
    public void closeInputBrowser() {
       driver.manage().deleteAllCookies();
       driver.close();
    }

}

