package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesOrderPage extends WebTablesBasePage {


    public WebTablesOrderPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "product")
    public WebElement productDropDown;

    @FindBy(xpath = "(//div/label[@class='radio'])[1]")
    public WebElement visaRadioButtons;
    @FindBy(xpath = "(//div/label[@class='radio'])[2]")
    public WebElement masterCardRadioButtons;
    @FindBy(xpath = "(//div/label[@class='radio'])[3]")
    public WebElement americanExpressRadioButtons;

    @FindBy(name = "quantity")
    public WebElement quantityInput;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calculateButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement cutomerFullNameInput;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name= "state")
    public WebElement stateInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

    @FindBy(name = "cardNo")
    public WebElement creditCardInput;

    @FindBy(name = "cardExp")
    public WebElement expirationInput;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processButton;

    @FindBy(name ="card")
    public List<WebElement> cardTypes;

}
