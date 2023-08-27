package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FirstTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Program\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("F:\\Program\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");

        WebElement carList = driver.findElement(By.id("Carlist"));
        Select carsMark = new Select(carList);
        carsMark.selectByVisibleText("Renault");

        Select countryList = new Select(driver.findElement(By.name("FromLB")));
        countryList.selectByVisibleText("France");
        countryList.selectByVisibleText("India");
//        Thread.sleep(1000);
        countryList.deselectByVisibleText("India");
//        Thread.sleep(1000);
        countryList.selectByVisibleText("Germany");
//        Thread.sleep(1000);
        countryList.selectByVisibleText("Italy");
//        Thread.sleep(1000);
        countryList.selectByVisibleText("Malaysia");
//        Thread.sleep(1000);
        countryList.deselectByVisibleText("Malaysia");
//        Thread.sleep(1000);
        countryList.selectByVisibleText("Spain");
        driver.findElement(By.xpath("//td[2]/input[1]")).click();
        System.out.print("Автомобили доступные для выбора:  ");
        List<WebElement> carsMarkOptionsList = carsMark.getOptions();
        for(WebElement carsInList: carsMarkOptionsList){
            System.out.print(carsInList.getText()+ " ");
        }
        System.out.println("");
        System.out.print("Страны из первой таблицы:  ");
        List<WebElement> countryListOptions = countryList.getOptions();
        for(WebElement countryList2: countryListOptions){
            System.out.print(countryList2.getText()+ " ");
        }
        System.out.println("");
        System.out.print("Страны из второй таблицы: ");
        Select countryToList = new Select(driver.findElement(By.name("ToLB")));
        List<WebElement> countryToListOptions = countryToList.getOptions();
        for(WebElement countryToList2: countryToListOptions){
            System.out.print(countryToList2.getText()+ " ");
        }
        driver.quit();


    }
}
