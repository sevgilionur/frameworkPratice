package com.centrilli.utility;

import com.sun.jna.WString;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class BrowserUtils {

    public static void titleVerification(String expectedTitle){

        Assert.assertEquals(expectedTitle, Driver.setDriver().getTitle());

    }

}
