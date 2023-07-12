package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablesLoginPage {

    public WebTablesLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public void login(){
        this.userNameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }
    public void login(String userName, String password){
        this.userNameBox.sendKeys(userName);
        this.passwordBox.sendKeys(password);
        this.loginButton.click();
    }
}
