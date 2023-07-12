package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class R_VytrackLoginPage {


    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(name = "_password")
    public WebElement passWord;

    @FindBy(id = "_submit")
    public WebElement submitButton;


    @FindBy(className = "loader-mask")
    public WebElement loadingBar;

    public R_VytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void login(String username,String password){
        userName.sendKeys(username);
        passWord.sendKeys(password);
        submitButton.click();
    }
    public void loginDynamic(String userType){

        userType = userType.replace(" ","_");

        String username= ConfigurationReader.getProperty(userType + "_username");
        String password= ConfigurationReader.getProperty(userType + "_password");

        login(username,password);


    }



}
