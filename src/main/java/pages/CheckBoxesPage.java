package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckBoxesPage extends BasePage {

    protected WebDriver driver;
    private String checkBoxpageUrl = "http://the-internet.herokuapp.com/checkboxes";
    private String verifyTitle = "Checkboxes";
    private String verifyFooter = "Powered by Elemental Selenium";
    private String footerUrl = "http://elementalselenium.com/";

    private By checkBoxesPageTitle = By.xpath("//*[@id=\"content\"]/div/h3");
    private By checkBoxlocator = By.linkText ("Checkboxes");
    private By checkBoxoption1 = By.xpath ("//*[@id=\"checkboxes\"]/input[1]");
    private By checkBoxoption2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");
    private By footerText = By.xpath("//*[@id=\"page-footer\"]/div/div");
    private By footerLink = By.xpath("//*[@id=\"page-footer\"]/div/div/a");

    public void clickCheckboxes() {click(checkBoxlocator);}

    public void clickoption1() {click (checkBoxoption1);}

    public void clickoption2() {click ( checkBoxoption2 );}

    public void clickFooterLink() {click (footerLink);}



    public void verifyTitleText() {
        Assert.assertEquals(find(checkBoxesPageTitle).getText(), verifyTitle);}

        public CheckBoxesPage(WebDriver driver) { super ( driver ); }

    public String CheckBoxpageUrl (){return checkBoxpageUrl;}

    public void verifyFooterText() {
        Assert.assertEquals(find(footerText).getText (), verifyFooter );
    }

    public String verifyFooterUrl (){return footerUrl;}

    public String verifyChkBxTitle () {
        verify ( checkBoxesPageTitle );
        return null;

        }
    }