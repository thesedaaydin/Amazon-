package com.insider.test.Pages;

import com.insider.test.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WishPage extends BasePage {
    public WishPage(WebDriver driver) {
        super (driver);
    }

    //seçilen product'ı wish list'e eklemek;
    public WishPage addWishList(){
        clickId ("wishListMainButton");
        clickId ("WLHUC_viewlist");
        //Eklenen ürün seçilen ürünle aynı mı diye kontrol sağlanması için konsola yazıldı.
        System.out.println("Eklenen ürün kontrolü;");
        write ("h3[class='a-size-base']>a");

        return new WishPage(driver);
    }

    //Wish listeki ürünün silinmesi ve listenin yenilenmesi
    public WishPage deleteWishList() throws InterruptedException {
        TimeUnit.SECONDS.sleep (2);
        clickId ("a-autoid-7");
        TimeUnit.SECONDS.sleep (2);
        clickCssSelector ("span[id='wl-list-title-10XFAWKPW8G1I']");
        TimeUnit.SECONDS.sleep (2);

        return new WishPage(driver);
    }

    //Sayfa yenilendikten sonra sayfada ürün var ise ;
    //yok ise kontrolü case göre dğişebileceği için bir tanesi comment satırına alındı.
    public void productinList(){

        System.out.println("-----------------------------------------------------------");
        System.out.println("Listedeki kalan ürünler");

        //Listede başka ürün yoksa kullanılacak;
        // write ("span[class='a-size-medium a-color-base']");

        //listede ürün var ise ;
        list ("//*[@class='a-column a-span12 g-span12when-narrow g-span7when-wide']/div/h3");


    }



}
