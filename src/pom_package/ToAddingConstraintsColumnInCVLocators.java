package pom_package;

import org.openqa.selenium.By;

import helper_package.ToAddingConstraintsColumnInCVHelper;

public class ToAddingConstraintsColumnInCVLocators {
	
	

public static final By clickOnThreeDots()
{
	return By.xpath("//div[text()='A "+ToAddingConstraintsColumnInCVHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
} 

public static final By clickOnCreatedProject()
{
    return By.xpath("//div[contains(text(),'"+ ToAddingConstraintsColumnInCVHelper.createProjectNameRandomly +"')]");
}

public static final By MoveOnCardDetailsfirstcolumns()
{
	//return By.xpath("//div[contains(@class,'x-column-header x-column-header-align-left x-box-item x-column-header-default x-unselectable x-column-header-first')]");
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Card Detail']");
}

public static final By CardDetailtrigger()
{
	//return By.xpath("//div[contains(@class,'x-column-header x-column-header-align-left x-box-item x-column-header-default x-unselectable x-column-header-first')]/div/child::div[2]");
	
	return By.xpath("//div[@class='x-column-header x-column-header-align-left x-box-item x-column-header-default x-unselectable x-column-header-first x-column-header-last']/div/div");
}

public static final By AllpopupElementSizeOfconstarintcolumn()
{
	//return By.xpath("//div[@class='x-menu x-layer x-menu-default x-border-box']/div/div/div[3]/div/div[position()>5]");
	
//	return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-border-box']/div/div[2]/div/div[position()>7]");
	
	//return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-border-box']/div/div[2]/div/div[position()>7]/a/span");
	
	//return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-border-box']//div[contains(@id,'menuitem-')]/a//span");
	
	return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-border-box']//div[contains(@id,'menuitem-')][position()>5]/a//span");
	
	
}

public static final By CardDetailfirstElement()
{
	//return By.xpath("//div[@style='border-width: 1px; width: 220px; left: 0px; margin: 0px; top: 0px; cursor: col-resize; height: 55px;']");
	
	//return By.xpath("//div[contains(@style,'border-width: 1px; width: 220px; left: 0px; margin: 0px; top: 0px; ')]");
	//return By.xpath("//div[@title='Card Detail']/parent::div");
	
//return By.xpath("//span[text()='Card Detail']");
	//return By.xpath("//span[text()='Card Detail']/ancestor::div[contains(@class,'x-column-header-text-container')]");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Card Detail']");
}

public static final By firsttriggerElement()
{
	//return By.xpath("//div[@id='ganttcolumn-name-1051-triggerEl']");
	return By.xpath("//div[@id='namecolumn-1039-triggerEl']");
}

public static final By removingAllConstraintColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-1085-in')]/div/div/following-sibling::div[position()>1]");
}


//following xpath for removing the constraints column

public static final By removingPercentageconstraintColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-1085-innerCt')]//span[text()='% Done']");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='% Done']");
}

public static final By triggerremovingPercentageconstraintColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='% Done']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='% Done']/parent::div/div");//summer 24
}

public static final By ClickOnRemoveColumn()
{
	//return By.xpath("//div[@class='x-box-inner x-box-scroller-body-vertical x-scroller']//div//span[text()='Remove Column'][position()<2]");
	
	return By.xpath("//div[@class='x-component x-box-item x-component-default x-menu-item']//a//span[text()='Remove Column'][position()<2]");
}

public static final By removingAssignresourceColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Assigned Resources']");
}

public static final By triggerremovingAssignresourceColumn()
{
   //return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Assigned Resources']/parent::div/parent::div/parent::div/following-sibling::div");
   
   return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Assigned Resources']/parent::div/div");
}

public static final By removingCategoryColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Category']");
	
	
	
	
}

public static final By triggerremovingCategoryColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Category']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Category']/parent::div/div");
}

public static final By removingConstraintColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Constraints']");
}

public static final By triggerremovingConstraintColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Constraints']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Constraints']/parent::div/div");
}

