package com.fun.StepDefinitions;

import com.fun.Pages.LoginPage;
import com.fun.Utilities.ConfigurationReader;
import com.fun.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LibraryUserLogin {
    WebDriver driver;
    LoginPage loginPage=new LoginPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);

    @Given("Library user on the SysLibrary login page")
    public void library_user_on_the_sys_library_login_page() {
        driver=Driver.getDriver();
        driver.get(ConfigurationReader.getProperty("qa2_url"));

    }
    @Then("Library user able to enter username and password")
    public void library_user_able_to_enter_username_and_password() {
            loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("studentEmail"));
            loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("studentPassword"));

    }
    @Then("Library user able to click sign-in button")
    public void library_user_able_to_click_sign_in_button() {
        loginPage.signInButton.click();

    }
    @When("Library user able to login")
    public void library_user_able_to_login() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.bookManagementText));
        Assert.assertTrue(loginPage.bookManagementText.isDisplayed());

    }

    @Then("Library user able to enter {string} and {string}")
    public void library_user_able_to_enter_and(String email, String password) throws InterruptedException {
       Thread.sleep(2000);
       loginPage.emailBox.sendKeys(email);
       loginPage.passwordBox.sendKeys(password);

    }
}
