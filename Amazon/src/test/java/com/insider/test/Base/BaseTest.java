package com.insider.test.Base;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;


 //Before ve afterı kullanarak bağlantı kurup kestim . Connect'e chorme driverin yerini göstererek açılmasını sağladım.

    @Before
    public void connet(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver ();

    }
    @After
    public void cut() throws InterruptedException {
        Thread.sleep(2000);
        //Driver.quit ile sayfayı kapatıyoruz
        driver.quit();
    }
}
