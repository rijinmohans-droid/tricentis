package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Bookproductspage {
	WebDriver driver;
	
	@FindBy(xpath ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]")
	WebElement books;
	@FindBy(id="products-orderby")
	WebElement sortby;
	@FindBy(xpath="//*[@id=\"products-pagesize\"]")
	WebElement display;
	@FindBy(xpath="//*[@id=\"products-pagesize\"]/option[1]")
	WebElement d1;
	@FindBy(xpath="//*[@id=\"products-pagesize\"]/option[2]")
	WebElement d2;
	@FindBy(xpath="//*[@id=\"products-pagesize\"]/option[3]")
	WebElement d3;
	
	@FindBy(id="products-viewmode")
	WebElement viewby;
	@FindBy(xpath="//*[@id=\"products-viewmode\"]/option[2]")
	WebElement v1;
	@FindBy(xpath="//*[@id=\"products-viewmode\"]/option[1]")
	WebElement v2;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	List<WebElement> addtocartbutton;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/a")
	WebElement homeclick;
	
	public Bookproductspage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void booksclick()
	{
		books.click();
	}
	
	public WebElement sort()
	{
		return sortby;
	}
	public void displyclick()
	{
		display.click();
	}
	public void d1click()
	{
		d1.click();
	}
	public void d2click()
	{
		d2.click();
	}
	public void d3click()
	{
		d3.click();
	}
	
//	public WebElement disply()
//	{
//		return  display;
//	}
	public void viewclick()
	{
		viewby.click();
	}
	public void v1click()
	{
		v1.click();
	}
	public void v2click()
	{
		v2.click();
	}
//	public WebElement view()
//	{
//		return viewby;
//	}
	public void selectDropdownByValue(WebElement strin, String value) {
     Select sel = new Select(strin);
     sel.selectByValue(value);
}
	
	
	public void additem() throws InterruptedException {
		for(WebElement items:addtocartbutton) {
			Thread.sleep(2000);
			System.out.println(items);
			items.click();
		}
	}
	public void home()
	{
		homeclick.click();
	}
	
}
