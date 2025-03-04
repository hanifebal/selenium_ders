package Ders1_Exe;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D4_Driver_Navigate {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hepsiburada.com");
        System.out.println("Page Title: " + driver.getTitle());
        driver.navigate().to("https://www.trendyol.com/");
        driver.navigate().back();
        System.out.println("Page Title: " + driver.getTitle());
        driver.navigate().forward();
        System.out.println("Page Title: " + driver.getTitle());
        driver.navigate().refresh();
        //driver.close();
    }
}
