package common_package;

import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.Assertion;

import pom_package.LoginLocator;

public class BrowserLaunch {
	

    public static WebDriver driver;
	public static Actions actions;
	private static String userCredentials, userPassword;
	public static String filePath = System.getProperty("user.dir");//System.getProperty("user.dir") is a Java system property that retrieves the current working directory of the application or process that is running the Java code. In the context of the code you provided, it's being used to construct file paths relative to the current working directory.
	public static Robot robot ;
	public static WebDriverWait wait;
    public static  Properties properties;
	
	public  BrowserLaunch()
	{
	
        properties = new Properties();
		FileInputStream fileInput = null;
		
		try	{
			
			fileInput = new FileInputStream(System.getProperty("user.dir")+"\\QAOrganisationCredentials\\credentials.properties");
			//fileInput = new FileInputStream(System.getProperty("QAOrganisationCredentialscredentials.properties"));
		}
		catch(FileNotFoundException fileNotFoundExeception) {
			
			fileNotFoundExeception.printStackTrace();
		}
		
		try	{
			
			properties.load(fileInput);
		}
		catch(IOException ioException) {
			
			ioException.printStackTrace();
		}
		
		userCredentials = properties.getProperty("QA11");
		System.out.println("QA11 username :"+userCredentials);
		
		userPassword = properties.getProperty("QA11Password");//property file key value format
		System.out.println("QA11Password :"+userPassword);
		
		
		
		//********************************************* WebDriver Initialization *********************************************
		
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver,chrome.driver","C:\\Users\\APLITE\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  
		 
		   //ChromeOptions options =new ChromeOptions();
		   //options.addArguments("--remote-allow-origins=*");
		  
	
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notifications");
	        
	      
		    driver = new ChromeDriver(options);
		    driver.get("https://login.salesforce.com");
		   	
		    wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		    
			driver.manage().window().maximize();
			actions = new Actions(driver);
			driver.findElement(LoginLocator.userName()).sendKeys(userCredentials);
			driver.findElement(LoginLocator.password()).sendKeys(userPassword);
			driver.findElement(LoginLocator.loginButton()).click();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			
			
			
			
			
			
		//	try {Thread.sleep(14000);}catch(InterruptedException ie) {}
			
			
		//	WebElement iframe = driver.findElement(By.tagName("iframe"));
			
		//	wait.until(ExpectedConditions.visibilityOf(iframe));
		//	
			//if (iframe.isDisplayed()) {
				
				//driver.switchTo().frame();
			//}
			

			
			
				
		     //	try {
				
			//	WebElement web =driver.findElement(By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']//iframe"));
			//    wait.until(ExpectedConditions.visibilityOf(web));
				
			//   if ( web.isDisplayed()) 
			//   {
			///	
			//	   driver.switchTo().frame(web); 
				 
			//   }
				
			    
			    
		//	} catch (Exception e) 
		//	{
		//		System.out.println("Iframe element not found");
		//	}
			
			
			
		
			
			
			
	        WebElement ele  =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']//iframe")));
			
		    if(ele.isDisplayed())
			{
				driver.switchTo().frame(ele);
			
			}
			
			
			//driver.switchTo().frame(driver.findElements(By.tagName("iframe").get(0));
			
			
			
			
	     // 	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
		//=================this line of code for frame try it later
			
				
	}
	
}


