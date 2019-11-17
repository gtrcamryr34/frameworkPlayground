package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    private String browser;

    public BrowserFactory(String browser) {
        this.browser = browser.toLowerCase();
    }

    public WebDriver createDriver() {
        //Create Driver
        System.out.println("Create driver: " + browser);

        if ("chrome".equals(browser)) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            driver.set(new ChromeDriver());
        } else if ("firefox".equals(browser)) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            driver.set(new FirefoxDriver());
        } else {
            System.out.println("Do not know how to start: " + browser + ", starting chrome.");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            driver.set(new ChromeDriver());
        }
        return driver.get();
    }
}
