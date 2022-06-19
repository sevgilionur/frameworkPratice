package com.centrilli.step_definitions;

import com.centrilli.pages.GooglePage;
import com.centrilli.utility.BrowserUtils;
import com.centrilli.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {

    GooglePage googlePage = new GooglePage();

    @When("user goes to google homepage.")
    public void user_goes_to_google_homepage() {

        Driver.setDriver().get("https://google.com");

    }

    @Then("user search for {string}")
    public void user_search_for(String string) {

        googlePage.inputBox.sendKeys(string + Keys.ENTER);

        String expectedTitle = "apple - Google'da Ara";

        BrowserUtils.titleVerification(expectedTitle);

        Driver.closeDriver();

    }
}
