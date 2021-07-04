package com.fun.Pages;

import com.fun.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement emailBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[.='Sign in']")
    public WebElement signInButton;

    //to validate library user login
    @FindBy(xpath = "//*[.='Book Management']")
    public WebElement bookManagementText;


}
