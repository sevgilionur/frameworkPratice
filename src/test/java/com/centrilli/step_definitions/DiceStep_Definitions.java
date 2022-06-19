package com.centrilli.step_definitions;

import com.centrilli.pages.DicePage;
import com.centrilli.utility.ConfigurationReader;
import com.centrilli.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class DiceStep_Definitions {

    DicePage dicePage = new DicePage();

    @Given("User is on dice homepage")
    public void user_is_on_dice_homepage() {
        Driver.setDriver().get(ConfigurationReader.getProperty("dice.url"));

    }
    @When("User enters keyword and zipcode")
    public void user_enters_keyword_and_zipcode() {
        dicePage.keywordBox.sendKeys("java");
        dicePage.zipCodeBox.sendKeys("22102"+ Keys.ENTER);
    }
    @Then("User should see search results")
    public void user_should_see_search_results() {
        System.out.println("dicePage.totalJobs= " + dicePage.totalJobs.getText());
    }
}
