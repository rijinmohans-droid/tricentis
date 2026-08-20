package pagepkg;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllLinks {
WebDriver driver;
@FindBy(tagName = "a")
public List<WebElement> allLinks1;

	    // Initialize elements using PageFactory
public AllLinks(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	    // Method to validate and print links
public void validateAllLinks() {
	        System.out.println("Total links found: " + allLinks1.size());

	        for (WebElement link : allLinks1) {
	            String text = link.getText().trim();
	            String url = link.getAttribute("href");

	            // Simple validation check for href attribute
	            if (url != null && !url.isEmpty() && !url.equals("#")) {
	                System.out.println("VALID -> Text: [" + text + "] | URL: " + url);
	            } else {
	                System.out.println("INVALID/EMPTY -> Text: [" + text + "] | URL: " + url);
	            }
	        }
	    }

public boolean certainlink()
{
         // 1. Open the URL
         driver.get("https://demowebshop.tricentis.com/");

         // 2. Initialize Page Object & Run validation
         AllLinks homePage = new AllLinks(driver);
         homePage.validateAllLinks();
		 return true;

     
}
public void clickquit()
{
	driver.quit();
}
}
