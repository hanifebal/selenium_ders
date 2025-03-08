package JUnit;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_Assertion {

    static WebDriver driver;

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
        String expectedTitle ="Türkiye'nin En Çok Tavsiye Edilen E-ticaret Markası Hepsiburada";;
        Assertions.assertEquals(expectedTitle,driver.getTitle());

    }

    @Test
    public void test02() throws InterruptedException {
        driver.navigate().to("https://www.trendyol.com/");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(3000);
        String expectedTitle ="En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da";;
        Assertions.assertEquals(expectedTitle,driver.getTitle());

    }

    @AfterEach

    public void tearDown() {
        driver.close();
    }

}
