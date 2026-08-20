package pagepkg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Apparelproductpage {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")
	WebElement apparelclick;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement apparel1;
	@FindBy(id="add-to-wishlist-button-5")
	WebElement appareladdtowish1;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-5\"]")
	WebElement appareladd1;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[2]/span[1]/a/span")
	WebElement apparelback;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")
	WebElement apparel2;
	@FindBy(xpath="//*[@id=\"product_attribute_28_7_10\"]")
	WebElement size;
	@FindBy(xpath="//*[@id=\"color-squares-11\"]/li[3]/label/span/span")
	WebElement colour;
	@FindBy(id="add-to-wishlist-button-28")
	WebElement apparel2addtowish;
	@FindBy(xpath="//*[@id=\"add-to-cart-button-28\"]")
	WebElement apparel2addtocart;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]")
	WebElement apparel3;
	@FindBy(id="add-to-cart-button-36")
	WebElement appareaddtocartl3;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/h2/a")
	WebElement apparel4;
	@FindBy(id="add-to-cart-button-40")
	WebElement appareaddtocartl4;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[7]")
	WebElement apparel7;
	@FindBy(id="add-to-cart-button-29")
	WebElement appareaddtocartl7;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[4]/ul/li[3]/a")
	WebElement next;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
	WebElement apparel9;
	@FindBy(id="product_attribute_10_7_36")
	WebElement apparel9size;
	@FindBy(id="add-to-wishlist-button-10")
	WebElement apparel9addtowish;
	@FindBy(id="add-to-cart-button-10")
	WebElement apparel9addtocart;
	

	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/h2/a")
	WebElement apparel11;
	@FindBy(id="add-to-cart-button-81")
	WebElement apparel11addtocart;
	
	
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[2]/h2/a")
	WebElement apparel5;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[6]/div/div[2]/h2/a")
	WebElement apparel6;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[8]/div/div[2]/h2/a")
	WebElement apparel8;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/h2/a")
	WebElement apparel10;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[4]/div/div[2]/h2/a")
	WebElement apparel12;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[5]/div/div[2]/h2/a")
	WebElement apparel13;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[1]/ul/li[1]/a")
	WebElement backkhome; 

    public Apparelproductpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver = driver;
        PageFactory.initElements(driver, this);
	}
    
    public void clickapparel()
    {
    	apparelclick.click();
    }
    
    public void prdt1click()
    {
    	apparel1.click();
    }
    public void addtowish1()
    {
    	appareladdtowish1.click();
    }
    public boolean addtocrt1()
    {
    	appareladd1.click();
    	return true;
    }
    public void back()
    {
    	apparelback.click();
    }
//    
    
    public void prdt2click()
    {
    	apparel2.click();
    }
    public void selectDropdownByValue(WebElement strin, String value) {
	     Select sele = new Select(strin);
	     sele.selectByValue(value);
	}
    public WebElement shoesize()
	{
		return size;
	}
    public void colourclick()
    {
    	colour.click();
    }
    public void addtowish2()
    {
    	apparel2addtowish.click();
    }
    public boolean addtocrt2()
    {
    	apparel2addtocart.click();
    	return true;
    }
    
    public void prdt3click()
    {
    	apparel3.click();
    
    }
    public void addtocrt3()
    {
    	appareaddtocartl3.click();
    }

    public void prdt4click()
    {
    	apparel4.click();
    	
    }
    public void addtocrt4()
    {
    	appareaddtocartl4.click();
    }
    
    public void prdt7click()
    {
    	apparel7.click();
  
    }
    public void addtocrt7()
    {
    	appareaddtocartl7.click();
    }
    public void prdt5click()
    {
    	apparel5.click();
    	
    }
    public void prdt6click()
    {
    	apparel6.click();
    	
    }
    public void prdt8click()
    {
    	apparel8.click();
    	
    }
    public void nextslide()
    {
    	next.click();
    	
    }
    
    public void prdt9click()
    {
    	apparel9.click();
    	
    }
    public WebElement shirtrize()
	{
		return apparel9size;
	}
    public void addtowish9()
    {
    	apparel9addtowish.click();
    }
    public boolean addtocrt9()
    {
    	apparel9addtocart.click();
    	return true;
    }
    
    
    public void prdt11click()
    {
    	apparel11.click();
    	
    }
    public void addtocart11()
    {
    	apparel11addtocart.click();
    }
    public void prdt10click()
    {
    	apparel10.click();
    	
    }
    public void prdt12click()
    {
    	apparel12.click();
    	
    }
    public void prdt13click()
    {
    	apparel13.click();
    	
    }
    public void backtohome()
    {
    	backkhome.click();
    }
}
