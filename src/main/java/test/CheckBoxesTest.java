package test;

import controller.TestUtilities;
import org.openqa.selenium.WebDriver;
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
    public void TestCheckBoxes () throws Exception{

        HomeScreen homeScreen = new HomeScreen(driver);
        CheckBoxesPage checkBoxesPage = new CheckBoxesPage(driver);

        homeScreen.openPage ();
        homeScreen.clickCheckboxes ();
        homeScreen.clickoption2 ();
        homeScreen.clickoption1 ();

    }


}
