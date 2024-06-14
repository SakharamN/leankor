package helper_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CalenderViewForKanbanBoardAndDependencyLocators;

public class CalenderViewForKanbanBoardAndDependencyHelper extends CommonMethodsOfWebDrive{
	
	

	

	public void clickOn_CalenderViewIcon()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		
		/*explicitWaitVisibilityOf(findElement(CreateCardLocators.switchToKanbanBoardIframeWindow()));
		switchToiFrame(findElement(CreateCardLocators.switchToKanbanBoardIframeWindow()));		
		try {Thread.sleep(3000);}
		catch(InterruptedException ie) {}*/
		
		String winHandleAfterClickOnCalenderViewIcon = driver.getWindowHandle();
		System.out.println("\nwindow value before handle : "+winHandleAfterClickOnCalenderViewIcon);
		
		explicitWaitVisibilityOf(findElement(CalenderViewForKanbanBoardAndDependencyLocators.clickOnCalenderViewIcon()));
		findElement(CalenderViewForKanbanBoardAndDependencyLocators.clickOnCalenderViewIcon()).click();
		try {Thread.sleep(10000);}catch(InterruptedException ie) {}
		
	}
	
	public void WebtableAutomate()
	{
		
		
	
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
			driver.switchTo().window(winHandle);
	 	}
		
		try {Thread.sleep(4000);}catch(InterruptedException ie) {}
		//explicitWaitVisibilityOf(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
		//explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
		//findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
		
		
		
		
		List<WebElement>tablesoncvCalender=driver.findElements(By.xpath("//div[@id='customGanttPanel-1049-timelineview']"));
		
		System.out.println("No of tables are :"+tablesoncvCalender.size());
		
		for(int i=0; i<=tablesoncvCalender.size();i++)
		{
		String S =tablesoncvCalender.get(i).getText()+" ";
		System.out.println("No of tables are present on the board is :"+S);
		}
		System.out.println();
		
		
	}
	
	
	
	//Dependency Finish to Finish with each card in each master container
	public void calenderViewCardDependencyCreationFinishToFinish()
	{		
		
		
		for(String winHandle : driver.getWindowHandles())
		{
			System.out.println("********************get WINDOW HANDLES value******************** :- "+winHandle);
			driver.switchTo().window(winHandle);
	 	}
		
		try {Thread.sleep(9000);}catch(InterruptedException ie) {}
		//explicitWaitVisibilityOf(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
		//explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
		//findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
		
		Actions actions = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//Dependency Finish to Finish , backlog cards dependency
				int i;	
				for(i=3; i<FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC.cardLimit+2; i++)
				{
					System.out.print(i+" ");
					//for scroll into view
					//jse.executeScript("arguments[0].scrollIntoView();", findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+i+"]/td/div/div/div[2]/div[3]")));
					jse.executeScript("arguments[0].scrollIntoView();", findElement(By.xpath("//div[@id='customGanttPanel-1049-timelineview']/div/table/tbody/tr/td/div/div/div[2]/div[3]")));
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					//First card hover
					//actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+i+"]/td/div/div/div[2]/div[3]"))).build().perform();
					actions.moveToElement(findElement(By.xpath("//div[@id='customGanttPanel-1049-timelineview']/div/table/tbody/tr["+i+"]/td/div/div/div[2]/div[3]"))).build().perform();
					
					try {Thread.sleep(1000);}catch(InterruptedException ie) {}
					
					//First card end circle and call clickAndHold method
					//actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+i+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
					actions.clickAndHold(findElement(By.xpath("//table[@id='customGanttPanel-1049-timelineview-record-559']//tr/td//div[@class='sch-terminal sch-terminal-end']"))).build().perform();
					
					//Second card hover
					//actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(i+1)+"]/td/div/div/div[2]/div[3]"))).build().perform();
					actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(i+1)+"]/td/div/div/div[2]/div[3]"))).build().perform();
					
					//Second card start circle and call release method
					//actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(i+1)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).release().build().perform();
					actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(i+1)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).release().build().perform();
					
				}
				System.out.println("\nlast value of i and backlog master container end : "+i);
		
	}
		// backlog last card to inprogress first card
		/*System.out.println("This loop for backlog's last card to in progress first card dependency,iterate only one time and dependency finish to start in inprogress");		
		int j;
		for(j=i; j<=FolderProjectKanbanCardHelper.cardLimit+2; j++)
		{
			System.out.print(j+" ");
			
			//jse.executeScript("argument[0].scrollIntoView();", findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+j+"]/td/div/div/div[2]/div[3]")));
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+i+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+i+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			//jse.executeScript("argument[0].scrollIntoView();",findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(j+2)+"]/td/div/div/div[2]/div[3]")));
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(j+2)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(j+2)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-start']"))).release().build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
		}
		System.out.println("\nj loop ends, make dependency finish to start ends in two different master container and last value of j loop is : "+j);
		
		
		
		//in progress master container dependency finish to finish
		int k;
		for(k=j+1; k<=FolderProjectKanbanCardHelper.cardLimit+12; k++)
		{
			System.out.print(k+" ");
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+k+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+k+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(k+1)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(k+1)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).release().build().perform();
		}
		System.out.println("\nlast value of K when it terminate : "+k);
		
		//inprogress master container last card finish to Review and approval master container first card, loop iterates only one time
		int x;
		for(x=k; x<=FolderProjectKanbanCardHelper.cardLimit+13; x++)
		{
			System.out.print(x+" ");
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+k+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+k+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(x+2)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(x+2)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-start']"))).release().build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
		}
		System.out.println("\ninprogress master container last card finish to review and approval first card start end dependency , last value of x loop when it terminate : "+x);
		
		
		
		// Review and approval master container card dependency finish to finish
		int y;
		for(y=x+1; y<=FolderProjectKanbanCardHelper.cardLimit+23; y++)
		{
			System.out.print(y+" ");
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+y+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+y+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(y+1)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(y+1)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).release().build().perform();
		}
		System.out.println("\nlast value of y loop when it terminate : "+y);//value has 34 store in y
		
		// review and approval master container last card to Done master container first card start dependency
		int z;
		for(z=y; z<=FolderProjectKanbanCardHelper.cardLimit+24; z++)
		{
			System.out.print(z+" ");
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+y+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+y+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(z+2)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(z+2)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-start']"))).release().build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
		}
		System.out.println("\ncard link to review and approval master container to Done master container first card, last value of z loop when it terminate is : "+z);
		
		
		
		//Done master container dependency to each other finish to finish
		int p;
		for(p=z+1; p<=FolderProjectKanbanCardHelper.cardLimit+34; p++)
		{
			System.out.print(p+" ");
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+p+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+p+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(p+1)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(p+1)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).release().build().perform();
		}
		System.out.println("\nDone master container finish to finsh dependency ends , p loop ends with last value : "+p);
		
		//Done master container last card finish to Archive first card dependency , loop iterates only one time
		int q;
		for(q=p; q<=FolderProjectKanbanCardHelper.cardLimit+35; q++)
		{
			System.out.print(q+" ");
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+p+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+p+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(q+2)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(q+2)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-start']"))).release().build().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
		}
		System.out.println("\nDone master container last card to Archive first card dependency ends, last value of q loop when it terminate : "+q);
		
		//Archive master container finish to finish dependency
		int r;
		for(r=q+1; r<=FolderProjectKanbanCardHelper.cardLimit+45; r++)
		{
			System.out.print(r+" ");
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+r+"]/td/div/div/div[2]/div[3]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			actions.clickAndHold(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+r+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).build().perform();
			
			actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr["+(r+1)+"]/td/div/div/div[2]/div[3]"))).build().perform();
			actions.moveToElement(findElement(By.xpath("//table[@id='ext-comp-1009-timelineview-table']//tr["+(r+1)+"]/td//div[@class='sch-gantt-terminal sch-gantt-terminal-end']"))).release().build().perform();
		}
		System.out.println("\nArchive master container finish to finish dependency ends, last value of r loop when it terminate : "+r);
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
		findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
	}	//calenderViewCardDependencyCreationFinishToFinish terminate method
	*/
	
	//Dependency Finish-to-Start with each card in each master container
	public void calenderViewCardDependencyCreationFinishToStart()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		Actions actions = new Actions(driver);
		
		actions.moveToElement(findElement(By.xpath("//div[@id='ext-comp-1009-normal']/div[2]/div/table/tbody/tr[3]/td/div/div/div[2]/div[3]"))).build().perform();
				
		for(int i=1; i<=43; i++) //45
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitVisibilityOf(findElement(CalenderViewForKanbanBoardAndDependencyLocators.clickOnCardDependencyArrow()));
			actions.moveToElement(findElement(CalenderViewForKanbanBoardAndDependencyLocators.clickOnCardDependencyArrow())).doubleClick().perform();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.underCardDependencyArrowSignClickOnTypeDropDown()));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.underCardDependencyArrowSignClickOnTypeDropDown()).click();
			
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.selectValueUnderTypeDropDown()));
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.selectValueUnderTypeDropDown()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.clickonUpdateButtonOfDropDown()));
			boolean visible = findElement(CalenderViewForKanbanBoardAndDependencyLocators.clickonUpdateButtonOfDropDown()).isDisplayed();
			System.out.println("Element visibility : "+visible +" value of i : "+i);
			try {Thread.sleep(2000);}catch(InterruptedException ie) {}
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.clickonUpdateButtonOfDropDown()).click();
			
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			explicitWaitElementToBeClickable(findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()));
			findElement(CalenderViewForKanbanBoardAndDependencyLocators.zoomToFit()).click();
		}
		System.out.println("Finish to start method ends");
	}	//calenderViewCardDependencyCreationFinishToStart terminate
}