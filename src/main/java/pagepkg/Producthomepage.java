package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Producthomepage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[1]/a/img")
	WebElement logo;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
	WebElement homeaddtocart1;
	@FindBy(name="giftcard_2.RecipientName")
	WebElement virtualgiftcardRecipientsname;
	@FindBy(name="giftcard_2.RecipientEmail")
	WebElement virtualgiftcardRecipientsemail;
	@FindBy(id="add-to-wishlist-button-2")
	WebElement addwishlist1;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-2\"]")
	WebElement add1;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/span[1]/a/span")
	WebElement homeclick;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
	WebElement homeaddtocart2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[4]/div/div[2]/div[3]/div[2]/input")
	WebElement homeaddtocart3;
	@FindBy(id="product_attribute_72_5_18_65")
	WebElement processor;
	@FindBy(id="product_attribute_72_6_19_91")
	WebElement ram;
	@FindBy(id="product_attribute_72_3_20_58")
	WebElement hdd;
	@FindBy(id="product_attribute_72_8_30_94")
	WebElement software;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-72\"]")
	WebElement add2;
	
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[5]/div/div[2]/div[3]/div[2]/input")
	WebElement homeaddtocart4;
	@FindBy(id="product_attribute_16_5_4")
	WebElement processordropdown;
	@FindBy(id="product_attribute_16_6_5")
	WebElement ramdropdown;
	@FindBy(id="product_attribute_16_3_6_19")
	WebElement HDD4;
	@FindBy(id="product_attribute_16_4_7_21")
	WebElement os4;
	@FindBy(id="product_attribute_16_8_8_23")
	WebElement software4;
	@FindBy(id="add-to-cart-button-16")
	WebElement add4;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[6]/div/div[2]/div[3]/div[2]/input")
	WebElement homeaddtocart5;
	@FindBy(id="product_attribute_74_5_26_82")
	WebElement processor5;
	@FindBy(id="product_attribute_74_6_27_85")
	WebElement ram5;
	@FindBy(id="product_attribute_74_8_29_89")
	WebElement software5;
	@FindBy(id="add-to-cart-button-74")
	WebElement add5;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[7]/div/div[2]/div[3]/div[2]/input")
	WebElement homeaddtocart6;
	@FindBy(id="product_attribute_75_5_31_96")
	WebElement proccesor6;
	@FindBy(id="product_attribute_75_6_32_99")
	WebElement ram6;
	@FindBy(id="product_attribute_75_3_33_103")
	WebElement hdd6;
	@FindBy(id="product_attribute_75_8_35_108")
	WebElement software6;
	@FindBy(id="add-to-cart-button-75")
	WebElement add6;
	
	@FindBy(id="newsletter-email")
	WebElement newsletter;
	@FindBy(id="newsletter-subscribe-button")
	WebElement subscribe;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement logoutt;
	
	public Producthomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement logoverify()
	{
		return logo;
	}
	
	public void firstprdt()
	{
		homeaddtocart1.click();
	}
	public void valueinprdt(String emaill,String passs) 
	{
		virtualgiftcardRecipientsname.clear();
		virtualgiftcardRecipientsname.sendKeys(emaill);
		
		virtualgiftcardRecipientsemail.clear();
		virtualgiftcardRecipientsemail.sendKeys(passs);
	}
	public void wish1click()
	{
		addwishlist1.click();
	}
	public void clickaddtocart()
	{
		add1.click();
	}
	public void backhomepg()
	{
		homeclick.click();
	}
	
	public void secondprdt()
	{
		homeaddtocart2.click();
	}
	
	public void thirdprdt()
	{
		homeaddtocart3.click();
	}
	public void thirdprdtdtl()
	{
		processor.click();
		ram.click();
		hdd.click();
		software.click();
	}
	public void addcart2()
	{
		add2.click();
	}
	
	public void fourthprdt()
	{
		homeaddtocart4.click();
	}
	public  void processdrp()
	{
		Select processr=new Select(processordropdown);
		processr.selectByValue("13");
	}
	public void ramdrp()
	{
		Select ramdrpdn=new Select(ramdropdown);
		ramdrpdn.selectByValue("17");
	}
//	public void selectDropdownByValue(WebElement element, String value) {
//        Select select = new Select(element);
//        select.selectByValue(value);
//    }
	public void fourthprdtdtl()
	{
		HDD4.click();
		os4.click();
		software4.click();
	}
	public void addtocart4()
	{
		add4.click();
	}
	
	
	public void fifthprdt()
	{
		homeaddtocart5.click();
	}
	public void fifthprdtdtl()
	{
		processor5.click();
		ram5.click();
		software5.click();
	}
	public void addtocart5()
	{
		add5.click();
	}
	
	public void sixthprdt()
	{
		homeaddtocart6.click();
	}
	public void sixthprdtdtl()
	{
		proccesor6.click();
		ram6.click();
		software6.click();
	}
	public void addtocart6()
	{
		add6.click();
	}
	
	public void newsletteremail()
	{
		 newsletter.sendKeys("rijinmohans@gmail.com");
	}
	public void sub()
	{
		subscribe.click();
	}
//	public void quit()
//{
//		driver.close();
//}
	public void logoutclick()
	{
		logoutt.click();
	}
}
