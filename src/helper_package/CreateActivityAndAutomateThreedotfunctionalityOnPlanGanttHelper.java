package helper_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;
import pom_package.PlanGanttActivityAndKanbanCardLinkToActivityLocator;

public class CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper extends CommonMethodsOfWebDriver {

	
	

	  public static String createFolderNameRandomly,createProjectNameRandomly,ActivityStartDateWhileCreating,getIframeWindowNameAttributeValue,handlevaluefokanbanBoardwindow,kanbanBoardwindowhandless;
	  public static int sizeofSchedulemodeonactivity,sizeOfElementOnPG;
	  public static int initialDividerBarPosition;
	  public static String getIframeSRCAttribute,childIframevalue,textAreaIDAttribute;
		
	
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
			
		    explicitWaitElementToBeClickable(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnThreeDots()));
		    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnThreeDots()).click();
		    
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
		    
		    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCreatedProject()));
		    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCreatedProject()).click();
		    
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
		    
		   //explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()));
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

	          
	       // click on activity

		    int addNewActivitySize = findElements(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addNewActivity()).size();
		    System.out.println("Add New Column size is :"+addNewActivitySize);
			 
			 
			driver.findElements(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addNewActivity()).get(addNewActivitySize-1).click();
			 
				
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			//findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("Activity1");
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
		    
		    
		    explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());
		    
			 try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		    
			 
	  }
	  
	  public void addButtonfunctionality()
	  {
		  
			 //for activity above 
		  
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
	  	    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();
	  	    
	  	    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityAbove()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityAbove()).click();
	  	    
	  		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("ActivityAbove");
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
		    
			    
			    
		    //for activity below
		    
	    	explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		    
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
	  	    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();
	  	    
	  	    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityBelow()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityBelow()).click();
	  	    
	  		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("ActivityBelow");
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
		    
		    //for milestone
			    
	    	explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

	    	
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
	  	    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();
	  	    
	  	    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addMilestone()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addMilestone()).click();
	  	    
	  		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("milestone1");
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
		    
	       // for activity group
		    
	    	explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

	    	
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
	  	    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnAddButton()).click();
	  	    
	  	    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  	    
	  	    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityGroup()));
	  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.addActivityGroup()).click();
	  	    
	  		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("ActivityGroup1");
		    findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
		    
			explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

	
       }
	  
	  
	  
	  
	  
	  public void clickOnDiscussTabOnActivity()
	  {
		    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
	  	    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
	  	    
		    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumn()));
		    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumn()).click();
		    
		 
		    explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
			
		   
		    explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe());
			
		   
		
		    getIframeSRCAttribute=findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe()).getAttribute("src");
		    System.out.println("src :"+getIframeSRCAttribute);
			
		    driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iFrameSrcValueAndSwitchToframe()));
			
			
			handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardSettingLocators.clickOnPostLink());
		  
			explicitWaitElementToBeLocated(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility());
			boolean postWindowVisibility = findElement(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
			System.out.println("Post window visibility :"+postWindowVisibility);
		  
	   	  if(postWindowVisibility==true)
		  {
			 explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe());
			 childIframevalue= findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe()).getAttribute("class");
			 System.out.println("childIframe class attribute value :"+childIframevalue);
			 
			 driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getChildiFrameClassAttributeValue()));
			 
			 explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea());
			 findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea()).click();


			 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			 boolean chatterArea = findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).isDisplayed();
			 System.out.println("chatter area is visible :"+chatterArea);
			
			if(chatterArea==true)
			{
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).sendKeys("Hello this chatter on activity on plan gantt Board");
				
				try{Thread.sleep(1000);}catch(InterruptedException ie) {}
				driver.switchTo().parentFrame();
				
				explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()));
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()).click();
				
				
				try{Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.textDivArea());		
				textAreaIDAttribute = findElement(AddKanbanCardRegressionOnCalendarViewLocater.textDivArea()).getAttribute("id");
				System.out.println("Kanban Board Chatter text Area ID Attribute LINE 1356 :"+textAreaIDAttribute);
			
				try{Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getTextFromChatterSubWindowofActivity());	
			    String chatterText = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getTextFromChatterSubWindowofActivity()).getText();
			    System.out.println("After Chatter get text from chatter sub window LINE 1360 :"+chatterText);
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			    
				
			   // driver.switchTo().defaultContent();
				
				driver.switchTo().parentFrame();
			 
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup());
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup()).click();	
				
				
			}
			  
			  
		  } 
		  
	  }
	  
	  
	  
	  
	  
	  
	  public void convertToActivityGroup()
	  {
		  
		  
		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		   explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
    	   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
		  	    
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivityGroup()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivityGroup()).click();
		  
		  
		  // click on activityBelow
		   
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()).click();
		  
		  explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.savingChangesLoadmask());

		  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()).click();
		  
		  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		  explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.savingChangesLoadmask());

		  

		  // following code for external dependency
		  
		  
		  
		  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		  
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency()).click();
		  
		 
		  try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		  
	      //Set<String>windows = driver.getWindowHandles();
	        
	      ArrayList<String>alltabs = new ArrayList<String>(driver.getWindowHandles());
	     
		  driver.switchTo().window(alltabs.get(1));
		  
		  explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());
		 
		  try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		  
		  //explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.activityhighlighting()));
		 
		  
		  
		  boolean highlightelement = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.activityhighlighting()).isDisplayed();
		  
		  if(highlightelement==true)
		  {
				 System.out.println("after click on external dependency and switch to new tab activity highlighted By Red flash: "+highlightelement);

		  }
		  else
		  {
			  System.out.println("after clicking on external dependency and switch to new tab activity is not highlighting");
		  }
	
		 
		
		   // try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		  
	        Set<String>windows = driver.getWindowHandles();
		  
		   //  String mainwindow = driver.getWindowHandle();
		  
	       //  try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		   
		   driver.switchTo().window(alltabs.get(0));
		  

		   driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']/iframe")));
		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}

		
		   //switchToiFrame("boardIfram");
			
		   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='boardIfram']")));
			
			
			
		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		   
		     //create new method for quick actions
		   
		  // explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnQuickActions()));
		  // findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnQuickActions()).click();
		 
		  
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()).click();
		   
		   explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());
		 
		   // following code for delete the activity
		   
		   
		   try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();
		   
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()).click();
		   
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()).click();
		   
		   
		   
		   try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();
		   
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnActivity()).click();
		   
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()).click();
	
		   
		   explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deletingLoadmask());
		   
		     
	  }
	  
	  public void convertTomilestone()
	  {
		  
		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		   
	       //convert to milestone
		   
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		   
		  
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.converttomilestone()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.converttomilestone()).click();
		  
		  
		   explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());

		  
		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		   
		  //clicking on indent
		   
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		   
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnIndent()).click();
		  
		  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		  //clicking on outdent 
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		   
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnOutdent()).click();
		  
		  //clicking on clone option
		  
		  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnCloneOptions()).click();
		  
		  explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());
		  
		  
		  
		  //click on external dependency on milestone
		  
		  
		  try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnmilestone()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnmilestone()).click();
		   
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnExternalDependency()).click();
		  
		  	  
		  try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		  
	      //Set<String>windows = driver.getWindowHandles();
	        
	      ArrayList<String>alltabs = new ArrayList<String>(driver.getWindowHandles());
	     
		  driver.switchTo().window(alltabs.get(1));
		  
		  explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.Loadmaskloader());
		 
		  try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		  
		//  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.milestoneHighlighting()));
		//  boolean milestonehighlightelement = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.milestoneHighlighting()).isDisplayed();
		  
		//  if(milestonehighlightelement==true)
		//  {
		///		 System.out.println("after click on external dependency and switch to new tab activity highlighted By Red flash: "+milestonehighlightelement);
		 // }
		 // else
		 // {
			//  System.out.println("after clicking on external dependency and switch to new tab activity is not highlighting");
		 // }

		 
		
		  // try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		  
	        Set<String>windows = driver.getWindowHandles();
		  
		   // String mainwindow = driver.getWindowHandle();
		  
	       // try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		   
		   driver.switchTo().window(alltabs.get(0));
		   
		   driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='iframe-parent slds-template_iframe slds-card']/iframe")));
		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}

		
		   //switchToiFrame("boardIfram");
			
		   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='boardIfram']")));
			

		  //clicking on delete option
		  
		  try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()).click();
		  
		  
		  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()));
		  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectNoOptions()).click();
		   
		   
		   
		   try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnfirstActivity()).click();
		   
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deleteOptionOnMilestone()).click();
		   
		   explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()));
		   findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.selectYesOptions()).click();
	
		   explicitWaitElementBy("invisibilityOfElementLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.deletingLoadmask());
		   
		 // converting milestone to activity
		   
		   
	    	  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	    	 
	    	 
	    	  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
			  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
			  
			  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		   
			  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivity()));
			  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.convertToActivity()).click();
			  
			  
			  
		  
		   
	  }
	  
	  
	  
	 
	  
	     public void discusstabOnmilestone()
	     {
	    	    explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.threedotOnMilestone());
		  	    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.threedotOnMilestone()).click();
		  	    
			    explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumn()));
			    findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnDiscussColumn()).click();
			    
			    explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
				
			    try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			    
			    explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe());
				
			    getIframeSRCAttribute=findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.inspectiframe()).getAttribute("src");
			    System.out.println("src :"+getIframeSRCAttribute);
				
			    driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iFrameSrcValueAndSwitchToframe()));
				
				
				handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardSettingLocators.clickOnPostLink());
			  
				explicitWaitElementToBeLocated(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility());
				boolean postWindowVisibility = findElement(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
				System.out.println("Post window visibility :"+postWindowVisibility);
			  
		   	    if(postWindowVisibility==true)
			    {
				 explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe());
				 childIframevalue= findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe()).getAttribute("class");
				 System.out.println("childIframe class attribute value :"+childIframevalue);
				 
				 driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getChildiFrameClassAttributeValue()));
				 
				 explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea());
				 findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea()).click();


				 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				 boolean chatterArea = findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).isDisplayed();
				 System.out.println("chatter area is visible :"+chatterArea);
				
				if(chatterArea==true)
				{
					explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()));
					findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).sendKeys("Hello this chatter on milestone on plan gantt Board");
					
					try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					driver.switchTo().parentFrame();
					
					explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()));
					findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()).click();
					
					
					try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.textDivArea());		
					textAreaIDAttribute = findElement(AddKanbanCardRegressionOnCalendarViewLocater.textDivArea()).getAttribute("id");
					System.out.println("Kanban Board Chatter text Area ID Attribute LINE 1356 :"+textAreaIDAttribute);
				
					try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getTextFromChatterSubWindowofActivity());	
				    String chatterText = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.getTextFromChatterSubWindowofActivity()).getText();
				    System.out.println("After Chatter get text from chatter sub window LINE 1360 :"+chatterText);
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				    
					
				    // driver.switchTo().defaultContent();
					
					driver.switchTo().parentFrame();
				 
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup());
					findElement(AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup()).click();	
					
				}
				  
				  
			 } 
	    	  
	    	  
	  
	     }
	     
	     public void quickActionsOnactivity()
	     {
	    	 
	    	  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	    	 	    	 
	    	  explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()));
			  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnActivityBelow()).click();
			  
			  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			  
			  
		      //explicitWaitVisibilityOf(findElement(createactivity))
			  
			    actions.moveToElement(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.quickActionstabOnActivity())).build().perform();
			  
			  
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnChangeDatequickActionsOnActivity());
				findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnChangeDatequickActionsOnActivity()).click();
				
			  // explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.isChangeDateWindowVisible());
				
			   // boolean isChangeDateQuickActionWindowVisible = findElement(KanbanBoardRegressionLocators.isChangeDateWindowVisible()).isDisplayed();
				
				try {Thread.sleep(6000);}catch(InterruptedException ie) {}
				
				driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iframeOnQuickActions()));
				
				boolean isChangeDateQuickActionWindowVisible = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.isChangeDateWindowVisible()).isDisplayed();
				System.out.println("After click on change date quick action popup window open LINE 1088 :"+isChangeDateQuickActionWindowVisible);
				
				if(isChangeDateQuickActionWindowVisible == true)
				{
					
					
		
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.isStartDateCalendarVisibleUnderiFrame());
					boolean isStartDateFieldVisible = findElement(KanbanBoardRegressionLocators.isStartDateCalendarVisibleUnderiFrame()).isDisplayed();
					System.out.println("Start Date Field LINE 1096 under iFrame is visible and now click on Due Date calendar.");
					
					if(isStartDateFieldVisible == true)
					{
						try {Thread.sleep(2000);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnQuickActionDueDateCalendarField());
						findElement(KanbanBoardRegressionLocators.clickOnQuickActionDueDateCalendarField()).click();
						
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.dueDateQuickActionCalendarAfterOnClick());
						boolean dueDateCalendarQuickAction = findElement(KanbanBoardRegressionLocators.dueDateQuickActionCalendarAfterOnClick()).isDisplayed();
						System.out.println("dueDateCalendarQuickAction LINE 1106 :"+dueDateCalendarQuickAction);
						
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						scrollDown();
						
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar());
						String getSelectedDateFromQuickActionDueDateCalendar = findElement(KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar()).getText();
						System.out.println("getSelectedDateFromQuickActionDueDateCalendar LINE 1114 :"+getSelectedDateFromQuickActionDueDateCalendar+" is selected date currently.");
							
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar());
						String getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar = findElement(KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar()).getAttribute("aria-selected");
						System.out.println("getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar LINE 1118 under Quick action Due Date calendar :"+getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar);
						
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.getAllRowElementsOfSelectDate());
						int getSizeOfAllRowElementsOfSelectDate = findElements(KanbanBoardRegressionLocators.getAllRowElementsOfSelectDate()).size();
						System.out.println("getSizeOfAllRowElementsOfSelectDate LINE 1122 under Quick action Due Date calendar :"+getSizeOfAllRowElementsOfSelectDate);
						
						for(int i=1; i<=getSizeOfAllRowElementsOfSelectDate; i++)
						{                                                                   
							String classAttributeValueOfTdElement = findElement(By.xpath("//td[@aria-selected='true']/parent::tr/child::td["+i+"]")).getAttribute("aria-selected");
							System.out.println("classAttributeValueOfTdElement LINE 1127 after "+i +" iteration :"+classAttributeValueOfTdElement);
							
							if(getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar.equals(classAttributeValueOfTdElement) && i<=5)
							{
								try {Thread.sleep(1000);}catch(InterruptedException ie){}
								findElement(By.xpath("//td[@aria-selected='true']/parent::tr/child::td["+(i+2)+"]")).click();
								try {Thread.sleep(1000);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction());
								findElement(KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
								break;
							}
							else if(getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar.equals(classAttributeValueOfTdElement) && i>=6)
							{
								try {Thread.sleep(1500);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectDateFromQuickActionCalendarOnNextRow());
								findElement(KanbanBoardRegressionLocators.selectDateFromQuickActionCalendarOnNextRow()).click();
								try {Thread.sleep(2000);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction());
								findElement(KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
								break;
							}
						}
					}
				}

			
			else
			{
				//perform random click on kanban board
				try
				{
					robot = new Robot();
				}
				catch(AWTException awtExc) {}
				
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				robot.mouseMove(500, 500);
				actions.click().build().perform();
			}
			  
			 	 
	    	 
	     }
	     
	     
	     
	    
	     public void quickActionsOnMilstone() 
	     {
	    
	    	 
	    	  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	    	 	    	 
	    	  //explicitWaitVisibilityOf(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnmilestone1()));
	    	  
			  actions.moveToElement(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnmilestone1())).contextClick().build().perform();
			  
			  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			  
		      //explicitWaitVisibilityOf(findElement(createactivity))
			  
			  actions.moveToElement(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.quickActionstabOnActivity())).build().perform();
			  
			  
			  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			  explicitWaitElementBy("elementToBeLocated", CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnChangeDatequickActionsOnActivity());
			  findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.clickOnChangeDatequickActionsOnActivity()).click();
				
			   // explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.isChangeDateWindowVisible());
				
			   // boolean isChangeDateQuickActionWindowVisible = findElement(KanbanBoardRegressionLocators.isChangeDateWindowVisible()).isDisplayed();
				
			  try {Thread.sleep(6000);}catch(InterruptedException ie) {}
				
			  driver.switchTo().frame(findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.iframeOnQuickActions()));
				
			  boolean isChangeDateQuickActionWindowVisible = findElement(CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator.isChangeDateWindowVisible()).isDisplayed();
			  System.out.println("After click on change date quick action popup window open LINE 1088 :"+isChangeDateQuickActionWindowVisible);
				
				if(isChangeDateQuickActionWindowVisible == true)
				{
				
		
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.isStartDateCalendarVisibleUnderiFrame());
					boolean isStartDateFieldVisible = findElement(KanbanBoardRegressionLocators.isStartDateCalendarVisibleUnderiFrame()).isDisplayed();
					System.out.println("Start Date Field LINE 1096 under iFrame is visible and now click on Due Date calendar.");
					
					if(isStartDateFieldVisible == true)
					{
						try {Thread.sleep(2000);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnQuickActionDueDateCalendarField());
						findElement(KanbanBoardRegressionLocators.clickOnQuickActionDueDateCalendarField()).click();
						
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.dueDateQuickActionCalendarAfterOnClick());
						boolean dueDateCalendarQuickAction = findElement(KanbanBoardRegressionLocators.dueDateQuickActionCalendarAfterOnClick()).isDisplayed();
						System.out.println("dueDateCalendarQuickAction LINE 1106 :"+dueDateCalendarQuickAction);
						
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						scrollDown();
						
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar());
						String getSelectedDateFromQuickActionDueDateCalendar = findElement(KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar()).getText();
						System.out.println("getSelectedDateFromQuickActionDueDateCalendar LINE 1114 :"+getSelectedDateFromQuickActionDueDateCalendar+" is selected date currently.");
							
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar());
						String getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar = findElement(KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar()).getAttribute("aria-selected");
						System.out.println("getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar LINE 1118 under Quick action Due Date calendar :"+getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar);
						
						explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.getAllRowElementsOfSelectDate());
						int getSizeOfAllRowElementsOfSelectDate = findElements(KanbanBoardRegressionLocators.getAllRowElementsOfSelectDate()).size();
						System.out.println("getSizeOfAllRowElementsOfSelectDate LINE 1122 under Quick action Due Date calendar :"+getSizeOfAllRowElementsOfSelectDate);
						
						for(int i=1; i<=getSizeOfAllRowElementsOfSelectDate; i++)
						{                                                                   
							String classAttributeValueOfTdElement = findElement(By.xpath("//td[@aria-selected='true']/parent::tr/child::td["+i+"]")).getAttribute("aria-selected");
							System.out.println("classAttributeValueOfTdElement LINE 1127 after "+i +" iteration :"+classAttributeValueOfTdElement);
							
							if(getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar.equals(classAttributeValueOfTdElement) && i<=5)
							{
								try {Thread.sleep(1000);}catch(InterruptedException ie){}
								findElement(By.xpath("//td[@aria-selected='true']/parent::tr/child::td["+(i+2)+"]")).click();
								try {Thread.sleep(1000);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction());
								findElement(KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
								break;
							}
							else if(getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar.equals(classAttributeValueOfTdElement) && i>=6)
							{
								try {Thread.sleep(1500);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectDateFromQuickActionCalendarOnNextRow());
								findElement(KanbanBoardRegressionLocators.selectDateFromQuickActionCalendarOnNextRow()).click();
								try {Thread.sleep(2000);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction());
								findElement(KanbanBoardRegressionLocators.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
								break;
							}
						}
					}
				}

			
			else
			{
				//perform random click on kanban board
				try
				{
					robot = new Robot();
				}
				catch(AWTException awtExc) {}
				
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				robot.mouseMove(500, 500);
				actions.click().build().perform();
			}
			  
			 	 
	    	 
	     }
	     
	     
	     
	     	     
}