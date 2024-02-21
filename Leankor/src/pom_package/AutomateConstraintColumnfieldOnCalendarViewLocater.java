package pom_package;

import org.openqa.selenium.By;

import helper_package.AutomateConstraintColumnfieldOnCalendarViewHelper;

public class AutomateConstraintColumnfieldOnCalendarViewLocater {

	
	public static final By PercentagedoneColumn()
	{
		return By.xpath("//tr[contains(@class,'x-grid-tree-node-leaf  x-grid-row')]/td[2]");
	}
	
	public static final By ClickOnUptrigger()
	{
		return By.xpath("//div[contains(@class,'x-form-trigger x-form-trigger-grid-cell x-form-trigger-spinner x-form-trigger-spinner-grid-cell  x-unselectable')]/div[1]");
	}
	
	public static final By VerifyTopBarBlueLineOnCard()
	{
		return By.xpath("//div[@class='activity-top-bar-cls']");
	}
	public static final By ClickOnPercentageColumn()
	{
		return By.xpath("//span[text()='% Done']");
	}
	
	//xpath for discuss column
	
	public static final By ClickOnChatterIconColumn()
	{
		return By.xpath("//div[@class='chatterIconCol']");
	}
	
	public static final By iFrameSrcValueAndSwitchToframe()
	{
	    // return By.xpath("//iframe[@src='"+CreateCardsOnDifferentMasterContainersOnCVHelper.getIframeSRCAttribute+"']");
		return By.xpath("//iframe[@src='"+AutomateConstraintColumnfieldOnCalendarViewHelper.getIframeSRCAttribute+"']");
		
	}
	
	public static final By getChildiFrameClassAttributeValue()
	{
		return By.xpath("//iframe[@class='"+AutomateConstraintColumnfieldOnCalendarViewHelper.childIframevalue+"']");
	}
	
