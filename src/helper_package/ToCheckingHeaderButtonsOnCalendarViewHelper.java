package helper_package;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.ToAddingConstraintsColumnInCVLocators;
import pom_package.ToCheckingHeaderButtonsOnCalendarViewLocator;
import pom_package.ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater;

public class ToCheckingHeaderButtonsOnCalendarViewHelper extends CommonMethodsOfWebDriver {

	
	
	public static String getIframeSRCAttribute,childIframevalue,chatterArea,textAreaIDAttribute,classAttributeValueOfQuickActionSideColumn;
	public static String createFolderNameRandomly;
	public static String kanbanBoardCurrentBrowserWindowHandleValue;
	public static String createProjectNameRandomly,classAttributeValue,classAttributeValue1,ClassAttributesnames;
	public static int cardLimit,getsizeofallMConCV;
	final int divisor = 5;
	//public static ArrayList<String> multipleTabsOpen;
	public static Actions action;
	//public static  org.openqa.selenium.support.ui.WebDriverWait wait;
	
	public static int sizeofbutton,buttons;
	
	public static WebDriverWait wait;
	
	public static String folderName,projectName,kanbanBoardName, firstWindowhandle ;
	
	
    @SuppressWarnings("unchecked")
	public void create_KanbanBoard() throws InterruptedException
	{
		//try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		
			
		
		    //ArrayList<String>multipleTabsOpen =new ArrayList<>(driver.getWindowHandles());
		
		   // Wait for element to be visible
		
    	//wait=new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(120));
	//	
	 //   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("addicon")));
		
	  //  element.click();	
	    
	   // explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()));
		
		//get the title of the new tab
		
		//wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	
		
		// Assuming you have created a WebDriver instance named 'driver'
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40)); // 10 seconds timeout
		String newTabTitle = gettitle();
		System.out.println("New title of the tab is: " + newTabTitle);
		//wait.until(ExpectedConditions.titleIs(newTabTitle));
		wait.until(ExpectedConditions.titleIs("Leankor | Salesforce"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()));
		
		//org.openqa.selenium.support.ui.WebDriverWait wait=new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(120));
		
	// WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='x-container mainCls x-fullscreen x-layout-card-item x-sized']/descendant::div[text()='ALL FOLDERS']/following-sibling::div"))); 
	 
	//   if(element.isDisplayed())
	 //  {
	//	   element.click();	
	 //  }
	 //  else {
		   
	//	   System.out.println("Element is not displayed");
	  // }
		//findElement(By.xpath("//body")).click();
		
		
		explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		
	    //explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()));
	    findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()).click();
		
		
	
	    createFolderNameRandomly = generateRandomString(6);
		System.out.println("Folder Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 28 ::"+createFolderNameRandomly);
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterFolderName()).sendKeys("A "+createFolderNameRandomly);
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddButton()).click(); 
			
	
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		scrollinToView(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.clickOnThreeDots()));
		findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.clickOnThreeDots()).click();
		
		createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 51 ::"+createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()).click();
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()).sendKeys(createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()).click();
		
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		/*
	    try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterFolderName()));
		
	
		  // create folder  
		  @SuppressWarnings("resource")
		    Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter New folder name : ");
			folderName = sc.nextLine();
			
			
			
			System.out.print("Enter new project name : ");
			
			projectName = sc.nextLine();
			 
			
			
			System.out.print("Enter new kanbanBoard name : ");
			
			kanbanBoardName = sc.nextLine();
		
			
			
		
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterFolderName()).sendKeys(folderName);
			
			 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddButton()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddButton()).click(); 
			
		
			 try {Thread.sleep(4000);}catch(InterruptedException ie) {}
				
				scrollinToView(findElement(By.xpath("//*[text()='"+folderName+"']")));
				explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='"+folderName+"']")));
				jsExecutorClickOnElement(findElement(By.xpath("//*[text()='"+folderName+"']")));
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			 
			 
			 //Create Project 
			 
			explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnThreeDots()));
			findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnThreeDots()).click();
			
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()).click();
			
			
			
				
		  //	System.out.print("Enter new project name : ");
				
		 //	projectName = sc.nextLine();
			 
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()).sendKeys(projectName);
		
		
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()).click();
			
		
			
			try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		
			explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.clickOnCreatedProject()));
			findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.clickOnCreatedProject()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			

		

		//create kanban board 
			
			
			
			
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectBoardThreeDots()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectBoardThreeDots()).click();		
				
				explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCreateKanbanBoardButton()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCreateKanbanBoardButton()).click();	
				
				
				
					
				//	System.out.print("Enter new kanbanBoard name : ");
					
				//	kanbanBoardName = sc.nextLine();
				
				explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterKanbanBoardNameInputArea()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterKanbanBoardNameInputArea()).sendKeys(kanbanBoardName);		
				explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddKanbanBoardButton()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddKanbanBoardButton()).click();
			
			
				try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				
				explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnCreatedKanbanBoard()));
				findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnCreatedKanbanBoard()).click();
			
			
	            System.out.println("Hello we created new folder name is  "+folderName+"  and created project name is "+projectName+" and under this project we created "+kanbanBoardName+" kanban Board");
			
			
	        	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	        	*/
			
			
		
			
			try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		
			explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.clickOnCreatedProject()));
			findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.clickOnCreatedProject()).click();
			
			
			
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectBoardThreeDots()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectBoardThreeDots()).click();		
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCreateKanbanBoardButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCreateKanbanBoardButton()).click();		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterKanbanBoardNameInputArea()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterKanbanBoardNameInputArea()).sendKeys("Kanban Board1");		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddKanbanBoardButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddKanbanBoardButton()).click(); 
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.openKanbanBoard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.openKanbanBoard()).click(); 
		
		switchToiFrame("boardIfram");
		
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()).click();
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
			
		
		 firstWindowhandle = driver.getWindowHandle();
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
			
			
			driver.switchTo().window(winHandle);
	 	}
		
		
	    action = new Actions(driver);
		
	    
	    
	    
	    
	    for(String winhandle2 : driver.getWindowHandles())
	    {
	    	
	    	driver.switchTo().window(winhandle2);
	    }
		
	       explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());		
	       
           try {Thread.sleep(2000);}catch(InterruptedException ie) {}

	
     //   @SuppressWarnings("resource")
	  //  Scanner sc1 = new Scanner(System.in);
		
	//	System.out.print("Enter limit of card : ");
	//	cardLimit = sc1.nextInt(); //The sc.nextInt() method reads an integer value entered by the user from the standard input and assigns it to the cardLimit variable.
		
		
		//===============================================================================================================================
		
		// Cards creating on Backlog master container 
		
		System.out.print("Now Cards creating on Backlog master container in Calendar View\n");
		
	    try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=2; i++)
		{
			
			if(i==1)
			{
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.backlogMC()));
			//actions.moveToElement(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.backlogMC())).contextClick().build().perform();
			
			
			explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer()));
			actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer())).contextClick().build().perform();
			
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
			
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
			
			explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
			 try{Thread.sleep(4000);}catch(InterruptedException ie) {}
		  // System.out.print(i+" ");
		   
			}
		   
		  
		   
		   if(i==2)
		   {
			  
			   
				//explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer()));
			   explicitWaitElementBy("elementToBeLocated", ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer());
				actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer())).contextClick().build().perform();
				
				
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
				
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
				
				
				
				//following code for selecting User,Category and priority
				
				
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()).click();
				
				explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectMarketingCategory()));
				findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectMarketingCategory()).click();
				
				
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()).click();
				
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnMediumPriority()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnMediumPriority()).click();
				
				
			    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()).click();
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()).sendKeys("Pratish Laad");
				
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickONSEarchIcon()));
			    findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickONSEarchIcon()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectUser()));
				findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectUser()).click();
				
				explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.DescriptionFieldForSecondCard()));
				findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.DescriptionFieldForSecondCard()).sendKeys("Second card created");
			
				

				//explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.SaveCard());
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
				
				explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
		   }
		   System.out.print(i+" ");
			  
		}
		
		  try {Thread.sleep(3000);}catch(InterruptedException ie) {} 

		   
		 //  explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnZoomToFitButton()));
		 //  findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnZoomToFitButton()).click();
		  
	     handleElementClickInterceptedExpectionWhileClickOnElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnZoomToFitButton());
			 
		  try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
			 
		
		System.out.println("\nCards creation on backlog master container ends");
		
		
	
	}	


		public void AddTaskOnAllmastercontainerCards()
		{
			
			   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				
				explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.FirstCardInprogressmaterContainer()));
				actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.FirstCardInprogressmaterContainer())).contextClick().build().perform();
				
				
				
				   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					   
					   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnaddTask()));
					   findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnaddTask()).click();
					   
					   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					   
					   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubject()));
					   findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubject()).sendKeys("Task1");
					   
					//   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.EnterDescription()));
					//   findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.EnterDescription()).sendKeys("This description is added on card for cv");
					   
					   //xpath were not found
					   
					   /*
					   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnAssignOwner()));
					   findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnAssignOwner()).click();
					   
					   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SearchUserIninputFieldforTask()));
					   findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SearchUserIninputFieldforTask()).click();
					   
					   findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SearchUserIninputFieldforTask()).sendKeys("Pratish Laad");
					   
					   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickONSEarchIcon()));
					   findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickONSEarchIcon()).click();
					   
					   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
					   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectUserForTask()));
					   findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectUserForTask()).click();
					  
					  */
					   
					   
					  //xpath not found for priority will see later
				     //   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickonpriorityforTask()));
					//  findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickonpriorityforTask()).click();
					   
					//   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					//   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectNormalPriority()));
					//   findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectNormalPriority()).click();
					   
					   //explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickingOnStatusDropdown()));
					 //  findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickingOnStatusDropdown()).click();
					   
					   //try{Thread.sleep(2000);}catch(InterruptedException ie) {}
					  /// explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectInprogressStatusFromdropdown()));
					   //findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectInprogressStatusFromdropdown()).click();
					   
					   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
					   
					   
					
					   
					// handleElementClickInterceptedExpectionWhileClickOnElement(CreateCardsOnDifferentMasterContainersOnCVLocator.taskSaveButton()); this method is use for clicking on elementException Also click opertion performed 
					   
					  // explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.taskSaveButton()));
					  // findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.taskSaveButton()).click();  By using click method element not clickable
					   
					  
					   jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.taskSaveButton()));//by using javascriptExecuter Click we can perform click operation
					      
					   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
					   
					   explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SecondcardInprogressmasterContainer()));
					   actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SecondcardInprogressmasterContainer())).contextClick().build().perform();
						
						
						
						       try{Thread.sleep(1000);}catch(InterruptedException ie) {}
							   
							   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnaddTask()));
							   findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnaddTask()).click();
							   
							   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
							   
							   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubject()));
							   findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubject()).sendKeys("Task2");
					   
							   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
							   
							   jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.taskSaveButton()));
		
			
		}	
		 
	
 public void InspectHeaderElements()
 {
	 
	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	 
	 
	 explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CommonXapthForHEaderElements()));
	 
	 List<WebElement>sizeofbutton=findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.CommonXapthForHEaderElements());
	 
	 System.out.println("Total no of elements are presents on header tab :"+sizeofbutton.size());
	 
	 
	 for(int i=0; i<sizeofbutton.size(); i++)
	 {
		 String buttons=sizeofbutton.get(i).getText();
		 System.out.println("elements names present on header :"+buttons);
		 if(sizeofbutton.get(i).isEnabled())
		 { 
			 
			 
			 if(i!=7)
			 {
			 
				 sizeofbutton.get(i).click();
			 
					/*
					 * if(i!=6) { try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					 * 
					 * sizeofbutton.get(i).click();
					 * 
					 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					 * explicitWaitElementToBeClickable(findElement(
					 * ToCheckingHeaderButtonsOnCalendarViewLocator.printCancelbutton()));
					 * findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.printCancelbutton())
					 * .click();
					 * 
					 */}
			 
		
			
			 try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
			 
			 
			 
			}
		 }
		 
		 
		 
		 
	 
	 }
 
 public void UndoButtonFunctionality()
 {
	 try {Thread.sleep(4000);}catch(InterruptedException ie) {} 
	 explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnOneWeekbutton()));
	 findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnOneWeekbutton()).click();
	 
	 
	 explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnZoomToFitButton()));
	 findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnZoomToFitButton()).click();
	 
	 try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
	 
	 
	 
	  explicitWaitElementToBeClickable(findElement(By.xpath("//div[@class='x-panel x-grid-inner-locked x-grid-with-row-lines x-border-item x-box-item x-panel-default x-tree-panel x-tree-arrows x-grid']//table//tr[@data-recordindex='4']")));
	  actions.moveToElement(findElement(By.xpath("//div[@class='x-panel x-grid-inner-locked x-grid-with-row-lines x-border-item x-box-item x-panel-default x-tree-panel x-tree-arrows x-grid']//table//tr[@data-recordindex='4']"))).contextClick().build().perform();
		
	  //explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnDeleteButton()));
	  findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnDeleteButton()).click();
		
	  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	 
	   explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ChooseDeleteOptionOnDeletePopup()));
	   findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ChooseDeleteOptionOnDeletePopup()).click();
	 
		 
	    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	 
	 explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ChooseNOOptionDeleteAllTaskPopup()));
	 findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ChooseNOOptionDeleteAllTaskPopup()).click();
	 try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
	 
	 explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickonUndoButton()));
	 findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickonUndoButton()).click();
	 
	 try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
	 
	 explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.YesnUndoAction()));
	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.YesnUndoAction()).click();
	 
