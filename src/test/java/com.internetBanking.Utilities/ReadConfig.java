package com.internetBanking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    //constructor to load the property file
    public ReadConfig() {
        File src = new File("./Configurations/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is"+e.getMessage());
        }


    }

    //below are the methods which extract the data from properties file.
    public String getApplicationURL(){
    String url=pro.getProperty("baseURL");
    return url;
    }

    public String getuserName(){
        String userName=pro.getProperty("userName");
        return userName;
    }

    public String getpassword(){
        String password=pro.getProperty("password");
        return password;
    }

    public String getchromepath(){
        String chromepath=pro.getProperty("chromepath");
        return chromepath;
    }

    public String getedgepath(){
        String edgepath=pro.getProperty("edgepath");
        return edgepath;
    }

}
