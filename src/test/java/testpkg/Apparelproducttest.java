package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Apparelproductpage;
import pagepkg.Bookproductspage;
import pagepkg.Computersproductpage;
import pagepkg.Electronicsproductpage;
import pagepkg.Loginpage;
import pagepkg.Producthomepage;

public class Apparelproducttest extends Baseclass {
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	Computersproductpage comp;
	Electronicsproductpage electro;
	Apparelproductpage apprl;
	
	@Test(priority=1)
    public void apparelandshoesclick() throws IOException, InterruptedException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("apparel&shoes page Validation Test");
		apprl.clickapparel();
		String exp="https://demowebshop.tricentis.com/apparel-shoes";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to apparel&shoes page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to apparel&shoes page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to apparel&shoes page");
		}
    }
	
	@Test(priority=2)
    public void addtocartprdt1() throws IOException, InterruptedException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		Thread.sleep(2000);
		test = extent.createTest("apparel&shoes1 addtocart Validation Test");
		apprl.prdt1click();
		boolean isadd1=apprl.addtocrt1();
		if(isadd1)
		{
			test.pass("product added to the cart");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "addtocartfail");
	            test.addScreenCaptureFromPath(path);
	            test.fail("failed to add product in cart");
		}
		apprl.addtowish1();
		apprl.back();
    }
	
	@Test(priority=3)
    public void addtocartprdt2() throws IOException, InterruptedException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		Thread.sleep(2000);
		test = extent.createTest("apparel&shoes2 addtocart Validation Test");
		apprl.prdt2click();
		Thread.sleep(2000);
		apprl.selectDropdownByValue(apprl.shoesize(), "28"); 
		apprl.selectDropdownByValue(apprl.shoesize(), "27"); 
		apprl.selectDropdownByValue(apprl.shoesize(), "26"); 
	
		apprl.colourclick();
		

		
		boolean isadd2=apprl.addtocrt2();
		if(isadd2)
		{
			test.pass("product added to the cart");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "addtocartfail");
	            test.addScreenCaptureFromPath(path);
	            test.fail("failed to add product in cart");
		}
		apprl.addtowish2();
		apprl.back();
    }
	@Test(priority=4)
	public void addtocartprdt3() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		 
		 test = extent.createTest("apparel&shoes3 addtocart Validation Test");
		 apprl.prdt3click();
		 apprl.addtocrt3();
		 apprl.back();
		 test.pass("product added to the cart");
		 apprl.prdt4click();
	}
	@Test(priority=5)
	public void addtocartprdt4() throws IOException, InterruptedException
	{	
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
	
		 test = extent.createTest("apparel&shoes4 addtocart Validation Test");
//		 apprl.prdt4click();
		 apprl.addtocrt4();
		 apprl.back();
		 test.pass("product added to the cart");
}
	@Test(priority=6)
	public void addtocartprdt7() throws IOException, InterruptedException
	{	
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
	
		 test = extent.createTest("apparel&shoes7 addtocart Validation Test");
		 Thread.sleep(2000);
		 apprl.prdt7click();
		 apprl.addtocrt7();
		 apprl.back();
		 test.fail("product added to the cart failed due to out of stock");
}
	@Test(priority=7)
	public void addtocartprdt5() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		test = extent.createTest("apparel&shoes5 addtocart Validation Test");
		Thread.sleep(2000);
		apprl.prdt5click();
		 test.fail("product added to the cart failed beacuse of missing addtocartbutton");
		 apprl.back();
		
	}
	@Test(priority=8)
	public void addtocartprdt6() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		test = extent.createTest("apparel&shoes6 addtocart Validation Test");
		Thread.sleep(2000);
		apprl.prdt6click();
		 test.fail("product added to the cart failed beacuse of missing addtocartbutton");
		 apprl.back();
		
	}
	@Test(priority=9)
	public void addtocartprdt8() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		test = extent.createTest("apparel&shoes8 addtocart Validation Test");
		Thread.sleep(2000);
		apprl.prdt8click();
		 test.fail("product added to the cart failed beacuse of missing addtocartbutton");
		 apprl.back();
		
	}
	@Test(priority=10)
    public void addtocartprdt9() throws IOException, InterruptedException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		apprl.nextslide();
		Thread.sleep(2000);
		test = extent.createTest("apparel&shoes9 addtocart Validation Test");
		apprl.prdt9click();
		Thread.sleep(2000);
		apprl.selectDropdownByValue(apprl.shirtrize(), "111"); 
		apprl.selectDropdownByValue(apprl.shirtrize(), "110"); 
		apprl.selectDropdownByValue(apprl.shirtrize(), "109"); 
	
		
		
		boolean isadd2=apprl.addtocrt9();
		if(isadd2)
		{
			test.pass("product9 added to the cart");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "addtocartfail");
	            test.addScreenCaptureFromPath(path);
	            test.fail("failed to add product9 in cart");
		}
		apprl.addtowish9();
		apprl.back();
    }
	@Test(priority=11)
	public void addtocartprdt10() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		apprl.nextslide();
		test = extent.createTest("apparel&shoes10 addtocart Validation Test");
		Thread.sleep(2000);
		apprl.prdt10click();
		 test.fail("product added to the cart failed beacuse of missing addtocartbutton");
		 apprl.back();
		
	}
	@Test(priority=12)
	public void addtocartprdt11() throws IOException, InterruptedException
	{	
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		apprl.nextslide();
		apprl.prdt11click();
		 test = extent.createTest("apparel&shoes11 addtocart Validation Test");

		 apprl.addtocart11();
		 apprl.back();
		 test.pass("product added to the cart");
}
	@Test(priority=13)
	public void addtocartprdt12() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		apprl.nextslide();
		test = extent.createTest("apparel&shoes12 addtocart Validation Test");
		Thread.sleep(2000);
		apprl.prdt12click();
		 test.fail("product added to the cart failed beacuse of missing addtocartbutton");
		 apprl.back();
		
	}
	@Test(priority=14)
	public void addtocartprdt13() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		
		apprl.nextslide();
		test = extent.createTest("apparel&shoes12 addtocart Validation Test");
		Thread.sleep(2000);
		apprl.prdt13click();
		 test.fail("product added to the cart failed beacuse of missing addtocartbutton");
		 apprl.back();
		 apprl.backtohome();
		 pro.logoutclick();
		
	}
}
