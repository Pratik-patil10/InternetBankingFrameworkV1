package com.internetBanking.testCases;

import com.internetBanking.PageObjects.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_001_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() throws IOException {

        LoginPage lp = new LoginPage(driver);

        logger.info("URL is opened!");

        lp.setUsername(userName);
        logger.info("Username Entered!");

        lp.setPassword(password);
        logger.info("Password Entered!");

        lp.clickSubmit();

        String title=driver.getTitle();
//        System.out.println(driver.getTitle());

        if (driver.getTitle().equals(title)) {
            Assert.assertTrue(true);
            logger.info("Login test passed!");


        } else {
            captureScreenshot(driver,"logintest");

            Assert.assertTrue(false);
            logger.info("Login test Failed!");

        }

        lp.setLogout();
        driver.switchTo().alert().accept();

    }


}
