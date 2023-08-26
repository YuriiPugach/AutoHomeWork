package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FourthTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Program\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("F:\\Program\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://uhomki.com.ua/ru");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Хорек");
        WebElement element = driver.findElement(By.name("q"));
        Thread.sleep(1000);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(@title, 'Витамины')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("comparison-button__icon")).click();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("Медведь");
        WebElement element2 = driver.findElement(By.name("q"));
        Thread.sleep(1000);
        element2.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(@title, 'Белый')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("comparison-button__icon")).click();
        driver.findElement(By.className("comparison-view")).click();
        driver.quit();
    }
}
