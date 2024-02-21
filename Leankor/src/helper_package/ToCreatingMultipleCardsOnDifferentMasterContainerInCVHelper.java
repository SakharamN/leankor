package helper_package;

import java.awt.AWTException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.KanbanBoardSettingLocators;
import pom_package.ToCheckingHeaderButtonsOnCalendarViewLocator;
import pom_package.ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater;

public class ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper extends CommonMethodsOfWebDriver {
	
	public static String getIframeSRCAttribute,childIframevalue,chatterArea,textAreaIDAttribute,classAttributeValueOfQuickActionSideColumn;
	public static String createFolderNameRandomly;
	public static String kanbanBoardCurrentBrowserWindowHandleValue;
	public static String createProjectNameRandomly;
	public static int cardLimit,getsizeofallMConCV;
	final int divisor = 5;
	public static ArrayList<String> multipleTabsOpen;
	public static Actions action;
	public static  org.openqa.selenium.support.ui.WebDriverWait wait;
	
	
 public void create_KanbanBoard() throws InterruptedException
	{
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		
				
		
		  // Wait for element to be visible
		
	 wait=new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(120));
		
	 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("addicon")));
		
	 element.click();	
	 
	  //  explicitWaitElementToBeClickable(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnFolderIcon()));
	//	findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnFolderIcon()).click();
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
		
		explicitWaitElementToBeClickable(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.clickOnThreeDots()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.clickOnThreeDots()).click();
		
		createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 51 ::"+createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()).click();
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()).sendKeys(createProjectNameRandomly);
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()).click();
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.clickOnCreatedProject()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.clickOnCreatedProject()).click();
		
		
		
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
		
		
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()));//create kanbanCard method needs to comment
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()).click();
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
			
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
			
			//try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			driver.switchTo().window(winHandle);
	 	}
		
		
	        action = new Actions(driver);
	
	
	       explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());		
	       
           try {Thread.sleep(5000);}catch(InterruptedException ie) {}
	
	
           @SuppressWarnings("resource")
   		Scanner sc = new Scanner(System.in);
   		
   		System.out.print("Enter limit of card : ");
   		cardLimit = sc.nextInt(); //The sc.nextInt() method reads an integer value entered by the user from the standard input and assigns it to the cardLimit variable.
   		
		
		
	}
 
	
	public void create_KanbanCard() throws AWTException
	{
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()).click();
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
			
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
			
			//try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			driver.switchTo().window(winHandle);
	 	}
		
		
	       action = new Actions(driver);
	
	       explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());		
	
	
           try {Thread.sleep(5000);}catch(InterruptedException ie) {}
	
           
	
	 //click On inprogress master container	
    // explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.RightCliclickOnInprogressMasterContainer()));
	
	 action.moveToElement(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.clickingOnInprogressmasterContainer())).contextClick().build().perform();
	//scrollinToView(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.RightCliclickOnInprogressMasterContainer()));
	


	//	action.contextClick(findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.sizeofallMConCV()).get(getsizeofallMConCV-3)).click().build().perform();
		
     try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("finance department");
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterEstimation()).clear();
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterEstimation()).sendKeys("2");
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		List<WebElement>category=findElements(AddKanbanCardRegressionOnCalendarViewLocater.Allcategoryelements());
		//System.out.println("All category names are :"+category);
		
		for(int i=0; i<category.size(); i++)
		{
			String names = category.get(i).getText();
			System.out.println("All category names are :"+names);
			
			if (names.equals("HR")) {
		       
		        
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
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserfield()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserfield()).sendKeys("Pratish Laad");
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickONSEarchIcon()));
	    findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickONSEarchIcon()).click();
		
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
	
	
	public void CardsCreateOnTemplateMasterContainer()
	{
	
		
		System.out.print("Cards Creating on Template master container in Calendar View\n");
	
     try {Thread.sleep(5000);}catch(InterruptedException ie) {}
	
	for(int i=1;i<=cardLimit; i++)
	{
		 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
        explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.TemplateMasterContainer()));
		action.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.TemplateMasterContainer())).contextClick().build().perform();

		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
	//explicitWaitElementToBeClickable(findElement(CalendarViewRegressionforOneCardLocater.SaveCard()));
   // findElement(CalendarViewRegressionforOneCardLocater.SaveCard()).click();
    
		jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
    
    
    
    explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
 
   System.out.print(i+" ");
	
		
	
   
	
	  }
	
	System.out.println("\nCards creation on Template master container ends");
	
	}
	
	
	
	public void CardsCreateOnBacklogMasterContainer() {
		
	// Cards creating on Backlog master container                                                
	
	System.out.print("Now Cards creting on Backlog master container in Calendar View\n");
	
    try{Thread.sleep(2000);}catch(InterruptedException ie) {}
	
	for(int i=1; i<=cardLimit; i++)
	{
		 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.BackLogMasterContainer()));
		actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.BackLogMasterContainer())).contextClick().build().perform();
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
		
	//	explicitWaitElementToBeClickable(findElement(CalendarViewRegressionforOneCardLocater.SaveCard()));
	//	findElement(CalendarViewRegressionforOneCardLocater.SaveCard()).click();
		
		jsExecutorClickOnElement(findElement(By.xpath("//div[@class='x-toolbar x-docked x-toolbar-footer x-box-layout-ct']/div/div/a[3]")));
		
		explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
		
	   System.out.print(i+" ");
		
		  

	}
	
	System.out.println("\nCards creation on backlog master container ends");
}
	// cards creating on Inprogress master container
	
	
	public void CardsCreateOnInprogressMasterContainer()
	{
	System.out.print("Now cards creating on Inprogress master container In Calendar View\n");
	
	 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
	
	 for(int i=1; i<=cardLimit; i++)
	 {
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer()));
        actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer())).contextClick().build().perform();
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
		
		System.out.print(i+" ");
	
	  }
	 
	 System.out.println("\nCards Creation on Inprogress master container ends");
	 
	}	
	//cards creating on Review and Approve master container
	
	public void CardsCreateOnReviewAndApproveMasterContainer() 
	{
	
	 System.out.print("Now Cards creting on Review and Approve master container In Calendar View\n");
	
	 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
	 
	 for(int i=1; i<=cardLimit;i++)
	 {
		 
		 try{Thread.sleep(2000);}catch(InterruptedException ie) {} 
		  
		 explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ReviewAndApproveMasterContainer()));
		    actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ReviewAndApproveMasterContainer())).contextClick().build().perform();
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
			
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
			
			explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
			
			System.out.print(i+" ");
	
 	 
     	 }
	 
	       System.out.println("\nCrads creation on review and approve master container ends");
	 
	} 
	 //cards creating on Done master container 
	 
	public void CardsCreateOnDoneMasterContainer() 
	{
	 System.out.print("Now Cards creating on done master container In Calendar View\n");
	 try {Thread.sleep(2000);
		
	} catch (InterruptedException ie) {
	
	}
	 
	 for(int i=1; i<=cardLimit; i++)
	 {
		 
		 try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		 
		 explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.DoneMasterContainer()));
		 actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.DoneMasterContainer())).contextClick().build().perform();
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
		 
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
		 
		 try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		 
		 explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
		 
		 explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
		 
		
		 System.out.print(i+" ");
	
	 }
	 
	 System.out.println("\nCards creation on Done master container ends");
	 
	} 
	//cards creating on Archive master container
	
	public void CardsCreateOnArchiveMasterContainer()
	{
	 
	 System.out.print("Now cards creating on Archive master container In Calendar View\n");
	 
	 try {Thread.sleep(2000);} catch (InterruptedException ie) {}
	 
	 
	 for(int i=1; i<=cardLimit; i++)
	 {
		 
		 try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		 explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ArchiveMasterContainer()));
		 actions.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ArchiveMasterContainer())).contextClick().build().perform();
		 
		 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddCard()).click();
		 
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("card"+i);
		 
		 try {Thread.sleep(2000);} catch (InterruptedException ie) {}
		 
		 explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
		 findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
		 
		 explicitWaitElementBy("invisibilityOfElementLocated", ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.xmaskloadaftersave());
		 
		 System.out.print(i+" ");
		
	 
	     
	  }
	 
	 explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()));
	 findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()).click();
	
	 try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	 
	    System.out.println("\nCards creation on archive master container ends");
		
	}
	
	
	
	public void CollapseAndExpandMasterContainers()
	{ 
		
		
	    try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		int allmasterContainerSize = findElements(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.CommonXpathForGridnodeformasterContainer()).size();
		System.out.println("All master container size is :"+allmasterContainerSize);
		
		//By using increment loop from first element then the length of elements become zero and indexOutofbond exception occured
		/*
		for (int i = 0; i < allmasterContainerSize-1; i++) 
		{
		    List<WebElement> elements = findElements(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.CommonXpathForGridnodeformasterContainer());
		    System.out.println("Index: " + i + ", Number of Elements: " + elements.size());
		    if (i < elements.size()) {
		    	try { Thread.sleep(1000); } catch (InterruptedException ie) {}
		        elements.get(i).click();
		        try { Thread.sleep(1000); } catch (InterruptedException ie) {}
		    } else {
		        System.out.println("No element found at index " + i);
		        // Handle the case where the element is not found at the given index
		    }
		}
		*/

		
		//by using decrement loop from last element mc collapse from bottom
		for (int i = allmasterContainerSize - 1; i >= 0; i--) //here we skipped 1 elements
		{
		    List<WebElement> elements = findElements(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.CommonXpathForGridnodeformasterContainer());
		    System.out.println("Index: " + i + ", Number of Elements: " + elements.size());
		   
		    if (i < elements.size())
		    {
		    	
		        elements.get(i).click();
		        
		      
		     }
		       else    {
		    	   
		              System.out.println("No element found at index " + i);
		               // Handle the case where the element is not found at the given index
		               }
		       
		    
		}

		
		//following two line code only for board node
		
        try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.treenodeExpander()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.treenodeExpander()).click();
		
		
		
		//following loop for expanding MC except first Board node(down arrow)
		
		for (int i = allmasterContainerSize - 1; i >= 1; i--) //here we skipped 2 elements
		{
		    List<WebElement> elements = findElements(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.treeNodeExpanderSixmasterContainer());
		    System.out.println("Index: " + i + ", Number of Elements: " + elements.size());
		   
		    //here we use if condition bcz to avoiding the indexOutofbondexception
		    if (i < elements.size())
		    {
		    	
		        elements.get(i).click();
		    }
		    else
		    {
		    	System.out.println("No element found at index " + i);
		    }
		       
		        
	   	}
	
  }	
		
		
		
		
		
		
		/*
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofTemplateMc()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofTemplateMc()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofBacklogMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofBacklogMC()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofInprogressMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofInprogressMC()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofReviewAndApproveMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofReviewAndApproveMC()).click();
	
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofDoneMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofDoneMC()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofArchiveMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofArchiveMC()).click();
		
		
		try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofArchiveMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofArchiveMC()).click();
	
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofDoneMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofDoneMC()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofReviewAndApproveMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofReviewAndApproveMC()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofInprogressMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofInprogressMC()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofBacklogMC()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofBacklogMC()).click();
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofTemplateMc()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.elbowIMGofTemplateMc()).click();
		
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
    	explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.kanbanBoardnode()));
	    findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.kanbanBoardnode()).click();
		
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		 
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.treenodeExpander()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.treenodeExpander()).click();
		
		
		
		
		int allmasterContainerSize = findElements(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.CommonXpathForGridnodeformasterContainer()).size();
		System.out.println("All master container size is :"+allmasterContainerSize);
		
		for(int i=1; i<=allmasterContainerSize-1; i++)
		{
			findElements(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.CommonXpathForGridnodeformasterContainer()).get(i).click();
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.treenodeExpander()));
		findElement(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.treenodeExpander()).click();
		
		
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		for(int i=6; i<=allmasterContainerSize; i--)
		{
			
		findElements(ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater.CommonXpathForGridnodeformasterContainer()).get(i).click();
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		}
		*/
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
}	
