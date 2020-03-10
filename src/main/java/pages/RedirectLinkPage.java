package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RedirectLinkPage extends BasePage {



    protected WebDriver driver;
    private String redirectUrl = "http://the-internet.herokuapp.com/redirector";
    private String title = "Redirection";
    private String contentsUnderTitle = "This is separate from directly returning a redirection status code, in that some browsers cannot handle a raw redirect status code without a destination page as part of the HTTP response.\n\nClick here to trigger a redirect (and be taken to the status codes page).";
    private String contentWithLink = "Click here to trigger a redirect (and be taken to the status codes page).";
    private String nextPageTitle = "Status Codes";
    private String nextPageContents = "HTTP status codes are a standard set of numbers used to communicate from a web server to your browser to indicate the outcome of the request being made (e.g. Success, Redirection, Client Error, Server Error). For a complete list of status codes, go here.\n\nSome standard status codes you will run into include but are not limited to:";
    private By redirectlinkLocator = By.linkText("Redirect Link");
    private By titleLocator = By.xpath("//*[@id=\"content\"]/div/h3");
    private By contentsUnderTitleLocator = By.xpath("//*[@id=\"content\"]/div/p");
    private By hereLinkLocator = By.linkText("here");
    private By nextPageTxtLink = By.xpath("//*[@id=\"content\"]/div/p[1]/a");
    private By actualNextPageTitle = By.xpath("//*[@id=\"content\"]/div/h3") ;
    private By nextPagetextLocator = By.xpath("//*[@id=\"content\"]/div/p[1]");

    public void clickRedirectLink() {
        click(redirectlinkLocator);
    }

    public void clickHereLink() {
        click(hereLinkLocator);
    }

    public void clickHereLink1() {
        click(nextPageTxtLink);
    }

    public void verifyTitleText() {
        Assert.assertEquals(find(titleLocator).getText(), title);
    }

    public void verifyFirstParagraph() {
        Assert.assertEquals(find(contentsUnderTitleLocator).getText(), contentsUnderTitle);
    }

    public void verifyNextPageTitle() {
        Assert.assertEquals(find ( actualNextPageTitle ) .getText (), nextPageTitle);
    }

    public void verifyNextPageParagraph() {
        Assert.assertEquals(find(nextPagetextLocator).getText(), nextPageContents);
    }






    public RedirectLinkPage(WebDriver driver) {
        super ( driver );
    }
}
