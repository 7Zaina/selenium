package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    WebDriver driver;
    WebElement username= driver.findElement(By.id("user-name"));
    WebElement password= driver.findElement(By.id("password"));
    WebElement loginBtn= driver.findElement(By.id("login-button"));
    WebElement errorMessage= driver.findElement(By.cssSelector("[data-test='error']"));

    public loginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void saisirUsername(String u)
    {
        username.sendKeys(u);
    }

    public void saisirPassword(String p)
    {
        password.sendKeys(p);
    }

    public void clickButton()
    {
        loginBtn.click();
    }

    public WebElement getErrorMessage()
    {
        return errorMessage;
    }

    
}
