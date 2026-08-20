package testpkg;

import java.io.IOException;

//import org.openqa.selenium.Alert;
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
import pagepkg.Myaccount_customerinfopage;
import pagepkg.Producthomepage;
import pagepkg.emailafriendpage;

public class Myaccount_cutomerinfoTest extends Baseclass{
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
	Myaccount_customerinfopage myaccount;
	
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
		myaccount=new Myaccount_customerinfopage(driver);	
		
		log.clickonlogin();
		log.value("rijinmohans@gmail.com", "Rijin@9072");
		log.checkbx();
		log.loginbutton();
		
		Thread.sleep(2000);
		test = extent.createTest("myaccount Validation Test");
		myaccount.gmailmyaccountclick();
		String exp="https://demowebshop.tricentis.com/customer/info"; 
		Thread.sleep(2000);
		String act=driver.getCurrentUrl();
		System.out.println(act);
		if(act.equals(exp))
		{
			test.pass("page redirected to myaccount info page");
		}
		else
		{
			 String path = Baseclass.screenshotmethod(driver, "redirection to myaccount page failed");
	            test.addScreenCaptureFromPath(path);
	            test.fail("not redirected to myaccount page");
		}
	}
		@Test(priority=2)
		public void customerinfo() throws InterruptedException, IOException
		{
			
		Thread.sleep(3000);
		test = extent.createTest("customer info Validation Test");
		myaccount.gender();
		myaccount.nameandemailfield("rohan", "RK", "rohanakmp@gmail.com");
		boolean invalid=myaccount.savechanges();
		if(invalid)
		{
            test.pass("valid data accepted");
		}
		Thread.sleep(3000);
		myaccount.gender();
		myaccount.nameandemailfield("rohan123", "RK2312", "123113131332@gmail.com");
		boolean invalid1=myaccount.savechanges();
		if(invalid1)
		{
			String path = Baseclass.screenshotmethod(driver, "invalid datas detection failed");
            test.addScreenCaptureFromPath(path);
            test.fail("invalid data accepted");
		}
		Thread.sleep(3000);
		myaccount.gender();
		myaccount.nameandemailfield("rohan123@$@", "RK^y%$%^2312", "1231^%$^%13131332@gmail.com");
		boolean invalid2=myaccount.savechanges();
		if(invalid2)
		{
			String path = Baseclass.screenshotmethod(driver, "invalid datas detection failed");
            test.addScreenCaptureFromPath(path);
            test.fail("invalid data accepted");
		}
		Thread.sleep(3000);
		myaccount.gender();
		myaccount.nameandemailfield("%$#%$^$^", "%$#@%$#56", "%$#^$^%$^%&^@gmail.com");
		boolean invalid3=myaccount.savechanges();
		if(invalid3)
		{
			String path = Baseclass.screenshotmethod(driver, "invalid datas detection failed");
            test.addScreenCaptureFromPath(path);
            test.fail("invalid data accepted");
		}
		Thread.sleep(3000);
		myaccount.gender();
		myaccount.nameandemailfield("Rijin", "mohan s", "rijinmohans@gmail.com");
		boolean invalid4=myaccount.savechanges();
		if(invalid4)
		{
            test.pass("valid data accepted");
		}
		
}
		@Test(priority=3)
		public void address() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);	
			
			Thread.sleep(3000);
			test = extent.createTest("address Validation Test");
			myaccount.addressclicking();
			String exp="https://demowebshop.tricentis.com/customer/addresses"; 
			Thread.sleep(2000);
			String act=driver.getCurrentUrl();
			System.out.println(act);
			if(act.equals(exp))
			{
				test.pass("page redirected to address page");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to address page failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to address page");
			}
		}
		@Test(priority=4)
		public void address_existingvalueschange() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);
			
