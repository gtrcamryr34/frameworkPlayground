package test;

import controller.TestUtilities;
import org.testng.annotations.Test;
import pages.HomeScreen;
import pages.RedirectLinkPage;

public class RedirectLinkTest extends TestUtilities {
    @Test
    public void testRedirectLink() throws Exception{
        System.out.println("Starting RedirectLink Test");
        HomeScreen homeScreen = new HomeScreen(driver);
        RedirectLinkPage redirectLinkPage = new RedirectLinkPage(driver);
        homeScreen.openPage();
        redirectLinkPage.clickRedirectLink();
        redirectLinkPage.verifyTitleText();
        redirectLinkPage.verifyFirstParagraph ();
        redirectLinkPage.clickHereLink();
        redirectLinkPage.verifyNextPageTitle();
        redirectLinkPage.verifyNextPageParagraph ();
        redirectLinkPage.clickHereLink1();
        //System.out.println("still working on this assignment. send your feedback please. thanks");

    }
}
