package helper_package;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import common_package.CommonMethodsOfWebDriver;
import pom_package.AddToBoardFanButtonLocators;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;

public class KanbanBoardSettingHelper extends CommonMethodsOfWebDriver{

	
	JavascriptExecutor javaScript;
//	private String handleValueOfKanbanBoardMain;
	private int   saveButtonSize;
	public static String getCaseNameFromCaseObjectPage, getOpportunityNameFromOpportunityObjectPage, getIframeSRCAttribute, childiFrameValue, textAreaIDAttribute,
	regressionkanbanBoardWindowHandleValue;
	public static List<String> setCollectionoAddedToList;

	
	
	

	public String getUpdatedCardDuedate, getUserNameWhileCardUpdate, getResourceNameFromResourceTab, getCardAllocationFromResourceTab, getCardDuedate;
	public static String cardStartDateWhileCreating, classAttributeValueOfQuickActionSideColumn, linkColumnLinkToProjectName, linkColumnLinkToProjectBoardKanbanBoardName,
	linkColumnLinkToCardKanbanCardName, idValuOfFormElementStickerSubWinow, riskTypeRadioButtonValue, handleValueOfKanbanBoardiFrameWindow, getIdValueOfForm, getMasterContainerDynamicWebElementId,
	masterContainerDynamicallyGetFormIdOfAnotherKanbanBoard, getIframeWindowNameAttributeValue,handleValueOfKanbanBoardMain,windowHandleForKanbanBoard;
	public static WebElement addCardToBoardSource ,backlogMasterZoneDestination,InprogressMasterZoneDestination;//th is webelement
	public static int getSizeOfAllMasterContainersFromRegressionKanbanBoard,Sizeofallfooter;
	public static ArrayList<String> multipleTabsOpen;
	
