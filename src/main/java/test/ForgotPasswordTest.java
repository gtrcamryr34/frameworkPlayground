package test;

import controller.TestData;
import controller.TestUtilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomeScreen;

public class ForgotPasswordTest extends TestUtilities {

    @Test
    public void testForgotPassword() throws Exception {

        HomeScreen homeScreen = new HomeScreen(driver);
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);

        /* Open homepage and then open Forgot Password Page */
        homeScreen.openPage();
        homeScreen.clickForgotPassword();

        forgotPasswordPage.verifyURL();

        forgotPasswordPage.enterEmailAddress(TestData.EMAIL);
        forgotPasswordPage.submitEmailAddress();

        forgotPasswordPage.verifyConfirmationText();
    }

    @AfterTest
    public void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