//			Thread.sleep(3000);
//			test = extent.createTest("address delete Test");
//			boolean deladdress=myaccount.deleteaddress();
//			if(deladdress)
//			{
//				test.pass("adrress deletion click pass");
//				Alert a=driver.switchTo().alert();
//				Thread.sleep(5000);
//				a.accept();
//				Thread.sleep(10000);
//				driver.navigate().back();
//				
//			}
//			else
//			{
//				 String path = Baseclass.screenshotmethod(driver, "adrress deletion is not possible");
//		            test.addScreenCaptureFromPath(path);
//		            test.fail("adrress deletion failed");
//			}
			Thread.sleep(3000);
			test = extent.createTest("address fields edit Validation Test");
			myaccount.editclick();
			myaccount.addressfields("adddadds", "asdasddf", "adadafaa@gmail.com", "fdsdfdsfn", "sdfsdfsfs", "fsfdsfsfs", "ufsfdsfsfrl", "fsfsfsfsf", "ufsfsfsrl"," ueqeeger");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save)
			{
				 String path = Baseclass.screenshotmethod(driver, "1invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("1invalid credentials detection failed");
			}
			
			Thread.sleep(3000);
			myaccount.editclick();
			myaccount.addressfields("1231344414", "1234142422", "21432543636456@gmail.com", "2442355336", "131242424", "23453453535", "2425353", "2352534543", "2425423423443534"," 42533642342353");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save1=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save1)
			{
				 String path = Baseclass.screenshotmethod(driver, "2invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("2invalid credentials detection failed");
			}
			
			Thread.sleep(3000);
			myaccount.editclick();
			myaccount.addressfields("!#@$$%#$%%", "@$@%%$#%@", "@#$@$@#$@#@gmail.com", "#$@$@@%@%", "@#$@%@%@%", "@#$@%@%$", "&*%$#@", "$^U&%%$", "$#%%^^#"," @#$@%@@$");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save2=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save2)
			{
				 String path = Baseclass.screenshotmethod(driver, "3invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("3invalid credentials detection failed and  passed only in email field");
			}
			
			myaccount.addressfields("rijin23!@#", "mohan#$334", "Rijin@!#$%246@gmail.com", "luminar!@$234", "tvm135$^", "golden palm nemom1245123142@#$", "golden palm pallichal1245123142@#$", "6985020", "0023556678"," 1234566789900");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save3=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save3)
			{
			
				 String path = Baseclass.screenshotmethod(driver, "4invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("4invalid credentials detection failed and  passed only in email field");
			}
			
			myaccount.addressfields("rijin", "mohan s", "rijinmohans@gmail.com", "luminar", "tvm", "golden palm nemom p.o", "green vally villa sreekaryam ", "695120", "9072881415"," 1234566789900");
			myaccount.dropdown(myaccount.addresscountry(), "41");
			myaccount.dropdown(myaccount.addressstate(), "0");
			boolean save4=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save4)
			{
				test.pass("adrress field passed with valid credentials");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("invalid credentials detection failed");
			}
		}
		
		@Test(priority=5)
		public void newaddress() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);
			
			Thread.sleep(3000);
			test = extent.createTest("newaddress fields Validation Test");
			myaccount.newaddrs();
			myaccount.addressfields("adddadds", "asdasddf", "adadafaa@gmail.com", "fdsdfdsfn", "sdfsdfsfs", "fsfdsfsfs", "ufsfdsfsfrl", "fsfsfsfsf", "ufsfsfsrl"," ueqeeger");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save)
			{
				 String path = Baseclass.screenshotmethod(driver, "1invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("1invalid credentials detection failed");
			}
			
			Thread.sleep(3000);
			myaccount.newaddrs();
			myaccount.addressfields("1231344414", "1234142422", "21432543636456@gmail.com", "2442355336", "131242424", "23453453535", "2425353", "2352534543", "2425423423443534"," 42533642342353");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save1=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save1)
			{
				 String path = Baseclass.screenshotmethod(driver, "2invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("2invalid credentials detection failed");
			}
			
			Thread.sleep(3000);
			myaccount.newaddrs();
			myaccount.addressfields("!#@$$%#$%%", "@$@%%$#%@", "@#$@$@#$@#@gmail.com", "#$@$@@%@%", "@#$@%@%@%", "@#$@%@%$", "&*%$#@", "$^U&%%$", "$#%%^^#"," @#$@%@@$");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save2=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save2)
			{
				 String path = Baseclass.screenshotmethod(driver, "3invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("3invalid credentials detection failed and  passed only in email field");
			}
			
			myaccount.addressfields("rijin23!@#", "mohan#$334", "Rijin@!#$%246@gmail.com", "luminar!@$234", "tvm135$^", "golden palm nemom1245123142@#$", "golden palm pallichal1245123142@#$", "6985020", "0023556678"," 1234566789900");
			myaccount.dropdown(myaccount.addresscountry(), "1");
			myaccount.dropdown(myaccount.addressstate(), "1");
			boolean save3=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save3)
			{
			
				 String path = Baseclass.screenshotmethod(driver, "4invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("4invalid credentials detection failed and  passed only in email field");
			}
			
			myaccount.addressfields("ammu", "M S", "ammuammallu@gmail.com", "infopark", "kochi", "golden palm nemom p.o", "green vally villa sreekaryam ", "695120", "9072881415"," 1234566789900");
			myaccount.dropdown(myaccount.addresscountry(), "41");
			myaccount.dropdown(myaccount.addressstate(), "0");
			boolean save4=myaccount.addresssaveing();
			Thread.sleep(3000);
			if(save4)
			{
				test.pass("adrress field passed with valid credentials");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "invalid credentials are accepted");
		            test.addScreenCaptureFromPath(path);
		            test.fail("invalid credentials detection failed");
			}
			

			
		}
		@Test(priority=6)
		public void orders() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);
			
			Thread.sleep(3000);
			test = extent.createTest("orders Validation Test");
			myaccount.orderss();
			String exp="https://demowebshop.tricentis.com/customer/orders";
			String act=driver.getCurrentUrl();
			if(exp.equals(act))
			{
				test.pass("page redirected to orders page");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to orders page failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to orders page");
			}
			
		}
