package helper_package;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.AddNewColumsOnPGLocater;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.ToAddingConstraintsColumnInCVLocators;

public class AddNewColumsOnPGHelper extends CommonMethodsOfWebDriver {

	  public static String createFolderNameRandomly,createProjectNameRandomly,ActivityStartDateWhileCreating,getIframeWindowNameAttributeValue,handlevaluefokanbanBoardwindow,kanbanBoardwindowhandless;
	  public static int sizeofSchedulemodeonactivity,sizeOfElementOnPG;
	  public static int initialDividerBarPosition;
		
	
	  public void Create_SingleActivity()
	  {
		  
			
			  try {Thread.sleep(4000);}catch(InterruptedException ie) {} WebDriverWait wait
			  = new WebDriverWait(driver, Duration.ofSeconds(30));
			  
			  String newTabTitle = driver.getTitle();
			  System.out.println("New title of the tab is: " + newTabTitle);
			  //wait.until(ExpectedConditions.titleIs(newTabTitle));
			  
			  wait.until(ExpectedConditions.titleIs("Leankor | Salesforce"));
			 
			
		    try {Thread.sleep(8000);}catch(InterruptedException ie) {}
			
			
			
		    explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()).click();
			
			//wait.until(ExpectedConditions.presenceOfElementLocated(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()));
			
		 //   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			//findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()).click();
			
			createFolderNameRandomly = generateRandomString(6);
		    System.out.println("folder name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg class:: "+createFolderNameRandomly);
		    