	public void creatingSingleKanbanCard()
	{
		/*explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.guideWindow()));		//comment from here********************
		boolean windowVisibilty = findElement(KanbanBoardRegressionLocators.guideWindow()).isDisplayed();
		System.out.println("Window visibilty at the very start of leankor page : "+windowVisibilty);		
		if(windowVisibilty==true)
		{
			explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnSkipButtonOnGuideWindow()));
			findElement(KanbanBoardRegressionLocators.clickOnSkipButtonOnGuideWindow()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnFolderIcon()));
			findElement(KanbanBoardRegressionLocators.clickOnFolderIcon()).click();
		}*/
		
		try {Thread.sleep(12000);}catch(InterruptedException ie) {}
		 
		
		
		
	
		handleValueOfKanbanBoardMain = driver.getWindowHandle();
		System.out.print("handleValueOfKanbanBoardiFrameWindow in iFrame LINE 122 :"+handleValueOfKanbanBoardMain+"\n*******************************************************************************************************************\n");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	    explicitWaitElementBy("presenceOfElementLocated", KanbanBoardRegressionLocators.leankorLeftNavigation());
	    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocatedByWebElement", KanbanBoardRegressionLocators.clickOnFolderIcon());
		findElement(KanbanBoardRegressionLocators.clickOnFolderIcon()).click();
		
		
		

	/*	WebElement eleme =driver.findElement(By.xpath("//div[@class='headParent']/child::div[text()='ALL FOLDERS']/following-sibling::div"));

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));

		wait.until(ExpectedConditions.elementToBeClickable(eleme));
		eleme.click();

		try {Thread.sleep(1000);}catch(InterruptedException ie) {}*/
		
		
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.enterFolderName());
		findElement(KanbanBoardRegressionLocators.enterFolderName()).sendKeys("Regression Folder");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnAddButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()));
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()));
		// click on the compose button as soon as the "compose" button is visible
		jsExecutorClickOnElement(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()));
		
		
	
		
		//actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder())).build().perform();
		//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCreatedFolder());
		//findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnThreeDots());
		findElement(KanbanBoardRegressionLocators.clickOnThreeDots()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnAddProject());
		findElement(KanbanBoardRegressionLocators.clickOnAddProject()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterProjectName()));
		findElement(KanbanBoardRegressionLocators.enterProjectName()).sendKeys("Regression Project");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnProjectAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnProjectAddButton()).click();
		
		
		//scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnCreatedProject()));
		//explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCreatedProject()));
		//jsExecutorClickOnElement(findElement(KanbanBoardRegressionLocators.clickOnCreatedProject()));
		
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCreatedProject());
		findElement(KanbanBoardRegressionLocators.clickOnCreatedProject()).click();
		
	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnProjectBoardThreeDots());
		findElement(KanbanBoardRegressionLocators.clickOnProjectBoardThreeDots()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnCreateKanbanBoardButton()));
		findElement(KanbanBoardRegressionLocators.clickOnCreateKanbanBoardButton()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.enterKanbanBoardNameInputArea());
		findElement(KanbanBoardRegressionLocators.enterKanbanBoardNameInputArea()).sendKeys("Regression Kanban Board");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnAddKanbanBoardButton()));
		findElement(KanbanBoardRegressionLocators.clickOnAddKanbanBoardButton()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.openKanbanBoard());
		findElement(KanbanBoardRegressionLocators.openKanbanBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		handleValueOfKanbanBoardiFrameWindow = driver.getWindowHandle();
		System.out.print("handleValueOfKanbanBoardiFrameWindow in iFrame LINE 122 :"+handleValueOfKanbanBoardiFrameWindow+"\n*******************************************************************************************************************\n");
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.iframeOfKanbanBoard());
		getIframeWindowNameAttributeValue = findElement(KanbanBoardRegressionLocators.iframeOfKanbanBoard()).getAttribute("name");
		System.out.println("Iframe window value line 127 :"+getIframeWindowNameAttributeValue);
		
		explicitWaitElementBy("elementToBeLocatedByWebElement", KanbanBoardRegressionLocators.switchToiFrame());
		driver.switchTo().frame(findElement(KanbanBoardRegressionLocators.switchToiFrame()));
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		
		
		
		
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon()));
		findElement(KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon()).click();
		
		for(String windowHandleForKanbanBoard : driver.getWindowHandles())
		{
			System.out.println("windowHandleForKanbanBoard value for both after open kanban board in duplicate view :"+windowHandleForKanbanBoard);//both window value will be print in console
			driver.switchTo().window(windowHandleForKanbanBoard);
		}
		System.out.println("*******************************************************************************************************************");
		
	
		 multipleTabsOpen = new ArrayList<String>(driver.getWindowHandles());
				
		// driver.switchTo().window(multipleTabsOpen.get(1));
		
	
	  try {Thread.sleep(6000);}catch(InterruptedException ie) {}

	
	  explicitWaitElementBy("elementToBeLocated",KanbanBoardRegressionLocators.clickOnAddToBoardFan());
	  
	  findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAddCardToBoardUnderFanButton()));                                                                    
	  addCardToBoardSource = findElement(KanbanBoardRegressionLocators.clickOnAddCardToBoardUnderFanButton());
	 
	
	  
	  backlogMasterZoneDestination = findElement(KanbanBoardRegressionLocators.backlogMasterContainer()); //forfilter
	  
	  InprogressMasterZoneDestination= findElement(KanbanBoardRegressionLocators.inprogressMasterContainer());
	  actions.dragAndDrop(addCardToBoardSource, InprogressMasterZoneDestination).build().perform();
	 
	  
	  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()));
	  
	  findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()).click();
	  
	  //Myself-- actions.moveToElement(findElement(KanbanBoardRegressionLocators. selectCategoryFromDropDownValueMarketing())).build().perform();
	 
	  
	  explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectCategoryFromDropDownValueMarketing());
	 
	  findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueMarketing()).click();
	  
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardId()));
	  
	  findElement(KanbanBoardRegressionLocators.enterCardId()).sendKeys("Mark001");
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardTitle()));
	  
	  findElement(KanbanBoardRegressionLocators.enterCardTitle()).sendKeys("New Card");
	  
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardDescription()));
	 
	  findElement(KanbanBoardRegressionLocators.enterCardDescription()).sendKeys("Description of card");
	  
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()));
	  
	  findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).sendKeys("Information of Card");
	  
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown()));
	  
	  findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown()).click();
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDownCritical()));
	  
	  findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDownCritical()).click();
	  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  boolean allocationBar = findElement(KanbanBoardRegressionLocators.cardsAllocationBar()).isDisplayed(); //Change in xPath for Allocation bar
	  System.out.println("Allocation Bar is visible or not LINe 182 :"+allocationBar); 
	  
	  for(int i=1; i<=5; i++) {
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators. cardsAllocationBar()));
	  findElement(KanbanBoardRegressionLocators.cardsAllocationBar()).click(); 
	  }
	  
	  //scroll to Estimation time
	  actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPointsDropDown())).build().perform(); 
	  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	  
	  explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterEstimationTime()));
	  actions.moveToElement(findElement(KanbanBoardRegressionLocators.enterEstimationTime())).click().build().perform(); 
	  try{Thread.sleep(1000);}catch(InterruptedException ie){}
	  findElement(KanbanBoardRegressionLocators.enterEstimationTime()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	  findElement(KanbanBoardRegressionLocators.enterEstimationTime()).sendKeys("7");
	  
	  int cardStartDateSize =findElements(KanbanBoardRegressionLocators.fetchStartDateOfCardWhileCreating()).size();//CardDAte size =3
	  System.out.println("CardStartDateSize LINE 200 :"+cardStartDateSize);
	  cardStartDateWhileCreating =findElements(KanbanBoardRegressionLocators.fetchStartDateOfCardWhileCreating()).get(cardStartDateSize-3).getText().substring(12,23);// 0 if removesubstring Start Date also printing
	  System.out.println("cardStartDateWhileCreating LINE 202 :"+cardStartDateWhileCreating);
	  
	  explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown()));
	  actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown())).click().build().perform();
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectValueDayFromDurationDropDown()));
	  findElement(KanbanBoardRegressionLocators.selectValueDayFromDurationDropDown()).click();
	  
	  actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPointsDropDown())).build().perform();
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPointsDropDown()));
	  actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPointsDropDown())).click().build().perform();
	  
	  //Click on point Dropdown value 
	  
	  int countOfAllElement = driver.findElements(By.xpath("//div[contains(@class,'-scroll-scroller-vertical')]//div[contains(@class,'x-list-item-')]")).size();
	  System.out.println("Under point drop down all value 217 :"+countOfAllElement);//28
	  
	  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  
	  if(countOfAllElement>=20 && countOfAllElement<=30) {
	  driver.findElements(By.xpath("//div[contains(@class,'-scroll-scroller-vertical')]//div[contains(@class,'x-list-item-')]")).get(countOfAllElement-25).click();//(28-25)=3 numbers value ie 5 }
	  
	  try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	  
	  getCardDuedate = findElement(KanbanBoardRegressionLocators.fetchDueDateOfCardWhileCreating()).getText().substring(9,20);
	  System.out.println("getCardDuedate while creating card LINE 229 :"+getCardDuedate+
	  "\n*******************************************************************************************************************");
	  
	  explicitWaitElementBy("elementToBeLocated",KanbanBoardRegressionLocators.clickOnCreateButtonForCard());
	  findElement(KanbanBoardRegressionLocators.clickOnCreateButtonForCard()).click();
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()));
	  findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();
	  
	  try {Thread.sleep(2500);}catch(InterruptedException ie) {}
	  
	 
	  
	  // this following code is only for kanbanBoardSetting helper
	  
      try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
	  
      multipleTabsOpen =new ArrayList<String>(driver.getWindowHandles());
      //driver.switchTo().window(multipleTabsOpen.get(1));
	  }  

	}  
	  
	//Added Task on kanban Card
	  
		public void clickOn_TasksideColoum()
		{
			try {Thread.sleep(1800);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
			findElement(KanbanBoardRegressionLocators.editCard()).click();
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnTaskSideColumn());
			findElement(KanbanBoardRegressionLocators.clickOnTaskSideColumn()).click();
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.addTaskSubject()));
			findElement(KanbanBoardRegressionLocators.addTaskSubject()).sendKeys("Task1");
			
			findElement(KanbanBoardRegressionLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
			
			findElement(KanbanBoardRegressionLocators.clickOnAssignAUserDropDown()).click();
			
			findElement(KanbanBoardRegressionLocators.searchUserNameInInputField()).click();
			findElement(KanbanBoardRegressionLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
			findElement(KanbanBoardRegressionLocators.assignAnOwnerForTaskSearchIcon()).click();		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectUserAfterSearch());
			findElement(KanbanBoardRegressionLocators.selectUserAfterSearch()).click();
			
			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.taskPriority()));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.taskPriority()).click();
			findElement(KanbanBoardRegressionLocators.selectTaskPriorityFromDropDown()).click();
			findElement(KanbanBoardRegressionLocators.clickOnTaskAddButton()).click();
			
			//following code added for board setting
			
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
		}
	
	
	
	//================================================================================================================================
	
	public void kanbanBoardPreferences()
	{
		//******************************************** Preference ***************************************************
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.subscriberToCardsToggleSlider());
		findElement(KanbanBoardSettingLocators.subscriberToCardsToggleSlider()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=5; i++)
		{
			findElement(By.xpath("//*[contains(@id,'ext-formpanel-') and @class='x-container x-unsized x-form']/div/div["+i+"]//div[@class='x-component-outer']")).click();//xpath for five checkbox under All under subscribe to cards
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.followOnChatterToggleSlider());
		findElement(KanbanBoardSettingLocators.followOnChatterToggleSlider()).click();
		
		int sizeOfAllcheckbox = findElements(KanbanBoardSettingLocators.followOnChatterAllCheckbox()).size();//which checkboxes//xapath only for 2 All Checkboxes
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.followOnChatterAllCheckbox()).get(sizeOfAllcheckbox-7).click();	
		
		int allcheckboxList = findElements(KanbanBoardSettingLocators.allCategoryCheckboxList()).size();
		System.out.println("Checkbox size LINE 62 :"+allcheckboxList);
		
		javaScript = (JavascriptExecutor)driver;
		
		//Scroll till all the category visible
		for(int i=1; i<=allcheckboxList; i++)                                               //form[contains(@id,'ext-formpanel-') and @style='height: 251px !important;']/div/div["+i+"]/div[@class='x-component-outer'] // needs to change xpath
		{
			javaScript.executeScript("arguments[0].scrollIntoView();", findElement(By.xpath("//form[contains(@id,'ext-formpanel-') and @style='height: 333px !important;']/div/div["+i+"]/div[@class='x-component-outer']")));//xpath for 13 checkboxes for under all category----allCategoryCheckboxList----
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Check Category Checkboxes
		for(int i=1; i<=allcheckboxList; i++)
		{
			findElement(By.xpath("//form[contains(@id,'ext-formpanel-') and @style='height: 333px !important;']/div/div["+i+"]/div[@class='x-component-outer']")).click();
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(5000);} catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnTaskIconFromCardFace());
		findElement(KanbanBoardSettingLocators.clickOnTaskIconFromCardFace()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.taskFlyPopupWindowAfterClickOnCardFace());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.taskRecordListOnTaskFlyPopupWindow());
		boolean isTaskRecordListContains = findElement(KanbanBoardSettingLocators.taskRecordListOnTaskFlyPopupWindow()).isDisplayed();//after displaying flypopup window
		System.out.println("Task record list on task fly popup window :"+isTaskRecordListContains);
		
		if(isTaskRecordListContains == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnTaskCompletionButton());
			findElement(KanbanBoardSettingLocators.clickOnTaskCompletionButton()).click();
			try {Thread.sleep(3500);} catch(InterruptedException ie) {}
			
			if(findElement(KanbanBoardSettingLocators.floatingWindowOverTask()).isDisplayed() == true)
			{
				try {Thread.sleep(1000);} catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
				findElement(By.xpath("//body")).click();
			}
		}
		try {Thread.sleep(1500);} catch(InterruptedException ie) {}
	}
	
	
	public String getChatterCountFromUpdatedCardFaceAfterTaskCompletion()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.getChatterCountFromCardFaceAfterTaskMarkComplete());
		String getChatterCountFromCardFace = findElement(KanbanBoardSettingLocators.getChatterCountFromCardFaceAfterTaskMarkComplete()).getText();
		System.out.println("Chatter count from card face after successfully completion of task :"+getChatterCountFromCardFace+"\n***************************************************************************************************************");
		return getChatterCountFromCardFace;
	}
	
	
	public void clickOn_SecurityUnderPreference()
	{
		//********************************Security Under Preference*******************************************
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference()).click(); 
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCEODesignationEdit());
		findElement(KanbanBoardSettingLocators.clickOnCEODesignationEdit()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()));
		findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()));
		findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()));
		findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()).click();
	}
	
	public boolean verifyDisableMoveCheckBox()
	{
		boolean getVerifyDisableMoveCheckBoxAfterCheck = findElement(KanbanBoardSettingLocators.ceoDisableMoveCheckbox()).getAttribute("class").contains("setCheck");
		System.out.println("Disable Move Checkbox LINE 155 After check :"+getVerifyDisableMoveCheckBoxAfterCheck);
		return getVerifyDisableMoveCheckBoxAfterCheck;
	}
	
	public boolean verifyDisableEditCheckbox()
	{
		boolean getVerifyDisableEditCheckBoxAfterCheck = findElement(KanbanBoardSettingLocators.ceoDisableEditCheckbox()).getAttribute("class").contains("setCheck");
		System.out.println("Disable Edit Checkbox LINE 162 After check :"+getVerifyDisableEditCheckBoxAfterCheck+"\n***************************************************************************************************************");
		return getVerifyDisableEditCheckBoxAfterCheck;
	}
	
	
	public void clickOn_SecurityForUncheck()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnSecurityOptionUnderPreference()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCEODesignationEdit());
		findElement(KanbanBoardSettingLocators.clickOnCEODesignationEdit()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()));
		findElement(KanbanBoardSettingLocators.disableAbilityToMoveCardsCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()));
		findElement(KanbanBoardSettingLocators.disableAbilityToEditCards()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()));
		findElement(KanbanBoardSettingLocators.clickOnDoneButtonRolePreferenceUnderSecurity()).click();
	}
	
	public boolean verifyDisableMoveCheckBoxAfterUncheck()
	{
		boolean getVerifyDisableMoveCheckboxAfterUncheck = findElement(KanbanBoardSettingLocators.ceoDisableMoveCheckbox()).getAttribute("class").contains("setUncheck");
		System.out.println("Disable Move Checkbox LINE 198 After Uncheck:"+getVerifyDisableMoveCheckboxAfterUncheck);
		return getVerifyDisableMoveCheckboxAfterUncheck;
	}
	
	public boolean verifyDisableEditCheckboxAfterUncheck()
	{
		boolean getVerifyDisableEditCheckboxAfterUncheck = findElement(KanbanBoardSettingLocators.ceoDisableEditCheckbox()).getAttribute("class").contains("setUncheck");
		System.out.println("Disable Edit Checkbox LINE 205 After Uncheck:"+getVerifyDisableEditCheckboxAfterUncheck+"\n***************************************************************************************************************");
		return getVerifyDisableEditCheckboxAfterUncheck;
	}
	
	
	public void clickOn_CasesUnderPreference()
	{
		//********************************** Cases Under preference start here**********************************
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.preferenceOption()));
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("presenceOfElementLocated", KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.turnOnCaseSyncCheckbox()));
		findElement(KanbanBoardSettingLocators.turnOnCaseSyncCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnChooseNewCaseCardCategoryDropdown()));
		findElement(KanbanBoardSettingLocators.clickOnChooseNewCaseCardCategoryDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCategoryFromDropdown());
		findElement(KanbanBoardSettingLocators.selectCategoryFromDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(7000);}catch(InterruptedException ie) {}
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.homeButtonKanbanBoard());
		//findElement(KanbanBoardSettingLocators.homeButtonKanbanBoard()).click();
		
		/*
		 * for(String windowHandleValue : driver.getWindowHandles()) {
		 * driver.switchTo().window(windowHandleValue); }
		 */
		
		
		driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);// we switch home page window  tab not iframe
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		driver.switchTo().frame(0);
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		driver.switchTo().frame("boardIfram");
		
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.clickOkButtonOnAlertMessage());
		findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		  driver.switchTo().defaultContent();
		  
		 /* 
		 * WebElement element = driver.findElement(By.xpath(
		 * "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[7]/a/span"
		 * )); JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", element);
		 */
		
		
		//explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage());
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()));
		findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.selectCasesObjectName()));
		findElement(KanbanBoardSettingLocators.selectCasesObjectName()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}	
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnaccName()));
		findElement(KanbanBoardSettingLocators.clickOnaccName()).click();
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.selectthestatus()));
		findElement(KanbanBoardSettingLocators.selectthestatus()).click();
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickonNew()));
		findElement(KanbanBoardSettingLocators.clickonNew()).click();
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnsaveButtonForcases()));
		findElement(KanbanBoardSettingLocators.clickOnsaveButtonForcases()).click();
		
		
	}	
		
		
		
		
		
		
		
		/*explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.tryLexDailogWindowClickOnCross()));
		findElement(KanbanBoardRegressionLocators.tryLexDailogWindowClickOnCross()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateCase()));
		//findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateCase()).click();
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		// Select Record type for Case Object
		//selectValueFromDropdown(findElement(KanbanBoardSettingLocators.selectCaseRecordType()), "visibleText", "IT Case");
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCaseRecordType());
		//findElement(KanbanBoardSettingLocators.selectCaseRecordType()).click();
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectContinueButtonFromCaseTypePage());
		//findElement(KanbanBoardSettingLocators.selectContinueButtonFromCaseTypePage()).click();
		
		//select value from Status Dropdown
		//selectValueFromDropdown(findElement(KanbanBoardSettingLocators.caseObjectStatusDropdown())
		
		
		//all elements On Popup
		
		
		
	     //	 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//int sizeOfNextButton = findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).size();
		//findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).get(sizeOfNextButton-2).click();
		
		//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//int sizeofALLElements=findElements(KanbanBoardSettingLocators.AllElementsOnCaseIT()).size();
		//System.out.println("Size of all elements :"+sizeofALLElements);
		
		//findElements(KanbanBoardSettingLocators.AllElementsOnCaseIT()).get(sizeofALLElements-1).click();
	
		
		
		//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		
		
		
		
		//click on Status Dropdown
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.caseObjectStatusDropdown());
		findElement(KanbanBoardSettingLocators.caseObjectStatusDropdown()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		// select new dropdown value 
				explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.ClickOnnewDropdownValue());
				findElement(KanbanBoardSettingLocators.ClickOnnewDropdownValue()).click();
		
		//select value from Case Origin Dropdown
		//selectValueFromDropdown(findElement(KanbanBoardSettingLocators.caseObjectCaseOriginDropdown()),"index","1");
				
				
				//clickOn Case Origin Dropdown
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.caseObjectCaseOriginDropdown());
		findElement(KanbanBoardSettingLocators.caseObjectCaseOriginDropdown()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//select value from Case Origin Dropdown
		
		//select phone value
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnPhonevalue());
		findElement(KanbanBoardSettingLocators.clickOnPhonevalue()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//int saveButtonSize = findElements(KanbanBoardSettingLocators.saveButtonOnCaseObjectPage()).size();
				
		//explicitWaitElementToBeVisibleAllListItems(findElements(KanbanBoardSettingLocators.saveButtonOnCaseObjectPage()));
		//findElements(KanbanBoardSettingLocators.saveButtonOnCaseObjectPage()).get(saveButtonSize-2).click();
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.saveButtonOnCaseObjectPage());
		findElement(KanbanBoardSettingLocators.saveButtonOnCaseObjectPage()).click();
		
		
				
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
	    String	name=driver.getTitle();
	    System.out.println("Title of this case page is :"+name);
		
		int caseCardTitleLength = driver.getTitle().length();
		System.out.println("Case card title page length :"+caseCardTitleLength);
	}
		
		/*switch(caseCardTitleLength)
		{	
		case 50 :
			getCaseNameFromCaseObjectPage = driver.getTitle().substring(1,17);
			System.out.println("Case object record title LINE 292 , Switch Case 50 :"+getCaseNameFromCaseObjectPage);
			break;
		case 48:
			getCaseNameFromCaseObjectPage = driver.getTitle().substring(1,30);
			System.out.println("Case object record title LINE 296 , Switch case 48 :"+getCaseNameFromCaseObjectPage);
			break;
			
		default:
			System.out.println("Invalid length of Case Card title");
		}
		
		driver.switchTo().window(regressionkanbanBoardWindowHandleValue);
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
java.lang.System


The System class contains several useful class fieldsand methods. It cannot be instantiated.Among the facilities provided by the System classare standard input, standard output, and error output streams;access to externally defined properties and environmentvariables; a means of loading files and libraries; and a utilitymethod for quickly copying a portion of an array.
Since:1.0
	}
	
	public String verifyCaseCardTitleAfterCreating()
	{
		String caseName = findElement(KanbanBoardSettingLocators.verifyCaseNameOnCaseCard()).getText().substring(1,17);
		System.out.println("Get Case card title from kanban card :"+caseName+"\n***************************************************************************************************************");
		return caseName;
	}*/
	
	
	public void clickOn_OpportunitiesUnderPreference()
	{
		//*******************************Opportunity Card Script start here *****************************************
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.toolBarSettingIcon()));
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.preferenceOption()));
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference()));
		findElement(KanbanBoardSettingLocators.clickOnCasesOptionUnderPreference()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.turnOffCaseSyncCheckbox()));
		findElement(KanbanBoardSettingLocators.turnOffCaseSyncCheckbox()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnOpprotunitiesOptionUnderPreference()));
		findElement(KanbanBoardSettingLocators.clickOnOpprotunitiesOptionUnderPreference()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.turnOnOpportunitySyncCheckbox()));
		findElement(KanbanBoardSettingLocators.turnOnOpportunitySyncCheckbox()).click();
		
		scrollinToView(findElement(KanbanBoardSettingLocators.scrollToNewOpportunityCardCategoryDropdown()));
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnNewOpportunityCardCategoryDropdown()));
		findElement(KanbanBoardSettingLocators.clickOnNewOpportunityCardCategoryDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCategoryFromOpportunityDropdown());
		findElement(KanbanBoardSettingLocators.selectCategoryFromOpportunityDropdown()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		/*
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.homeButtonKanbanBoard());
		 * findElement(KanbanBoardSettingLocators.homeButtonKanbanBoard()).click();
		 * 
		 * for(String switchKanbanBoardToLeankorHomePage : driver.getWindowHandles()) {
		 * driver.switchTo().window(switchKanbanBoardToLeankorHomePage); }
		 * 
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()); try
		 * {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()).
		 * click();
		 * 
		 * actions.sendKeys(Keys.END).build().perform();
		 */
		
		
	    driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		driver.switchTo().frame(0);
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		driver.switchTo().frame("boardIfram");
		
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.clickOkButtonOnAlertMessage());
		findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		 driver.switchTo().defaultContent();
		 
		/* 
		 * WebElement element1 = driver.findElement(By.xpath(
		 * "/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/one-app-nav-bar/nav/div/one-app-nav-bar-item-root[8]/a/span"
		 * )); JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", element1);
		 */
		
		
		
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectOpportunitiesObjectName());
		//findElement(KanbanBoardSettingLocators.selectOpportunitiesObjectName()).click();
		
		/*explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.tryLexDailogWindowClickOnCross()));
		findElement(KanbanBoardRegressionLocators.tryLexDailogWindowClickOnCross()).click();*/
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		//explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateOpportunity()));
		//findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateOpportunity()).click();
		
		
		//try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		
		
		
		/*
		 * int checkboxsize =
		 * findElements(KanbanBoardSettingLocators.SelectAllCheckbox()).size();
		 * System.out.println("sizeofAllcheckbox are :"+checkboxsize);
		 * 
		 * 
		 * findElements(KanbanBoardSettingLocators.SelectAllCheckbox()).get(checkboxsize
		 * -6).click();
		 * 
		 * 
		 * try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		 * 
		 * explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.
		 * SelectDateFromCalendor()));
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * findElement(KanbanBoardSettingLocators.SelectDateFromCalendor()).click();
		 * 
		 * try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		 * 
		 * findElements(KanbanBoardSettingLocators.SelectAllCheckbox()).get(
		 * saveButtonSize-5).click();
		 * 
		 * try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * 
		 * findElements(KanbanBoardSettingLocators.SelectAllCheckbox()).get(
		 * saveButtonSize-5).sendKeys("NEW CARD");
		 * 
		 * 
		 * 
		 * try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		 * findElements(KanbanBoardSettingLocators.SelectAllCheckbox()).get(checkboxsize
		 * -4).click(); try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.clickonLokAccountNameIcon());
		 * actions.click(findElement(KanbanBoardSettingLocators.
		 * clickonLokAccountNameIcon())).build().perform();
		 * 
		 * 
		 */
		
		
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()));
		findElement(KanbanBoardSettingLocators.clickOnPlusIconOnLeankorHomePage()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.selectOpportunitiesObjectName()));
		findElement(KanbanBoardSettingLocators.selectOpportunitiesObjectName()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}	
		
		
		int sizeofelement=findElements(KanbanBoardSettingLocators.sizeofallvalue()).size();
		System.out.println("SizeOfallelements on Opportunity popup"+sizeofelement);
		
		
		//clickonopportunityname
		
		findElements(KanbanBoardSettingLocators.sizeofallvalue()).get(sizeofelement-5).click();
		findElements(KanbanBoardSettingLocators.sizeofallvalue()).get(sizeofelement-5).sendKeys("OpportunityIscreated by AutomationScript");
		
		findElements(KanbanBoardSettingLocators.sizeofallvalue()).get(sizeofelement-3).click();
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.SelectDateFromCalendor()));
		findElement(KanbanBoardSettingLocators.SelectDateFromCalendor()).click();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		
		
		
		
		
		
	
		
		

	//	explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.enterOpportunityNameInPutField()));
	//	findElement(KanbanBoardSettingLocators.clickOnNewButtonForCreateOpportunity()).sendKeys("Opportunity created by Automation");
		
	
		
	  //  explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.selectOpportuntiyCloseDate()));
	   // findElement(KanbanBoardSettingLocators.selectOpportuntiyCloseDate()).click();
		
		//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.SelectDateFromCalendor()));
		//findElement(KanbanBoardSettingLocators.SelectDateFromCalendor()).click();
		
		
		//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.ClickOnStagedropdown()));
		findElement(KanbanBoardSettingLocators.ClickOnStagedropdown()).click();
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.SelectDropdownValueQualification()));
		findElement(KanbanBoardSettingLocators.SelectDropdownValueQualification()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnsaveButtonforopp()));
		findElement(KanbanBoardSettingLocators.clickOnsaveButtonforopp()).click();
		
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.
		 * enterOpportunityNameInPutField()));
		 * findElement(KanbanBoardSettingLocators.enterOpportunityNameInPutField()).
		 * click();
		 * 
		 * findElement(KanbanBoardSettingLocators.enterOpportunityNameInPutField()).
		 * sendKeys("OpportunityCreatedByAutomatedTestScript");
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.clickOnAccountNameLookupIcon());
		 * findElement(KanbanBoardSettingLocators.clickOnAccountNameLookupIcon()).click(
		 * );
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * 
		 * //actions.click(findElement(KanbanBoardSettingLocators.
		 * clickonLokAccountNameIcon())).build().perform();
		 * actions.moveToElement(findElement(KanbanBoardSettingLocators.
		 * clickonLokAccountNameIcon())).click().build().perform();
		 * 
		 * 
		 * // explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.
		 * clickonLokAccountNameIcon()));
		 * //findElement(KanbanBoardSettingLocators.clickonLokAccountNameIcon()).click()
		 * ;
		 * 
		 * 
		 * 
		 * 
		 * explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.
		 * ClickOnStagedropdown()));
		 * findElement(KanbanBoardSettingLocators.ClickOnStagedropdown()).click();
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * 
		 * // actions.moveToElement(findElement(KanbanBoardSettingLocators.
		 * clickonLokAccountNameIcon())).click().build().perform();
		 * 
		 * 
		 * explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.
		 * SelectDropdownValueQualification()));
		 * findElement(KanbanBoardSettingLocators.SelectDropdownValueQualification()).
		 * click();
		 * 
		 * 
		 * 
		 * explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.
		 * ClickONsaveButton()));
		 * findElement(KanbanBoardSettingLocators.ClickONsaveButton()).click();
		 * 
		 */
		
		
		
		
		
		
		//List<String> setCollectionoAddedToList = new ArrayList<String>(set);
		
		
		
		
		
		
		  Set<String> set = new LinkedHashSet<String>(driver.getWindowHandles());
		  
		  System.out.println("KanbanBoardSettingHelper class Set variable :"+set);
		  
		  setCollectionoAddedToList = new ArrayList<String>(set);
		  
		  driver.switchTo().window(setCollectionoAddedToList.get(1));
		  
		 /* 
		 * driver.switchTo().frame("searchFrame");
		 * 
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.newButtonCreateAccountRecord());
		 * findElement(KanbanBoardSettingLocators.newButtonCreateAccountRecord()).click(
		 * );
		 * 
		 * driver.switchTo().parentFrame(); driver.switchTo().frame("resultsFrame");
		 * 
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.accountNameInputField());
		 * findElement(KanbanBoardSettingLocators.accountNameInputField()).sendKeys(
		 * "account1");
		 * 
		 * explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.
		 * accountRecordSaveButton()));
		 * findElement(KanbanBoardSettingLocators.accountRecordSaveButton()).click();
		 * 
		 * driver.switchTo().window(setCollectionoAddedToList.get(7));
		 * 
		 * explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.
		 * selectOpportuntiyCloseDate()));
		 * findElement(KanbanBoardSettingLocators.selectOpportuntiyCloseDate()).click();
		 * 
		 * selectValueFromDropdown(findElement(KanbanBoardSettingLocators.
		 * opportunityObjectStageDropdown()),"index","3"); //Needs Analysis
		 * 
		 * int opportunityObjectSaveButton =
		 * findElements(KanbanBoardSettingLocators.opportunityObjectSaveButtonList()).
		 * size();
		 * 
		 * explicitWaitElementToBeVisibleAllListItems(findElements(
		 * KanbanBoardSettingLocators.opportunityObjectSaveButtonList()));
		 * findElements(KanbanBoardSettingLocators.opportunityObjectSaveButtonList()).
		 * get(opportunityObjectSaveButton-2).click();
		 */
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		getOpportunityNameFromOpportunityObjectPage = driver.getTitle();
		System.out.println("Opportunity object record title LINE 421 :"+getOpportunityNameFromOpportunityObjectPage);	
		
		//driver.switchTo().window(regressionkanbanBoardWindowHandleValue);
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	public String verifyOpportunityCardTitleAfterCreating()
	{
		String opportunityCardTitle = findElement(KanbanBoardSettingLocators.getTitleOfOpportunityCard()).getText();//.substring(12);
		System.out.println("Opportunity card title from kanban card LINE 430 :"+opportunityCardTitle+"\n***************************************************************************************************************");
		return opportunityCardTitle;
	}
	
	
	public void clickOn_DefaultLinkOnKanbanBoard()
	{
		//*********************************************************Default Link To Plan Gantt Activity*****************************************************
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);
		
		driver.switchTo().window(handleValueOfKanbanBoardiFrameWindow);
		
		driver.switchTo().frame(0);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOn_NavIconScroller());
		findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.ClickOnGoBackIcon());
		//findElement(KanbanBoardSettingLocators.ClickOnGoBackIcon()).click();
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnProjectName());
		//findElement(KanbanBoardSettingLocators.clickOnProjectName()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnPlanGantt());
		findElement(KanbanBoardSettingLocators.clickOnPlanGantt()).click();
		try {Thread.sleep(1500);} catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocatedByWebElement", KanbanBoardRegressionLocators.switchToiFrame());
		driver.switchTo().frame(findElement(KanbanBoardRegressionLocators.switchToiFrame()));
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.planGanttMaskLoader());
		
		try {Thread.sleep(1500);} catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnPlusIconToAddActivity());
		findElement(KanbanBoardSettingLocators.clickOnPlusIconToAddActivity()).click();
		
		//try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.addActivity());
		findElement(KanbanBoardSettingLocators.addActivity()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		 
	     explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputTextfield()); 
	     
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputTextfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputTextfield()).sendKeys("Activity1");
	  	 findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputTextfield()).sendKeys(Keys.ENTER);
		
	//	performRandomClickOnWebPage();
		
	//	try {robot = new Robot();}catch(AWTException awtEx) {}
	//	robot.keyPress(KeyEvent.VK_ENTER);
	//	robot.keyRelease(KeyEvent.VK_ENTER);
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.planGanttMaskLoader());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.enterActivityName());
		String getDefaultActivityName = findElement(KanbanBoardSettingLocators.enterActivityName()).getText();
		System.out.println("Activity name :"+getDefaultActivityName);
		actions.doubleClick(findElement(KanbanBoardSettingLocators.enterActivityName())).perform();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.writeActivityName());
		try {Thread.sleep(1200);} catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.writeActivityName()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		try {Thread.sleep(1300);} catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.writeActivityName()).sendKeys("Activity A1");
		findElement(KanbanBoardSettingLocators.writeActivityName()).sendKeys(Keys.ENTER);*/
		
		//driver.switchTo().window(KanbanBoardRegressionHelper.multipleTabsOpen.get(2));
		
		
		//we take it case opportuniyu commented 
		 Set<String> set = new LinkedHashSet<String>(driver.getWindowHandles());
		  
		  System.out.println("KanbanBoardSettingHelper class Set variable :"+set);
		  
		  setCollectionoAddedToList = new ArrayList<String>(set);
		  
		  driver.switchTo().window(setCollectionoAddedToList.get(1));
		
		
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnDefaultLinkOptionUnderPreference());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.clickOnDefaultLinkOptionUnderPreference()).click();
		
		int projectCardLinkToProjectBoardDropdown = findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).size(); 
		System.out.println("Default link page all dropdown :"+projectCardLinkToProjectBoardDropdown);
		
		//Click on Project Dropdown
		//findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).get(projectCardLinkToProjectBoardDropdown-3).click();
		
		findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).get(projectCardLinkToProjectBoardDropdown-3).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnFolderName());
		findElement(KanbanBoardSettingLocators.clickOnFolderName()).click();
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.clickOnProjectName());
		findElement(KanbanBoardSettingLocators.clickOnProjectName()).click();		
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		// Click on Link to Project Board		
		findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).get(projectCardLinkToProjectBoardDropdown-2).click();
		explicitWaitElementBy("invisibilityOfElementLocated",KanbanBoardSettingLocators.loadMaskAfterSave());
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.selectPlanBoard());
		findElement(KanbanBoardSettingLocators.selectPlanBoard()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		// Click On Card Dropdown
		
		findElements(KanbanBoardSettingLocators.projectLinkToProjectBoardAndCardCommonDropdown()).get(projectCardLinkToProjectBoardDropdown-1).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectActivityName());
		findElement(KanbanBoardSettingLocators.selectActivityName()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();		
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		//driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);
		driver.switchTo().window(handleValueOfKanbanBoardiFrameWindow);
		
		driver.switchTo().frame(0);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		switchToiFrame("boardIfram");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.planGanttSettingGearIcon());
		findElement(KanbanBoardSettingLocators.planGanttSettingGearIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.planGanttZoomToFit());
		findElement(KanbanBoardSettingLocators.planGanttZoomToFit()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public boolean verifyMiniatureOnActivity()
	{
		boolean cardIsVisible = false;
		explicitWaitElementToBeVisibleAllListItems(findElements(KanbanBoardSettingLocators.verifyMiniatureOnActivityCardCount()));
		int cardCount = findElements(KanbanBoardSettingLocators.verifyMiniatureOnActivityCardCount()).size();
		System.out.println("Miniature count from activity :"+cardCount);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=cardCount; i++)
		{
			cardIsVisible = findElement(By.xpath("//div[contains(@id,'customganttpanel-')]//table[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div["+i+"]")).isDisplayed();
			
		}
		System.out.println("Activity Miniature :"+cardIsVisible+"\n***************************************************************************************************************");
		return cardIsVisible;
	}
	
	
	public void clickOnBoardSettingUnderPreference()
	{
		//**************************************************Board Setting Script*****************************************************************
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBoardSettingUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnBoardSettingUnderPreference()).click();
		int cardEffortIndicatorAndUseChatterFromLinkedRecord = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).size();//two dropdown xpath 
		System.out.println("Card Effort Indicator and Use Chatter From Linked Record Both Dropdown list count :"+cardEffortIndicatorAndUseChatterFromLinkedRecord);
		
		//click On Card Effort Indicator Dropdown
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-2);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownHours());
		findElement(KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownHours()).click();
				
		//Click on Use Chatter From Linked Record dropdown
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-1);//access element please see
		
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownCasesChatter());
		findElement(KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownCasesChatter()).click();
		
		int boardSettingAllCheckBoxSize = findElements(KanbanBoardSettingLocators.boardSettingAllCheckBox()).size();
		System.out.println("Board Setting all checkboxes size :"+boardSettingAllCheckBoxSize+"\n***************************************************************************************************************");
		
		for(int i=3; i<=7; i++)
		{
			
			findElement(By.xpath("//div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div["+i+"]/div[@class='x-component-outer']")).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			                       ////div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div/div[@class='x-component-outer']//1.304
		}                         //div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div[contains(@class,'preferencesCheckboxcls')]/div[@class='x-component-outer']// 1.300
		
		scrollinToView(findElement(KanbanBoardSettingLocators.scrollToRollupModeCheckbox()));
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.filterConfirmationField());
		findElement(KanbanBoardSettingLocators.filterConfirmationField()).click();
		findElement(KanbanBoardSettingLocators.filterConfirmationField()).clear();
		findElement(KanbanBoardSettingLocators.filterConfirmationField()).sendKeys("3");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());		
		
	  	//Uncheck All Checkbox Setting from Board Setting
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
 		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBoardSettingUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnBoardSettingUnderPreference()).click();
		
		//click On Card Effort Indicator Dropdown and select Point from dropdown
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-2);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownPoint());
		findElement(KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownPoint()).click();		
		
		//Click on Use Chatter From Linked Record dropdown and select Opportunities Chatter value
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-1);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownOpportunitiesChatter());
		findElement(KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownOpportunitiesChatter()).click();
		
		//uncheck All checkBox
		for(int i=4; i<=8; i++)
		{
			findElement(By.xpath("//div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div["+i+"]/div[@class='x-component-outer']")).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		scrollinToView(findElement(KanbanBoardSettingLocators.scrollToRollupModeCheckbox()));		
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.filterConfirmationField());
		findElement(KanbanBoardSettingLocators.filterConfirmationField()).click();
		findElement(KanbanBoardSettingLocators.filterConfirmationField()).clear();
		findElement(KanbanBoardSettingLocators.filterConfirmationField()).sendKeys("0");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
			
		//Click On Board Setting, change default value from Card Effort Indicator and Use Chatter From Linked Record dropdown
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBoardSettingUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnBoardSettingUnderPreference()).click();
		
		//click On Card Effort Indicator Dropdown and select Days from dropdown
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-2);
		explicitWaitVisibilityOf(webElement);
		webElement.click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownDays());
		findElement(KanbanBoardSettingLocators.selectValueFromCardEffortIndicatorDropdownDays()).click();
		
		//Click on Use Chatter From Linked Record dropdown and select Kanban Cards Chatter value
		webElement = findElements(KanbanBoardSettingLocators.boardSettingBothDropdownList()).get(cardEffortIndicatorAndUseChatterFromLinkedRecord-1);
		explicitWaitVisibilityOf(webElement);
		webElement.click();		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownKanbanCardsChatter());
		findElement(KanbanBoardSettingLocators.selectValueFromChatterFromLinkedRecordDropdownKanbanCardsChatter()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	public void clickOnInBoundEmailUnderPreference()
	{
		//*******************************************************************************************************
		
		
		
		//we write here bcz cases code r comented

		//regressionkanbanBoardWindowHandleValue = driver.getWindowHandle();
	//	System.out.println("Kanban Board Setting Script, kanban Board window handle value KanbanBoardSettingHelper class, clickOn_CasesUnderPreference method LINE 215 :"+regressionkanbanBoardWindowHandleValue);			//remove this line
		try {Thread.sleep(4000);} catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.preferenceOption());
		findElement(KanbanBoardSettingLocators.preferenceOption()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnInboundEmailUnderPreference());
		findElement(KanbanBoardSettingLocators.clickOnInboundEmailUnderPreference()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.defaultOwnerDropdown());
		findElement(KanbanBoardSettingLocators.defaultOwnerDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.inputFieldUnderOwnerDropdown());
		findElement(KanbanBoardSettingLocators.inputFieldUnderOwnerDropdown()).sendKeys("Pratish Laad");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSearchIconUnderDropdown());
		findElement(KanbanBoardSettingLocators.clickOnSearchIconUnderDropdown()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.selectOwnerAfterSearch()));
		findElement(KanbanBoardSettingLocators.selectOwnerAfterSearch()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.defaultCategoryDropdown());
		findElement(KanbanBoardSettingLocators.defaultCategoryDropdown()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.selectCategoryFromDefaultCategoryDropdown()));
		findElement(KanbanBoardSettingLocators.selectCategoryFromDefaultCategoryDropdown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSaveButton());
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	
	public void saveKanbanBoardData()
	{
		//************************Save kanban Board Start for Viewing Kanban Board in PDF format **************************************
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.toolBarSettingIcon());
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.saveOptionUnderSetting());
		findElement(KanbanBoardSettingLocators.saveOptionUnderSetting()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	
	public void cloneCompleteKanbanBoardWithStartDate()
	{
		//**********************************************************************************************************
		try {Thread.sleep(7000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneKanbanBoardOption());
		findElement(KanbanBoardSettingLocators.cloneKanbanBoardOption()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectBoardName());
		findElement(KanbanBoardSettingLocators.cloneProjectBoardName()).sendKeys("Clone Project by Automation with Start Date");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectDropdown());
		findElement(KanbanBoardSettingLocators.selectProjectDropdown()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectFromDropdownForClone());
	//	findElement(KanbanBoardSettingLocators.selectProjectFromDropdownForClone()).click();
		
	//	actions.moveToElement(findElement(KanbanBoardSettingLocators.selectProjectFromDropdownForClone())).contextClic.build().perform();
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.SearchProjectName()));
		findElement(KanbanBoardSettingLocators.SearchProjectName()).sendKeys("Regression Project");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnProject()));
		findElement(KanbanBoardSettingLocators.clickOnProject()).click();
		
		
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectStartDateCalender());
		findElement(KanbanBoardSettingLocators.cloneProjectStartDateCalender()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectHighlightedDate());
		String getSelectedDateOfToday = findElement(KanbanBoardSettingLocators.selectHighlightedDate()).getText();
		System.out.println("Select date highlighted :"+getSelectedDateOfToday);
		
		int getDayPanelList = findElements(KanbanBoardSettingLocators.dayPanelList()).size();
		System.out.println("List of all days :"+getDayPanelList);//42
		
		for(int i=1; i<= getDayPanelList; i++)
		{
			                                                   ////div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li["+i+"].gettext();//dayPanelList xpath 
			String getTextOfAllLiElements = findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li["+i+"]")).getText();//All dates text capturing
			
			if(getSelectedDateOfToday.equals(getTextOfAllLiElements))//if selected date and all capturing dateds are equals then check selected date is enabled or disable 
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				String getClassAttributeForCheckDisableOrEnable = findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i+3)+"]")).getAttribute("class");//selecyed date +2 ghene
				
				System.out.println("getClassAttributeForCheckDisableOrEnable :"+getClassAttributeForCheckDisableOrEnable);                                                              
						
				if(getClassAttributeForCheckDisableOrEnable.contains("disabled"))//jar selected value jar disable asel tar +4 value ghene and enabled asel tar tich ghene
				{
					findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i+5)+"]")).click();
				}
				else
				{
					findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i+3)+"]")).click();
				}
			}
		}
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.createButtonForCloneKanbanBoard());
		findElement(KanbanBoardSettingLocators.createButtonForCloneKanbanBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		for(String webhandle : driver.getWindowHandles())
		{
			driver.switchTo().window(webhandle);
		}
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public String isKanbanBoardClonedWithStartDate()
	{
		
		//this is case card code we tke here bcoz casecode r commented
		regressionkanbanBoardWindowHandleValue = driver.getWindowHandle();
		System.out.println("Kanban Board Setting Script, kanban Board window handle value KanbanBoardSettingHelper class, clickOn_CasesUnderPreference method LINE 215 :"+regressionkanbanBoardWindowHandleValue);			//remove this line
		
		
		String getTitleOfClonedKanbanBoard = driver.getTitle();
		System.out.println("Cloned kanban board title with start date LINE 802 :"+getTitleOfClonedKanbanBoard+"\n***************************************************************************************************************");
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		driver.switchTo().window(regressionkanbanBoardWindowHandleValue);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		return getTitleOfClonedKanbanBoard;
		
	}
	
	
	public void cloneCompleteKanbanBoardWithDueDate()
	{
		//********************************************************************************************************
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneKanbanBoardOption());
		findElement(KanbanBoardSettingLocators.cloneKanbanBoardOption()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectBoardName());
		findElement(KanbanBoardSettingLocators.cloneProjectBoardName()).sendKeys("Clone Project by Automation with Due Date");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectDropdown());
		findElement(KanbanBoardSettingLocators.selectProjectDropdown()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectFromDropdownForClone());
		
	    //actions.moveToElement(findElement(KanbanBoardSettingLocators.selectProjectFromDropdownForClone())).contextClick().build().perform();
		
		//findElement(KanbanBoardSettingLocators.selectProjectFromDropdownForClone()).click();
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.SearchProjectName()));
		findElement(KanbanBoardSettingLocators.SearchProjectName()).sendKeys("Regression Project");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOnProject()));
		findElement(KanbanBoardSettingLocators.clickOnProject()).click();
		
		
		
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.cloneProjectDueDateCalender());
		findElement(KanbanBoardSettingLocators.cloneProjectDueDateCalender()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectHighlightedDate());
		String getSelectedDateOfToday = findElement(KanbanBoardSettingLocators.selectHighlightedDate()).getText();
		System.out.println("Select date highlighted :"+getSelectedDateOfToday);
		
		int getDayPanelList = findElements(KanbanBoardSettingLocators.dayPanelList()).size();
		System.out.println("List of all days :"+getDayPanelList);
		
		for(int i=1; i<= getDayPanelList; i++)
		{
			String getTextOfAllLiElements = findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li["+i+"]")).getText();
			
			if((getSelectedDateOfToday.equals(getTextOfAllLiElements)) && ((i-2) != 0))
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				String getClassAttributeForCheckDisableOrEnable = findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i-3)+"]")).getAttribute("class");
				
				System.out.println("getClassAttributeForCheckDisableOrEnable :"+getClassAttributeForCheckDisableOrEnable);
				
				if(getClassAttributeForCheckDisableOrEnable.contains("disabled"))
				{
					findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i-4)+"]")).click();
					break;
				}
				else
				{
					findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i-3)+"]")).click();
					break;
				}
			}
		}
		
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.createButtonForCloneKanbanBoard()));
		findElement(KanbanBoardSettingLocators.createButtonForCloneKanbanBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		for(String webhandle : driver.getWindowHandles())
		{
			driver.switchTo().window(webhandle);
		}
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}	
	
	public String isKanbanBoardClonedWithDueDate()
	{
		String getTitleOfClonedKanbanBoard = driver.getTitle();
		System.out.println("Cloned kanban board title with due date LINE 882 : "+getTitleOfClonedKanbanBoard+"\n***************************************************************************************************************");
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		driver.switchTo().window(regressionkanbanBoardWindowHandleValue);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		return getTitleOfClonedKanbanBoard;
	}
	
	
	public void filterOnKanbanBoard()
	{
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.filterIcon());
		findElement(KanbanBoardSettingLocators.filterIcon()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeVisibleAllListItems(findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()));
		int advanceFilterSize = findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).size();
		System.out.println("Advance filter size LINE 897 :"+advanceFilterSize);
		
	    //Click on By Card/Task Owner Dropdown Filter
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-6).click();
	    explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnOwnerUnderCardTaskOwner());
		findElement(KanbanBoardSettingLocators.clickOnOwnerUnderCardTaskOwner()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnOwnerUnderCardTaskOwner());
		findElement(KanbanBoardSettingLocators.clickOnOwnerUnderCardTaskOwner()).click();
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-6).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on Category dropdown Filter
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-5).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCategoryUnderCategoryDropdown());
		findElement(KanbanBoardSettingLocators.selectCategoryUnderCategoryDropdown()).click();
     	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCategoryUnderCategoryDropdown());
		findElement(KanbanBoardSettingLocators.selectCategoryUnderCategoryDropdown()).click();
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-5).click();
		
	    try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		
		// click on By Sticker Dropdown Filter and upload sticker on Kanban Card.
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.filterIcon());
		findElement(KanbanBoardSettingLocators.filterIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardSettingLocators.uploadStickerOnDemoCardEdit()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnStickerSideColumn());
		findElement(KanbanBoardSettingLocators.clickOnStickerSideColumn()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectStickerForUploadOnDemoKanbanCard());
		findElement(KanbanBoardSettingLocators.selectStickerForUploadOnDemoKanbanCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie){}
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.clickOnSaveButton()));
		findElement(KanbanBoardSettingLocators.clickOnSaveButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.filterIcon());
		findElement(KanbanBoardSettingLocators.filterIcon()).click();
		
		//Click on By Sticker Dropdown filter
		try {Thread.sleep(1000);}catch(InterruptedException ie){}
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-4).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie){}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnStickerForFilterCard());		
		findElement(KanbanBoardSettingLocators.clickOnStickerForFilterCard()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie){}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnStickerForFilterCard());		
		findElement(KanbanBoardSettingLocators.clickOnStickerForFilterCard()).click();
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-4).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on By Priority dropdown filter
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-3).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectPriorityFromPriorityDropdown());
		findElement(KanbanBoardSettingLocators.selectPriorityFromPriorityDropdown()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie){}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectPriorityFromPriorityDropdown());
		findElement(KanbanBoardSettingLocators.selectPriorityFromPriorityDropdown()).click();
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-3).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//Click on By % Complete filter
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-2).click();
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-2).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//following code for sixth option portfolioPlanGantt while card has linking to the activity
		
		/*
		 * //click on By Portfolio: Plan Board(Regression Project) dropdown filter
		 * findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-2).click(); explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.selectByPortfolioPlanGantt());
		 * findElement(KanbanBoardSettingLocators.selectByPortfolioPlanGantt()).click();
		 * 
		 * try {Thread.sleep(2000);}catch(InterruptedException ie){}
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.selectByPortfolioPlanGantt());
		 * findElement(KanbanBoardSettingLocators.selectByPortfolioPlanGantt()).click();
		 * findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-2).click();
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * 
		 * //click on By Portfolio: Regression Kanban Board dropdown filter
		 * findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-1).click(); explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.selectByPortfolioKanbanBoard());
		 * findElement(KanbanBoardSettingLocators.selectByPortfolioKanbanBoard()).click(
		 * ); try {Thread.sleep(2000);}catch(InterruptedException ie){}
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.selectByPortfolioKanbanBoard());
		 * findElement(KanbanBoardSettingLocators.selectByPortfolioKanbanBoard()).click(
		 * ); findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-1).click();
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 */
		
		
		
		//Apply filter for all available options
		
		//===following code we can  select one option from every dropdown filter and save filter
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-6).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCardTaskOwner());
		findElement(KanbanBoardSettingLocators.selectCardTaskOwner()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-6).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-5).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCategory());
		findElement(KanbanBoardSettingLocators.selectCategory()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-5).click();
				
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-4).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnStickerForFilterCard());
		findElement(KanbanBoardSettingLocators.clickOnStickerForFilterCard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-4).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-3).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectPriority());
		findElement(KanbanBoardSettingLocators.selectPriority()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-3).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-2).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(advanceFilterSize-2).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//following code for sixth filter option availble while activity linking to card
		
		
		/*
		 * findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-2).click(); explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.selectByPortfolioPlanGantt());
		 * findElement(KanbanBoardSettingLocators.selectByPortfolioPlanGantt()).click();
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-2).click();
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * 
		 * findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-1).click(); explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.selectByPortfolioKanbanBoard());
		 * findElement(KanbanBoardSettingLocators.selectByPortfolioKanbanBoard()).click(
		 * ); try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * findElements(KanbanBoardSettingLocators.advanceFilterDropdownList()).get(
		 * advanceFilterSize-1).click();
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 */
		
		
	
		
		
		
		
		// following code for the save the filter on kb and by switching on cv see filter green apply 
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.saveFilterButton()));
		findElement(KanbanBoardSettingLocators.saveFilterButton()).click();
		
		
		//this is case card code we tke here bcoz casecode r commented
		
		regressionkanbanBoardWindowHandleValue = driver.getWindowHandle();
		System.out.println("Kanban Board Setting Script, kanban Board window handle value KanbanBoardSettingHelper class, clickOn_CasesUnderPreference method LINE 215 :"+regressionkanbanBoardWindowHandleValue);			//remove this line
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.calenderViewIcon());
		findElement(KanbanBoardSettingLocators.calenderViewIcon()).click();
		
		try {Thread.sleep(7000);}catch(InterruptedException ie) {}
		
						
		for(String windowHandleTab : driver.getWindowHandles())
		{
			driver.switchTo().window(windowHandleTab);
		}
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		boolean isLoaderVisible = findElement(KanbanBoardSettingLocators.calenderViewLoader()).isDisplayed();
		System.out.println("Calender view loader visibility 1067 :"+isLoaderVisible+
		"\n***************************************************************************************************************");
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.calenderViewLoader());
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		driver.switchTo().window(regressionkanbanBoardWindowHandleValue);
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.filterIcon());
		findElement(KanbanBoardSettingLocators.filterIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.resetFilter());
		findElement(KanbanBoardSettingLocators.resetFilter()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeFilterWindow());
		findElement(KanbanBoardSettingLocators.closeFilterWindow()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	
	
	
	
	
	public void collapseExpandMasterContainerByClickingOnEachCheckbox()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.collapseExpandIcon());
		findElement(KanbanBoardSettingLocators.collapseExpandIcon()).click();
		
		int collapseExpandLength = findElements(KanbanBoardSettingLocators.collapseAndExpandAllMasterContainerElementSize()).size();
		System.out.println("Collapse/Expand Master Container Popup element size :"+collapseExpandLength);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		int incrementor = 0;
		
		for(int i=1; i<= collapseExpandLength-1; i++)   //div[contains(@style,'width: 245px !important; height: 45%')]//div[contains(@class,'x-unsized x-list-item categoryListCls x-has-height x-list-item-tpl')]
		{
			String incrementId = findElement(By.xpath("//div[contains(@style,'translate3d(0px, "+incrementor+"px, 0px);') and contains(@class,'x-unsized x-list-item categoryListCls x-has-height x-list-item-tpl')]")).getAttribute("id");
			System.out.println(i +" index id attribute value :"+incrementId);
			
			findElement(By.id(incrementId)).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			incrementor = incrementor + 40;
			System.out.println("Increment value :"+incrementor);
			
			if(i == 6)
			{
				boolean isCollapseAllMasterContainer = findElement(KanbanBoardSettingLocators.collapseAllMasterContainerCheck()).isSelected();
				System.out.println("All master container are Collapse on Kanban Board and Collapse all checkbox returns :"+isCollapseAllMasterContainer);
							
				for(int j=i; j>= 1; j--)
				{
					incrementor = incrementor - 40;
					System.out.println("Decrement value: "+incrementor);
					
					String decrementId = findElement(By.xpath("//div[contains(@style,'translate3d(0px, "+incrementor+"px, 0px);') and contains(@class,'x-unsized x-list-item categoryListCls x-has-height x-list-item-tpl')]")).getAttribute("id");
					System.out.println(i +" index id attribute value :"+decrementId);
					
					findElement(By.id(decrementId)).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				}
				System.out.println("**************************************************************************************************");
				break;
			}
			
		}
	}
	
	public boolean isExpandAllMasterContainer()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		boolean isAllExpand = findElement(KanbanBoardSettingLocators.collapseAllMasterContainerCheck()).isSelected();
		System.out.println("All master containers are expanded on kanban board, method isExpandAllMasterContainer returns :"+isAllExpand+
		"\n************************************************************************************************");
		return isAllExpand;
	}
	
	public void collapseMasterContainerByClickingCollapseAllCheckBox()
	{
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCollapseAllCheckbox());
		findElement(KanbanBoardSettingLocators.clickOnCollapseAllCheckbox()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public String isAllMasterContainerCheckTrue()
	{
		String getMasterContainerStatus = null;
		String incrementId = null ;
		int masterContainerClassAttributeLength;
		int incrementor = 0;
		
		int allMasterContainerCheckboxSize = findElements(KanbanBoardSettingLocators.masterContainerCountUnderCollapseExpandWindow()).size() - 26;
		System.out.println("All master container checkbox count :"+allMasterContainerCheckboxSize);
		
		for(int i=1; i<= allMasterContainerCheckboxSize; i++)
		{
			incrementId = findElement(By.xpath("//div[contains(@style,'translate3d(0px, "+incrementor+"px, 0px);') and contains(@class,'x-unsized x-list-item categoryListCls x-has-height x-list-item-tpl')]")).getAttribute("id");
			System.out.println(i +" index id attribute value :"+incrementId);
			
			masterContainerClassAttributeLength = findElement(By.xpath("//div[contains(@style,'translate3d(0px, "+incrementor+"px, 0px);') and contains(@class,'x-unsized x-list-item categoryListCls x-has-height x-list-item-tpl')]")).
												  getAttribute("class").length();
			System.out.println("Length of class attribute value "+masterContainerClassAttributeLength +" for selected master container using specified index "+i +" under collapse and expand master container tab.");
			
			incrementor = incrementor + 40;
			System.out.println("Incrementor value :"+incrementor);
			
			switch(masterContainerClassAttributeLength)
			{
			case 119 :
				getMasterContainerStatus = findElement(By.id(incrementId)).getAttribute("class").substring(111);
				System.out.println(i+" element with "+masterContainerClassAttributeLength +" status of master container :"+getMasterContainerStatus);
				break;
				
			case 82 :
				getMasterContainerStatus = findElement(By.id(incrementId)).getAttribute("class").substring(74);
				System.out.println(i+" element with "+masterContainerClassAttributeLength +" status of master container :"+getMasterContainerStatus);
				break;
				
			case 118 :
				getMasterContainerStatus = findElement(By.id(incrementId)).getAttribute("class").substring(110);
				System.out.println(i+" element with "+masterContainerClassAttributeLength +" status of master container :"+getMasterContainerStatus+
				"\n************************************************************************************************");
				break;
				
			default :
				System.out.println("Invalid class attribute length for Collapse/Expand master containers.");
			}
		}
		return getMasterContainerStatus;
	}
	
	public void expandMasterContainerByClickingCollapseAllCheckBox()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCollapseAllCheckbox());
		findElement(KanbanBoardSettingLocators.clickOnCollapseAllCheckbox()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}
	
	public boolean isAllMasterContainerExpandAfterUncheck()
	{
		boolean isAllExpand = findElement(KanbanBoardSettingLocators.collapseAllMasterContainerCheck()).isSelected();
		System.out.println("Is all Master Container Expand :"+isAllExpand+"\n**********************************************************************************");
		return isAllExpand;
	}
	
	
	public void panKanbanBoard()
	{
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		//Get All Master Container Length
		KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();
		System.out.println("Size of all master containers present on regression kanban Board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		//Archive MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 1).
																			getAttribute("id");
		System.out.println("Archive master container panKanbanBoard method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		/*
		 * explicitWaitElementBy("elementToBeLocated",
		 * AddToBoardFanButtonLocators.createdVisualAnalyticBurnDownReportChart());
		 * actions.dragAndDrop(findElement(AddToBoardFanButtonLocators.
		 * createdVisualAnalyticBurnDownReportChart()),
		 * findElement(By.id(KanbanBoardRegressionHelper.
		 * getMasterContainerDynamicWebElementId))). build().perform(); try
		 * {Thread.sleep(1500);}catch(InterruptedException ie) {}
		 */
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.panBoardIcon());
		findElement(KanbanBoardSettingLocators.panBoardIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//In Progress MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 4).
																			getAttribute("id");
		System.out.println("InProgress master container panKanbanBoard method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		explicitWaitElementBy("elementToBeLocated",By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId));
		
		actions.moveToElement(findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		actions.clickAndHold(findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).build().perform();
		actions.dragAndDrop(findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId)) , 
		findElement(KanbanBoardSettingLocators.kanbanBoardToolBarHeader())).build().perform();
		
		
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.kanbanBoardToolBarHeader());
		actions.moveToElement(findElement(KanbanBoardSettingLocators.kanbanBoardToolBarHeader())).
		release().build().perform();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public boolean verifyPanBoard()
	{
		wait.until(ExpectedConditions.invisibilityOfElementWithText(KanbanBoardSettingLocators.masterContainerName(), "Review & Approve "));
		boolean isKanbanBoardNameAreVisible = findElement(KanbanBoardSettingLocators.masterContainerName()).isDisplayed();
		System.out.println("Name header of Master Container visibility :"+isKanbanBoardNameAreVisible+"\n**********************************************************************************");
		return isKanbanBoardNameAreVisible;
	}
	
	
	public void resetkanbanBoard()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.resetKanbanBoardIcon());
		findElement(KanbanBoardSettingLocators.resetKanbanBoardIcon()).click();
	}
	
	public boolean verifyResetKanbanBoard()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.masterContainerName());
		boolean isMasterContainerVisible = findElement(KanbanBoardSettingLocators.masterContainerName()).isDisplayed();
		System.out.println("Master container visibility :"+isMasterContainerVisible+"\n**********************************************************************************");
		return isMasterContainerVisible;
	}
	
		
	public void view_SaveAsPDF()//
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.toolBarSettingIcon());// this line of code for save the board until save created cards are not save in pdf
		findElement(KanbanBoardSettingLocators.toolBarSettingIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.saveOptionUnderSetting());
		findElement(KanbanBoardSettingLocators.saveOptionUnderSetting()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());//for load mask
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());//for board refresh
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.viewSaveAsPdfIcon());
		findElement(KanbanBoardSettingLocators.viewSaveAsPdfIcon()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closePdfWindow());
		findElement(KanbanBoardSettingLocators.closePdfWindow()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	}	
	
	
	
	public void kanbanBoardViewAllChatters()
	{
		//  we take it for taking following viewAllChatterSalesCategoryChatter
		regressionkanbanBoardWindowHandleValue = driver.getWindowHandle();
    	System.out.println("Kanban Board Setting Script, kanban Board window handle value KanbanBoardSettingHelper class, clickOn_CasesUnderPreference method LINE 215 :"+regressionkanbanBoardWindowHandleValue);			//remove this line remove after
			
		
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.viewAllChatterIcon());
		findElement(KanbanBoardSettingLocators.viewAllChatterIcon()).click();
		
		int openButtonSize = findElements(KanbanBoardSettingLocators.chatterWindowOpenButton()).size();
		System.out.println("Chatter window Open button size :"+openButtonSize);
		
		findElements(KanbanBoardSettingLocators.chatterWindowOpenButton()).get(openButtonSize-2).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.inspectIframe());
		getIframeSRCAttribute = findElement(KanbanBoardSettingLocators.inspectIframe()).getAttribute("src");
		System.out.println("src :"+getIframeSRCAttribute);
		
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
		
		handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardSettingLocators.clickOnPostLink());
		
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 1327 :"+postWindowVisibility);
		
		if(postWindowVisibility == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.inspectChildiFrame());
			childiFrameValue = findElement(KanbanBoardSettingLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame class attribute value :"+childiFrameValue);
			
			driver.switchTo().frame(findElement(KanbanBoardSettingLocators.getChildiFrameClassAttributeValue()));
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnChatterTextArea());
			findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 1342 :"+chatterWindow);
			
			if(chatterWindow == true)
			{
				explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()));
				findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Kanban Board Chatter!!");
				
				//driver.switchTo().parentFrame();
				driver.switchTo().parentFrame();
				
				explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.chatterShareButton()));
				findElement(KanbanBoardSettingLocators.chatterShareButton()).click();
				
				explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.textDivArea());		//change has been made on this line
				textAreaIDAttribute = findElement(KanbanBoardSettingLocators.textDivArea()).getAttribute("id");
				System.out.println("Kanban Board Chatter text Area ID Attribute LINE 1356 :"+textAreaIDAttribute);
				
				explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.getTextFromChatterSubWindow());	// this line has been added additionally
				String chatterText = findElement(KanbanBoardSettingLocators.getTextFromChatterSubWindow()).getText();
				System.out.println("After Chatter get text from chatter sub window LINE 1360 :"+chatterText);
				
				driver.switchTo().defaultContent();
				
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeKanbanBoardChatterPopup());
				findElement(KanbanBoardSettingLocators.closeKanbanBoardChatterPopup()).click();
			}
		}
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		openNewBrowserWindowTab(getIframeSRCAttribute); // We take src url and open it new tab
		
		wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		boolean isUrlVisible = wait.until(ExpectedConditions.urlContains(getIframeSRCAttribute));
		System.out.println("is URL visible :"+isUrlVisible+"\n*****************************************************************************************************");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.getTextFromChatterSubWindow());
	}
	
	public String verifyViewAllChatters()
	{
		String text = findElement(KanbanBoardSettingLocators.getChatterTextFromHomePage()).getText();//after oening the new tab get text which is already posted
		System.out.println("New window opened get text from chatter window :"+text+"\n*****************************************************************************************************");
		return text;
	}
	
	
	public void viewAllChatterSalesCategoryChatter()
	{
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		driver.switchTo().window(regressionkanbanBoardWindowHandleValue);
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.isCardCategoryChatterWindowVisible());
		boolean isCardCategoryVisible = findElement(KanbanBoardSettingLocators.isCardCategoryChatterWindowVisible()).isDisplayed();
		System.out.println("Card Category window LINE 1395 :"+isCardCategoryVisible);
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.openSalesCategoryCardChatter());
		findElement(KanbanBoardSettingLocators.openSalesCategoryCardChatter()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		
		getIframeSRCAttribute = findElement(KanbanBoardSettingLocators.inspectIframe()).getAttribute("src");
		System.out.println("src LINE 1403 :"+getIframeSRCAttribute);
		
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardSettingLocators.clickOnPostLink());
		
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(KanbanBoardSettingLocators.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window is visible LINE 1411 :"+postWindowVisibility);
		
		if(postWindowVisibility == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.inspectChildiFrame());
			childiFrameValue = findElement(KanbanBoardSettingLocators.inspectChildiFrame()).getAttribute("class");
			System.out.println("Child iFrame classs attribute value :"+childiFrameValue);
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.getChildiFrameClassAttributeValue());
			driver.switchTo().frame(findElement(KanbanBoardSettingLocators.getChildiFrameClassAttributeValue()));
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnChatterTextArea());
			findElement(KanbanBoardSettingLocators.clickOnChatterTextArea()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			boolean chatterWindow = findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).isDisplayed();
			System.out.println("Chatter Window visibility LINE 1427 :"+chatterWindow);
			
			if(chatterWindow == true)
			{
				explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.writeOnChatterTextArea());
				findElement(KanbanBoardSettingLocators.writeOnChatterTextArea()).sendKeys("Hello..!! Chatter on Kanban Card Sales Category Card.");
				
				driver.switchTo().parentFrame();
				
				explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.chatterShareButton());
				findElement(KanbanBoardSettingLocators.chatterShareButton()).click();
				
				explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.textDivArea());
				textAreaIDAttribute = findElement(KanbanBoardSettingLocators.textDivArea()).getAttribute("id");
				System.out.println("Sales category Kanban Card Chatter text Area ID Attribute LINE 1441	:"+textAreaIDAttribute);
				
				 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				//String chatterText = findElement(KanbanBoardSettingLocators.getChatterTextFromHomePage()).getText();
			//	System.out.println("After Chatter get text from chatter sub window :"+chatterText);
				
				driver.switchTo().defaultContent();
				
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				
				
				explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeKanbanBoardChatterPopup());
				findElement(KanbanBoardSettingLocators.closeKanbanBoardChatterPopup()).click();
				
			}
		}
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.closeChatterWindow());
		findElement(KanbanBoardSettingLocators.closeChatterWindow()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		// Get Count of master containers present on Regression Kanban Board
		KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();
		System.out.println("Size of all master containers present on Regression kanban board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		//In Progress MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																		 	get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 4).
																			getAttribute("id");
		System.out.println("InProgress master container viewAllChatterSalesCategoryChatter method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnSalesCardChatterIcon());
		findElement(KanbanBoardSettingLocators.clickOnSalesCardChatterIcon()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.salesCategoryCardLoadMask());
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.inspectIframe());
		getIframeSRCAttribute = findElement(KanbanBoardSettingLocators.inspectIframe()).getAttribute("src");
		System.out.println("iFrame source attribute value viewAllChatterSalesCategoryChatter method, class KanbanBoardSettingHelper :"+getIframeSRCAttribute+
		"\n*****************************************************************************************************");
		
		driver.switchTo().frame(findElement(KanbanBoardSettingLocators.iFrameSrcValueAndSwitchTo()));
	}
	
	public String verifyViewAllChatterSalesCategoryCardCount()
	{
		explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.textDivArea());
		String salesCategoryCardChatterText = findElement(KanbanBoardSettingLocators.getChatterTextFromHomePage()).getText();
		System.out.println("Sales Category Card Chatter text :"+salesCategoryCardChatterText+
		"\n*****************************************************************************************************");
		return salesCategoryCardChatterText;
	}
	
	
	public void notificationBellIcon()
	{
		try {Thread.sleep(25000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.notificationBellIcon());
		findElement(KanbanBoardSettingLocators.notificationBellIcon()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		findElement(By.xpath("//body")).click();
	}
	
	public void addCardToBoardNewIcon()
	{
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.addCardToBoard());
		findElement(KanbanBoardSettingLocators.addCardToBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCategoryDropDown());
		findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectCategoryFromDropDownValueHr());
		findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueHr()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.enterCardId());
		findElement(KanbanBoardRegressionLocators.enterCardId()).sendKeys("HR001");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.enterCardTitle());
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).sendKeys("Card Creating by new icon");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCreateButtonForCard());
		findElement(KanbanBoardRegressionLocators.clickOnCreateButtonForCard()).click();
		try {Thread.sleep(4500);}catch(InterruptedException ie) {}
	}
	
	public void undoOnKanbanBoard()
	{	
		//Backlog MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 5).
																			getAttribute("id");
		System.out.println("Backlog master container undoOnKanbanBoard method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectCardToPerformUndoAction());
		findElement(KanbanBoardSettingLocators.selectCardToPerformUndoAction()).click();
		try {Thread.sleep(1500);} catch(InterruptedException ie) {}
		
		//InProgress MasterContainer
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 4).
																			getAttribute("id");
		System.out.println("InProgress master container undoOnKanbanBoard method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+
		"\n*****************************************************************************************************");
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).
		dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()),
		findElement(By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId))).
		build().perform();
		
		try {Thread.sleep(1500);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnDeleteSideColumn());
		findElement(KanbanBoardSettingLocators.clickOnDeleteSideColumn()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.yesButtonAfterDelete());
		findElement(KanbanBoardSettingLocators.yesButtonAfterDelete()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.undoIcon());
		findElement(KanbanBoardSettingLocators.undoIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.yesButtonAfterDelete());
		explicitWaitElementToBeClickable(findElement(KanbanBoardSettingLocators.yesButtonAfterDelete()));
		findElement(KanbanBoardSettingLocators.yesButtonAfterDelete()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public String verifyCardAfterUndo()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.verifyCardAfterUndoAction());
		String getTitleOfCardAfterPerformingUndo = findElement(KanbanBoardSettingLocators.verifyCardAfterUndoAction()).getText();
		System.out.println("Title of card after undo operation perform :"+getTitleOfCardAfterPerformingUndo+"\n*******************************************************************************************************");
		return getTitleOfCardAfterPerformingUndo;
	}
	
	
	public void backlogMasterContainerCloneCards()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.kanbanBoardMasterContainersToolBarCount());
		KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(KanbanBoardSettingLocators.kanbanBoardMasterContainersToolBarCount()).size();
		System.out.println("Size of all master containers present on regression kanban Board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		//Backlog Master Container Arrow Icon
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(KanbanBoardSettingLocators.kanbanBoardMasterContainersToolBarCount()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 5).
																			getAttribute("id");
		System.out.println("Backlog master container arrow icon, backlogMasterContainerCloneCards method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow());
		findElement(KanbanBoardSettingLocators.clickOnBacklogMasterContainerArrow()).click();
		
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer());		//Need to Change xPath to 'Clone Cards'
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsUnderBacklogMasterContainer()).click();
		
	    explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		int cloneAllCardsPopupTargetBoardWindowFieldSize = findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).size();//cloneAllCardsPopupTargetBoardWindowFieldSize
		System.out.println("cloneAllCardsPopupTargetBoardWindowFieldSize clone backlog master container all cards to ^^REGRESSION KANBAN BOARD FOR LINK ONE CARD TO IT^^ :"+cloneAllCardsPopupTargetBoardWindowFieldSize);
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		
		//Click on Select Project dropdown
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(cloneAllCardsPopupTargetBoardWindowFieldSize - 6).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnFolderWhichWillSelect());
		findElement(KanbanBoardSettingLocators.clickOnFolderWhichWillSelect()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectNameAfterExpandFolder());
		findElement(KanbanBoardSettingLocators.selectProjectNameAfterExpandFolder()).click();
		
		//Click On Select Project Board
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(cloneAllCardsPopupTargetBoardWindowFieldSize - 5).click();
		explicitWaitElementToBeLocated(KanbanBoardSettingLocators.selectKanbanBoardUnderSelectProjectBoard());
		findElement(KanbanBoardSettingLocators.selectKanbanBoardUnderSelectProjectBoard()).click();
		
		//Click on Select Column
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(cloneAllCardsPopupTargetBoardWindowFieldSize - 4).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown());
		findElement(KanbanBoardSettingLocators.selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCloneCardsButton());
		findElement(KanbanBoardSettingLocators.clickOnCloneCardsButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		
		//driver.switchTo().window(KanbanBoardRegressionHelper.multipleTabsOpen.get(2));
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.alertMessageOnKanbanBoard());
		
		boolean alertMessageShown = findElement(KanbanBoardSettingLocators.alertMessageOnKanbanBoard()).isDisplayed();
		System.out.println("Alter popup message on REGRESSION KANBAN BOARD FOR LINK ONE CARD TO IT :"+alertMessageShown+
		"\n*******************************************************************************************************");
		
		if(alertMessageShown == true)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeClickableByLocator", KanbanBoardSettingLocators.clickOkButtonOnAlertMessage());
			findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click();
			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		}
	}
	
	
	public boolean isBacklogMasterContainerCardsCloned()
	{
		//Get All Master Container length on REGRESSION KANBAN BOARD FOR LINK ONE CARD TO IT
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers());
		KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();
		System.out.println("Size of all master containers present on regression kanban Board for link one card to it :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		//Review and Approve MasterContainer of 'REGRESSION KANBAN BOARD FOR LINK ONE CARD TO IT' Board
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 3).
																			getAttribute("id");
		System.out.println("Review and Approve master container id, isBacklogMasterContainerCardsCloned method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		boolean isAllKanbanCardCloned = false;
		
		int clonedKanbanCardCount = findElements(KanbanBoardSettingLocators.getListOfAllClonedKanbanCard()).size();
		System.out.println("Count of backlog master container kanban card which is cloned on ^^^Regression Kanban Board for link one card to it^^^ kanban board :"+clonedKanbanCardCount);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		for(int i=1; i<= clonedKanbanCardCount; i++)
		{
			isAllKanbanCardCloned = findElement(By.xpath("//form[@id='"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+"']//div[@class='x-unsized x-dataview-container']/div["+i+"]")).
			isDisplayed();
			System.out.print(isAllKanbanCardCloned +" ");
		}
		System.out.println("\n***********************************************************************************************************************************");
		return isAllKanbanCardCloned;
	}
	
	
	public void reviewAndApproveMasterContainerHyperjumpCards()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.kanbanBoardMasterContainersToolBarCount());
		KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(KanbanBoardSettingLocators.kanbanBoardMasterContainersToolBarCount()).size();
		System.out.println("Size of all master container present on regression kanban board for link one card to it :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		//Review and Approve Master Container Arrow Icon
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(KanbanBoardSettingLocators.kanbanBoardMasterContainersToolBarCount()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 3).
																			getAttribute("id");
		System.out.println("Review and Approve master container arrow icon, reviewAndApproveMasterContainerHyperjumpCards method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnReviewAndApprovalMasterContainerArrow());
		findElement(KanbanBoardSettingLocators.clickOnReviewAndApprovalMasterContainerArrow()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnHyperjumpCardsUnderReviewAndArroveMasterContainer());
		findElement(KanbanBoardSettingLocators.clickOnHyperjumpCardsUnderReviewAndArroveMasterContainer()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		
		int hyperjumpCardsPopupWindowTargetBoardFieldSize = findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).size();
		System.out.println("HyperjumpReviewAndApproveMasterContainerCardsTo ^^REGRESSION KANBAN BOARD^^ and Sub Window size LINE 1714 :"+hyperjumpCardsPopupWindowTargetBoardFieldSize);
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		//Click on Select Project dropdown
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperjumpCardsPopupWindowTargetBoardFieldSize - 6).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnfoderwhichwilselectForHyperjump());
		findElement(KanbanBoardSettingLocators.clickOnfoderwhichwilselectForHyperjump()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectProjectNameAfterExpandFolderforHyperjump());
		findElement(KanbanBoardSettingLocators.selectProjectNameAfterExpandFolderforHyperjump()).click();
		
		//Click On Select Project Board
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperjumpCardsPopupWindowTargetBoardFieldSize - 5).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectKanbanBoardUnderProjectBoardDropdownforHyperjump());
		findElement(KanbanBoardSettingLocators.selectKanbanBoardUnderProjectBoardDropdownforHyperjump()).click();
		
		//Click on Select Column
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		findElements(KanbanBoardSettingLocators.hyperJumpCardsSubWindows()).get(hyperjumpCardsPopupWindowTargetBoardFieldSize - 4).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown());
		findElement(KanbanBoardSettingLocators.selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeClickableByLocator", KanbanBoardSettingLocators.clickOnJumpButton());
		findElement(KanbanBoardSettingLocators.clickOnJumpButton()).click();
		
		/*
		 * explicitWaitElementBy("invisibilityOfElementLocated",
		 * KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		 * 
		 * driver.switchTo().window(KanbanBoardRegressionHelper.multipleTabsOpen.get(1))
		 * ; try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		 * 
		 * explicitWaitElementBy("elementToBeLocated",
		 * KanbanBoardSettingLocators.alertMessageOnKanbanBoard()); boolean
		 * alertMessageShown =
		 * findElement(KanbanBoardSettingLocators.alertMessageOnKanbanBoard()).
		 * isDisplayed();
		 * System.out.println("Alert popup on ^^Regression Kanban Board^^ :"
		 * +alertMessageShown+
		 * "\n***********************************************************************************************************************************"
		 * );
		 * 
		 * if(alertMessageShown == true) { try
		 * {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * explicitWaitElementBy("elementToBeClickableByLocator",
		 * KanbanBoardSettingLocators.clickOkButtonOnAlertMessage());
		 * findElement(KanbanBoardSettingLocators.clickOkButtonOnAlertMessage()).click()
		 * ;
		 * 
		 * explicitWaitElementBy("invisibilityOfElementLocated",
		 * KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard()); try
		 * {Thread.sleep(2000);}catch(InterruptedException ie) {} }
		 */
	}
	
	public boolean isReviewAndApproveMasterContainerCardsHyperjumped()
	{
		//Get All Master Container length on REGRESSION KANBAN BOARD
		explicitWaitElementBy("elementToBeLocated", AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers());
		KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();
		System.out.println("Size of all master containers present on regression kanban Board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		//Review and Approve MasterContainer of 'REGRESSION KANBAN BOARD'
		KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
																			get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 3).
																			getAttribute("id");
		System.out.println("Review and Approve master container id, isReviewAndApproveMasterContainerCardsHyperjumped method, class KanbanBoardSettingHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		boolean isAllkanbanCardHyperjumped = false;
		
		int hyperJumpedCardCount = findElements(KanbanBoardSettingLocators.getListOfAllClonedKanbanCard()).size() - 1;
		System.out.println("Count of review and approve master container kanban card which is hyperjumped on ^^^REGRESSION KANBAN BOARD^^^ board :"+hyperJumpedCardCount);
		
		for(int i=1; i<= hyperJumpedCardCount; i++)
		{
			isAllkanbanCardHyperjumped = findElement(By.xpath("//form[@id='"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+"']//div[@class='x-unsized x-dataview-container']/div["+i+"]")).
			isDisplayed();
			System.out.print(isAllkanbanCardHyperjumped +" ");
		}
		System.out.println("\n***********************************************************************************************************************************");
		return isAllkanbanCardHyperjumped;
	}
}