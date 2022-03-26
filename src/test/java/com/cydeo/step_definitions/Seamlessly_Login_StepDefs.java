package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.SeamlesslyLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Seamlessly_Login_StepDefs {

    SeamlesslyLoginPage loginPage = new SeamlesslyLoginPage();
HomePage homePage=new HomePage();
    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlSeamlessly"));
    }

    @Given("the user is logged in with {string}")
    public void the_user_is_logged_in_with(String submitType) {
        loginPage.login(submitType);
    }

    @Then("the user should see the url {string}")
    public void the_user_should_see_the_url(String expectedURL) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Then("the user should see the username as {string}")
    public void the_user_should_see_the_username_as(String expectedUser) {
        homePage.profileIcon.click();
        BrowserUtils.sleep(2);
        String actualUser= homePage.userNameText.getText();

        Assert.assertEquals(expectedUser, actualUser);



    }
}