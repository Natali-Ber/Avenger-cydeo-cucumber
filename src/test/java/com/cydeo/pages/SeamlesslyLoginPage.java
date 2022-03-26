package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

// http://qa.seamlessly.net/index.php/login
public class SeamlesslyLoginPage  {

    public SeamlesslyLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(css = "img[src='/core/img/actions/toggle.svg']")
    public WebElement elementImg;

    @FindBy(id = "lost-password")
    public WebElement lostpasswordLink;

    @FindBy(xpath = "//a[normalize-space(text()) = 'Log in with a device']")
    public WebElement elementLink;

    @FindBy(css = ".info")
    public WebElement infoP;

    public static String message;

    public void login(String submitType) {
        if (submitType.equals("submitButton")){
            userInput.sendKeys(ConfigurationReader.getProperty("username"));
            passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
            loginButton.click();
        }

        if (submitType.equals("enterKey")){
            userInput.sendKeys(ConfigurationReader.getProperty("username"));
            passwordInput.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);

        }
    }

    public void login(String username,String password,String submitType){
        if (submitType.equals("submitButton")){
            userInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginButton.click();
        }
        if (submitType.equals("enterKey")){
            userInput.sendKeys(username);
            passwordInput.sendKeys(password+ Keys.ENTER);

        }

        if (userInput.getText().isEmpty() && passwordInput.getText().isEmpty()){
            String  message1=userInput.getAttribute("validationMessage");
            String  message2=userInput.getAttribute("validationMessage");
            if (message1.isEmpty()){
                message=message2;
            }else{
                message=message1;
            }

        }

    }
    }
