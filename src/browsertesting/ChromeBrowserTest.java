package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        // launch the  Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open the URL into Browser
        driver.get(baseUrl);
        //Maximise the Browser
        driver.manage().window().maximize();
        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Get the Tittle of the Page
        String tittle = driver.getTitle();
        System.out.println(tittle);
        // Get Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());
        // Get Page Source
        System.out.println("Page Source :" + driver.getPageSource());
        //Find the Username field element and type the Username
        driver.findElement(By.id("user-name")).sendKeys("Jigna Patel");
        // Find the Password field element and type the Password
       driver.findElement(By.name("password")).sendKeys("jigna123");
        // close yhe Browser
        //driver.close();


    }
}
