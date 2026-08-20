package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement login;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
	WebElement logo;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(id="RememberMe")
	WebElement checkbox;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement loginnbtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logout;
	
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/span/a")
	WebElement forgetpassword;
	
	@FindBy(id="Email")
	WebElement recoveryemail;
	
	@FindBy(name="send-email")
	WebElement recoverybtn;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input")
	WebElement registerFromlogin;
	
	public Loginpage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logovalidation()
	{
		return logo;
	}
	
	public void clickonlogin()
	{
		login.click();;
	}
	
	public WebElement btntext()
	{
		return loginnbtn ;
	}
	
	public void value(String emaill,String passs) 
	{
		email.clear();
		email.sendKeys(emaill);
		
		pass.clear();
		pass.sendKeys(passs);
	}
	
	public void checkbx()
	{
		checkbox.click();
	}
	
	public void loginbutton()
	{
		loginnbtn.click();
	}
	
	public void logoutbutton()
	{
		logout.click();
	}
	
	public void forgetpassclick()
	{
		forgetpassword.click();
	}
	
	public void recoveryemail()
	{
		recoveryemail.sendKeys("rijinmohans@gmail.com");
		recoverybtn.click();
	}
	
	public void registerclickfromlogin()
	{
		registerFromlogin.click();
	}

	
}
