
import com.insider.test.Base.BaseTest;
import com.insider.test.Pages.HomePage;
import org.junit.Test;

public class Scenario extends BaseTest {

    /**
     * Test Case;
     * 1.Log in Amazon
     * 2.Search "Samsung"
     * 3.Go to second page
     * 4.Select third product and add wish list
     * 5.Check wish list
     * 6.Delete product on wish list
     * 7.Go to wish list and check product
     */
    @Test
    public void scenario() throws InterruptedException {
        new HomePage (driver).callHomepage ()
                .callLoginpage ()
                .login ("LÜTFEN MAİL ADRESİNİZİ/TELEFONUNUZU GİRİNİZ","ŞİFRENİZİ GİRİN")
                .searchPage ()
                .search ("Samsung","3","2")
                .callWishPage ()
                .addWishList ()
                .deleteWishList()
                .productinList ();

    }


}