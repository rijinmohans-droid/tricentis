package testpkg;

import java.io.IOException;
import java.net.URISyntaxException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.AllLinks;
import pagepkg.Apparelproductpage;
import pagepkg.Bookproductspage;
import pagepkg.CheckoutdetailsPage;
import pagepkg.Computersproductpage;
import pagepkg.Digitaldownloadsproductpage;
import pagepkg.Electronicsproductpage;
import pagepkg.Giftcardproductpage;
import pagepkg.Jewelryproductpage;
import pagepkg.Loginpage;
import pagepkg.Myaccount_customerinfopage;
import pagepkg.Producthomepage;
import pagepkg.Searchbarsearching;
import pagepkg.Shoppingcart_page;
import pagepkg.emailafriendpage;

public class AllLinksTest extends Baseclass{
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	Computersproductpage comp;
	Electronicsproductpage electro;
	Apparelproductpage apprl;
	Digitaldownloadsproductpage digi;
	Jewelryproductpage jewel;
	Giftcardproductpage gift;
	emailafriendpage prdtemailing;
	Myaccount_customerinfopage myaccount;
	Shoppingcart_page shopcart;
	CheckoutdetailsPage checkoutt;
	Searchbarsearching searchh;
	AllLinks links;
	
	@Test(priority=1)
    public void alllinksvalidation() throws IOException, InterruptedException, URISyntaxException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		jewel=new Jewelryproductpage(driver);
		gift=new Giftcardproductpage(driver);
		prdtemailing=new emailafriendpage(driver);
		myaccount=new Myaccount_customerinfopage(driver);
		shopcart=new Shoppingcart_page(driver);
		checkoutt=new CheckoutdetailsPage(driver);
		searchh=new Searchbarsearching(driver);
		links=new AllLinks(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
;
		test = extent.createTest("broken link validation");

		boolean linksssss=links.certainlink();
		if(linksssss)
		{
			test.pass("all links are valid");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "links are broken");
            test.addScreenCaptureFromPath(path);
			test.fail("all links are not valid and certain are broken");
		}
		
		links.clickquit();
		}
	}

