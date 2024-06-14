package helper_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import common_package.CommonMethodsOfWebDriver;
import pom_package.PlanGanttActivityAndKanbanCardLinkToActivityLocator;
import pom_package.PlanGanttActivityDependencyLocators;


public class PlanGanttActivityDependencyHelper extends CommonMethodsOfWebDriver{
	
	
	public  void applyPlanGanttActivityFinishToStartDependency()
	{
		Actions actions = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		/*//click on folder name
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(By.xpath("//div[text()='A pbmkzm']")));
		findElement(By.xpath("//div[text()='A pbmkzm']")).click();
		
		//click on project name
		explicitWaitElementToBeClickable(findElement(By.xpath("//div[text()='Project P1']")));
		findElement(By.xpath("//div[text()='Project P1']")).click();
		
		//click on Plan gantt
		explicitWaitElementToBeClickable(findElement(By.xpath("//div[text()='Plan Gantt']")));
		findElement(By.xpath("//div[text()='Plan Gantt']")).click();*/
		
		//switchToiFrame("boardIfram"); //need to clear this after upper piece of code runs
		
		try {Thread.sleep(3000);}catch(InterruptedException ie) {}
		
		//try {Thread.sleep(8000);}catch(InterruptedException ie) {}	//need to clear this after upper piece of code runs
		
		explicitWaitElementToBeClickable(findElement(PlanGanttActivityDependencyLocators.planGanttDuplicateIcon()));
		findElement(PlanGanttActivityDependencyLocators.planGanttDuplicateIcon()).click();
		
		for(String s : driver.getWindowHandles())
		{
			driver.switchTo().window(s);
		}
		
		try {Thread.sleep(8000);}catch(InterruptedException ie) {}
		
		for(int i=0; i<=48; i++)
		{
			if(i>=4)
			{
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()));
				findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttSettingGearIcon()).click();
				
				try {Thread.sleep(1000);}catch(InterruptedException ie){}
				explicitWaitElementToBeClickable(findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()));
				findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.planGanttZoomToFit()).click();
				try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			}
			else
			{	
				findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+i+"]/tbody/tr/td/div/div/div[2]/div[2]"));
				explicitWaitElementToBeLocated((By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+i+"]/tbody/tr/td/div/div/div[2]/div[2]")));
				jse.executeScript("arguments[0].scrollIntoView();", findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+i+"]/tbody/tr/td/div/div/div[2]/div[2]")));
			}
			
			//Hover On 1st Activity
			explicitWaitVisibilityOf(findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+i+"]/tbody/tr/td/div/div/div[2]/div[2]")));
			boolean activityVisibility = findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+i+"]/tbody/tr/td/div/div/div[2]/div[2]")).isDisplayed();
			System.out.print("Activity number "+i +" : "+activityVisibility);
			
			actions.moveToElement(findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+i+"]/tbody/tr/td/div/div/div[2]/div[2]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			//ClickAndHold on 1st Activity end circle
			actions.clickAndHold(findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+i+"]/tbody/tr/td/div/div/div[2]/div[@class='sch-terminal sch-terminal-end']"))).build().perform();
			
			//Hover on 2nd Activity
			actions.moveToElement(findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+(i+1)+"]/tbody/tr/td/div/div/div[2]/div[2]"))).build().perform();
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			//Apply Release method on 2nd Activity start circle
			actions.moveToElement(findElement(By.xpath("//div[@class='x-grid-item-container']/table[@data-recordindex="+(i+1)+"]/tbody/tr/td/div/div/div[2]/div[@class='sch-terminal sch-terminal-start']"))).release().build().perform();
			System.out.print(" "+i+" \n");
		}
		
	}

}