//	 Alert alert= driver.switchTo().alert();
	 
//	 driver.switchTo().alert().accept();
	 
	 
	 System.out.println("Undo Action performed successfully\n");	 
	 
 }
 
 
    public void  PerformedSetPercentComplete()
    {
    	
    	 try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
    	 
    	  // explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.sideClickingOnCard()));
    	 // findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.sideClickingOnCard()).click();
    	 
    	 actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.sideClickingOnCard())).contextClick().build().perform();
    	 try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
    	
    	
    	List<WebElement>setpercent=findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.SetpercentCommon());
    	
   
    	
    	for(int i=0; i<setpercent.size(); i++)
    	{
    		if(i!=4)
    		{
    			
    	   findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.SetpercentCommon()).get(i).click();
    	   try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
    	   
    		}
    	}
    	
    	
    }
    
    
    
    public void CaptureProjectAndKanbanBoardName()
    {
    	  try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
    	  
    	  explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CaptreProjectname()));
    	  String projectName=findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CaptreProjectname()).getText();
    	  System.out.println("Showing project name text in calendar view header tab is : "+projectName);
    	  
    	  
    	  
    	 explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CaptureBoardname()));
    	 String boardname = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CaptureBoardname()).getText();
    	 System.out.println("Showing Board name text in calendar view header tab is :"+boardname);  
    }
    
    
    public void showhundredpercentCards()
    {
    	try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
    	
        explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCardsHundredPercentdonecheckbox()));
        boolean showcard = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCardsHundredPercentdonecheckbox()).isDisplayed();
        System.out.println("\nShowCardsHundredPercentDoneCheckbox is enable :"+showcard);
    
         if(showcard==true)
        {
    	
         findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCardsHundredPercentdonecheckbox()).click();
         System.out.println("\nif show cards 100% done checkbox is Unchecked  : Cards are Invisible");
         
         try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
         
         findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCardsHundredPercentdonecheckbox()).click();
         System.out.println("if Show cards 100% done checkbox is checked   :Cards are visible");
         
        }
    	
    }
   
    public void ShowAllTasks()
    {
    	try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
    	
    	explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowAlltasksCheckbox()));
    	boolean showalltask = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowAlltasksCheckbox()).isDisplayed();
    	System.out.println("\nShowalltaskcheckbox is enabled :"+showalltask);
    	
    	if(showalltask==true)
    	{
    		
    		findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowAlltasksCheckbox()).click();	
    		System.out.println("if Showalltaskcheckbox is checked : all task miniture is visible on cards face");
    		
    		try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
    		
    		findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowAlltasksCheckbox()).click();
    		System.out.println("if Showalltaskcheckbox is Unchecked : all task miniture is Disable on cards face\n");
    	
    		
    	}	
    	
    }
    
    public void ShowCriticalPath()
    {
    	try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
    	
    	explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCriticalpath()));
    	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCriticalpath()).click();
    	
    	explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.redflashHilighted()));
    	boolean redflashon =findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.redflashHilighted()).isDisplayed();
    	System.out.println("\nred flashing on card highlighted :"+redflashon);
    	
    	if(redflashon==true)
    	{
    		System.out.println("while show critical path checkbox is enable : then the only card which is furthest date is flashing and remaing cards are disable");
    	}
    	
    		
    		
    	try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
    		
    		explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCriticalpath()));
    		findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ShowCriticalpath()).click();
    		
    		explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.redflashHilightedOF()));
    		boolean redflashof = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.redflashHilightedOF()).isDisplayed();
    		System.out.println("\nred flashing not highlighted on cards  :"+redflashof);
    		
    		
    		if(redflashof==true)
    		{
    			System.out.println("while ShowCriticalPath checkbox is disable  : then flashing card Not Highlighted and all cards are showing on the board\n");
    		}
    			
    }
    
    

   
    public void SetCalendarPreferences()
    {
    	try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
    	
    	explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnPopOutToNewBrowserTab()));
    	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnPopOutToNewBrowserTab()).click();
    	
    	try {Thread.sleep(4000);}catch(InterruptedException ie) {} 
    	
    	
    	// Get the handles of all open windows
             Set<String>winhandle=driver.getWindowHandles();    //In the example above, driver is the instance of the WebDriver that you're using to control the browser. The getWindowHandles() method returns a set of handles for all open windows. Since the order of the handles is not guaranteed, it's a good practice to convert the set to a list to access the handles by index.//By using handlesList.get(1), we retrieve the handle of the second window (index 1) and pass it to driver.switchTo().window() to switch the driver's focus to that window.

                
            System.out.println("getwindowhandles value after click on Setcalendarpreferences"+winhandle);
                                  
              
           // Convert the set to a list for easier indexing
              List<String>handleList=new ArrayList<>(winhandle);
              
           // Switch to the second window (index 1)
              driver.switchTo().window(handleList.get(1));
    	
    	
    	
           // Store the window handles in an ArrayList
           //   ArrayList<String> multipleTabsOpen = new ArrayList<>(driver.getWindowHandles());

              // Switch to the second window (index 1)
           //   driver.switchTo().window(multipleTabsOpen.get(1));

    	
    	/*
              String parent=driver.getWindowHandle();
              System.out.println(parent);

              Set<String>s=driver.getWindowHandles();
              System.out.println(s);

              Iterator<String> I1= s.iterator();

              while(I1.hasNext())
              {

              String child_window=I1.next();
              System.out.println(child_window);


              if(!parent.equals(child_window))
              {
              driver.switchTo().window(child_window);

              

    	  for(String winhandle2 : driver.getWindowHandles())//for loop: This is a standard for-each loop used for iterating over a collection of elements.String winhandle2: This declares a new variable winhandle2 of type String, which will hold the value of each element in the collection during each iteration. In this case, the collection is the set of window handles obtained from driver.getWindowHandles().

	    {
	    	
	    	driver.switchTo().window(winhandle2);
	    }
    	
    	*/
  	
    	
              try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
              
              
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSetCalendarPreferences()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSetCalendarPreferences()).click();
              
              try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Clickonsevendaycheckbox()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Clickonsevendaycheckbox()).click();
              
              
              try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CancelButtonOnsevenDayworkweek()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CancelButtonOnsevenDayworkweek()).click();
              
              
              try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
              
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSetCalendarPreferences()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSetCalendarPreferences()).click();
              
              try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Clickonsevendaycheckbox()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Clickonsevendaycheckbox()).click();
              
              try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SaveButtonOnsevenDayworkweek()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SaveButtonOnsevenDayworkweek()).click();
              
              try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CLickNoOnProceedconfermation()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.CLickNoOnProceedconfermation()).click();
              
              try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
              
          
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SaveButtonOnsevenDayworkweek()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SaveButtonOnsevenDayworkweek()).click();
              
              try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
              explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickYESOnProceedconfermation()));
              findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickYESOnProceedconfermation()).click();
              
              
            /*  explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Calendarnonworkingday()));
              boolean workingDays =findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Calendarnonworkingday()).isDisplayed();
              System.out.println("On board saturday and sunday Displaying non working days  :"+workingDays);
              
              if(workingDays==false)
              {
            	  System.out.println("On Calendar View Board Seven day work week is enabled ");
              }
              
              */
              
              
              
              //following code for for non working days are displayed or not
           
            //  classAttributeValue =  findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllcolumntdElements()).getAttribute("class");
              
              List<WebElement> elements = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllcolumntdElements());
              for (WebElement element : elements) 
              {
            	  
             //  String classAttributeValue = element.getAttribute("class");
               
               
            //   System.out.println(classAttributeValue);
                 
               ClassAttributesnames= element.getText();
               
               System.out.println(ClassAttributesnames);
                  
              }

              
     
            
            System.out.println(classAttributeValue);
            
            if(ClassAttributesnames.contains("nonworking sch-header-cell-center"))
            {
            	System.out.println("On Calendar view Seven Day week is Not enabled");
            }
            else 
            {
            		System.out.println("\nOn Calendar view Seven Day week is enabled successfully");
            }
              
              
            try {Thread.sleep(4000);}catch(InterruptedException ie) {}    
              
              
              //now we are going to again enabled 5 days working days
              
              
            
            
            explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSetCalendarPreferences()));
            findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSetCalendarPreferences()).click();
            
            try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
            explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Clickonsevendaycheckbox()));
            findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.Clickonsevendaycheckbox()).click();
            
            try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
            explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SaveButtonOnsevenDayworkweek()));
            findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SaveButtonOnsevenDayworkweek()).click();
            
            
            try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
            explicitWaitElementToBeClickable(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickYESOnProceedconfermation()));
            findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickYESOnProceedconfermation()).click();
            
            //Now we can check 5 days calendar view enabled or not
            
           System.out.println(classAttributeValue);
            
            if(ClassAttributesnames.contains("nonworking sch-header-cell-center"))
            {
            	System.out.println("On Calendar view Seven Day week is Not enabled");
            }
            else 
            {
            		System.out.println("\nOn Calendar view Seven Day week is enabled successfully");
            }
              
              
            try {Thread.sleep(4000);}catch(InterruptedException ie) {}    
            
            
            
            
            
            
            
            
            
            
            
    }

            
            //Following code for only non working days But not able to find the x path 
            
            // explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.AllcolumntdElements()));
            // classAttributeValue1 = ((WebElement) findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllcolumntdElements())).getAttribute("class");
          //   System.out.println(classAttributeValue1);
            
          //  try {Thread.sleep(2000);}catch(InterruptedException ie) {} 
            
          //  if(classAttributeValue1.contains("nonworking sch-header-cell-center"))
           // {
           // 	System.out.println("\nOn Calendar view Seven Day week is Disabled successfully");
           // }
           // else 
           // {
            //		System.out.println("Seven Day Week Still enabled on Board");
           // }       
        
            
         
            
            
       /*
           int i; 
       
	
          if(i==12)
          {
	
	
        	    try {Thread.sleep(4000);}catch(InterruptedException ie) {}
        		
        	    actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
        		
        		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
        		
        		explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
        		findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
        		
        		try {Thread.sleep(2000);}catch(InterruptedException ie) {}	
        		
        		
        		
        		String incrementID2 = findElement(By.xpath("//div[contains(@style,'left: 0px; top: "+incrementor+"px; margin: 0px; width: 137px;') and contains(@class,'x-menu-item x-menu-item-default x-box-item')]")).getAttribute("id");
        		System.out.println(i+" index id attribute value :"+incrementID2);

        		findElement(By.id(incrementID2)).click();
        		
        		
        		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
        		

        			incrementor = incrementor + 24;
        		
        			System.out.println("increment value :"+incrementor);
        			
        		
	
          }
          
    }
*/
    
    
    public void filterOnCalendarView()
    {
    	try {Thread.sleep(2000);}catch(InterruptedException ie) {}

		explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard()));
		findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}

		explicitWaitElementToBeVisibleAllListItems(findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()));
		int SizeofallfilterElement = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).size();

		System.out.println("Size of all filter dropdown element is :" + SizeofallfilterElement);

		// clicking on By card, milestone and task owner

		findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).get(SizeofallfilterElement - 5).click();
    	 
		//click on owner
		

		
		
		
		
		/*
		List<WebElement>OwnerCheckboxes = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectOwnerUnderCardTAskMilestoneOwner());
		System.out.println("NO of owner checkboxes are available :"+OwnerCheckboxes);
		
     	for(int i=0; i<OwnerCheckboxes.size(); i++)
		{
			
     		WebElement checkbox = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectOwnerUnderCardTAskMilestoneOwner()).get(i);
     		
     		checkbox.click();
     		System.out.println("Ownercheckbox is selected ");
     				
     		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
     		
     		try {
     			checkbox.click();
         		System.out.println("OwnerCheckBox is again deselected");
    			
				
			} catch (org.openqa.selenium.StaleElementReferenceException ie) {
				
				checkbox= driver.findElement(By.xpath("//td[text()='Anshita Bhadoria']/ancestor::table"));
				
				checkbox.click();
				
				System.out.println("owner checkbox is deselected after handle the staleElement exception");
				
			}
     		
			
		}
		             
     	
     	
     	=========================================================================================================================
     	
     	
		List<WebElement>OwnerCheckboxes = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.CheckboXpathforOwner());
		System.out.println("NO of owner checkboxes are available :"+OwnerCheckboxes);
		
		for(int i=0; i<OwnerCheckboxes.size(); i++)
		{
			    WebElement checkbox = OwnerCheckboxes.get(i);
			    
			    checkbox.click();
			    
			    System.out.println("Ownercheckbox is selected ");
			
	       	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
	       	try {
	       		checkbox.click();
			    System.out.println("OwnerCheckBox is again deselected");	
				
			} catch (Exception e) {
				
			
				
			//	checkbox =findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectfirstOwner());
				
				checkbox.click();
				System.out.println("Owner checkbox is deselect after handling the StaleElementException");
				
			}
	       
        
      
        
    
		
		
	  	
	List<WebElement>OwnerCheckboxes = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.CheckboXpathforOwner());
    System.out.println("NO of owner checkboxes are available :"+OwnerCheckboxes);
			
		
	  for(int i=0; i<OwnerCheckboxes.size(); i++)
	  {
		  OwnerCheckboxes.get(i).click();
		  
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		  
		  
	  }
	  
	  for(int i=OwnerCheckboxes.size()-1; i>=0; i--)
	  {
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
          OwnerCheckboxes.get(i).click();
		  
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	  }
	  
		    
		  }
		
		
		// following code for first owner
		
		  explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectfirstOwner()));
		  findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectfirstOwner()).click();
		
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectfirstOwner()));
		  findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectfirstOwner()).click();
		  
		  
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		  
		  //following code for second owner
		  
		  explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectSecondOwner()));
		  findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectSecondOwner()).click();
		  
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectSecondOwner()));
		  findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectSecondOwner()).click();
		
		*/
		
		 int TotalOwners = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllOwnerDropdown()).size();
		 System.out.println("Total Numeber of Available Owners are : "+TotalOwners);
		 
		 for(int i=1; i<=TotalOwners; i++)
		 {
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			 
			WebElement checkbox = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[2]//div[contains(@class,'filterPanelDataviewScroll')]/div["+i+"]//input"));
			 
			explicitWaitVisibilityOf(checkbox);
			checkbox.click();
			
			// try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			System.out.println("Owner CheckBox is selected: "+ i);
			
			WebElement checkbox1 = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[2]//div[contains(@class,'filterPanelDataviewScroll')]/div["+i+"]//input"));
			
			if (checkbox1.isSelected());
			{
				checkbox1.click();
				
				System.out.print("again OwnerCheckbox is Deselected");
			}
			
			
		 }
		 
		 
		 // clicking on category dropdown 
		 
	     findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).get(SizeofallfilterElement - 4).click();
		  
		 int allAvailableCategory = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.allCategoryCheckboxXpath()).size();
		 System.out.println("Total Available Category are :"+allAvailableCategory);
		 
		 for(int i=1; i<=allAvailableCategory; i++)
		 {
			 
		 WebElement category = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[3]//div[contains(@class,'filterPanelDataviewScroll')]/div["+i+"]//input[@type='checkbox']"));
		 explicitWaitVisibilityOf(category);
		 
		 category.click();
		 System.out.println("Category Checkbox is selected :"+i);
		 
		 WebElement category1 = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[3]//div[contains(@class,'filterPanelDataviewScroll')]/div["+i+"]//input[@type='checkbox']"));
		 
		   if(category1.isSelected())
		   {
			 category1.click();
			 System.out.println();
			 
			 System.out.println("Again Category Checkbox is Deselected");
		   }
		 
			 
		}
		 
		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
			findElement(By.xpath("//body")).click();
		 
		 
	
    }
    
    public void AddStickersfromStickersColumnAndAutomateStickerfilterdropdown()
    {
    	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
         actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
			
         try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
			findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
			
			
		
		 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
			
			System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
			
			
			for(int i=0; i<AllConstraintcolumn.size(); i++)
			{
				String names = AllConstraintcolumn.get(i).getText();
				
				
				if (names.equals("Stickers")) {
			       
			        
					AllConstraintcolumn.get(i).click();		
	     
			     }
				
           }   
			
			
			explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.AddStickersOnfirstCard()));
			
			actions.doubleClick(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.AddStickersOnfirstCard())).build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		    explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectSticker()));
		    findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SelectSticker()).click();
		    
		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSaveAfterselectStickers()));
		    findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSaveAfterselectStickers()).click();
		    
		    
		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		   
		    explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard()));
		    findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard()).click();
		    
		    
		  //   wait.until(ExpectedConditions.visibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard())));
		  //   findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickingOnfilterCard()).click();
    	    
		     try {Thread.sleep(1000);} catch (InterruptedException ie) {}
    	
		     explicitWaitElementToBeVisibleAllListItems(findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()));
			 int SizeofallfilterElement = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).size();
			
			 findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).get(SizeofallfilterElement - 3).click();
			
			 int allAvailableStickers = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllStickersCheckboxes()).size();
			 System.out.println("Total Available Stickers are :"+allAvailableStickers);
			 
			 for(int i=1; i<=allAvailableStickers; i++)
			 {
				 
			 WebElement Sticker = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[4]//div[contains(@class,'filterPanelDataviewScroll')]/div["+i+"]//input[@type='checkbox']"));
			 explicitWaitVisibilityOf(Sticker);
			 
			 Sticker.click();
			 System.out.println("Sticker Checkbox is selected :"+i);
			 
			 WebElement Stickers1 = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[4]//div[contains(@class,'filterPanelDataviewScroll')]/div["+i+"]//input[@type='checkbox']"));
			 
			   if(Stickers1.isSelected())
			   {
				   Stickers1.click();
				   
				   System.out.println("Again Sticker Checkbox is Deselected");
			   }
			 
				 
			}
			 
			 
			try {Thread.sleep(1000);} catch (InterruptedException ie) {}
			 
	    	findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).get(SizeofallfilterElement - 2).click();
    	
         int prioritycheckboxes = findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllPriorityDropdown()).size();
         System.out.println("All available priority checkboxes are :"+prioritycheckboxes);
         
         
         for(int i=1; i<=prioritycheckboxes; i++)
         { 
        	 WebElement priority = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[5]//div[contains(@class,'x-component x-component-default x-scroller')]/div["+i+"]//input[@type='checkbox']"));
        	 explicitWaitVisibilityOf(priority);
        	 priority.click();
        	 System.out.println("priority checkbox is selected : "+i);
        	 
        	 WebElement priority1 = findElement(By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[5]//div[contains(@class,'x-component x-component-default x-scroller')]/div["+i+"]//input[@type='checkbox']"));
        	 
        	 if(priority1.isSelected())
        	 {
        		 priority1.click();
        		 System.out.println("Again priority checkbox is deselected");
        	 }
         }
         
         
         findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.AllfilterdropdownElement()).get(SizeofallfilterElement - 1).click();
    	
  
    	WebElement slider1 = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SliderLeftlable());
    	
    	
    	System.out.println("\nlocation of left slider :"+slider1.getLocation());
    	System.out.println("Height and width of the left slider :"+slider1.getSize());
    	
    
 
    	Actions act =new Actions(driver);
    	
    	act.dragAndDropBy(slider1, 200, 0).build().perform();
    	
       String percentage = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.PercentageOnCardleftSlider()).getText();
       System.out.println("\nleft slider drag on :"+percentage+"%");
    	
        //System.out.println("location of left slider after adding 100 pixel :"+slider1.getLocation());
    	//System.out.println("Height and width of left slider :"+slider1.getSize());
    	
    	
       act.dragAndDropBy(slider1, -200, 0).perform();
       
       String percentage1= findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.PercentageOnCardleftSlider()).getText();
       System.out.println("left slider drag on :"+percentage1+"%");
       
       
       
       
       
       
    
    	WebElement slider2 = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.SliderRightlabel());
        
        System.out.println("\nlocation of right slider :"+slider2.getLocation());
        System.out.println("height and width of right slider :"+slider2.getSize());
    	
    	
    	act.dragAndDropBy(slider2, -150, 0).build().perform();
    	
    	try {Thread.sleep(1000);} catch (InterruptedException ie) {}
    	
       // System.out.println("location of right slider after reducing  :"+slider2.getLocation());
       // System.out.println("height and width of right slider after reducing :"+slider2.getSize());
        
    	
    	
    	String percentage2 = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.PercentageOnCardRightSlider()).getText();
    	System.out.println("\nright slider drag on :"+percentage2+"%");
        
    	act.dragAndDropBy(slider2, 200, 0).perform();
    	
    	String percentage3 =findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.PercentageOnCardRightSlider()).getText();
    	System.out.println("right slider drag on :"+percentage3+"%");
    	
    	
    	
    	
    	try {Thread.sleep(1000);} catch (InterruptedException ie) {}
    	
    	
    	/*
    	List<WebElement> dropdowns = driver.findElements(By.xpath("//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/div[position() > 1]"));

    	for (WebElement dropdown : dropdowns) {
    		
    		explicitWaitVisibilityOf(dropdown);
    	    dropdown.click(); // Click on the dropdown to expand it

    		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
    	    
    	    List<WebElement> checkboxes = dropdown.findElements(ToCheckingHeaderButtonsOnCalendarViewLocator.CheckAllCheckboxfourxpath());
    	    for (WebElement checkbox : checkboxes) {
    	    	explicitWaitVisibilityOf(checkbox);
    	        checkbox.click(); // Click on each checkbox inside the dropdown
    	    }
    	}
    	*/
    	
    	
    	
    	List<WebElement>dropdownElements = driver.findElements(By.xpath("//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/div[position() > 1]"));
    	
    	System.out.println("Size of dropdown elements are :"+dropdownElements);
    	
    	for(int i=0; i<dropdownElements.size(); i++)
    	{ 
    		WebElement dropdown = dropdownElements.get(i);
    		
    		
    		
    		//WebElement dropdown = findElement(By.xpath("//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/div[position() > 1]["+i+"]"));
    		explicitWaitVisibilityOf(dropdown);
    		dropdown.click();
    		
    		if(i!=4)
    		{
    		List<WebElement>checkboxes = driver.findElements(By.xpath("//span[text()='Check All:']"));
    		
    		WebElement checkbox = checkboxes.get(i);
    		
    		explicitWaitVisibilityOf(checkbox);
    		checkbox.click();
    		
    		}
    		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
    	}
    	
    	try {Thread.sleep(1000);} catch (InterruptedException ie) {}
    	
    	
    	explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSavefilterButton()));
    	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSavefilterButton()).click();
    	
    	try {Thread.sleep(3000);} catch (InterruptedException ie) {}
    	driver.switchTo().window(firstWindowhandle);
    	
    	
    	/*
    	try {Thread.sleep(5000);} catch (InterruptedException ie) {}
    	
    	//explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.filterIconOnKb()));
    	
    	String filterIconClassAttributeValue = findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.filterIconOnKb()).getAttribute("class");
    	System.out.println(filterIconClassAttributeValue);
    	
    	if (filterIconClassAttributeValue.contains("offFilterCls")) 
    	{
			System.out.println("filterIcon not displaying green and filter not saved");
		}
    	else {
    		
    		System.out.println("filterIcon Displaying Green and filter Saved on calendarView");
    	}
    	*/
    	
    	try {Thread.sleep(2000);} catch (InterruptedException ie) {}
    	
    	Set<String> windows= driver.getWindowHandles();
    	
    	//driver.switchTo().window(windows.get)   // Convert the Set to a List to access elements by index
    	
    	List<String>windowhandles = new ArrayList<>(windows);
    	
    	
    	driver.switchTo().window(windowhandles.get(1));
    	
    	
    	explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.filerBykeyword()));
    	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.filerBykeyword()).sendKeys("Critical");
    	

    	explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSavefilterButton()));
    	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnSavefilterButton()).click();
    	
    	try {Thread.sleep(1000);} catch (InterruptedException ie) {}
    	
    	explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClearfilterButton()));
    	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClearfilterButton()).click();
    	
    	try {Thread.sleep(2000);} catch (InterruptedException ie) {}
    	explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClosefilterPanel()));
    	findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClosefilterPanel()).click();
    	
    	
    
    		
    	
    	
    }
    
    

}

    
             












   

	

