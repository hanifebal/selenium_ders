package Ders1_Exe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2_WebDriver_Get {

    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hepsiburada.com");

        System.out.println("---------------------------------");
        System.out.println("Sayfa Title: " + driver.getTitle());

        System.out.println("---------------------------------");
        System.out.println("Page url: " + driver.getCurrentUrl());

        System.out.println("---------------------------------");
        //System.out.println("Page source: " + driver.getPageSource());

        System.out.println("---------------------------------");


        driver.close();
    }
}
