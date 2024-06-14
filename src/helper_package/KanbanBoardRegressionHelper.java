package helper_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.AddToBoardFanButtonLocators;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;

public class KanbanBoardRegressionHelper extends CommonMethodsOfWebDriver {
	

	public String getUpdatedCardDuedate, getUserNameWhileCardUpdate, getResourceNameFromResourceTab, getCardAllocationFromResourceTab, getCardDuedate;
	public static String cardStartDateWhileCreating, classAttributeValueOfQuickActionSideColumn, linkColumnLinkToProjectName, linkColumnLinkToProjectBoardKanbanBoardName,
	linkColumnLinkToCardKanbanCardName, idValuOfFormElementStickerSubWinow, riskTypeRadioButtonValue, handleValueOfKanbanBoardiFrameWindow, getIdValueOfForm, getMasterContainerDynamicWebElementId,
	masterContainerDynamicallyGetFormIdOfAnotherKanbanBoard, getIframeWindowNameAttributeValue,handleValueOfKanbanBoardMain,windowHandleForKanbanBoard;
	public static WebElement addCardToBoardSource ,backlogMasterZoneDestination,InprogressMasterZoneDestination;//th is webelement
	public static int getSizeOfAllMasterContainersFromRegressionKanbanBoard,Sizeofallfooter;
	public static ArrayList<String> multipleTabsOpen;
	
