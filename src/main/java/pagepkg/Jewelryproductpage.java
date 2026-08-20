package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Jewelryproductpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	WebElement jewelry;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")
	WebElement jewelryprdt1;
	@FindBy(id="product_attribute_71_9_15")
	WebElement jewelryprdt1Material;
	@FindBy(id="product_attribute_71_11_17_49")
	WebElement jewelryprdt1Pendent;
	@FindBy(id="add-to-wishlist-button-71")
	WebElement jewelryprdt1Addtowish;
	@FindBy(id="add-to-cart-button-71")
	WebElement jewelryprdt1Addtocart;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[2]/span[1]/a/span")
	WebElement backtojewelry;
	
	@FindBy(xpath="//html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")
	WebElement jewelryprdt2;
	@FindBy(id="add-to-wishlist-button-14")
	WebElement jewelryprdt2Addtowish;
	@FindBy(id="add-to-cart-button-14")
	WebElement jewelryprdt2Addtocart;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/h2/a")
	WebElement jewelryprdt3;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/h2/a")
	WebElement jewelryprdt4;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[2]/h2/a")
	WebElement jewelryprdt5;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/a")
	WebElement home;
	
	
	
	public Jewelryproductpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}

	public void jeweleryclick()
	{
		jewelry.click();
	}
	public void jewlp1()
	{
		jewelryprdt1.click();
	}
  public void selectDropdownByValue(WebElement strin, String value) 
  {
		     Select sele = new Select(strin);
		     sele.selectByValue(value);
		}
	public WebElement jewlp1material()
	{
		return jewelryprdt1Material;
	}
	public void jewlp1pendent()
	{
		jewelryprdt1Pendent.click();
	}
	public void jewlp1addtowish()
	{
		jewelryprdt1Addtowish.click();
	}
	public boolean jewlp1addtocart()
	{
		jewelryprdt1Addtocart.click();
		return true;
	}
	
	public void jewelrybackpage()//
	{
		backtojewelry.click();
	}
	
	public void jewlp2()
	{
		jewelryprdt2.click();
	}
	public void jewlp2addtowish()
	{
		jewelryprdt2Addtowish.click();
	}
	public boolean jewlp2addtocart()
	{
		jewelryprdt2Addtocart.click();
		return true;
	}
	
	public void jewlp3()
	{
		jewelryprdt3.click();
	}
	
	public void jewlp4()
	{
		jewelryprdt4.click();
	}
	
	public void jewlp5()
	{
		jewelryprdt5.click();
	}
	public void backtohome()
	{
		home.click();
	}
	
}
