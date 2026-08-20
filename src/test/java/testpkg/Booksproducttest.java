package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Bookproductspage;
import pagepkg.Loginpage;
import pagepkg.Producthomepage;

public class Booksproducttest extends Baseclass {
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	
	@Test(priority =1)
	public void booksclicking() throws InterruptedException, IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
				
		test = extent.createTest("books Validation Test");
		Thread.sleep(3000);
		book.booksclick();
		
		String exp="https://demowebshop.tricentis.com/books";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("redirected to books page");
		}
		else 
        {
            String path = Baseclass.screenshotmethod(driver, "redirection to books page failed");
            test.addScreenCaptureFromPath(path);
            test.fail("not redirected to books page");
        }
	}
	@Test(priority=2)
	public void sorting() throws InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
	
		test = extent.createTest("books sorting Validation Test");
		book.selectDropdownByValue(book.sort(), "https://demowebshop.tricentis.com/books?orderby=15"); 
		book.selectDropdownByValue(book.sort(), "https://demowebshop.tricentis.com/books?orderby=11"); 
		book.selectDropdownByValue(book.sort(), "https://demowebshop.tricentis.com/books?orderby=10"); 
		book.selectDropdownByValue(book.sort(), "https://demowebshop.tricentis.com/books?orderby=6"); 
		book.selectDropdownByValue(book.sort(), "https://demowebshop.tricentis.com/books?orderby=5"); 
		book.selectDropdownByValue(book.sort(), "https://demowebshop.tricentis.com/books?orderby=0");

		book.displyclick();
		book.d1click();
		Thread.sleep(2000);
		book.d2click();
		Thread.sleep(2000);
		book.d3click();
		
		Thread.sleep(2000);
		book.viewclick();
		Thread.sleep(2000);
		book.v1click();
		Thread.sleep(2000);
		book.v2click();
		test.pass("sorting in books page");
		
	}

	@Test(priority =3)
	public void additemtocarts() throws InterruptedException, IOException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		
		 test = extent.createTest("Add Items To Cart");

//		 boolean isAdded=
				 book.additem();
	       
//	        List<WebElement> dtl = pro.productdlts();
//	        System.out.println("Total Products : " + dtl.size());
//
//	        for (WebElement product : dtl) {
//	            System.out.println(product.getText());
//	        }
//		 if (isAdded) {
//				test.pass("All products added to cart successfully");
//			}
//		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add products to cart");
				
				book.home();
				pro.logoutclick();
	}
	
}


