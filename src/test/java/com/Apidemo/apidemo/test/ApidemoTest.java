package com.Apidemo.apidemo.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Apidemo.apidemo.basepage.ApidemoPage;
import com.Apidemo.apidemo.basepage.BasePage;

public class ApidemoTest {

    @BeforeClass
    public static void setup() {
        BasePage.setup();
    }

    @Test
    public void accesibleIdTest() {
        ApidemoPage page = new ApidemoPage(BasePage.driver); // Pass the driver
        page.clickOnAccebleId(); // Interact with the element
    }

    @AfterClass
    public static void teardown() {
        if (BasePage.driver != null) {
            BasePage.driver.quit();
        }
    }
}
