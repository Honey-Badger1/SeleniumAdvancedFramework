package com.learningselenium.tests.VWO;

import com.learningselenium.baseTest.CommonToAllTest;
import com.learningselenium.driver.DriverManager;
import com.learningselenium.listeners.RetryAnalyzer;
import com.learningselenium.listeners.ScreenshotListener;
import io.qameta.allure.Allure;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.learningselenium.listeners.ScreenshotListener;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.learningselenium.driver.DriverManager.getDriver;


@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)

public class TestVWOLogin_07_TakeScreen_Retry_Prop_Improved_POM extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_07_TakeScreen_Retry_Prop_Improved_POM.class);

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testFail() {
        DriverManager.getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Allure.addAttachment("Log output", "text/plain", "This is some log Pramod");
        Assert.assertTrue(false);
    }

    @Owner("PRAMOD")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testPass() {
        DriverManager.getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(true);
    }


}
