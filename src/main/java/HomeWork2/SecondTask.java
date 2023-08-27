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

        Actions actions = new Actions(driver);
        int x;
        int y;
        for (int i = 0; i < 7; i++) {
            Thread.sleep(6000);
            if (i == 3 || i == 6) {
                x = -50;
                y = -50;
            } else {
                x = 50;
                y = 50;
            }
            actions.moveToElement(driver.findElement(By.cssSelector("[r='40']")))
                    .clickAndHold()
                    .moveToElement(driver.findElement(By.cssSelector("[r='8']")), x, y)
                    .release()
                    .build().perform();
        }
        Thread.sleep(6000);
        driver.quit();
    }
}
