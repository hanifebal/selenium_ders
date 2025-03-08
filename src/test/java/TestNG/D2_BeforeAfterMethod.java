package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D2_BeforeAfterMethod {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
         driver =new ChromeDriver();
         Thread.sleep(3000);
    }


    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.hepsiburada.com");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(3000);

    }

    @Test
    public void test02() throws InterruptedException {
        driver.navigate().to("https://www.trendyol.com/");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(3000);

    }

    @AfterMethod

    public void tearDown() {
        driver.close();
    }


}
