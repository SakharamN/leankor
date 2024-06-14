package helper_package;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;
import pom_package.CreateMultipleKanbancardswithTasksStickersFilesLocators;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.ToAddingConstraintsColumnInCVLocators;
import pom_package.ToCheckingHeaderButtonsOnCalendarViewLocator;
import pom_package.ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater;

public class ToAddingConstraintsColumnInCVHelper extends CommonMethodsOfWebDriver{

	public static String createFolderNameRandomly;
	public static String createProjectNameRandomly;
	public static String folderName;
	public static String projectName;
	public static String projectBoardName;
	public static int initialSliderPosition;

	 public void create_KanbanBoard() throws InterruptedException
		{
			try {Thread.sleep(6000);}catch(InterruptedException ie) {}
			
				
			
			    //ArrayList<String>multipleTabsOpen =new ArrayList<>(driver.getWindowHandles());
			
			
			  // Wait for element to be visible
		
			
			
			
		 wait=new org.openqa.selenium.support.ui.WebDriverWait(driver, Duration.ofSeconds(120));
			
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("addicon")));
			
		 element.click();	
		 
		 // explicitWaitElementToBeClickable(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.clickOnFolderIcon()));
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
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.clickOnThreeDots()));
			findElement(ToAddingConstraintsColumnInCVLocators.clickOnThreeDots()).click();
			
			createProjectNameRandomly = generateRandomString(5);
			System.out.println("Project Name with random method in CreateKanbanCardsOnDifferentMasterContainersHelper class :: Line 51 ::"+createProjectNameRandomly);
			
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnAddProject()).click();
			
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.enterProjectName()).sendKeys(createProjectNameRandomly);
			
			explicitWaitElementToBeClickable(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()));
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnProjectAddButton()).click();
			
			try {Thread.sleep(5000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.clickOnCreatedProject()));
			findElement(ToAddingConstraintsColumnInCVLocators.clickOnCreatedProject()).click();
			
			
			
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
			
			
			

			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			
		//	explicitWaitVisibilityOf(findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()));
			explicitWaitElementBy("elementToBeLocated", AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon());
			findElement(AddKanbanCardRegressionOnCalendarViewLocater.clickOnCalenderViewIcon()).click();
			try {Thread.sleep(10000);}catch(InterruptedException ie) {}
				
		
			for(String winHandle : driver.getWindowHandles())
			{
				System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
				
				   //try {Thread.sleep(3000);}catch(InterruptedException ie) {}
				   driver.switchTo().window(winHandle);
				
				   explicitWaitElementBy("invisibilityOfElementLocated", AddKanbanCardRegressionOnCalendarViewLocater.loadmaskloadingafteropening());	
		 	}
			
			
		   
  }
	        
			public void AddcardDetailsColumn()
			{
				try {Thread.sleep(6000);}catch(InterruptedException ie) {}
				
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.MoveOnCardDetailsfirstcolumns())).build().perform();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailtrigger()));
				findElement(ToAddingConstraintsColumnInCVLocators.CardDetailtrigger()).click();
				
	
			
		
			    List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
			
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
			   //     Loop through each constraint column and get its name
		      //      for (WebElement column : AllConstraintcolumn) {
		      //      String columnName = column.getText();
		      //      System.out.println("Constraint column name: " + columnName);
		      //  }

				
				
		        
		        
		    	for(int i=0; i<=AllConstraintcolumn.size()-1; i++)
				{	
					String ColumnsNames =AllConstraintcolumn.get(i).getText();
					System.out.println("\nConstraint column names "+(i+1)+ ":"+ColumnsNames);
		        
		        
				}
		        
				
		
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			int incrementor = 0;
			
			for(int i=1; i<=AllConstraintcolumn.size()-1; i++)
			{	
				
				
				
			
				if(i>1)
				{
					
				try {Thread.sleep(4000);}catch(InterruptedException ie) {}
				
                actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				}
				
				String incrementID = findElement(By.xpath("//div[contains(@style,'left: 0px; top: "+incrementor+"px; margin: 0px; width: 137px;') and contains(@class,'x-menu-item x-menu-item-default x-box-item')]")).getAttribute("id");
				System.out.println(i+" index id attribute value :"+incrementID);

				
				
				findElement(By.id(incrementID)).click();
				
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
			
					incrementor = incrementor + 24;
				
					System.out.println("increment value :"+incrementor);
					
			
				
			}			
	
	}
		
			/*
			
			public void AddConstraintColumn2()
			{
				
				try {Thread.sleep(5000);}catch(InterruptedException ie) {}
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.MoveOnCardDetailsfirstcolumns())).build().perform();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailtrigger()));
				findElement(ToAddingConstraintsColumnInCVLocators.CardDetailtrigger()).click();
				
				
			 int SizeOfAllPopUpElements =findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn()).size();
			 
			 System.out.println("All elements size on popup is :"+SizeOfAllPopUpElements);
			 
			 try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
   	 
		     findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn()).get(SizeOfAllPopUpElements-23).click();
			 
		   
		     
			 // for second element
		     
			}
			 
			 */
			
		     
		     public void AddingPercentageColumn()
		     {
		    	 try {Thread.sleep(6000);}catch(InterruptedException ie) {}

		            //following code for splitter bar 
		    	 
		    	 initialSliderPosition = findElement(ToAddingConstraintsColumnInCVLocators.splitterBarOnCalendarView()).getLocation().getX();
		    	 System.out.println("Initial Slider position :"+initialSliderPosition);
		    	 
		    	 int maxSliderPosition =1600;
		    	 
		    	 explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.splitterBarOnCalendarView());
		    	 
		    	 
		    	 
		    	   actions.dragAndDropBy(findElement(ToAddingConstraintsColumnInCVLocators.splitterBarOnCalendarView()), maxSliderPosition, 0);
		    	 
		    	 
		    		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					
		            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.MoveOnCardDetailsfirstcolumns())).build().perform();
					
		            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					
					explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailtrigger()));
					findElement(ToAddingConstraintsColumnInCVLocators.CardDetailtrigger()).click();
					
					
				
				    List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
					
					System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
					
					
					for(int i=1; i<AllConstraintcolumn.size(); i++)
					{
						
						String names = AllConstraintcolumn.get(i).getText();
						System.out.println(" All constraints columns are avilable on popupss :"+names);
						
						if (names.equals("% Done")) {
					       
					        
						AllConstraintcolumn.get(i).click();		 
			     
					   }
						
		            }         
					
         }		           
		
		     
		 public void AddingAssignedResourcesColumn()
		 {
			 
			    explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
            
	            
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
			 System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Assigned Resources")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			 
		 }
		     
		     
		     
		 public void AddingCategoryColumn()
		 {
			 
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Category")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			 	 
		 }
		 
		 
		 public void AddingConstraintsColumn()
		 {
			 
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					  String names = AllConstraintcolumn.get(i).getText();
					 //System.out.println("All category names are :"+names);
					
					    if (names.equals("Constraints")) {
					    	
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			 
			 
		 }
		 
	
		 
		public void  AddingDiscussColumn()
		 {
			 
			    explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Discuss")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }          
			 
		 }
		 
		 
		 
		
		public void AddingEarlyEndColumn()
		{
			
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Early End")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         	
		}
		 
		
		
		public void AddingEarlyStart()
		{
		
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Early Start")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
		
		public void AddingEndColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("End")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
		
		public void AddingfilesColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Files")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
	
		
		public void AddingIDColumn()
		{
			
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Id")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
		
		public void AddingLateEndColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Late End")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
		
		public void AddingLateStartColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Late Start")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
		
		public void AddingOnHoldColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("On Hold")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
		}
		
		
		
		public void AddingOwnerColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					//System.out.println("All category names are :"+names);
					
					if (names.equals("Owner")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
		}
		
		
		
		
		public void AddingPredecessorColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					
					
					if (names.equals("Predecessors")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
		public void AddingPriorityColumn()
		{
			
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					
					
					if (names.equals("Priority")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
		}
		
		
	    public void AddingRiskColumn()
	    {
	    	  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					
					
					if (names.equals("Risk")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
	    	
	    }
	    
	    
	    public void AddingSequenceColumn()
	    {
	    	
	    	  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					
					
					if (names.equals("Sequence")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
	    }
	    
	    
	    public void AddingStartColumn()
	    {
	    	  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					
					
					if (names.equals("Start")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
	    }
	    
	    
		public void AddingStickersColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
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
			
		}
	    
		
		public void AddingSuccessorsColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
	            try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					
					
					if (names.equals("Successors")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
			
		}
		
		
		public void AddingTimetoLaunchColumn()
		{
			
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.CardDetailfirstElement())).build().perform();
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()));
				findElement(ToAddingConstraintsColumnInCVLocators.firsttriggerElement()).click();
				
				
			
			 List<WebElement>AllConstraintcolumn= findElements(ToAddingConstraintsColumnInCVLocators.AllpopupElementSizeOfconstarintcolumn());
				
				System.out.println("Total number of constraints columns are :"+AllConstraintcolumn.size());
				
				
				for(int i=0; i<AllConstraintcolumn.size(); i++)
				{
					String names = AllConstraintcolumn.get(i).getText();
					
					
					if (names.equals("Time To Launch")) {
				       
				        
						AllConstraintcolumn.get(i).click();		
		     
				   }
					
	            }         
		}
		
		
		
		
		
		
		
		
		// Now Following Script for Removing the Constraint Column 
		
		
		
		
		public void removePercentageConstraintColumn()
		{
			    try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			    
			    explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingPercentageconstraintColumn());
				
	            actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingPercentageconstraintColumn())).build().perform();
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingPercentageconstraintColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingPercentageconstraintColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
		}
		
		
		public void  removeAssignresourceConstraintColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingAssignresourceColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingAssignresourceColumn())).build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingAssignresourceColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingAssignresourceColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}	
		
		
		public void  removeCategoryColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingCategoryColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingCategoryColumn())).build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingCategoryColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingCategoryColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}	
		
		public void removeConstraintColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingConstraintColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingConstraintColumn())).build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingConstraintColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingConstraintColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}	
		
		public void removeDiscussColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingDiscussColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingDiscussColumn())).build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingDiscussColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingDiscussColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}
		
		public void removeEarlyEndColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingEarlyEndColumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingEarlyEndColumn())).build().perform();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingEarlyEndColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingEarlyEndColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
				
		}
		
		public void removeEarlyStartColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingEarlyStartColumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingEarlyStartColumn())).build().perform();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingEarlyStartColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingEarlyStartColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
				
		}
		
		public void removeEndColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingEndColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingEndColumn())).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingEndColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingEndColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}
		
		public void removeFilesColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingFilesColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingFilesColumn())).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingFilesColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingFilesColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		}
		
	   public void removeIDcolumn()
	   {
		   explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingIDcolumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingIDcolumn())).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingIdcolumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingIdcolumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		   
	   }
		
		public void removeLateEndcolumn()
		{

			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingLateEndcolumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingLateEndcolumn())).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingLateEndColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingLateEndColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			   
		}
		
		
		public void removeLateStartcolumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removinglatestartcolumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removinglatestartcolumn())).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingLatestartcolumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingLatestartcolumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}
		
		public void removeOnHoldColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingOnHoldcolumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingOnHoldcolumn())).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingOnHoldColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingOnHoldColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}
		
		public void removeOwnerColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingOwnerColumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingOwnerColumn())).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingOwnerColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingOwnerColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
					
		
		}
		
		public void removePredecessorColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingpredecessorColumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingpredecessorColumn())).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingpredecessorColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingpredecessorColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		}
		
		
		public void removePriorityColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingPriorityColumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingPriorityColumn())).build().perform();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingPriorityColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingPriorityColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
				
				
		}
		
		
		public void removeRiskColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removingRiskColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removingRiskColumn())).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingRiskColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremovingRiskColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}

		public void removeSequenceColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removeSequenceColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removeSequenceColumn())).build().perform();
			
			try {Thread.sleep(1000);} catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveSequenceColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveSequenceColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
		}	
		
		public void removeStartColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removeStartColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removeStartColumn())).build().perform();
			
			try {Thread.sleep(1000);} catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveStartColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveStartColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		}
		
		public void removeStickersColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removeStickersColumn());
				
				actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removeStickersColumn())).build().perform();
				
				try {Thread.sleep(1000);} catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveStickersColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveStickersColumn()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
				findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		}
		
		public void removeSuccessorsColumn()
		{
			  explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removeSuccessorsColumn());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removeSuccessorsColumn())).build().perform();
			
			try {Thread.sleep(1000);} catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveSuccessorsColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveSuccessorsColumn()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
		}
		
		public void removeTimeTolaunchColumn()
		{
			explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.removeTimeToLaunch());
			
			actions.moveToElement(findElement(ToAddingConstraintsColumnInCVLocators.removeTimeToLaunch())).build().perform();
			
			try {Thread.sleep(1000);} catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveTimetoLaunch()));
			findElement(ToAddingConstraintsColumnInCVLocators.triggerremoveTimetoLaunch()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()));
			findElement(ToAddingConstraintsColumnInCVLocators.ClickOnRemoveColumn()).click();
			
			
			
			 try {Thread.sleep(2000);}catch(InterruptedException ie) {}

	            //following code for splitter bar 
	    	 
	    	 int minSliderPosition = -1600;
	    	 
	    	// explicitWaitElementBy("elementToBeLocated", ToAddingConstraintsColumnInCVLocators.splitterBarOnCalendarView());
	    	 
	    	 
	    	 
	    	   actions.dragAndDropBy(findElement(ToAddingConstraintsColumnInCVLocators.splitterBarOnCalendarView()), minSliderPosition, 0).build().perform();
			
			
			
		}
		
			
		
}
		     
			
			
			

