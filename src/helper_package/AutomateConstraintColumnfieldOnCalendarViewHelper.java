package helper_package;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AutomateConstraintColumnfieldOnCalendarViewLocater;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;
import pom_package.UpdateKanbanCardsDeatailLocator;

public class AutomateConstraintColumnfieldOnCalendarViewHelper extends CommonMethodsOfWebDriver{

	
	public static String kanbanBoardCurrentBrowserWindowHandleValue,getIframeSRCAttribute,textAreaIDAttribute,childIframevalue;
	public static int cardLimit;
	final int divisor = 5;
	
	public static String folderName;
	public static String projectName;
	public static String projectBoardName;
	public static  ArrayList<String>multipletabs;
	
	
 public void Open_KanbanBoard() throws InterruptedException
	{
		try {Thread.sleep(15000);}catch(InterruptedException ie) {}
		
		folderName=properties.getProperty("FolderName");
		System.out.println("Expanded folder name is :"+folderName);
		
		projectName=properties.getProperty("projectName");
		System.out.println("Expanded project name is :"+projectName);
				
				
		projectBoardName=properties.getProperty("projectBoardName");
		System.out.println("Expanded projectBoardName is :"+projectBoardName);
	
		explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedFolder()));
		findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedFolder()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.ClickoncreatedProject()));
		findElement(UpdateKanbanCardsDeatailLocator.ClickoncreatedProject()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.clickonProjectBoard()));
		findElement(UpdateKanbanCardsDeatailLocator.clickonProjectBoard()).click();
		
		explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedKanbanBoard()));
		findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedKanbanBoard()).click();
		
		
		
	
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		switchToiFrame("boardIfram");	
		
		
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()).click();
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
			
	
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
			
			driver.switchTo().window(winHandle);
			
			   explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());	
	 	}
		
		
		multipletabs=new ArrayList<>(driver.getWindowHandles());
		
	}
 
 
 
 public void EditPercentageColumn()
 {
	 try {Thread.sleep(4000);}catch(InterruptedException ie) {}
	 
    // explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPercentDoneColumn()));
	 
	 explicitWaitElementBy("elementToBeLocated", AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPercentDoneColumn());
     
     actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPercentDoneColumn())).build().perform();
	 
     
     for(int i=0;i<=50; i++)
     {
     
	 explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnUptrigger()));
	 findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnUptrigger()).click();
	 
     }
    
     /*
        try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     
        Robot robot = null;
		try {robot = new Robot();}catch (AWTException e){}
		robot.mouseMove(100,80);
		actions.click().build().perform();  */
     
     try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     
     explicitWaitElementToBeClickable(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPercentageColumn()));// this line for randomly clicking
     findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPercentageColumn()).click();
     
     try {Thread.sleep(1000);}catch(InterruptedException ie) {}
     
      explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.VerifyTopBarBlueLineOnCard()));
      String WidthofPercentage=findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.VerifyTopBarBlueLineOnCard()).getAttribute("style").substring(6, 12);//verify percentages on card 
     
      System.out.println("Total showing percentage on card is :"+WidthofPercentage);
     
     
     
 }
 
 public void EditDiscussColumn()
 {
	 try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	 
	 explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnDiscussColumn()));
	
	 actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnDiscussColumn())).build().perform();
	 
	 
	 
	 
	// explicitWaitVisibilityOf(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickingonDiscuss()));
	// findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.ClickingonDiscuss()).click();
		
	   explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.loadMaskCountForKanbanBoard());
	   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	   explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.inspectiframe());
		
	   getIframeSRCAttribute=findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectiframe()).getAttribute("src");
	   System.out.println("src :"+getIframeSRCAttribute);
		
	    // driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchTo());
	   //driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchTo());
	  //driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchToframe());
	 //driver.switchTo().frame(CreateCardsOnDifferentMasterContainersOnCVLocator.iFrameSrcValueAndSwitchToframe());
	   
	   driver.switchTo().frame(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.iFrameSrcValueAndSwitchToframe()));
		
		
		handleElementClickInterceptedExpectionWhileClickOnElement(KanbanBoardSettingLocators.clickOnPostLink());
	  
		explicitWaitElementToBeLocated(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility());
		boolean postWindowVisibility = findElement(AddKanbanCardRegressionOnCalendarViewLocater.afterClickOnPostLinkWindowsVisibility()).isDisplayed();
		System.out.println("Post window visibility :"+postWindowVisibility);
		
		
	  
	  if(postWindowVisibility==true)
	  {
		 explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe());
		 childIframevalue= findElement(AddKanbanCardRegressionOnCalendarViewLocater.inspectchildirframe()).getAttribute("class");
		 System.out.println("childIframe class attribute value :"+childIframevalue);
		 
		 driver.switchTo().frame(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.getChildiFrameClassAttributeValue()));
		 
		explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea());
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnchatterTextarea()).click();


		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean chatterArea = findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).isDisplayed();
		System.out.println("chatter area is visible :"+chatterArea);
		
		if(chatterArea==true)
		{
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.writeOnChatterTextArea()).sendKeys("Hello this is calendar view chatter for Constraint Column");
			
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			driver.switchTo().parentFrame();
			
			
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickOnshareButton()).click();
			
			
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementBy("elementToBeLocated",AddKanbanCardRegressionOnCalendarViewLocater.textDivArea());		
			textAreaIDAttribute = findElement(AddKanbanCardRegressionOnCalendarViewLocater.textDivArea()).getAttribute("id");
			System.out.println("Kanban Board Chatter text Area ID Attribute LINE 1356 :"+textAreaIDAttribute);
		
			try{Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementBy("elementToBeLocated", AutomateConstraintColumnfieldOnCalendarViewLocater.getTextFromChatterSubWindowforCard());	
		    String chatterText = findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.getTextFromChatterSubWindowforCard()).getText();
		    System.out.println("After Chatter get text from chatter sub window LINE 1360 :"+chatterText);
			
			driver.switchTo().defaultContent();
			
			try {Thread.sleep(1500);}catch(InterruptedException ie) {}
			explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup());
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.closeKanbanBoardChatterPopup()).click();	
			
			
		}
		  
		  
	  }
	  
	 try {Thread.sleep(1500);}catch(InterruptedException ie) {}
	 // explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldLocators.TextNumberShowingOrNotOnChatterTab()));
	 boolean TextNumberShowing=findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.TextNumberShowingOrNotOnChatterTab()).isDisplayed();
	 
	 System.out.println("TextNumberShowingOnChatterTab is :"+TextNumberShowing);
	 
	 
 }
 
   public void EditEndColumnDate()
   {
	   
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnEndDateColumn())).build().perform();
		
		explicitWaitElementToBeClickable(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnCalendar()));
		findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnCalendar()).click();
		
		try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		List<WebElement>d = findElements(AddKanbanCardRegressionOnCalendarViewLocater.getAlldatefromAstartDateCalendarPopup());
		 
		 
		 for(int i=1;i<d.size();i++) 
		 {
			 String s=d.get(i).getText();
			 if(s.equals("26"))
			 {
				 d.get(i).click();
			 }
		 }
		 
		 try{Thread.sleep(3000);}catch(InterruptedException ie) {}
	   
	   
	   explicitWaitElementToBeClickable(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingonEndText()));
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingonEndText()).click();
	   
	   
	 
   }
   
   public void EditfileColumn()
   {
	  
	   
	   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnfilesColumn())).build().perform();
		
		 try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		
	    boolean isSalesforcefileTabisVisible = findElement(AddKanbanCardRegressionOnCalendarViewLocater.salesforcefileuploadTab()).isDisplayed();
		System.out.println("isSalesforcefileTabisVisible :"+isSalesforcefileTabisVisible);
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		if(isSalesforcefileTabisVisible==true)
		{
			explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.salesforcefileuploadTab()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.salesforcefileuploadTab()).click();
			try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		}
		
		

		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));//filepath is a varible that contains system.getProperty(user.dir) and that means you can obtain the current working directory as a string and use it in your code as needed.
		fileInput.sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");

		
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		jsExecutorClickOnElement(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnUploadButton()));
		
		try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		
        explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardRegressionLocators.afterUploadButtonClick());
		
		try{Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonCrossPopUp()));
		findElement(AddKanbanCardRegressionOnCalendarViewLocater.ClickonCrossPopUp()).click();
	
		
   }
   
   public void EditIDcolumn()
   {
	   
	   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnIDcolumn())).build().perform();
	   
	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.IdInputfield()));
	   
	//   findElement(AutomateConstraintColumnfieldLocators.IdInputfield()).clear();
	 //  try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	//   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldLocators.IdInputfield()));
	//   findElement(AutomateConstraintColumnfieldLocators.IdInputfield()).sendKeys("1");
	   
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.IdInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.IdInputfield()).sendKeys("7");
	   
	   
	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	   explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
	   findElement(By.xpath("//body")).click();
	   
	 
	     
   }
   public void EditOnHoldCheckboxColumn()
   {
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnHoldColumn()));
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnHoldColumn()).click();
	   
	   try {Thread.sleep(1000);} catch (InterruptedException e) {}
	 
	//   boolean OnholdCheckbox=findElement(AutomateConstraintColumnfieldLocators.CheckingOnHoldCheckbox()).isSelected();
	 //  System.out.println("Currently OnHoldCheckBox is checked :"+OnholdCheckbox);
	   
	//   try {Thread.sleep(1000);} catch (InterruptedException e) {}
	   
	//   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldLocators.ClickingOnHoldColumn()));
	 //  findElement(AutomateConstraintColumnfieldLocators.ClickingOnHoldColumn()).click();
	   
	 //  boolean verfyOnholdCheckbox = findElement(AutomateConstraintColumnfieldLocators.CheckingOnHoldCheckbox()).isSelected();
	 //  System.out.println("Now OnHoldCheckbox is Unchecked "+verfyOnholdCheckbox);
	   
	 //  explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldLocators.ClickingOnHoldColumn()));
	  // findElement(AutomateConstraintColumnfieldLocators.ClickingOnHoldColumn()).click();
	   
	   // locate the checkbox element
	   
	   /*
	   // if we able direct find the xpath for single element then we can use isSelected method
	   
	   WebElement checkbox =findElement(AutomateConstraintColumnfieldLocators.CheckingOnHoldCheckbox());
	   
	   
	   if(checkbox.isSelected())
	   {
		   System.out.println("OnHold Checkbox is selected");
	   }
	   else
	   {
		   System.out.println("OnHold Checkbox is not selected");
	   }
	   
	   */
	   
	   
	  String checkbox =findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.CheckingOnHoldCheckbox()).getAttribute("class");
	   
	   //check if the checkbox is selected 
	   
	   if(checkbox.contains("checked"))
	   {
		   System.out.println("OnHold Checkbox is selected");
	   }
	   else
	   {
		   System.out.println("OnHold Checkbox is not selected");
	   }
	   
	   
	  
	      
   }
   
   public void OwnerColumn()
   {
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	 explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnOwnerColumn()));
	 findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnOwnerColumn()).click();
	
	 
	 try {Thread.sleep(1000);} catch (InterruptedException e) {}
	 
	 explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.SearchforOwner()));
	 findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.SearchforOwner()).sendKeys("Pratish Laad");
	 
	 explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnSearchTrigger()));
	 findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnSearchTrigger()).click();
	 
	 try {Thread.sleep(1000);} catch (InterruptedException e) {}
	 
	 String User =findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.SelectUser()).getText();
	 System.out.println("Selected UserName is :"+User);
	 
	 explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.SelectUser()));
	 findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.SelectUser()).click();
	 
   
   }
   
   public void clickingOnRiskColumn()
   {
	   
   		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		   
   		explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnRiskCheckboxColumn()));
	   	findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnRiskCheckboxColumn()).click();
		   
	   	String Checkboc = findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnRiskCheckboxColumn()).getAttribute("class");
		 
	   	if(Checkboc.contains("checked"))
		 {
			 System.out.println("Risk column checkbox is selected");
		 }
		 else
		 {
		 System.out.println("Risk column checkbox is not selected");
		 }	
																							   
 
   }
   
   public void ClickOnStartDateColumn()
   {
	   
	   try {Thread.sleep(1000);} catch (InterruptedException e) {}
	   
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnStartDateColumn())).build().perform();
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnCalendar()));
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnCalendar()).click();
	   
	  
	   List<WebElement>alldates= findElements(AddKanbanCardRegressionOnCalendarViewLocater.getAlldatefromAstartDateCalendarPopup());
	   
	  // for(int i=0; i<=alldates.size(); i++)
	   //for(int i=0; i<=alldates.size()-1; i++)
	  // for(int i=0; i<alldates.size(); i++)
	   
	   for(int i=0; i<alldates.size(); i++)
	   {
		   String dates =alldates.get(i).getText();//The IndexOutOfBoundsException you're encountering indicates that you are trying to access an element in the alldates list at an index that is out of bounds. In Java, list indices are zero-based, meaning the valid indices for a list with a size of n are from 0 to n-1.
		   
		   if(dates.equals("22"))
		   {
			   alldates.get(i).click();
		   }
		   
		   
		   explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		   findElement(By.xpath("//body")).click(); 
		   
	   }
	      
	   
   }
   
   
   public void ClickingOnStickersColumn()
   {
	   
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnStickersColumn()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnStickersColumn())).build().perform();
	   
	   try {Thread.sleep(1000);} catch (InterruptedException e) {}
	   
	// explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldLocators.Allstickersxpath()));
	// driver.switchTo().window(multipleTabsOpen.get(1));
	   
	   int stickersSize=findElements(AutomateConstraintColumnfieldOnCalendarViewLocater.Allstickersxpath()).size();
	   
	   System.out.println("Total stickers are avalable are :"+stickersSize);
	   findElements(AutomateConstraintColumnfieldOnCalendarViewLocater.Allstickersxpath()).get(stickersSize-4).click();//if there are four stickers indexing start 0 from last element select 1 for fourth element and select four element for selecting the first element
	   
	   try {Thread.sleep(1000);} catch (InterruptedException e) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.CancelButton()));
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.CancelButton()).click();
	   
	   
	   try {Thread.sleep(1000);} catch (InterruptedException e) {}
	   
       explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnStickersColumn()));
       
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnStickersColumn())).build().perform();
	   
	   
       int stickersSize1=findElements(AutomateConstraintColumnfieldOnCalendarViewLocater.Allstickersxpath()).size();
	   
	   System.out.println("Total stickers are avalable are :"+stickersSize1);
	   findElements(AutomateConstraintColumnfieldOnCalendarViewLocater.Allstickersxpath()).get(stickersSize1-4).click();
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.SaveButton()));
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.SaveButton()).click();
	   
	 
	   /*
	   
	   driver.switchTo().window(multipletabs.get(0));
	   
	   try {Thread.sleep(5000);} catch (InterruptedException e) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldLocators.StickersOnKbCard()));
	   
	   boolean stickers = findElement(AutomateConstraintColumnfieldLocators.StickersOnKbCard()).isDisplayed();
	   System.out.println("Stickers are avaible on card :"+stickers);
	   try {Thread.sleep(5000);} catch (InterruptedException e) {}
	   
	   driver.switchTo().window(multipletabs.get(1));*/
	   
	    
	 
   }
   
   public void DependancyStartTostart()
   {
	   //we making the dependancy from predecessor column
	   
       explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn())).build().perform();
	   
	   try {Thread.sleep(4000);} catch (InterruptedException e) {}
	   
	   //explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldLocators.PredecessorColumnInputfield()));
	   
	  // findElement(AutomateConstraintColumnfieldLocators.PredecessorColumnInputfield()).clear();
	   
	 //  findElement(AutomateConstraintColumnfieldLocators.PredecessorColumnInputfield()).sendKeys("6ss");
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("6ss");
	   
	
       try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	  // explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
	 //  findElement(By.xpath("//body")).click();
       
       explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()));
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()).click();
	     
   }
   
   public void DependancyfromStartTofinish()
   {   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn())).build().perform();
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("6sf");


	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()));
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()).click();
	   
	   
	   
   }
   
   public void DependancyfinishTofinish()
   {
	   
	   
       try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn())).build().perform();
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("6ff");


	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()));
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()).click();
	   
	   
   }
   
   public void DependancyfinishTostart()//finish to start Type of dependency fs will not showing 
   {
	   
       try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn())).build().perform();
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("6fs");


	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()));
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickOnPredecessorText()).click();
       
       //following cod for remove the predecessor from first card
       
  try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumn())).build().perform();
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).clear();
	   
	   
	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
		   explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		   findElement(By.xpath("//body")).click();
	   
	   
 
   }
   public void DependancySSfromCardTwo()
   {
	   
	   //above code for clear the predecessor first column field
		   
		   //following code for changing the dependancy type from second card
		   
		   
		   try{Thread.sleep(2000);}catch(InterruptedException ie) {}
		   
		   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard()));
		   
		   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard())).build().perform();
		   
		   try {Thread.sleep(2000);} catch (InterruptedException e) {}
		   
	       findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
		   
		   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("5ss");
		   
		   
		   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
		   
	       explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		   findElement(By.xpath("//body")).click();
		   
		   	   
	   
   }
   
   public void DependancySffromCardTwo()
   {
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard())).build().perform();
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("5sf");
	   
	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
       explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
	   findElement(By.xpath("//body")).click();
	   
	   
	   
   }
   
   public void DependancyFFfromCardTwo()
   {
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	   explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard()));
	   
	   actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard())).build().perform();
	   
	   try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	 
	   findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	   
      findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("5ff");
	   
	   try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	   
	   explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
	   findElement(By.xpath("//body")).click();
	   
	   
   }
   
   public void DependancyFSfromCardTwo()
   {
	    try {Thread.sleep(2000);} catch (InterruptedException e) {}
	   
	    explicitWaitVisibilityOf(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard()));
	    
	    actions.doubleClick(findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.ClickingOnPredecessorColumnFromSecondCard())).build().perform();
	  
	    try {Thread.sleep(2000);} catch (InterruptedException e) {}
	  
	    findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys(Keys.CONTROL+"a"+Keys.chord(Keys.DELETE));
	    
	    findElement(AutomateConstraintColumnfieldOnCalendarViewLocater.PredecessorColumnInputfield()).sendKeys("5fs");
	  
	    try{Thread.sleep(1000);}catch(InterruptedException ie) {}
	    
	    explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
	   findElement(By.xpath("//Body")).click();
	  
	   
   }
   
      
}
