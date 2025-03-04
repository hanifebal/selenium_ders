package Ders1_Exe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D5_Driver_WebElement {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com.tr/");
        System.out.println("Page Title: " + driver.getTitle());
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.clear();
        searchBox.click();
        searchBox.sendKeys("Dell");


        //Arama butonuna tıklamak için;
        driver.findElement(By.id("nav-search-submit-button")).click();

        //enter a basmak için;
        //searchBox.submit();


       /* WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();*/


        //driver.close();
    }
}
