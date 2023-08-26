package HomeWork1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.Set;

public class FirstTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Program\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("F:\\Program\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();


        String[] siteList = {"https://uhomki.com.ua/ru/koshki/1074/", "https://zoo.kiev.ua/",
                "https://www.w3schools.com/", "https://taxi838.ua/ru/dnepr/", "https://klopotenko.com/"};
        System.out.println(Arrays.toString(siteList));
        driver.get(siteList[0]);

        for (int i = 0; i < siteList.length; i++) {

            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            Set<String> windowHandles1 = driver.getWindowHandles();
            if (i + 1 == siteList.length) {
                break;
            }
            ((JavascriptExecutor) driver).executeScript("window.open()");

            System.out.println(driver.getWindowHandles());
            Set<String> windowHandles2 = driver.getWindowHandles();
            windowHandles2.removeAll(windowHandles1);
            String newDescriptor2 = windowHandles2.iterator().next();


            System.out.println("==================");
            if (driver.getTitle().contains("зоопарк")) {
                driver.close();
            }
            driver.switchTo().window(newDescriptor2);

            driver.get(siteList[i + 1]);


        }
        driver.quit();

    }
}
