package JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3_BeforeAfterAll {

    static WebDriver driver;


    @BeforeAll
    public static void setUp() throws InterruptedException {
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

    @AfterAll
    public static void tearDown(){
        driver.close();
    }

}
