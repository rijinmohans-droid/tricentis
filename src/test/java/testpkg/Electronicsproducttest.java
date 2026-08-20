package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Bookproductspage;
import pagepkg.Computersproductpage;
import pagepkg.Electronicsproductpage;
import pagepkg.Loginpage;
import pagepkg.Producthomepage;

public class Electronicsproducttest extends Baseclass{
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	Computersproductpage comp;
	Electronicsproductpage electro;
	
	@Test(priority=1)
	public void electroclicking() throws IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		test = extent.createTest("electronics page Validation Test");
		electro.electronicsclick();
		String exp="https://demowebshop.tricentis.com/electronics";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to electronics page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to electronics page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to electronics page");
		}
	}
	
	@Test(priority=2)
	public void cameraclickingg() throws IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		
		
		test = extent.createTest("camera,photo page Validation Test");
		electro.cameraclick();
		String exp="https://demowebshop.tricentis.com/camera-photo";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to camera,photo page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to camera,photo page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to camera,photo page");
		}
	}
	@Test(priority=3)
	public void Addtocartbuttonisdisplayed() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		
		 test = extent.createTest("Add Items To Cart button validation");
		 
		 if (electro.isAddToCartButtonDisplayed()) {
	            test.pass("Add to Cart button is present on the product page.");
	        } else {
	            // Screen capture and failure reporting
	            String path1 = Baseclass.screenshotmethod(driver, "AddItemToCart Fail");
	            test.addScreenCaptureFromPath(path1);
	            test.fail("Failed to add products to cart: 'Add to Cart' button is missing on the product page.");
	        }
		 electro.back();
		 
	}
	@Test(priority=4)
	public void cellphoneclickingg() throws IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		
		
		test = extent.createTest("camera,photo page Validation Test");
		electro.cellphoneclick();
		String exp="https://demowebshop.tricentis.com/cell-phones";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to cell-phones page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to cell-phones page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to cell-phones page");
		}
		
		
	}
	
	@Test(priority=5)
	public void cellphoneaddtocart() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		
		 test = extent.createTest("smart phone add to cart validation");
		 
		 boolean isAdded= electro.smartphonetocart();
	       
		 if (isAdded) {
				test.pass(" product added to cart successfully");
			}
		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add products to cart");	

		 }
	}
	@Test(priority=6)
	public void cellphoneaddtocart1() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		
		 
		 test = extent.createTest("used phone add to cart validation");
		 electro.usedphoneclick();
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add products to cart");
		electro.backcellph();
		 
		
		 
	}
	@Test(priority=7)
	public void cellphoneaddtocart2() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		
		 
		 test = extent.createTest("phone cover add to cart validation");
		 electro.phonecoverclick();
		 Thread.sleep(2000);
		 	electro.selectDropdownByValue(electro.manuf(), "112"); 
		 	electro.selectDropdownByValue(electro.manuf(), "113"); 
		 	electro.selectDropdownByValue(electro.col(), "117"); 
		 	electro.selectDropdownByValue(electro.col(), "116"); 
		 	electro.selectDropdownByValue(electro.col(), "115"); 
		 	electro.selectDropdownByValue(electro.col(), "114"); 
		 Thread.sleep(2000);
		 electro.addtowishlisttt();
		 Thread.sleep(2000);
		 boolean isphonecoveradded= electro.tothecart();
	       
		 if (isphonecoveradded)
		 	{
				test.pass(" product added to cart successfully");
			}
		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add products to cart");	
		 }
		 
		 electro.HOme();
		 pro.logoutclick();
	}
	

}
