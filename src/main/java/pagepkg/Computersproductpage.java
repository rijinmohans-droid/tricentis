package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Computersproductpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	WebElement computer;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]")
	WebElement desktop;
	
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
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement desk1;
	@FindBy(id="add-to-cart-button-72")
	WebElement deskadd1;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[3]/span[1]/a/span")
	WebElement backtodesktop;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
	WebElement desk2;
	@FindBy(id="product_attribute_16_3_6_19")
	WebElement HDD2;
	@FindBy(id="add-to-cart-button-16")
	WebElement deskadd2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
	WebElement desk3;
	@FindBy(id="add-to-cart-button-74")
	WebElement deskadd3;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]")
	WebElement desk4;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]")
	WebElement desk5;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[6]/div/div[2]/div[3]/div[2]/input")
	WebElement desk6;
	@FindBy(id="product_attribute_75_5_31_96")
	WebElement processr6;
	@FindBy(id="add-to-cart-button-75")
	WebElement deskadd6;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]")
	WebElement notebook;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/div[2]/input")
	WebElement laptop;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[3]")
	WebElement accessories;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	List<WebElement> addtocartbutton;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartbutton2;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartbutton3;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartbutton4;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartbutton5;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[6]/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartbutton6;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[7]/div/div[2]/div[3]/div[2]/input")
	WebElement addtocartbutton7;
	
	@FindBy(xpath = "//div[@class='product-item']//img")
	List<WebElement> productImages;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/a")
	WebElement backtohome;
	
	public Computersproductpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}

	public void computerclick()
	{
		computer.click();
	}
	public void desktopclick()
	{
		desktop.click();
	}
	public WebElement sort()
	{
		return sortby;
	}
	public void sortclick()
	{
		sortby.click();
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
	public void selectDropdownByValue(WebElement strin, String value) {
	     Select sele = new Select(strin);
	     sele.selectByValue(value);
	}
	
//	
	public void desktop1()
	{
		desk1.click();
	}
	public void destop1addtocart()
	{
		deskadd1.click();
	}
	public void desktopback()
	{
		backtodesktop.click();
	}
	
	public void desktop2()
	{
		desk2.click();
	}
	public void desktop2HDD()
	{
		HDD2.click();
	}
	public void desktop2addtocart()
	{
		deskadd2.click();
	}
	
	public void desktop3()
	{
		desk3.click();
	}
	public void desktop3addtocart()
	{
		deskadd3.click();
	}
	
	public void desktop4()//
	{
		desk4.click();
	}
	
	public void desktop5()//
	{
		desk5.click();
	}
	
	public void desktop6()
	{
		desk6.click();
	}
	public void desktopprocessor6()
	{
		processr6.click();
	}
	public void desktop6addtocart()
	{
		deskadd6.click();
	}
	
	public void notebookclick()
	{
		notebook.click();
	}
	public void laptopaddtocart()
	{
		laptop.click();
	}
	
	public void accessoriesclick()
	{
		accessories.click();
	}
	public boolean additem() throws InterruptedException {
		for(WebElement items:addtocartbutton) {
			Thread.sleep(2000);
			System.out.println(items);
			items.click();
			addtocartbutton2.click();
			addtocartbutton3.click();
			addtocartbutton4.click();
			addtocartbutton5.click();
			addtocartbutton6.click();
			addtocartbutton7.click();
			
		}
		return true;
		}
	
	public boolean verifyProductImagesPresent() // Returns true if ALL images are valid, false if ANY product shows "NO IMAGE AVAILABLE"
	{
			if (productImages.isEmpty()) {
				return false;
			}

			for (WebElement img : productImages) {
				String imgSrc = img.getAttribute("src");
				
				// Demo Web Shop uses "nopicture" in src for missing images
				if (imgSrc == null || imgSrc.contains("nopicture") || imgSrc.contains("no-image")) {
					return false; // Found a product with "NO IMAGE AVAILABLE"
				}
			}
			return true; // All images are valid real images
		}
	
	public void homeclick()
	{
		backtohome.click();
	}
}
