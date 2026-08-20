package testpkg;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import basepkg.Baseclass;
import pagepkg.Loginpage;
import utilitiespkg.utilities;

public class Logintest extends Baseclass{
	Loginpage log;
	
	@Test(priority =2)
	public void clicklogin()
	{
		test=extent.createTest("login clicking test");
		log=new Loginpage(driver);
		log.clickonlogin();
	}
	
	@Test(priority =1)
	public void fetchtitle() throws IOException
	{
		test=extent.createTest("tiltle verification from login page");
		String act=driver.getTitle();
		String exp="Demo Web Shop";
		System.out.println(act);
		if(exp.equals(act)) {
			test.pass("pass");
		}
		else {
			String path=Baseclass. screenshotmethod(driver, "screenshot");
			test.addScreenCaptureFromPath(path);
			test.fail("fail");
		}
	}
	
	@Test(priority =3)
	public void logoverification() throws IOException
	{
		test=extent.createTest("logo validation test");
		log=new Loginpage(driver);
		WebElement x=log.logovalidation();
		if(x.isDisplayed()) {
			test.pass("logo displayed");
		}
		else {
			String path=Baseclass. screenshotmethod(driver, "logo");
			test.addScreenCaptureFromPath(path);
			test.fail("logo not displayed");
		}
	}
	
	@Test(priority =4)
	public void buttontextverification() throws IOException
	{
		test=extent.createTest("button text validation");
		log=new Loginpage(driver);
		String text=log.btntext().getDomAttribute("value");
		if(text.equals("Log in"))
		{
			test.pass("pass");	
		}
		else {
			String path=Baseclass. screenshotmethod(driver, "buttontext");
			test.addScreenCaptureFromPath(path);
			test.fail("fail");
			
		}
	}
	
	@Test(priority =5)
	public void valueset() throws IOException, InterruptedException
	{
		test=extent.createTest("login validation test");
		log=new Loginpage(driver);
		String xl="C:\\Users\\MSI\\Downloads\\tricentis1.xlsx";
		String sheet="sheet1";
		int rowcount=utilities.getRowCount(xl, sheet);
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++) {
			int cellcount=utilities.getCellCount(xl, sheet, i);
			System.out.println("cell count:"+ cellcount);
			for(int j=0;j<cellcount;j+=2)
			{
				String username=utilities.getcellvalue(xl, sheet, i, j);
				System.out.println("username="+username);
				String password=utilities.getcellvalue(xl, sheet, i, j+1);
				System.out.println("password="+password);
				log.value(username, password);
				log.checkbx();
				log.loginbutton();
				Thread.sleep(2000);
				if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/")) {
					System.out.println("logged in successfully");
					test.pass("pass");
					
				}
				else {
					String path=Baseclass.screenshotmethod(driver, "loginsuccess_"+username);
					test.addScreenCaptureFromPath(path);
					Thread.sleep(2000);
					driver.get("https://demowebshop.tricentis.com/login");
					test.fail("fail");
				}
			}
		}
	}
	
	@Test(priority =6)
	public void forgetpass() throws InterruptedException, IOException
	{
		test=extent.createTest("forget pass recovery mail test");
		log=new Loginpage(driver);
		log.logoutbutton();
		Thread.sleep(2000);
		log.clickonlogin();
		
		log.value("rijinmoha.ns@gmail.com","rijin");
		log.forgetpassclick();
		log.recoveryemail();
		String path=Baseclass.screenshotmethod(driver, "recovery mail sended but not received in that particular email");
		test.addScreenCaptureFromPath(path);
		test.fail("forget pass recovery email failed");
		
	}
	
	@Test(priority = 7)
	public void registerbtnclickFromlogin() throws InterruptedException, IOException
	{
		test=extent.createTest("register button click from login testing");
		log=new Loginpage(driver);
		log.logoutbutton();
		Thread.sleep(2000);
		log.clickonlogin();
		
		log.registerclickfromlogin();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/register")) {
			System.out.println("redirects to registerpage");
			test.pass("pass");
			
		}
		else {
			String path=Baseclass.screenshotmethod(driver, "not redirects to registerpage");
			test.addScreenCaptureFromPath(path);
			Thread.sleep(2000);
			driver.get("https://demowebshop.tricentis.com/login");
			test.fail("fail");
		}
	}
	
	}

