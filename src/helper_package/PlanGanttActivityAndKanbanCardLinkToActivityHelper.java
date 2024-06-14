package helper_package;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateCardLocators;
import pom_package.FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.PlanGanttActivityAndKanbanCardLinkToActivityLocator;


public class PlanGanttActivityAndKanbanCardLinkToActivityHelper extends CommonMethodsOfWebDriver {

	/*public PlanGanttActivityAndKanbanCardLinkToActivityHelper(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

	FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC fpkch = new FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC();
	String kanbanBoardCurrentBrowserWindowHandleValue;	
	String PlanGanttBoardCurrentBrowserWindowHandleValue;
	public static String createFolderNameRandomly,idValueOfloadMaskIniFrame;
	public static int divisor=5;
	public static String createFolderNameRandoml;
	
	public void kanbanBoard() throws InterruptedException
	{
	
		//Creating Folder Project Kanban Board
	
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnFolderIcon());
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnFolderIcon()).click();
		explicitWaitVisibilityOf(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterFolderName()));
		createFolderNameRandomly = generateRandomString(6);
		System.out.println("Folder Name with random method : "+createFolderNameRandomly);
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterFolderName()).sendKeys("A "+createFolderNameRandomly);
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddButton()).click();
		
	
	
	    try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		scrollinToView(findElement((By.xpath("//*[text()='A "+createFolderNameRandomly+"']"))));
		explicitWaitVisibilityOf(findElement((By.xpath("//*[text()='A "+createFolderNameRandomly+"']"))));
		// click on the compose button as soon as the "compose" button is visible
		jsExecutorClickOnElement(findElement((By.xpath("//*[text()='A "+createFolderNameRandomly+"']"))));
		
		
		
		
		/*try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		Actions Act1=new Actions(driver);
		
		Act1.moveToElement(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']"))).click().build().perform();
      */

