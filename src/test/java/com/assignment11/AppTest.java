package com.assignment11;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new", "--no-sandbox", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        assertEquals("Google", driver.getTitle());
        driver.quit();
    }    


}
