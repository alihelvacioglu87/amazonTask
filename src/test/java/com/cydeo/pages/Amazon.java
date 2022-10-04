package com.cydeo.pages;

import com.cydeo.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon {

    public Amazon(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//input[@id ='twotabsearchtextbox']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@data-cel-widget='search_result_1']")
    public WebElement checkThis;

    @FindBy(xpath = "//div[@data-cel-widget='search_result_2']//img[@class='s-image']")
    public WebElement firstSearchResult;

    @FindBy(xpath = "//div[@data-cel-widget='search_result_3']//img[@class='s-image']")
    public WebElement otherFirstSearchResult;

    @FindBy(xpath = "//li[@id='size_name_0']")
    public WebElement firstSizeOption;

    @FindBy(xpath = "//li[@id='size_name_1']")
    public WebElement secondSizeOption;

    @FindBy(xpath = "//li[@id='size_name_2']")
    public WebElement thirdSizeOption;

    @FindBy(xpath = "//li[@id='size_name_3']")
    public WebElement fourthSizeOption;

    @FindBy(xpath = "//li[@id='size_name_4']")
    public WebElement fifthSizeOption;

    @FindBy(xpath ="//tr[@class='a-spacing-small po-model_name']/td[2]")
    public WebElement modelName;

    @FindBy(xpath = "//div[@id='variation_size_name']//span[@class='selection']")
    public WebElement size;

    @FindBy(xpath = "//div[@id='variation_color_name']//span[@class='selection']")
    public WebElement color;

    @FindBy(xpath = "//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']//span[@class='a-offscreen']")
    public WebElement price;

    @FindBy(xpath = "//div[@id='availability']//span[@class='a-size-medium a-color-success']")
    public WebElement stock;
}
