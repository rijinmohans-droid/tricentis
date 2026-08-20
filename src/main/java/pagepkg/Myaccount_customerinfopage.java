package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Myaccount_customerinfopage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement gmailaccountclick;
	
	@FindBy(id="gender-male")
	WebElement gendermale;
	@FindBy(id="gender-female")
	WebElement genderfemale;
	@FindBy(id="FirstName")
	WebElement FirstName;
	@FindBy(id="LastName")
	WebElement LastName;
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(name="save-info-button")
	WebElement savebtn;
	
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[2]/a")
	WebElement addressclick;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement edit;
	
	@FindBy(id="Address_FirstName")
	WebElement editaddressFirstName;
	@FindBy(id="Address_LastName")
	WebElement editaddressLastName;
	@FindBy(id="Address_Email")
	WebElement editaddressEmail;
	@FindBy(id="Address_Company")
	WebElement editaddressCompany;
	
	@FindBy(id="Address_CountryId")
	WebElement editaddressCountryId;
	@FindBy(id="Address_StateProvinceId")
	WebElement editaddressState;
	
	@FindBy(id="Address_City")
	WebElement editaddressCity;
	@FindBy(id="Address_Address1")
	WebElement editaddressAddress1;
	@FindBy(id="Address_Address2")
	WebElement editaddressAddress2;
	@FindBy(id="Address_ZipPostalCode")
	WebElement editaddressZipPostalCode;
	@FindBy(id="Address_PhoneNumber")
	WebElement editaddressPhoneNumber;
	@FindBy(id="Address_FaxNumber")
	WebElement editaddressFaxNumber;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/input")
	WebElement editaddresssave;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")
	WebElement addnewaddress; 
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[2]/input[2]")
	WebElement delete;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[3]/a")
	WebElement orders;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div/div/div[2]/input")
	WebElement detail;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[4]/a")
	WebElement downloadableprdt; 
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[5]/a")
	WebElement backinstocksub; 
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[6]/a")
	WebElement rewardpoint; 	
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[7]/a")
	WebElement changepass; 
	@FindBy(id="OldPassword")
	WebElement oldpass;
	@FindBy(id="NewPassword")
	WebElement newpass;
	@FindBy(id="ConfirmNewPassword")
	WebElement confirmpass;
	@FindBy(xpath = "//input[@value='Change password']")
	WebElement changesavepassword;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[3]/div/div[2]/span[2]/span")
	WebElement errorpaassnotification;
	
	
	
	public Myaccount_customerinfopage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	public void gmailmyaccountclick()
	{
		gmailaccountclick.click();
	}
	public void gender()
	{
		gendermale.click();
	}
	public void nameandemailfield(String fname,String lname,String email)
	{
		FirstName.clear();
		FirstName.sendKeys(fname);
		LastName.clear();
		LastName.sendKeys(lname);
		Email.clear();
		Email.sendKeys(email);
	}
	public boolean savechanges()
	{
		savebtn.click();
		return true;
	}
	
	public void addressclicking()
	{
		addressclick.click();
	}
	public void editclick()
	{
		edit.click();
	}
	public void addressfields(String finame,String laname,String addemail,String cmpny,String city,String Address1,String Address2,String postal,String pnumber,String faxnumber)
	{
		editaddressFirstName.clear();
		editaddressFirstName.sendKeys(finame);//
		editaddressLastName.clear();
		editaddressLastName.sendKeys(laname);
		editaddressEmail.clear();
		editaddressEmail.sendKeys(addemail);
		editaddressCompany.clear();
		editaddressCompany.sendKeys(cmpny);
		editaddressCity.clear();
		editaddressCity.sendKeys(city);
		editaddressAddress1.clear();
		editaddressAddress1.sendKeys(Address1);
		editaddressAddress2.clear();
		editaddressAddress2.sendKeys(Address2);
		editaddressZipPostalCode.clear();
		editaddressZipPostalCode.sendKeys(postal);
		editaddressPhoneNumber.clear();
		editaddressPhoneNumber.sendKeys(pnumber);
		editaddressFaxNumber.clear();
		editaddressFaxNumber.sendKeys(faxnumber);
		
		
		
	}
	public void dropdown(WebElement strin, String value)
	{
	 Select sele = new Select(strin);
     sele.selectByValue(value);
	}
	 public WebElement addresscountry()
		{
			return editaddressCountryId;
		}
	 
	 public WebElement addressstate()
		{
			return editaddressState;
		}
	
	 
	public boolean addresssaveing()
	{
		editaddresssave.click();
		return true;
	}
	public void newaddrs()
	{
		addnewaddress.click();
	}
	public boolean deleteaddress()
	{
		delete.click();
		return true;
	}
	public void orderss()
	{
		orders.click();
	}
	public void detailsclick()//
	{
		detail.click();
	}
	public void downldprdt()
	{
		downloadableprdt.click();
	}
	public void backstock()
	{
		backinstocksub.click();
	}
	public void rewardpnt()
	{
		rewardpoint.click();
	}
	public void changepassword()
	{
		changepass.click();
	}
	public void passwordfields(String old,String newp,String conf)
	{
		oldpass.clear();
		oldpass.sendKeys(old);
		newpass.clear();
		newpass.sendKeys(newp);
		confirmpass.clear();
		confirmpass.sendKeys(conf);
	}
	public boolean savechangepass()
	{
		changesavepassword.click();
		return true;
	}
	
	public String errormsg()
	{
		return errorpaassnotification.getText();
		
	}
}

