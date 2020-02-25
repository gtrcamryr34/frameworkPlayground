package test;

import controller.TestUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.InputsPage;

public class InputsPageTest extends TestUtilities {


    @Test

    public void inputsTest() throws Exception {
        HomeScreen homeScreen = new HomeScreen(driver);
        InputsPage inputsPage = new InputsPage(driver);

        homeScreen.openPage();
        homeScreen.clickInputs();

        inputsPage.verifyInputsHeader();

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

