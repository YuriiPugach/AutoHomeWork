package HomeWork4.TestWithParametersAndDataProvider;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class foxtrotTestDataProvider extends BaseTest {

    @Test(dataProvider = "inputWord")

    public void a(String inputWord) throws InterruptedException {
        driver.get("https://www.foxtrot.com.ua/");

        try {
            driver.findElement(By.xpath("//*[@id=\"user-location-popup\"]/div")).click();
        } catch (Exception e) {
            System.out.println("Element with xpath //*[@id=\"user-location-popup\"]/div not found");
        }

        driver.findElement(By.cssSelector(".header-search__field.evinent-search-input")).sendKeys(inputWord);
        driver.findElement(By.cssSelector(".header-search__button")).click();
        String string1 = driver.findElement(By.cssSelector(".page__title")).getText();
        if (string1.contains(inputWord)) {
            Assert.assertTrue(string1.contains(inputWord));
        } else {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@class='search-page__box-title']/label")).getText().contains(inputWord));
        }

    }

    @org.testng.annotations.DataProvider(name = "inputWord")
    public Object[][] createData() {
        return new Object[][]{
                {"машина"},
                {"input"},
                {"смысл"},
        };
    }
}
