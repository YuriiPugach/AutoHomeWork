package HomeWork4.TestWithParametersAndDataProvider;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;


public class BaseTest {

    static WebDriverWait wait;
    static WebDriver driver;
    @BeforeSuite
    public void precondition() {
        System.setProperty("webdriver.chrome.driver", "F:\\Program\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.setBinary("F:\\Program\\chrome-win64\\chrome.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        }



    @AfterSuite
    public void finishTesting() {
        driver.quit();
    }
}
