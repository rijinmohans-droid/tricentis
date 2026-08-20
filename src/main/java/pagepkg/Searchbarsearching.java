package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchbarsearching {
	WebDriver driver;
	@FindBy(id="small-searchterms")
	WebElement searchfield;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")
	WebElement searchbtn;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
	WebElement home;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/strong")
	WebElement noproductmsg;
	
	
	
	public Searchbarsearching(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void search(String value)
	{
		searchfield.clear();
		searchfield.sendKeys(value);
	}
	public void searchbuttonclick()
	{
		searchbtn.click();
	}
	public void homeclick()
	{
		home.click();
	}
	public String noproductmessage()
	{
		return noproductmsg.getText();
	}
}
