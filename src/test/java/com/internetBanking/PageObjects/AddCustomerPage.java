package com.internetBanking.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class AddCustomerPage {


    WebDriver ldriver;

    public AddCustomerPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[text()='New Customer']")
    WebElement lnkAddNewCustomer;

    @FindBy(name ="name")
    WebElement txtCustomerName;

    @FindBy(name = "rad1")
    WebElement rdGender;

    @FindBy(how = How.ID_OR_NAME,using = "dob")
    WebElement txtdob;

    @FindBy(how = How.NAME,using = "addr")
    WebElement txtAddress;

    @FindBy(how = How.NAME,using = "city")
    WebElement txtCity;

    @FindBy(how = How.NAME,using = "state")
    WebElement txtState;

    @FindBy(how = How.NAME,using = "pinno")
    WebElement txtpinno;

    @FindBy(how = How.NAME,using = "telephoneno")
    WebElement txttelephoneno;

    @FindBy(how = How.NAME,using = "emailid")
    WebElement txtemailid;

    @FindBy(how = How.NAME,using = "password")
    WebElement txtpassword;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnSubmit;

    public void clickAddNewCustomer() {
        lnkAddNewCustomer.click();
    }
    public void customerName(String cname) {
        txtCustomerName.sendKeys(cname);
    }
    public void cusrGender() {
        rdGender.click();
    }
    public void custdob(String dd,String mm,String yyyy) throws InterruptedException {
        txtdob.sendKeys(dd);
        txtdob.sendKeys(mm);
        Thread.sleep(2000);
        Actions act=new Actions(ldriver);
        act.sendKeys(Keys.TAB).build().perform();
        act.sendKeys(Keys.RETURN).build().perform();
        txtdob.sendKeys(yyyy);
    }
    public void custadress(String custadress) {
        txtAddress.sendKeys(custadress);
    }
    public void custcity(String ccity) {
        txtCity.sendKeys(ccity);
    }
    public void custstate(String cstate) {
        txtState.sendKeys(cstate);
    }
    public void custpinno(String cpinno) {
        txtpinno.sendKeys(String.valueOf(cpinno));
    }
    public void custtelephone(String ctelephonno) {
        txttelephoneno.sendKeys(ctelephonno);
    }
    public void custemailid(String cemailid) {
        txtemailid.sendKeys(cemailid);
    }
    public void custPassword(String password) {
        txtpassword.sendKeys(password);
    }
    public void clickSubmit () {
        btnSubmit.click();
    }

}
