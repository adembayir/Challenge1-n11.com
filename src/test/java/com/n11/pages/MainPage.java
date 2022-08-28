package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input#searchData")
    public WebElement searchBox;

    @FindBy(xpath = "(//span[@class='btnBasket'])[1]")
    public WebElement firstProdAddCart;

    @FindBy(xpath = "(//h3[@class='productName'])[1]")
    public WebElement firstProdName;

    @FindBy(css = "i.iconsBasketWhite")
    public WebElement cartButton;

    @FindBy(xpath = "(//div[@class='btnContainer']/span)[1]")
    public WebElement acceptCookies;

    @FindBy(css = "a.btnSignIn")
    public WebElement loginButton;

    @FindBy(css = "a[title='Hesabım']")
    public WebElement myAccount;
}
