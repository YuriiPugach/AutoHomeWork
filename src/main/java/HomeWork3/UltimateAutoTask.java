package HomeWork3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class UltimateAutoTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F:\\Program\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("F:\\Program\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);


        driver.get("https://www.google.com/search");
        Set<String> windowHandles1 = driver.getWindowHandles();
//        System.out.println(windowHandles1);

        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"))
                .sendKeys("https://www.guinnessworldrecords.com/account/register?");
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        actions.keyDown(Keys.CONTROL)
                .click(driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/a")))
                .keyUp(Keys.CONTROL)
                .build().perform();

        Set<String> windowHandles2 = driver.getWindowHandles();
        windowHandles2.removeAll(windowHandles1);
        String newDescriptor2 = windowHandles2.iterator().next();
//        System.out.println(newDescriptor2);

        Set<String> windowHandles3 = driver.getWindowHandles();

        //кнопка стереть тут
        Thread.sleep(500);
        driver.findElement(By.xpath("//div[@class=\"M2vV3 vOY7J\"]")).click();

        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"))
                .sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

        actions.keyDown(Keys.CONTROL)
                .click(driver.findElement(By.xpath("//div[@class=\"TbwUpd NJjxre iUh30 ojE3Fb\"]")))
                .keyUp(Keys.CONTROL)
                .build().perform();

        Thread.sleep(500);

        Set<String> windowHandles4 = driver.getWindowHandles();
        windowHandles4.removeAll(windowHandles3);
        String newDescriptor3 = windowHandles4.iterator().next();
//        System.out.println(newDescriptor3);

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        driver.switchTo().frame("iframeResult");
        Thread.sleep(500);
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"fname\"]"))).sendKeys("Yurii").build().perform();
        Thread.sleep(500);
        actions.doubleClick(driver.findElement(By.xpath("//*[@id=\"lname\"]"))).sendKeys("Pugach").build().perform();
        driver.findElement(By.xpath("//input[3]")).click();
        Thread.sleep(1000);

        //div[2]/p/text()[1]
        System.out.println(driver.findElement(By.xpath("/html/body/div[2]")).getText());
        driver.switchTo().window(newDescriptor2);

        driver.findElement(By.id("LastName")).sendKeys("Yurii");
        driver.findElement(By.id("FirstName")).sendKeys("Puhach");

        driver.findElement(By.cssSelector(".input-mini.dob-day")).sendKeys("14");
        driver.findElement(By.cssSelector(".input-mini.dob-month")).sendKeys("03");
        driver.findElement(By.cssSelector(".input-mini.dob-year")).sendKeys("1991");

        Select country = new Select(driver.findElement(By.id("Country")));
        country.selectByVisibleText("Ukraine");
        Thread.sleep(4000);


        actions.click(driver.findElement(By.id("State"))).sendKeys("Sumy").build().perform();
        actions.click(driver.findElement(By.id("EmailAddress"))).sendKeys("mailmail@gmail.com").build().perform();
        actions.click(driver.findElement(By.id("ConfirmEmailAddress"))).sendKeys("mailmail@gmail.com").build().perform();
        actions.click(driver.findElement(By.id("Password"))).sendKeys("bestpassword").build().perform();
        actions.click(driver.findElement(By.id("ConfirmPassword"))).sendKeys("password").build().perform();

        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

        System.out.println(driver.findElement(By.xpath("//div[2]/span/span")).getText());

        Thread.sleep(500);

        driver.switchTo().window(newDescriptor3);

        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"alertBox\"]")).click();
        Alert alert1 = driver.switchTo().alert();
        Thread.sleep(500);
        alert1.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"confirmBox\"]")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(500);
        alert2.dismiss();
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"promptBox\"]")).click();
        Alert alert3 = driver.switchTo().alert();
        Thread.sleep(500);
        alert3.sendKeys("\'Final step of this task\'");
        Thread.sleep(500);
        alert3.accept();
        System.out.println(driver.findElement(By.id("output")).getText());
        Thread.sleep(500);

        driver.quit();
    }
}
