package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTables_ViewAllOrdersPage {

    public WebTables_ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//table/tbody/tr/td[1]")
    public WebElement newCustomerCell;

}
