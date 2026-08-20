package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Apparelproductpage;
import pagepkg.Bookproductspage;
import pagepkg.Computersproductpage;
import pagepkg.Digitaldownloadsproductpage;
import pagepkg.Electronicsproductpage;

import pagepkg.Loginpage;

import pagepkg.Producthomepage;

public class Digitaldownloadsproducttest extends Baseclass{
	
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	Computersproductpage comp;
	Electronicsproductpage electro;
	Apparelproductpage apprl;
	Digitaldownloadsproductpage digi;
	
	@Test(priority=1)
    public void apparelandshoesclick() throws IOException, InterruptedException {
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("apparel&shoes page Validation Test");
		digi.digitalclick();
		String exp="https://demowebshop.tricentis.com/digital-downloads";
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			test.pass("page redirected to Digitaldownload page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to Digitaldownload page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to Digitaldownload page");
		}
    }
	@Test(priority = 2)
    public void additemstocart() throws InterruptedException, IOException {

		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		book=new Bookproductspage(driver);
		comp=new Computersproductpage(driver);
		electro=new Electronicsproductpage(driver);
		apprl=new Apparelproductpage(driver);
		digi=new Digitaldownloadsproductpage(driver);
		
        Thread.sleep(5000);   

        test = extent.createTest("Add Items To Cart");

       digi.additem();
      test.pass("All products added to cart successfully");
      digi.backtohome();
      pro.logoutclick();
      }
}
