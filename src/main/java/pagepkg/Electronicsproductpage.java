package pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Electronicsproductpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")
	WebElement electronics;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]")
	WebElement camera;
	@FindBy(xpath="//input[@value='Add to cart']")
	List<WebElement> addtocartbutton;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[2]/a")
	WebElement backtoelectronics;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]")
	WebElement cellphones;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement smartphoneaddtocartbutton;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]")
	WebElement usedphones;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[3]/span[1]/a/span")
	WebElement backtocellphones;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[2]/div[2]/input")
	WebElement phonecover;
	@FindBy(id="product_attribute_80_2_37")
	WebElement manufacturer;
	@FindBy(id="product_attribute_80_1_38")
	WebElement colour;
	@FindBy(id="add-to-wishlist-button-80")
	WebElement addtowish;
	@FindBy(id="add-to-cart-button-80")
	WebElement caddtocart;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/span[1]/a/span")
	WebElement backhome;
	
	
	
	public Electronicsproductpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver , this);
	}
	public void electronicsclick()
	{
		electronics.click();
	}
	public void cameraclick()
	{
		camera.click();
	}

	public boolean isAddToCartButtonDisplayed() {
        if (!addtocartbutton.isEmpty()) {
            return addtocartbutton.get(0).isDisplayed();
        }
        return false;
    }
	public void back()
	{
		backtoelectronics.click();
	}
	
	public void cellphoneclick()
	{
		cellphones.click();
	}
	
	public boolean smartphonetocart()
	{
		smartphoneaddtocartbutton.click();
		return true;
	}
	
	public void usedphoneclick()
	{
	usedphones.click();
	}
	public void backcellph()
	{
		backtocellphones.click();
	}
	public void phonecoverclick()
	{
		phonecover.click();
	}
	public void selectDropdownByValue(WebElement strin, String value) {
	     Select sele = new Select(strin);
	     sele.selectByValue(value);
	}
	public WebElement manuf()
	{
		return manufacturer;
	}
	public WebElement col()
	{
		return colour;
	}
	public void addtowishlisttt()
	{
		addtowish.click();
	}
	public boolean tothecart()
	{
		caddtocart.click();
		return true;
	}
	public void HOme()
	{
		backhome.click();
	}
}
