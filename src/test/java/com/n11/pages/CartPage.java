package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='prodDescription']")
    List<WebElement> cartProductsDescriptions;

    public boolean checkProductAddedCart(String name) {
        boolean result = false;
        for (WebElement eachDesc : cartProductsDescriptions) {
            if (eachDesc.getText().equals(name)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
