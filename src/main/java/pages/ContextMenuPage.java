package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ContextMenuPage extends BasePage {
    private String pageUrl = "http://the-internet.herokuapp.com/context_menu";
    private String title = "Context Menu";
    private String expectedFirstPara = "Context menu items are custom additions that appear in the right-click menu.";
    private String expectedSecondPara = "Right-click in the box below to see one called 'the-internet'. When you click it, it will trigger a JavaScript alert.";

    private By titleLocator = By.xpath ("//*[@id=\"content\"]/div/h3" );
    private By firstParaLocator = By.xpath("//*[@id=\"content\"]/div/p[1]");
    private By secondParaLocator = By.xpath ( "//*[@id=\"content\"]/div/p[2]" );
    private By contextRightClick = By.xpath ( "//*[@id=\"hot-spot\"]" );
    public ContextMenuPage(WebDriver driver) {
        super ( driver );
    }
    public void verifyPageUrl() {
        Assert.assertEquals(driver.getCurrentUrl (), pageUrl);
    }


    public void verifyFirstPara(){
        Assert.assertEquals(find ( firstParaLocator ).getText (),expectedFirstPara);
    }

    public void verifySecondPara(){
        Assert.assertEquals(find ( secondParaLocator ).getText (),expectedSecondPara);

    }

    public void setContextRightClick(){
        action.contextClick ( (WebElement) contextRightClick ).perform ();
    }

}
