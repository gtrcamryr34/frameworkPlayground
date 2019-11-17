import controller.TestData;
import controller.TestUtilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.LoginPageObject;
import pages.SecureAreaPage;

public class LoginTest extends TestUtilities {

    @Test
    public void Logintest() {
        System.out.println("Starting Login Test");
        //Open Main Page
        HomeScreen homeScreen = new HomeScreen(driver);
        LoginPageObject loginPageObject = new LoginPageObject(driver);
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);


        homeScreen.openPage();
        homeScreen.clickFormAuth();

        Assert.assertEquals(driver.getCurrentUrl(), loginPageObject.loginPageURL());
        loginPageObject.verifyLoginTitle();
        loginPageObject.Login(TestData.USERNAME, TestData.PASSWORD);

        Assert.assertEquals(secureAreaPage.getCurrentUrl(), secureAreaPage.getPageUrl());
    }

    @AfterTest
    public void LogoutTest() {
        String logOutText = "You logged out of the secure area!\n" +
                "×";
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);
        LoginPageObject loginPageObject = new LoginPageObject(driver);

        secureAreaPage.isLogoutButtonAvailable();
        secureAreaPage.clickLogout();

        Assert.assertEquals(loginPageObject.verifyLogoutMessage(), logOutText);
    }
}

