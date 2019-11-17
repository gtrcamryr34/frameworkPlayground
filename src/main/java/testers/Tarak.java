package testers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tarak {

    @BeforeTest
    public void SetupChrome () {
        ChromeOptions co = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\meaht\\Documents\\Project\\funtesters\\src\\main\\resources\\chromedriver.exe");

    }
    @Test
    public void OpenChrome() {
        ChromeDriver driver = new ChromeDriver();
        String google = "https://facebook.com";

        driver.get(google);

        String title = driver.getTitle();

        String url = driver.getCurrentUrl();

        // found elements through locator for facebook
        //located the email box and password box on  findElement in the next four lines


       WebElement email = driver.findElement(By.name("email"));
       WebElement pass = driver.findElement(By.name("pass"));

       email.sendKeys("email@gmail.com");
       email.sendKeys("thisismypassword");



        System.out.println("My First Automation is going to " + title + " and the link for it is " + url);

        driver.close();





    }
}
