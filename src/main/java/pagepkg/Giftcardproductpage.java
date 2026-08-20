package pagepkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Giftcardproductpage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")
	WebElement giftcard;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement gift1;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
	WebElement gift2;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
	WebElement gift3;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/div[3]/div[2]/input")
	WebElement gift4;
	
	@FindBy(id="giftcard_1_RecipientName")
	WebElement recipientsname;
	@FindBy(id="giftcard_1_RecipientEmail")
	WebElement recipientsemail;
	@FindBy(id="add-to-wishlist-button-1")
	WebElement addtowishlist;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-1\"]")
	WebElement insideaddtocart;
	
	
	@FindBy(id="giftcard_2_RecipientName")
	WebElement recipientsname2;
	@FindBy(id="giftcard_2_RecipientEmail")
	WebElement recipientsemail2;
	@FindBy(id="add-to-wishlist-button-2")
	WebElement addtowishlist2;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-2\"]")
	WebElement insideaddtocart2;
	
	
	@FindBy(id="giftcard_3_RecipientName")
	WebElement recipientsname3;
	@FindBy(id="giftcard_3_Message")
	WebElement message3;
	@FindBy(id="add-to-wishlist-button-3")
	WebElement addtowishlist3;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-3\"]")
	WebElement insideaddtocart3;
	
	
	@FindBy(id="giftcard_4_RecipientName")
	WebElement recipientsname4;
	@FindBy(id="giftcard_4_Message")
	WebElement message4;
	@FindBy(id="add-to-wishlist-button-4")
	WebElement addtowishlist4;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-4\"]")
	WebElement insideaddtocart4;
	
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[2]/span[1]")
	WebElement backtogiftcard;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/a")
	WebElement backtohome;
	
	public Giftcardproductpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}

	public void  giftcardclick()
	{
		giftcard.click();
	}
	public void addwish()
	{
		addtowishlist.click();
	}
	
	public void addwish2()
	{
		addtowishlist2.click();
	}  
	
	public void addwish3()
	{
		addtowishlist3.click();
	}   
	
	public void addwish4()
	{
		addtowishlist4.click();
	}
	
	public boolean additem1() {
		
		gift1.click();
		return true;
	}
	
	public boolean additem2() {
		
		gift2.click();
		return true;
	}
	
public boolean additem3() {
		
		gift3.click();
		return true;
	}

public boolean additem4() {
	
	gift4.click();
	return true;
}

	public void recipient(String name,String email)
	{
		recipientsname.clear();
		recipientsname.sendKeys(name);
		recipientsemail.clear();
		recipientsemail.sendKeys(email);
	}
	
	public void recipient2(String name,String email)
	{
		recipientsname2.clear();
		recipientsname2.sendKeys(name);
		recipientsemail2.clear();
		recipientsemail2.sendKeys(email);
	}
	
	public void recipient3(String name,String msg)
	{
		recipientsname3.clear();
		recipientsname3.sendKeys(name);
		message3.clear();
		message3.sendKeys(msg);
		
	}
	
	public void recipient4(String name,String msg)
	{
		recipientsname4.clear();
		recipientsname4.sendKeys(name);
		message4.clear();
		message4.sendKeys(msg);
		
	}
	
	
	public boolean clickinaddtocart()
	{
		insideaddtocart.click();
		return true;
	}
	
	public boolean clickinaddtocart2()
	{
		insideaddtocart2.click();
		return true;
	}
	
	public boolean clickinaddtocart3()
	{
		insideaddtocart3.click();
		return true;
	}
	
	public boolean clickinaddtocart4()
	{
		insideaddtocart4.click();
		return true;
	}
	
	
	
	public void clickbacktogift()
	{
		backtogiftcard.click();
	}
	
	public void clickbacktohome()
	{
		backtohome.click();
	}
}
