package helper_package;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
//import org.openqa.selenium.InvalidElementStateException;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import common_package.CommonMethodsOfWebDriver;
import pom_package.EditKanbanBoardLocators;
import pom_package.KanbanBoardRegressionLocators;
import pom_package.KanbanBoardSettingLocators;

public class EditKanbanBoardHelper extends CommonMethodsOfWebDriver {
	
	public static String duplicateWindowsHandleValue;
	
	public void createMasterContainer()
	{
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.editBoardIcon());
		findElement(EditKanbanBoardLocators.editBoardIcon()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.editTemplateMasterContainer());
		findElement(EditKanbanBoardLocators.editTemplateMasterContainer()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.changeTemplateMasterContainerType());
		findElement(EditKanbanBoardLocators.changeTemplateMasterContainerType()).click();
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.selectTypeForTemplateMasterContainer());
		findElement(EditKanbanBoardLocators.selectTypeForTemplateMasterContainer()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(EditKanbanBoardLocators.updateButton()));
		findElement(EditKanbanBoardLocators.updateButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.addNewMasterContainer());
		findElement(EditKanbanBoardLocators.addNewMasterContainer()).click();
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.masterContainerTitle());
		findElement(EditKanbanBoardLocators.masterContainerTitle()).sendKeys("CustomCreatedMasterContainer");
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.newMasterContainerColorCategory());
		findElement(EditKanbanBoardLocators.newMasterContainerColorCategory()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		int colorAreaSize = findElements(EditKanbanBoardLocators.selectColorForNewMasterContainer()).size();
		System.out.println("\nSize of color:"+colorAreaSize);
		
		//for(int i=0; i<colorAreaSize; i++)
		//{
		//	String colorClassAttribute = findElements(EditKanbanBoardLocators.selectColorForNewMasterContainer()).get(i).getAttribute("class");
			
		//	if(colorClassAttribute.contains("checkIcon"))
		//	{
		//		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
				for(int j=63; j<=colorAreaSize; j++)// colour will be select 63 number
				{
					actions.moveToElement(findElement(By.xpath("//div[contains(@id,'ext-dataview-')]//div[contains(@class,'x-unsized x-dataview-container')]/div["+j+"]"))).build().perform();
					scrollinToView(findElement(By.xpath("//div[contains(@id,'ext-dataview-')]//div[contains(@class,'x-unsized x-dataview-container')]/div["+j+"]")));
				}
				
				explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.selectNewMasterContainerColor());
				findElement(EditKanbanBoardLocators.selectNewMasterContainerColor()).click();
				//break;
			//}
		//}
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementToBeClickable(findElement(EditKanbanBoardLocators.createMasterContainerButton()));
		findElement(EditKanbanBoardLocators.createMasterContainerButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.backToBoard());
		findElement(EditKanbanBoardLocators.backToBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.customCreatedMasterContainerOnKanbanBoard());
		actions.moveToElement(findElement(EditKanbanBoardLocators.customCreatedMasterContainerOnKanbanBoard())).build().perform();
		scrollinToView(findElement(EditKanbanBoardLocators.customCreatedMasterContainerOnKanbanBoard()));
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.editBoardIcon());
		findElement(EditKanbanBoardLocators.editBoardIcon()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.customCreatedMasterContainer());
		scrollinToView(findElement(EditKanbanBoardLocators.customCreatedMasterContainer()));
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.editCustomCreatedMasterContainer());
		findElement(EditKanbanBoardLocators.editCustomCreatedMasterContainer()).click();
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.masterContainerTitle());
		findElement(EditKanbanBoardLocators.masterContainerTitle()).clear();
		findElement(EditKanbanBoardLocators.masterContainerTitle()).sendKeys("Automation");
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.editMasterContainerLimit());
		findElement(EditKanbanBoardLocators.editMasterContainerLimit()).clear();
		findElement(EditKanbanBoardLocators.editMasterContainerLimit()).sendKeys("5");
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.editMasterContainerCardLimitRadioButton());
		findElement(EditKanbanBoardLocators.editMasterContainerCardLimitRadioButton()).click();
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.newMasterContainerColorCategory());
		findElement(EditKanbanBoardLocators.newMasterContainerColorCategory()).click();
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.editMasterContainerSelectColor());
		findElement(EditKanbanBoardLocators.editMasterContainerSelectColor()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(EditKanbanBoardLocators.updateButton()));
		findElement(EditKanbanBoardLocators.updateButton()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.backToBoard());
		findElement(EditKanbanBoardLocators.backToBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
				
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.automationMasterContainer());
		actions.moveToElement(findElement(EditKanbanBoardLocators.automationMasterContainer())).build().perform();
		scrollinToView(findElement(EditKanbanBoardLocators.automationMasterContainer()));
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.resetkanbanBoard());
		findElement(EditKanbanBoardLocators.resetkanbanBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.addToBoard());
		findElement(EditKanbanBoardLocators.addToBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.addCardToBoard());
		webElement = findElement(EditKanbanBoardLocators.addCardToBoard());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.automationMasterContainer());
		WebElement automationMasterContainerDestination = findElement(EditKanbanBoardLocators.automationMasterContainer());
		
		actions.dragAndDrop(webElement, automationMasterContainerDestination).build().perform();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()));
		findElement(KanbanBoardRegressionLocators.clickOnCategoryDropDown()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		//explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueMarketing()));
		findElement(KanbanBoardRegressionLocators.selectCategoryFromDropDownValueMarketing()).click();
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardId()));
		findElement(KanbanBoardRegressionLocators.enterCardId()).sendKeys("AutoCard1");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardTitle()));
		findElement(KanbanBoardRegressionLocators.enterCardTitle()).sendKeys("Automation Master Container");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardDescription()));
		findElement(KanbanBoardRegressionLocators.enterCardDescription()).sendKeys("Card in automation master container");
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()));
		findElement(KanbanBoardRegressionLocators.enterCardAcceptanceCriteria()).sendKeys("Information of Card");
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(EditKanbanBoardLocators.createCardButton()));
		findElement(EditKanbanBoardLocators.createCardButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.addToBoard());
		findElement(EditKanbanBoardLocators.addToBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
        driver.switchTo().frame(0);
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.kanbanBoardLeftNav());
		findElement(EditKanbanBoardLocators.kanbanBoardLeftNav()).click();
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.clickOnPlanGantt());
		findElement(EditKanbanBoardLocators.clickOnPlanGantt()).click();		
		
		try {Thread.sleep(9000);}catch(InterruptedException ie) {}		//replace this line with plan gantt load mask*****************************************************
		
		switchToiFrame("boardIfram");
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}	
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnPlusIconToAddActivity());
		findElement(KanbanBoardSettingLocators.clickOnPlusIconToAddActivity()).click();
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}	
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.addActivity());
		findElement(KanbanBoardSettingLocators.addActivity()).click();
		
		try {robot = new Robot();}catch(AWTException awtExp) {}		
		robot.mouseMove(100, 100);
		actions.click().build().perform();
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		/*try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", By.xpath("//td[@class='x-grid-cell x-grid-td x-grid-cell-nameColumnId x-grid-cell-treecolumn x-unselectable']//span[@class='columnname x-tree-node-text ']"));
		actions.doubleClick(findElement(By.xpath("//td[@class='x-grid-cell x-grid-td x-grid-cell-nameColumnId x-grid-cell-treecolumn x-unselectable']//span[@class='columnname x-tree-node-text ']"))).build().perform();
		
		try 
		{
			findElement(By.xpath("//td[contains(@class,'nameColumnId')]//span[text()='Default']")).clear();
			findElement(By.xpath("//td[contains(@class,'nameColumnId')]//span[text()='Default']")).sendKeys("Activity A2");
		}
		catch(InvalidElementStateException invalidElementException)
		{
			System.out.println(invalidElementException);
		}
		
		findElement(By.xpath("//td[contains(@class,'nameColumnId')]//span[text()='Default']")).sendKeys(Keys.ENTER);*/
		
		/*explicitWaitElementBy("elementToBeLocated",KanbanBoardSettingLocators.enterActivityName());
		findElement(KanbanBoardSettingLocators.enterActivityName()).clear();
		findElement(KanbanBoardSettingLocators.enterActivityName()).sendKeys("Activity A2");*/
				
		driver.switchTo().window(KanbanBoardRegressionHelper.multipleTabsOpen.get(1));
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.clickOnEditAutomationCard());
		findElement(EditKanbanBoardLocators.clickOnEditAutomationCard()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardRegressionLocators.clickOnLinkSideColumn());
		findElement(KanbanBoardRegressionLocators.clickOnLinkSideColumn()).click();
	
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.linkToProject());
		findElement(EditKanbanBoardLocators.linkToProject()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.selectFolderName());
		findElement(EditKanbanBoardLocators.selectFolderName()).click();
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.selectProjectName());
		findElement(EditKanbanBoardLocators.selectProjectName()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.linkToProjectBoard());
		findElement(EditKanbanBoardLocators.linkToProjectBoard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.selectBoardUnderLinkToProjectBoard());
		findElement(EditKanbanBoardLocators.selectBoardUnderLinkToProjectBoard()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		scrollinToView(findElement(EditKanbanBoardLocators.linkToProjectBoard()));
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.linkToCard());
		findElement(EditKanbanBoardLocators.linkToCard()).click();
		
		explicitWaitElementBy("invisibilityOfElementLocated", EditKanbanBoardLocators.loadMaskAfterSave());
		
		explicitWaitElementBy("elementToBeLocated", EditKanbanBoardLocators.selectActivity());
		findElement(EditKanbanBoardLocators.selectActivity()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		
		explicitWaitElementToBeClickable(findElement(EditKanbanBoardLocators.clickOnCardSaveButton()));
		findElement(EditKanbanBoardLocators.clickOnCardSaveButton()).click();
		
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		driver.switchTo().window(KanbanBoardRegressionHelper.handleValueOfKanbanBoardiFrameWindow);
		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	public int verifyIsMiniatureVisible()
	{
		int miniatureCount = findElements(By.xpath("//div[contains(@id,'customganttpanel-')]//table[2]//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div")).size();
		System.out.println("minatureCount:"+miniatureCount);
		return miniatureCount;
	}
}