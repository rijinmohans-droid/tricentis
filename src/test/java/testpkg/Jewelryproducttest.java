package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Apparelproductpage;
import pagepkg.Bookproductspage;
import pagepkg.Computersproductpage;
import pagepkg.Digitaldownloadsproductpage;
import pagepkg.Electronicsproductpage;
import pagepkg.Jewelryproductpage;
import pagepkg.Loginpage;
import pagepkg.Producthomepage;

public class Jewelryproducttest extends Baseclass {
	
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	Computersproductpage comp;
	Electronicsproductpage electro;
	Apparelproductpage apprl;
	Digitaldownloadsproductpage digi;
	Jewelryproductpage jewel;
	
	@Test(priority=1)
    public void Jewelrypagevalidation() throws IOException, InterruptedException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		jewel=new Jewelryproductpage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("Jewelry page Validation Test");
		jewel.jeweleryclick();
		String exp="https://demowebshop.tricentis.com/jewelry";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to Jewelryproduct page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to Jewelryproduct page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to Jewelryproduct page");
		}
    }
	@Test(priority=2)
	public void jewelry1addtocart() throws InterruptedException, IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		jewel=new Jewelryproductpage(driver);
		
		Thread.sleep(2000);
		test = extent.createTest("Jewelry1 addtocart Test");
		jewel.jewlp1();
		Thread.sleep(2000);
		jewel.selectDropdownByValue(jewel.jewlp1material(), "47"); 
		jewel.selectDropdownByValue(jewel.jewlp1material(), "46"); 
		jewel.selectDropdownByValue(jewel.jewlp1material(), "45");
		
		jewel.jewlp1pendent();
		jewel.jewlp1addtowish();
		
		boolean add1=jewel.jewlp1addtocart();
		if(add1)
		{
			 String path = Baseclass.screenshotmethod(driver, "jewelry addtocartfail");
	            test.addScreenCaptureFromPath(path);
	            test.fail("failed to add jewelry product in cart it shows difference in length");
		}
		jewel.jewelrybackpage(); 
	}
	@Test(priority=3)
	public void jewelry2addtocart() throws InterruptedException, IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		jewel=new Jewelryproductpage(driver);
		
		Thread.sleep(2000);
		test = extent.createTest("Jewelry2 addtocart validation Test");
		jewel.jewlp2();
		String exp="https://demowebshop.tricentis.com/black-white-diamond-heart";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to Jewelryproduct2 page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to Jewelryproduct2 page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to Jewelryproduct2 page");
		}
		jewel.jewlp2addtowish();
		
		test = extent.createTest("Jewelry2 addtocart Test");
		Thread.sleep(2000);
		boolean add2=jewel.jewlp2addtocart();
		if(add2)
		{
			test.pass("Jewelryproduct2 added to cart");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "jewelry addtocartfail");
	            test.addScreenCaptureFromPath(path);
	            test.fail("failed to add jewelry product in cart");
		}
		jewel.jewelrybackpage(); 
	}
	@Test(priority=4)
	public void jewelry3addtocart() throws InterruptedException, IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		jewel=new Jewelryproductpage(driver);
		
		
         
		Thread.sleep(2000);
		test = extent.createTest("Jewelry3 addtocart validation Test");
		 String path = Baseclass.screenshotmethod(driver, "jewelry addtocart button missing");
         test.addScreenCaptureFromPath(path);
         test.fail("add to cart button missing jewelry prdt3");
         
		jewel.jewlp3();
		String exp="https://demowebshop.tricentis.com/diamond-pave-earrings";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to Jewelryproduct2 page");
		}
		else
		{
			 String path1 = Baseclass.screenshotmethod(driver, "redirection to Jewelryproduct3 page failed");
	            test.addScreenCaptureFromPath(path1);
	            test.fail("not redirected to Jewelryproduct3 page");
		}
		 String path2 = Baseclass.screenshotmethod(driver, "jewelry addtocart button inside missing");
         test.addScreenCaptureFromPath(path2);
         test.fail("add to cart button missing inside prdt3 jewelry prdt3");
		jewel.jewelrybackpage(); 
	}
	@Test(priority=5)
	public void jewelry4addtocart() throws InterruptedException, IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		jewel=new Jewelryproductpage(driver);
		
		
         
		Thread.sleep(2000);
		test = extent.createTest("Jewelry4 addtocart validation Test");
		 String path = Baseclass.screenshotmethod(driver, "jewelry addtocart button missing");
         test.addScreenCaptureFromPath(path);
         test.fail("add to cart button missing jewelry prdt4");
         
		jewel.jewlp4();
		String exp="https://demowebshop.tricentis.com/diamond-tennis-bracelet";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to Jewelryproduct4 page");
		}
		else
		{
			 String path1 = Baseclass.screenshotmethod(driver, "redirection to Jewelryproduct4 page failed");
	            test.addScreenCaptureFromPath(path1);
	            test.fail("not redirected to Jewelryproduct4 page");
		}
		 String path2 = Baseclass.screenshotmethod(driver, "jewelry addtocart button inside missing");
         test.addScreenCaptureFromPath(path2);
         test.fail("add to cart button missing inside jewelry prdt4");
		jewel.jewelrybackpage(); 
	}
	@Test(priority=5)
	public void jewelry5addtocart() throws InterruptedException, IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		jewel=new Jewelryproductpage(driver);
		
		
         
		Thread.sleep(2000);
		test = extent.createTest("Jewelry5 addtocart validation Test");
		 String path = Baseclass.screenshotmethod(driver, "jewelry addtocart button missing");
         test.addScreenCaptureFromPath(path);
         test.fail("add to cart button missing jewelry prdt5");
         
		jewel.jewlp5();
		String exp="https://demowebshop.tricentis.com/vintage-style-three-stone-diamond-engagement-ring";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to Jewelryproduct5 page");
		}
		else
		{
			 String path1 = Baseclass.screenshotmethod(driver, "redirection to Jewelryproduct5 page failed");
	            test.addScreenCaptureFromPath(path1);
	            test.fail("not redirected to Jewelryproduct5 page");
		}
		 String path2 = Baseclass.screenshotmethod(driver, "jewelry addtocart button inside missing");
         test.addScreenCaptureFromPath(path2);
         test.fail("add to cart button missing inside jewelry prdt5");
		jewel.jewelrybackpage(); 
		jewel.backtohome();
		 pro.logoutclick();
	}
}
