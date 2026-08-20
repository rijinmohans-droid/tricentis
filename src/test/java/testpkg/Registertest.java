package testpkg;

import java.io.IOException;

import org.testng.annotations.Test;


import basepkg.Baseclass;
import pagepkg.RegisterPage;

public class Registertest extends Baseclass {
	RegisterPage reg;
	
	@Test
	public void title() throws IOException
	{
		test=extent.createTest("title verification test");
		reg=new RegisterPage(driver);
		String act=driver.getTitle();
		String exp="Demo Web Shop. Register";
		if(exp.equals(act)) {
			test.pass("pass");
		}
		else {
			String path=Baseclass. screenshotmethod(driver, "screenshot");
			test.addScreenCaptureFromPath(path);
			test.fail("fail");
		}
	}
	
	@Test
	public void registeration()
	{
		test=extent.createTest("Registeration testing");
		reg=new RegisterPage(driver);
		reg.registerationopen();
		reg.accountcreate("Rijin","mohan s","rijinmoha.ns@gmail.com", "Rijin@9072", "Rijin@9072");
		reg.registerbuttonclick();
		reg.continuebt();
		reg.logout();
	}

}
