package com.internetBanking.testCases;

import com.internetBanking.Utilities.ReadConfig;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;


public class BaseClass {

    /* below are the hard coded values for password and all the parameter but below that it changed by using the properties file*/
//    public String baseURL="https://www.demo.guru99.com/v4";
//    public String userName="mngr26593";
//    public String password="Atharv@12";

    ReadConfig readConfig = new ReadConfig();
    public String baseURL = readConfig.getApplicationURL();
    public String userName = readConfig.getuserName();
    public String password = readConfig.getpassword();

    public static WebDriver driver;
    public static Logger logger;


    @Parameters("browser")
    @BeforeClass
    public void setUp(String br) {
        logger = Logger.getLogger("ebanking");
        PropertyConfigurator.configure("Log4j.properties");

        //launching the browser taking input from xml file
        if (br.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getchromepath());
            driver = new ChromeDriver();
        } else if (br.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", readConfig.getedgepath());
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();

        driver.get(baseURL);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public void captureScreenshot(WebDriver driver, String tname) throws IOException {

        TakesScreenshot ts = ((TakesScreenshot) driver);

        //Call getScreenshotAs method to create image file
        File Src = ts.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File target = new File("C:\\Users\\Pratik_Rajgonda\\Documents\\My Projects\\InternetBankingV1\\Screenshots\\" + tname + ".png");

        //Copy file at destination
        FileUtils.copyFile(Src, target);
        System.out.println("TC-Failed->Screenshot Taken & Stored in Screenshot FOLDER!");
    }

    public  String randomEmailString(){
        String generatedString= RandomStringUtils.randomAlphabetic(5);

        return generatedString;

    }

    public String randomNumber(){
        String generatedNumber=RandomStringUtils.randomNumeric(4);
        return generatedNumber;
    }
    public String randomAlphaNumeric(){
        String alphanumeric=RandomStringUtils.randomAlphanumeric(10);
        return alphanumeric;
    }


}
