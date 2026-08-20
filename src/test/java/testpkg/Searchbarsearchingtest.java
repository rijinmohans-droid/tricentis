package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
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

public class Searchbarsearchingtest extends Baseclass {
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
	
	@Test(priority=1)
    public void searchbarvalidation_with_validkeyword_books() throws IOException, InterruptedException {
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
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("search bar Validation Test with Books category key word");
		searchh.search("Books");
		searchh.searchbuttonclick();
		String expt="No products were found that matched your criteria.";
		String act=searchh.noproductmessage();
		if(expt.equals(act))
		{
			
			String path = Baseclass.screenshotmethod(driver, "Books products are not shown");
            test.addScreenCaptureFromPath(path);
//            Thread.sleep(4000);
            test.fail("no products are shown with category keyword");
            
		}
		else
		{
			test.pass("products are shown with category keyword");
		}
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with Books category accepted key word");
		searchh.search("book");
		searchh.searchbuttonclick();
		String path = Baseclass.screenshotmethod(driver, "Books only products are not shown");
        test.addScreenCaptureFromPath(path);
		test.pass("only 1products are shown with book in lowercase category keyword");
	}
	
	@Test(priority=2)
    public void searchbarvalidation_with_validkeyword_computers() throws IOException, InterruptedException {
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
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with Computers category key word");
		searchh.search("Computers");
		searchh.searchbuttonclick();
		String expt1="No products were found that matched your criteria.";
		String act1=searchh.noproductmessage();
		if(expt1.equals(act1))
		{
			
			String path = Baseclass.screenshotmethod(driver, "Computers products are not shown");
            test.addScreenCaptureFromPath(path);
            test.fail("no products are shown with category keyword");
//            Thread.sleep(4000);
		}
		else
		{
			test.pass("products are shown with category keyword");
		}
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with computer category accepted key word");
		searchh.search("computer");
		searchh.searchbuttonclick();
		test.pass("products are shown with computer  in lowercase category keyword");
	}
	
	@Test(priority=3)
    public void searchbarvalidation_with_validkeyword_electronics() throws IOException, InterruptedException {
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
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with Electronics category key word");
		searchh.search("Electronics");
		searchh.searchbuttonclick();
		String expt2="No products were found that matched your criteria.";
		String act2=searchh.noproductmessage();
		if(expt2.equals(act2))
		{
			
			String path = Baseclass.screenshotmethod(driver, "Electronics products are not shown");
            test.addScreenCaptureFromPath(path);
            test.fail("no products are shown with category keyword");
       //     Thread.sleep(4000);
		}
		else
		{
			test.pass("products are shown with category keyword");
		}
	}
	
	@Test(priority=4)
    public void searchbarvalidation_with_validkeyword_apparel() throws IOException, InterruptedException {
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
		
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with Apparel & Shoes category key word");
		searchh.search("Apparel & Shoes");
		searchh.searchbuttonclick();
		String expt3="No products were found that matched your criteria.";
		String act3=searchh.noproductmessage();
		if(expt3.equals(act3))
		{
			
			String path = Baseclass.screenshotmethod(driver, "Apparel & Shoes products are not shown");
            test.addScreenCaptureFromPath(path);
            test.fail("no products are shown with category keyword");
//            Thread.sleep(4000);
		}
		else
		{
			test.pass("products are shown with category keyword");
		}
	}
	
	@Test(priority=5)
    public void searchbarvalidation_with_validkeyword_digital() throws IOException, InterruptedException {
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
		
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with Digital downloads category key word");
		searchh.search("Digital downloads");
		searchh.searchbuttonclick();
		String expt4="No products were found that matched your criteria.";
		String act4=searchh.noproductmessage();
		if(expt4.equals(act4))
		{
			
			String path = Baseclass.screenshotmethod(driver, "Digital downloads products are not shown");
            test.addScreenCaptureFromPath(path);
            test.fail("no products are shown with category keyword");
//            Thread.sleep(4000);
		}
		else
		{
			test.pass("products are shown with category keyword");
		}
	}
	
