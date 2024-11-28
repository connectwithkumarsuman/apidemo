package com.Apidemo.apidemo.basepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ApidemoPage {
    private AndroidDriver driver;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Accessibility']")
    private WebElement accebleId;

    public ApidemoPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnAccebleId() {
        accebleId.click();
    }
}
