package Odev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_demoga_8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");


        try {
            driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();

            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Hanife");
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bal");
            driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("bal@example.com");
            driver.findElement(By.xpath("//input[@id='age']")).sendKeys("34");
            driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("5000");
            driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Tester");

            driver.findElement(By.xpath("//button[@id='submit']")).click();

            WebElement editButton = driver.findElement(By.xpath("//span[@id='edit-record-4']"));
            editButton.click();

            WebElement ageField = driver.findElement(By.xpath("//input[@id='age']"));
            ageField.clear();
            ageField.sendKeys("35");
            driver.findElement(By.xpath("//button[@id='submit']")).click();


            WebElement deleteButton = driver.findElement(By.xpath("//span[@id='delete-record-4']"));
            deleteButton.click();

            driver.quit();

        } finally {

        }

    }

}