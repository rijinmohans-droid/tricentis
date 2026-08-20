package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement register;
	
	@FindBy(id="gender-male")
	WebElement radio;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(id="ConfirmPassword")
	WebElement confpass;
	
	@FindBy(id="register-button")
	WebElement registerbutton;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")
	WebElement continuebtn;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logoutt;
	
	public RegisterPage(WebDriver driver) {
		 this.driver = driver;
	        PageFactory.initElements(driver, this);
	}

	public void registerationopen()
	{
		register.click();
	}
	
	public void accountcreate(String fname,String lname,String mail,String password,String confirmpass)
	{
		radio.click();
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		email.sendKeys(mail);
		pass.sendKeys(password);
		confpass.sendKeys(confirmpass);
	}
	
	public void registerbuttonclick()
	{
		registerbutton.click();
	}
	
	public void continuebt()
	{
		continuebtn.click();
	}
	
	public void logout()
	{
		logoutt.click();
	}
	
}