public static final By removingDiscussColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Discuss']");
}

public static final By triggerremovingDiscussColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Discuss']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Discuss']/parent::div/div");
}

public static final By removingEarlyEndColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Early End']");
}
public static final By  triggerremovingEarlyEndColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Early End']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Early End']/parent::div/div");
}

public static final By removingEarlyStartColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Early Start']");
}

public static final By triggerremovingEarlyStartColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Early Start']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Early Start']/parent::div/div");
}

public static final By removingEndColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='End']");
}
public static final By triggerremovingEndColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='End']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='End']/parent::div/div");
}
public static final By removingFilesColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Files']");
}
 public static final By triggerremovingFilesColumn()
 {
	 //return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Files']/parent::div/parent::div/parent::div/following-sibling::div");
	 
	 return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Files']/parent::div/div");
 }
 public static final By removingIDcolumn()
 {
	 return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Id']");
 }
 public static final By triggerremovingIdcolumn()
 {
	 //return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Id']/parent::div/parent::div/parent::div/following-sibling::div");
	 
	 return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Id']/parent::div/div");
 }
 public static final By removingLateEndcolumn()
 {
	 return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Late End']");
 }
public static final By triggerremovingLateEndColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Late End']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Late End']/parent::div/div");
}
public static final By removinglatestartcolumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Late Start']");
}

public static final By triggerremovingLatestartcolumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Late Start']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Late Start']/parent::div/div");
	
}

public static final By removingOnHoldcolumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='On Hold']");
}

public static final By triggerremovingOnHoldColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='On Hold']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='On Hold']/parent::div/div");
}

public static final By removingOwnerColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[@class='owner-header-cls']");
}

public static final By triggerremovingOwnerColumn()//for owner we take different xpath 
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[@class='owner-header-cls']/parent::span/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[@class='owner-header-cls']/parent::span/div");
}

public static final By removingpredecessorColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Predecessors']");
}

public static final By triggerremovingpredecessorColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Predecessors']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Predecessors']/parent::div/div");
}

public static final By removingPriorityColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Priority']");
}

public static final By triggerremovingPriorityColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Priority']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Priority']/parent::div/div");
}

public static final By removingRiskColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Risk']");
}

public static final By triggerremovingRiskColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Risk']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Risk']/parent::div/div");
}

public static final By removeSequenceColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Sequence']");
}

public static final By triggerremoveSequenceColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Sequence']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Sequence']/parent::div/div");
}

public static final By removeStartColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Start']");
}

public static final By triggerremoveStartColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Start']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Start']/parent::div/div");
}

public static final By removeStickersColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Stickers']");
}

public static final By triggerremoveStickersColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Stickers']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Stickers']/parent::div/div");
}

 public static final By removeSuccessorsColumn()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Successors']");
}

public static final By triggerremoveSuccessorsColumn()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Successors']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Successors']/parent::div/div");
}

public static final By removeTimeToLaunch()
{
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Time To Launch']");
}

public static final By triggerremoveTimetoLaunch()
{
	//return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Time To Launch']/parent::div/parent::div/parent::div/following-sibling::div");
	
	return By.xpath("//div[contains(@id,'headercontainer-')]//span[text()='Time To Launch']/parent::div/div");
}

public static final By splitterBarOnCalendarView()
{
	//return By.xpath("//div[contains(@id,'customGanttPanel-')]//div[contains(@class,'x-splitter sch-timelinepanel-splitter x-border-item x-box-item x-splitter-default x-splitter')]");
	
	return By.xpath("//div[contains(@id,'example-description')]//div[contains(@class,'x-splitter x-border-item x-box-item x-splitter-default x-splitter-vertical x-unselectable')]");
	
}

public static final By dividerBar()
{
	return By.xpath("//div[contains(@class,'customGanttPanelCls ')]//div[contains(@class,'x-splitter sch-timelinepanel-splitter x-border-item x-box-item x-splitter-default x-splitter')]");
}







}

