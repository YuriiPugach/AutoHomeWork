package HomeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondTask {
    public static void compareLocationOfElements(WebElement element1, WebElement element2) {
        int locationX1 = element1.getLocation().x;
        int locationX2 = element2.getLocation().x;
        if (locationX1 < locationX2) {
            System.out.println("Первый элемент находится левее второго");
        } else {
            System.out.println("Второй элемент находится левее первого");
        }

        int locationY1 = element1.getLocation().y;
        int locationY2 = element2.getLocation().y;
        if (locationY1 < locationY2) {
            System.out.println("Первый элемент находится выше второго");
        } else {
            System.out.println("Второй элемент находится выше первого");
        }

        int size1 = element1.getSize().height * element1.getSize().width;
        int size2 = element2.getSize().height * element2.getSize().width;
        if (size1 < size2) {
            System.out.println("Первый элемент занимает меньшую площадь чем второй");
        } else {
            System.out.println("Второй элемент занимает меньшую площадь чем первый");
        }
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
        compareLocationOfElements(element1, element2);
        driver.quit();

    }

}
