package com.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.selenium.pages.loginPage;

public class seleniumTest {

    public WebDriver driver=null;

    @BeforeEach
    public void setup()
    {
        String browser=System.getProperty("browser", "chrome").toLowerCase();
        switch (browser) {
            case "edge":
                driver=new EdgeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void tearDown(){
        if(driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }
    
    @Test
    public void test(){
        loginPage lp = new loginPage(driver);
        lp.saisirUsername("standard_user");
        lp.saisirPassword("secret_sauce");
        lp.clickButton();
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Test
    public void test1(){
        loginPage lp = new loginPage(driver);
        lp.saisirUsername("standard_user_wrong");
        lp.saisirPassword("secret_sauce");
        lp.clickButton();
        assertTrue(lp.getErrorMessage().isDisplayed());
    }

}
