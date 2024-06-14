package pom_package;

import org.openqa.selenium.By;

import helper_package.PlanGanttActivityAndKanbanCardLinkToActivityHelper;

public class PlanGanttActivityAndKanbanCardLinkToActivityLocator{
	
	public static final By clickOnFolderThreeDots()
	{
		//Linking of kanban cardActivity remember
		//return By.xpath("//div[text()='A "+LinkingOfcardAndActivityInconstraintsHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
		
		
		return By.xpath("//div[text()='A "+PlanGanttActivityAndKanbanCardLinkToActivityHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	}
	public static final By selectCategoryFromCategoryDropdownOperations()
	{
		return By.xpath("//div[text()='Operations']");
	}
	
	public static final By getSizeOfAllMaskLoader()
	{
		return By.xpath("//div[starts-with(@id,'ext-loadmask-')]");
	}
	
	public static final By Maskloader()

	{
		return By.xpath("//div[contains(@id,'loadmask-') and @class='x-mask-msg-text']]");
	}
	
	public static final By loadMaskiFrame() 
	{
		return By.xpath("//div[starts-with(@id,'"+PlanGanttActivityAndKanbanCardLinkToActivityHelper.idValueOfloadMaskIniFrame+"')]//div[@class='x-loading-spinner-outer']");
	}
	
	public static final By clickOn_KanbanBoardZoomIcon()
	{
		return By.id("zoomIcon");
	}
	
	public static final By clickOn_NavIconScroller()
	{
		//return By.xpath("//div[@id='ext-navigationSideMenu-1']/div/div[2]/span[contains(@class,'x-button-icon x-shown sidemanuicon')]");
		return By.xpath("//div[@class='x-unsized x-button menu x-dock-item x-docked-right x-has-height x-iconalign-center']");
	}
	
	public static final By clickOnPlanGanttOption()
	{
		//return By.xpath("//div[contains(@id,'ext-simplelistitem-77')]/div[2]/div/div[@class='columnname']");
		
		//return By.xpath("//div[contains(@id,'ext-simplelistitem-78')]/div[2]/div/div[@class='columnname']");//qa2
		
		//return By.xpath("//div[contains(@id,'ext-navigationSideMenu-')]//div[text()='Plan Gantt']");
		
		return By.xpath("//div[contains(@id,'ext-navigationSideMenu-')]//div[contains(text(),'Plan')]");
		
	}
	
	public static final By clickOnPlusIconToAddActivity()
	{
		return By.xpath("//span[@class='addBtnTop']");
		//return By.xpath("//div[contains(@id,'customganttpanel-1011-locked-bodyWrap')]//span[@class='addBtnTop']");
		//return By.xpath("//div[@id='ganttcolumn-name-1020-textContainerEl']//div[@class='x-column-header-text']/span[@data-ref='textInnerEl']/span[1]");
	}
	
	public static final By addActivityDivGetIdAttributeValue()
	{
		/*String idAttributeValueOfATag = findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.addActivityDivGetIdAttributeValue()).getAttribute("id");
		System.out.println("a tag id attribute value : "+idAttributeValueOfATag);//9,13
		
		String idValue = idAttributeValueOfATag.substring(9,13);
		System.out.println("individual id value : "+idValue);*/
		return By.xpath("//a[@id='menuitem-1231-itemEl']");
	}
	
	public static final By AddNewActivityButton()
	{		
		return By.xpath("//*[text()='Add Activity']");
	}
	
	public static final By editCreatedActivityName()
	{
		return By.xpath("//*[contains(@style,'width: 635px; transform: translate3d(0px, 0px, 0px);')]/table/tbody/tr/td[3]/div/span[1]");
	}
	
	public static final By writeActivityNameInputField()
	{
		 //return By.xpath("textfield-1020-inputEl");// Ctrl shift p
	   	 //return By.xpath("//input[@id='textfield-1030-inputEl']");
		 //return By.xpath("//div[contains(@id,'textfield-1020-inputWrap')]/child::input");
	     //return By.xpath("//input[@id='textfield-1020-inputEl']");
		
		return By.xpath("//input[@id='textfield-1030-inputEl']");
	}
	
	public static final By clickOwnerImage()
	{
		return By.xpath("//td[@style='width:40px;']");
	}
	
	public static final By clickOnKanbanCardEditButton()
	{
		return By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div[1]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]");
	}
	
	public static final By kanbanCardSideColumnLinkOption()
	{
		return By.xpath("//div[text()='Link']");
	}
	
