package com.internetBanking.testCases;

import com.internetBanking.PageObjects.LoginPage;
import com.internetBanking.Utilities.XLUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_002_LoginDDT_002 extends BaseClass {

    @Test(dataProvider = "LoginData")
    public void loginDDT(String uName, String pwd) throws IOException {

        LoginPage lp = new LoginPage(driver);

        logger.info("URL is opened!");

        lp.setUsername(uName);
        logger.info("Username Entered!");

        lp.setPassword(pwd);
        logger.info("Password Entered!");

        lp.clickSubmit();

        if (isAlertPresent()) {
            driver.switchTo().alert().accept();//close the alert
            driver.switchTo().defaultContent();
            Assert.assertTrue(false);
            logger.warn("Wrong Credentails");
        } else {
            Assert.assertTrue(true);
            lp.setLogout();
            driver.switchTo().alert().accept();
            logger.info("Login Passed!");
        }
    }

    //this confirms for alert is present-user defined method
    public boolean isAlertPresent() {

        try {
            driver.switchTo().alert();
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    @DataProvider(name = "LoginData")
    public Object[][] getData() throws Exception {
        String path = System.getProperty("user.dir") + "/src/test/java/com.internetBanking.testData/LoginData.xlsx";
        int rownum = XLUtils.getRowCount(path, "Sheet1");
        int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

        String[][] loginData = new String[rownum][colcount];
        for (int i = 1; i <= rownum; i++) {
            for (int j = 0; j < colcount; j++) {
                loginData[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
            }
        }
        return loginData;
    }

}
