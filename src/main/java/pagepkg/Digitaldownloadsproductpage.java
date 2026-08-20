package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Digitaldownloadsproductpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")
	WebElement digitaldownloadclick;
	@FindBy(xpath = "//input[@value='Add to cart']")
	public List<WebElement> cartbutton;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[2]/span[1]/a/span")
	WebElement backtodigitaldownloads;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/a")
	WebElement backhOme;
	
	public Digitaldownloadsproductpage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	public void digitalclick()
	{
		digitaldownloadclick.click();
	}
	public void additem() throws InterruptedException {
		for(WebElement items:cartbutton) {
			Thread.sleep(2000);
			System.out.println(items);
			items.click();

		}
	}
	public void backtohome()
	{
		backhOme.click();
	}
}
