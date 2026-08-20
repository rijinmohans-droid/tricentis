package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Bookproductspage;
import pagepkg.Computersproductpage;
import pagepkg.Loginpage;
import pagepkg.Producthomepage;

public class Computerproducttest extends Baseclass{
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	Computersproductpage comp;
	
	@Test(priority=1)
	public void compclicking() throws IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
				
		test = extent.createTest("computer page Validation Test");
		comp.computerclick();
		String exp="https://demowebshop.tricentis.com/computers";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to computer page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to computer page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to computer page");
		}
	}
	@Test(priority=2)
	public void desktopclicking() throws IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		
		test = extent.createTest("desktop page Validation Test");
		comp.desktopclick();
		String exp="https://demowebshop.tricentis.com/desktops";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to computer page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to desktop page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to desktop page");
		}
	}
	@Test(priority=4)
	public void desktopPrdtaddtocart()
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		
		comp.desktop1();
		comp.destop1addtocart();
		comp.desktopback();
		
		comp.desktop2();
		comp.desktop2HDD();
		comp.desktop2addtocart();
		comp.desktopback();
		
		comp.desktop3();
		comp.desktop3addtocart();
		comp.desktopback();
		
		comp.desktop4();
		comp.desktopback();
		
		comp.desktop5();
		comp.desktopback();
		
		comp.desktop6();
		comp.desktopprocessor6();
		comp.desktop6addtocart();
		comp.computerclick();
		
	}
	@Test(priority=3)
	public void sortingincomp() throws InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
	
		test = extent.createTest("computers sorting Validation Test");
		Thread.sleep(2000);
		comp.sortclick();
		comp.selectDropdownByValue(comp.sort(), "https://demowebshop.tricentis.com/desktops?orderby=15"); 
		comp.selectDropdownByValue(comp.sort(), "https://demowebshop.tricentis.com/desktops?orderby=11"); 
		comp.selectDropdownByValue(comp.sort(), "https://demowebshop.tricentis.com/desktops?orderby=10"); 
		comp.selectDropdownByValue(comp.sort(), "https://demowebshop.tricentis.com/desktops?orderby=6"); 
		comp.selectDropdownByValue(comp.sort(), "https://demowebshop.tricentis.com/desktops?orderby=5"); 
		comp.selectDropdownByValue(comp.sort(), "https://demowebshop.tricentis.com/desktops?orderby=0");

		comp.displyclick();
		comp.d1click();
		Thread.sleep(2000);
		comp.d2click();
		Thread.sleep(2000);
		comp.d3click();
		
		Thread.sleep(2000);
		comp.viewclick();
		Thread.sleep(2000);
		comp.v1click();
		Thread.sleep(2000);
		comp.v2click();
		test.pass("sorting in computers page");
		
	}
	@Test(priority =5)
	public void notebookaddtocart() throws IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		
		test = extent.createTest("notebook page and add to cart Validation Test");
		comp.notebookclick();
		String exp="https://demowebshop.tricentis.com/notebooks";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			comp.laptopaddtocart();
			test.pass("page redirected to laptop page and add it to cart");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to notebook page and add to cart failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("page not redirected to laptop page and add it to cart");
		}
		comp.computerclick();
		
	}
	@Test(priority=6)
	public void accessoriesAddtocart() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		
		 test = extent.createTest("Add Items To Cart from accessories page");
		 comp.accessoriesclick();
		 
		 boolean isAdded= comp.additem();
	       
//	        List<WebElement> dtl = pro.productdlts();
//	        System.out.println("Total Products : " + dtl.size());
//
//	        for (WebElement product : dtl) {
//	            System.out.println(product.getText());
//	        }
		 if (isAdded) {
				test.pass("All products added to cart successfully");
			}
		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add products to cart");
				

	}
	
	}
	
	@Test(priority=7)
	public void verifyProductImageTest() throws IOException, InterruptedException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		
		test = extent.createTest("Product Image Availability Test");

		boolean areImagesValid = comp.verifyProductImagesPresent();
		if (areImagesValid) 
		{
		String path = Baseclass.screenshotmethod(driver, "ProductImageMissingFail");
		test.addScreenCaptureFromPath(path);
		test.fail("Product image is not proper or showing NO IMAGE AVAILABLE");
		}
//		if (areImagesValid) 
//		{
//			test.pass("All product images are available and displayed correctly");
//		} 
//		else 
//		{
//			String path = Baseclass.screenshotmethod(driver, "ProductImageMissingFail");
//			test.addScreenCaptureFromPath(path);
//			test.fail("Product image is missing or showing NO IMAGE AVAILABLE placeholder");
//		}
		Thread.sleep(3000);
		comp.homeclick();
		pro.logoutclick();
		
	}
}