	public static final By clickOnLinkToProject()
	{
		return By.xpath("//div[@class='x-scroll-container x-translatable-container x-paint-monitored x-size-monitored']/div[1]/div[5]//div[@class='x-dock-body']");
		//return By.xpath("//div[@class='x-scroll-container x-translatable-container x-paint-monitored x-size-monitored']/div[1]/div[5]//div[@class='x-dock-body']");
	}
	
	public static final By selectFolderNameFromTheList()
	{
		return By.xpath("//div[text()='A "+PlanGanttActivityAndKanbanCardLinkToActivityHelper.createFolderNameRandomly+"']");
	}
	
	public static final By clickOnProjectNameAfterFolderOpen()
	{
		//QA6 and spring23  ,summer 24
	//	return By.xpath("//*[contains(@id,'ext-accordionlist-')]//div[@style='padding-left: 1.5em;']"); 
		
		//Qa9//spring24
	   return By.xpath("//*[contains(@id,'ext-accordionlist-')]//div[@style='padding-left: 1em;']");
		
	//	return By.xpath("//*[contains(@id,'ext-accordionlist-')]//div[@style='padding-left: 1.5em;']");
		
		
	}
	
	public static final By clickOnLinkToProjectBoard()//below Myselfxpat
	{
		return By.xpath("//form[@class='x-container x-form x-paint-monitored x-sized newpostBackground x-layout-card-item']/div/div[2]/div/div[6]/div/div/div/div[@class='x-dock-body']");
	}
	
	public static final By clickOnPlanGanttName()
	{
		return By.xpath("//p[@title='Plan Board(Project P1)']");
	}
	
	public static final By clickOnLinkToCard()
	{
		return By.xpath("//form[@class='x-container x-form x-paint-monitored x-sized newpostBackground x-layout-card-item']/div/div[2]/div/div[7]/div/div/div/div[@class='x-dock-body']");
	}
	
	public static final By selectActivityName()
	{
		return By.xpath("//p[@title='Default']");
	}
	
	public static final By clickOnKanbanCardSaveButton()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	public static final By planGanttSettingGearIcon()
	{
		//return By.id("combo-1070-triggerWrap");
		//return By.id("combo-1313-trigger-picker");
		//return By.id("combo-1293-trigger-picker");
		
		//return By.id("combo-1313-trigger-picker");
		
		//return By.xpath("//div[@class='x-form-trigger x-form-trigger-default x-form-arrow-trigger x-form-arrow-trigger-default ']");
		
		return By.id("combo-1323-trigger-picker");
		
	}
	
	public static final By planGanttZoomToFit()
	{
		//return By.xpath("//span[contains(@id,'button-1072-btnWrap')]");
		  return By.xpath("//li[contains(text(),'Zoom to Fit')]");
		
		//return By.xpath("//li[contains(text(),'Zoom to fit')]");
	}
	
	public static final By linkToCardSearchField()
	{
		return By.xpath("//input[@placeholder='Search by Card Name...']");
	}
	
	public static final By templateMasterContainerNameHeading()
	{
		return By.xpath("//ul[@id='heading-master-container']/li[contains(text(),'Template')]");
	}
	
	public static final By inprogressMasterContainerNameHeading()
	{
		return By.xpath("//ul[@id='heading-master-container']//li[contains(text(),'In Progress')]");
	}	
	
	public static final By templateMasterContainerZone()
	{
		return By.id("ext-zonePanel-31");
	}
	
	public static final By inProgressMasterContainerArea()
	{
		return By.id("ext-zonePanel-33");
	}
	
	public static final By reviewAndApprovalMasterContainerZone()
	{
		return By.id("ext-zonePanel-34");
	}
	
	public static final By doneMasterContainerZone()
	{
		return By.id("ext-zonePanel-35");
	}
	
	public static final By archiveMasterContainerZone()
	{
		return By.id("ext-zonePanel-36");
	}
	
	public static final By stickerIcon()
	{
		return By.id("stickerFanBtn");
	}
	
	public static final By selectUserAfterSearch()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	public static final By iFrameAttributeValue()
	{
		return By.id("f970c7f75c07b808ebecf702c4f6ae6c");
	}
	public static final By clickONZoomOfPlanGntt()
	{
		return By.xpath("//span[@id='button-1072-btnWrap']");
	}
	
	public static final By CustonGanttPanel()
	{
		return By.xpath("//div[contains(@id,'customganttpanel-1011-bodyWrap')]");
	}
	public static final By ToseeMinature()
	{
		return By.xpath("/html/body/div[2]/div/div/div[4]/div[1]/div[3]/div/div[2]/table[2]/tbody/tr/td/div/div/div[2]/div[2]/div[2]/div");
	}
	
	public static final By MoveTOtemplate()
	{
		return By.xpath("//div[contains(@id,'ext-component-2')]");
	}
	
	
}