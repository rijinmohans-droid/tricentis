package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class emailafriendpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
	WebElement giftcard;
	@FindBy(xpath="//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[7]/input")
	WebElement emailfrnd;
	@FindBy(id="FriendEmail")
	WebElement FriendEmail;
	@FindBy(id="PersonalMessage")
	WebElement PersonalMessage;
	@FindBy(name="send-email")
	WebElement sendemail;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]")
	WebElement textvalid;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
	WebElement home;
	
	public emailafriendpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}

	public void openanprdt()
	{
		giftcard.click();
	}
	
	public void clickemailafriend()
	{
		emailfrnd.click();
	}
	
	public void emailandpersonalmsg(String email,String pmsg)
	{
		FriendEmail.clear();
		FriendEmail.sendKeys(email);
		PersonalMessage.clear();
		PersonalMessage.sendKeys(pmsg);
	}
	public boolean sendemailclick()
	{
		sendemail.click();
		return true;
	}
	
	public void backhome()
	{
		home.click();
	}
	
	public String textvalidation()
	{
		return textvalid.getText();
	}
}
