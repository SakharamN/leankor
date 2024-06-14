package helper_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddToBoardFanButtonLocators;
import pom_package.CalenderViewForKanbanBoardAndDependencyLocators;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.AddMilestoneOnMasterContainerInCVLocator;
import pom_package.CreateKanbanCardsOnDifferentMasterContainerLocators;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;
import pom_package.ToCheckingHeaderButtonsOnCalendarViewLocator;
import test_package.TestAddKanbanCardRegressionOnCalendarView;

public class AddKanbanCardRegressionOnCalendarViewHelper extends CommonMethodsOfWebDriver {
	
	public static String getCardDuedate,getIframeSRCAttribute,childIframevalue,chatterArea,textAreaIDAttribute,classAttributeValueOfQuickActionSideColumn;
	public static String createFolderNameRandomly;
	public static String kanbanBoardCurrentBrowserWindowHandleValue;
	public static String createProjectNameRandomly;
	public static int cardLimit,getsizeofallMConCV;
	final int divisor = 5;
	public static ArrayList<String> multipleTabsOpen;
	public static Actions action;
	
 public void create_KanbanBoard() throws InterruptedException
	{
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		
				
		
	    explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnFolderIcon()).click();
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterFolderName()));
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
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnThreeDots()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnThreeDots()).click();
		
		createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 51 ::"+createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()).click();
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()).sendKeys(createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()).click();
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCreatedProject()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCreatedProject()).click();
		
		
		
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
		
	}
	
	
	public void create_KanbanCardOnCalendarView() throws AWTException
	{
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		//explicitWaitElementToBeClickable(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOn_KanbanBoardZoomIcon()));
		//findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOn_KanbanBoardZoomIcon()).click();
		
	//String winHandleAfterClickOnCalenderViewIcon = driver.getWindowHandle();
	//System.out.println("\nwindow value before handle : "+winHandleAfterClickOnCalenderViewIcon);
		
			
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()).click();
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		
		//for(String browserWindowsValue : driver.getWindowHandles())
		//{
		//	driver.switchTo().window(browserWindowsValue);
		//}
	

		
		
			
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
			driver.switchTo().window(winHandle);
	 	}
		
		
	        action = new Actions(driver);
	
	
    explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());		
	
	
    try {Thread.sleep(8000);}catch(InterruptedException ie) {}
	
	
	//click On inprogress master container
	

	
    explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer()));
	
	action.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer())).contextClick().build().perform();
	//scrollinToView(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.RightCliclickOnInprogressMasterContainer()));
	

	
	
		
		
	//	explicitWaitVisibilityOf(findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.sizeofallMConCV()));
		
		// get all master container length on CV board
		
  //  try {Thread.sleep(5000);}catch(InterruptedException ie) {}
	 
