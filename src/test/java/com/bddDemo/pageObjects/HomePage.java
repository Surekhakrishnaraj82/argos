package com.bddDemo.pageObjects;

import com.bddDemo.drivers.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    public static  String searchedProduct;

   /* @FindBy(id ="searchTerm")
    private WebElement searchTxtBox;

    @FindBy(css = "button[type='submit']")
    private WebElement magnifierGlass;

    public void dosearch(String item) {
        searchedProduct=item;
        searchTxtBox.sendKeys(item);
        magnifierGlass.click();
    }*/
   @FindBy(id = "searchTerm")
   private WebElement searchBox;
   @FindBy(className = "_2mKaC")
   private  WebElement submit;
   public void doSearch(String searchItem){
       searchBox.sendKeys(searchItem);
       submit.click();
   }


    public String getHomePageUrl(){
             return driver.getCurrentUrl();

    }
}
