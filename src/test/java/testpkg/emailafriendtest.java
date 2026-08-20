package testpkg;

import java.io.IOException;

import org.testng.Assert;
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
import pagepkg.Producthomepage;
import pagepkg.emailafriendpage;

public class emailafriendtest extends Baseclass{
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
	
	@Test(priority=1)
    public void emailafriendvalidation() throws IOException, InterruptedException {
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
									
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("prdt page for email a friend Validation Test");
		prdtemailing.openanprdt();
		String exp="https://demowebshop.tricentis.com/25-virtual-gift-card";
		Thread.sleep(2000);
		String act=driver.getCurrentUrl();
		System.out.println(act);
		if(act.equals(exp))
		{
			test.pass("page redirected to Giftcardproduct page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to Giftcardproduct page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to Giftcardproduct page");
		}
		
		Thread.sleep(2000);
		test = extent.createTest("emailafriend Validation Test");
		prdtemailing.clickemailafriend();
		String exp1="https://demowebshop.tricentis.com/productemailafriend/2";
		Thread.sleep(2000);
		String act1=driver.getCurrentUrl();
		System.out.println(act);
		if(act1.equals(exp1))
		{
			test.pass("page redirected to emailafriendt page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to emailafriend page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to emailafriend page");
		}
    }
	@Test(priority=2)
	public void friendsemail_and_personalmsgvalidation() throws IOException, InterruptedException
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
		
		test=extent.createTest("friendsemail_and_personalmsgvalidation1");
		prdtemailing.emailandpersonalmsg("ammuammallu@gmail.com", "i am recommending this product beacuse its usefull");
		boolean sendemailbutton=prdtemailing.sendemailclick();
		if(sendemailbutton)
		{
			test.pass("email sended to friend with an personal message whiile clicking sendemail btn");
			 test.fail("email not recieved to friend1 with an personal message");
			 String path = Baseclass.screenshotmethod(driver, "sending prdouct details to friend with msg success bcz but not received");
	            test.addScreenCaptureFromPath(path);
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "sending prdouct details to friend with msg failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("email not sended to friend with an personal message");
		}
		
		test=extent.createTest("text validation after sendemail");
		String actualText = prdtemailing.textvalidation();
        String expectedText = "Your message has been sent.";
        try {
            // Simple validation
            Assert.assertEquals(actualText, expectedText, "Text mismatch found!");
            test.pass("Successfully verified heading text: " + actualText);
        } catch (AssertionError e) {
            // Log failure to report explicitly
            test.fail("Validation failed! Expected: " + expectedText + " but got: " + actualText);
            throw e; // Re-throw to fail the TestNG test state
        }
		
		
		Thread.sleep(4000);
		driver.navigate().back();
		
		
		test=extent.createTest("friendsemail_and_personalmsgvalidation2");
		prdtemailing.emailandpersonalmsg("AMMUAMMALLUU@gmail.com", "i am recommending this product beacuse its usefull");
		boolean sendemailbutton2=prdtemailing.sendemailclick();
		if(sendemailbutton2)
		{
			 test.fail("email with msg is sended2");
			 String path = Baseclass.screenshotmethod(driver, "sending prdouct details to friend with msg success with invalidDatas");
	            test.addScreenCaptureFromPath(path);
		}
		Thread.sleep(4000);
		driver.navigate().back();
		
		
		test=extent.createTest("friendsemail_and_personalmsgvalidation3");
		prdtemailing.emailandpersonalmsg("2324235255@gmail.com", "3543453453 535345353 345334363");
		boolean sendemailbutton3=prdtemailing.sendemailclick();
		if(sendemailbutton3)
		{
			 test.fail("email with msg is sended3 and it doesnt show wrong email");
			 String path = Baseclass.screenshotmethod(driver, "sending prdouct details to friend with msg success with invalidDatas like only numbers");
	            test.addScreenCaptureFromPath(path);
		}
		Thread.sleep(4000);
		driver.navigate().back();
		
		
		test=extent.createTest("friendsemail_and_personalmsgvalidation4");
		prdtemailing.emailandpersonalmsg("ammu12312312@gmail.com", "3543453453 12432213d sfsfsffds @#@#@#%$$%^");
		boolean sendemailbutton4=prdtemailing.sendemailclick();
		if(sendemailbutton4)
		{
			 test.fail("email with msg is sended4 and it doesnt show wrong email and and accepts all types of datas in pmsg");
			 String path = Baseclass.screenshotmethod(driver, "sending prdouct details to friend with msg success with invalidDatas");
	            test.addScreenCaptureFromPath(path);
		}
		Thread.sleep(4000);
		driver.navigate().back();
		
		
		test=extent.createTest("friendsemail_and_personalmsgvalidation5");
		prdtemailing.emailandpersonalmsg("!@@%%$%$%^@gmail.com", "i am recommending this product beacuse its usefull");
		boolean sendemailbutton5=prdtemailing.sendemailclick();
		if(sendemailbutton5)
		{
			 test.pass("email with msg is not sended5 bcz its shows wrong email");
		}
		Thread.sleep(4000);
		
		

		test=extent.createTest("friendsemail_and_personalmsgvalidation6");
		prdtemailing.emailandpersonalmsg("ammu1232#$$$@@gmail.com", "i am recommending this product beacuse its usefull");
		boolean sendemailbutton6=prdtemailing.sendemailclick();
		if(sendemailbutton6)
		{
			 test.pass("email with msg is not sended6 bcz its shows wrong email");
		}
		Thread.sleep(3000);
		prdtemailing.backhome();
		
		 pro.logoutclick();
	}
}
