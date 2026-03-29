package com.learningselenium.tests.VWO;

import com.learningselenium.baseTest.CommonToAllTest;

import com.learningselenium.driver.DriverManager;
import com.learningselenium.pages.pageFactory.VWO.LoginPage_PF;
import com.learningselenium.utils.PropertiesReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_03_PF extends CommonToAllTest  {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_03_PF.class);

    @Test
    public void testLoginNegativeVWO_PF() {
        logger.info("Starting the Page factory testcases!!");
        LoginPage_PF loginPage_pf = new LoginPage_PF(DriverManager.getDriver());
        String error_msg = loginPage_pf.loginToVWOInvalidCreds();

        logger.info("Finished the Testcases Page Factory");
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));

    }
}
