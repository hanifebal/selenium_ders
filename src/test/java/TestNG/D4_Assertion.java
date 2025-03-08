package TestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D4_Assertion {

    static WebDriver driver;

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
        String expectedTitle ="Türkiye'nin En Çok Tavsiye Edilen E-ticaret Markası Hepsiburada";;
        //Assertions.assertEquals(expectedTitle,driver.getTitle());//JUnit Asserion
        Assert.assertEquals(expectedTitle,driver.getTitle());

    }

    @Test
    public void test02() throws InterruptedException {
        driver.navigate().to("https://www.trendyol.com/");
        System.out.println("Page Title: " + driver.getTitle());
        Thread.sleep(3000);
        String expectedTitle ="Türkiye'nin En Çok Tavsiye Edilen E-ticaret Markası Hepsiburada";;
        //Assertions.assertEquals(expectedTitle,driver.getTitle());//JUnit
        Assert.assertEquals(expectedTitle,driver.getTitle());
        //Assert.assertSame(expectedTitle,driver.getTitle(),"Title farklı");//


    }

    @AfterMethod

    public void tearDown() {
        driver.close();
    }

}
