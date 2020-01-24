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

        //  InputsPage.verifyInputsURL();

        inputsPage.enterInteger("2020");
        inputsPage.verifyInputsURL();
        inputsPage.verifyEnteredInteger();









        ///SIDE NOTE: I have tried to make integers a method in InputPage; however it was not allowing me;
        // Hence I had to code the "integers" in the testing region.  I guess I am doing something with the framework.

    }

    @AfterTest
    public void closeInputBrowser() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

