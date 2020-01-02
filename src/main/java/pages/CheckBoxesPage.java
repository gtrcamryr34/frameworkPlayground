package pages;

import org.openqa.selenium.WebDriver;

public class CheckBoxes extends BasePage {
    public CheckBoxes(WebDriver driver) {
        super ( driver );
    }

    private String loginURL = "http://the-internet.herokuapp.com/checkboxes";
}
