package com.centrilli.pages;

import com.centrilli.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public GooglePage() {

        PageFactory.initElements(Driver.setDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement inputBox;

}
