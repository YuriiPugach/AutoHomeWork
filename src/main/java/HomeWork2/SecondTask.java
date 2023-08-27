package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SecondTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Program\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("F:\\Program\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://www.ashortjourney.com/");
        Thread.sleep(10000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//html/body/svg/text/tspan[1]")))
                .clickAndHold()
                .moveToElement(driver.findElement(By.cssSelector("//html/body/svg/circle[1]")))
                .release()
                .build().perform();
    }
}
