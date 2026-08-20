package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutdetailsPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"topcartlink\"]/a")
	WebElement shopcartt;
	@FindBy(id="CountryId")
	WebElement CountryId;
	@FindBy(id="StateProvinceId")
	WebElement StateProvinceId;
	@FindBy(id="termsofservice")
	WebElement termsofservice;
	@FindBy(id="checkout")
	WebElement checkout;
	
	
	@FindBy(id="billing-address-select")
	WebElement billingadd;
	@FindBy(xpath="//*[@id=\"billing-buttons-container\"]/input")
	WebElement continuebtn;
	
	@FindBy(id="shipping-address-select")
	WebElement shippingaddress;
	@FindBy(xpath="//*[@id=\"shipping-buttons-container\"]/input")
	WebElement continuebtn2;
	
	@FindBy(id="shippingoption_0")
	WebElement shippingmethod;
	@FindBy(id="shippingoption_1")
	WebElement shippingmethod2;
	@FindBy(id="shippingoption_2")
	WebElement shippingmethod3;
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement continuebtn3;
	
	@FindBy(id="paymentmethod_0")
	WebElement paymentmethod1COD;
	@FindBy(id="paymentmethod_1")
	WebElement paymentmethod2MONEYORDER;
	@FindBy(id="paymentmethod_2")
	WebElement paymentmethod3CREDIT;
	@FindBy(id="paymentmethod_3")
	WebElement paymentmethod4PURCHASEORDER;
	@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement continuebtn4;
	
	@FindBy(xpath="//*[@id=\"checkout-payment-info-load\"]/div/div/div[1]/table/tbody/tr/td/p")
	WebElement paymentinformation;
	@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement continuebtn5;
	
	
	@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/input")//
	WebElement Confirmcontinuebtn;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")
	WebElement ordersuccessfullmsg;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[2]/a")
	WebElement orderdetails;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[1]/a[2]")
	WebElement pdfinvoice;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[3]/div[2]/input")
	WebElement reorder;//https://demowebshop.tricentis.com/cart
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	WebElement ordersuccesscontinuebtn;
	
	
	public CheckoutdetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void cartclick()
	{
		shopcartt.click();
	}
	public WebElement countryids()
	{
		return CountryId;
	}
	public WebElement StateProvinceIds()
	{
		return StateProvinceId;
	}
	
	public void checkbox()
	{
		termsofservice.click();
	}
	public boolean checkout()
	{
		checkout.click();
		return true;
	}
	
	public WebElement billingaddd()
	{
		return billingadd;
	}
	public boolean billingaddcontinuebtn()
	{
		continuebtn.click();
		return true;
	}
	
	public WebElement shippingaddresss()
	{
		return shippingaddress;
	}
	public boolean shippingaddressscontinuebtn()
	{
		continuebtn2.click();
		return true;
	}
	
	public void shippingmethodclick()
	{
		shippingmethod.click();
	}
	public boolean continuebtn3click()
	{
		continuebtn3.click();
		return true;
	}
	
	public void codpayment()
	{
		paymentmethod1COD.click();
	}
	public boolean continuebtn4click()
	{
		continuebtn4.click();
		return true;
	}
	
	public String paymentinfo()
	{
		return paymentinformation.getText();
	}
	public boolean continuebtn5click()
	{
		continuebtn5.click();
		return true;
	}
	
	public void scrolltobtm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}
	public boolean Confirmcontinuebtnclick()
	{
		Confirmcontinuebtn.click();
		return true;
	}
	
	
	public String ordersuccess()
	{
		return ordersuccessfullmsg.getText();
	}
	
	public boolean orderdetailsclick()
	{
		orderdetails.click();
		return true;
	}
	public boolean pdfdwnld()
	{
		pdfinvoice.click();
		return true;
	}
	
	public void reordering()
	{
		reorder.click();
	}
	public void back()
	{
		driver.navigate().back();
	}
	
	public boolean ordersuccfullycompleted()
	{
		ordersuccesscontinuebtn.click();
		return true;
	}
	
	
	
	public void dropdown(WebElement strin, String value)
	{
	 Select sele = new Select(strin);
     sele.selectByValue(value);
	}
}