	public static final By getTextFromChatterSubWindowforCard()//The value of the id attribute is being dynamically determined based on the value of the textAreaIDAttribute variable.
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"+AutomateConstraintColumnfieldOnCalendarViewHelper.textAreaIDAttribute+"']//div[@class='cxfeeditemtextwrapper']//p");
	}
	
	public static final By TextNumberShowingOrNotOnChatterTab()
	{
		return By.xpath("//span[@class='badgeText']");
	}
	
    //following xaptah for end column
	
	public static final By EditEndColumnDate()
	{
		return By.xpath("//tr[@class='x-grid-tree-node-leaf  x-grid-row']/td[10]");
	}
	
	public static final By ClickingOnCalendar()
	{
		return By.xpath("//div[@class='x-form-trigger x-form-trigger-grid-cell x-form-date-trigger x-form-date-trigger-grid-cell  x-form-trigger-focus']");
	}
	
	public static final By ClickingonEndText()// this xpath only for random clicking
	{
		return By.xpath("//div[@class='x-column-header-text-wrapper']//span[text()='End']");
	}
	
	public static final By clickingonfileitemColumn()
	{
		return By.xpath("//div[@class='fileItemCol']");
	}
	
	//following xpath for ID Column
	
	public static final By ClickingOnPercentDoneColumn()
	{
		return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'percentDoneField')]");
	}
	
	
    public static final By ClickingOnDiscussColumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'discussColumn')]");
    }
	
    public static final By ClickingOnEndDateColumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'endDateColumn ')]");
    }
    
    public static final By ClickingOnfilesColumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'filesColumn ')]");
    }
	
    public static final By ClickingOnIDcolumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'kanbanCardID ')]");
    }
	
    public static final By ClickingOnHoldColumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'onHoldColumn')]");
    }
	
    public static final By ClickingOnOwnerColumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'ownerColumn ')]");
    }
	
    public static final By ClickingOnRiskColumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'riskColumn ')]");
    }
	
    public static final By ClickingOnStartDateColumn()
    {
    	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'startDateColumn ')]");
    }
	
	public static final By ClickingOnStickersColumn()
	{
		return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'stickersColumncls ')]");
	}
	
	
	public static final By IdInputfield()
	{
		return By.xpath("//input[@name='CardID']");
	}
	
	
	
	
	//following xpath for the owner column
	
	public static final By SearchforOwner()
	{
		return By.xpath("//input[@placeholder='Search for owner']");
	}
	
	public static final By ClickOnSearchTrigger()
	{
		return By.xpath("//div[contains(@class,'x-form-search-trigger')]");
	}
	
	public static final By SelectUser()
	{
		return By.xpath("//span[text()='Pratish Laad']");
	}
	
	public static final By CheckingOnHoldCheckbox()
	{
	   //return By.xpath("//td[contains(@class,'onHoldColumn ')]//img[contains(@class,'checked')]");
		
	//	return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'onHoldColumn')]//img");
		
		//return By.xpath("//td[contains(@class,'onHoldColumn ')]//img");
		
		//return By.xpath("//td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-onHoldColumn columnDesign x-unselectable x-grid-item-focused')]");
		
		return By.xpath("//td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-onHoldColumn columnDesign x-unselectable x-grid-item-focused')]//img");
	}
	
	public static final By CheckingRiskCheckbox()
	{
		return By.xpath("//td[contains(@class,'//td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-riskColumn columnDesign x-unselectable')]//img')]");
	}
	
	
	public static final By ClickOnRiskCheckboxColumn()
	{
		//return By.xpath("//table[contains(@id,'treeview-1086-record-503')]/tbody/tr/td[19]//img");//here we take dynamic id xpath need to change it b'coz above xpath not working due to Red at corner so xpath changed while checked and Unchecked. 
		
		//return By.xpath("//table[contains(@id,'treeview-1086-record-504')]/tbody/tr/td[contains(@class,'riskColumn ')]//img");
		
		return By.xpath("//table[contains(@class,'x-grid-item x-grid-item-selected')]/tbody/tr/td[contains(@class,'riskColumn ')]//img");
	}
	
	
	
	
	//following xpath for Adding the stickers
	
	public static final By Allstickersxpath()
	{
		//return By.xpath("//div[contains(@class,'stickerOverlayCls')]//div[@class='x-component x-component-default']/div");
		
		//return By.xpath("//div[contains(@class,'stickerOverlayCls')]//div[@class='x-component x-component-default']/div/div[position()<5]");
		
	  return By.xpath("//div[contains(@class,'stickerOverlayCls')]//div[@class='x-component x-component-default']/div/div/input[position()<5]");
		
		//return By.xpath("//div[contains(@class,'stickerOverlayCls')]//div[@class='x-component x-component-default']/div/div/input");
	}
	
	public static final By SaveButton()
	{
		return By.xpath("//div[contains(@class,'stickerOverlayCls')]//span[text()='Save']");
	}
	
	public static final By CancelButton()
	{
		return By.xpath("//div[contains(@class,'stickerOverlayCls')]//span[text()='Cancel']");
	}
	
	public static final By StickersOnKbCard()
	{
		return By.xpath("//div[@class='kanbancard ']/div/ul/li[1]/img");
	}
	
	public static final By ClickingOnPredecessorColumn()
	{
		return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[5]//tr/td[contains(@class,'predecessorcolumn ')]");
	}
	
	public static final By PredecessorColumnInputfield()
	{
		//return By.xpath("//input[contains(@id,'dependencyfield-')]");
		
		return By.xpath("//input[contains(@name,'dependencyfield-')]");
	}
	
	public static final By ClickOnPredecessorText()
	{
		return By.xpath("//span[text()='Predecessors']");
	}
	
	public static final By ClickingOnPredecessorColumnFromSecondCard()
	{
		return By.xpath("//div[@class='x-grid-scroll-container ']//div[@class='x-grid-item-container']/table[6]//tr/td[contains(@class,'predecessorcolumn ')]");
	}
	
	
}