	public void creatingSingleKanbanCard()
	{
	
		
		

		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		
				
		
	    explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()).click();
		
		
		handleValueOfKanbanBoardMain = driver.getWindowHandle();
		System.out.print("handleValueOfKanbanBoardiFrameWindow in iFrame LINE 122 :"+handleValueOfKanbanBoardMain+"\n*******************************************************************************************************************\n");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	     //explicitWaitElementBy("presenceOfElementLocated", KanbanBoardRegressionLocators.leankorLeftNavigation());
		 //try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	    //explicitWaitElementBy("elementToBeLocatedByWebElement", KanbanBoardRegressionLocators.clickOnFolderIcon());
     	//findElement(KanbanBoardRegressionLocators.clickOnFolderIcon()).click();
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.enterFolderName());
		findElement(KanbanBoardRegressionLocators.enterFolderName()).sendKeys("Regression Folder");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnAddButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()));
		//explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()));
		// click on the compose button as soon as the "compose" button is visible
		//jsExecutorClickOnElement(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()));
		
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder())).build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCreatedFolder());
		findElement(KanbanBoardRegressionLocators.clickOnCreatedFolder()).click();
		
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
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnProjectSetupUnderCreatedProject());
		findElement(KanbanBoardRegressionLocators.clickOnProjectSetupUnderCreatedProject()).click();
		switchToiFrame("boardIfram");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.checkAssignActivityResourceUnderProjectSetup()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.checkAssignActivityResourceUnderProjectSetup())).click().build().perform();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}	
		actions.sendKeys(Keys.END).build().perform();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.checkRollupCheckBox()));
		findElement(KanbanBoardRegressionLocators.checkRollupCheckBox()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeVisibleAllListItems(findElements(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup()));
		//int saveButtonCount = findElements(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup()).size();
		//findElements(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup()).get(saveButtonCount-2).click();
		((WebElement) findElements(KanbanBoardRegressionLocators.clickOnSaveButtonForProjectSetup())).click();
		//this line is for success message appears or not
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.projectSetupSaveSuccessMessageAfterSave());
		boolean projectSetupSettingSuccessfullSave = findElement(KanbanBoardRegressionLocators.projectSetupSaveSuccessMessageAfterSave()).isDisplayed();
		System.out.println("Project setup successfull save message LINE 93 :"+projectSetupSettingSuccessfullSave);
		
		driver.switchTo().parentFrame();
	
		if(projectSetupSettingSuccessfullSave==true)
		{
			boolean navScroller = findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).isDisplayed();
			System.out.println("Nav scroller : "+navScroller+"\n*******************************************************************************************************************");
			actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller())).click().build().perform();
		}*/
		
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
		
	
		try {Thread.sleep(7000);}catch(InterruptedException ie) {}

	
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
	  
	  
	 // explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown()));
	  
	  actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown())).build().perform();
	  
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
	  
	  getCardDuedate = findElement(KanbanBoardRegressionLocators.fetchDueDateOfCardWhileCreating()).getText().substring(9,20);//(9 nd 20 numbersare removed)
	  System.out.println("getCardDuedate while creating card LINE 229 :"+getCardDuedate+
	  "\n*******************************************************************************************************************");
	  
	  explicitWaitElementBy("elementToBeLocated",KanbanBoardRegressionLocators.clickOnCreateButtonForCard());
	  findElement(KanbanBoardRegressionLocators.clickOnCreateButtonForCard()).click();
	  
	  explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()));
	  findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();
	  
	  try {Thread.sleep(2500);}catch(InterruptedException ie) {}
	  
	  }
	  
	  // this following code is only for kanbanBoardSetting helper
	  
	  try {Thread.sleep(1000);}catch(InterruptedException ie) {} 
	  
	   multipleTabsOpen =new ArrayList<String>(driver.getWindowHandles());
	   driver.switchTo().window(multipleTabsOpen.get(1));
	  
	}
	  public String getVerifyCardCategory() 
	  { 
		  String cardCategory =findElement(KanbanBoardRegressionLocators.verifyCardCategory()).getText();
		  System.out.println("cardCategory :"+cardCategory); 
		  return cardCategory;
	  }
	 
	  
	  
	  
	  public String getVerifyCardTitleAndDescription() 
	  {
		  String cardTitleAndDescp =findElement(KanbanBoardRegressionLocators.verifyCardTitle()).getText();
		  System.out.println("cardTitle :"+cardTitleAndDescp);
		  return cardTitleAndDescp;
	  }
	  
	  
	  public String getVerifyCardDueDate()
	  { 
		  String cardDueDate =findElement(KanbanBoardRegressionLocators.verifyCardDate()).getText();
	      System.out.println("cardDueDate :"+cardDueDate); return cardDueDate;
	  }
	  
	  public String getVerifyCardId() 
	  { 
		  String cardId =findElement(KanbanBoardRegressionLocators.verifyCardId()).getText();
	      System.out.println("cardId :"+cardId); return cardId; 
	      
	   }
	  
	  public String getVerifyCardEfforts() 
	  { 
		  String cardEffort = findElement(KanbanBoardRegressionLocators.verifyCardEffort()).getText();
	      System.out.println("cardEffort :"+cardEffort);
	      return cardEffort;
	  }
	 
	  
	  public String getVerifyverifyCardOwner() 
	  { 
		  String cardOwner=findElement(KanbanBoardRegressionLocators.verifyCardOwner()).getText();
	  System.out.println("cardOwner  :"+cardOwner); 
	  return cardOwner; 
	  }
	  
	 
	
	
	//Update kanban Card
	public void updateKanbanCard()
	{
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		System.out.println("Sizeofallfooter: "+Sizeofallfooter);
		
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(By.xpath("//div[@class='wrapper']/child::div[2]/ul/li")).get(findElements(By.xpath("//div[@class='wrapper']/child::div[2]/ul/li")).size()-1).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardInfo());
		findElement(KanbanBoardRegressionLocators.clickOnCardInfo()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectCategoryFromDropDownValueOperations());
		findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueOperations()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.enterCardId());
		findElement(KanbanBoardRegressionLocators.enterCardId()).clear();
		findElement(KanbanBoardRegressionLocators.enterCardId()).sendKeys("M999");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardTitle()));
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).clear();
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).sendKeys("Update card title from New Card to LATEST CARD");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.descriptionFieldOfCardOnEdit()));
		findElement(KanbanBoardRegressionLocators.descriptionFieldOfCardOnEdit()).clear();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.descriptionFieldOfCardOnEdit()));
		findElement(KanbanBoardRegressionLocators.descriptionFieldOfCardOnEdit()).click();
		findElement(KanbanBoardRegressionLocators.descriptionFieldOfCardOnEdit()).sendKeys("Description is the pattern of narrative development that aims to make vivid a place, object, character, or group. Description is one of four rhetorical modes, along with exposition, argumentation, and narration. In practice it would be difficult to write literature that drew on just one of the four basic modes.");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()));
		findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).clear();
		findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).sendKeys("Fill detail about card and this is updated information");
		
	    //For Scroll down to assign an owner dropdown
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnAssignAnOwnerDropDown())).build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAssignAnOwnerDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnAssignAnOwnerDropDown()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.assignAnOwnerSearchInputFieldUnderDropDown()));
		findElement(KanbanBoardRegressionLocators.assignAnOwnerSearchInputFieldUnderDropDown()).sendKeys("Pratish Laad");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.assignAnOwnerClickOnSearchIcon()));
		findElement(KanbanBoardRegressionLocators.assignAnOwnerClickOnSearchIcon()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectOwnerNameAfterSearch());
		findElement(KanbanBoardRegressionLocators.selectOwnerNameAfterSearch()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.getSelectUserName());
		getUserNameWhileCardUpdate = findElement(KanbanBoardRegressionLocators.getSelectUserName()).getText();
		System.out.println("getUserNameWhileCardUpdate LINE 328 :"+getUserNameWhileCardUpdate);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {};
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPrioirtyDropDown())).click().build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDownMedium()));
		findElement(KanbanBoardRegressionLocators.selectPriorityFromDropDownMedium()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=1; i<=5; i++)
		{
			explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.cardsAllocationBar()));
			findElement(KanbanBoardRegressionLocators.cardsAllocationBar()).click();
		}
		
		 
		//for scroll to Estimation time
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.enterEstimationTime())).build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterEstimationTime()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.enterEstimationTime()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		findElement(KanbanBoardRegressionLocators.enterEstimationTime()).sendKeys("15");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnCardDurationDropDown())).click().build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectDurationOfCardUnderDurationDropdown()));
		findElement(KanbanBoardRegressionLocators.selectDurationOfCardUnderDurationDropdown()).click();
		
		// scroll to Point dropdown
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPointsDropDown())).build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnPointsDropDown()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnPointsDropDown())).click().build().perform();
				
		int sizeOfPointFiboSeries = findElements(KanbanBoardRegressionLocators.sizeOfPointsFiboNumbers()).size();
		System.out.println("Size of Points Fibo series dropdown element size LINE 365 :"+sizeOfPointFiboSeries);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElements(KanbanBoardRegressionLocators.selectValueUnderPointDropDown()).get(sizeOfPointFiboSeries-24).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		getUpdatedCardDuedate = findElement(KanbanBoardRegressionLocators.fetchDueDateOfCardWhileCreating()).getText().substring(9,20);
		System.out.println("getUpdatedCardDuedate while update kanban card :"+getUpdatedCardDuedate);
		
		//On Hold checkbox kanban card
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard())).build().perform();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard());
		findElement(KanbanBoardRegressionLocators.clickOnHoldCheckboxOnKanbanCard()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnSaveButtonForUpdateCard()));
		findElement(KanbanBoardRegressionLocators.clickOnSaveButtonForUpdateCard()).click();
	}
	
	public String getUpdatedCardCategory()
	{
		System.out.println("*******************************************************************************************************************");
		String UpdateCardCategory = findElement(KanbanBoardRegressionLocators.verifyCardCategory()).getText();
		System.out.println("UpdateCardCategory :"+UpdateCardCategory);
		return UpdateCardCategory;
	}
	
	public String getUpdatedCardTitle()
	{
		String updatedCardTitle = findElement(KanbanBoardRegressionLocators.verifyCardTitle()).getText();
		System.out.println("updatedCardTitle :"+updatedCardTitle);
		return updatedCardTitle;
	}
	
	public String getUpdatedCardDueDate()
	{
		String UpdatedCardDueDate = findElement(KanbanBoardRegressionLocators.verifyCardDate()).getText();
		System.out.println("UpdatedCardDueDate :"+UpdatedCardDueDate);
		return UpdatedCardDueDate;
	}
	
	public String getUpdatedCardId()
	{
		String updatedCardId = findElement(KanbanBoardRegressionLocators.verifyCardId()).getText();
		System.out.println("updatedCardId :"+updatedCardId);
		return updatedCardId;
	}
	
	public String getUpdatedCardEffort()
	{
		String updatedCardEffort = findElement(KanbanBoardRegressionLocators.verifyCardEffort()).getText();
		System.out.println("updatedCardEffort :"+updatedCardEffort);
		return updatedCardEffort;
	}
	
	public String getUpdatedCardOwner()
	{
		String updatedCardOwner = findElement(KanbanBoardRegressionLocators.verifyCardOwner()).getAttribute("title");
		System.out.println("updatedCardOwner :"+updatedCardOwner+"\n*******************************************************************************************************************");
		return updatedCardOwner;
	}
	
	//Added Status of Card
	public void clickOn_SideStatusColumn()
	{
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editCard());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.editCard())).click().build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStatusSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnStatusSideColumn()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.statusOnTimeDropDown()));
		findElement(KanbanBoardRegressionLocators.statusOnTimeDropDown()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterStatusOnTimeValueDropDownValue()));
		findElement(KanbanBoardRegressionLocators.enterStatusOnTimeValueDropDownValue()).click();
		
		findElement(KanbanBoardRegressionLocators.statusOnQualityDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterStatusOnQualityValueDropDown()));
		findElement(KanbanBoardRegressionLocators.enterStatusOnQualityValueDropDown()).click();
		
		findElement(KanbanBoardRegressionLocators.statusOnBudgetDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterStatusOnBudgetValueDropDown()));
		findElement(KanbanBoardRegressionLocators.enterStatusOnBudgetValueDropDown()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.percentageCompleteHarveyBall()));
		findElement(KanbanBoardRegressionLocators.percentageCompleteHarveyBall()).click();
		
		findElement(KanbanBoardRegressionLocators.statusDescriptionTextArea()).sendKeys("Card is upto date.");
		
		findElement(KanbanBoardRegressionLocators.statusAddButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.statusRegisterTab()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.statusRegisterDateVerify());
	}
	
	public String verifyDateOfStatusRegister()
	{
		String statusDate = findElement(KanbanBoardRegressionLocators.statusRegisterDateVerify()).getText().substring(0,11);
		System.out.println("kanban card statusDate :" +statusDate+"\n*******************************************************************************************************************");
		return statusDate;
	}
	
	public String verifyStatusRegisterDescription()
	{
		return findElement(KanbanBoardRegressionLocators.statusRegisterDescriptionVerify()).getText();
	}
	
	public String verifyOnTimeColoumn()
	{
		return findElement(KanbanBoardRegressionLocators.statusRegisterOnTime()).getText();
	}
	
	public String verifyOnQualityColoumn()
	{
		return findElement(KanbanBoardRegressionLocators.statusRegisterOnQuality()).getText();
	}
	
	public String verifyOnBudgetColoumn()
	{		
		return findElement(KanbanBoardRegressionLocators.statusRegisterOnBudget()).getText();
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
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectUserAfterSearch());
		findElement(KanbanBoardRegressionLocators.selectUserAfterSearch()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.taskPriority()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.taskPriority()).click();
		findElement(KanbanBoardRegressionLocators.selectTaskPriorityFromDropDown()).click();
		findElement(KanbanBoardRegressionLocators.clickOnTaskAddButton()).click();
		
		//following code added for board setting
		
		
	//	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	//	explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
	//	findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.createdTaskName());
	}
	
	public String verifyTaskName()
	{	
		String getTaskNameBeforeUpdate = findElement(KanbanBoardRegressionLocators.createdTaskName()).getText();
		System.out.println("Task Name before update :"+getTaskNameBeforeUpdate);
		return getTaskNameBeforeUpdate;
	}
	
	public boolean verifyTaskDate()
	{
		boolean getTaskDateBeforeUpdate = findElement(KanbanBoardRegressionLocators.createdTaskDate()).isDisplayed();
		System.out.println("Task Date before update :"+getTaskDateBeforeUpdate);
		return getTaskDateBeforeUpdate;
	}
	
	public String verifyTaskStatus()
	{
		String getTaskStatus = findElement(KanbanBoardRegressionLocators.createdTaskStatus()).getText();
		System.out.println("Task status before update :"+getTaskStatus);
		System.out.println("****************************************************************************************");
		return getTaskStatus;
	}
	
	
	public void editTask()
	{
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnTaskSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnTaskSideColumn()).click();
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		int taskEditIconSize = findElements(KanbanBoardRegressionLocators.clickOnEditTaskIcon()).size();//1
		System.out.println("taskEditIconSize LINE 558 :"+taskEditIconSize);
		
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnEditTaskIcon())).build().perform();
		findElements(KanbanBoardRegressionLocators.clickOnEditTaskIcon()).get(taskEditIconSize-1).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskSubjectName()));
		findElement(KanbanBoardRegressionLocators.editTaskSubjectName()).clear();
		findElement(KanbanBoardRegressionLocators.editTaskSubjectName()).sendKeys("This is updated task name : Task2");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskDescription()));
		findElement(KanbanBoardRegressionLocators.editTaskDescription()).clear();
		findElement(KanbanBoardRegressionLocators.editTaskDescription()).sendKeys("Updated Task description");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskAssignToDropdown()));
		findElement(KanbanBoardRegressionLocators.editTaskAssignToDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskAssignAnOwnerInputFieldForSearchName()));
		findElement(KanbanBoardRegressionLocators.editTaskAssignAnOwnerInputFieldForSearchName()).sendKeys("Pratish Laad");
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnSearchMagnifierIcon()));
		findElement(KanbanBoardRegressionLocators.clickOnSearchMagnifierIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardRegressionLocators.selectOwnerNameAfterSearchUnderEditTask());
	
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectOwnerNameAfterSearchUnderEditTask()));
		findElement(KanbanBoardRegressionLocators.selectOwnerNameAfterSearchUnderEditTask()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskPriorityDropdown()));
		findElement(KanbanBoardRegressionLocators.editTaskPriorityDropdown()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectPriorityForTask()));
		findElement(KanbanBoardRegressionLocators.selectPriorityForTask()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		/*
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editTaskDueDateCalender()));
		findElement(KanbanBoardRegressionLocators.editTaskDueDateCalender()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectHighlightedDateUpdateTask());
		String getSelectedDateOfToday = findElement(KanbanBoardRegressionLocators.selectHighlightedDateUpdateTask()).getText();//this print the highlighted day of today
		System.out.println("Select today date from Update task windows LINE 596 :"+getSelectedDateOfToday);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		int getDayPanelList = findElements(KanbanBoardRegressionLocators.dayPanelListUpdateTaskCalender()).size();// thisprint the all the days present on panel
		System.out.println("List of All days on update task windows LINE 601 :"+getDayPanelList+"\n********************************************************************************************");
		
		for(int i=1; i<=getDayPanelList; i++)                                      //div[contains(@class,'datepicker-top-left')]//div[@class='datepicker-panel']/ul[3]/li  dayPanelListUpdateTaskCalender's xpath
		{
			String getDataViewAttributeValue = findElement(By.xpath("//div[contains(@class,'datepicker-top-left')]//div[@class='datepicker-panel']/ul[3]/li")).getAttribute("data-view");//this print the all dataview attribute values
			
			//System.out.println(getDataViewAttributeValue);
			
			String getTextOfAllLiElements = findElement(By.xpath("//div[contains(@class,'datepicker-top-left')]//div[@class='datepicker-panel']/ul[3]/li["+i+"]")).getText();//this print the all TExt values
			
			//System.out.println(getTextOfAllLiElements);
			
			if((getSelectedDateOfToday.equals(getTextOfAllLiElements)) && (getDataViewAttributeValue.equals("day picked")))
			{
				String getClassViewAttributeValue = findElement(By.xpath("//div[contains(@class,'datepicker-top-left')]//div[@class='datepicker-panel']/ul[3]/li["+(i-2)+"]")).getAttribute("class");//from highlighted day previous 2 days classAttributesvalue
				//System.out.println( "This is getclassviewAttributevalue :"+getClassViewAttributeValue); this print the all class Attributes values
				
				if(getClassViewAttributeValue.contains("disabled"))
				{
					try {Thread.sleep(1500);}catch(InterruptedException ie) {}
					findElement(By.xpath("//div[contains(@class,'datepicker-top-left')]//div[@class='datepicker-panel']/ul[3]/li["+(i-4)+"]")).click();//if class value disabled then pick value previous 4 days 
					break;
				}
				else
				{
					try {Thread.sleep(1500);}catch(InterruptedException ie) {}
					findElement(By.xpath("//div[contains(@class,'datepicker-top-left')]//div[@class='datepicker-panel']/ul[3]/li["+(i-2)+"]")).click();//else pick previous 2 days 
					break;
				}
			}
		}*/
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editTaskClickOnStatusDropdown()));
		findElement(KanbanBoardRegressionLocators.editTaskClickOnStatusDropdown()).click();
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectTaskStatusUnderStatusDropDown()));
		findElement(KanbanBoardRegressionLocators.selectTaskStatusUnderStatusDropDown()).click();
				
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editTaskClickOnUpdateButton()));
		findElement(KanbanBoardRegressionLocators.editTaskClickOnUpdateButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public String verifyEditTaskSubject()
	{		 
		String getTaskNameAfterUpdate = findElement(KanbanBoardRegressionLocators.createdTaskName()).getText();
		System.out.println("Task Name After update LINE 643 :"+getTaskNameAfterUpdate);
		return getTaskNameAfterUpdate;
	}
	
	
	public boolean verifyEditTaskDate()
	{
		boolean getTaskDateAfterUpdate = findElement(KanbanBoardRegressionLocators.createdTaskDate()).isDisplayed();
		System.out.println("Task Date After update LINE 651 :"+getTaskDateAfterUpdate);
		return getTaskDateAfterUpdate;
	}
	
	
	public String verifyEditTaskStatus()
	{
		String getTaskStatusAfterUpdate = findElement(KanbanBoardRegressionLocators.createdTaskStatus()).getText();
		System.out.println("Task Status After update LINE 659 :"+getTaskStatusAfterUpdate+"\n****************************************************************************************");
		return getTaskStatusAfterUpdate;
	}
	
	//Added logtime on Kanban card
	public void clickOn_LogTimeSideColumn()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editCard());
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn());
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnDateForLogTime()));
		findElement(KanbanBoardRegressionLocators.clickOnDateForLogTime()).click();
		findElement(KanbanBoardRegressionLocators.clickOnCalenderTodayButton()).click();		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignToTaskDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignToTaskDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectTaskNameFromList()));
		findElement(KanbanBoardRegressionLocators.selectTaskNameFromList()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.loggedTimeInputField()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.loggedTimeInputField())).click().build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElement(KanbanBoardRegressionLocators.loggedTimeInputField()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		findElement(KanbanBoardRegressionLocators.loggedTimeInputField()).sendKeys("2");
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnDurationDropDown());
		findElement(KanbanBoardRegressionLocators.clickOnDurationDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectValueDayFromDurationDropDown());
		findElement(KanbanBoardRegressionLocators.selectValueDayFromDurationDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAUserDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAUserDropDown()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLogTimeAssignAnOwnerSearchField());
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAnOwnerSearchField()).click();
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAssignAnOwnerSearchField()).sendKeys("Pratish Laad");
		findElement(KanbanBoardRegressionLocators.assignAnOwnerForTaskSearchIcon()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.selectUserFromList()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.enterDescriptionOnLogTimeField()));
		findElement(KanbanBoardRegressionLocators.enterDescriptionOnLogTimeField()).click();		
		findElement(KanbanBoardRegressionLocators.enterDescriptionOnLogTimeField()).sendKeys("In Kanbanize, you can log time on your cards to track the pure time you have spent on a given task. You can log time on the card for the entire task or at a subtask level.");
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLogTimeAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeAddButton()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.logTimeDate());
	}
	
	public String verifyLogTimeDate()
	{
		
		String getLogtimeDate = findElement(KanbanBoardRegressionLocators.logTimeDate()).getText();
		System.out.println("getLogtimeDate :"+getLogtimeDate);
		return getLogtimeDate;
	}
	
	public String verifyLogTimeTaskName()
	{
		String getLogTimeTaskName =  findElement(KanbanBoardRegressionLocators.logTimeTaskName()).getText();
		System.out.println("getLogtimeTaskName :"+getLogTimeTaskName);
		return getLogTimeTaskName;
	}
	
	public String verifyLogTimeHoursColumn()
	{
		String getLogTimeHours = findElement(KanbanBoardRegressionLocators.logTimeHours()).getText();
		System.out.println("getLogTimeHours :"+getLogTimeHours);
		return getLogTimeHours;
	}
	
	public boolean verifyLogTimeDescription()
	{		
		boolean getLogTimeDescription = findElement(KanbanBoardRegressionLocators.logTimeDescription()).isDisplayed();
		System.out.println("getLogTimeDescription :"+getLogTimeDescription+"\n******************************************************************************************************************");
		return getLogTimeDescription;
	}
	
	public void editLogtime()
	{
		//****************************************Edit Logtime for kanban Card******************************************				
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn());
		findElement(KanbanBoardRegressionLocators.clickOnLogTimeSideColoumn()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editLogTimeEditIcon());
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.editLogTimeEditIcon())).build().perform();
		findElement(KanbanBoardRegressionLocators.editLogTimeEditIcon()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnEditDateForLogTime()));
		findElement(KanbanBoardRegressionLocators.clickOnEditDateForLogTime()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeSelectDateFromDatePicker()));
		findElement(KanbanBoardRegressionLocators.editLogTimeSelectDateFromDatePicker()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeLoggedTime()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.editLogTimeLoggedTime())).click().build().perform();
		findElement(KanbanBoardRegressionLocators.editLogTimeLoggedTime()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		findElement(KanbanBoardRegressionLocators.editLogTimeLoggedTime()).sendKeys("1");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		int sizeOfEditLogTimeDurationDropDown = findElements(KanbanBoardRegressionLocators.clickOnEditLogtimeDurationDropDown()).size();//4-1=3 sme xpt fr 4 drown
		System.out.println("sizeOfEditLogTimeDurationDropDown LINE 767 :"+sizeOfEditLogTimeDurationDropDown);
		
		
		findElements(KanbanBoardRegressionLocators.clickOnEditLogtimeDurationDropDown()).get(sizeOfEditLogTimeDurationDropDown-2).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectValueFromDurationDropdownupdate()));
		findElement(KanbanBoardRegressionLocators.selectValueFromDurationDropdownupdate()).click();		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerDropdown()));
		findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerDropdown()).click();
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchInputField()));
		findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchInputField()).sendKeys("Pratish Laad");
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchIcon()));
		findElement(KanbanBoardRegressionLocators.editLogTimeAssignAnOwnerSearchIcon()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectOwnerNameAferClickOnSearchIcon());
		findElement(KanbanBoardRegressionLocators.selectOwnerNameAferClickOnSearchIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editLogTimeDescriptionField()));
		findElement(KanbanBoardRegressionLocators.editLogTimeDescriptionField()).clear();
		findElement(KanbanBoardRegressionLocators.editLogTimeDescriptionField()).sendKeys("Update log time detail");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editLogTimeclickOnUpdateButton()));
		findElement(KanbanBoardRegressionLocators.editLogTimeclickOnUpdateButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}	
	
	public boolean verifyLogTimeDateAfterEdit()
	{
		boolean getLogtimeAfterEditDate = findElement(KanbanBoardRegressionLocators.logTimeDate()).isDisplayed();
		System.out.println("getLogtimeAfterEditDate LINE 798 :"+getLogtimeAfterEditDate);
		return getLogtimeAfterEditDate;
	}
	
	public String verifyLogTimeTaskNameAfterEdit()
	{
		String getLogTimeTaskNameAfterEdit =  findElement(KanbanBoardRegressionLocators.logTimeTaskName()).getText();
		System.out.println("getLogTimeTaskNameAfterEdit LINE 805 :"+getLogTimeTaskNameAfterEdit);
		return getLogTimeTaskNameAfterEdit;
	}
	
	public String verifyLogTimeHoursColumnAfterEdit()
	{
		String getLogTimeHoursAfterEdit = findElement(KanbanBoardRegressionLocators.logTimeHours()).getText();
		System.out.println("getLogTimeHoursAfterEdit LINE 812 :"+getLogTimeHoursAfterEdit);
		return getLogTimeHoursAfterEdit;
	}
	
	public String verifyLogTimeDescriptionAfterEdit()
	{		
		String getLogTimeDescriptionAfterEdit = findElement(KanbanBoardRegressionLocators.logTimeDescription()).getText();
		System.out.println("getLogTimeDescriptionAfterEdit LINE 819 :"+getLogTimeDescriptionAfterEdit+"\n******************************************************************************************************************");
		return getLogTimeDescriptionAfterEdit;
	}
	
	
	//Applied Risk on kanban Card
	public void clickOn_RiskSideColumn()
	{
		//**********************************************************************************************************
		
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editCard());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.editCard())).click().build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRiskSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnRiskSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskAfterSave());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnRiskAssignToTaskDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnRiskAssignToTaskDropDown()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectTaskNameUnderRiskColumn());
		findElement(KanbanBoardRegressionLocators.selectTaskNameUnderRiskColumn()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnRadioButtonForRiskType()));
		findElement(KanbanBoardRegressionLocators.clickOnRadioButtonForRiskType()).click();
		riskTypeRadioButtonValue = findElement(KanbanBoardRegressionLocators.clickOnRadioButtonForRiskType()).getText();
		System.out.println("Radio button of Risk Type line 846 :"+riskTypeRadioButtonValue);
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.detailRiskInputField()));
		findElement(KanbanBoardRegressionLocators.detailRiskInputField()).sendKeys("Relationship between conditions, events, or tasks such that one cannot begin or be-completed until one or more other conditions, events, or tasks have occurred, begun, or completed");
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.riskMitigationRiskInputField())).build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.riskMitigationRiskInputField()));
		findElement(KanbanBoardRegressionLocators.riskMitigationRiskInputField()).sendKeys("Risk mitigation is defined as taking steps to reduce adverse effects. There are four types of risk mitigation strategies that hold unique to Business Continuity and Disaster Recovery. It's important to develop a strategy that closely relates to and matches your company's profile");
		
		//Applied Scroller to Weight:How Important dropdown
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnWeightHowImportantDropDown()));
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnWeightHowImportantDropDown()));		
		findElement(KanbanBoardRegressionLocators.clickOnWeightHowImportantDropDown()).click();
		findElement(KanbanBoardRegressionLocators.selectValueFromWeightHowImportantDropDown()).click();				
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnProbabilityHowLikely()));
		findElement(KanbanBoardRegressionLocators.clickOnProbabilityHowLikely()).click();
		findElement(KanbanBoardRegressionLocators.selectValueFromProbabilityHowLikely()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAtRiskCheckbox());		
		findElement(KanbanBoardRegressionLocators.clickOnAtRiskCheckbox()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnRiskAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnRiskAddButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRiskRegisterTab());
		findElement(KanbanBoardRegressionLocators.clickOnRiskRegisterTab()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	}
	
	public String verifyRiskDate()
	{
		String getRiskDate =  findElement(KanbanBoardRegressionLocators.riskDate()).getText();
		System.out.println("getRiskDate LINE 881 :"+getRiskDate);
		return getRiskDate;
	}
	
	public String verifyTaskNameOnRisk()
	{
		String getTaskName = findElement(KanbanBoardRegressionLocators.riskTaskName()).getText();
		System.out.println("getTaskName LINE 888 :"+getTaskName);
		return getTaskName;
	}
	
	public String verifyRiskScore()
	{
		String getRiskScore =  findElement(KanbanBoardRegressionLocators.riskScore()).getText();
		System.out.println("getRiskScore LINE 895 :"+getRiskScore);
		return getRiskScore;
	}
	
	public String verifyRiskType()
	{
		String riskType = findElement(KanbanBoardRegressionLocators.riskType()).getText();
		System.out.println("riskType LINE 902 :"+riskType);
		return riskType;
	}
	
	public String verifyRiskDetail()
	{	
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		String riskDetail = findElement(KanbanBoardRegressionLocators.riskDetail()).getText();
		System.out.print("riskDetail LINE 910 :"+riskDetail+"\n************************************************************************************\n");
		return riskDetail;
	}
	
	
	public void editRisk()
	{
		//*************************************************Edit Risk for kanban card*************************************************************
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRiskSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnRiskSideColumn()).click();
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRiskRegisterTab());
		findElement(KanbanBoardRegressionLocators.clickOnRiskRegisterTab()).click();		
		
		//click on edit icon for risk
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskClickOnRiskEditIcon()));
		findElement(KanbanBoardRegressionLocators.editRiskClickOnRiskEditIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskDate()));
		findElement(KanbanBoardRegressionLocators.editRiskDate()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskDatePickerFromCalender()));
		findElement(KanbanBoardRegressionLocators.editRiskDatePickerFromCalender()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskSelectBusinessDependencyRadioButton()));
		findElement(KanbanBoardRegressionLocators.editRiskSelectBusinessDependencyRadioButton()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskDetailTextArea()));
		findElement(KanbanBoardRegressionLocators.editRiskDetailTextArea()).clear();
		findElement(KanbanBoardRegressionLocators.editRiskDetailTextArea()).sendKeys("Detail of Risk is updated : Now it is changed from Issue to Business Dependency");
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.editRiskRiskMitigationTextArea());
		findElement(KanbanBoardRegressionLocators.editRiskRiskMitigationTextArea()).clear();
		findElement(KanbanBoardRegressionLocators.editRiskRiskMitigationTextArea()).sendKeys("Business Dependency");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editClickOnResolvedCheckbox());
		findElement(KanbanBoardRegressionLocators.editClickOnResolvedCheckbox()).click();
		
		/*int weightAndProbabilityDropDownSize = findElements(KanbanBoardRegressionLocators.editRiskWeightAndProbabilityCommonDropdown()).size();
		System.out.println("weightAndProbabilityDropDownSize:"+weightAndProbabilityDropDownSize);
		
		findElements(KanbanBoardRegressionLocators.editRiskWeightAndProbabilityCommonDropdown()).get(weightAndProbabilityDropDownSize-2).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskSelectValueFromWeightHowImportantDropdown()));
		findElement(KanbanBoardRegressionLocators.editRiskSelectValueFromWeightHowImportantDropdown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElements(KanbanBoardRegressionLocators.editRiskWeightAndProbabilityCommonDropdown()).get(weightAndProbabilityDropDownSize-1).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editRiskSelectValueFromProbabiltyHowLikely()));
		findElement(KanbanBoardRegressionLocators.editRiskSelectValueFromProbabiltyHowLikely()).click();*/
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.editRiskClickOnUpdateButton()));
		findElement(KanbanBoardRegressionLocators.editRiskClickOnUpdateButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public String verifyRiskResolvedCheckAfterEdit()
	{
		String getRiskResolvedCheckAfterUpdate = findElement(KanbanBoardRegressionLocators.editRiskResolvedCheck()).getAttribute("class").substring(18);
		System.out.println("getRiskResolvedCheckAfterUpdate LINE 986 :"+getRiskResolvedCheckAfterUpdate);
		return getRiskResolvedCheckAfterUpdate;
	}
	
	public boolean verifyRiskDateAfterEdit()
	{
		boolean getVerifyRiskDateAfterUpdate = findElement(KanbanBoardRegressionLocators.riskDate()).isDisplayed();
		System.out.println("getVerifyRiskDateAfterUpdate LINE 993 :"+getVerifyRiskDateAfterUpdate);
		return getVerifyRiskDateAfterUpdate;
	}
	
	
	public String verifyTaskNameOnRiskAfterEdit()
	{
		String riskTaskNameAfterEdit = findElement(KanbanBoardRegressionLocators.riskTaskName()).getText();
		System.out.println("riskTaskNameAfterEdit LINE 1001 :"+riskTaskNameAfterEdit);
		return riskTaskNameAfterEdit;
	}
	
	
	public String verifyRiskScoreAfterEdit()
	{
		String getRiskScoreAfterEdit =  findElement(KanbanBoardRegressionLocators.riskScore()).getText();
		System.out.println("getRiskScore LINE 1009 :"+getRiskScoreAfterEdit);
		return getRiskScoreAfterEdit;
	}
	
	public String verifyRiskTypeAfterEdit()
	{
		String getRiskTypeAfterEdit = findElement(KanbanBoardRegressionLocators.getVerifyRiskTypeAfterEdit()).getText();
		System.out.println("getRiskTypeAfterEdit LINE 1016 :"+getRiskTypeAfterEdit);
		return getRiskTypeAfterEdit;
	}
	
	
	public String verifyRiskDetailAfterEdit()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		String getRiskDetailAfterEdit = findElement(KanbanBoardRegressionLocators.updateRiskDetail()).getText();
		System.out.println("getRiskDetailAfterEdit LINE 1025 :"+getRiskDetailAfterEdit+"\n***************************************************************************************************");
		return getRiskDetailAfterEdit;
	}
	
	
	//***********************************************************Quick Action Change location in 1.275, Placed After Risk***********************************************************
	public void clickOn_QuickActionOnKanbanCard()
	{
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editCard());
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//**************************Check Condition for Quick Action button is active or inactive on Kanban Card side Column**************************
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.quickActionCheckCondition());		
		classAttributeValueOfQuickActionSideColumn = findElement(KanbanBoardRegressionLocators.quickActionCheckCondition()).getAttribute("class");
		System.out.println("Class attribute value of quick action side column LINE 1043 :"+classAttributeValueOfQuickActionSideColumn);
		
		
		//Class attribute is aParent means Quick Action icon is visible and click on it
		if(classAttributeValueOfQuickActionSideColumn.equals("aParent "))		
		{
			System.out.println("Quick Action button is active and perform change date operation.");
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardModeSideColumn());
			findElement(KanbanBoardRegressionLocators.clickOnCardModeSideColumn()).click();
			
			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskAfterSave());
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			int schedulingModeAndEffortUnitDropDownSize = findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).size();
			System.out.println("Scheduling Mode and Effort Unit dropdown list size LINE 1058 :"+schedulingModeAndEffortUnitDropDownSize);
			
			findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).get(schedulingModeAndEffortUnitDropDownSize-2).click();
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectValueFromSchedulingModeDropDown());
			findElement(KanbanBoardRegressionLocators.selectValueFromSchedulingModeDropDown()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()));
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editCard());
			findElement(KanbanBoardRegressionLocators.editCard()).click();
			
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			
			actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn())).build().perform();
			actions.dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn()), findElement(KanbanBoardRegressionLocators.kanbanBoardRandomZonePath())).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}*/
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnQuickAction());
			findElement(KanbanBoardRegressionLocators.clickOnQuickAction()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnChangeDateQuickAction());
			findElement(KanbanBoardRegressionLocators.clickOnChangeDateQuickAction()).click();
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.isChangeDateWindowVisible());
			
			boolean isChangeDateQuickActionWindowVisible = findElement(KanbanBoardRegressionLocators.isChangeDateWindowVisible()).isDisplayed();
			System.out.println("After click on change date quick action popup window open LINE 1088 :"+isChangeDateQuickActionWindowVisible);
			
			if(isChangeDateQuickActionWindowVisible == true)
			{
				driver.switchTo().frame(findElement(KanbanBoardRegressionLocators.switchToiFrame()));
				
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
	
	public String getVerifyCardDurationAfterQuickAction()
	{
		String getDateFromCardAfterChangeDateFromQuickAction = null;
		
		if(classAttributeValueOfQuickActionSideColumn.equals("aParent disablemenucls"))
		{
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.verifyDateQuickActionChange());
			getDateFromCardAfterChangeDateFromQuickAction = findElement(KanbanBoardRegressionLocators.verifyDateQuickActionChange()).getText();
			System.out.println("getDateFromKanbanCardWhenQuickAction Button is disable LINE 1178 :"+getDateFromCardAfterChangeDateFromQuickAction+
			"\nQuick Action option is disable and performed random click on kanban board to close edit left panel of kanban card and there is no verification is performing.");
		}
		else
		{
			try {Thread.sleep(6000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.verifyDateQuickActionChange());
			getDateFromCardAfterChangeDateFromQuickAction = findElement(KanbanBoardRegressionLocators.verifyDateQuickActionChange()).getText();
			System.out.println("getDateFromCardAfterChangeDateFromQuickAction LINE 1186 :"+getDateFromCardAfterChangeDateFromQuickAction+"\n******************************************************************************************************************");
		}
		return getDateFromCardAfterChangeDateFromQuickAction;
	}
	
	
	
	//Applied Linking to Kanban Card on different board of kb
	public void clickOn_LinkSideColumn()
	{
		try {Thread.sleep(2500);}catch(InterruptedException ie) {}
		driver.switchTo().window(handleValueOfKanbanBoardiFrameWindow);
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		driver.switchTo().frame(0);
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()));
		findElement(KanbanBoardRegressionLocators.clickOn_NavIconScroller()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnGoBackProjectNav()));
		findElement(KanbanBoardRegressionLocators.clickOnGoBackProjectNav()).click();
		
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnThreeDots()));
		findElement(KanbanBoardRegressionLocators.clickOnThreeDots()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAddProject()));
		findElement(KanbanBoardRegressionLocators.clickOnAddProject()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterProjectName()));
		findElement(KanbanBoardRegressionLocators.enterProjectName()).sendKeys("Regression Project for link kanban card");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnProjectAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnProjectAddButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCreatedProjectForLinking());
		findElement(KanbanBoardRegressionLocators.clickOnCreatedProjectForLinking()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnProjectBoardThreeDots());
		findElement(KanbanBoardRegressionLocators.clickOnProjectBoardThreeDots()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCreateKanbanBoardButton());
		findElement(KanbanBoardRegressionLocators.clickOnCreateKanbanBoardButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.enterKanbanBoardNameInputArea());
		findElement(KanbanBoardRegressionLocators.enterKanbanBoardNameInputArea()).sendKeys("Regression Kanban Board for link one card to it");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAddKanbanBoardButton());
		findElement(KanbanBoardRegressionLocators.clickOnAddKanbanBoardButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnRegressionKanbanBoard());
		findElement(KanbanBoardRegressionLocators.clickOnRegressionKanbanBoard()).click();
		try {Thread.sleep(3500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToiFrame());
		driver.switchTo().frame(findElement(KanbanBoardRegressionLocators.switchToiFrame()));
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}		
		System.out.println("Link method and inspect iFrame with specific name LINE 1247");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon());
		findElement(KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon()).click();
		
		
		for(String getWindowsHandleValueOfThreeOpenTabs : driver.getWindowHandles())
		{			
			driver.switchTo().window(getWindowsHandleValueOfThreeOpenTabs);
		}
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAddToBoardFan());
		findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAddCardToBoardUnderFanButton()));
		addCardToBoardSource = findElement(KanbanBoardRegressionLocators.clickOnAddCardToBoardUnderFanButton());
		
		backlogMasterZoneDestination = findElement(KanbanBoardRegressionLocators.backlogMasterContainer());
		actions.dragAndDrop(addCardToBoardSource, backlogMasterZoneDestination).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()).click();
		
		
	
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectCategoryFromDropDownValueFinance());
		findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueFinance()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardId()));
		findElement(KanbanBoardRegressionLocators.enterCardId()).sendKeys("finance002");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardTitle()));
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).sendKeys("Card For Link:One Card is link to this card");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardDescription()));
		findElement(KanbanBoardRegressionLocators.enterCardDescription()).sendKeys("Regression Project - Regression Kanban Board >>> Operation category card link to this card.");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()));
		findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).sendKeys("That card should link to this card");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnCreateButtonForCard()));
		findElement(KanbanBoardRegressionLocators.clickOnCreateButtonForCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()));
		findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		multipleTabsOpen = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(multipleTabsOpen.get(1));
		
		//**********************************************Linking of kanban card start here**********************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLinkSideColumn());
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnLinkSideColumn())).build().perform();
		findElement(KanbanBoardRegressionLocators.clickOnLinkSideColumn()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLinkToProject()));//empty field
		findElement(KanbanBoardRegressionLocators.clickOnLinkToProject()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnFolderWhichWillSelect());
		findElement(KanbanBoardRegressionLocators.clickOnFolderWhichWillSelect()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectProjectName());
		findElement(KanbanBoardRegressionLocators.selectProjectName()).click();
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLinkToProject());
		linkColumnLinkToProjectName = findElement(KanbanBoardRegressionLocators.clickOnLinkToProject()).getText();
		System.out.println("Link To Project line 1319 :"+linkColumnLinkToProjectName);
		
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnLinkToProjectBoard()));
		findElement(KanbanBoardRegressionLocators.clickOnLinkToProjectBoard()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectKanbanBoard());
		findElement(KanbanBoardRegressionLocators.selectKanbanBoard()).click();
		linkColumnLinkToProjectBoardKanbanBoardName = findElement(KanbanBoardRegressionLocators.clickOnLinkToProjectBoard()).getText();
		System.out.println("Link To Project Board line 1329 :"+linkColumnLinkToProjectBoardKanbanBoardName);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnLinkToCard()));
		findElement(KanbanBoardRegressionLocators.clickOnLinkToCard()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectKanbanCardFromList()));
		findElement(KanbanBoardRegressionLocators.selectKanbanCardFromList()).click();
		linkColumnLinkToCardKanbanCardName = findElement(KanbanBoardRegressionLocators.clickOnLinkToCard()).getText();
		System.out.println("Link To Card line 1340 :"+linkColumnLinkToCardKanbanCardName);
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCopyURLButton());
		findElement(KanbanBoardRegressionLocators.clickOnCopyURLButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		findElement(KanbanBoardRegressionLocators.inputUrlField()).clear();
		findElement(KanbanBoardRegressionLocators.inputUrlField()).sendKeys(Keys.chord(Keys.LEFT_CONTROL,"v"));
		scrollinToView(findElement(KanbanBoardRegressionLocators.clickOnLinkToProject()));
	}
	
	
	public String verifyProjectName()
	{
		return findElement(KanbanBoardRegressionLocators.clickOnLinkToProject()).getText();
	}
	
	public String verifyKanbanBoardName()
	{			
		return findElement(KanbanBoardRegressionLocators.clickOnLinkToProjectBoard()).getText();
	}
	
	public String verifyKanbanCardName()
	{
		return findElement(KanbanBoardRegressionLocators.clickOnLinkToCard()).getText();
	}
	
	public boolean verifyLinkURL()
	{
		return findElement(KanbanBoardRegressionLocators.inputUrlField()).isDisplayed();
	}
	
	public boolean verifyLinkSignOnKanbanCard()
	{
		boolean linkSign = findElement(KanbanBoardRegressionLocators.verifyLinkSignOnKanbanCardAfterLinking()).isDisplayed();
		System.out.println("linkSign LINE 1377 :"+linkSign+"\n******************************************************************************************************************");
		return linkSign;
	}
	
	
	//Applied Subscriber to kanban Card
	public void clickOn_SubscriberSideColumn()
	{
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardInfo());
	
		findElement(KanbanBoardRegressionLocators.clickOnCardInfo()).click();
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnSubscribersSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnSubscribersSideColumn()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnSelectSubscriberDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnSelectSubscriberDropDown()).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectSubscriberSearchInputField()));
		findElement(KanbanBoardRegressionLocators.selectSubscriberSearchInputField()).click();
		findElement(KanbanBoardRegressionLocators.selectSubscriberSearchInputField()).sendKeys("Pratish Laad");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnSelectSubscriberSearchIcon()));
		boolean selectSubscriberSearchIconVisibilty = findElement(KanbanBoardRegressionLocators.clickOnSelectSubscriberSearchIcon()).isDisplayed();
		System.out.println("selectSubscriberSearchIconVisibilty : "+selectSubscriberSearchIconVisibilty);
		findElement(KanbanBoardRegressionLocators.clickOnSelectSubscriberSearchIcon()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectSubscriberUserFromListAfterSearch());
		findElement(KanbanBoardRegressionLocators.selectSubscriberUserFromListAfterSearch()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnSubscriberAddButton()));
		findElement(KanbanBoardRegressionLocators.clickOnSubscriberAddButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public String verifySubscriberMovedCheckBox()
	{
		String movedCheckBoxGetClassAttributeValue = null;
		boolean result = false;
		int attempts = 0;
		
		while(attempts <= 2)
		{
			try
			{
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.movedCheckBox());
				actions.moveToElement(findElement(KanbanBoardRegressionLocators.movedCheckBox())).build().perform();
				findElement(KanbanBoardRegressionLocators.movedCheckBox()).isDisplayed();
				
				movedCheckBoxGetClassAttributeValue = findElement(KanbanBoardRegressionLocators.movedCheckBox()).getAttribute("class").substring(15);//(suruvatiche 15 letter sodun class attribute value gheil)
				result = true;
				System.out.println("Value of attempts "+attempts +" movedCheckBoxGetClassAttributeValue "+movedCheckBoxGetClassAttributeValue +" and result "+result);
				break;
			} 
			catch(StaleElementReferenceException staleEleRef)
			{
				attempts++;
				staleEleRef.printStackTrace();
			}
		}
		return movedCheckBoxGetClassAttributeValue;
	}
	
	public String verifySubscriberDoneCheckBox()
	{
		String doneCheckboxGetClassAttribute = findElement(KanbanBoardRegressionLocators.doneCheckbox()).getAttribute("class").substring(15);
		System.out.println("doneCheckboxGetClassAttribute LINE 1443 :"+doneCheckboxGetClassAttribute);
		return doneCheckboxGetClassAttribute;
	}
	
	public String verifySubscriberCardPastDueCheckBox()
	{
		String cardPastDueCheckboxGetClassAttribute = findElement(KanbanBoardRegressionLocators.cardPastDueCheckBox()).getAttribute("class").substring(15);
		System.out.println("cardPastDueCheckboxGetClassAttribute LINE 1450 :"+cardPastDueCheckboxGetClassAttribute);
		return cardPastDueCheckboxGetClassAttribute;
	}
	
	public String verifySubscriberTaskPastDueCheckBox()
	{
		String taskPastDueCheckboxClassAttribute =  findElement(KanbanBoardRegressionLocators.taskPastDueCheckBox()).getAttribute("class").substring(15);
		System.out.println("taskPastDueCheckboxClassAttribute LINE 1457 :"+taskPastDueCheckboxClassAttribute);
		return taskPastDueCheckboxClassAttribute;
		
	}
	
	public String verifySubscriberTaskCompletedCheckBox()
	{
		String taskCompletedCheckBoxGetClassAttribute = findElement(KanbanBoardRegressionLocators.taskCompletedCheckBox()).getAttribute("class").substring(15);
		System.out.println("taskCompletedCheckBoxGetClassAttribute LINE 1465 :"+taskCompletedCheckBoxGetClassAttribute+"\n******************************************************************************************************************");
		return taskCompletedCheckBoxGetClassAttribute;
	}
	
	
	//Applies Custom Fields on Kanban Card
	public void click_OnCustomFieldsSideColumn()
	{
		//******************************Custom Fields script start from here******************************************
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnKanbanBoardHomeIcon());
		findElement(KanbanBoardRegressionLocators.clickOnKanbanBoardHomeIcon()).click();
		
		for(String windowHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(windowHandle);
		}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnPlusIconOnLeankorPage());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.clickOnPlusIconOnLeankorPage()).click();
			
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		try {Thread.sleep(1500);} catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnKanbanCardObjectName());
		findElement(KanbanBoardRegressionLocators.clickOnKanbanCardObjectName()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.tryLexDailogWindowAfterClickingOnKanbanCardObject());
		boolean tryLexWindow = findElement(KanbanBoardRegressionLocators.tryLexDailogWindowAfterClickingOnKanbanCardObject()).isDisplayed();
		System.out.println("Lex window value for kanban card custom object LINE 1498 :"+tryLexWindow);
		
		try {Thread.sleep(1500);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.tryLexDailogWindowClickOnCross());
		findElement(KanbanBoardRegressionLocators.tryLexDailogWindowClickOnCross()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnKanbanCardRecordPageSideHandle());
		findElement(KanbanBoardRegressionLocators.clickOnKanbanCardRecordPageSideHandle()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnViewFieldOptionUnderHandle());
		findElement(KanbanBoardRegressionLocators.clickOnViewFieldOptionUnderHandle()).click();
		
		for(String windowHandle : driver.getWindowHandles())
		{
							driver.switchTo().window(windowHandle);
		}
																																						
		//***************************************Click On New button Under CustomField And Relationships column***************************************
				
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnNewButtonForCustomFieldAndRelationships()));
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.clickOnNewButtonForCustomFieldAndRelationships()).click();
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//step 1
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectCurrencyRadioButtonFromCustomFieldPage()));
		findElement(KanbanBoardRegressionLocators.selectCurrencyRadioButtonFromCustomFieldPage()).click();
		
		actions.sendKeys(Keys.PAGE_UP).build().perform();
				
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		int sizeOfNextButton = findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).size();
		findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).get(sizeOfNextButton-2).click();
		
		//step 2
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.fieldLabelNameForCurrencyRadioButton()));
		findElement(KanbanBoardRegressionLocators.fieldLabelNameForCurrencyRadioButton()).sendKeys("deepCurrencyCustomField");
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).get(sizeOfNextButton-2).click();
		
		//step 3
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnVisibileCheckBoxOnFieldLevelSecurityPage()));
		findElement(KanbanBoardRegressionLocators.clickOnVisibileCheckBoxOnFieldLevelSecurityPage()).click();
		
		findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).get(sizeOfNextButton-2).click();
		
		//step 4
		int sizeOfsaveButtonForCreatingCustomField = findElements(KanbanBoardRegressionLocators.clickOnSaveButtonToAddCustomField()).size();
		findElements(KanbanBoardRegressionLocators.clickOnSaveButtonToAddCustomField()).get(sizeOfsaveButtonForCreatingCustomField-2).click();
		
		// Now Kanban Card object page is visible and scroll page for visibility of New button for CustomField And Relationships column 
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnNewButtonForCustomFieldAndRelationships()));
		findElement(KanbanBoardRegressionLocators.clickOnNewButtonForCustomFieldAndRelationships()).click();
		
		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//step 1
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectTextRadioButtonFromCustomFieldPage()));
		findElement(KanbanBoardRegressionLocators.selectTextRadioButtonFromCustomFieldPage()).click();
		
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).get(sizeOfNextButton-2).click();
		
		//Step 2
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.fieldLabelNameForCurrencyRadioButton()));
		findElement(KanbanBoardRegressionLocators.fieldLabelNameForCurrencyRadioButton()).sendKeys("deepTextCustomField");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterLengthOfTextField()));
		findElement(KanbanBoardRegressionLocators.enterLengthOfTextField()).sendKeys("18");
		
		findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).get(sizeOfNextButton-2).click();
		
		//Step 3
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnVisibileCheckBoxOnFieldLevelSecurityPage()));
		findElement(KanbanBoardRegressionLocators.clickOnVisibileCheckBoxOnFieldLevelSecurityPage()).click();
		
		findElements(KanbanBoardRegressionLocators.nextButtonOnDataTypePage()).get(sizeOfNextButton-2).click();
		
		//step 4
		findElements(KanbanBoardRegressionLocators.clickOnSaveButtonToAddCustomField()).get(sizeOfsaveButtonForCreatingCustomField-2).click();
		
		//************************************************| Creating Field Set Script |************************************************
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnFieldSetsLink()));
		findElement(KanbanBoardRegressionLocators.clickOnFieldSetsLink()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		int sizeOfFieldSetNewButton = findElements(KanbanBoardRegressionLocators.clickOnFieldSetColumnNewButton()).size();
		System.out.println("sizeOfFieldSetNewButton :"+sizeOfFieldSetNewButton);
		findElement(KanbanBoardRegressionLocators.clickOnFieldSetColumnNewButton()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.fieldSetLabelForNewFieldSet()));
		findElement(KanbanBoardRegressionLocators.fieldSetLabelForNewFieldSet()).sendKeys("DeepFieldSet");
		
		actions.sendKeys(Keys.TAB).build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.fieldSetDescriptionWhereIsThisUsed()));
		findElement(KanbanBoardRegressionLocators.fieldSetDescriptionWhereIsThisUsed()).sendKeys("Creating new field set for testing custom field through automation.");
		
		int fieldSetSaveButtonSize = findElements(KanbanBoardRegressionLocators.clickOnFieldSetSaveButton()).size();
		System.out.println("fieldSetSaveButtonSize :"+fieldSetSaveButtonSize+"\n******************************************************************************************************************");
		findElements(KanbanBoardRegressionLocators.clickOnFieldSetSaveButton()).get(fieldSetSaveButtonSize-2).click();
		
		//Add Currency field
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectCurrencyFieldUnderFieldSet()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.selectCurrencyFieldUnderFieldSet()));
		actions.clickAndHold(findElement(KanbanBoardRegressionLocators.selectCurrencyFieldUnderFieldSet())).build().perform();
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.inTheFieldSetAreaWhereFieldsToBeDropped())).release().build().perform();
		
		//Add Text field
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectTextFieldUnderFieldSet()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.selectTextFieldUnderFieldSet()));
		actions.clickAndHold(findElement(KanbanBoardRegressionLocators.selectTextFieldUnderFieldSet())).build().perform();
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.inTheFieldSetAreaWhereFieldsToBeDropped())).release().build().perform();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnSaveButtonOfFieldSet()));
		findElement(KanbanBoardRegressionLocators.clickOnSaveButtonOfFieldSet()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		driver.switchTo().window(multipleTabsOpen.get(1));
		
		
		//****************************************Click on Edit Kanban Card and Click on Edit Card Info for add Custom Field on Particular Category****************************************
		
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardInfo());
		findElement(KanbanBoardRegressionLocators.clickOnCardInfo()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskAfterSave());
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCategoryDropDownForSetCustomField());
		findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDownForSetCustomField()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnOperationCategoryEditPensilIcon());
		findElement(KanbanBoardRegressionLocators.clickOnOperationCategoryEditPensilIcon()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCustomFieldsDropDownUnderEditCategory());
		findElement(KanbanBoardRegressionLocators.clickOnCustomFieldsDropDownUnderEditCategory()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectFieldSetNameFromList()));
		findElement(KanbanBoardRegressionLocators.selectFieldSetNameFromList()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.radioButtonApplyToEntireProject()));
		findElement(KanbanBoardRegressionLocators.radioButtonApplyToEntireProject()).click();
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnEditCategorySaveButton()));
		findElement(KanbanBoardRegressionLocators.clickOnEditCategorySaveButton()).click();
				
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectCategoryFromDropDownValueOperations());
		findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueOperations()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeClickableByLocator", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		
		try {Thread.sleep(1200);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editCard());
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		try {Thread.sleep(1200);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCustomFieldsSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnCustomFieldsSideColumn()).click();
		
		try {Thread.sleep(2500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.enterValueOnCurrencyCustomField());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.enterValueOnCurrencyCustomField())).click().build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.enterValueOnCurrencyCustomField()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		findElement(KanbanBoardRegressionLocators.enterValueOnCurrencyCustomField()).sendKeys("100");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterValueOnTextCustomField()));
		findElement(KanbanBoardRegressionLocators.enterValueOnTextCustomField()).sendKeys("Hey! there..This is a custom field text");
		
		try {Thread.sleep(2000);} catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	// ResourceSide Column
	public void clickOn_ResourceSideColumnOnKanbanCard()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.editCard());
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardInfo());
		findElement(KanbanBoardRegressionLocators.clickOnCardInfo()).click();
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnResourceSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnResourceSideColumn()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskAfterSave());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {};
	}
	
	
	public String verifyResourceOnCard()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.verifyResourceName());
		getResourceNameFromResourceTab = findElement(KanbanBoardRegressionLocators.verifyResourceName()).getText();//.substring(0, 20);
		System.out.println("Currently assigned resource on Update card title from New Card to LATEST CARD with resource name :"+getResourceNameFromResourceTab);
		return getResourceNameFromResourceTab;
	}
	
	public String verifyResourceAllocation()
	{
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.verifyResourceAllocationFromCard());
		getCardAllocationFromResourceTab = findElement(KanbanBoardRegressionLocators.verifyResourceAllocationFromCard()).getText();
		System.out.println("Current allocation on Update card title from New Card to LATEST CARD with allocation percentage :"+getCardAllocationFromResourceTab+"\n******************************************************************************************************************");
		return getCardAllocationFromResourceTab;
	}
	
	//Applied Card Mode on Kanban Card
	public void ClickOn_CardModeSideColumn()
	{
		//**********************************************Card Mode Script start from here**********************************************
		try {Thread.sleep(2500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardInfo());
		findElement(KanbanBoardRegressionLocators.clickOnCardInfo()).click();
		try{Thread.sleep(2000);}catch(InterruptedException ie){}
		
		
		
	//	explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardModeSideColumn());
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnCardModeSideColumn())).build().perform();
		findElement(KanbanBoardRegressionLocators.clickOnCardModeSideColumn()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		int schedulingModeEffortUnitDropDown = findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).size();
		System.out.println("Scheduling Mode and Effort Unit dropdown list size LINE 1746 :"+schedulingModeEffortUnitDropDown);
		
		//NU Below lie
		findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).get(schedulingModeEffortUnitDropDown-2).click();
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectValueFromCardModeScheduleModeDropDown()));
		findElement(KanbanBoardRegressionLocators.selectValueFromCardModeScheduleModeDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.actualEffortInputField()));
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.actualEffortInputField())).click().build().perform();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElement(KanbanBoardRegressionLocators.actualEffortInputField()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		findElement(KanbanBoardRegressionLocators.actualEffortInputField()).sendKeys("10");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		findElements(KanbanBoardRegressionLocators.schedulingModeAndEffortUnitCommonXpath()).get(schedulingModeEffortUnitDropDown-1).click();		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.selectValueFromEffortUnitDropDown()));
		findElement(KanbanBoardRegressionLocators.selectValueFromEffortUnitDropDown()).click();
				
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnCardInfoForCardMode()));
		findElement(KanbanBoardRegressionLocators.clickOnCardInfoForCardMode()).click();
				
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.scrollDownToAccecptanceCriteriaInputTextField()));
		scrollinToView(findElement(KanbanBoardRegressionLocators.scrollDownToAccecptanceCriteriaInputTextField()));
	}
	
	public boolean verifyCardModeEstimationDays()
	{
		boolean estimationDaysField = findElement(KanbanBoardRegressionLocators.estimationInputFieldCardInfo()).isEnabled();
		System.out.println("Estimation days input field LINE 1774 :"+estimationDaysField);
		return estimationDaysField;
	}
	
	public boolean verifyCardModeDuration()
	{
		boolean durationInputField = findElement(KanbanBoardRegressionLocators.durationInputFieldCardInfo()).isEnabled();
		System.out.println("durationInputField LINE 1781 :"+durationInputField+"\n******************************************************************************************************************");
		return durationInputField;
	}
	
	
	//Upload Sticker on Kanban Board and Apply on Kanban card
	public void uploadStickerOnKanbanBoardAndApplyOnKanbanCard()
	{
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {} 		//this code is for uploading sticker to kanban board
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAddToBoardFan());
		findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();
		
		//Get All Master Container Length
		getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).size();
		System.out.println("Size of all master containers present on Regression kanban board :"+KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard);
				
		//In Progress MasterContainer
		getMasterContainerDynamicWebElementId = findElements(AddToBoardFanButtonLocators.regressionKanbanBoardMasterContainers()).
												get(KanbanBoardRegressionHelper.getSizeOfAllMasterContainersFromRegressionKanbanBoard - 5).
												getAttribute("id");
		System.out.println("InProgress master container uploadStickerOnKanbanBoardAndApplyOnKanbanCard method, class KanbanBoardRegressionHelper :"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.addStickerToBoardOrCard()));
		WebElement addStickerToBoardOrCardSource = findElement(KanbanBoardRegressionLocators.addStickerToBoardOrCard());
		
		explicitWaitVisibilityOf(findElement(By.id(getMasterContainerDynamicWebElementId)));
		actions.dragAndDrop(addStickerToBoardOrCardSource, findElement(By.id(getMasterContainerDynamicWebElementId))).build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}		  
		
		String imageName[] = {"download1.jpg","download2.jpg"};
		//String[]  imageName1= {"img1","img2","img3","img4"};Array
		
		
		//Apply loop from here
		
		for(int i=0; i<imageName.length; i++)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerUploaderPlusIcon());
			findElement(KanbanBoardRegressionLocators.clickOnStickerUploaderPlusIcon()).click();
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.enterNameOnUploadStickerInputField());
			findElement(KanbanBoardRegressionLocators.enterNameOnUploadStickerInputField()).sendKeys("img "+i);
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.uploadStickerGlobalFieldCheck());
			findElement(KanbanBoardRegressionLocators.uploadStickerGlobalFieldCheck()).click();
			
			try {Thread.sleep(1500);} catch(InterruptedException ie) {}
			
			findElement(KanbanBoardRegressionLocators.chooseFileNameFromDriveForUploadSticker()).sendKeys(filePath+"\\ImageFolder/"+imageName[i]);
			
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.uploadStickerUploadButton());
			findElement(KanbanBoardRegressionLocators.uploadStickerUploadButton()).click();
		
			explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		}
		//Loop End here	
	
		try{Thread.sleep(1500);} catch (InterruptedException ie){}
		
		explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		findElement(By.xpath("//body")).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnAddToBoardFan());
		findElement(KanbanBoardRegressionLocators.clickOnAddToBoardFan()).click();		//this code is for uploading sticker to kanban board &  this will close Fan button
		
	
		//***********************************************************| Apply stickers on Kanban Card |************************************************************
		
		try {Thread.sleep(1200);}catch(InterruptedException ie) {}		//increase thread second
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.cardEditAfterUploadSticker());
		findElement(KanbanBoardRegressionLocators.cardEditAfterUploadSticker()).click();
		
		
		try{Thread.sleep(2000);}catch(InterruptedException ie){}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCardInfo());
		findElement(KanbanBoardRegressionLocators.clickOnCardInfo()).click();
		try{Thread.sleep(2000);}catch(InterruptedException ie){}
		
		
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).click().build().perform();
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		//*******************need to apply new logic here for apply sticker on kanban card*******************
		
		int sizeOfStickerWindow = findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).size() - 33;
		System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
		
		
		
	
		
		for(int i=0; i<sizeOfStickerWindow; i++)
		{
			findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(i).click();
			
		}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
	}
	
	
	public boolean verifyStickerUploadOnKanbanCard()
	{
		boolean stickerStatus = false;
		for(int i=0; i<=5; i++)
		{
			stickerStatus = driver.findElement(By.xpath("//div[@class='kanbancard ']/div//li[@class='sticker']/img[" +i+"]")).isDisplayed();
			System.out.print(stickerStatus +" ");
		}
		System.out.println("\n***************************************************************************************************");
		return stickerStatus;
	}

	//Clone Kanban Card Script start here
	public void clickOn_CloneSideColumn()
	{
		//**************************************************| Clone Kanban Card with Start Date |**************************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		WebElement web=findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn());
		
		actions.moveToElement(web).build().perform();
		
		//explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()));
		//actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).click().build().perform();
		
		
		
		
		
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).
		dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()), 
		findElement(KanbanBoardRegressionLocators.inprogressMasterContainer())).build().perform();
		
		*/
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCloneSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCloneCardStartDate());
		findElement(KanbanBoardRegressionLocators.clickOnCloneCardStartDate()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		String getStartDateFromCloneCardByStartDateCalendarPopup = findElement(KanbanBoardRegressionLocators.pickStartDateFromCloneCardByStartDateCalendarPopup()).getText();
		System.out.println("getStartDateFromCloneCardByStartDateCalendarPopup :"+getStartDateFromCloneCardByStartDateCalendarPopup);
		
		int getAllDatesLiElementLength = findElements(KanbanBoardRegressionLocators.getAllDatesLiElementFromCloneCardPopup()).size();
		System.out.println("Clone by start date popup of dates li element length :"+getAllDatesLiElementLength);
		
		for(int i=1; i<=getAllDatesLiElementLength; i++)
		{
			String iterateThroughAllLiElementsAndGetText = findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+i+"]")).getText();
			
			
			if(getStartDateFromCloneCardByStartDateCalendarPopup.equals(iterateThroughAllLiElementsAndGetText))
			{
				try {Thread.sleep(500);} catch(InterruptedException ie) {}
				
				String getClassAttributeForCheckDisableOrEnable = findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li")).getAttribute("class");
				
				System.out.println("getClassAttributeForCheckDisableOrEnable :"+getClassAttributeForCheckDisableOrEnable);
				
				if(getClassAttributeForCheckDisableOrEnable.contains("disabled"))
				{
					findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i+4)+"]")).click();
				}
				else
				{
					findElement(By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li["+(i+2)+"]")).click();
				}
			}
		}
		
		try {Thread.sleep(1000);} catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated" , KanbanBoardRegressionLocators.clickOnCloneButton());
		findElement(KanbanBoardRegressionLocators.clickOnCloneButton()).click();
		
		
		
		//**************************************************| Clone Kanban Card with Due Date |**************************************************
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		getSizeOfAllMasterContainersFromRegressionKanbanBoard = findElements(KanbanBoardRegressionLocators.masterContainersFormAttributeCount()).size();
		System.out.println("Regression Kanban Board's master containers size and id of form attribute :"+getSizeOfAllMasterContainersFromRegressionKanbanBoard);
		
		getMasterContainerDynamicWebElementId = findElements(KanbanBoardRegressionLocators.masterContainersFormAttributeCount()).get(getSizeOfAllMasterContainersFromRegressionKanbanBoard-4).getAttribute("id");
		System.out.println("BackLog master container id LINE 1960 :"+getMasterContainerDynamicWebElementId);	
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnParentKanbanCardEditIcon());
		findElement(KanbanBoardRegressionLocators.clickOnParentKanbanCardEditIcon()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
        WebElement web1=findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn());
		
	    actions.moveToElement(web1).build().perform(); 
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).
		dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()), 
		findElement(KanbanBoardRegressionLocators.inprogressMasterContainer())).build().perform();
		*/
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn()));
		findElement(KanbanBoardRegressionLocators.clickOnCloneSideColumn()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.clickOnCloneCardDueDate());
		findElement(KanbanBoardRegressionLocators.clickOnCloneCardDueDate()).click();
		
		String cloneCardWithDueDate = findElement(KanbanBoardRegressionLocators.selectDateFromDueDatePicker()).getText();
		System.out.println("Clone Card with due date and value from date picker LINE 1982 :"+cloneCardWithDueDate);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.selectDateFromDueDatePicker());
		findElement(KanbanBoardRegressionLocators.selectDateFromDueDatePicker()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnCloneButton());
		findElement(KanbanBoardRegressionLocators.clickOnCloneButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public boolean verifyKanbanCardWhichISCloneByStartDate()
	{
		boolean startDateKanbanCardClone = findElement(KanbanBoardRegressionLocators.clonekanbanCardWithStartDate()).isDisplayed();
		System.out.println("startDateKanbanCardClone is visible :"+startDateKanbanCardClone);
		return startDateKanbanCardClone;
	}
	
	public boolean verifyKanbanCardWhichIsCloneByDueDate()
	{
		boolean dueDateKanbanCardClone = findElement(KanbanBoardRegressionLocators.cloneKanbanCardWithDueDate()).isDisplayed();
		System.out.println("dueDateKanbanCardClone is visible :"+dueDateKanbanCardClone+"\n******************************************************************************************************************");
		return dueDateKanbanCardClone;
	}
	
	
	//Hyper Jump Kanban Card
	public void clickOn_HyperJumpKanbanCardToAnotherProjectKanbanBoard()
	{
		//*****************************************| Hyper Jump Kanban Card |**********************************************************
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		findElement(KanbanBoardRegressionLocators.editCard()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn())).click().build().perform();
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn());
		//findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn()).click();
		//try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnParentKanbanCardEditIcon());
		findElement(KanbanBoardRegressionLocators.clickOnParentKanbanCardEditIcon()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).
		dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()), 
		findElement(KanbanBoardRegressionLocators.inprogressMasterContainer())).build().perform();
		*/
		
		/*try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnHyperJumpSideColumn()).click();
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		*/
		int hyperJumpCardsTargetBoardFieldSize = findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).size();
		System.out.println("hyperJumpCardsTargetBoardFieldSize LINE 2032 :"+hyperJumpCardsTargetBoardFieldSize+"\n***************************************************************************************************");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//Click on Select Project dropdown
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-6).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnFolderWhichWillSelect()));
		findElement(KanbanBoardRegressionLocators.clickOnFolderWhichWillSelect()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectProjectNameAfterFolderExpand()));
		findElement(KanbanBoardRegressionLocators.selectProjectNameAfterFolderExpand()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//Click On Select Project Board
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-5).click();
		try {Thread.sleep(1300);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.selectKanbanBoardUnderSelectProjectBoardDropdown());
		findElement(KanbanBoardRegressionLocators.selectKanbanBoardUnderSelectProjectBoardDropdown()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//Click on Select Column
		findElements(KanbanBoardRegressionLocators.hyperJumpCardsSubWindows()).get(hyperJumpCardsTargetBoardFieldSize-4).click();
		try {Thread.sleep(1200);}catch(InterruptedException ie) {}
		explicitWaitElementToBeLocated(KanbanBoardRegressionLocators.selectInProgressMasterContainerUnderSelectColumnDropdown());
		findElement(KanbanBoardRegressionLocators.selectInProgressMasterContainerUnderSelectColumnDropdown()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.hyperJumpCardsJumpButton()));
		findElement(KanbanBoardRegressionLocators.hyperJumpCardsJumpButton()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		driver.switchTo().window(multipleTabsOpen.get(2));
	}
	
	
	//Kanban Card Hierarchy Script
	public void clickOn_HierarcySideColumn()
	{
		//***************************************************Kanban Board Hierarcy scipt start Here***************************************************
		
		try {Thread.sleep(1800);}catch(InterruptedException ie) {}
		int masterContainersFormGetId = findElements(KanbanBoardRegressionLocators.masterContainersFormAttributeCount()).size();
		System.out.println("Regression Kanban Board's master containers get size and id of form attribute LINE 2075 :"+masterContainersFormGetId);
		
		masterContainerDynamicallyGetFormIdOfAnotherKanbanBoard = findElements(KanbanBoardRegressionLocators.masterContainersFormAttributeCount()).get(masterContainersFormGetId-4).getAttribute("id");
		System.out.println("Regression Kanban Board for link one card to it KANBAN BOARD LINE 2078 :"+masterContainerDynamicallyGetFormIdOfAnotherKanbanBoard);
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditIconOfKanbanCardForHierarchyParentCard());
		findElement(KanbanBoardRegressionLocators.clickOnEditIconOfKanbanCardForHierarchyParentCard()).click();
		
		try{Thread.sleep(3000);}catch(InterruptedException ie) {}
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).
		dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()),
		findElement(KanbanBoardRegressionLocators.inprogressMasterContainer())).
		build().perform();*/
		
        actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnHierarchySideColumn())).click().build().perform();
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnHierarchySideColumn());
		//findElement(KanbanBoardRegressionLocators.clickOnHierarchySideColumn()).click();
		try {Thread.sleep(20000);}catch(InterruptedException ie) {}	
		driver.switchTo().window(multipleTabsOpen.get(2));
	}
	
	//Uploading Files on Kanban Card
	
	public void clickOn_FilesSideColumn()
	{
		//*******************************************************Click on Files Side column and script start from here*******************************************************
		
		int formId = findElements(KanbanBoardRegressionLocators.formIdAttributeValue()).size();
		System.out.println("Form Id Attribute value for uploading files on it LINE 2105 :"+formId);
		
		getIdValueOfForm = findElements(KanbanBoardRegressionLocators.formIdAttributeValue()).get(formId-1).getAttribute("id");
		System.out.println("Id of form element LINE 2108 :"+getIdValueOfForm+"\n**************************************************************************");
		
		/*try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditIconOfkanbanCardHasSticker());
		findElement(KanbanBoardRegressionLocators.clickOnEditIconOfkanbanCardHasSticker()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).
		dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()),
		findElement(KanbanBoardRegressionLocators.clickOnEditIconOfkanbanCardHasSticker())).
		build().perform();*/
		
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		//explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.editCard()));
		//findElement(KanbanBoardRegressionLocators.editCard()).click();
		
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditIconOfkanbanCardHasSticker());
		findElement(KanbanBoardRegressionLocators.clickOnEditIconOfkanbanCardHasSticker()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();
		
		
		
		//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnFilesSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn()).click();*/
		
		
		//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
		if(isRepositorySourceVisible == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.afterUploadButtonClick());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
		findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	public String getKanbanCardLinkFooterValue()
	{
		String linkTitleValue = findElement(KanbanBoardRegressionLocators.kanbanCardLinkFooter()).getAttribute("title");
		System.out.println("Linked Project Name LINE 2156 :"+linkTitleValue);
		return linkTitleValue;
	}
	
	
	public String getKanbanCardDaysEffortValue()
	{
		String daysEffortValue = findElement(KanbanBoardRegressionLocators.kanbanCardDaysEffortFooter()).getText();
		System.out.println("Days Effort Value for Kanban Card LINE 2164 :"+daysEffortValue);
		return daysEffortValue;
	}
	
	
	public String getKanbanCardPriority()
	{
		String priorityOfKanbanCard = findElement(KanbanBoardRegressionLocators.kanbanCardPriorityFooter()).getAttribute("class");
		System.out.println("Priority of kanban card LINE 2172 :"+priorityOfKanbanCard);
		return priorityOfKanbanCard;
	}
	
	
	public String getKanbanCardChatterCount()
	{
		String chatterCount = findElement(KanbanBoardRegressionLocators.kanbanCardChatterIconFooter()).getText();
		System.out.println("Chatter count on kanban card LINE 2180 :"+chatterCount);
		return chatterCount;
	}
	
	
	public String getkanbanCardTaskCount()
	{
		String taskCount = findElement(KanbanBoardRegressionLocators.kanbanCardTaskFooter()).getText();
		System.out.println("Task count of kanban Card LINE 2188 :"+taskCount);
		return taskCount;
	}
	
	
	public String getKanbanCardStatusPercentage()
	{
		String kanbanCardStatusPercentage = findElement(KanbanBoardRegressionLocators.kanbanCardStatusFooter()).getAttribute("title");
		System.out.println("kanban card status percentage LINE 2196 :"+kanbanCardStatusPercentage);
		return kanbanCardStatusPercentage;
	}
	
	public boolean getKanbanCardStickerVisibility()
	{
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		int stickerLiList = findElements(KanbanBoardRegressionLocators.getStickerHeaderLiElementList()).size();
		System.out.println("stickerLiList LINE 2204 :"+stickerLiList);
		
		boolean stickerVisible = false;
		for(int i=1; i<=stickerLiList; i++)
		{
			stickerVisible = driver.findElement(By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div[1]/div/div[@class='header']/ul/li[@class='sticker']/img["+i+"]")).isDisplayed();
			System.out.print(stickerVisible+" ");
		}
		return stickerVisible;
	}
	
	public String getKanbanCardOwner()
	{
		String kanbanCardGetOwnerNameFromStickerCard = findElement(KanbanBoardRegressionLocators.getCardOwnerFromStickerCard()).getAttribute("title");
		System.out.println("\nkanbanCardGetOwnerNameFromStickerCard :"+kanbanCardGetOwnerNameFromStickerCard+"\n*******************************************************************************************************************");
		return kanbanCardGetOwnerNameFromStickerCard;
	}
	
	//Delete KanbanCard
	public void clickOn_DeleteSideColumn()
	{
		//****************************************Delete Kanban Card script*********************************************
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditIconForDeleteKanbancard());
		boolean editIconSign = findElement(KanbanBoardRegressionLocators.clickOnEditIconForDeleteKanbancard()).isDisplayed();
		System.out.println("Edit icon LINE 2230 :"+editIconSign+"\n*******************************************************************************************************************");
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditIconForDeleteKanbancard());
		findElement(KanbanBoardRegressionLocators.clickOnEditIconForDeleteKanbancard()).click();
		try {Thread.sleep(1500);}catch(InterruptedException ie) {}
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnDeleteSideColumn())).click().build().perform();
		
		
		
		/*explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnStickerSideColumn());
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn())).
		dragAndDrop(findElement(KanbanBoardRegressionLocators.clickOnStickerSideColumn()),
		findElement(KanbanBoardRegressionLocators.clickOnEditIconOfkanbanCardHasSticker())).
		build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnDeleteSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnDeleteSideColumn()).click();*/
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnDeletePopupYesButton());
		findElement(KanbanBoardRegressionLocators.clickOnDeletePopupYesButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnDeleteAllTaskPopupNoButton());
    	findElement(KanbanBoardRegressionLocators.clickOnDeleteAllTaskPopupNoButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		driver.switchTo().window(multipleTabsOpen.get(0));
	}
}