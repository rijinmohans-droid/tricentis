package basepkg;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;
	import com.aventstack.extentreports.reporter.configuration.Theme;

	public class Baseclass {
		public static WebDriver driver;
		public String url="https://demowebshop.tricentis.com/";
		public static ExtentSparkReporter reporter;
		public static ExtentReports extent;
		public static ExtentTest test;
		
		
		@BeforeTest
		public void setUp() {
			reporter = new ExtentSparkReporter(".\\Reports\\webshop.html");
			reporter.config().setDocumentTitle("Automation Report");
			reporter.config().setReportName("Functional Test");
			reporter.config().setTheme(Theme.DARK);
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Hostname", "localhost");
			extent.setSystemInfo("OS", "window11");
			extent.setSystemInfo("Browser Name", "Chrome");
			
			
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			
		}
		@AfterMethod
		public void browserClose(ITestResult result) throws IOException {
			if(result.getStatus()==ITestResult.FAILURE) {
				test.log(Status.FAIL, "test case failed is "+result.getName());
				test.log( Status.FAIL, "test case failed is "+result.getThrowable());
				String screenshotpath= screenshotmethod(driver,result.getName());
				test.addScreenCaptureFromPath(screenshotpath);
			}
			else if(result.getStatus()==ITestResult.SKIP) {
				test.log(Status.SKIP, "test case skipped is" +result.getName());
				
			}
			else if(result.getStatus()==ITestResult.SUCCESS) {
				test.log(Status.PASS, "test case passed is" +result.getName());
				
			}
		}
		public static String screenshotmethod(WebDriver driver, String screenshotname) throws IOException {
			// TODO Auto-generated method stub
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		//	String destination="./Screenshot/"+screenshotname+".jpeg;
			String destination="./Reports/Report/" + screenshotname + ".png";
			
			File dest =new File(destination);
			dest.getParentFile().mkdir();
			
			FileHandler.copy(src,dest);
			
			
			
			return dest.getAbsolutePath();
		}
		
		@AfterTest
		public void teardown() {
			extent.flush();
	
		}

		

	}
	

