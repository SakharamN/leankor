package helper_package;

import java.awt.Point;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
/*import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;*/
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateCardLocators;
import pom_package.CreateKanbanCardsOnDifferentMasterContainerLocators;
import pom_package.KanbanBoardRegressionLocators;

public class CreateKanbanCardsOnDifferentMasterContainersHelper extends CommonMethodsOfWebDriver {
	
	/*public CreateKanbanCardsOnDifferentMasterContainersHelper(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/


	public static String createFolderNameRandomly;
	public static String kanbanBoardCurrentBrowserWindowHandleValue;
	public static String createProjectNameRandomly;
	public static int cardLimit;
	final int divisor = 5;
	
	
 public void create_KanbanBoard() throws InterruptedException
	{
		try {Thread.sleep(14000);}catch(InterruptedException ie) {}
		
		
		WebElement ele  =wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']//iframe")));
		
			if(ele.isDisplayed())
			{
				driver.switchTo().frame(ele);
				
			}
		
		
		
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnFolderIcon()).click();
		explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterFolderName()));
		createFolderNameRandomly = generateRandomString(6);
		System.out.println("Folder Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 28 ::"+createFolderNameRandomly);
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterFolderName()).sendKeys("A "+createFolderNameRandomly);
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddButton()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddButton()).click(); 
				
		
		/*implement new line form here
		Point folderNameLocation = findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")).getLocation();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		jse.executeScript("window.scrollBy(0,"+(folderNameLocation.getY())+");");	//till here
		*/		
		
	/*	org.openqa.selenium.Point folderNameLocation =  findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")).getLocation();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		jse.executeScript("window.scrollBy(0,"+(folderNameLocation.getY())+");");*/
		
	
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		scrollinToView(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnThreeDots()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnThreeDots()).click();
		
		createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 51 ::"+createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddProject()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddProject()).click();
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterProjectName()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterProjectName()).sendKeys(createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectAddButton()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectAddButton()).click();
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreatedProject()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreatedProject()).click();
		
		
		
		/*explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnSkipButtonWhenOpenCreatedProject()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnSkipButtonWhenOpenCreatedProject()).click();*/
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		//explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectBoardThreeDots()));
		explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectBoardThreeDots()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectBoardThreeDots()).click();		
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateKanbanBoardButton()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateKanbanBoardButton()).click();		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterKanbanBoardNameInputArea()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterKanbanBoardNameInputArea()).sendKeys("Kanban Board1");		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddKanbanBoardButton()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddKanbanBoardButton()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.openKanbanBoard()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.openKanbanBoard()).click();
		
		switchToiFrame("boardIfram");
		
		/*explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnSkipButtonWhenOpenCreatedProject()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnSkipButtonWhenOpenCreatedProject()).click();*/
		
		
		/*kanbanBoardCurrentBrowserWindowHandleValue = driver.getWindowHandle();
		System.out.println("kanbanBoard browser window handle value :- "+kanbanBoardCurrentBrowserWindowHandleValue);*/
	}
	
	
	public void create_KanbanCard()
	{
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOn_KanbanBoardZoomIcon()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOn_KanbanBoardZoomIcon()).click();
		
		for(String browserWindowsValue : driver.getWindowHandles())
		{
			driver.switchTo().window(browserWindowsValue);
		}
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
				
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter limit of card : ");
		cardLimit = sc.nextInt(); //The sc.nextInt() method reads an integer value entered by the user from the standard input and assigns it to the cardLimit variable.
		
		
		
	/*
		//following code for creating single card and Creating the new Category
		
		explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnNewToAddCardToBoard()));
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnNewToAddCardToBoard()).click();
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=4; i++) {
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.ClickonCreateButtonforCreatingNewCategory()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.ClickonCreateButtonforCreatingNewCategory()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		

			
	
		explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.CategoryNameInputfield()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.CategoryNameInputfield()).sendKeys("Category"+i);
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.CategoryColourDropdown()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.CategoryColourDropdown()).click();
		
		int sizeofallColorPicker =findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.ColourPickerlist()).size();
		System.out.println("All color picker :"+sizeofallColorPicker);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//actions.moveToElement(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.SelectSafronColourfromPicklist())).contextClick().build().perform();
		
		if(i==1)
		{
		explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.SelectSafronColourfromPicklist());		
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.SelectSafronColourfromPicklist()).click();
		}
		
		if(i==2)
		{
		explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.selectRedColourfrompicklist());		
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectRedColourfrompicklist()).click();
		}
		
		if(i==3)
		{
		explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.selctgreenColourfrompicklist());		
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selctgreenColourfrompicklist()).click();
		}
		
		
		if(i==4)
		{
		explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.selectyellowcolourfrompicklist());		
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectyellowcolourfrompicklist()).click();
		}
		
		
		
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.ClickonCategorySaveButton()));
		//findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.ClickonCategorySaveButton()).click();
		
		handleElementClickInterceptedExpectionWhileClickOnElement(CreateKanbanCardsOnDifferentMasterContainerLocators.ClickonCategorySaveButton());
		
		}
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
			
		
		//handleExceptions(, findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueHr()));
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueCategory1()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueCategory1()).click();
		explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId());
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId()).sendKeys("01");
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardTitle()).sendKeys("Card1");
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardDescription()).sendKeys("Description for creating the single card");
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardAcceptanceCriteria()).sendKeys("Acceptance criteria for creating single card");
		scrollinToView(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()).click();
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDown()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDown()).click();
		
		//findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).clear();
		//findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("5");
		
		
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("5");
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()).click();
		
	
		//int allCatnames =findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.Allcategorynames()).size();
		//System.out.println("All category size are :"+allCatnames);
		
	//	for(int i=0; i<=allCatnames.size(); i++)
		//{
		//	System.out.println(allCatnames.get(i).getText());
		//}
		
		
		
		
		
		
		
		
		
		
	*/
		
		
		System.out.print("Cards creating on backlog master container\n");
	
		// card create in Backlog master container with HR
		for(int i=1; i<=cardLimit; i++)
		{
			explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnNewToAddCardToBoard()));
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnNewToAddCardToBoard()).click();
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//handleExceptions(, findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueHr()));
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueHr()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueHr()).click();
					
			explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId()).sendKeys("HR"+i);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardTitle()).sendKeys("Human Resource Department"+i);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardDescription()).sendKeys("Human resources is used to describe both the people who work for a company or organization and the department responsible for managing resources related to employees.");
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardAcceptanceCriteria()).sendKeys("Some companies have strict criteria from the kind of B Schools they hire Human Resource Managers. They don't go beyond those colleges for the hiring.");
			scrollinToView(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDown()).click();
			
			//findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).clear();
			//findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("5");
			
			
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("5");
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()).click();
			System.out.print(i+" ");
			
		
			
		}
		
		
		System.out.println("\nCard creation on Backlog master container ends");
		
		// card create in inprogress master container with FINANCE
		System.out.print("Now cards create on in progress master container\n");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddToBoardFan()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddToBoardFan()).click();
		for(int j=1; j<=cardLimit; j++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.inprogressMasterContainer()));
			WebElement destinationLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.inprogressMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 321, 385).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueFinance()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueFinance()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId()).sendKeys("Finance"+j);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardTitle()).sendKeys("Finance Department"+j);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardDescription()).sendKeys("Financial manager: job description. AddThis Sharing Buttons. Financial managers work within the public and private sector where they are responsible for providing financial advice and undertaking related accounts administration. Financial managers are also known as financial or business analysts.");
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardAcceptanceCriteria()).sendKeys("Microsoft Press defines Acceptance Criteria as �Conditions that a software product must satisfy to be accepted by a user, customer or other stakeholder.� ... These criteria define the boundaries and parameters of a User Story/feature and determine when a story is completed and working as expected.");
			scrollinToView(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDownMedium()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDownMedium()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).clear();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("10");
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()).click();
			System.out.print(j+" ");
		}
		System.out.println("\nCard creation on inprogress master container ends");
	
		
		//Card create in Review and Approve master container with MARKETING
		System.out.print("Now card creates on review and approve master container\n");
		for(int k=1; k<=cardLimit; k++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.reviewAndApproveMasterContainer()));
			WebElement destinationLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.reviewAndApproveMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 534, 370).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueMarketing()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueMarketing()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId()).sendKeys("Marketing"+k);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardTitle()).sendKeys("Marketing Manager"+k);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardDescription()).sendKeys("Marketing is the study and management of exchange relationships. Marketing is used to create, keep and satisfy the customer. With the customer as the focus of its activities, it can be concluded that marketing is one of the premier components of business management - the other being innovation.");
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardAcceptanceCriteria()).sendKeys("The following 5 market segmentation criteria should be useful when planning your own company's market segmentation strategy. A market segment should be: Measurable: Market segments are usually measured in terms of sales value or volume (i.e. the number of customers within the segment).");
			scrollinToView(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDownLow()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDownLow()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).clear();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("15");
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()).click();
			System.out.print(k+" ");
			
		}
		System.out.println("\nCard creation on Review and Approve master container ends");
		
		
		//Cards create in Done master container with OPERATION
		System.out.print("Now card creates on Done master container\n");
		for(int i=1; i<=cardLimit; i++)
		{
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.doneMasterContainer()));
			WebElement destinationLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.doneMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 744, 369).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(2000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueOperations()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueOperations()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId()).sendKeys("Operation"+i);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardTitle()).sendKeys("Operation Title"+i);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardDescription()).sendKeys("An operations manager is a senior role which involves overseeing the production of goods and/or provision of services. It's an operations manager's job to make sure an organisation is running as well as it possibly can, with a smooth efficient service that meets the expectations and needs of customers and clients.");
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardAcceptanceCriteria()).sendKeys("Operational requirements are those statements that \"identify the essential capabilities, associated requirements, performance measures, and the process or series of actions to be taken in effecting the results that are desired in order to address mission area deficiencies, evolving applications or threats, emerging technologies, or system cost improvements [1].\" The operational requirements assessment starts with the Concept of Operations (CONOPS) and goes to a greater level of detail in identifying mission performance assumptions and constraints and current deficiencies of or enhancements needed for operations and mission success. Operational requirements are the basis for system requirements.");
			scrollinToView(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDownMedium()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDownMedium()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).clear();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("20");
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()).click();
			System.out.print(i+" ");
		}
		System.out.println("\nCard creation on Done master container ends");
		
		
		//Card create in Archive master container with SALES
		System.out.print("Now card creates on Archive master container\n");		
		for(int i=1; i<=cardLimit; i++)
		{
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.archiveMasterContainer()));
			WebElement destinationLocator = findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.archiveMasterContainer());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			//action.dragAndDropBy(sourceLocator, 944, 370).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.ClickOnSearchField()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.ClickOnSearchField()).sendKeys("cat5");
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueSales()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectCategoryFromDropDownValueSales()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardId()).sendKeys("Sales"+i);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardTitle()).sendKeys("Sales Manager"+i);
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardDescription()).sendKeys("Sales representatives sell retail products, goods and services to customers. ... Sometimes, sales representatives will focus on inside sales, which typically involves \"cold calling\" for new clients while in an office setting, or outside sales, which involves visiting clients in the field with new or existing clients.");
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterCardAcceptanceCriteria()).sendKeys("Sales Criteria for Success. Answering the phone. Using their name. Showing an interest. Offering a professional viewpoint/opinion. Not wasting their time (if we can't help them, we should just say). Asking insightful questions. Not having to repeat themselves. Receiving quality and timely information.");
			scrollinToView(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDown()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectPriorityFromDropDown()).click();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).clear();
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterEstimationTime()).sendKeys("25");
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()));
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateButtonForCard()).click();
			System.out.print(i+" ");
		}
		
		System.out.println("\nCard creation on Archive master container ends");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddToBoardFan()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddToBoardFan()).click();
		
	
	}
	
	//Task added on Backlog Master Container's cards
	public void addTaskToBacklogMasterContainerCards()
	{
		int i;
		int x=0;
		int y=1;
		int z=x+y;
		System.out.println("Value of z outside the loop : "+z);
		

		//Backlog master container cards
		for(i=1; i<=cardLimit; i++)
		{
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			
			//Edit card pensil icon 
			
			boolean isEditIconVisible=findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).isDisplayed();
			System.out.println("isEditIconVisible :");
			
			if (isEditIconVisible==true) {
				
				
				explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));//both form r work
				findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
				
			} 
			else {
                
				scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
				
		explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));//both form r work
		findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			}
		
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			// TASK is Added to Kanban Card Backlog master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
					
					
					
				}
				
			}
					
					//***********************************************************| Apply stickers on Kanban Card |************************************************************
					
					
					
					//moveToElement(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn())).contextClick().build().perform();
					
					
				    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}        

					//*******************need to apply new logic here for apply sticker on kanban card*******************
					
					int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size();
					System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
					
					findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
					
					
				//	for(int R=0; i<sizeOfStickerWindow; R++)
				//	{
				//		findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
						
				//	}
				//	
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				
				//uploading files on cardl̥
				
			//	for(int m=1; m<=5; m++)
			//	{
				
				actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();
	
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnFilesSideColumn());
				findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()).click();*/
				
				//No need to this line
		  	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
				//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
				System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
				
				if(isRepositorySourceVisible == true)
				{
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				}
				
				
				findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
				
				explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
				findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
				
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
					explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
					findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
				
		
					
				
 
					
		// Task create loop ends here
			//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			//explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
			//findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
			
			x = divisor;   //0=5
			y = z;         //1=1                               
			z = x+y;       //5+1=6
			System.out.print(z+" \n");
		}
	}
	
	
	
	
	//Task added on InProgress master container's Card
      public void addTaskToInProgressMasterContainerCards()
	{
		int j;
		int a = 0;
		int b = 1;
		int sum = a+b;
		System.out.println("Value of sum outside the loop : "+sum);
		
		for(j=1; j<=cardLimit; j++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+j+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+j+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+j+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			// TASK is Added to Kanban Card inprogress master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	// Task create loop ends here
			
			
			
			
			
			
			
			

			//***********************************************************| Apply stickers on Kanban Card |************************************************************
			
			
			
			//moveToElement(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn())).contextClick().build().perform();
			
			
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        

			//*******************need to apply new logic here for apply sticker on kanban card*******************
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size();
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
		//	for(int R=0; i<sizeOfStickerWindow; R++)
		//	{
		//		findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
		//	}
		//	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//uploading files on cardl̥
		
	//	for(int m=1; m<=5; m++)
	//	{
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnFilesSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()).click();*/
		
		//No need to this line
  	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
		if(isRepositorySourceVisible == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		//	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//	explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
		//	findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
			
			a = divisor;//5
			b = sum;//1
			sum = a+b;//6
			System.out.print(sum +" \n");
		}
	}
	
	//Task added on ReviewAndApproval Master Container's cards
	public void addTaskToReviewAndApprovalMasterContainerCards()
	{
		int i;
		int p = 0;
		int q = 1;
		int r = p+q;
		System.out.println("Value of r outside the loop is : "+r);
		
		
		for(i=1; i<=cardLimit; i++)
		{
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//TASK is Added to Kanban Card Review and Approval master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			
			//Apply loop from here
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	
		
		
			
		    // Task create loop ends here
			
			
			
			
			
			
			//***********************************************************| Apply stickers on Kanban Card |************************************************************
			
			
			
			//moveToElement(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn())).contextClick().build().perform();
			
			
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        

			//*******************need to apply new logic here for apply sticker on kanban card*******************
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size();
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
		//	for(int R=0; i<sizeOfStickerWindow; R++)
		//	{
		//		findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
		//	}
		//	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//uploading files on cardl̥
		
	//	for(int m=1; m<=5; m++)
	//	{
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnFilesSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()).click();*/
		
		//No need to this line
  	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
		if(isRepositorySourceVisible == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		

		
		//	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			//explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
			//findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
			
			p = divisor;
			q = r;
			r = p+q;
			System.out.print(r +" \n");
		}

	}
	//Task added on Done Master Container's cards
	public void addTaskToDoneContainerCards()
	{
		int l;
		int e = 0;
		int f = 1;
		int g = e+f;
		System.out.println("Value of g outside the loop : " +g);
		
		for(l=1; l<=cardLimit; l++)
		{
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+l+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+l+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+l+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//TASK is Added to Kanban Card Done master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			
			//Apply loop from here
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	
		
		
		// Task create loop ends here
			
			
			
			
			
			
			
			
			//***********************************************************| Apply stickers on Kanban Card |************************************************************
			
			
			
			//moveToElement(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn())).contextClick().build().perform();
			
			
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        

			//*******************need to apply new logic here for apply sticker on kanban card*******************
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size();
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
		//	for(int R=0; i<sizeOfStickerWindow; R++)
		//	{
		//		findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
		//	}
		//	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//uploading files on cardl̥
		
	//	for(int m=1; m<=5; m++)
	//	{
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnFilesSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()).click();*/
		
		//No need to this line
  	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
		if(isRepositorySourceVisible == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		

			
			
			
			
			
			
			
			
		//	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//	explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
		//	findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
			
			e = divisor;
			f = g;
			g = e+f;
			System.out.print(g +" \n");
		}
	}
	
	
	//Task added on Archive Master Container's cards
	public void addTaskToArchiveContainerCards()
	{
		int i;
		int x = 0;
		int y = 1;
		int z = x+y;
		System.out.println("Value of z outside the loop : "+z);
		
		for(i=1; i<=cardLimit; i++)
		{
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//TASK is Added to Kanban Card Archive master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			
			//Apply loop from here
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("pratish laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	
		
		
		    // Task create loop ends here
			
			
			
			
			//***********************************************************| Apply stickers on Kanban Card |************************************************************
			
			
			
			//moveToElement(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn())).contextClick().build().perform();
			
			
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        

			//*******************need to apply new logic here for apply sticker on kanban card*******************
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size();
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
		//	for(int R=0; i<sizeOfStickerWindow; R++)
		//	{
		//		findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
		//	}
		//	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//uploading files on cardl̥
		
	//	for(int m=1; m<=5; m++)
	//	{
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnFilesSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()).click();*/
		
		//No need to this line
  	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
		if(isRepositorySourceVisible == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		

			
			
		
		
		//	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//	explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
		//	findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
			
			x = divisor;
			y = z;
			z = x+y;
			System.out.print(z +" \n");
		}
	}
}