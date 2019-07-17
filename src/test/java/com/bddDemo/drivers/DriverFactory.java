package com.bddDemo.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    private String browser = System.getProperty("bro");
    String pageurl = System.getProperty("url");

    public DriverFactory(){

        PageFactory.initElements(driver,this);
    }
    public void openBrowser() {
        switch(browser)
        {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver=new InternetExplorerDriver();
                break;
            case "fireFox":
                WebDriverManager.firefoxdriver();
                driver=new FirefoxDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
           /*  case "opera":
                WebDriverManager.operadriver().setup();
                driver=new OperaDriver();*/

        }

        driver.get(pageurl);
    }

    public void maxiBroser() {
        driver.manage().window().maximize();

    }
     public void closeBrowser()
     {
         driver.quit();
     }
     public void applyImpWait()
     {
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     }

}
