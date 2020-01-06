package test;

import controller.TestUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;
import pages.HomeScreen;

public class CheckBoxesTest extends TestUtilities {

//test case 1:
    //step 1 open homepage
    //step 2 click checkboxes
    //step 3 unmarked the second check box
    //step 3 mark the first check box

    @Test
    public void TestCheckBoxes() throws Exception {
        System.out.println("Welcome Just not a checkbox testing...");

        HomeScreen homeScreen = new HomeScreen ( driver );
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage ( driver );
        homeScreen.openPage ( );
        checkBoxesPage.clickCheckboxes ( );
        checkBoxesPage.CheckBoxpageUrl ( );
        checkBoxesPage.verifyChkBxTitle ( );
        Assert.assertEquals ( driver.getCurrentUrl ( ) , checkBoxesPage.CheckBoxpageUrl ( ) );
        checkBoxesPage.clickoption2 ( );
        checkBoxesPage.clickoption1 ( );
        checkBoxesPage.verifyFooterText ( );
        checkBoxesPage.clickFooterLink ( );

    }

    @AfterTest
    public void closeBrowser() {
        driver.manage ( ).deleteAllCookies ( );
        //driver.close ( );
        driver.quit();
        System.out.println("Test Is Complete Thanks");
    }

}