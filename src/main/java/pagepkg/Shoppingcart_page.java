package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shoppingcart_page {
	WebDriver driver;
	
	@FindBy(id="topcartlink")
	WebElement shoppingcartclick;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[3]/input[1]")
	WebElement applycoupon;
	@FindBy(name="applydiscountcouponcode")
	WebElement applycouponbtn;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[1]/div[4]")
	WebElement errormsg;
	
	@FindBy(name="giftcardcouponcode")
	WebElement addgiftcard;
	@FindBy(name="applygiftcardcouponcode")
	WebElement addgiftcardbtn;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]/div[4]")
	WebElement errormsg1;
	
	@FindBy(id="CountryId")
	WebElement country;
	@FindBy(id="StateProvinceId")
	WebElement state;
	@FindBy(name="estimateshipping")
	WebElement estimateshippingbtn;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input")
	WebElement prdt1;

	@FindBy(name="updatecart")
	WebElement updatecart;
	
	@FindBy(name="continueshopping")
	WebElement continueshopping;
	
	
	@FindBy(id="termsofservice")
	WebElement checkbox;
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	
	
	
	public Shoppingcart_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void shoppingcart()
	{
		shoppingcartclick.click();
	}
	public void scrolltobtm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	
	public void applycouponcode(String cp)
	{
		applycoupon.sendKeys(cp);
	}
	public void applycouponbtnclick()
	{
		applycouponbtn.click();
	}
	public String errormsgincoupon()
	{
		return errormsg.getText();
	}
	
	public void addgiftcardcode(String gc)
	{
		addgiftcard.sendKeys(gc);
	}
	public void addgiftcardclick()
	{
		addgiftcardbtn.click();
	}
	public String errormsgingiftcard()
	{
		return errormsg1.getText();
	}
	
	public void dropdown(WebElement strin, String value)
	{
	 Select sele = new Select(strin);
     sele.selectByValue(value);
	}
	public WebElement countryincart()
	{
		return country;
	}
 
	public WebElement stateincart()
	{
		return state;
	}
	public boolean estimateshippingbtnclick()
	{
		estimateshippingbtn.click();
		return true;
	}
	
	public void scrolltotop()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0);");
	}
	public void scrolltoparticularpix()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 650);");
	}
	public void deleteprdtselect()
	{
		prdt1.click();

	}
	public boolean updateprdtcart()
	{
		updatecart.click();
		return true;
	}
	
	public void checkboxclick()
	{
		checkbox.click();
	}
	public boolean checkoutbtn()
	{
		checkout.click();
		return true;
	}
}
