package helper_package;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddMilestoneOnMasterContainerInCVLocator;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;
import pom_package.ToCheckingHeaderButtonsOnCalendarViewLocator;

public class AddMilestoneOnMasterContainerInCVHelper extends CommonMethodsOfWebDriver 
{

	public static String getIframeSRCAttribute,childIframevalue,textAreaIDAttribute,classAttributeValueOfQuickActionSideColumn;
	
	public void Create_milestoneOnCv()
	{

	try {Thread.sleep(5000);}catch(InterruptedException ie) {}
	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()));
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()).click();
	try {Thread.sleep(10000);}catch(InterruptedException ie) {}
	
	
	
	
	for(String winHandle : driver.getWindowHandles())
	{
		System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
		//try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		driver.switchTo().window(winHandle);
 	}
	
	
	Actions action=new Actions(driver);


    explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());		
   
   try {Thread.sleep(7000);}catch(InterruptedException ie) {}
	

	
    explicitWaitVisibilityOf(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer()));
	action.moveToElement(findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.InprogressMasterContainer())).contextClick().build().perform();
	
	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	
	 explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_Addmilestone()));
	 findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_Addmilestone()).click();
	 
	 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	 
	
	 
	 findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("Marketing Department");
		
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()).click();
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectfinancecategory()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectfinancecategory()).click();
		
		
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
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()).click();
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionformileststone()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionformileststone()).sendKeys("This is Marketing department Description for milestone");
		
		
		for(int i=0;i<=5;i++)
		{
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()).click();
		}
		
		
		//getCardDuedate =findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.fetchingDuedate()).getText();
		
		//System.out.println("getCardDue Date While Creating Card :"+getCardDuedate);
		
		
		
		
		explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_StartDateCalendar()));
		findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_StartDateCalendar()).click();
		
		
		 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		 
		 List<WebElement>AlldaysOncalendar = findElements(AddKanbanCardRegressionOnCalendarViewLocater.getAlldatefromAstartDateCalendarPopup());
		 
		 
		 for(int i=1;i<AlldaysOncalendar.size();i++) 
		 {
			 String namesofalldaysOncalendar=AlldaysOncalendar.get(i).getText();
			 if(namesofalldaysOncalendar.equals("20"))
			 {
				 AlldaysOncalendar.get(i).click();
			 }
		 }
		 
		 try{Thread.sleep(3000);}catch(InterruptedException ie) {}
		 	 
		 
    explicitWaitElementToBeClickable(findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOnONHOLDCheckbox()));
    findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOnONHOLDCheckbox()).click();
		
    try{Thread.sleep(1000);}catch(InterruptedException ie) {}
    
    explicitWaitElementToBeClickable(findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOnONHOLDCheckbox()));
    findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOnONHOLDCheckbox()).click();
		
		
	explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
    findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
    
    
    explicitWaitElementBy("invisibilityOfElementLocated", AddMilestoneOnMasterContainerInCVLocator.milestoneSaveLoadmask());
    
	//click on the zoom to fit button
	
    try{Thread.sleep(2000);}catch(InterruptedException ie) {}
	//explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()));
    explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton());
	findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()).click();
	
	try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	
	}
	
	public void update_milestoneOnCv()
	{
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone()));
		//findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone()).click();
		handleElementClickInterceptedExpectionWhileClickOnElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone());
		
		
	    actions.moveToElement(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone())).contextClick().build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.Clickon_Editmilestone()));
		findElement(AddMilestoneOnMasterContainerInCVLocator.Clickon_Editmilestone()).click();
		
		
		
		
		
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterCardTitle()).sendKeys("This is UpdatedTitle for milestone");
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnCategoryDownArrow()).click();
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectHrCategory()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.selectHrCategory()).click();
			
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnPriorityDownArrow()).click();
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickonLowpriority()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickonLowpriority()).click();
			
			
		    explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.AssignOwnerDropdownArrow()).click();
			
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchUserInputfield()).sendKeys("Pratish Laad");
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchIconGlass()));
		    findElement(AddKanbanCardRegressionOnCalendarViewLocater.SearchIconGlass()).click();
			
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectUser()).click();
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionformileststone()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterDescriptionformileststone()).sendKeys("This is updated Description for milestone");
			
			
			for(int i=0;i<=5;i++)
			{
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.percentcompleteArrow()).click();
			}
			
			
			//getCardDuedate =findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.fetchingDuedate()).getText();
			
			//System.out.println("getCardDue Date While Creating Card :"+getCardDuedate);
			
			
			
			
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_StartDateCalendar()));
			findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_StartDateCalendar()).click();
			
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			 
			 List<WebElement>AlldaysOncalendar = findElements(AddKanbanCardRegressionOnCalendarViewLocater.getAlldatefromAstartDateCalendarPopup());
			 
			 
			 for(int i=1;i<AlldaysOncalendar.size();i++) 
			 {
				 String namesofalldaysOncalendar=AlldaysOncalendar.get(i).getText();
				 if(namesofalldaysOncalendar.equals("6"))
				 {
					 AlldaysOncalendar.get(i).click();
				 }
			 }
			 
			 try{Thread.sleep(3000);}catch(InterruptedException ie) {}
			 
		//explicitWaitElementToBeClickable(findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOnAtRiskCheckbox()));
		//findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOnAtRiskCheckbox()).click();
		
		
			 
			 // following code for clickking the checkboxes at bottom
			
			 /*
			 for(int i=2; i<=3;i++)
			 {
				if(i!=2) {
					
					findElement(By.xpath("//span[text()='At Risk:']/ancestor::label/parent::div/parent::div/div["+i+"]")).click();
				}
				 
			 }
			 
			 
			 try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			 
			 
			 for(int i=3;i>=2;i--)
				 
			 {
				 //if (i!=2) {
					
					 findElement(By.xpath("//span[text()='At Risk:']/ancestor::label/parent::div/parent::div/div["+i+"]")).click();
				//}
				
			 }
			 
			 */
			 
		explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()));
	    findElement(AddKanbanCardRegressionOnCalendarViewLocater.SaveCard()).click();
	 
	    try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
			
		
	}
	public void ClickOnDiscuss_OnMilestone()
	{
		
		 try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		 
			
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone()));
			
			handleElementClickInterceptedExpectionWhileClickOnElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone());
			
			
		    actions.moveToElement(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone())).contextClick().build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 
		 explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.clickOn_DiscussOnMilestone()));
		 findElement(AddMilestoneOnMasterContainerInCVLocator.clickOn_DiscussOnMilestone()).click();
		 
		 
		
		 explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
			
		   explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.inspectiframe());
			
		   getIframeSRCAttribute=findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectiframe()).getAttribute("src");
		   System.out.println("src :"+getIframeSRCAttribute);
		
		   driver.switchTo().frame(findElement(AddMilestoneOnMasterContainerInCVLocator.iFrameSrcValueAndSwitchToframe()));
			
		handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardSettingLocators.clickOnPostLink());
	  
		explicitWaitElementToBeLocated(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window visibility :"+postWindowVisibility);
	  
	  if(postWindowVisibility==true)
	  {
		  explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe());
		 childIframevalue= findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe()).getAttribute("class");
		 System.out.println("childIframe class attribute value :"+childIframevalue);
		 
		 driver.switchTo().frame(findElement(AddMilestoneOnMasterContainerInCVLocator.getChildiFrameClassAttributeValue()));
		 
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea());
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea()).click();


		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean chatterArea = findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).isDisplayed();
		System.out.println("chatter area is visible :"+chatterArea);
		
		if(chatterArea==true)
		{
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).sendKeys("Hello this is milestone chatter on Calendar View ");
			
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().parentFrame();
			
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()).click();
			
			
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated",AddMilestoneOnMasterContainerInCVLocator.textDivArea());		
			textAreaIDAttribute = findElement(AddMilestoneOnMasterContainerInCVLocator.textDivArea()).getAttribute("id");
			System.out.println("Kanban Board Chatter text Area ID Attribute LINE 1356 :"+textAreaIDAttribute);
		
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitElementBy("elementToBeLocated", AddMilestoneOnMasterContainerInCVLocator.getTextFromChatterSubWindow());	
		    String chatterText = findElement(AddMilestoneOnMasterContainerInCVLocator.getTextFromChatterSubWindow()).getText();
		    System.out.println("After Chatter get text from chatter sub window LINE 1360 :"+chatterText);
			
			driver.switchTo().defaultContent();
			
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup());
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup()).click();	
			
			
		}
		  
		  
	  }
	}
	  
	  public void ClickOn_ClonemilestoneByStartDate()
	  {
		  try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		  
		  
		    explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());	
			
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone()));
		    //handleElementClickInterceptedExpectionWhileClickOnElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone());
			
			
		    actions.moveToElement(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone())).contextClick().build().perform();
			

			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.clickOnCloneMilestone()));
			findElement(AddMilestoneOnMasterContainerInCVLocator.clickOnCloneMilestone()).click();
		  
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonStartDate()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonStartDate()).click();
			
		       //  String pickstartdatefromcalendarpopup=findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.picksatrtdatefromCalendarpopup()).getText();
		      //  System.out.println("startdate from calendarpopup is : "+pickstartdatefromcalendarpopup);
		     // int getAlldateElementLength =findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.getAlldatefromAstartDateCalendarPopup()).size();
		    // System.out.println("All date element length on clonestartdate popup :"+getAlldateElementLength);
			
			 
			
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
				String picksatrtdatefromCalendarpopup = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getText();
				
				System.out.println("picksatrtdatefromCalendarpopup LINE 1114 :"+picksatrtdatefromCalendarpopup+" is selected date currently.");
					
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
				String picksatrtdatefromCalendarpopupAttributeValue = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getAttribute("class");
				System.out.println("getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar LINE 1118 under Quick action Due Date calendar :"+picksatrtdatefromCalendarpopupAttributeValue);
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementBy("elementToBeLocated", AddMilestoneOnMasterContainerInCVLocator.getAllRowElementsOfSelectDateCLoneCalendarformilestone());
				int getSizeOfAllRowElementsOfSelectDate = findElements(AddMilestoneOnMasterContainerInCVLocator.getAllRowElementsOfSelectDateCLoneCalendarformilestone()).size();
				System.out.println("getSizeOfAllRowElementsOfSelectDate LINE 1122 under Quick action Due Date calendar :"+getSizeOfAllRowElementsOfSelectDate);
				
				for(int i=1; i<=getSizeOfAllRowElementsOfSelectDate; i++)
				{                                                                   
					String classAttributeValueOfTdElement = findElement(By.xpath("//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td["+i+"]")).getAttribute("class");
					System.out.println("classAttributeValueOfTdElement LINE 1127 after "+i+" iteration :"+classAttributeValueOfTdElement);//all 7 elements in row printing and taking the class attribute of them for every iteration and check it with pickstartdate which is today selected date 
					
					if(picksatrtdatefromCalendarpopupAttributeValue.contains(classAttributeValueOfTdElement) && i<=4)
					{
						
						try {Thread.sleep(2000);}catch(InterruptedException ie){}
						//findElement(By.xpath("//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td["+(i+2)+"]")).click();
						findElement(By.xpath("//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td["+(i+2)+"]")).click();
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						
						break;
					}
					
					else if(picksatrtdatefromCalendarpopupAttributeValue.contains(classAttributeValueOfTdElement) && i>=5)//if date is not disable then take 
					{
						try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.SelectDateFromCalendarCloneOnNextRowformilestone());
						findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectDateFromCalendarCloneOnNextRowformilestone()).click();
						
						break;
					}
				}
				
				
	
				 try{Thread.sleep(5000);}catch(InterruptedException ie) {}
				 
				 explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()));
				 findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()).click();
			
	
			/*
			 
			 List<WebElement>d = findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.getAlldatefromAstartDateCalendarPopup());
			 
			 System.out.println("All dates From a statrt Date CalendarPopup :"+d);
			 
			 for(int i=1;i<d.size();i++) 
			 {
				 String s=d.get(i).getText();
				 
				 if(s.equals("20"))
					 
					 try {Thread.sleep(5000);} catch(InterruptedException ie) {} 
					 
				 {
					if (d.get(i).isEnabled()) 
					{
				  d.get(i).click();
					} 
					 
					 
				 }
			 }
			 
			 	}*/
			 
			 
			 
		  
		  
		 	  
	  }
	  
	  
	  
	  
	  public void Clone_milestoneByDueDate()
	  {
		  
		  
            try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		  
		    explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());	
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone()));
			//handleElementClickInterceptedExpectionWhileClickOnElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone());
			
			
		    actions.moveToElement(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone())).contextClick().build().perform();
			

			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.clickOnCloneMilestone()));
			findElement(AddMilestoneOnMasterContainerInCVLocator.clickOnCloneMilestone()).click();
		  
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonDueDate()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonDueDate()).click();
			
		  //  String pickstartdatefromcalendarpopup=findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.picksatrtdatefromCalendarpopup()).getText();
		  //  System.out.println("startdate from calendarpopup is : "+pickstartdatefromcalendarpopup);
			 
		    // int getAlldateElementLength =findElements(CreateCardsOnDifferentMasterContainersOnCVLocator.getAlldatefromAstartDateCalendarPopup()).size();
			// System.out.println("All date element length on clonestartdate popup :"+getAlldateElementLength);
			
			 
			
				
			
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
				String picksatrtdatefromCalendarpopup = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getText();
				
				System.out.println("picksatrtdatefromCalendarpopup LINE 1114 :"+picksatrtdatefromCalendarpopup+" is selected date currently.");
					
				explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup());
				String picksatrtdatefromCalendarpopupAttributeValue = findElement(AddKanbanCardRegressionOnCalendarViewLocater.picksatrtdatefromCalendarpopup()).getAttribute("class");
				System.out.println("getSelectedDateClassAttributeValueFromQuickActionDueDateCalendar LINE 1118 under Quick action Due Date calendar :"+picksatrtdatefromCalendarpopupAttributeValue);
				
				explicitWaitElementBy("elementToBeLocated", AddMilestoneOnMasterContainerInCVLocator.getAllRowElementsOfSelectDateCLoneCalendarformilestone());
				int getSizeOfAllRowElementsOfSelectDate = findElements(AddMilestoneOnMasterContainerInCVLocator.getAllRowElementsOfSelectDateCLoneCalendarformilestone()).size();
						
				System.out.println("getSizeOfAllRowElementsOfSelectDate LINE 1122 under Quick action Due Date calendar :"+getSizeOfAllRowElementsOfSelectDate);
				
				for(int i=1; i<=getSizeOfAllRowElementsOfSelectDate; i++)
				{                                                                   
					String classAttributeValueOfTdElement = findElement(By.xpath("//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td["+i+"]")).getAttribute("class");
					
					////table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td["+i+"]
					System.out.println("classAttributeValueOfTdElement LINE 1127 after "+i+" iteration :"+classAttributeValueOfTdElement);
					
					if(picksatrtdatefromCalendarpopupAttributeValue.contains(classAttributeValueOfTdElement) && i<=4)
					{
						
						try {Thread.sleep(1000);}catch(InterruptedException ie){}
						findElement(By.xpath("//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td["+(i+2)+"]")).click();
						//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
						
						break;
					}
					else if(picksatrtdatefromCalendarpopupAttributeValue.contains(classAttributeValueOfTdElement) && i>=5)
					{
						try {Thread.sleep(1500);}catch(InterruptedException ie) {}
						explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.SelectDateFromCalendarCloneOnNextRowformilestone());
						findElement(AddKanbanCardRegressionOnCalendarViewLocater.SelectDateFromCalendarCloneOnNextRowformilestone()).click();
						try {Thread.sleep(2000);}catch(InterruptedException ie) {}
						break;
					}
				}
				
				
			
				 try{Thread.sleep(5000);}catch(InterruptedException ie) {}
				 
				 explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()));
				 findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCloneButton()).click();
				 
				 
				 try{Thread.sleep(2000);}catch(InterruptedException ie) {}
					//explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()));
				    explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton());
					findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnZoomtoFitButton()).click();
			 
		  
	  }
	  
	  
	 
	  
	  public void ClickOn_QuickActionOnMilestone()
	  {
		  try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		  
		  
		  
		    //  explicitWaitElementBy("invisibilityOfElementLocated", CreateCardsOnDifferentMasterContainersOnCVLocator.loadmaskloadingafteropening());	
			
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone()));
			//handleElementClickInterceptedExpectionWhileClickOnElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone());
			
			
		    actions.moveToElement(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnMilestone())).contextClick().build().perform();
				  
			
				explicitWaitElementBy("elementToBeLocated", AddMilestoneOnMasterContainerInCVLocator.CheckCondition_QuickActionOnmilestone());		
				classAttributeValueOfQuickActionSideColumn = findElement(AddMilestoneOnMasterContainerInCVLocator.CheckCondition_QuickActionOnmilestone()).getAttribute("class");
				System.out.println("Class attribute value of quick action side column LINE 1043 :"+classAttributeValueOfQuickActionSideColumn);
				
				
				//Class attribute is aParent means Quick Action icon is visible and click on it
				if(classAttributeValueOfQuickActionSideColumn.equals("x-menu-item-text"))		//Class attribute is aParent means Quick Action icon is visible and click on it
				{
					System.out.println("Quick Action button is active and perform change date operation.");
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
					actions.moveToElement(findElement(AddMilestoneOnMasterContainerInCVLocator.CheckCondition_QuickActionOnmilestone())).build().perform();
					
					
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
	  
	  
	  public void Delete_milestoneOnCv()
	  {
		  
		  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		  
		  driver.navigate().refresh();
		  
		  try{Thread.sleep(6000);}catch(InterruptedException ie) {}
		  
		  explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnSecondMilestone()));
		  handleElementClickInterceptedExpectionWhileClickOnElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnSecondMilestone());
		  
		  actions.moveToElement(findElement(AddMilestoneOnMasterContainerInCVLocator.RightClick_OnSecondMilestone())).contextClick().build().perform();
		  
		  
		    try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_Delete()));
			findElement(AddMilestoneOnMasterContainerInCVLocator.ClickOn_Delete()).click();
		  
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//explicitWaitVisibilityOf(findElement(AddMilestoneOnMasterContainerInCVLocator.clickonDeleteOptionPopup()));
			//findElement(AddMilestoneOnMasterContainerInCVLocator.clickonDeleteOptionPopup()).click();
		  
			handleElementClickInterceptedExpectionWhileClickOnElement(AddMilestoneOnMasterContainerInCVLocator.clickonDeleteOptionPopup());
		  
		  
	  }	  
		  
  }
	  
	  
	  
	  
	  
	
		

