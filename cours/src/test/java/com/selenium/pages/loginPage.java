package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    @FindBy(id="user-name")
    WebElement username;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="login-button")
    WebElement loginBtn;
    @FindBy(css="[data-test='error']")
    WebElement errorMessage;

    public loginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
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