		    findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterFolderName()).sendKeys("A "+createFolderNameRandomly);
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddButton()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddButton()).click(); 
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			scrollinToView(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
			explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
			jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A "+createFolderNameRandomly+"']")));
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
		    explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.clickOnThreeDots()));
		    findElement(AddNewColumsOnPGLocater.clickOnThreeDots()).click();
		    
		    createProjectNameRandomly = generateRandomString(5);
			System.out.println("Project name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg ::"+createProjectNameRandomly);
				
		    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()));
		    findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()).click();
		    
		    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()));
		    findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()).sendKeys(createProjectNameRandomly);
		  
		    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()));
		    findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()).click();
		    
		   // try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("invisibilityOfElementLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());
		    
		    explicitWaitVisibilityOf(findElement(AddNewColumsOnPGLocater.clickOnCreatedProject()));
		    findElement(AddNewColumsOnPGLocater.clickOnCreatedProject()).click();
		    
		    //explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.Customloadspinner()));
		    
		    explicitWaitElementBy("invisibilityOfElementLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());
		    
		    try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		    
		   // explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()));
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()).click();
		    
		    explicitWaitElementBy("invisibilityOfElementLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());
		    
		    explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());
		    
		  
		   
		    driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));
		    
		    try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		    
		    // explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()));
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		    
	  }
	  
	  public void addPercentageDoneColumn()
	  {
		 int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
		 System.out.println("Add New Column size is :"+addNewColumnSize);
		 
		 
		 driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
		 
		 
		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
		 
		System.out.println("Total Number of popup elements are :"+allPopUpElements);
		 
		for(int i=0; i<allPopUpElements.size(); i++)
		{
			String columnNames = allPopUpElements.get(i).getText();
			
			if(columnNames.equals("% Done")) {
				
				allPopUpElements.get(i).click();
			}
		}
		
		
		
		   //following code for splitter bar 
		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		 
   	     initialDividerBarPosition = findElement(AddNewColumsOnPGLocater.dividerBar()).getLocation().getX();
   	     System.out.println("Initial Slider position :"+initialDividerBarPosition);
   	 
    	 int maxSliderPosition =1250;
   	 
    	// explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.dividerBar());
   	 
   	 
   	 
   	     actions.dragAndDropBy(findElement(AddNewColumsOnPGLocater.dividerBar()), maxSliderPosition, 0).build().perform();
   	 
   	 
   		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		  
		  
	  }
	  
	  public void addAssignedResourceColumn()
	  {
		  
		  explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		  findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		  
	      int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
		  System.out.println("Add New Column size is :"+addNewColumnSize);
			 
			 
		  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
			 
			 
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
			 
			System.out.println("Total Number of popup elements are :"+allPopUpElements);
			 
			for(int i=0; i<allPopUpElements.size(); i++)
			{
				String columnNames = allPopUpElements.get(i).getText();
				
				if(columnNames.equals("Assigned Resources")) {
					
					allPopUpElements.get(i).click();
				}
			}
	  }
	  
	  public void addCategoryColumn()
	  {
		  
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Category")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
	  }
	  
	  
	  
	  public void addDescriptionColumn()
	  {
		  
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Description")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
		  
	  }
	  
	  public void addDiscussColumn()
	  {
		  
      	    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Discuss")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
	  }
	  
	  
	  public void addElapsedTimeColumn()
	  {
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		  
		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Elapsed Time")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
		  
	  }
	  
	  public void addFilesColumn()
	  {
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Files")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
				
	  }
	  
	  public void addOnHoldColumn()
	  {
		  
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("On Hold")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
				
	   }
	  
	  public void addPredecessorColumn()
	  {
		  
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Predecessors")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
				
	  }
	  
	  
	  public void addPriorityColumn()
	  {
		  
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		  
		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Priority")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
				
	  }
	  
	  public void addRiskColumn()
	  {
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Risk")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
	  }
	  
	  public void addSequenceColumn()
	  {
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Sequence")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
	  }
	  
	  public void addStickersColumn()
	  {
		      explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		      findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		      int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			  System.out.println("Add New Column size is :"+addNewColumnSize);
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
			  System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Stickers")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
	  }
	  
	  public void addSuccessorsColumn()
	  {
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Successors")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
				
	  }
	  
	  public void addTimetoLaunchColumn()
	  {
		     explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		     findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		     int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
			 System.out.println("Add New Column size is :"+addNewColumnSize);
				 
				 
			  driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize-1).click();
				 
				 
			  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			  List<WebElement>allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
				 
				System.out.println("Total Number of popup elements are :"+allPopUpElements);
				 
				for(int i=0; i<allPopUpElements.size(); i++)
				{
					String columnNames = allPopUpElements.get(i).getText();
					
					if(columnNames.equals("Time To Launch")) {
						
						allPopUpElements.get(i).click();
					}
			
				
			   }
				
	  }
	  
	  
	  // following code for removing the Added columns
	  
	  public void removePercentageDoneColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removePercentageDoneColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removePercentageDoneColumn())).build().perform();
			
            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofPercentageDoneColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofPercentageDoneColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
				  
	  }
	  
	  
	  public void removeAssignedResourceColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeAssignedResourceColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeAssignedResourceColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofAssignedResourceColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofAssignedResourceColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  public void removeCategoryColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeCategoryColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeCategoryColumn())).build().perform();
			
           try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofCategoryColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofCategoryColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		   explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		   findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  public void removeDescriptionColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeDescriptionColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeDescriptionColumn())).build().perform();
			
           try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofDescriptionColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofDescriptionColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		   explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		   findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  
	  public void removeDiscussColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeDiscussColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeDiscussColumn())).build().perform();
			
           try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofDiscussColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofDiscussColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  
	  public void removeElapsedTimeColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeElapsedTimeColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeElapsedTimeColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofElapsedTimeColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofElapsedTimeColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		   explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		   findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  
	  public void removeFilesColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeFilesColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeFilesColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofFilesColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofFilesColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		   explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		   findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  
	  
	  public void removeOnHoldColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeOnHoldColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeOnHoldColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofOnHoldColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofOnHoldColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		   explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		   findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  
	  public void removePredecessorColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removePredecessorColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removePredecessorColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofPredecessorColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofPredecessorColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  public void removePriorityColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removePriorityColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removePriorityColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofPriorityColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofPriorityColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  public void removeRiskColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeRiskColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeRiskColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofRiskColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofRiskColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		   explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		   findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  public void removeSequenceColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeSequenceColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeSequenceColumn())).build().perform();
		 	
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofSequenceColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofSequenceColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
	
	  }
	  
	  public void removeStickersColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeStickersColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeStickersColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofStickersColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofStickersColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		   explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		   findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  public void removeSuccessorsColumn()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeSuccessorsColumn());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeSuccessorsColumn())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofSuccessorColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofSuccessorColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  public void removeTimeToLaunch()
	  {

		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    
		    explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeTimeToLaunch());
			
            actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeTimeToLaunch())).build().perform();
			
            try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofTimeToLaunchColumn()));
			findElement(AddNewColumsOnPGLocater.triggerofTimeToLaunchColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		    explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
		    findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		
	  }
	  
	  
	  
	 	    
		    

}
