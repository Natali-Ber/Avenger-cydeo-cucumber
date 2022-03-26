package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //img[contains(@src,'/index.php/avatar/Employee61/32?v=0')]

    public void verifyUsername(String username){
        String locator=" //img[contains(@src,'/index.php/avatar/"+username+"/32?v=0')]";

    }

}
