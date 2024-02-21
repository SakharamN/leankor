package helper_package;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateCardLocators;
import pom_package.CreateKanbanCardsOnDifferentMasterContainerLocators;
import pom_package.CreateMultipleKanbancardswithTasksStickersFilesLocators;
import pom_package.KanbanBoardRegressionLocators;

public class CreateMultipleKanbancardswithTasksStickersFilesHelper extends CommonMethodsOfWebDriver {
	
	
	
	public static String createFolderNameRandomly;
	public static String kanbanBoardCurrentBrowserWindowHandleValue;
	public static String createProjectNameRandomly;
	public static int cardLimit;
	final int divisor = 5;
	
	
	public static String folderName;
	public static String projectName;
	public static String projectBoardName;
	
 public void create_KanbanBoard() throws InterruptedException
	{
		try {Thread.sleep(7000);}catch(InterruptedException ie) {}
		
	/*	findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnFolderIcon()).click();
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
		
	
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		scrollinToView(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.clickOnThreeDots()));
		findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.clickOnThreeDots()).click();
		
		createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 51 ::"+createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddProject()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddProject()).click();
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterProjectName()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterProjectName()).sendKeys(createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectAddButton()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectAddButton()).click();
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.clickOnCreatedProject()));
		findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.clickOnCreatedProject()).click();
		
		
		
		/*explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnSkipButtonWhenOpenCreatedProject()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnSkipButtonWhenOpenCreatedProject()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		//explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectBoardThreeDots()));
		explicitWaitVisibilityOf(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectBoardThreeDots()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnProjectBoardThreeDots()).click();	// here star and slash	
		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateKanbanBoardButton()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnCreateKanbanBoardButton()).click();		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterKanbanBoardNameInputArea()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.enterKanbanBoardNameInputArea()).sendKeys("Kanban Board1");		
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddKanbanBoardButton()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnAddKanbanBoardButton()).click();
		
		*/
		
		folderName=properties.getProperty("FolderName");
		System.out.println("Expanded folder name is :"+folderName);
		
		projectName=properties.getProperty("projectName");
		System.out.println("Expanded project name is :"+projectName);
				
				
		projectBoardName=properties.getProperty("projectBoardName");
		System.out.println("Expanded projectBoardName is :"+projectBoardName);
	
		explicitWaitVisibilityOf(findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.ClickOnCreatedFolder()));
		findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.ClickOnCreatedFolder()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.ClickoncreatedProject()));
		findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.ClickoncreatedProject()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//explicitWaitVisibilityOf(findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.clickonProjectBoard()));
		explicitWaitElementBy("elementToBeLocated", CreateMultipleKanbancardswithTasksStickersFilesLocators.clickonProjectBoard());
		findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.clickonProjectBoard()).click();
		
		explicitWaitVisibilityOf(findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.ClickOnCreatedKanbanBoard()));
		findElement(CreateMultipleKanbancardswithTasksStickersFilesLocators.ClickOnCreatedKanbanBoard()).click();
		
		
		
	
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
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
			
			
			if(i<=6)
			{
			
			
		explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));//both form r work
		findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
			
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			// TASK is Added to Kanban Card Backlog master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			for(int k=1; k<=2; k++)
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
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
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
					
					
					
				
					
				
				    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
	
					int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size() - 34;// It calculates the size of sticker windows, subtracts 24 from the count, and then clicks on the corresponding checkboxes.
					System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
					
					//findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-34).click();
					
					
				for(int R=0; R<sizeOfStickerWindow; R++)
				{
					findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();	
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				}
					
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
						
			}	
		
		
    	else if(i>=6)
		{
    		scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
    		
			//Actions act=new Actions(driver);
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")));//both form r work
			findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[7]")).click();
				
				
				//WebElement web= findElement(By.xpath("//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]"));
				
			//	act.moveToElement(findElement(By.xpath("//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]"))).build().perform();
				
				//act.moveToElement(web).build().perform();
				//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				//web.click();
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				// TASK is Added to Kanban Card Backlog master container & click on Task side column
				explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
				findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
				
				//Apply loop from here
				for(int k=1; k<=2; k++)
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
						
						try {Thread.sleep(2000);}catch(InterruptedException ie) {}
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
						
						int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size() - 34;// It calculates the size of sticker windows, subtracts 24 from the count, and then clicks on the corresponding checkboxes.
						System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
						
						try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
						
						//(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-34).click();
						
						
					for(int R=0; R<sizeOfStickerWindow; R++)
					{
					    findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();	
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					}
						
					//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					
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
		
				  
		}
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

}
	


	