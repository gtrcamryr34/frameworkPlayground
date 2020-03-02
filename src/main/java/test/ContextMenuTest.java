package test;

import controller.TestUtilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ContextMenuPage;
import pages.HomeScreen;

public class ContextMenuTest extends TestUtilities {
    @Test
    public void testContextMenu() throws Exception {

        HomeScreen homeScreen = new HomeScreen (driver);
        ContextMenuPage contextMenuPage = new ContextMenuPage (driver);
        homeScreen.openPage ();
        homeScreen.clickContextMenu ();
        contextMenuPage.verifyPageUrl ();
        contextMenuPage.verifyFirstPara ();
        contextMenuPage.verifySecondPara ();
        contextMenuPage.setContextRightClick ();




    }


    }

