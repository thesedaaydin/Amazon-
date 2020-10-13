package com.insider.test.Pages;

import com.insider.test.Base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super (driver);
    }

    public SearchPage search(String product,String pageCount, String productCount) throws InterruptedException {
        setId ("twotabsearchtextbox", product);
        clickId ("nav-search-submit-text");
        TimeUnit.SECONDS.sleep (3);
        clickXpath ("//*[@class='a-pagination']/li["+pageCount+"]");
        TimeUnit.SECONDS.sleep (2);
        clickCssSelector ("div[data-cel-widget='search_result_"+productCount+"']");
        TimeUnit.SECONDS.sleep (2);
        System.out.println("Listeye product sayfasından eklenen ürün");
        write ("div[id='titleSection']>h1>span");
        return new SearchPage (driver);
    }
}
