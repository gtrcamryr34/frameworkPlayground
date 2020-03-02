package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BasePage{
    protected WebDriver driver;
    private String InputUrl = "http://the-internet.herokuapp.com/inputs";
    private String VerifyTitle ="Inputs";


    private By inputPageTitle = By.xpath("//*[@id=\"content\"]/div/div/h3");
    private By inputBox = By.xpath("//*[@id=\"content\"]/div/div/div/input");

    public void putTypeIntiger(String num) {
        type ( num, inputBox  );
    }


    public Input(WebDriver driver) {
        super ( driver );
    }
}
