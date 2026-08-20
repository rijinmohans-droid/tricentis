package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Apparelproductpage;
import pagepkg.Bookproductspage;
import pagepkg.Computersproductpage;
import pagepkg.Digitaldownloadsproductpage;
import pagepkg.Electronicsproductpage;
import pagepkg.Giftcardproductpage;
import pagepkg.Jewelryproductpage;
import pagepkg.Loginpage;
import pagepkg.Myaccount_customerinfopage;
import pagepkg.Producthomepage;
import pagepkg.Shoppingcart_page;
import pagepkg.emailafriendpage;

public class Shoppingcart_test extends Baseclass {
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
	
	@Test(priority=1)
    public void shoppingcart_validation() throws IOException, InterruptedException {
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
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("shoppingcart Validation Test");
		shopcart.shoppingcart();
		String exp="https://demowebshop.tricentis.com/cart"; 
		Thread.sleep(2000);
		String act=driver.getCurrentUrl();
		System.out.println(act);
		if(act.equals(exp))
		{
			test.pass("page redirected to shoppingcart page");
			shopcart.scrolltobtm();
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to shoppingcart page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to shoppingcart page");
		}
	}
	
	@Test(priority=2)
	public void applycounpon_validationtest() throws IOException
	{
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
		
		test = extent.createTest("applycounponcard Validation Test");
		shopcart.applycouponcode("DISCOUNT 10");
		shopcart.applycouponbtnclick();
		shopcart.scrolltobtm();
		String expt="The coupon code you entered couldn't be applied to your order";
		String actul=shopcart.errormsgincoupon();
		if(expt.equals(actul))
		{
			test.pass("invalid coupon card is not accepted and error msg shown");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "invalid coupon card is accepted");
	            test.addScreenCaptureFromPath(path);
	            test.fail("invalid coupon card is accepted");
		}
	}
	
	@Test(priority=3)
	public void giftcard_validationtest() throws IOException
	{
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
		
		test = extent.createTest("giftcardcard Validation Test");
		shopcart.addgiftcardcode("12343546575");
		shopcart.addgiftcardclick();
		shopcart.scrolltobtm();
		String expt="The coupon code you entered couldn't be applied to your order";
		String actul=shopcart.errormsgingiftcard();
		if(expt.equals(actul))
		{
			test.pass("invalid gift card is not accepted and error msg shown");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "invalid gift card is accepted");
	            test.addScreenCaptureFromPath(path);
	            test.fail("invalid gift card is accepted");
		}
	}
	
	@Test(priority=4)
	public void dropdown_country_state() throws IOException
	{
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
		
		test = extent.createTest("dropdown_country_state Validation Test");
		shopcart.dropdown(shopcart.countryincart(),"1");
		shopcart.dropdown(shopcart.stateincart(),"1");
		boolean btnclick=shopcart.estimateshippingbtnclick();
		if(btnclick)
		{
			test.pass("estimate shipping according to country and state is shown");
			shopcart.scrolltobtm();
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "estimate shipping is not shown");
            test.addScreenCaptureFromPath(path);
            test.fail("estimate shipping according to country and state is not shown");
		}
	}
	
	@Test(priority=5)
	public void updatecart_after_delete() throws IOException, InterruptedException
	{
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
		
		test = extent.createTest("updatecart Test");
		shopcart.scrolltotop();
		shopcart.deleteprdtselect();
		Thread.sleep(2000);
		shopcart.scrolltoparticularpix();
		boolean updtaedtn=shopcart.updateprdtcart();
		if(updtaedtn)
		{
			test.pass("selected prdts are removed and updated");
			shopcart.scrolltobtm();
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "prdt is not removed in cart");
            test.addScreenCaptureFromPath(path);
            test.fail("selected prdts are not removed and updated");
		}
	}
	
	@Test(priority=6)
	public void checkout_test() throws IOException
	{
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
		
		test = extent.createTest("checkout Test");
		shopcart.checkboxclick();
		boolean chkbtn=shopcart.checkoutbtn();
		if(chkbtn)
		{
			test.pass("checkout is successsfull after clicking");
			String expt="https://demowebshop.tricentis.com/onepagecheckout";
			String axtual=driver.getCurrentUrl();
			if(expt.equals(axtual))
			{
				test.pass("page redirected to checkout page");
			}
			else
			{
			test.fail("page not redirected to checkout page");	
			}
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "not redirected to checkout page");
            test.addScreenCaptureFromPath(path);
            test.fail("checkout is not successsfull after clicking");
		}
		pro.logoutclick();
	}

}
