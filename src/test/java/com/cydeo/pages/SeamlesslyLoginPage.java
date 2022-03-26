package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// http://qa.seamlessly.net/index.php/login
public class SeamlesslyLoginPage extends BasePage {

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
}