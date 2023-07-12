package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesBasePage {

    public WebTablesBasePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement viewAllOrdersLink;

    @FindBy(xpath = "//button[.='View all products']")
    public WebElement viewAllProductsLink;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement ordersLink;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logoutButton;


}
