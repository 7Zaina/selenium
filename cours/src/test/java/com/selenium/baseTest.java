package com.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {
protected WebDriver driver=null;

    @BeforeEach
    public void setup()
    {
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        traitementInitial();
    }

    @AfterEach
    public void tearDown(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
    
    protected void traitementInitial()
    {}
}
