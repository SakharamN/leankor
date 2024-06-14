package pom_package;

import org.openqa.selenium.By;

import helper_package.AddMilestoneOnMasterContainerInCVHelper;
import helper_package.AddKanbanCardRegressionOnCalendarViewHelper;

public class AddMilestoneOnMasterContainerInCVLocator 
{

	public static final By ClickOn_Addmilestone()
	{
		return By.xpath("//span[text()='Add Milestone']");
	}
	
	public static final By RightClick_OnMilestone()
	{
		//return By.xpath("//table[@role='presentation' and @style='width: 12810px;']/tbody/tr[3]/td/div/div/div[contains(@id,'ext-comp-1009-timelineview-')]");
		
		//return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//div[contains(@style,' transform: translate3d(0px, 0px, 0px);')]//table[5]");
		
		//return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/following-sibling::table[1]");
		
		return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/tbody/tr[4]");
		
	}
	
	public static final By ClickOn_StartDateCalendar()
	{
		return By.xpath("//input[@name='StartDate']");
	}
	
	public static final By Clickon_Editmilestone()
	{
		return By.xpath("//div[contains(@id,'taskMenu-')]//span[text()='Edit Milestone']");
	}
	public static final By clickOn_DiscussOnMilestone()
	{
		return By.xpath("//div[contains(@id,'taskMenu-')]//span[text()='Discuss']");
	}
	
	public static final By ClickOn_CloneMilestone()
	{
		return By.xpath("//div[contains(@id,'taskMenu-')]//span[text()='Clone Milestone']");
	}
	
	public static final By CheckCondition_QuickActionOnmilestone()
	{
		return By.xpath("//div[contains(@id,'taskMenu-')]//span[text()='Quick Actions']");
	}
	
	public static final By ClickOn_Delete()
	{
		return By.xpath("//div[contains(@id,'taskMenu-')]//span[text()='Delete']");
	}
	
	public static final By ClickOnAtRiskCheckbox()
	{
		return By.xpath("//label[text()='At Risk:']/parent::td/following-sibling::td");
	}
	
	public static final By ClickOnONHOLDCheckbox()
	{
		//return By.xpath("//span[text()='On Hold:']");
		
		return By.xpath("//label[text()='On Hold:']");
	}
	
	public static final By ClickOnAtRiskAndOnHoldwhileEditTheMilestone()
	{
		return By.xpath("//div[@style='width: 728px; left: 0px; top: 0px; height: 399px;']/span/div/div[7]/div/div/div/table");
	}
	
	public static final By iFrameSrcValueAndSwitchToframe()
	{
		return By.xpath("//iframe[@src='"+AddMilestoneOnMasterContainerInCVHelper.getIframeSRCAttribute+"']");
	}
	
	
	
	public static final By getChildiFrameClassAttributeValue() 
	{
		return By.xpath("//iframe[@class='"+AddMilestoneOnMasterContainerInCVHelper.childIframevalue+"']");
	}
	
	public static final By textDivArea()
	{
		return By.xpath("//div[contains(@class,'cxfeeditem ')]");
	}
	
	public static final By getTextFromChatterSubWindow()
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"+AddMilestoneOnMasterContainerInCVHelper.textAreaIDAttribute+"']//div[@class='cxfeeditemtextwrapper']//p");
	}
	
	//
	
	public static final By clickOnCloneMilestone()
	{
		return By.xpath("//span[text()='Clone Milestone']");
	}
	
	
	public static final By CheckQuickActionCondition()
	{
	   return By.xpath("//div[contains(@style,'width: 131px; height: 131px;')]//span[text()='Quick Actions']");
	}
	
	public static final By picksatrtdatefromCalendarpopupformilestone()
	{
		//return By.xpath("//table[contains(@id,'datefield-1289-picker-eventEl')]/tbody/tr[2]/td[6]");
		
		return By.xpath("//table[contains(@class,'x-datepicker-inner x-focus x-datepicker-focus x-datepicker-default-focus')]/tbody/tr/td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]");
	}
	
	public static final By getAllRowElementsOfSelectDateCLoneCalendarformilestone()
	{
		//return By.xpath("//td[@class='x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected' and @id='ext-gen4470']/parent::tr/child::td");
		
		//return By.xpath("//td[contains(@id,'datefield-1289-picker-eventEl')]/parent::tr/child::td");
		
     	//return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td");
		
		//return By.xpath("//table[contains(@class,'x-datepicker-inner x-focus x-datepicker-focus x-datepicker-default-focus')]//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td");// if 14 elements are showing due to  here taking table xpath also
		
		//return By.xpath("//table[contains(@id,'datefield-1253-picker-eventEl')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td");
     	
        //	return By.xpath("//td[contains(@class,'x-datepicker-selected') and @aria-selected='true']/parent::tr/child::td");
     	
     	//return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td[position > 7]"); // this xpath taking 14 elements for start date and due date calendar and so by using position function we can filter the elemnets take only 7 elements xpath
		
		//return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td"); //now this xpath needs to change only id value
		
		//return By.xpath("//table[contains(@class,'x-datepicker-inner x-focus x-datepicker-focus x-datepicker-default-focus')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td");
		
		return By.xpath("//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td");
	}
	
	
	public static final By getAllRowElementsOfSelectDateCLoneCalendarformilestoneByDueDate()
	{
		//return By.xpath("//div[@id='datefield-1286-picker-innerEl']//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td");//here also needs to take the Id Valuefor due date
		
		return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td");
	}
	
	
	
	public static final By rightClickonClonemilestone()
	{
		return By.xpath("//table[@role='presentation' and @style='width: 12810px;']/tbody/tr[4]/td/div/div/div[contains(@id,'ext-comp-1009-timelineview-')]");
	}
	
	public static final By ClickOnDeletemilestone()
	{
		//return By.xpath("//div[contains(@style,'width: 240px; right: auto; left: 4px; top: 75px;')]//span[text()='Delete']");
		return By.xpath("//div[contains(@style,'left: 0px; top: 0px; width: 131px; height: 131px;')]//span[text()='Delete']");//this is cloned milestone xpath
	}
	
	public static final By clickonDeleteOptionPopup() 
	{
		//return By.xpath("//div[@class='x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//span[text()='Delete']");
		
		return By.xpath("//div[@class='x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']/div[3]/div/div/a[2]");
	}
	
	public static final By clickonmanullyScheduleCheckbox()
	{
		return By.xpath("//div[@class='x-field x-form-item x-form-item-default x-form-type-checkbox x-box-item x-field-default x-hbox-form-item']/label[contains(@id,'manuallyscheduledfield-')]");
	}
	public static final By CLickOnHoldCheckbox()
	{
		return By.xpath("//div[@class='x-field x-form-item x-form-item-default x-form-type-checkbox x-box-item x-field-default x-hbox-form-item']/label[contains(@id,'checkbox-1166')]");
	}

	
	public static final By selectdatefromcalendarCloneOnNextRowformilestone()
	{
		return By.xpath("//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell')]/parent::tr/following::tr/td[3]");
	}
	
	
	public static final By RightClick_OnSecondMilestone()
	{
		return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/tbody/tr[5]");
	}
	
	public static final By milestoneSaveLoadmask()
	{
		return By.xpath("//div[contains(@id,'loadmask-')]//div[text()='Saving...']");
	}
	
	
	
}
