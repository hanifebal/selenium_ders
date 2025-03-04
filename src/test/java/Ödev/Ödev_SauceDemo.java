package Ödev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ödev_SauceDemo {
    public static WebDriver createWebDriver(){
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        return driver;
    }
    public static void main(String[] args) {

        //1.Başarılı Giriş
        WebDriver driver = createWebDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
        System.out.println("Birinci Başarılı Giriş Yapıldı");

        driver.quit();


        //2.Başarılı Giriş,
        driver = createWebDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement usernameField2 = driver.findElement(By.id("user-name"));
        usernameField2.clear();
        usernameField2.sendKeys("problem_user");

        WebElement passwordField2 = driver.findElement(By.id("password"));
        passwordField2.clear();
        passwordField2.sendKeys("secret_sauce");

        WebElement loginButton2 = driver.findElement(By.id("login-button"));
        loginButton2.click();

        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
        System.out.println("İkinci Başarılı Giriş Yapıldı");

        driver.quit();

        //3.Başarılı Giriş
        driver = createWebDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement usernameField3 = driver.findElement(By.id("user-name"));
        usernameField3.clear();
        usernameField3.sendKeys("performance_glitch_user");

        WebElement passwordField3 = driver.findElement(By.id("password"));
        passwordField3.clear();
        passwordField3.sendKeys("secret_sauce");

        WebElement loginButton3 = driver.findElement(By.id("login-button"));
        loginButton3.click();

        wait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));
        System.out.println("Üçüncü Başarılı Giriş Yapıldı");


        driver.quit();

        driver = createWebDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement usernameField4 = driver.findElement(By.id("user-name"));
        usernameField4.clear();
        usernameField4.sendKeys("aaaaaaaaaaaaaa");

        WebElement passwordField4 = driver.findElement(By.id("password"));
        passwordField4.clear();
        passwordField4.sendKeys("111111111");

        WebElement loginButton4 = driver.findElement(By.id("login-button"));
        loginButton4.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message-container")));
        WebElement errorMessage3 = driver.findElement(By.className("error-message-container"));
        System.out.println("Hatalı giriş yaptınız: " + errorMessage3.getText());

        driver.quit();


    }
}
