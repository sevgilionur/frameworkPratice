package com.centrilli.pages;

import com.centrilli.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DicePage {

    public DicePage(){
        PageFactory.initElements(Driver.setDriver(), this);
    }

    @FindBy(id = "typeaheadInput")
    public WebElement keywordBox;

    @FindBy(id= "google-location-search")
    public WebElement zipCodeBox;

    @FindBy(id = "totalJobCount")
    public WebElement totalJobs;

}
