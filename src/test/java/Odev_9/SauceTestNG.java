package Odev_9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class SauceTestNG {

    WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        sleep(3000);
    }

    @Test
    public void loginTest() throws InterruptedException {
        WebElement inventoryTitle = driver.findElement(By.className("title"));
        Assert.assertTrue(inventoryTitle.isDisplayed(), "Login failed!");
        sleep(3000);

    }

    @Test
    public void addToCartTest() throws InterruptedException {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();

        WebElement cartItem = driver.findElement(By.className("cart_item"));
        Assert.assertTrue(cartItem.isDisplayed(), "Sepete ürün eklendi");
        sleep(3000);

    }

    @Test
    public void checkoutTest() throws InterruptedException {
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Hanife");
        driver.findElement(By.id("last-name")).sendKeys("Bal");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();
        Thread.sleep(3000);

        WebElement successMessage = driver.findElement(By.className("complete-header"));
        Assert.assertTrue(successMessage.isDisplayed(), "Ödeme Başarılı!");
    }

    @AfterClass
    public void tearDown() { driver.close();
    }
}


