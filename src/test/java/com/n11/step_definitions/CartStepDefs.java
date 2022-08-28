package com.n11.step_definitions;

import com.n11.pages.CartPage;
import com.n11.pages.MainPage;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartStepDefs {

    MainPage mainPage = new MainPage();

    CartPage cartPage = new CartPage();
    String productNameAddedCart;

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {

        Driver.getDriver().get("https://www.n11.com/");

        Assert.assertEquals("n11 - Hayat Sana Gelir", Driver.getDriver().getTitle());
    }
    @When("I make a search for {string}")
    public void i_make_a_search_for(String searchClause) {

        mainPage.searchBox.sendKeys(searchClause + Keys.ENTER);
    }
    @When("I add first product in my cart.")
    public void i_add_first_product_in_my_cart() throws InterruptedException {

        mainPage.acceptCookies.click();

        mainPage.firstProdAddCart.click();

        productNameAddedCart = mainPage.firstProdName.getText();

        Thread.sleep(3000);


    }
    @Then("Product should be added in my cart.")
    public void product_should_be_added_in_my_cart() {

        mainPage.cartButton.click();

        Assert.assertTrue(cartPage.checkProductAddedCart(productNameAddedCart));
    }
}
