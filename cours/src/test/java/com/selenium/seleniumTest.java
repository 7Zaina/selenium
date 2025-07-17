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

public class seleniumTest extends baseTest{
    private loginPage lp;

    @Override
    protected void traitementInitial() {
        lp = new loginPage(driver);
    }
    // @BeforeEach
    // public void setup(){
    //     super.setup();
    //     driver.get("https://www.saucedemo.com/");
        
    // }

    // @AfterEach
    // public void tearDown()
    // {
    //     super.tearDown();
    // }
    
    @Test
    public void test(){
        lp.saisirUsername("standard_user");
        lp.saisirPassword("secret_sauce");
        lp.clickButton();
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

    @Test
    public void test1(){
        
        lp.saisirUsername("standard_user_wrong");
        lp.saisirPassword("secret_sauce");
        lp.clickButton();
        assertTrue(lp.getErrorMessage().isDisplayed());
    }

}
