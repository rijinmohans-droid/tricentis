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
import pagepkg.Producthomepage;

public class Giftcardproducttest  extends Baseclass{
	Loginpage log;
	Producthomepage pro;
	Bookproductspage book;
	Computersproductpage comp;
	Electronicsproductpage electro;
	Apparelproductpage apprl;
	Digitaldownloadsproductpage digi;
	Jewelryproductpage jewel;
	Giftcardproductpage gift;
	
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
		gift=new Giftcardproductpage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("Giftcard page Validation Test");
		gift.giftcardclick();
		String exp="https://demowebshop.tricentis.com/gift-cards";
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
    }
	@Test(priority=2)
	public void giftcardaddtocart1() throws InterruptedException, IOException
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
		
		 test = extent.createTest("Add Items To Cart");

		 boolean isAdded=gift.additem1();

		 if (isAdded) {
				test.pass("giftcared1 added to cart successfully");
			}
		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add giftcard1 to cart");	
	           }
		 
		    String exp="https://demowebshop.tricentis.com/gift-cards";
			String act=driver.getCurrentUrl();
			System.out.println(act);
			if(exp.equals(act))
			{
				test.pass("page redirected to Giftcardproduct1 page");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to Giftcardproduct1 page failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to Giftcardproduct1 page");
			}
			
			Thread.sleep(3000);
			gift.recipient("Ammallu","ammuammallu@gmail.com");
			boolean nameandemail=gift.clickinaddtocart();
			if(nameandemail)
			{
				test.pass("giftcared1 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient("AMMALLU","ammuammallu@gmail.com");
			boolean nameandemail1=gift.clickinaddtocart();
			if(nameandemail1)
			{
				test.pass("giftcared1 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient("AMMALLU","AMMUAMMALLU@gmail.com");
			boolean nameandemail11=gift.clickinaddtocart();
			if(nameandemail11)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient("#$%%$$%","#$%$%*$@gmail.com");
			boolean nameandemail111=gift.clickinaddtocart();
			if(nameandemail111)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			
			
			Thread.sleep(3000);
			gift.recipient("Aaaaasd","sdfsffsd@gmail.com");
			boolean nameandemai2=gift.clickinaddtocart();
			if(nameandemai2)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail(" giftcared1 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient("Aaa1231","dsaff21313@gmail.com");
			boolean nameandemai3=gift.clickinaddtocart();
			if(nameandemai3)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient("123131","1231241@gmail.com");
			boolean nameandemai4=gift.clickinaddtocart();
			if(nameandemai4)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field accepts invalid datas");
			}
			
			
			Thread.sleep(3000);
			gift.recipient("Aaaaasd","sdfsffsd@gmail.com");
			boolean nameandemai5=gift.clickinaddtocart();
			if(nameandemai5)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field accepts invalid datas");
			}
			gift.addwish();
			gift.clickbacktogift();
			
}
	@Test(priority=3)
	public void giftcardaddtocart2() throws InterruptedException, IOException
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
		
		 test = extent.createTest("Add Items To Cart");

		 boolean isAdded=gift.additem2();

		 if (isAdded) {
				test.pass("giftcared2 added to cart successfully");
			}
		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add giftcared2 to cart");	
	           }
		 
		    String exp="https://demowebshop.tricentis.com/gift-cards";
			String act=driver.getCurrentUrl();
			System.out.println(act);
			if(exp.equals(act))
			{
				test.pass("page redirected to Giftcardproduct2 page");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to Giftcardproduct2 page failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to Giftcardproduct2 page");
			}
			
			Thread.sleep(3000);
			gift.recipient2("Ammallu","ammuammallu@gmail.com");
			boolean nameandemail=gift.clickinaddtocart2();
			if(nameandemail)
			{
				test.pass("giftcared2 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared2 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared2 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient2("AMMALLU","ammuammallu@gmail.com");
			boolean nameandemail1=gift.clickinaddtocart2();
			if(nameandemail1)
			{
				test.pass("giftcared1 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient2("AMMALLU","AMMUAMMALLU@gmail.com");
			boolean nameandemail11=gift.clickinaddtocart2();
			if(nameandemail11)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient2("#$%%$$%","#$%$%*$@gmail.com");
			boolean nameandemail111=gift.clickinaddtocart2();
			if(nameandemail111)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			
			Thread.sleep(3000);
			gift.recipient2("Aaaaasd","sdfsffsd@gmail.com");
			boolean nameandemai2=gift.clickinaddtocart2();
			if(nameandemai2)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared2 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail(" giftcared2 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient2("Aaa1231","dsaff21313@gmail.com");
			boolean nameandemai3=gift.clickinaddtocart2();
			if(nameandemai3)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared2 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared2 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient2("123131","1231241@gmail.com");
			boolean nameandemai4=gift.clickinaddtocart2();
			if(nameandemai4)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared2 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared2 recipients field accepts invalid datas");
			}
			
			
			Thread.sleep(3000);
			gift.recipient2("Aaaaasd","sdfsffsd@gmail.com");
			boolean nameandemai5=gift.clickinaddtocart2();
			if(nameandemai5)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared2 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared2 recipients field accepts invalid datas");
			}
			
			gift.addwish2();
			gift.clickbacktogift();
			
}
	@Test(priority=4)
	public void giftcardaddtocart3() throws InterruptedException, IOException
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
		
		 test = extent.createTest("Add Items To Cart");

		 boolean isAdded=gift.additem3();

		 if (isAdded) {
				test.pass("giftcared4 added to cart successfully");
			}
		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add giftcared4 to cart");	
	           }
		 
		    String exp="https://demowebshop.tricentis.com/gift-cards";
			String act=driver.getCurrentUrl();
			System.out.println(act);
			if(exp.equals(act))
			{
				test.pass("page redirected to Giftcardproduct4 page");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to Giftcardproduct4 page failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to Giftcardproduct4 page");
			}
			
			Thread.sleep(3000);
			gift.recipient3("Ammallu","please provide an proper invoice");
			boolean nameandemail=gift.clickinaddtocart3();
			if(nameandemail)
			{
				test.pass("giftcared4 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient3("AMMALLU","please provide an proper invoice");
			boolean nameandemail1=gift.clickinaddtocart3();
			if(nameandemail1)
			{
				test.pass("giftcared1 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient3("AMMALLU","please provide an proper invoice");
			boolean nameandemail11=gift.clickinaddtocart3();
			if(nameandemail11)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient3("#$%%$$%","please provide an proper invoice");
			boolean nameandemail111=gift.clickinaddtocart3();
			if(nameandemail111)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient3("Aaaaasd","please provide an proper invoice");
			boolean nameandemai2=gift.clickinaddtocart3();
			if(nameandemai2)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail(" giftcared4 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient3("Aaa1231","234235590355,sdj");
			boolean nameandemai3=gift.clickinaddtocart3();
			if(nameandemai3)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient3("123131","pleaseprovideanproperinvoice");
			boolean nameandemai4=gift.clickinaddtocart3();
			if(nameandemai4)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field accepts invalid datas");
			}
			
			
			Thread.sleep(3000);
			gift.recipient3("Aaaaasd","please provide an proper 1$%#@");
			boolean nameandemai5=gift.clickinaddtocart3();
			if(nameandemai5)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field accepts invalid datas");
			}
			
			gift.addwish3();
			gift.clickbacktogift();
			
}
	@Test(priority=5)
	public void giftcardaddtocart4() throws InterruptedException, IOException
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
		
		 test = extent.createTest("Add Items To Cart");

		 boolean isAdded=gift.additem4();

		 if (isAdded) {
				test.pass("giftcared4 added to cart successfully");
			}
		 else {
				String path = Baseclass.screenshotmethod(driver, "AddItemToCartFail");
				test.addScreenCaptureFromPath(path);
				test.fail("Failed to add giftcared4 to cart");	
	           }
		 
		    String exp="https://demowebshop.tricentis.com/gift-cards";
			String act=driver.getCurrentUrl();
			System.out.println(act);
			if(exp.equals(act))
			{
				test.pass("page redirected to Giftcardproduct4 page");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to Giftcardproduct3 page failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to Giftcardproduct4 page");
			}
			
			Thread.sleep(3000);
			gift.recipient4("Ammallu","please provide an proper invoice");
			boolean nameandemail=gift.clickinaddtocart4();
			if(nameandemail)
			{
				test.pass("giftcared4 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient4("AMMALLU","please provide an proper invoice");
			boolean nameandemail1=gift.clickinaddtocart4();
			if(nameandemail1)
			{
				test.pass("giftcared1 recipients field accepts valid datas");
			}
			else
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient4("AMMALLU","please provide an proper invoice");
			boolean nameandemail11=gift.clickinaddtocart4();
			if(nameandemail11)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient4("#$%%$$%","please provide an proper invoice");
			boolean nameandemail111=gift.clickinaddtocart4();
			if(nameandemail111)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared1 recipients field accept invalid data");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared1 recipients field does not accepts valid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient4("Aaaaasd","please provide an proper invoice");
			boolean nameandemai2=gift.clickinaddtocart4();
			if(nameandemai2)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail(" giftcared4 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient4("Aaa1231","234235590355,sdj");
			boolean nameandemai3=gift.clickinaddtocart4();
			if(nameandemai3)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field accepts invalid datas");
			}
			
			Thread.sleep(3000);
			gift.recipient4("123131","pleaseprovideanproperinvoice");
			boolean nameandemai4=gift.clickinaddtocart4();
			if(nameandemai4)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field accepts invalid datas");
			}
			
			
			Thread.sleep(3000);
			gift.recipient4("Aaaaasd","please provide an proper 1$%#@");
			boolean nameandemai5=gift.clickinaddtocart4();
			if(nameandemai5)
			{
				String path = Baseclass.screenshotmethod(driver, "giftcared4 recipients field accepts invalid datas");
	            test.addScreenCaptureFromPath(path);
	            test.fail("giftcared4 recipients field accepts invalid datas");
			}
			
			gift.addwish4();
			gift.clickbacktogift();
			gift.clickbacktohome();
			
			 pro.logoutclick();
			
}
}
