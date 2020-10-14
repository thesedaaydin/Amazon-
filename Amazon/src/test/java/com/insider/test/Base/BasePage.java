package com.insider.test.Base;
import com.insider.test.Pages.HomePage;
import com.insider.test.Pages.LoginPage;
import com.insider.test.Pages.SearchPage;
import com.insider.test.Pages.WishPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);

    }


    //HomePage çağırıldığında linke yolladım.
    public HomePage callHomepage(){
        driver.get("https://www.amazon.com.tr");
        return new HomePage(driver);
    }

    public LoginPage callLoginpage(){
        return new LoginPage(driver);
    }

    public SearchPage searchPage(){
        return new SearchPage (driver);
    }

    public WishPage callWishPage(){
        return new WishPage (driver);
    }

    public void  clickId(String id){
        WebElement element=new WebDriverWait (driver, 30).until (ExpectedConditions.visibilityOfElementLocated(By.id(id)));

        element.click ();

    }
    
    //Kullnıcı gibi hareket etmek için actions kullandım.
    public void actionsSelector(String selector) {
        Actions actionss = new Actions (driver);
        actionss.moveToElement (driver.findElement (By.cssSelector (selector))).click ();

    }
    
    //CssSelector'e tıklama yapmak için.  
    public void clickCssSelector(String selector){
        WebElement element=new WebDriverWait (driver, 30).until (ExpectedConditions.visibilityOfElementLocated(By.cssSelector (selector)));
        element.click ();
    }
    
    //Css selectoru verilen ürünü console'a yazdırmak 
    public void write(String name) {
        WebElement listElement = new WebDriverWait (driver, 30).until (ExpectedConditions.visibilityOfElementLocated(By.cssSelector (name)));
        String elementText = listElement.getText();
        System.out.println(elementText);
    }

    public  void setId(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }
    
    public  void setSelector(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector (id)));
        element.clear();
        element.sendKeys(value);
    }
    
    public void clickXpath(String xpath){
        WebElement element=new WebDriverWait (driver, 30).until (ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.click ();
    }
    
    //Xpath ile listeleme yapıp console'a yazdırmak
    public void list(String xpath){
        List<WebElement> allProduct = driver.findElements(By.xpath(xpath));
        for( WebElement product : allProduct){
            System.out.println(product.getText());
        }
    }

}

