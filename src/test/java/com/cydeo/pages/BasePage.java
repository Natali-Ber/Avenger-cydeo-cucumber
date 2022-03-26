package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img)[2]")
    public WebElement profileIcon;


    @FindBy(xpath = "(//nav[@id='expanddiv']//span)[1]")
    public WebElement userNameText;



/*
    //img[contains(@src,'/index.php/avatar/Employee61/32?v=0')]

    public void verifyUsername(String username){
        String locator=" //img[contains(@src,'/index.php/avatar/"+username+"/32?v=0')]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        Assert.assertTrue(element.isDisplayed());
    }


 */
}