//		@Test(priority=7)
//		public void ordersdetails() throws InterruptedException, IOException//not full
//		{
//			log=new Loginpage(driver);
//			pro=new Producthomepage(driver);
//			book=new Bookproductspage(driver);
//			comp=new Computersproductpage(driver);
//			electro=new Electronicsproductpage(driver);
//			apprl=new Apparelproductpage(driver);
//			digi=new Digitaldownloadsproductpage(driver);
//			jewel=new Jewelryproductpage(driver);
//			gift=new Giftcardproductpage(driver);
//			prdtemailing=new emailafriendpage(driver);
//			myaccount=new Myaccount_customerinfopage(driver);
//			
//			Thread.sleep(3000);
//			test = extent.createTest("ordersdetails Validation Test");
//			myaccount.detailsclick();
//			String exp="https://demowebshop.tricentis.com/orderdetails/2365692";
//			String act=driver.getCurrentUrl();
//			if(exp.equals(act))
//			{
//				test.pass("page redirected to ordersdetail page");
//			}
//			else
//			{
//				 String path = Baseclass.screenshotmethod(driver, "redirection to ordersdetail page failed");
//		            test.addScreenCaptureFromPath(path);
//		            test.fail("not redirected to ordersdetail page");
//			}
//			
//		}
		@Test(priority=7)
		public void downloadableprdt() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);
			
			Thread.sleep(3000);
			test = extent.createTest("downloadableprdt Validation Test");
			myaccount.downldprdt();
			String exp="https://demowebshop.tricentis.com/customer/Downloadable products";
			String act=driver.getCurrentUrl();
			if(exp.equals(act))
			{
				test.pass("page redirected to Downloadable products page");
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to Downloadable products page failed and show erorr some times it doesnt show error and page loads successfull");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to Downloadable products page and some times redirected to Downloadable page ");
			}
			driver.navigate().back();
			
		}
		@Test(priority=8)
		public void backinstocksubscriptions() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);
			
			Thread.sleep(3000);
			test = extent.createTest("backinstocksubscriptions Validation Test");
			myaccount.backstock();;
			String exp="https://demowebshop.tricentis.com/customer/backinstocksubscriptions";
			String act=driver.getCurrentUrl();
			if(exp.equals(act))
			{
				test.pass("page redirected to backinstocksubscriptions page");
				 String path = Baseclass.screenshotmethod(driver, "redirection to backinstocksubscriptions page passed and shows you are not subscribed bcz not recieving subscribed email link ");
		            test.addScreenCaptureFromPath(path);
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to backinstocksubscriptions page failed ");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to backinstocksubscriptions page");
			}
			
			
		}
		@Test(priority=9)
		public void rewardpoints() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);
			
			Thread.sleep(3000);
			test = extent.createTest("rewardpoints Validation Test");
			myaccount.rewardpnt();
			String exp="https://demowebshop.tricentis.com/customer/rewardpoints";
			String act=driver.getCurrentUrl();
			if(exp.equals(act))
			{
				test.pass("page redirected to rewardpoints page");
				
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to rewardpoints page failed ");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to rewardpoints page");
			}
			
			
		}
		
		@Test(priority=10)
		public void passordchange() throws InterruptedException, IOException
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
			myaccount=new Myaccount_customerinfopage(driver);
			
			Thread.sleep(3000);
			test = extent.createTest("changepassword Validation Test");
			myaccount.changepassword();;
			String exp="https://demowebshop.tricentis.com/customer/changepassword";
			String act=driver.getCurrentUrl();
			if(exp.equals(act))
			{
				test.pass("page redirected to changepassword page");
				
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "redirection to changepassword page failed ");
		            test.addScreenCaptureFromPath(path);
		            test.fail("not redirected to changepassword page");
			}
			
			test = extent.createTest("password changing Test");
			
			myaccount.passwordfields("Rijin@9072", "123456789", "123456789");
			boolean change1=myaccount.savechangepass();
			if(change1)
			{
					test.pass("password1 change successfully");
					test.fail("password view eye button is not there");
					 String path = Baseclass.screenshotmethod(driver, "password1 change success but password view eye button is not there");
			            test.addScreenCaptureFromPath(path);
				
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "changing password1 failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("password1 change not successfull");
			}
			
			myaccount.passwordfields("123456789", "qwertyuiop", "qwertyuiop");
			boolean change2=myaccount.savechangepass();
			if(change2)
			{
					test.pass("password2 change successfully");
				
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "changing password2 failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("password2 change not successfull");
			}
			
			myaccount.passwordfields("qwertyuiop", "!@#$%^&*(", "!@#$%^&*(");
			boolean change3=myaccount.savechangepass();
			if(change3)
			{
					test.pass("password3 change successfully");
				
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "changing3 password failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("password3 change not successfull");
			}
			
			myaccount.passwordfields("!@#$%^&*(", "Rijin@9072", "Rijin@9072");
			boolean change4=myaccount.savechangepass();
			if(change4)
			{
					test.pass("password4 change successfully");
				
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "changing password4 failed");
		            test.addScreenCaptureFromPath(path);
		            test.fail("password4 change not successfull");
			}
			
			myaccount.passwordfields("Rijin@9072", "Rij", "Rij");
			boolean change5=myaccount.savechangepass();
			if(change5)
			{
					test.pass("password5 change unsuccessfully ");
					String expt="The password should have at least 6 characters.";
					String actu=myaccount.errormsg();
					if(expt.equals(actu))
					{
						test.pass("error msg showed");
					}
					else
					{
						test.fail("error msg not shown");
					}
					
			}
			else
			{
				 String path = Baseclass.screenshotmethod(driver, "changing password5 success");
		            test.addScreenCaptureFromPath(path);
		            test.fail("password5 change successfull");
			}
			
			myaccount.passwordfields("Rijin@9072", "Rijin@9072", "Rijin@9072");
			boolean change6=myaccount.savechangepass();
			if(change6)
			{
					test.fail("password6 change successfully with same password in all three fields");
					 String path = Baseclass.screenshotmethod(driver, "changing password6 passed and doest show any error msg");
			            test.addScreenCaptureFromPath(path);
				
			}
			else
			{
		            test.pass("password6 change not successfull");
			}
			 pro.logoutclick();
		}
	}
		
		
	

