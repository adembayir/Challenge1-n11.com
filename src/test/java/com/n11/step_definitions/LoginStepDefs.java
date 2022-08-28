package com.n11.step_definitions;

import com.n11.pages.LoginPage;
import com.n11.pages.MainPage;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefs {

    MainPage mainPage = new MainPage();

    LoginPage loginPage = new LoginPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Then("I click on login button")
    public void i_click_on_login_button() {

        mainPage.loginButton.click();

    }
    @Then("I enter valid credentials")
    public void i_enter_valid_credentials() throws InterruptedException {

        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("email"));

        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

        mainPage.acceptCookies.click();

        Thread.sleep(3000);

    }
    @Then("I click on Giriş Yap button")
    public void i_click_on_giriş_yap_button() {

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginButton));
        loginPage.loginButton.click();

    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {

    }
}