		/*scrollinToView(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));*/
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnFolderThreeDots());
		//explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnFolderThreeDots()));
		findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnFolderThreeDots()).click();
		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddProject()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddProject()).click();
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterProjectName()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterProjectName()).sendKeys("Project P1");		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectAddButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectAddButton()).click();
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreatedProject()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreatedProject()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		/*
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnProjectSetupUnderCreatedProject());
		findElement(KanbanBoardRegressionLocators.clickOnProjectSetupUnderCreatedProject()).click();
		switchToiFrame("boardIfram");
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}	
		actions.sendKeys(Keys.END).build().perform();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPlanganttcheckbox()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPlanganttcheckbox())).click().build().perform();
		
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		actions.sendKeys(Keys.HOME).build().perform();
		
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup())); 
		findElement(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		
		
		boolean projectSetupSettingSuccessfullSave = findElement(KanbanBoardRegressionLocators.projectSetupSaveSuccessMessageAfterSave()).isDisplayed();
		System.out.println("Project setup successfull save message LINE 93 :"+projectSetupSettingSuccessfullSave);
		
		driver.switchTo().parentFrame();
	
		if(projectSetupSettingSuccessfullSave==true)
		{
			boolean navScroller = findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).isDisplayed();
			System.out.println("Nav scroller : "+navScroller+"\n*******************************************************************************************************************");
			actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller())).click().build().perform();
		}
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		*/
		
		

		explicitWaitElementBy("elementToBeLocated", FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectBoardThreeDots());
		
		//explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectBoardThreeDots()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnProjectBoardThreeDots()).click();		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreateKanbanBoardButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnCreateKanbanBoardButton()).click();		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterKanbanBoardNameInputArea()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.enterKanbanBoardNameInputArea()).sendKeys("Kanban Board1");		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddKanbanBoardButton()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.clickOnAddKanbanBoardButton()).click();
		
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.openKanbanBoard()));
		findElement(FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMCLocators.openKanbanBoard()).click();
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		//Kanban board Zoom Icon
		switchToiFrame("boardIfram");
		
		kanbanBoardCurrentBrowserWindowHandleValue = driver.getWindowHandle();
		System.out.println("kanbanBoard browser window handle value :- "+kanbanBoardCurrentBrowserWindowHandleValue);
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		//NU
		int getMaskLoadSize = findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.getSizeOfAllMaskLoader()).size();
		System.out.println("Size of load mask LINE 70 :"+getMaskLoadSize);
		
		idValueOfloadMaskIniFrame = findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.getSizeOfAllMaskLoader()).get(getMaskLoadSize-1).getAttribute("id");
		System.out.println("Id attribute value of load mask on iFrame LINE 72 :"+idValueOfloadMaskIniFrame);
		
		explicitWaitElementBy("invisibilityOfElementLocated", PlanGanttActivityAndKanbanCardLinkToActivityLocator.loadMaskiFrame());
		
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOn_KanbanBoardZoomIcon());
		findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOn_KanbanBoardZoomIcon()).click();
		
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		driver.switchTo().window(kanbanBoardCurrentBrowserWindowHandleValue);
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		driver.switchTo().frame(0);
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()));
		findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).click();
	}
	
	public void clickOnPlanGantt()
	{
		Actions actions = new Actions(driver);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttOption()));
		findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttOption()).click();
		
		
		
		try {Thread.sleep(14000);}catch(InterruptedException ie) {}
		switchToiFrame("boardIfram");
		
		
		
		//BackLog Master container card creation and link to Activity
		//============================================================
		
		
		for(int i=1; i<=5; i++)
		{			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()).click();
		
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			int sizeOfElement = driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).size();
			System.out.println("Number of elements of sizeof elements :"+sizeOfElement);
			driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).get(sizeOfElement-1).click(); 
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			//explicitWaitElementBy("elementToBeLocated", PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField());
			
			
			//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("Activity" +i);
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
		
			
		
			
			/* This code is only for careating the multiple activity for Qa2 org
			
			
			for(int i=1; i<=2000; i++)
			{			
				//try {Thread.sleep(10000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()));
				//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()).click();
				handleElementClickInterceptedExpectionWhileClickOnElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity());

				
				try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				int sizeOfElement = driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).size();
				System.out.println("Number of elements of sizeof elements :"+sizeOfElement);
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).get(sizeOfElement-1).click(); 
				try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				//explicitWaitElementBy("elementToBeLocated", PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField());
				
				
				
			//	performRandomClickOnWebPage();
				
				//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
				explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()));
		    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("Activity" +i);
		    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				
				
			}
		}
	}
			
			
			
			
			
			
			
			
			
			
			*/
			
			
			
			
			
			
			
			
			
			
			
		//  <!--Your coment-->   This is ued for comment the code for xml file 
			
			for(String allOpenBrowserWindowHandle : driver.getWindowHandles())
			{
				driver.switchTo().window(allOpenBrowserWindowHandle);
			}
			
			//Switch to kanban board for create card
			//======================================================================================================================
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnNewToAddCardToBoard()));		
			findElement(CreateCardLocators.clickOnNewToAddCardToBoard()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
		
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnSearchCategory()));
			findElement(CreateCardLocators.clickOnSearchCategory()).sendKeys("Operations");
		
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectCategoryFromCategoryDropdownOperations()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectCategoryFromCategoryDropdownOperations()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("OPTs"+i);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Card link to Activity"+i);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("An operations manager is a senior role which involves overseeing the production of goods and/or provision of services. It's an operations manager's job to make sure an organisation is running as well as it possibly can, with a smooth efficient service that meets the expectations and needs of customers and clients.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Operational Acceptance Criteria are a list of conditions and/or final checks to insure both that the customer support entities have the appropriate resources in place to accept the transition of operational support and maintenance of the product throughout the products lifecycle.");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDown()));
			findElement(CreateCardLocators.selectPriorityFromDropDown()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("7");
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			
			//**********Apply Scroller Here**********
			if(i>=6)
			{
				//This will scroll the web page till end.	
				 //  JavascriptExecutor js = (JavascriptExecutor) driver;
				   //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				
				
				//actions.sendKeys(Keys.HOME).build().perform();
				
				//actions.sendKeys(Keys.END).build().perform();
				
				
				//JavascriptExecutor Js1 = (JavascriptExecutor) driver;
				//Js1.executeScript("window.scrollBy(500,1000)");
				//try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				
				//explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone()));
				//actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.MoveTOtemplate())).build().perform();
				
				//actions.clickAndHold(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).perform();
				//actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerNameHeading())).release().build().perform();
				
				try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				
				actions.moveToElement(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-kanbandataview-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]"))).build().perform();
				explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-kanbandataview-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
				//findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
				
				findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-kanbandataview-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
				
				
			}
			
			// Edit Kanban Card
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			//explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-kanbandataview-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			//findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
		
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
		    // TASK is Added to Kanban Card Backlog master container
			try {Thread.sleep(6000);}catch(InterruptedException ie) {}
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
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=5)
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
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
					
				}
			}
				
			// Task create loop ends here
			
			scrollinToView(findElement(CreateCardLocators.createdTaskName()));
			
			
			// Click On LINK Side Column
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()).click();
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnProjectNameAfterFolderOpen()).click();
			
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()).click();
			try {Thread.sleep(1500);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()).click();
			
			if(i>=7)
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()));
				findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).click();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).sendKeys("Activity"+i);
				findElement(By.xpath("//p[@title='Activity"+i+"']")).click();
			}
			else
			{
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(By.xpath("//p[@title='Activity"+i+"']")));
				findElement(By.xpath("//p[@title='Activity"+i+"']")).click();
			}
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()));		
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()).click();						
			//end
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().window(kanbanBoardCurrentBrowserWindowHandleValue);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			//driver.switchTo().frame(0);
			
		   driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']/iframe")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}

		
			//switchToiFrame("boardIfram");
			
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='boardIfram']")));
			
			
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementBy("elementToBeLocated", PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon());
			//explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie){}
			
			//explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.ToseeMinature()));
			
		//    boolean minatureoflinkingcard =findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.ToseeMinature()).isDisplayed();
		//	System.out.println("The minature of linking card is :"+minatureoflinkingcard);
			
			
		}
		
	
	
	
	
	
	
	
	
	
			//loop iteration ends here for backlog master container
		
	
		//InProgress Master container card creation and link to Activity
		//======================================================================
		 int count=0;// we have to initialize count = 0
		 for(int j=11; j<=15; j++)
		 {
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			int sizeOfElement = driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).size();
						
			driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).get(sizeOfElement-1).click();
			
			//This line clicks on the last element found in step 2, which is the "Add New Activity" button. The get() method
			//with the argument (sizeOfElement-1) is used to access the last element in the list. Then, the click() method is called to simulate a click on the button.
			
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("Activity" +j);
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			for(String allOpenBrowserWindowHandle : driver.getWindowHandles())
			{
				driver.switchTo().window(allOpenBrowserWindowHandle);
			}
			
			if(j==11)
			{
				refresh();
				try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			}
			
			//Now cards create on inprogress master container
			//====================================================
			try {Thread.sleep(3000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
						
			explicitWaitVisibilityOf(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.inProgressMasterContainerArea()));
			WebElement destinationLocator = findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.inProgressMasterContainerArea());
			
			Actions action = new Actions(driver);
			action.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueFinance()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueFinance()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("Finance"+j);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Finance Department"+j);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("Financial manager: job description. AddThis Sharing Buttons. Financial managers work within the public and private sector where they are responsible for providing financial advice and undertaking related accounts administration. Financial managers are also known as financial or business analysts.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Microsoft Press defines Acceptance Criteria as �Conditions that a software product must satisfy to be accepted by a user, customer or other stakeholder.� ... These criteria define the boundaries and parameters of a User Story/feature and determine when a story is completed and working as expected.");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDownMedium()));
			findElement(CreateCardLocators.selectPriorityFromDropDownMedium()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("10");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			
			//count=count+2;
			count=count+1;
			
			//*******************************Scroller Apply From here***************************************************
			if(j>=16)
			{
				
				//This will scroll the web page till end.	
				   //JavascriptExecutor js = (JavascriptExecutor) driver;
				 //  js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				   
				/*explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone()));
				actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).build().perform();
				actions.clickAndHold(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).build().perform();
			    actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerNameHeading())).release().build().perform();*/
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				actions.moveToElement(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-kanbandataview-2']/div["+count+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]"))).build().perform();
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-kanbandataview-2']/div["+count+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
				
				findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-kanbandataview-2']/div["+count+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
				
				
			}
			
			
			
			// Click on kanban Card Edit Icon
			
			//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@class='x-unsized x-dataview-container']/div["+count+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			//findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
			
			findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@class='x-unsized x-dataview-container']/div["+count+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			
			
		
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			// TASK is Added to Kanban Card InProgress master container
			
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
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}
					catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
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
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	// Task create loop ends here
			
			scrollinToView(findElement(CreateCardLocators.createdTaskName()));			
			
			
			
		
			// Click On LINK Side Column
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()).click();
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnProjectNameAfterFolderOpen()).click();
			
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()).click();
			
			//Condition
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).sendKeys("Activity"+j);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(By.xpath("//p[@title='Activity"+j+"']")).click();
									
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()));		
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()).click();						
			
			// fan button
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().window(kanbanBoardCurrentBrowserWindowHandleValue);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			driver.switchTo().frame(0);
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			switchToiFrame("boardIfram");
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()).click();
			
			try {Thread.sleep(3000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()).click();
		}   //loop iteration ends here for in progress master container
		


		
	
		//Review & Approval Master Container card creation and Link to Activity(i is for crd and k for tsk)
		//================================================================================
		int count1=0;
		for(int k=21; k<=25; k++)
		{
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			int sizeOfElement = driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).size();
						
			driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).get(sizeOfElement-1).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("Activity" +k);
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			for(String allOpenBrowserWindowHandle : driver.getWindowHandles())
			{
				driver.switchTo().window(allOpenBrowserWindowHandle);
			}
			
			if(k==21)
			{
				refresh();
				try {Thread.sleep(5000);}catch(InterruptedException ie) {}
			}
			
			//Now cards create on review & approval master container
			
			try {Thread.sleep(2000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
						
			explicitWaitVisibilityOf(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.reviewAndApprovalMasterContainerZone()));
			WebElement destinationLocator = findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.reviewAndApprovalMasterContainerZone());
			
			
			actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueMarketing()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueMarketing()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("Marketing"+k);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Marketing Manager"+k);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("Marketing is the study and management of exchange relationships. Marketing is used to create, keep and satisfy the customer. With the customer as the focus of its activities, it can be concluded that marketing is one of the premier components of business management - the other being innovation.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("The following 5 market segmentation criteria should be useful when planning your own company's market segmentation strategy. A market segment should be: Measurable: Market segments are usually measured in terms of sales value or volume (i.e. the number of customers within the segment).");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDownLow()));
			findElement(CreateCardLocators.selectPriorityFromDropDownLow()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("15");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			
			count1 = count1+1;
		
			//**********Scroller Apply From here**********
			if(k>=26)
			{
				/*explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone()));
				actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).build().perform();
				actions.clickAndHold(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).
				moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerNameHeading())).release().build().perform();*/
				
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				actions.moveToElement(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count1+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]"))).build().perform();
				
				
				explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count1+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count1+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
				
				
				
			}
			
			// Edit Icon
			try {Thread.sleep(5000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@class='x-unsized x-dataview-container']/div["+count1+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@class='x-unsized x-dataview-container']/div["+count1+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			// TASK is Added to Kanban Card Review and Approval master container
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			
			for(int j=1; j<=1; j++)
			{
				if(j==1)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}
					catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(j>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");	
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	// Task create loop ends here
			
			scrollinToView(findElement(CreateCardLocators.createdTaskName()));
		
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()).click();
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnProjectNameAfterFolderOpen()).click();
			
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()).click();
			
			//seacrh activity name and click on it
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).sendKeys("Activity"+k);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(By.xpath("//p[@title='Activity"+k+"']")).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()));		
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()).click();						
			
			// fan button
			try {Thread.sleep(2000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			driver.switchTo().window(kanbanBoardCurrentBrowserWindowHandleValue);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			driver.switchTo().frame(0);
			switchToiFrame("boardIfram");
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()).click();
		}	// loop iteration ends here for Review & Approval master container
		
		
		
		//Done Master Container card creation and Link to Activity
		//======================================================================
		int count2=0;
		for(int i=31;i<=35; i++)
		{
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			int sizeOfElement = driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).size();
						
			driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).get(sizeOfElement-1).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("Activity" +i);
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			for(String allOpenBrowserWindowHandle : driver.getWindowHandles())
			{
				driver.switchTo().window(allOpenBrowserWindowHandle);
			}
			
			if(i==31)
			{
				refresh();
				try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			}
			
			//Now cards create on Done master container
			
			try {Thread.sleep(2000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
						
			explicitWaitVisibilityOf(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.doneMasterContainerZone()));
			WebElement destinationLocator = findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.doneMasterContainerZone());
						
			actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
			
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueOperations()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueOperations()).click();
			findElement(CreateCardLocators.enterCardId()).sendKeys("Operation"+i);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Operation Title"+i);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("An operations manager is a senior role which involves overseeing the production of goods and/or provision of services. It's an operations manager's job to make sure an organisation is running as well as it possibly can, with a smooth efficient service that meets the expectations and needs of customers and clients.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Operational requirements are those statements that \"identify the essential capabilities, associated requirements, performance measures, and the process or series of actions to be taken in effecting the results that are desired in order to address mission area deficiencies, evolving applications or threats, emerging technologies, or system cost improvements [1].\" The operational requirements assessment starts with the Concept of Operations (CONOPS) and goes to a greater level of detail in identifying mission performance assumptions and constraints and current deficiencies of or enhancements needed for operations and mission success. Operational requirements are the basis for system requirements.");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDownMedium()));
			findElement(CreateCardLocators.selectPriorityFromDropDownMedium()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("20");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			
			count2 = count2+1;
			
			//**********Scroller Apply From here**********
			if(i>=36)
			{
				/*explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone()));
				actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).build().perform();
				actions.clickAndHold(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).build().perform();
				actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerNameHeading())).release().build().perform();*/
				
				actions.moveToElement(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count2+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]"))).build().perform();
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count2+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count2+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
				
				
				
			}
			
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@class='x-unsized x-dataview-container']/div["+count2+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@class='x-unsized x-dataview-container']/div["+count2+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			// TASK is Added to Kanban Card Done master container
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			for(int j=1; j<=1; j++)
			{
				if(j==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}
					catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(j>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	// Task create loop ends here
			
			scrollinToView(findElement(CreateCardLocators.createdTaskName()));			
			
			
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()).click();
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnProjectNameAfterFolderOpen()).click();
			
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()).click();
			
			//seacrh activity name and click on it
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).sendKeys("Activity"+i);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(By.xpath("//p[@title='Activity"+i+"']")).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()));		
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()).click();						
			
			// fan button
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().window(kanbanBoardCurrentBrowserWindowHandleValue);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			driver.switchTo().frame(0);
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			switchToiFrame("boardIfram");
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()).click();
		}// done master container loop ends here and link to activity
		
		
		//Archive Master Container card creation and Link to Activity
		//=====================================================================
		int count3=0;
		for(int k=41; k<=45; k++)
		{
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlusIconToAddActivity()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			int sizeOfElement = driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).size();
						
			driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).get(sizeOfElement-1).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("Activity" +k);
	    	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			for(String allOpenBrowserWindowHandle : driver.getWindowHandles())
			{
				driver.switchTo().window(allOpenBrowserWindowHandle);
			}
			
			if(k==41)
			{
				refresh();
				try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			}
			
			//Now cards create on Archive master container
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
						
			explicitWaitVisibilityOf(findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton()));
			WebElement sourceLocator = findElement(CreateCardLocators.clickOnAddCardToBoardUnderFanButton());
			
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.archiveMasterContainerZone()));
			WebElement destinationLocator = findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.archiveMasterContainerZone());
						
			actions.dragAndDrop(sourceLocator, destinationLocator).build().perform();
						
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCategoryDropDown()));
			findElement(CreateCardLocators.clickOnCategoryDropDown()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			//explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueSales()));
			//findElement(CreateCardLocators.selectCategoryFromDropDownValueSales()).click();
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnSearchCategory()));
			findElement(CreateCardLocators.clickOnSearchCategory()).sendKeys("Sales");
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectCategoryFromDropDownValueSales()));
			findElement(CreateCardLocators.selectCategoryFromDropDownValueSales()).click();
			
			
			findElement(CreateCardLocators.enterCardId()).sendKeys("Sales"+k);
			findElement(CreateCardLocators.enterCardTitle()).sendKeys("Sales Manager"+k);
			findElement(CreateCardLocators.enterCardDescription()).sendKeys("Sales representatives sell retail products, goods and services to customers. ... Sometimes, sales representatives will focus on inside sales, which typically involves \"cold calling\" for new clients while in an office setting, or outside sales, which involves visiting clients in the field with new or existing clients.");
			findElement(CreateCardLocators.enterCardAcceptanceCriteria()).sendKeys("Sales Criteria for Success. Answering the phone. Using their name. Showing an interest. Offering a professional viewpoint/opinion. Not wasting their time (if we can't help them, we should just say). Asking insightful questions. Not having to repeat themselves. Receiving quality and timely information.");
			scrollinToView(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnPrioirtyDropDown()));
			findElement(CreateCardLocators.clickOnPrioirtyDropDown()).click();
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.selectPriorityFromDropDown()));
			findElement(CreateCardLocators.selectPriorityFromDropDown()).click();
			findElement(CreateCardLocators.enterEstimationTime()).clear();
			findElement(CreateCardLocators.enterEstimationTime()).sendKeys("25");
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnCreateButtonForCard()));
			findElement(CreateCardLocators.clickOnCreateButtonForCard()).click();
			
			count3 = count3+1;			
			
			//**********Scroller Apply From here**********
			if(k>=46)
			{
				/*explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone()));
				actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).build().perform();
				actions.clickAndHold(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerZone())).build().perform();
				actions.moveToElement(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.templateMasterContainerNameHeading())).release().build().perform();*/
				
				
				actions.moveToElement(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count3+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]"))).build().perform();
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-kanbandataview-2']//div[@class='x-unsized x-dataview-container']/div["+count3+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-kanbandataview-2']/div["+count3+"]//div[@class='x-unsized x-dataview-container']//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
				
				
				
				
				
			}
			
			// Kanban Card Edit Icon
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@class='x-unsized x-dataview-container']/div["+count3+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@class='x-unsized x-dataview-container']/div["+count3+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			// TASK is Added to Kanban Card Archive master container
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			for(int j=1; j<=1; j++)
			{
				if(j==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}
					catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
					
				}
				else if(j>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+j);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()));
					findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	// Task create loop ends here
			
			scrollinToView(findElement(CreateCardLocators.createdTaskName()));
			
			
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.kanbanCardSideColumnLinkOption()).click();
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProject()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.selectFolderNameFromTheList()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnProjectNameAfterFolderOpen()).click();
			
			scrollinToView(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToProjectBoard()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnPlanGanttName()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnLinkToCard()).click();
			
			//seacrh activity name and click on it
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()));
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()));		//added later
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).click();
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.linkToCardSearchField()).sendKeys("Activity"+k);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(By.xpath("//p[@title='Activity"+k+"']")).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()));		
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.clickOnKanbanCardSaveButton()).click();						
			
			// fan button
			try {Thread.sleep(2000);}
			catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAddToBoardFan()));
			findElement(CreateCardLocators.clickOnAddToBoardFan()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().window(kanbanBoardCurrentBrowserWindowHandleValue);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			driver.switchTo().frame(0);
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			switchToiFrame("boardIfram");
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()).click();
			
			try {Thread.sleep(3000);}catch(InterruptedException ie){}
			explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()));
			findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()).click();
		} 
		
		//Archive Master Container loop ends here
     }	
}