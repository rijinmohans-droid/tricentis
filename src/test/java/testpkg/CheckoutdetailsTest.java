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
import pagepkg.Shoppingcart_page;
import pagepkg.emailafriendpage;

public class CheckoutdetailsTest extends Baseclass {
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
	
	@Test(priority=1)
    public void checkout_validation() throws IOException, InterruptedException {
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
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("checkout Validation Test");
		checkoutt.cartclick();
		checkoutt.scrolltobtm();
		checkoutt.dropdown(checkoutt.countryids(),"1");
		checkoutt.dropdown(checkoutt.StateProvinceIds(),"1");
		checkoutt.checkbox();
		boolean chkbtn=checkoutt.checkout();
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
}
	
	@Test(priority=2)
    public void billingadress_validation() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("billingadress Validation Test");
		checkoutt.dropdown(checkoutt.billingaddd(),"5091906");
		boolean cont1=checkoutt.billingaddcontinuebtn();
		if(cont1)
		{
			test.pass("billing address selected successfully");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "billing address is not selected");
            test.addScreenCaptureFromPath(path);
            test.fail("billing address not selected successfully");
		}
		
	}
	
	@Test(priority=3)
    public void shippingaddress_validation() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("shippingaddress Validation Test");
		checkoutt.dropdown(checkoutt.shippingaddresss(),"5091906");
		boolean cont2=checkoutt.shippingaddressscontinuebtn();
		if(cont2)
		{
			test.pass("shippingaddress selected successfully");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "shippingaddress is not selected");
            test.addScreenCaptureFromPath(path);
            test.fail("shippingaddress not selected successfully");
		}
		
	}
	
	@Test(priority=4)
    public void shippingmethod_validation() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("shippingmethod selection Test");
		checkoutt.shippingmethodclick();
		boolean cont3=checkoutt.continuebtn3click();
		if(cont3)
		{
			test.pass("shippingmethod ground selected successfully");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "shippingmethod ground is not selected");
            test.addScreenCaptureFromPath(path);
            test.fail("shippingmethod ground not selected successfully");
		}
		
	}
	
	@Test(priority=5)
    public void paymentmethod_selection() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("paymentmethod_selection Test");
		checkoutt.codpayment();
		boolean cont4=checkoutt.continuebtn4click();
		if(cont4)
		{
			test.pass("paymentmethod cod selected successfully");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "paymentmethod cod is not selected");
            test.addScreenCaptureFromPath(path);
            test.fail("paymentmethod cod not selected successfully");
		}
		
	}
	
	@Test(priority=6)
    public void paymentmethodinfo_validation() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("paymentmethod_selection Test");
		String expt="You will pay by COD";
		String actual=checkoutt.paymentinfo();
		if(expt.equals(actual))
		{
			test.pass("paymentmethod selected is shown");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "paymentmethod cod is not shown after selecting it");
            test.addScreenCaptureFromPath(path);
			test.fail("paymentmethod selected is not shown");
		}
		boolean cont5=checkoutt.continuebtn5click();
		if(cont5)
		{
			test.pass("payment info show is correct");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "failed in continuing after payment info selected correctly");
            test.addScreenCaptureFromPath(path);
            test.fail("payment info show is not correct");
		}
		
	}
	
	@Test(priority=7)
    public void checkoutlast_confirm() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("checkoutlast_confirm Test");
		checkoutt.scrolltobtm();
		boolean cont6=checkoutt.Confirmcontinuebtnclick();
		if(cont6)
		{
			test.pass("checkout button clicked successfully");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "check out btn is not clickable");
            test.addScreenCaptureFromPath(path);
            test.fail("checkout button not clicked successfully");
		}
		
		Thread.sleep(4000);
		String expt="https://demowebshop.tricentis.com/checkout/completed/";
		String actu=driver.getCurrentUrl();
		if(expt.equals(actu))
		{
			test.pass("checkout successfull and redireted to thankyou page");
		}
		else
		{
			test.fail("checkout not successfull and not redireted to thankyou page");
		}
	}
	@Test(priority=8)
    public void orderplacement() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("orderplacement Test");
		String expt="Your order has been successfully processed!";
		String actual=checkoutt.ordersuccess();
		if(expt.equals(actual))
		{
			test.pass("order successfull");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "failed in order placement");
            test.addScreenCaptureFromPath(path);
			test.fail("order placed unsuccessfull");
		}
	}
	
	@Test(priority=9)
    public void to_orderdetails_validation() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("orderdetails_validation Test");
		boolean cont7=checkoutt.orderdetailsclick();
		if(cont7)
		{
			test.pass("redirected to order details page");
			
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "redirected to orderdetails page failed");
            test.addScreenCaptureFromPath(path);
            test.fail("redirected to order details page");
		}
		boolean pdf=checkoutt.pdfdwnld();
		if(pdf)
		{
			test.pass("pdf download successfull");
			
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "pdf failed to download");
            test.addScreenCaptureFromPath(path);
            test.fail("pdf not downloaded successfully");
		}
	}
	
	@Test(priority=10)
    public void reorder_validation() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("reordering prdt Test");
		checkoutt.reordering();
		String expt="https://demowebshop.tricentis.com/cart";
		String actu=driver.getCurrentUrl();
		System.out.println(actu);
		if(expt.equals(actu))
		{
			test.pass("page redirected to shoppingcart for reordering");
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "reordering failed");
            test.addScreenCaptureFromPath(path);
            test.fail("page not redirected to shoppingcart for reordering");
		}
		
		checkoutt.back();
		checkoutt.back();
		
		
		
		
	}
	
	@Test(priority=11)
    public void ordersuccessfull_validaton() throws IOException, InterruptedException {
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
		
		Thread.sleep(2000);
		test = extent.createTest("ordersuccess Test");
		boolean succ=checkoutt.ordersuccfullycompleted();
		if(succ)
		{
			test.pass("order completed and redirected to home page");
			
		}
		else
		{
			String path = Baseclass.screenshotmethod(driver, "order completion failed");
            test.addScreenCaptureFromPath(path);
            test.fail("order not completed and also not redirected to home page");
		}
		pro.logoutclick();
	}
}
