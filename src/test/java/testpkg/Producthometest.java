package testpkg;

import java.io.IOException;



import org.testng.annotations.Test;
import basepkg.Baseclass;
import pagepkg.Loginpage;
import pagepkg.Producthomepage;

public class Producthometest extends Baseclass{
	Loginpage log;
	Producthomepage pro;
	
	@Test(priority =1)
	public void logoverification() throws IOException, InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(5000);   
        test = extent.createTest("Logo Validation Test");
     
        if (pro.logoverify().isDisplayed()) {
            test.pass("Logo is displayed");
        } 
        else 
        {
            String path = Baseclass.screenshotmethod(driver, "LogoFail");
            test.addScreenCaptureFromPath(path);
            test.fail("Logo is not displayed");
        }
	}
	@Test(priority =2)
	public void additem() throws InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		
//		log.clickonlogin();
//		log.value("rijinmohans@gmail.com", "Rijin@9072");
//		log.checkbx();
//		log.loginbutton();

		pro.firstprdt();
		Thread.sleep(5000); 
		pro.valueinprdt("raju", "raju12@gmail.com");
		pro.clickaddtocart();
		pro.wish1click();
		Thread.sleep(5000);
		pro.backhomepg();
		
		pro.secondprdt();
		Thread.sleep(2000);
		
		pro.thirdprdt();
		pro.thirdprdtdtl();
		pro.addcart2();
		Thread.sleep(2000);
		pro.backhomepg();
		
		pro.fourthprdt();
		pro.processdrp();
		Thread.sleep(2000);
		pro.ramdrp();
		pro.fourthprdtdtl();
		Thread.sleep(2000);
		pro.addtocart4();
		pro.backhomepg();
		
		pro.fifthprdt();
		pro.fifthprdtdtl();
		Thread.sleep(2000);
		pro.addtocart5();
		pro.backhomepg();
		
		pro.sixthprdt();
		pro.sixthprdtdtl();
		Thread.sleep(2000);
		pro.addtocart6();
		pro.backhomepg();
		
	}

	@Test(priority = 3)
	public void newslettersubscribe() throws InterruptedException
	{
		log=new Loginpage(driver);
		pro=new Producthomepage(driver);
		
		Thread.sleep(2000);
		pro.newsletteremail();
		pro.sub();
		
		pro.logoutclick();
	}
	
}
