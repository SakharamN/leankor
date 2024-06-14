package helper_package;

import java.util.Scanner;

import org.openqa.selenium.By;
import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateCardLocators;
import pom_package.CreateKanbanCardsOnDifferentMasterContainerLocators;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.UpdateKanbanCardsDeatailLocator;

public class UpdateKanbanCardsDeatailHelper extends CommonMethodsOfWebDriver {

	public static String kanbanBoardCurrentBrowserWindowHandleValue;
	public static int cardLimit;
	final int divisor = 5;
	
	public static String folderName;
	public static String projectName;
	public static String projectBoardName;
	
	
 public void Open_KanbanBoard() throws InterruptedException
	{
		try {Thread.sleep(6000);}catch(InterruptedException ie) {}
		
		
	//	explicitWaitElementBy("presenceOfElementLocated", KanbanBoardRegressionLocators.leankorLeftNavigation());
		//try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		folderName=properties.getProperty("FolderName");
		System.out.println("Expanded folder name is :"+folderName);
		
		projectName=properties.getProperty("projectName");
		System.out.println("Expanded project name is :"+projectName);
				
				
		projectBoardName=properties.getProperty("projectBoardName");
		System.out.println("Expanded projectBoardName is :"+projectBoardName);
	
		explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedFolderCard()));
		findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedFolderCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.ClickoncreatedProjectCard()));
		findElement(UpdateKanbanCardsDeatailLocator.ClickoncreatedProjectCard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", UpdateKanbanCardsDeatailLocator.clickonProjectBoard());
		//explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.clickonProjectBoard()));
		findElement(UpdateKanbanCardsDeatailLocator.clickonProjectBoard()).click();
		
		explicitWaitVisibilityOf(findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedKanbanBoardCard()));
		findElement(UpdateKanbanCardsDeatailLocator.ClickOnCreatedKanbanBoardCard()).click();
		
		
		
	
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
		
		switchToiFrame("boardIfram");	
	}
 
	public void count_KanbanCard()
	{
		
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOn_KanbanBoardZoomIcon()));
		findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOn_KanbanBoardZoomIcon()).click();
		
		for(String browserWindowsValue : driver.getWindowHandles())
		{
			driver.switchTo().window(browserWindowsValue);
		}
		
		try {Thread.sleep(5000);}catch(InterruptedException ie) {}
				
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter limit of card : ");
		cardLimit = sc.nextInt(); //The sc.nextInt() method reads an integer value entered by the user from the standard input and assigns it to the cardLimit variable.
		
		
		
	
	}
	
	
	//Task added on Backlog Master Container's cards
	public void addTaskToBacklogMasterContainerCards()
	{
		int i;
		int x=0;
		int y=1;
		int z=x+y;
		System.out.println("Value of z outside the loop : "+z);
		

		//Backlog master container cards
		for(i=1; i<=cardLimit; i++)
		{
			try {Thread.sleep(3000);}catch(InterruptedException ie) {}
			
			//Edit card pensil icon 
			
			boolean isEditIconVisible=findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).isDisplayed();
			System.out.println("isEditIconVisible :");
			
			if (isEditIconVisible==true) {
				
				
				explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));//both form r work
				findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
				
			} 
			else {
                
		scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
				
		explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));//both form r work
		findElement(By.xpath("//form[@id='ext-zonePanel-20']//div[@id='ext-dataview-element-container-2']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
			
			}
		
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			// TASK is Added to Kanban Card Backlog master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			
			for(int k=1; k<=2; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try{Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
					
					
					
				}
				
			}
			
			// Task create loop ends here
					//***********************************************************| Apply stickers on Kanban Card |************************************************************
				
					
					
				    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}        

				
					int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size()-34;
					System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
					
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
					
					//findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
					
					
				for(int R=0; R<sizeOfStickerWindow; R++)
					{
						findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
						
				    }
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				
				//uploading files on card
				
				for(int m=1; m<=1; m++)
				{
				
				actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();
	
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				
				
				boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
				System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
				
			    	if(isRepositorySourceVisible == true)
				   {
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				   }
				
				
				findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
				
				explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
				findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
				
				
				try {Thread.sleep(2000);}catch(InterruptedException ie) {}
				
				
				}
				// Task create loop ends here
				
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
					findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();	
			
			x = divisor;   //0=5
			y = z;         //1=1                               
			z = x+y;       //5+1=6
			System.out.print(z+" \n");
		
	}
	
}
	
	
	  //Task added on InProgress master container's Card
      public void addTaskToInProgressMasterContainerCards()
	{
		int j;
		int a = 0;
		int b = 1;
		int sum = a+b;
		System.out.println("Value of sum outside the loop : "+sum);
		
		for(j=200; j<=cardLimit; j++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+j+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+j+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+j+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			// TASK is Added to Kanban Card inprogress master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			//Apply loop from here
			
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	
			
			
			// Task create loop ends here
			
			//***********************************************************| Apply stickers on Kanban Card |************************************************************
		
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size()-34;
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			//findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
	            	for(int R=0; R<sizeOfStickerWindow; R++)
	             	{
		           	findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
		          	}
		
		   try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		        //uploading files on card
		
	        	for(int m=1; m<=1; m++)
	           {
		
		           actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		           try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		
		
		         boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
	          	System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
	         	if(isRepositorySourceVisible == true)
		         {
		    	   explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
		        	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			       findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			       try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		         }
		        findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
	         	explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
	          	findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
	       }
		     try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
					
			a = divisor;//5
			b = sum;//1
			sum = a+b;//6
			System.out.print(sum +" \n");
		   
		}
	}
	
	//Task added on ReviewAndApproval Master Container's cards
	public void addTaskToReviewAndApprovalMasterContainerCards()
	{
		int i;
		int p = 0;
		int q = 1;
		int r = p+q;
		System.out.println("Value of r outside the loop is : "+r);
		
		
		for(i=1; i<=cardLimit; i++)
		{
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//TASK is Added to Kanban Card Review and Approval master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			
			//Apply loop from here
			
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	
		
		
			
		    // Task create loop ends here
		
			
			//***********************************************************| Apply stickers on Kanban Card |************************************************************

			
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        

			//*******************need to apply new logic here for apply sticker on kanban card*******************
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size()-34;
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
		//	findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
		    for(int R=0; R<sizeOfStickerWindow; R++)
			{
				findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
			}
			
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//uploading files on cardl̥
		
		for(int m=1; m<=1; m++)
		{
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
		if(isRepositorySourceVisible == true)
		{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		}
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		}
		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
		

	
			
			p = divisor;
			q = r;
			r = p+q;
			System.out.print(r +" \n");
		}

	}
	//Task added on Done Master Container's cards
	public void addTaskToDoneContainerCards()
	{
		int l;
		int e = 0;
		int f = 1;
		int g = e+f;
		System.out.println("Value of g outside the loop : " +g);
		
		for(l=1; l<=cardLimit; l++)
		{
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+l+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+l+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//TASK is Added to Kanban Card Done master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			
			//Apply loop from here
			
			
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}
					catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	
		
		
		// Task create loop ends here
			
			//***********************************************************| Apply stickers on Kanban Card |************************************************************
		
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}       
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size()-34;
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			//findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
			for(int R=0; R<sizeOfStickerWindow; R++)
			{
				findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
		   }
			
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//uploading files on card
		
		for(int m=1; m<=1; m++)
		{
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
	     	if(isRepositorySourceVisible == true)
	    	{
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		    }
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		}
		
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
			
			e = divisor;
			f = g;
			g = e+f;
			System.out.print(g +" \n");
		}
	}
	
	
	//Task added on Archive Master Container's cards
	public void addTaskToArchiveContainerCards()
	{
		int i;
		int x = 0;
		int y = 1;
		int z = x+y;
		System.out.println("Value of z outside the loop : "+z);
		
		for(i=1; i<=cardLimit; i++)
		{
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+i+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			
			//TASK is Added to Kanban Card Archive master container & click on Task side column
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnTaskSideColumn()));
			findElement(CreateCardLocators.clickOnTaskSideColumn()).click();
			
			
			//Apply loop from here
			for(int k=1; k<=1; k++)
			{
				if(k==1)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
				else if(k>=2)
				{
					try {Thread.sleep(2000);}catch(InterruptedException ie) {}				
					
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.addTaskSubject()));
					findElement(CreateCardLocators.addTaskSubject()).clear();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.addTaskSubject()).sendKeys("Task "+k);
					findElement(CreateCardLocators.addDescriptionToTask()).sendKeys("Task analysis is the analysis of how a task is accomplished, including a detailed description of both manual and mental activities, task and element durations, task frequency, task allocation, task complexity, environmental conditions, necessary clothing and equipment, and any other unique factors involved in or required for one or more people to perform a given task.");		
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnAssignAUserDropDown()));
					findElement(CreateCardLocators.clickOnAssignAUserDropDown()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).click();
					findElement(CreateCardLocators.searchUserNameInInputField()).sendKeys("Pratish Laad");
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()));
					findElement(CreateCardLocators.assignAnOwnerForTaskSearchIcon()).click();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					explicitWaitElementToBeLocated((CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()));
					findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.selectUserAfterSearch()).click();
					explicitWaitElementToBeClickable(findElement(CreateCardLocators.taskPriority()));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.taskPriority()).click();
					findElement(CreateCardLocators.selectTaskPriorityFromDropDown()).click();
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					findElement(CreateCardLocators.clickOnTaskAddButton()).click();
				}
			}	
		
		
		    // Task create loop ends here
			
			//***********************************************************| Apply stickers on Kanban Card |************************************************************
			
			
		    explicitWaitElementBy("elementToBeLocated", CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn());
			findElement(CreateKanbanCardsOnDifferentMasterContainerLocators.clickOnStickerColumn()).click();
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
			int sizeOfStickerWindow = findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).size()-34;
			System.out.println("sizeOfStickerWindow checkboxes on sticker window popup LINE 1863 :"+sizeOfStickerWindow);
			
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}        
			
		//	findElements(CreateKanbanCardsOnDifferentMasterContainerLocators.stickerWindowsElementSize()).get(sizeOfStickerWindow-35).click();
			
			
			for(int R=0; R<sizeOfStickerWindow; R++)
			{
				findElements(KanbanBoardRegressionLocators.stickerWindowsElementSize()).get(R).click();
				
			}
			
	    	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		
		//uploading files on cardl
		
		for(int m=1; m<=1; m++)
		{
		
		actions.moveToElement(findElement(KanbanBoardRegressionLocators.clickOnFilesSideColumn())).click().build().perform();

		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		
		boolean isRepositorySourceVisible = findElement(KanbanBoardRegressionLocators.repositorySourceTab()).isDisplayed();
		System.out.println("isRepositorySourceVisible is Visible LINE 2129 :"+isRepositorySourceVisible);
		
	     	if(isRepositorySourceVisible == true)
		   {
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.switchToSalesforceFilesUpload());
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(KanbanBoardRegressionLocators.switchToSalesforceFilesUpload()).click();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		   }
		
		
		findElement(KanbanBoardRegressionLocators.uploadImageOnFilesInputField()).sendKeys(filePath+"\\ImageFolder/"+"download4.jpg");
		
		explicitWaitElementToBeClickable(findElement(KanbanBoardRegressionLocators.clickOnUploadButton()));
		findElement(KanbanBoardRegressionLocators.clickOnUploadButton()).click();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		}
			explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton());
			findElement(KanbanBoardRegressionLocators.clickOnEditCardFinalSaveButton()).click();
			
			x = divisor;
			y = z;
			z = x+y;
			System.out.print(z +" \n");
		}
		
		refresh();
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
	}
}
	
	