	@Test(priority=6)
    public void searchbarvalidation_with_validkeyword_jewelry() throws IOException, InterruptedException {
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
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with Jewelry category key word");
		searchh.search("Jewelry");
		searchh.searchbuttonclick();
		String path = Baseclass.screenshotmethod(driver, "Jewelry products are not shown");
        test.addScreenCaptureFromPath(path);
		test.pass("only 1products are shown with category keyword");
//		Thread.sleep(4000);
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with jewelry category accepted key word");
		searchh.search("jewelry");
		searchh.searchbuttonclick();
		String path1 = Baseclass.screenshotmethod(driver, "jewelry only products are not shown while searching");
        test.addScreenCaptureFromPath(path1);
		test.pass("only 1products are shown with jewelry in lowercase category keyword");
	}
	
	@Test(priority=7)
    public void searchbarvalidation_with_validkeyword_giftcard() throws IOException, InterruptedException {
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
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with Gift Cards category key word");
		searchh.search("Gift Cards");
		searchh.searchbuttonclick();
		String expt6="No products were found that matched your criteria.";
		String act6=searchh.noproductmessage();
		if(expt6.equals(act6))
		{
			
			String pathfor = Baseclass.screenshotmethod(driver, "Gift Cards products are not shown");
            test.addScreenCaptureFromPath(pathfor);
            test.fail("no products are shown with category keyword");
//            Thread.sleep(4000);
		}
		else
		{
			test.pass("products are shown with category keyword");
		}
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with gift card category accepted key word");
		searchh.search("gift card");
		searchh.searchbuttonclick();
		test.pass("products are shown with gift card in lowercase category keyword");
	}
	@Test(priority=8)
    public void searchbarvalidation_with_invalidkeyword() throws IOException, InterruptedException {
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
		
		Thread.sleep(4000);
		searchh.homeclick();
		test = extent.createTest("search bar Validation Test with invalid key word");
		searchh.search("1232423554");
		searchh.searchbuttonclick();
		String expt="No products were found that matched your criteria.";
		String act=searchh.noproductmessage();
		if(expt.equals(act))
		{
			
            test.pass("no products are shown with invalid1 keyword");
            
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "prdt shown with invalid1 keyword");
            test.addScreenCaptureFromPath(path);
			test.fail("products are shown with invalid1 keyword");
		}
		
		searchh.homeclick();
		searchh.search("qwertyuyiop");
		searchh.searchbuttonclick();
		String expt1="No products were found that matched your criteria.";
		String act1=searchh.noproductmessage();
		if(expt1.equals(act1))
		{
			
            test.pass("no products are shown with invalid2 keyword");
            
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "prdt shown with invalid2 keyword");
            test.addScreenCaptureFromPath(path);
			test.fail("products are shown with invalid2 keyword");
		}
		
		
		searchh.homeclick();
		searchh.search("@$#%$#%^$%^$");
		searchh.searchbuttonclick();
		String expt2="No products were found that matched your criteria.";
		String act2=searchh.noproductmessage();
		if(expt2.equals(act2))
		{
			
            test.pass("no products are shown with invalid3 keyword");
            
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "prdt shown with invalid3 keyword");
            test.addScreenCaptureFromPath(path);
			test.fail("products are shown with invalid3 keyword");
		}
		
		
		searchh.homeclick();
		searchh.search("qewee!@!@$#12134");
		searchh.searchbuttonclick();
		String expt3="No products were found that matched your criteria.";
		String act3=searchh.noproductmessage();
		if(expt3.equals(act3))
		{
			
            test.pass("no products are shown with invalid4 keyword");
            
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "prdt shown with invalid4 keyword");
            test.addScreenCaptureFromPath(path);
			test.fail("products are shown with invalid4 keyword");
		}
		searchh.homeclick();
		pro.logoutclick();
	}
}
