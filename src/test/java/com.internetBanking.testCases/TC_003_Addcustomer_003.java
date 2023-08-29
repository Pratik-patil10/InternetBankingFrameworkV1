package com.internetBanking.testCases;

import com.internetBanking.PageObjects.AddCustomerPage;
import com.internetBanking.PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_003_Addcustomer_003 extends BaseClass {

    @Test
    public void addnewCustomer() throws InterruptedException, IOException {
        LoginPage lp = new LoginPage(driver);
        logger.info("URL is opened!");

        lp.setUsername(userName);
        lp.setPassword(password);
        lp.clickSubmit();
        logger.info("Login Successfully!");
        Thread.sleep(2000);

        AddCustomerPage addcust=new AddCustomerPage(driver);
        addcust.clickAddNewCustomer();

        logger.info("Entering Customer Details!");
        Thread.sleep(2000);

        addcust.customerName("Pratik Patil");
        addcust.cusrGender();
        addcust.custdob("10","03","1995");
        Thread.sleep(2000);
        addcust.custadress("New York");
        addcust.custcity("HYD");
        addcust.custstate("MH");
        addcust.custpinno("410885");
        addcust.custtelephone("7891740964");

        //to generate every time new email id randow char mehtod is written in base class which
        //will generate everytime random char.
        String email=randomEmailString()+"@gmail.com";
        addcust.custemailid(email);

        String passwd=randomAlphaNumeric();
        addcust.custPassword(passwd);
        addcust.clickSubmit();
        Thread.sleep(5000);

        logger.info("New Customer Details Added & Starting Validations!");

        boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");

        if(result){
            Assert.assertTrue(true);
            logger.info("New Customer Registered Successfully!");


        }else {
            captureScreenshot(driver,"AddNewCustomer");
            Assert.assertTrue(false);
            logger.info("New Customer Registration Failed...");
        }
    }


}
