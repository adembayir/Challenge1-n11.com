package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input#email")
    public WebElement emailBox;

    @FindBy(css = "input#password")
    public WebElement passwordBox;

    @FindBy(css = "div#loginButton")
    public WebElement loginButton;
}
