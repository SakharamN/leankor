package helper_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.CreateSingleMilestoneAndAutomateEditInformationfieldLocator;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;
import pom_package.PlanGanttActivityAndKanbanCardLinkToActivityLocator;

public class CreateSingleMilestoneAndAutomateEditInformationfieldHelper extends CommonMethodsOfWebDriver {
	

	  public static String createFolderNameRandomly,createProjectNameRandomly,ActivityStartDateWhileCreating,getIframeWindowNameAttributeValue,handlevaluefokanbanBoardwindow,kanbanBoardwindowhandless;
	  public static int sizeofSchedulemodeonactivity,sizeOfElementOnPG;
	
	public void singleMilestone()
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
		
	    explicitWaitElementToBeClickable(findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDot()));
	    findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDot()).click();
	    
	    createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg ::"+createProjectNameRandomly);
			
	    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()));
	    findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()).click();
	    
	    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()));
	    findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()).sendKeys(createProjectNameRandomly);
	  
	    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()));
	    findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()).click();
	    
	    try {Thread.sleep(4000);}catch(InterruptedException ie) {}
	    
	    explicitWaitElementBy("invisibilityOfElementLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());
	    
	    explicitWaitVisibilityOf(findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnCreatedProject()));
	    findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnCreatedProject()).click();
	    
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
	    

	   // explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addActivity());
	   // findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addActivity()).click();
	   
	  

		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		int sizeOfElementOnPG = driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).size();
		System.out.println("Number of elements of sizeof elements :"+sizeOfElementOnPG);		
		driver.findElements(PlanGanttActivityAndKanbanCardLinkToActivityLocator.AddNewActivityButton()).get(sizeOfElementOnPG-1).click();
	    
		
    	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	   //findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
        findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys("milestone1");
     	findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).sendKeys(Keys.ENTER);
	    
	    
		/*
		 * explicitWaitElementBy("elementToBeLocated",
		 * CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.
		 * writeActivityNameInputTextfield());
		 * 
		 * findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.
		 * writeActivityNameInputTextfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.
		 * DELETE));
		 * findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.
		 * writeActivityNameInputTextfield()).sendKeys("Activity1");
		 * findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.
		 * writeActivityNameInputTextfield()).sendKeys(Keys.ENTER);
		 */
		   
  	explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());
	
	   
  	try {Thread.sleep(2000);}catch(InterruptedException ie) {}

	
	 explicitWaitElementBy("elementToBeLocated", CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone());
	 findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone()).click();
	
	 try {Thread.sleep(4000);}catch(InterruptedException ie) {}
	 explicitWaitElementBy("elementToBeLocated", CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickingOnEditInformation());
  	 findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickingOnEditInformation()).click();
  	 
  	 explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());
  	 
  	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityCategory()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityCategory()).click();
  	 
  	 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
  	 
  	 explicitWaitElementBy("invisibilityOfElementLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadSpinnerofAddingActivity());
  	 
  	 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
 	 boolean elementsOnPopUp = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.elementsOnPopUp()).isDisplayed();
  	 
 	 if (elementsOnPopUp==true) {
 		
 		 //explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield()).sendKeys("cat1");
	}
  	
	 try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
 	
  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectCategory()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectCategory()).click();
  	 
  	
	// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.SaveActivityButton()));
	// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.SaveActivityButton()).click();
	 
	 
  	 
      //	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()));
      //	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()).sendKeys("activity1");
  	 
 	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()).click();
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()).clear();
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()).sendKeys("This is milestone description");
  	 
     findElement(By.xpath("//body")).click();
  	 
  	
  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.assignOwner()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.assignOwner()).click();
  	 
  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield()).sendKeys("pratish laad");
  	 
  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.OwnerSearchTrigger()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.OwnerSearchTrigger()).click();
  	 
     explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectOwner());
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectOwner()).click();
  	 
  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPriority()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPriority()).click();
  	 
  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectMediumPriority()));
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectMediumPriority()).click();
  	 
  	// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.StartDateCalendar()));
  	// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.StartDateCalendar()).click();
  	 
  	 
    int activityStartDateSize = findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.fetchStartDateOfActivityWhileCreating()).size();
    System.out.println("activityStartDateSize :"+activityStartDateSize);
  	 
  	String	ActivityStartDateWhileCreating = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.fetchStartDateOfActivityWhileCreating()).getAttribute("value");
  	System.out.println("ActivityStartDateWhileCreating :"+ActivityStartDateWhileCreating);
  	 
  	 
    int activityDueDateSize = findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.fetchStartDateOfActivityWhileCreating()).size();
    System.out.println("activityStartDateSize :"+activityStartDateSize);
  	 
  	String	ActivityDueDateWhileCreating = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.fetchStartDateOfActivityWhileCreating()).getAttribute("value");
  	System.out.println("ActivityStartDateWhileCreating :"+ActivityStartDateWhileCreating);
  	
  	 
  	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()));
  	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()).clear();
    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()).sendKeys("2");
  	
    //String getDurationField = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()).getAttribute("value");
    //System.out.println("duration field of activity :"+getDurationField);
  	
  	
  	
 
  	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.deleteCardButton()));
  	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.deleteCardButton()).click();
  	
    try {Thread.sleep(2000);}catch(InterruptedException ie) {}
  	
  	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.alertPopforDeletecardselectNO()));
  	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.alertPopforDeletecardselectNO()).click();
	 
    explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopSaveButton()));
	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopSaveButton()).click();	 
	    
	    
	////this code for three dot
	    
  
	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
     explicitWaitElementBy("elementToBeLocated", CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone());
	 findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone()).click();
	
	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	 explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformationofMilestone());
  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformationofMilestone()).click();
  	 
  	 explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());
  	 
  	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
  
  	
	   
	}
	
	 // adding status of activity 
	  
 	 public void ClickOn_SideStatusColumn()
 	 {
 		 
 		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 		
 	       //  explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
 	      //  findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
 	
 		// try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 	   //   explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformation());
	  //	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformation()).click();
	  	 
    //	 explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());
	  	 
  // 	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_Status()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_Status()).click();
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onTime_dropdown()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onTime_dropdown()).click();
	  	 
	  	 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnTimedropdown()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnTimedropdown()).click();
	  	  
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onQuality_dropdown()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onQuality_dropdown()).click();
	  	 
	  	 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnQualityValueDropDown()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnQualityValueDropDown()).click();
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onBudget_dropdown()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onBudget_dropdown()).click();
	  	 
	  	 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  	 
	  	 //explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnBudgetValueDropDown()));
	  	 boolean redStatus =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnBudgetValueDropDown()).isDisplayed();
	  	 
	  	 if(redStatus ==true)
	  	 {
	  		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnBudgetValueDropDown()).click();
	  	 }
	  	 
	  	 
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.percentageCompleteharveyball()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.percentageCompleteharveyball()).click();
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityStatusDescription()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityStatusDescription()).sendKeys("Activity status is 50 percent");
	  	 
	  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addStatusButton()));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addStatusButton()).click();
	  	 
	  	 
	    boolean Status = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusAddedMsg()).isDisplayed();
	    System.out.println(" Status Added message is displayed After Click On add button :"+Status); 	
	    
	    explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterTab()));
	    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterTab()).click(); 
	    
	    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterDateVerify());
	  
	  	   	 	 
  }
 	 
 	public String verifyDateOfStatusRegister()
 	{
 		String StatusDate = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterDateVerify()).getText().substring(0,11);
 		System.out.println("Activity StatusDate :"+StatusDate+"\n****************************************************************************************************************");
 		return StatusDate;
 	}
 	
 	public String verifyStatusRegisterDescription()
 	{
 		 return findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatusRegisterDescription()).getText();
 	}
 	
 	
 	public String verifyStatusRegisterOnTime()
 	 {
 		 return findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatusRegisterOnTime()).getText();
 	 }
 	
 	public String verifyOnQualityColumn()
 	{
 		return findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatusRegisterOnQuality()).getText();
 	}
 	
 	public String  verifyOnBudgetColumn()
 	{
 		return findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatuRegisterOnBudget()).getText();
 	}
 	
 	public String verifypercentageComplete()
 	{
 		return findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatusRegisterOnPercentageCompleteColumn()).getText();
 	}
 	
 	// following code for  Added LogTime on activity
 	
 	public void ClickOn_SideLogTimeColumn()
 	{
 	
 		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	  		
 		
 		 // following code for sidestatus commented 
 		 /*
 	     explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity());
 	     findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnActivity()).click();
 	
 		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 	     explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformation());
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformation()).click();
	  	 
	  	 explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());
	  	 
	  	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 		 ////
	  	*/

 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_logTime()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_logTime()).click();
 		
 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldforlogtime()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldforlogtime()).click();
 		 
 		 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
 		 
 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnCalendarToday()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnCalendarToday()).click();
 		 
 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUser()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUser()).click();
 		 
 		 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
 		 
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchForUser()).sendKeys("pratish laad");
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchIconOnLogTime()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchIconOnLogTime()).click();
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromList()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromList()).click();
 		
 		for(int i=0; i<=5; i++)
 		{
 			
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLoggedTimeSpinnerUp()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLoggedTimeSpinnerUp()).click();
 		
 		}
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDurationdropdown()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDurationdropdown()).click();
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValueDayFromDurationDropDown()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValueDayFromDurationDropDown()).click();
 		 
 		
 		//explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeDescriptiom()));
 	//	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeDescriptiom()).sendKeys("This is a LogTime Descriptiom");
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLogTimeAddButton()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLogTimeAddButton()).click();
 		
 		
 		String logtimeAddedMSg = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeStatusAddedMSG()).getText();
 		System.out.println("LogTimeAddedmessage is displayed :"+logtimeAddedMSg);
 		   
 		   
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTotalLoggedTime()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTotalLoggedTime()).click();
 		
 	//	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDate()));
 	    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDate());
 		 
 	}
 	
 	public String getLogTimeDate()
 	{
 		String getLogTimeDate = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDate()).getText();
 		System.out.println("getLogTimedate is displayed : "+getLogTimeDate);
 		return getLogTimeDate;
 		
 	}
 	
 	public String verifyLoggedHours()
 	{
 		String getLogTimehours = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeHrs()).getText();
 		System.out.println("Logtime hours of activity is :"+getLogTimehours);
 		return getLogTimehours;
 	}
 	
 	public String verfyLogTimeDescription()
 	{
 		String LogTimeDescription = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDescription()).getText();
 		System.out.println("LogtimeDescription of activity is :"+LogTimeDescription+"\n*********************************************************************************************************************************************");
 		return LogTimeDescription;
 		
 	}
 	
 		 
 		 
	public void editLogTime()
 	{
 		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 		 
 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTime()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTime()).click();
 		 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDate()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDate()).click();
 		 
 		 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDatefromDatePicker()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDatefromDatePicker()).click();
 		 
 		 
 		
 		 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUserforeditLogtime()));
 		 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUserforeditLogtime()).click();
 		 
 		 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
 		 
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchForUser()).sendKeys("pratish laad");
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.magnifyingGlassSearchUser()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.magnifyingGlassSearchUser()).click();
 		
 		
 		
 	    try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromListEditlogTime()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromListEditlogTime()).click();
 		
 		for(int i=0; i<=5; i++)
 		{
 			
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeSpinnerUp()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeSpinnerUp()).click();
 		
 		}
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDuratiomfield()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDuratiomfield()).click();
 		
 		//explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDurationValue()));
 		//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDurationValue()).click();
 		 
 		 
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editLogtimeDescriptionfield()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editLogtimeDescriptionfield()).clear();
 		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editLogtimeDescriptionfield()).sendKeys("This is a Updated LogTimeDescriptiom");
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateButton()));
 		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateButton()).click();
 		
 		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeUpdatedMSG()));
 		boolean Logtimeupdatemsg =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeUpdatedMSG()).isDisplayed();
 		System.out.println("LogTime successfully updated :"+Logtimeupdatemsg);
 		 
 		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLogTimeDateafterEdit());
 	   
 	} 
	
	public boolean verifyLogTimeDateafterEdit()
	{
		boolean LogTimedateafterEdit = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLogTimeDateafterEdit()).isDisplayed();
		System.out.println("LogTimeDateAfteredit :"+LogTimedateafterEdit);
		return LogTimedateafterEdit;
	}
	
	public String verifyLoggedhrsAfterEdit()
	{
		String loggedHrsAfterEdit = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLoggedHrsAfterEdit()).getText();
		System.out.println("LoggedHrs after editlogtime :"+loggedHrsAfterEdit);
		return loggedHrsAfterEdit;
	}
	
	public String verifyUpdatedDescription()
	{
	 String descriptionAfterEdit =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLoggedDescriptionAfterEdit()).getText();
	 System.out.println("Update LogTime description is :"+descriptionAfterEdit+"\n*******************************************************************************************************");
	 return descriptionAfterEdit;
	}
	
	
	//Adding  risk on activity
	
	
	public void clickOn_RiskTab()
	{
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRiskTab()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRiskTab()).click();
		
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		
		//explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeighthowImportantDropdown()));
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeighthowImportantDropdown());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeighthowImportantDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromWeightHowImportantDropdown());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromWeightHowImportantDropdown()).click();
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProbabilityHowLikelyDropdown()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProbabilityHowLikelyDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromProbabilityHowLikelyDropdown());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromProbabilityHowLikelyDropdown()).click();
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRadiobuttonforRiskTypeIssue()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRadiobuttonforRiskTypeIssue()).click();
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskDescription()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskDescription()).sendKeys("This is the activity description");
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskMitigation()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskMitigation()).sendKeys("Risk mitigation is defined as taking steps to reduce adverse effects. There are four types of risk mitigation strategies that hold unique to Business Continuity and Disaster Recovery. It's important to develop a strategy that closely relates to and matches your company's profile");
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldofRisk()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldofRisk()).click();
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDate());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDate()).click();
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddRiskButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddRiskButton()).click();
		
		boolean riskIssueMSG = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskIssueAddedMsg()).isDisplayed();
		System.out.println("riskIssue Added message isDisplayed after added the risk on activity :"+riskIssueMSG);
		
		
		
		if (riskIssueMSG==true) {
		    explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnriskRegistertab()));
		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnriskRegistertab()).click();
		}
		
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		
	}
	

		public boolean verifyDateOnRiskAddedTab()
		{
			
		boolean riskAddeddate = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDateofriskRegistertab()).isDisplayed();
		System.out.println("risk Added Date on riskRegister tab :"+riskAddeddate);
		return riskAddeddate;
		
		}
		
		public String getRiskScore()
		{
			String getriskscore = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getRiskScoreofActivity()).getText();
			System.out.println("Risk score of activity :"+getriskscore);
			return getriskscore;

		}
		
		public String verifyRiskType()
		{
			String typeofrisk = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyRiskType()).getText();
			System.out.println("Type of risk on activity :"+typeofrisk);
			return typeofrisk;
			
		}
		
		public String getDetailDescriptionofActivity()
		{
		String getDescription =	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDetailDescriptionofRisk()).getText();
		System.out.println("DetailDescription of risk on activity :"+getDescription+"\n********************************************************************************************");
		return getDescription;
		
		}
		
		
      // following code for edit the risk register tab 
		
   	public void editRiskRegister()
   	{
   		
   	try {Thread.sleep(2000);} catch (InterruptedException ie) {}
   		
   	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRisk()));
       findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRisk()).click();
   		
   	
   	try {Thread.sleep(2000);} catch (InterruptedException ie) {}
   	
   	//explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeightHowImportantDropdownforEditRisk());
		//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeightHowImportantDropdownforEditRisk()).click();
   		
   	//explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromHowImportantDropdown());
   	//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromHowImportantDropdown()).click();
   	
   	//explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProbabilityHowLikelyDropdownforEditRisk()));
   	//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProbabilityHowLikelyDropdownforEditRisk()).click();
   	
   	//explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromHowLikelyDropdown());
   	//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValuefromHowLikelyDropdown()).click();
   	
   	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.radioButtonofBusinessDependancy()));
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.radioButtonofBusinessDependancy()).click();
   	
   	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskDescription()));
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskDescription()).clear();
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskDescription()).sendKeys("risk register status has changed from issue to Business Dependency");
   	
   	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskMitigation()));
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskMitigation()).clear();
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskMitigation()).sendKeys("Mitigation of risk is Updated");
   	
   	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResolvedDateCalendar()));
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResolvedDateCalendar()).click();
   	
   	explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDateOnResolvedDate());
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDateOnResolvedDate()).click();
   	
   	explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRiskDateCalendar());
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRiskDateCalendar()).click();
		
		
   	explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRiskTodayDate());
   	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRiskTodayDate()).click();
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickResolvedCheckbox()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickResolvedCheckbox()).click();
		
		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateRiskStatus()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateRiskStatus()).click();
		
		try {Thread.sleep(2000);} catch (InterruptedException ie) {}

		//explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyResolvedCheckbox());
		
   	}
   	
   	/*
   	public String verifyResolvedCheckbox()
   	{
   		String resolvedcheckbox =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyResolvedCheckbox()).getAttribute("class").substring(1);
   		System.out.println("Resolved checkbox is checked :"+resolvedcheckbox);
   		return resolvedcheckbox;
   	
   	}*/
   	
   	public boolean verifyDateofRiskafterEdit()
   	{
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDateofRiskAfterEdit()));
   		boolean DateofriskafterEdit =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDateofRiskAfterEdit()).isDisplayed();
   		return DateofriskafterEdit;
   		
   	}
   	
   	public String verifyScoreofRiskAfterEdit()
   	{
   		String scoreofriskafterEdit =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getRiskScoreAfterEdit()).getText();
   		System.out.println("Score of risk after edit :"+scoreofriskafterEdit);
   		return scoreofriskafterEdit;
   	}
   	
   	public String verifyStatusofRiskAfterEdit()
   	{
   		String Typeofrisk =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getTypeofRiskStatusAfterEdit()).getText();
   		System.out.println("Risk status changed from :"+Typeofrisk);
   		return Typeofrisk;
   	}
   	
   	
   	
   	//following code for subscriber of activty
   	
   	public void clickOn_SubscriberTab()
   	{
   		
   		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
   		
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberTab()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberTab()).click();
   		
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberDropdown()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberDropdown()).click();
   		
   		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchUserSubscriberInputfield());
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchUserSubscriberInputfield()).sendKeys("pratish laad");
   		
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberSearchIcon()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberSearchIcon()).click();
   		
   		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSubscriberUSerAfterclickOnSearchIcon());
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSubscriberUSerAfterclickOnSearchIcon()).click();
   		
   		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
   		
   		explicitWaitElementToBeClickable(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyPercentageCompleteDoneCheckbox()));
   	    boolean percentagedonecheckbox =	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyPercentageCompleteDoneCheckbox()).isDisplayed();
   	    System.out.println("percentaheDonecheckbox is showing :"+percentagedonecheckbox);
   	    
   		//percentage complete unchecked and checked
   	    if(percentagedonecheckbox==true) {
   		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyPercentageCompleteDoneCheckbox());
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyPercentageCompleteDoneCheckbox()).click();
   		
   	    }
   		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyPercentageCompleteDoneCheckbox());
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyPercentageCompleteDoneCheckbox()).click();
   		
   		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
   		//past due date uncheck and checked
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyActivityPastDueDate()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyActivityPastDueDate()).click();
   		
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyActivityPastDueDate()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.notifyActivityPastDueDate()).click();
   		
   		
   		
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddSubscriberStatusLogButton()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddSubscriberStatusLogButton()).click();
   
   		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
   		
   	}
   	
   	public String verifySubscriberUser()
   	{
   	  String getSubscriberUser = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getUserImage()).getAttribute("title");
   	  System.out.println("Activity subscriber User name :"+getSubscriberUser);
   	  return getSubscriberUser;
   	  
   	}
   	
   	public String verifySubscriberPercentageDoneCheckBox()
   	{
   		
   		//String percentageCompleteDoneCheckboxClassAttributValue = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDoneCheckbox()).getAttribute("class").substring(128);
   		
   		String percentagedonecheckbox =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDoneCheckbox()).getAttribute("class").substring(18);
   		System.out.println("Get percentage CompleteDone Checkbox Class Attribut Value :"+percentagedonecheckbox);
   		return percentagedonecheckbox;
   	}
   	
   	public String verifySubscriberActivityPastDueDateCheckbox()
   	{
   		String activityPastdueDateCheckboxClassAttributeValue = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnActivityPastDueDate()).getAttribute("class").substring(18);
   		System.out.println("Activity past due date checkbox class Attribute value :"+activityPastdueDateCheckboxClassAttributeValue);
   		return activityPastdueDateCheckboxClassAttributeValue;
   	}
   	
   	
   	
   	public void editSubscriberofActivity()
   	{
   		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
   		
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickSubscriberEditIcon()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickSubscriberEditIcon()).click();
   		
   		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPercentageCompleteDoneCheckbox());
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPercentageCompleteDoneCheckbox()).click();
   		
   		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editActivityPastDueDate()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editActivityPastDueDate()).click();
   		
   	
   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateSubscriber()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateSubscriber()).click();
   	

   		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDeleteScubscriber()));
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDeleteScubscriber()).click();
   		
   		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
   		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseNoOptionOnDeleteSubscriberPopUp());
   		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseNoOptionOnDeleteSubscriberPopUp()).click();
   		
   	}
   	
   	public String verifySubscriberUserAfterEdit()
   	{
   		  String getSubscriberUserafterEdit = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getUserImage()).getAttribute("title");
	    	  System.out.println("Activity subscriber User name :"+getSubscriberUserafterEdit);
	    	  return getSubscriberUserafterEdit;
	    	  
   	}
   	
   	public String verifySubscriberPercentageDoneCheckBoxAfterEdit()
   	{
   		
   		String percentagedonecheckboxafterEdit =findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDoneCheckbox()).getAttribute("class").substring(18);
   		System.out.println("Get percentage CompleteDone Checkbox Class Attribut Value :"+percentagedonecheckboxafterEdit);
   		return percentagedonecheckboxafterEdit;
   	}
   	
   	public String verifySubscriberActivityPastDueDateCheckboxAfterEdit()
   	{
   		String activityPastdueDateCheckboxClassAttributeValueAfterEdit = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnActivityPastDueDate()).getAttribute("class").substring(18);
   		System.out.println("activityPAstDueDateCheckboxClassAttributeValueAfterEdit  :"+activityPastdueDateCheckboxClassAttributeValueAfterEdit);
   		return activityPastdueDateCheckboxClassAttributeValueAfterEdit;
   		
   	}
   	
   	
   	//following code for resource column
   	
     	public void clickOn_ResourceTabOnActivity()
     	{
     		
     		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		
     		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResourceTab()));
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResourceTab()).click();
     		
     		//explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAllDropdown());
     		//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAllDropdown()).click();
     		
     		//try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		//explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseAllvalue());
     		//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseAllvalue()).click();
     		
     		
     		
     		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()));
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()).click();
     		
     	    explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions());
     	    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions()).click();
     		
     		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		actions.doubleClick(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.doubleclickOnResourcenameColumn())).click().build().perform();
    
     		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield());
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield()).sendKeys("pratish laad");
     		
     		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()));
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()).click();
     		
     		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSearchResource());
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSearchResource()).click();
     		
     		////////////
     		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		
     		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()));
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()).click();
     		
     	   // explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions());
     	   // findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions()).click();
     		
     		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
     		actions.doubleClick(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.doubleclickOnResourcenameColumn())).click().build().perform();
    
     		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield());
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield()).sendKeys("Anshita Bhadoria");
     		
     		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()));
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()).click();
     		
     		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSecondSearchResource());
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSecondSearchResource()).click();
     		
     		
            try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		
     		//explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()));
     		//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()).click();
     		
     		
     		
     		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.filterResourcesInputfield()));
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.filterResourcesInputfield()).sendKeys("pratish laad");
     		
     	//	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchIconfilterResource()));
     	//	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchIconfilterResource()).click();
     		
     	 //	explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectOnfilteredResourceIMG()));
     	//	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectOnfilteredResourceIMG()).click();
     		
     		try {Thread.sleep(2000);} catch (InterruptedException ie) {}
     		//explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDeleteResource()));
     		actions.moveToElement(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDeleteResource())).click().build().perform();
     		
     		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseYesOptionOnDeleteResource());
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseYesOptionOnDeleteResource()).click();
     		
     		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		
     	//	for(int i=0; i<14; i++)
     	//	{	
     			
     		try {Thread.sleep(10);} catch (InterruptedException ie) {}
     		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.filterResourcesInputfield()));
     		//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.filterResourcesInputfield()).sendKeys(Keys.BACK_SPACE);
     		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.filterResourcesInputfield()).clear();
     		
     	//	}
     		
     		
     		
     	}	
     		public String verifyResourceAllocationOnActivity()
     		{
     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyResource());
     			String resourcename = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyResource()).getAttribute("title");
     			System.out.println("Assign resource on activity is :"+resourcename);
     			return resourcename;
     		}
     		
     		
     		public String verifyResourceAllocation()
     		{
     			//explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyAllocation()));
     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyAllocation());
     			String getAllocation = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyAllocation()).getText();
     			System.out.println("Get Allocation On Activity with allocation percentage :"+getAllocation);
     			return getAllocation;
     		}
     		
     		
     		
     		// following code for activity mode
     		
     		public void Normal_SchedulingMode()
     		{
     			try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()).click();
     			
     			try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()).click();
     			
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     		    sizeofSchedulemodeonactivity  =findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).size();
     		    System.out.println("scheduling mode list on activity :"+sizeofSchedulemodeonactivity);
     		   
     		    findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).get(sizeofSchedulemodeonactivity-4).click();
     		    
     		   // explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()));
     		   // findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).click();
     		    
     		    //explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()));
     		    
     		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).clear();
     		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).sendKeys("5");
     		   
     		    findElement(By.xpath("//body")).click();
     		   
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivityInfo()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivityInfo()).click();
     		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}

     		    explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityDurationforNormalMode()));
     			
     		}
     		
     		public String  verifyActivityModeDurationfieldTrigger()
     		{
     			 try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     			String durationfieldtrigger = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityDurationforNormalMode()).getAttribute("value");
     		
     			System.out.println("In normal scheduling mode both resource and effort does not affect the schedule of activities,Only activity's duration or Date will affect it's Schedule :"+durationfieldtrigger);
     			return durationfieldtrigger;
     			
     		}
     		
     		
     		
     		// following code for fix duration Scheduling mode 
     		public void fixedDuration_SchedulingMode()
     		{
     			
               try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()).click();
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()).click();
     			
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     		    int fixDurationScheduleModeonActivity  =findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).size();
     		    System.out.println("scheduling mode list on activity :"+sizeofSchedulemodeonactivity);
     		   
     		    findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).get(fixDurationScheduleModeonActivity-3).click();
     		    
     		   // adding resource for fixed duration
     		    
     		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}
	      		
	      		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResourceTab()));
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResourceTab()).click();
	      		
	      		
	      		     //explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()));
	      	    	//findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()).click();
	      		
	        	 //   explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions());
	      	    //  findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions()).click();
	      		
	      		
	      		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
	      		actions.doubleClick(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.doubleclickOnResourcenameColumn())).click().build().perform();
	     
	      		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield());
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield()).sendKeys("pratish laad");
	      		
	      		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()));
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()).click();
	      		
	      		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
	      		
	      		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSearchResource());
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSearchResource()).click();
	      		
	 
	      		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
	      		
	         //explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()));
	      	//	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddResourcebutton()).click();
	      		
	      	//  explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions());
	       //   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.chooseResourceOptions()).click();
	      		
	      		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
	      		actions.doubleClick(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.doubleclickOnResourcenameColumn())).click().build().perform();
	     
	      		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield());
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchResourceInputfield()).sendKeys("pratish laad");
	      		
	      		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()));
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSearchIcon()).click();
	      		
	      		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSecondSearchResource());
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectSecondSearchResource()).click();
	      		
	      		
	      		//Activity info tab 
	      		
               try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivityInfo()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivityInfo()).click();
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()));
     		  	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()).clear();
     		  	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()).sendKeys("10");
     		    
     		   
     		  	//activity mode tab
     		  try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()).click();
     		    
     		   try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		   //explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield());
     	
     		}
     		
     		
     		public String verifyActualEffortfield()
     		{
     		  try {Thread.sleep(2000);} catch (InterruptedException ie) {}
     		  
    
     		 String ActualEffortofFixDuration = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).getAttribute("value");
     		 System.out.println("In fixed duration mode activity effort will be calculated dynamically based on duration date and No. of Resource:"+ActualEffortofFixDuration);
     	
     		 return ActualEffortofFixDuration;
     		 
			}
     		  
     		  
     		
     		public void effortDriven_SchedulingMode()
     		{
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()).click();
     			
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			
     		    int schedulingModeEffortUnitDropDown  =findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).size();
     		    System.out.println("scheduling mode list on activity :"+schedulingModeEffortUnitDropDown);
     		   
     		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}

     		    
     		    findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).get(schedulingModeEffortUnitDropDown-2).click();
     		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     		  
     		    explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()));
     		    actions.moveToElement(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield())).click().build().perform();
                try {Thread.sleep(1000);}catch(InterruptedException ie) {}
               
                findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
       	    	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).sendKeys("40");
               
       		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivityInfo()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivityInfo()).click();
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()));
     			scrollinToView(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()));
     			
     		}
     		
     		public String verifyActivityInfoModeDurationforEffortDrivenScheduleMode()
     		{
     		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		    String durationInputFieldofActivityforEffortDriven = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfoTrigger()).getAttribute("style");
     			System.out.println("In Effort Driven mode Duration of activity will be calculated dynamically based on resource assignments and effort  And Duration field of activity info mode was not enable for edit :"+durationInputFieldofActivityforEffortDriven+"\n******************************************************************************************************************");
     			return durationInputFieldofActivityforEffortDriven;
     		}
     		
     		public void dynamicAssignment_SchedulingMode()
     		{
     			
     		  
     		  	//activity mode tab
     		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_activityMode()).click();
     			
     			
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ActivitySchedulingModeDropdown()).click();
     			
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			
     		    int schedulingModeDynamicAssignmentDropDown = findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).size();
     		    System.out.println("scheduling mode list on activity :"+schedulingModeDynamicAssignmentDropDown);
     		   
     		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}

     		    
     		    findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.schedulingModeOptions()).get(schedulingModeDynamicAssignmentDropDown-1).click();
     		    try {Thread.sleep(1000);}catch(InterruptedException ie) {}

     		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
     		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.actualEffortInputTextfield()).sendKeys("80");
     		   
     		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}
	      		
	      		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResourceTab()));
	      		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResourceTab()).click();
     			
     			
     		}
     		
     		public List<WebElement> verifyResourceAllocationforDynamicAssignmentSchedulingmode()
     		{
     			//get allocations for all elements
     			
     			List<WebElement> allAllocations = findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyAllocation());
     			
     			for(int i=0; i<allAllocations.size(); i++)
     			{
     		           String 	AllocationsPercentage =	allAllocations.get(i).getText();
     		           System.out.println("Allocation for Resource " + (i + 1) + ": " + AllocationsPercentage);
     				
     			}
     			
		        System.out.println("In Dynamic assigment mode If we have fix efforts and duration, then Units of(%) of resource assignment will be calculated dynamically based on No.of resources. ");

				return allAllocations;
				
     			
     		}
     		
     		
     		
     		
     		//following code for adding stickers on activity
     		
     		public void addingStickers_OnActivity()
     		{
     			//first we need to upload  stickers from kb
     			
     		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     		  
     		   
     		    driver.switchTo().parentFrame();
     		  
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()).click();
     			
     		    try {Thread.sleep(2000);} catch (InterruptedException ie) {}
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ThreeDotOnProjectBoards()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ThreeDotOnProjectBoards()).click();
     			
     		    try {Thread.sleep(1000);} catch (InterruptedException ie) {}

     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_CreateKanbanBoard());
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_CreateKanbanBoard()).click();
     			
     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inputTextareaforNewBoard());
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inputTextareaforNewBoard()).sendKeys("kanban1");
     			
     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddkanbanBoardButton());
     		    findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddkanbanBoardButton()).click();
     			
     			////explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_OpenCreatedKBboard()));
     			////explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddkanbanBoardButton());
     			
     			explicitWaitElementToBeLocated(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_OpenCreatedKBboard());
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_OpenCreatedKBboard()).click();
     			
     			
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			/*
     			explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.enterKanbanBoardNameInputArea());
     			findElement(KanbanBoardRegressionLocators.enterKanbanBoardNameInputArea()).sendKeys("Regression Kanban Board");
     			
     			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnAddKanbanBoardButton()));
     			findElement(KanbanBoardRegressionLocators.clickOnAddKanbanBoardButton()).click();
     			
     			explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.openKanbanBoard());
     			findElement(KanbanBoardRegressionLocators.openKanbanBoard()).click();
     			
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			
     			
     			
     			*/
     			
     			
     			
     			
     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframeofkanbanBoard());
     			
     			handlevaluefokanbanBoardwindow =driver.getWindowHandle();
     			System.out.println("kanban board window handle value:"+handlevaluefokanbanBoardwindow);
     			
     			getIframeWindowNameAttributeValue = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframeofkanbanBoard()).getAttribute("name");
     			System.out.println("iframe window value :"+getIframeWindowNameAttributeValue);
     			
     			explicitWaitElementBy("elementToBeLocatedByWebElement", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.switchToiFrame());
     			
     			driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.switchToiFrame()));
     			
     			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
     			
     			try {Thread.sleep(6000);}catch(InterruptedException ie) {}
     			explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon()));
     			findElement(KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon()).click();
     			
     			
     			try {Thread.sleep(7000);}catch(InterruptedException ie) {}
     		
     				
     			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());

     			// see it later 
     			
     			//for(String kanbanBoardwindowhandless : driver.getWindowHandles());
     			//{
     			//	System.out.println("kanbanBoard window handle value :" + kanbanBoardwindowhandless);
     			//	driver.switchTo().window(kanbanBoardwindowhandless);
     			//}
     	
     			
     		    for (String kanbanBoardwindowhandles : driver.getWindowHandles()) {
     			    System.out.println("kanbanBoard window handle value :" + kanbanBoardwindowhandles);
     			    driver.switchTo().window(kanbanBoardwindowhandles);
     			    // Add your logic for each window handle here
     			}

     			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddtoBoardFanOutPlusIconButton());
     			
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddtoBoardFanOutPlusIconButton()).click();
     			
     			explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.dragStickerFanOutButton());
     			
     		    WebElement sourceAddStickerButton =	findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.dragStickerFanOutButton());
     			
     		
     		   explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inprogressMasterContainer()));
     		   WebElement destinationsource = findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inprogressMasterContainer());
     			
     	       actions.dragAndDrop(sourceAddStickerButton, destinationsource).build().perform();
     	    
     	       explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_uploadStickersPlusIcon());
     	       findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_uploadStickersPlusIcon()).click();
     	    
     	    
     		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}

     		   explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.uploadStickerWindowNameInputfield());
     		   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.uploadStickerWindowNameInputfield()).sendKeys("Image1");
     		   
     		   explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_GlobalCheckbox()));
     		   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_GlobalCheckbox()).click();
     			
     		   try {Thread.sleep(2000);}catch(InterruptedException ie) {}
     			
     		   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inputfieldforImageUpload()).sendKeys(filePath+"\\ImageFolder/download4.jpg");
     			
     		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     		   explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_UploadStickerButtonwindow());
     		   findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_UploadStickerButtonwindow()).click();
     			
     		   
     		   driver.switchTo().window(handlevaluefokanbanBoardwindow);
     		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     		 //driver.switchTo().parentFrame();
     		  //driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.switchToiFrame()));
     		    
     		   driver.switchTo().frame(0);
     			
     		  explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()));
     		  findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()).click();
     			
     		  explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt());
     	      findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()).click();
     	    
     	      explicitWaitElementBy("invisibilityOfElementLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());
     	    
     	      explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());
     	    
     	      try {Thread.sleep(4000);}catch(InterruptedException ie) {}
     			
     	      driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));
   	    
   	          try {Thread.sleep(2000);}catch(InterruptedException ie) {}
   	      
   	      
   	          try {Thread.sleep(2000);}catch(InterruptedException ie) {}
 	  		
  	  	     explicitWaitElementBy("elementToBeLocated", CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone());
  	  	     findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone()).click();
  	  	
  	  		 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
  	  	     explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformationofMilestone());
  		  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformationofMilestone()).click();
  		  	 
  		  	 explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());
  		  	 
  		  	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
  		  	 
  		  	 explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_StickersSideColumn()));
  		  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_StickersSideColumn()).click();
  		  	 
  		  	 explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.sizeofStickers());
  		  	 int sizeofAllStickers = findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.sizeofStickers()).size();
  		  	 System.out.println("Size of stickers are avaiable on activity :"+sizeofAllStickers);
  		  	 
  			 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
  		  	 findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.sizeofStickers()).get(sizeofAllStickers - 1).click();
  		  	 
  		  	 
  		     try {Thread.sleep(1000);} catch (InterruptedException ie) {}
			 
			     explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()));
			     findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()).click();
  		  	 		
     		}
     		
     		
   	
     		
     		public void add_files_OnMilestone()
     		{
     			try {Thread.sleep(1000);} catch (InterruptedException e) {}
     			
     			explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_files()));
     			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_files()).click();
     			
     			
     			boolean salesforcetabIsvisible = findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.salesforceTabIsVisible()).isDisplayed();
     			System.out.println("is salesforceTab is visibile on upload file tab:"+salesforcetabIsvisible);
     			
     			
     			if(salesforcetabIsvisible == true)
     			{
     				
     				explicitWaitElementBy("elementToBeLocated", CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnSalesforcefileUpload());
     				findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnSalesforcefileUpload()).click();
     				
     				try {Thread.sleep(1000);} catch (InterruptedException ie) {}
     				
     			}
     			
     			
     			
     			findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
     			
     			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));//upload button not clickable by autoation script by manually it is ok
     			findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
     			
     			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.afterUploadButtonClick());
     			
     			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
     			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
     			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
     			
     			
     			
     			
     			
     		
     		}
     		
     	
  			
}
