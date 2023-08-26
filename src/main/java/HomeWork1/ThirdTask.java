package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ThirdTask {
    public static void getInfoAboutElement(WebElement element){
        System.out.println(element.getAttribute("id"));
        System.out.println(element.getTagName());
        System.out.println(element.getAttribute("class"));
        System.out.println(element.getAttribute("name"));
        System.out.println(element.getText());
        int xOfSearchButtonCentre = element.getLocation().x + element.getSize().width/2;
        int yOfSearchButtonCentre = element.getLocation().y + element.getSize().height/2;
        System.out.println("Координаты центра " + xOfSearchButtonCentre+", "+ yOfSearchButtonCentre);
        System.out.println("======================================");
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\Program\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("F:\\Program\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://shop.brave.ua/uk/");
        WebElement element1 = driver.findElement(By.xpath("//a/div/ul/li[7]"));
        WebElement element2 = driver.findElement(By.xpath("//a[text() = 'Для дому']"));
        getInfoAboutElement(element1);
        getInfoAboutElement(element2);
        driver.quit();
    }
}
