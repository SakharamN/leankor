package common_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethodsOfWebDriver extends BrowserLaunch {

	public static WebElement webElement;

	public static ArrayList<String> tabs;

	public static String generateRandomString(int length) {
		return RandomStringUtils.randomAlphabetic(length);
	}

	public static Integer generateRandomIntergerValue(int uptoWhatNumber) {
		Random random = new Random();
		int number = random.nextInt(uptoWhatNumber) + 1;
		System.out.print(number + " ");

		return number;
	}

	public static void switchToiFrame(String iFrameAttributeValue) {
		driver.switchTo().frame(iFrameAttributeValue);
	}

	public static void switchToiFrame(WebElement webElement2) {
		driver.switchTo().frame(webElement2);
	}

	public static Navigation openNewBrowserWindowTab(String url) {
		JavascriptExecutor jsExe = (JavascriptExecutor) driver;
		jsExe.executeScript("window.open()");
		tabs = new ArrayList<>(driver.getWindowHandles());
		for (String s : tabs) {
			driver.switchTo().window(s);
		}
		driver.get(url);
		return driver.navigate();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static WebElement findElement(By obj) {
		return driver.findElement(obj);
	}

	public static List<WebElement> findElements(By obj) {
		return driver.findElements(obj);
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void performRandomClickOnWebPage() {
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
		}
		robot.mouseMove(100, 80);
		actions.click().build().perform();
	}

	public static WebDriverWait explicitWaitElementBy(String s, By objBy) {
		switch (s) {
		case "presenceOfElementLocated":
			wait.until(ExpectedConditions.presenceOfElementLocated(objBy));
			break;

		case "elementToBeLocated":
			wait.until(ExpectedConditions.visibilityOfElementLocated(objBy));
			break;
		case "elementToBeLocatedByWebElement":
			wait.until(ExpectedConditions.visibilityOf(findElement(objBy)));
			break;

		case "elementToSelectedByLocator":
			wait.until(ExpectedConditions.elementToBeSelected(objBy));
			break;

		case "elementToBeSelectedByWebElement":
			wait.until(ExpectedConditions.elementToBeSelected(findElement(objBy)));
			break;

		case "elementToBeClickableByLocator":
			wait.until(ExpectedConditions.elementToBeClickable(objBy));
			break;

		case "elementToBeClickableByWebElement":
			wait.until(ExpectedConditions.elementToBeClickable(findElement(objBy)));
			break;

		case "invisibilityOfElementLocated":
			wait.until(ExpectedConditions.invisibilityOfElementLocated(objBy));
			break;

		case "invisibilityOfElementWithText":
			wait.until(ExpectedConditions.invisibilityOfElementWithText(objBy,
					"elementWithThisParticularTextIsNotVisibleOnCurrentPageDOM"));
			break;

		default:
			System.out.println("please enter valid expected condition for inspect element");
		}
		return wait;
	}

	public static WebDriverWait explicitWaitElementToBeClickable(WebElement web) {
		wait.until(ExpectedConditions.elementToBeClickable(web));
		return wait;
	}

	public static WebDriverWait explicitWaitVisibilityOf(WebElement web) {
		wait.until(ExpectedConditions.visibilityOf(web));
		return wait;
	}

	public static WebDriverWait explicitWaitElementToBeLocated(By obj) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(obj));
		return wait;
	}

	public static WebDriverWait explicitWaitElementToBeVisibleAllListItems(List<WebElement> web) {
		wait.until(ExpectedConditions.visibilityOfAllElements(web));

		// wait.until(ExpectedConditions.visibilityOfAllElements(web));
		return wait;
	}

	public static Select selectValueFromDropdown(WebElement web, String text, String value) {
		Select options = new Select(web);

		switch (text) {
		case "index":
			options.selectByIndex(Integer.parseInt(value));
			break;

		case "value":
			options.selectByValue(value);
			break;

		case "visibleText":
			options.selectByVisibleText(value);
			break;

		default:
			System.out.println("please enter valid element selector value for Select");

		}
		return options;
	}

	public static Navigation navigat1(String s) {
		switch (s) {
		case "back":
			driver.getCurrentUrl();
			driver.navigate().back();
			break;

		case "forward":
			driver.getCurrentUrl();
			driver.navigate().forward();
			break;

		case "refresh":
			driver.getCurrentUrl();
			driver.navigate().refresh();
			break;

		default:
			driver.navigate().to(s);
		}
		return driver.navigate();
	}

	public static void scrollinToView(WebElement webElement) // method with parameter but without a return value
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", webElement);

	}

	public static JavascriptExecutor jsExecutorClickOnElement(WebElement webElement) // method with parameter and with
																						// return value
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", webElement);
		return jse;
	}

	public static JavascriptExecutor jsexce(WebElement webElement) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", webElement);
		return jse;
	}

	public static JavascriptExecutor scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(160,400)", "");
		return jse;
	}

	public static JavascriptExecutor scrollUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-250)", "");
		return jse;
	}

	public boolean handleStaleElementExceptionForClickOnElement(By byObj) {
		boolean result = false;
		int attempts = 0;

		while (attempts < 2) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
				wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
				findElement(byObj).click();
				result = true;
				break;
			} catch (StaleElementReferenceException staleElementException) {
				staleElementException.printStackTrace();
				attempts++;
			}
			System.out.print("number of attempts :" + attempts);
		}
		return result;
	}

	public static WebDriverWait WebDriverWait(WebDriver driver, Duration ofSeconds) {

		return null;
	}

	public boolean handleElementClickInterceptedExpectionWhileClickOnElement(By byObj) {
		boolean result = false;
		int count = 1;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		while (count <= 3) {
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
				findElement(byObj).click();
				result = true;
				break;
			} catch (ElementClickInterceptedException elementClickInterExcep) {
				elementClickInterExcep.printStackTrace();
				count++;
			}
		}
		System.out.println("Number of Iteration in which exception is handled :" + count + " and result is :" + result);
		return result;// finally it return the result variable indicating weather click operation was
						// successfulr tru or not false
	}

	public boolean handleExceptions(String exceptionType, By byObj) {
		boolean result = false;
		int count = 0;

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

		while (count < 5) {
			switch (exceptionType) {
			case "NoSuchFrameException":

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
					driver.switchTo().frame(findElement(byObj));
					result = true;
					break;
				} catch (NoSuchFrameException noSuchFrameException) {
					noSuchFrameException.printStackTrace();
					count++;
				}
				break;

			case "ElementClickInterceptedException":

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
					findElement(byObj).click();
					result = true;
					break;
				} catch (ElementClickInterceptedException elementClickInterExcep) {
					elementClickInterExcep.printStackTrace();
					count++;
				}
				break;

			case "StaleElementReferenceException":

				try {
					wait.until(ExpectedConditions.visibilityOfElementLocated(byObj));
					findElement(byObj).click();
					result = true;
					break;
				} catch (StaleElementReferenceException staleElementException) {
					staleElementException.printStackTrace();
					count++;
				}
				break;

			default:
				System.out.println("Please handle appropriate exception type.");
			}
		}

		System.out.println("Number of Iteration in which expection is handled " + count + " and result is " + result);
		return result;
	}

	public boolean isEnabled(By obj) {
		return driver.findElement(obj).isEnabled();
	}

	public boolean isDisplayed(By obj) {
		return driver.findElement(obj).isDisplayed();
	}

	public boolean isSelected(By obj) {
		return driver.findElement(obj).isSelected();
	}

	public String gettitle() // method with without parameter and with return value
	{
		String title = driver.getTitle();
		return title;
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	/*
	 * public static void scrollinToView(WebElement webElement) // method with
	 * parameter but without a return value { JavascriptExecutor jse =
	 * (JavascriptExecutor)driver;
	 * jse.executeScript("arguments[0].scrollIntoView()", webElement);
	 * 
	 * }
	 * 
	 * 
	 * public static JavascriptExecutor jsExecutorClickOnElement(WebElement
	 * webElement) //method with parameter and with return value {
	 * JavascriptExecutor jse = (JavascriptExecutor)driver;
	 * jse.executeScript("arguments[0].click();", webElement); return jse; }
	 * 
	 * public String gettitle() //method without parameter and with return value {
	 * String title = driver.getTitle(); return title; }
	 * 
	 * public static void refresh()// method without parameter and without return
	 * value { driver.navigate().refresh(); }
	 */

}