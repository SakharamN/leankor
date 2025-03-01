package common_package;

import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom_package.LoginLocator;

public class BrowserLaunch {

	public static WebDriver driver;
	public static Actions actions;
	private static String userCredentials, userPassword;
	public static String filePath = System.getProperty("user.dir");
	public static Robot robot;
	public static WebDriverWait wait;
	public static Properties properties;

	public BrowserLaunch() {

		properties = new Properties();
		FileInputStream fileInput = null;

		try {

			fileInput = new FileInputStream(
					System.getProperty("user.dir") + "\\QAOrganisationCredentials\\credentials.properties");

		} catch (FileNotFoundException fileNotFoundExeception) {

			fileNotFoundExeception.printStackTrace();
		}

		try {

			properties.load(fileInput);
		} catch (IOException ioException) {

			ioException.printStackTrace();
		}

		userCredentials = properties.getProperty("QA9");
		System.out.println("QA9 username :" + userCredentials);

		userPassword = properties.getProperty("QA9Password");
		System.out.println("QA9Password :" + userPassword);

		// ********************************************* WebDriver Initialization
		// *********************************************

		// WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver,chrome.driver","C:\\Users\\APLITE\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		String salesforceUrl = properties.getProperty("salesforceUrl");

		driver = new ChromeDriver(options);
		driver.get(salesforceUrl);

		wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		driver.manage().window().maximize();
		actions = new Actions(driver);
		driver.findElement(LoginLocator.userName()).sendKeys(userCredentials);
		driver.findElement(LoginLocator.password()).sendKeys(userPassword);
		driver.findElement(LoginLocator.loginButton()).click();

		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']//iframe")));

		if (ele.isDisplayed()) {

			driver.switchTo().frame(ele);

		}

	}

}