//	 int getsizeofallMConCV = findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.sizeofallMConCV()).size();
	// System.out.println("Size of all master container On Cv :"+getsizeofallMConCV);
		
		
		
		
		
	//	int Alltables =findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.alltable()).size();
		
	//	System.out.println("NO of tables are present on board :"+ Alltables);
		
		
		
		
		
		
	
		
	//	action.contextClick(findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.sizeofallMConCV()).get(getsizeofallMConCV-3)).click().build().perform();
		
        try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
		
	    try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("finance department");
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterEstimation()).clear();
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterEstimation()).sendKeys("2");
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		List<WebElement>category=findElements(AddKanbanCardRegressionOnCalendarViewLocater.Allcategoryelements());
		System.out.println("All category names are :"+category);
		
		for(int i=0; i<category.size(); i++)
		{
			String names = category.get(i).getText();
			
			System.out.println(names);
			
			if (names.equals("cat1")) {
		       // char character = names.charAt(i);
		        
				category.get(i).click();
			
		}
			
			
		}
		
		

		
	 //	explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.selectfinancecategory()));
	//	findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.selectfinancecategory()).click();
		
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()).click();
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnMediumPriority()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnMediumPriority()).click();
		
		
	    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()).sendKeys("Pratish Laad");
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchIconGlass()));
	    findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchIconGlass()).click();
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()).click();
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionForCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionForCard()).sendKeys("This is finance department Description");
		
		
		for(int i=0;i<=5;i++)
		{
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()).click();
		}
		
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.pointdropdown()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.pointdropdown()).click();
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectpointValue()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectpointValue()).click();
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.cardID()).sendKeys("001");
		
		
		
		for(int i=0;i<=5;i++)
		{
			
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.Allocation()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.Allocation()).click();
		
		}
		
		
		//getCardDuedate =findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.fetchingDuedate()).getText();
		
		//System.out.println("getCardDue Date While Creating Card :"+getCardDuedate);
		
		
	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
	explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
    findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
    
    try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		
	}
	
	
	public String getVerifycardOwneroncard()
	{
		String cardowner=findElement(AddKanbanCardRegressionOnCalendarViewLocater.verifycardowneroncard()).getText();
		System.out.println("cardowner  :"+cardowner);
		return cardowner;
		
	}
	
	public String getVerifycardTitleOnCard()
	{
		String Cardtitle=findElement(AddKanbanCardRegressionOnCalendarViewLocater.VerifycardTitle()).getText();
		System.out.println("CardTitle is :"+Cardtitle);
		return Cardtitle;
	}
	
	
	// Updating the Card on CV
	
	public void UpdateCVcard()	
	{
		try{Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		//click on the zoom to fit button
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()).click();
		
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
	
	actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
	
	try{Thread.sleep(2000);}catch(InterruptedException ie) {}
	
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnEditCard()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnEditCard()).click();
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).clear();
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("Update card title from finance department to Hr department");
	
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterEstimation()).clear();
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterEstimation()).sendKeys("4");
	
	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()).click();
	
	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectCat1Category()))	;
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectCat1Category()).click();
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()).click();
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickonLowpriority()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickonLowpriority()).click();
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()).click();
	
	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()).sendKeys("Pratish Laad");
	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchIconGlass()));
    findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchIconGlass()).click();
	
	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()).click();
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionForCard()));
	
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionForCard()).clear();
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionForCard()).sendKeys("This is updated finance department");
	
	
	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	for(int i=0;i<=6;i++)
	{
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()).click();
	}
	
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.pointdropdown()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.pointdropdown()).click();
	
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectanotherpointvalue()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectanotherpointvalue()).click();
	
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.cardID()).clear();
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.cardID()).sendKeys("002");
	
	for(int i=0;i<=5;i++)
	{
		
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.Allocation()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.Allocation()).click();
	
	}
	
	
	try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
	//explicitWaitElementToBeClickable(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SaveCard()));
  //  findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SaveCard()).click();
    
 //   explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickOnSchedulingMode()));
  //  findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickOnSchedulingMode()).click();
    
   // explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickonEffortDrivenSchedulingMode()));
   // findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickonEffortDrivenSchedulingMode()).click();
    
    
		
    for(int i=0; i<=5; i++)
	{
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickingOnActualEffort()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickingOnActualEffort()).click();
	}	
    
    
    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
    
    
    //clicking on thw following checkboxes
    
    for(int i=1; i<=3; i++)
    {
    	findElement(By.xpath("//label[text()='Manually Scheduled:']/ancestor::div[@class='x-panel x-panel-default']//table["+i+"]")).click();
    }
    
    try {Thread.sleep(1000);}catch(InterruptedException ie) {}
    
    for(int i=3;i>=1;i--)
    {
    	findElement(By.xpath("//label[text()='Manually Scheduled:']/ancestor::div[@class='x-panel x-panel-default']//table["+i+"]")).click();
    }
    
    
    try {Thread.sleep(2000);}catch(InterruptedException ie) {}
    
	explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
    findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
    
	
	}
	
	public boolean getverifycardmodeEstimationDays()
	{
		boolean estimationInputfield=findElement(AddKanbanCardRegressionOnCalendarViewLocater.EstimationFieldVisibleornot()).isEnabled();
		System.out.println("estimation Input Field visible or not :"+estimationInputfield);
		return estimationInputfield;
		
	}
	
	public boolean getVerifyEnddateField()
	{
		boolean endDateField=findElement(AddKanbanCardRegressionOnCalendarViewLocater.DueDateFieldVisibleornot()).isEnabled();
		System.out.println("Enddatefield is visible or not :"+endDateField);
		return endDateField;
	}
	
	
	
	//Automating the chatter on card in CV
	
	public void ClickingOnDiscuss()
	{
			
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
		
		actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickingonDiscuss()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickingonDiscuss()).click();
		
	   explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
		
	   try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	   explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.inspectiframe());
		
	   getIframeSRCAttribute=findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectiframe()).getAttribute("src");
	   System.out.println("src :"+getIframeSRCAttribute);
		
	 // driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchTo());
	   //driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchTo());
	   //driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchToframe());
	 //  driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchToframe());
	   
	   driver.switchTo().frame(findElement(AddKanbanCardRegressionOnCalendarViewLocater.iFrameSrcValueAndSwitchToframe()));
		
		
		handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardSettingLocators.clickOnPostLink());
	  
		explicitWaitElementToBeLocated(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window visibility :"+postWindowVisibility);
	  
	  if(postWindowVisibility==true)
	  {
		  explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe());
		 childIframevalue= findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe()).getAttribute("class");
		 System.out.println("childIframe class attribute value :"+childIframevalue);
		 
		 driver.switchTo().frame(findElement(AddKanbanCardRegressionOnCalendarViewLocater.getChildiFrameClassAttributeValue()));
		 
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea());
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea()).click();


		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean chatterArea = findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).isDisplayed();
		System.out.println("chatter area is visible :"+chatterArea);
		
		if(chatterArea==true)
		{
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).sendKeys("Hello this is calendar view chatter ");
			
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().parentFrame();
			
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()).click();
			
			
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.textDivArea());		
			textAreaIDAttribute = findElement(AddKanbanCardRegressionOnCalendarViewLocater.textDivArea()).getAttribute("id");
			System.out.println("Kanban Board Chatter text Area ID Attribute LINE 1356 :"+textAreaIDAttribute);
		
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.getTextFromChatterSubWindowforCard());	
		    String chatterText = findElement(AddKanbanCardRegressionOnCalendarViewLocater.getTextFromChatterSubWindowforCard()).getText();
		    System.out.println("After Chatter get text from chatter sub window LINE 1360 :"+chatterText);
			
			driver.switchTo().defaultContent();
			
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup());
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup()).click();	
			
			
		}
		  
		  
	  }
	  
	}
	
    //cloning the card on calendar View

	
	
	
	public void CloneCardBYStartDate()
	{
	
		try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
		
		actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCloneCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCloneCard()).click();
		
	//	explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClonealltaskCheckbox()));
	//	findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClonealltaskCheckbox()).click();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		///thiscode is quick action
		
		// clickng on start date of calendar
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonStartDate()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonStartDate()).click();
		
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
		String picksatrtdatefromCalendarpopup = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getText();
		
		System.out.println("picksatrtdatefromCalendarpopup LINE 1114 :"+picksatrtdatefromCalendarpopup+" is selected date currently.");
			
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
		String picksatrtdatefromCalendarpopupAttributeValue = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getAttribute("class");
		System.out.println("getSelectedDateClassAttributeValueFromCloningByStartDateCalendar LINE 1118 under Cloning by StartDate calendar :"+picksatrtdatefromCalendarpopupAttributeValue);
		
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.getAllRowElementsOfSelectDateCLoneCalendar());
		int getSizeOfAllRowElementsOfSelectDate = findElements(AddKanbanCardRegressionOnCalendarViewLocater.getAllRowElementsOfSelectDateCLoneCalendar()).size();
		System.out.println("getSizeOfAllRowElementsOfSelectDate LINE 1122 under Cloning by Startdate Calendar :"+getSizeOfAllRowElementsOfSelectDate);
		
		for(int i=1; i<=getSizeOfAllRowElementsOfSelectDate; i++)
		{                                                                   
			String classAttributeValueOfTdElement = findElement(By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td["+i+"]")).getAttribute("class");
			System.out.println("classAttributeValueOfTdElement LINE 1127 after "+i +" iteration :"+classAttributeValueOfTdElement);
			
			if(picksatrtdatefromCalendarpopupAttributeValue.equals(classAttributeValueOfTdElement) && i<=4)
			{
				
				try {Thread.sleep(1000);}catch(InterruptedException ie){}
				findElement(By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td["+(i+2)+"]")).click();
				//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				break;
			}                         
			else if(picksatrtdatefromCalendarpopupAttributeValue.equals(classAttributeValueOfTdElement) && i>=5)
			{
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.selectdatefromcalendarCloneOnNextRow());
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectdatefromcalendarCloneOnNextRow()).click();
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				break;
			}
		}
		
		
           try{Thread.sleep(3000);}catch(InterruptedException ie) {}
		 
	       explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()));
		   findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()).click(); 
		
	}
	
	
	
	
	public void CloneCardByDueDate()
	{
	
		try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
		
		actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCloneCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCloneCard()).click();
		
	//	explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClonealltaskCheckbox()));
	//	findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClonealltaskCheckbox()).click();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		// thiscode is quick action
		
		// clickng on start date of calendar
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonDueDate()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonDueDate()).click();
		
		
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
		String picksatrtdatefromCalendarpopup = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getText();
		
		System.out.println("picksatrtdatefromCalendarpopup LINE 1114 :"+picksatrtdatefromCalendarpopup+" is selected date currently.");
			
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
		String picksatrtdatefromCalendarpopupAttributeValue = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getAttribute("class");
		System.out.println("getSelectedDateClassAttributeValueFromCloningCardByCalendarview LINE 1118 under cloning card by DueDate calendar :"+picksatrtdatefromCalendarpopupAttributeValue);
		
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.getAllRowElementsOfSelectDateCLoneCalendar());
		int getSizeOfAllRowElementsOfSelectDate = findElements(AddKanbanCardRegressionOnCalendarViewLocater.getAllRowElementsOfSelectDateCLoneCalendar()).size();
		System.out.println("getSizeOfAllRowElementsOfSelectDate LINE 1122 under DueDate Calendar :"+getSizeOfAllRowElementsOfSelectDate);
		
		for(int i=1; i<=getSizeOfAllRowElementsOfSelectDate; i++)
		{                                                                   
			String classAttributeValueOfTdElement = findElement(By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td["+i+"]")).getAttribute("class");
			System.out.println("classAttributeValueOfTdElement LINE 1127 after "+i +" iteration :"+classAttributeValueOfTdElement);
			
			if(picksatrtdatefromCalendarpopupAttributeValue.equals(classAttributeValueOfTdElement) && i<=4)
			{
				
				try {Thread.sleep(1000);}catch(InterruptedException ie){}
				findElement(By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td["+(i+2)+"]")).click();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				break;
			}
			else if(picksatrtdatefromCalendarpopupAttributeValue.equals(classAttributeValueOfTdElement) && i>=5)
			{
				try {Thread.sleep(1500);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.selectdatefromcalendarCloneOnNextRow());
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectdatefromcalendarCloneOnNextRow()).click();
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				break;
			}
		}
		
		
		
		
	
		
		/*	
		explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickonStartDate()));
		findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickonStartDate()).click();
		
	     String pickstartdatefromcalendarpopup=findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.picksatrtdatefromCalendarpopup()).getText();
		 System.out.println("startdate from calendarpopup is : "+pickstartdatefromcalendarpopup);
		 
		 int getAlldateElementLength =findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.getAlldatefromAstartDateCalendarPopup()).size();
		 System.out.println("All date element length on clonestartdate popup :"+getAlldateElementLength);
		
		 
		for(int i=1; i<=getAlldateElementLength; i++)
		{
			String iterateAllElementLengthAndgetText= findElement(By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td/a["+i+"]")).getText();
			
			if(pickstartdatefromcalendarpopup.equals(iterateAllElementLengthAndgetText))
			{
				try {Thread.sleep(500);} catch(InterruptedException ie) {}
				
				String getClassAttributeForCheckDisableOrEnable=findElement(By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td/a["+(i+2)+"]")).getAttribute("class");
				
				System.out.println("getClassAttributeForCheckDisableOrEnable  :"+getClassAttributeForCheckDisableOrEnable);
				
				if(getClassAttributeForCheckDisableOrEnable.contains("disabled"))
				{
					findElement(By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td/a["+(i+4)+"]")).click();
				}
				else 
				{
					findElement(By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td/a["+(i+2)+"]")).click();
				}
				
			}
			
			
			
		}*/
		 
		 
		 try{Thread.sleep(3000);}catch(InterruptedException ie) {}
		 
	     explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()));
	     
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()).click(); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Card Hierarchy On Cv
	
	public void Hierarchy()
	{
		
        try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
		
		actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		 
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickonhierarchy()));
		 
		 actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickonhierarchy())).click().build().perform();
		 
		// ArrayList<String> multipleTabsOpen=new ArrayList<String>(driver.getWindowHandles());
		 
		 
		 try{Thread.sleep(5000);}catch(InterruptedException ie) {}
		 
		 
		 multipleTabsOpen = new ArrayList<String>(driver.getWindowHandles());
		 
		 
		 driver.switchTo().window(multipleTabsOpen.get(1));	 
		 
	}
	//Adding task on cv Card
	public void ClickOnAddTask()
	{	
        try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
		
		actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		   
		   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnaddTask()));
		   findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnaddTask()).click();
		   
		   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		   
		   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubject()));
		   findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubject()).sendKeys("Task1");
		   
		   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterDescription()));
		   findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterDescription()).sendKeys("This description is added on card for cv");
		   
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
		   
		   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickingOnStatusDropdown()));
		   findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickingOnStatusDropdown()).click();
		   
		   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		   explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectInprogressStatusFromdropdown()));
		   findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectInprogressStatusFromdropdown()).click();
		   
		   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		   
		   
		
		   
		   // handleElementClickInterceptedExpectionWhileClickOnElement(CreateCardsOnDifferentMasterContainersOnCVLocator.taskSaveButton()); this method is only for handling the clickintercepted exception but not clicking the element and pass the step
		   
		  // explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.taskSaveButton()));
		  // findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.taskSaveButton()).click();  By using click method element not clickable
		   
		  
		   jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.taskSaveButton()));//by using javascriptExecuter we can perform click operation
		      
	}
	
	//updating task on cv card
	
	public void EditTaskonCVCard() throws AWTException
	{
		 try{Thread.sleep(4000);}catch(InterruptedException ie) {}
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnTaskminiture()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnTaskminiture()).click();
		 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickoneditTask()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickoneditTask()).click();
		 
		 try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubjectForupdateTask()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubjectForupdateTask()).clear();
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterSubjectForupdateTask()).sendKeys("This is updated task1");
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterdescriptionforUpdateTask()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterdescriptionforUpdateTask()).clear();
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.EnterdescriptionforUpdateTask()).sendKeys("This is updated Description for task");
		 
		// explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickOnpriorityForupdatetask()));
		// findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickOnpriorityForupdatetask()).click();
		 
		// try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		 
		// explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectHighPriority()));
		// findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectHighPriority()).click();
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonStatusDropdownforUpdateTask()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonStatusDropdownforUpdateTask()).click();
		 
		 try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectCompletedStatusFromdropdown()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectCompletedStatusFromdropdown()).click();
		 
		 try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		 
		 jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.taskSaveButton()));
		 
	
	
		 
	//	 performRandomClickOnWebPage();
		 
		/* 
			Robot robot = null;
			try {robot = new Robot();}catch (AWTException e){}
			robot.mouseMove(100,80);
			actions.click().build().perform();	 
		
		 
		 
		 
	 
		 Robot rb=new Robot();
		 
		 rb.mouseMove(50, 50);
		 
		 actions.build().perform();		 */ 
		 
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		 
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnMaskborder()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnMaskborder()).click();
		 	 
		  
	}
		
	//uploading file On Cv Card
	
	public void UploadFileonCV()
	{
		
        try{Thread.sleep(8000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
		
		actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonFiles()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonFiles()).click();
		
		boolean isSalesforcefileTabisVisible = findElement(AddKanbanCardRegressionOnCalendarViewLocater.salesforcefileuploadTab()).isDisplayed();
		System.out.println("isSalesforcefileTabisVisible :"+isSalesforcefileTabisVisible);
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		if(isSalesforcefileTabisVisible==true)
		{
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.salesforcefileuploadTab()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.salesforcefileuploadTab()).click();
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		}
		//try{Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		
		//explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.uploadImageOnFilesInputFieldArea()));
//		findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.uploadImageOnFilesInputFieldArea()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		//explicitWaitElementToBeLocated((CreateCardsOnDifferentMasterContainersOnCVLocator.uploadImageOnFilesInputFieldArea()));
		//findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.uploadImageOnFilesInputFieldArea()).sendKeys(null);
		
		//scrollinToView(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.uploadImageOnFilesInputFieldArea())
		
		
		
		
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));//filepath is a varible that contains system.getProperty(user.dir) and that means you can obtain the current working directory as a string and use it in your code as needed.
		fileInput.sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		
		
		
	//	WebElement s  =driver.findElement(By.xpath("//input[@type='file']"));
	//	s.sendKeys("C:\\Users\\APLITE\\Downloads\\Sticker_CASH.jpg");

		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnUploadButton()));
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
	//	explicitWaitElementToBeClickable(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnUploadButton()));
	//	findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnUploadButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.afterUploadButtonClick());
		
		try{Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonCrossPopUp()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonCrossPopUp()).click();
		

	}
	
	public void ClickOnQuickactionOnCv()
	{
		try{Thread.sleep(4000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
			
			actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
			
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickONQuickAction()));
		action.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickONQuickAction())).build().perform();
		
			explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.CheckQuickActionCondition());		
			classAttributeValueOfQuickActionSideColumn = findElement(AddKanbanCardRegressionOnCalendarViewLocater.CheckQuickActionCondition()).getAttribute("class");
			System.out.println("Class attribute value of quick action side column LINE 1043 :"+classAttributeValueOfQuickActionSideColumn);
			
			
			//Class attribute is aParent means Quick Action icon is visible and click on it
			if(classAttributeValueOfQuickActionSideColumn.equals("x-menu-item-text"))		//Class attribute is aParent means Quick Action icon is visible and click on it
			{
				System.out.println("Quick Action button is active and perform change date operation.");
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
				action.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.CheckQuickActionCondition())).build().perform();
				
				
				//explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnQuickAction());
				//findElement(KanbanBoardRegressionLocators.clickOnQuickAction()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickonChangeDate());
				findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonChangeDate()).click();
				
				
				
			  //  driver.switchTo().frame("switchingIframe");
				
				driver.switchTo().frame(findElement(AddKanbanCardRegressionOnCalendarViewLocater.switchingIframe()));
				
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.StartdateAndDuatedatewindowisvisible());
				
				boolean isChangeDateQuickActionWindowVisible = findElement(AddKanbanCardRegressionOnCalendarViewLocater.StartdateAndDuatedatewindowisvisible()).isDisplayed();
				System.out.println("After click on change date quick action popup window open LINE 1088 :"+isChangeDateQuickActionWindowVisible);
				
				if(isChangeDateQuickActionWindowVisible == true)
				{
					
					
					explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.isStartDateCalendarVisible());
					boolean isStartDateFieldVisible = findElement(AddKanbanCardRegressionOnCalendarViewLocater.isStartDateCalendarVisible()).isDisplayed();
					System.out.println("Start Date Field LINE 1096 under iFrame is visible and now click on Due Date calendar.");
					
					if(isStartDateFieldVisible == true)
					{
						try {Thread.sleep(2000);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.clickOnQuickActionDueDateCalendarField());
						findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnQuickActionDueDateCalendarField()).click();
						
						explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.clickOnQuickActionDueDateCalendarField());
						boolean dueDateCalendarQuickAction = findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnQuickActionDueDateCalendarField()).isDisplayed();
						System.out.println("dueDateCalendarQuickAction LINE 1106 :"+dueDateCalendarQuickAction);
						
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						scrollDown();
						
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.getSelectedDateFromQuickActionDueDateCalendar());
						String getSelectedDateFromQuickActionDueDateCalendar = findElement(KanbanBoardRegressionLocators.getSelectedDateFromQuickActionDueDateCalendar()).getText();
						System.out.println("getSelectedDateFromQuickActionDueDateCalendar LINE 1114 :"+getSelectedDateFromQuickActionDueDateCalendar+" is selected date currently.");
							
						explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.getSelectedDateFromQuickActionDueDateCalendar());
						String getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar = findElement(AddKanbanCardRegressionOnCalendarViewLocater.getSelectedDateFromQuickActionDueDateCalendar()).getAttribute("aria-selected");
						System.out.println("getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar LINE 1118 under Quick action Due Date calendar :"+getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar);
						
						explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.getAllRowElementsOfSelectDate());
						int getSizeOfAllRowElementsOfSelectDate = findElements(AddKanbanCardRegressionOnCalendarViewLocater.getAllRowElementsOfSelectDate()).size();
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
								explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.clickOnSaveButtonAfterDateSelectedOnQuickAction());
								findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
								break;
							}
							else if(getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar.equals(classAttributeValueOfTdElement) && i>=6)
							{
								try {Thread.sleep(1500);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.selectDateFromQuickActionCalendarOnNextRow());
								findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectDateFromQuickActionCalendarOnNextRow()).click();
								try {Thread.sleep(2000);}catch(InterruptedException ie) {}
								explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.clickOnSaveButtonAfterDateSelectedOnQuickAction());
								findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnSaveButtonAfterDateSelectedOnQuickAction()).click();
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
		
	public void DeleteCardOnCV()
	{
		
		  
		  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		  driver.navigate().refresh();
		  
		  try{Thread.sleep(12000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard()));
		  handleElementClickInterceptedExpectionWhileClickOnElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard());
		  
		  actions.moveToElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.RightClickOnCard())).contextClick().build().perform();
		  
		  
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
	
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnDeleteButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnDeleteButton()).click();
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
	     //	explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectDeleteOption()));
		//findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectDeleteOption()).click();
		

		
	//	handleElementClickInterceptedExpectionWhileClickOnElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SelectDeleteOption());
		
				
		jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.OnPopupSelectDeleteOption()));
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnYesOnDeleteAlltaskPopup()));
		//findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnYesOnDeleteAlltaskPopup()).click();
		
		
		// following code for if task is added on card
		jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnYesOnDeleteAlltaskPopup()));
		
	}
	
	
	
	
	
	
			
				
	}
	
	
	
	
	
	
		
	

	
