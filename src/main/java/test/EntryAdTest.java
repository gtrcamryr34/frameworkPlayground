package test;


import controller.TestUtilities;
import org.testng.annotations.Test;
import pages.EntryAdPage;
import pages.HomeScreen;

public class EntryAdTest extends TestUtilities {

    @Test

    public void EntryAdTest() throws Exception {
        HomeScreen homeScreen = new HomeScreen(driver);
        EntryAdPage entryAdPage = new EntryAdPage(driver);

        homeScreen.openPage();
        homeScreen.clickEntryAd();
        entryAdPage.verifyEntryAdPageURL();

        //entryAdPage.verifyEntryAdModalBOx();

        //entryAdPage.verifyModalText();


        //homeScreen.clickModalBoxClose();



    }

}

