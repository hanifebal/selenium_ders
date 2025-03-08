package JUnit;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2_BeforeAfterEach {

    WebDriver driver;

    @BeforeEach
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

    @AfterEach

    public void tearDown() {
        driver.close();
    }


}
