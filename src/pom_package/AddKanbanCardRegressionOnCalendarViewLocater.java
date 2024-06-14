package pom_package;

import org.openqa.selenium.By;

import helper_package.AddMilestoneOnMasterContainerInCVHelper;
import helper_package.AddToBoardFanButtonHelper;
import helper_package.AddKanbanCardRegressionOnCalendarViewHelper;
import helper_package.KanbanBoardSettingHelper;
import helper_package.ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper;

public class AddKanbanCardRegressionOnCalendarViewLocater {

	public static final By clickOnFolderIcon()
	{
		return By.className("addicon");
	}
	
	public static final By enterFolderName()
	{
		return By.xpath("//div[@id='ext-input-4']/input[@class='x-input-el x-input-text x-form-field searchFieldCls']");
	}
	
	public static final By clickOnAddButton()
	{
		return By.xpath("//div[@class='x-container x-panel x-layout-box-item x-stretched']/div[1]/div[2]");
	}	
	
	public static final By clickOnCreatedFolder()
	{
		return By.xpath("//*[text()='A Folder']");
	}
	
	public static final By clickOnThreeDots()
	{
		return By.xpath("//div[text()='A "+AddKanbanCardRegressionOnCalendarViewHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	}
	
	public static final By clickOnAddProject()
	{
		return By.xpath("//div[contains(text(),'Add Project')]");
	}
	
	public static final By enterProjectName()
	{
		return By.xpath("//div[@class='x-component-outer']/div[1]/input[@placeholder='New Project']");
	}
	
	public static final By clickOnProjectAddButton()
	{
		return By.xpath("//div[@class='x-button-normal x-button addBtnCls x-layout-box-item x-stretched']");
	}
	
	public static final By clickOnCreatedProject()
	{
			return By.xpath("//div[contains(text(),'"+ AddKanbanCardRegressionOnCalendarViewHelper.createProjectNameRandomly +"')]");
	}				
	
	//div[text()='PSggw']
	//Skip,Back,Next,Off window when enter on Created Project(After folder creation)
	
	public static final By clickOnSkipButtonWhenOpenCreatedProject()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Skip']");
	}
	
	public static final By clickOnBackButtonWhenOpenCreatedProject()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Back']");
	}
	
	public static final By clickOnNextButtonWhenOpenCreatedProject()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Next']");
	}
	
	public static final By clickOnOffButtonWhenOpenCreatedProject()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Off']");
	}	//Skip,Back,Next,Off window
	
	
	public static final By clickOnProjectBoardThreeDots()
	{
		return By.xpath("//div[contains(text(),'Project Boards')]/following-sibling::div[@class='lmenu']");
	}
	
	public static final By clickOnCreateKanbanBoardButton()
	{
		return By.xpath("//div[contains(text(),'Create Kanban Board')]");
	}
	
	public static final By enterKanbanBoardNameInputArea()
	{
		return By.xpath("//input[@placeholder='New Kanban Board']");
	}
	
	public static final By clickOnAddKanbanBoardButton()
	{
		return By.xpath("//div[@class='x-button-normal x-button addBtnCls x-layout-box-item x-stretched']");
	}
	
	public static final By openKanbanBoard()
	{
		//return By.xpath("//div[contains(text(),'Kanban Board1')]");
		return By.xpath("//div[contains(@id,'ext-simplelistitem-')]//div[text()='Kanban Board1']");
	}
	
	public static final By clickOn_KanbanBoardZoomIcon()
	{
		return By.id("zoomIcon");
	}
	
	
	public static final By clickOnCalenderViewIcon()
	{
		//return By.id("calenderViewBtn");
		return By.xpath("//div[contains(@class,'x-inner x-toolbar-inner x-horizontal x-align-center x-pack-start x-layout-box')]//div[@id='calenderViewBtn']");
		
	}
	
	//xpath for creating card on cv
	
	public static final By RightClickonMasterContainer()
	{
		//return By.xpath("//table[contains(@id,'treeview-1062-table')]/tbody/tr[3]/td/div[contains(@class,'x-grid-cell-inner x-grid-cell-inner-treecolumn')]");
		//return By.xpath("//div[@style='width: 279px; left: 0px; top: 45px; height: 792px;']/div/table/tbody/tr/td/div[@style='text-align:left;border-top: 7px solid #6666FF;border-left: 3px solid #6666FF;']");
		//return By.xpath("//table/tbody/tr[3]/td/div[@class='x-grid-cell-inner x-grid-cell-inner-treecolumn, mc-inner-class']");
		
		//return By.xpath("//div[contains(@class,'x-panel-body x-grid-body sch-ganttpanel-container-body x-panel-body-default x-border-layout-ct x-panel-body-default')]/div/child::div[2]/div/table/tbody/tr[3]/td");
		//return By.xpath("//table[@id='treeview-1062-table']/tbody[@id='treeview-1062-body']/tr[3]/td");
		
		//return By.xpath("//div[@id='panel-1186-body']//div[@id='ext-comp-1009-body']/div//div[@id='ext-comp-1009-locked-body']//table//tbody//tr[4]//td");
		//return By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[3]/td/div");
		
		return By.xpath("//table[@role='presentation' and @style='width: 280px;']/tbody/tr[3]");
	}
	
	public static final By RightClickOntemplateMasterContainer()
	{
		return By.xpath("//table[@role='presentation' and @style='width: 280px;']/tbody/tr[1]");
	}
	
	public static final By RightclickOnBacklogMasterContainer()
	{
		return By.xpath("//table[@role='presentation' and @style='width: 280px;']/tbody/tr[2]");
	}
	
	public static final By RightCliclickOnInprogressMasterContainer()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper x-grid-scrollbar-clipper-locked ']//div[@class='x-grid-item-container']/table[4]/tbody/tr");
	}
	
	public static final By RightClickOnReviewAndApproveMastercontainer()
	{
		return By.xpath("//table[@role='presentation' and @style='width: 280px;']/tbody/tr[4]");
	}
	
	public static final By RightClickOnDoneMasterContainer()
	{
		return By.xpath("//table[@role='presentation' and @style='width: 280px;']/tbody/tr[5]");
	}
	
	public static final By RightClickOnArchiveMasterContainer()
	{
		return By.xpath("//table[@role='presentation' and @style='width: 280px;']/tbody/tr[6]");
	}
	
	
	public static final  By RightClickOnInprogressMCOnTimelineView()
	{
		return By.xpath("//table[@role='presentation' and @style='width: 12810px;' ]/tbody/tr[3]");
	}
	
	public static final By clickOnAddCard()
	{
		return By.xpath("//span[text()='Add Card']");
	}
	
	public static final By enterCardTitle()
	{
		//return By.xpath("//input[@id='textfield-1119-inputEl']");
		return By.xpath("//input[@name='Name']");
	}
	
	public static final By enterEstimation()
	{
		return By.xpath("//input[@name='EstimatedDuration']");
	}
	
	public static final By ClickOnCategoryDownArrow()
	{
		//return By.xpath("//td[contains(@id,'combobox-1137-i')]/following-sibling::td");
		//return By.xpath("//input[@name='TemplateID']/parent::div/following-sibling::div");
		//return By.xpath("//input[@name='TemplateID']/parent::td/following-sibling::td");
		
		return By.xpath("//input[@name='TemplateID']/parent::td/following-sibling::td");
	}
	
	public static final By selectfinancecategory()
	{
		return By.xpath("//ul[@class='x-list-plain']/li[text()='Finance']");
	}
	
	public static final By selectHrCategory()
	{
		return By.xpath("//li[text()='HR']");
	}
	public static final By SelectCat1Category()
	{
		return By.xpath("//li[text()='cat1']");
	}
	
	
	public static final By ClickOnPriorityDownArrow()
	{
		//return By.xpath("//div[contains(@id,'taskeditor-')]//table[@id='combobox-1133-triggerWrap']/tbody/tr/td[2]");
		//return By.xpath("//input[@name='Priority']/parent::div/following-sibling::div");
		//return By.xpath("//input[@name='Priority']/parent::td/following-sibling::td");
		
		return By.xpath("//input[@name='Priority']/parent::td/following-sibling::td");//replace div by td
	}
	
	public static final By clickOnMediumPriority()
	{
		return By.xpath("//li[text()='Medium']");
	}
	
	public static final By clickonLowpriority()
	{
		return By.xpath("//li[text()='Low']");
	}
	
	public static final By ClickOnCriticalPriority()
	{
		return By.xpath("//li[text()='Critical']");
	}
	
	
	
	public static final By AssignOwnerDropdownArrow()
	{
		
		
		//return By.xpath("//input[@name='OwnerID']/parent::div/following-sibling::div");
		
		return By.xpath("//input[@name='OwnerID']/parent::td/following-sibling::td");
		
	}
	
	public static final By SearchUserInputfield()
	{
		
		return By.xpath("//input[@placeholder='Search for user']");
	}
	
	public static final By SearchIconGlass()
	{
		//return By.xpath("//input[@placeholder='Search for user']/parent::div/following-sibling::div[2]");
		return By.xpath("//input[@placeholder='Search for user']/parent::td/following-sibling::td[2]");//summer 24
	}
	
	public static final By SelectUser()
	{
		return By.xpath("//span[text()='Pratish Laad']");
	}
	
	public static final By enterDescriptionForCard()
	{
		return By.xpath("//textarea[@name='Description']");
	}
	
	
	public static final By percentcompleteArrow()
	{
		//return By.xpath("//input[@name='PercentDone']/parent::div/following-sibling::div/div[1]");
		
		return By.xpath("//input[@name='PercentDone']/parent::td/following-sibling::td/div[1]");
	}
	
	public static final By pointdropdown()
	{
		//return By.xpath("//input[@name='Point']/parent::div/following-sibling::div");
		return By.xpath("//input[@name='Point']/parent::td/following-sibling::td");
	}
	
	public static final By selectpointValue()
	{
		return By.xpath("//li[text()='5']");
	}
	
	public static final By selectanotherpointvalue()
	{
		return By.xpath("//li[text()='8']");
	}
	
	public static final By cardID()
	{
		return By.xpath("//input[@name='CardID']");
	}
	
	public static final By effortremaining()
	{
		return By.xpath("//input[@name='EffortRemaining']");
	}
	
	public static final By Allocation ()
	{
		//return By.xpath("//input[@name='Units']/parent::div/following-sibling::div/div[1]");
		
		return By.xpath("//input[@name='Units']/parent::td/following-sibling::td/div[1]");
	}
	
	public static final By fetchingDuedate()
	{
		return By.xpath("//input[@name='DueDate']");
		//return By.xpath("//table[@style='width: 100%; table-layout: fixed;']/tbody/tr/td/input[@name='DueDate']");
	}
	
	public static final By SaveCard()
	{
		//return By.xpath("//span[text()='Save']");
		//return By.xpath("//div[contains(@class,'x-toolbar-footer x-docked-bottom')]/div/div/a[3]//span[text()='Save']");
		//return By.xpath("/html/body/div[6]/div[3]/div/div/a[3]");
		//return By.xpath("//div[@class='x-toolbar x-docked x-toolbar-footer x-box-layout-ct']/div/div/a[3]");
		
		return By.xpath("//div[@class='x-window gnt-taskeditor-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']/child::div[3]//a[3]");
	}
	
	public static final By sizeofallMConCV()
	{
		//return By.xpath("//div[contains(@class,'x-tree-view sch-locked-horizontal-scroll x-fit-item x-tree-view-default x-unselectable')]//table//tbody//tr//td//div");
		//return By.xpath("//div[contains(@class,'x-tree-view sch-locked-horizontal-scroll x-fit-item x-tree-view-default x-unselectable')]/table/tbody/tr/td/div[@class='x-grid-cell-inner x-grid-cell-inner-treecolumn, mc-inner-class']");
		//return By.xpath("//tr[@class='x-grid-row x-grid-tree-node-expanded x-grid-data-row']");
		//return By.xpath("//tr[@class='x-grid-row x-grid-tree-node-expanded x-grid-data-row']//div[contains(@style,'text-align:left;border-top: 7px solid')]");
		//return By.xpath("//table[contains(@id,'treeview-1062-table')]//tr[@class='x-grid-row x-grid-tree-node-expanded x-grid-data-row']//div[contains(@style,'text-align:left;border-top: 7px solid')]");
		//return By.xpath("//table[@style='width: 280px;']/tbody/tr/td/div[@class='x-grid-cell-inner x-grid-cell-inner-treecolumn, mc-inner-class']");
		//return By.xpath("//table[@style='width: 280px;']/tbody/tr/td/div[@class='x-grid-cell-inner x-grid-cell-inner-treecolumn, mc-inner-class']/span[@class='x-tree-node-text ']");
		//return By.xpath("//table[@style='width: 280px;']/tbody/tr/td[contains(@id,'ext-gen35')]");
		//return By.xpath("//div[@style='width: 279px; left: 0px; top: 45px; height: 792px;']/div/table/tbody/tr");
		//return By.xpath("//div[@style='width: 279px; left: 0px; top: 45px; height: 792px;']/div/table/tbody/tr/td/div[@class='x-grid-cell-inner x-grid-cell-inner-treecolumn, mc-inner-class']");
		//return By.xpath("//div[@style='width: 279px; left: 0px; top: 45px; height: 792px;']/div/table/tbody/tr/td[contains(@class,'x-grid-cell-cardNameColumn')]");
		
		//return By.xpath("//div[contains(@class,'x-grid-cell-inner x-grid-cell-inner-treecolumn, mc-inner-class')]");
		
		//return By.xpath("//table[@role='presentation' and @style='width: 280px;']/tbody/tr[contains(@id,'treeview-1062-record-a0NB000000QYDp')]");
		return By.xpath("//div[contains(@style,'rgb(246, 246, 246); ')]/table[@role='presentation' and @style='width: 280px;']/tbody/tr[contains(@id,'treeview-')]");
		
		
	}
	
	public static final By loadmaskloadingafteropening()
	{
		//return By.id("loadmask-1189-msgTextEl");
		//return By.xpath("//div[text()='Loading...']");
		//return By.xpath("//div[@class='x-mask-msg-text'  and text()='Loading...']");
		
		return By.xpath("//div[text()='Loading...']");
	}
	//div[contains(@id,'ext-loadmask-')]
	public static final By alltable()
	{
		return By.id("/html/body/div[1]/div/div/div/div[1]/div/div/div");
	}
	
	public static final By verifycardowneroncard()
	{
		return By.tagName("img");
		
		//return By.xpath("//img[@title='sakharam Nilkhan']");
	}
	
	public static final By VerifycardTitle()
	{
		return By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div[1]/div[2]/div/table/tbody/tr[4]/td/div/span/div/div");
	}
	
	public static final By RightClickOnCard()
	{
		//return By.xpath("//table[@role='presentation' and @style='width: 735px;']/tbody/tr[5]/td/div/div/div[contains(@id,'ext-comp-1009-timelineview-')]");
		//return By.xpath("//table[@role='presentation' and @style='width: 12810px;']/tbody/tr[4]/td/div/div/div[contains(@class,'sch-gantt-item sch-gantt-task-bar')]");
		
		//return By.xpath("//div[@class='x-grid-item-container']/table[5]//div[contains(@id,'customGanttPanel-1049-timelineview-')]");
		
		//return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/following-sibling::table");
		
		return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/tbody/tr[4]");//summer 24
		
	}
	
	
	// xpath for editing the card on cv
	
	public static final By ClickOnEditCard()
	{
		//return By.xpath("//div[contains(@style,'height: 225px; width: 120px;')]//span[text()='Edit Card']");
		
	//	return By.xpath("//div[@class='x-menu-bodyWrap']//span[text()='Edit Card']/parent::a");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Edit Card']/parent::a");//summer24
	}
	
	public static final By ClickOnSchedulingMode()
	{
		return By.xpath("//input[@name='SchedulingMode']");
	}
	
	public static final By clickonEffortDrivenSchedulingMode()
	{
	  return By.xpath("//li[text()='Effort driven']");
	}
	
	public static final By ClickOnNormalSchedulingMode()
	{
		return By.xpath("//ul[contains(@id,'schedulingmodefield-')]/li[1]");
	}
	
	public static final By EstimationFieldVisibleornot()
	{
		//return By.xpath("//table[contains(@id,'durationfield-1120-triggerWrap')]");
		//return By.xpath("//table[contains(@id,'durationfield-1120')]/tbody/tr[@role='presentation']");
		
		return By.xpath("//input[@name='EstimatedDuration']/parent::div/following-sibling::div/div[1]");
	}
	
	public static final By DueDateFieldVisibleornot()
	{
		//return By.xpath("//table[contains(@id,'enddatefield-1124-triggerWrap')]");
		return By.xpath("//table[contains(@id,'enddatefield-1124')]/tbody/tr[@role='presentation']");
	}
	
	public static final By ClickingOnActualEffort()
	{
		
		//return By.xpath("//span[text()='Actual Effort:']/ancestor::label/following-sibling::div/div/child::div[2]/div[1]");
		
		return By.xpath("//label[text()='Actual Effort:']/ancestor::table//td[2]/table//td[2]/div[1]");
	}
	
	// xpath for chatter /Discuss on card
	public static final By ClickingonDiscuss()
	{
		//return By.xpath("//div[@class='x-menu-bodyWrap']//span[text()='Discuss']/parent::a");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Discuss']");//summer 24
	}
	
	public static final By inspectiframe()
	{
		//return By.xpath("//div[contains(@class,'x-window-body-default-closable x-window-body-default x-window-body-default-closable x-resizable x-window-body')]//iframe");
		return By.xpath("//div[contains(@class,'x-window-body x-window-body-default x-closable x-window-body-closable x-window-body-default-closable x-resizable x-window-body-resizable x-window-body-default-resizable')]//iframe");
	}
	
	public static final By iFrameSrcValueAndSwitchToframe()
	{
	   // return By.xpath("//iframe[@src='"+CreateCardsOnDifferentMasterContainersOnCVHelper.getIframeSRCAttribute+"']");
		
		return By.xpath("//iframe[@src='"+AddKanbanCardRegressionOnCalendarViewHelper.getIframeSRCAttribute+"']");
	}
	
	
	

	//public static final By iFrameSrcValueAndSwitchTo()
	//{
	//	return By.xpath("//iframe[@src='"+AddToBoardFanButtonHelper.getIframeSRCAttribute+"']");
	
	
	public static final By clickOnPostLink() 
	{
		return By.xpath("//span[text()='Post']");
	}
	
	public static final By afterClickOnPostLinkWindowsVisibility()
	{
		return By.xpath("//div[@class='publisherWrapper']");
	}
	
	public static final By inspectchildirframe()
	{
		return By.xpath("//iframe[contains(@title,'Rich Text Editor')]");
	}
	
	public static final By getChildiFrameClassAttributeValue()
	{
		return By.xpath("//iframe[@class='"+AddKanbanCardRegressionOnCalendarViewHelper.childIframevalue+"']");
	}
	
	public static final By ClickOnchatterTextarea()
	{
		return By.xpath("//body[text()='Write something...']");
	}
	
	public static final By writeOnChatterTextArea() 
	{
	 return By.xpath("//body[contains(@class,'chatterPublisherRTE')]");		
	}
	
	public static final By ClickOnshareButton()
	{
		return By.id("publishersharebutton");
	}
	
	public static final By textDivArea()
	{
		return By.xpath("//div[contains(@class,'cxfeeditem ')]");
	}
	
	public static final By getTextFromChatterSubWindow()//The value of the id attribute is being dynamically determined based on the value of the textAreaIDAttribute variable.
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"+AddMilestoneOnMasterContainerInCVHelper.textAreaIDAttribute+"']//div[@class='cxfeeditemtextwrapper']//p");
	}
	
	
	public static final By getTextFromChatterSubWindowforCard()//The value of the id attribute is being dynamically determined based on the value of the textAreaIDAttribute variable.
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"+AddKanbanCardRegressionOnCalendarViewHelper.textAreaIDAttribute+"']//div[@class='cxfeeditemtextwrapper']//p");
	}
	public static final By closeKanbanBoardChatterPopup()
	{
		//return By.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//div[@class='x-tool x-box-item x-tool-default x-tool-after-title']");
		return By.xpath("//div[contains(@class,'x-window-header x-header x-header-draggable x-docked x-unselectable')]//div[@class='x-tool x-box-item x-tool-default x-tool-after-title']");
	}
	
	
    //xpath for cloning the card on CV
	
	public static final By ClickOnCloneCard()
	{
		//return By.xpath("//div[@class='x-menu-bodyWrap']//span[text()='Clone Card']/parent::a");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Clone Card']/parent::a");//summer 24
	}
	
	public static final By ClonealltaskCheckbox()
	{
		
		//return By.xpath("//table[@style='table-layout: auto;']/tbody/tr/td[@class='x-form-item-body  x-form-cb-wrap']");
		//return By.xpath("//input[@checked='checked']");
		
		return By.xpath("//label[text()='Clone All Tasks:']/parent::td/following-sibling::td/input[@type='button']");//summer24
	}
	
	public static final By ClickonStartDate()
	{
		//return By.xpath("//div[@style='width: 300px; height: 170px; right: auto; left: 288px; top: 356px; z-index: 19001;']//table[2]/tbody/tr/td[2]");
		//return By.xpath("//div[@class='x-panel cloneCardFormCls x-window-item x-panel-default']//input[@name='StartDate']");
		
		return By.xpath("//label[text()='Start date:']/ancestor::tr/child::td[2]");
	}
	
	public static final By ClickonDueDate()
	{
		//return By.xpath("//div[@class='x-panel cloneCardFormCls x-window-item x-panel-default']//input[@name='DueDate']");
		
		return By.xpath("//label[text()='Due date:']/ancestor::tr/child::td[2]");//summer 24
	}
	
	public static final By picksatrtdatefromCalendarpopup()
	{
		//return By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell')]");//both printed
		//return By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell')]/a");
		
		//return By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td[contains(@class,'x-datepicker-selected')]");
		
		//return By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]");
		
		//return By.xpath("//table[@class='x-datepicker-inner']/tbody/tr/td[@title='Today']");
	    //	return By.xpath("//div[@class='x-datepicker-footer']/a");
		//return By.xpath("//table[contains(@class,'x-datepicker-inner x-focus x-datepicker-focus x-datepicker-default-focus')]/tbody/tr/td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]");
		
		//return By.xpath("//table[contains(@class,'x-datepicker-inner x-focus x-datepicker-focus x-datepicker-default-focus')]/tbody/tr/td[contains(@class,'x-datepicker-active x-datepicker-today ')]");
		
		return By.xpath("//div[@class='x-datepicker x-layer x-datepicker-default x-unselectable x-border-box']//table//td[@class='x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected']");
	}
	
	
	public static final By getAllRowElementsOfSelectDateCLoneCalendar()
	{
		return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td");
		
		//return By.xpath("//(td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td[position>7])");
		
		//return By.xpath("//div[@id='datefield-1270-picker-innerEl']//td[contains(@class,'x-datepicker-selected')]/parent::tr/child::td");
	}
	
	
	public static final By selectdatefromcalendarCloneOnNextRow()
	{
		return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/following::tr/td[3]");
	}
	
	public static final By SelectDateFromCalendarCloneOnNextRowformilestone()
	{
		return By.xpath("//table[contains(@class,'x-datepicker-inner')]//td[contains(@class,'x-datepicker-active x-datepicker-today x-datepicker-cell x-datepicker-selected')]/parent::tr/child::td/parent::tr/following::tr/td[3]");
	}
	
	
	
	
	
	
	
	
	/*
	public static final By selectdatefromcalendarCloneOnNextRowforStartDate()//this xpath for clonemilestoneby startdate while date not clickable it will pickup next row date
	{
		//return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/following::tr/td[3]");
		
		return By.xpath("//div[contains(@id,'datefield-1283-picker-innerEl')]//td[contains(@class,'x-datepicker-selected')]/parent::tr/following::tr/td[3]");
	 
	}

	
	
	public static final By selectdatefromcalendarCloneOnNextRowforDueDate()//this xpath for clonemilestoneby Due date while date not clickable it will pickup next row date
	{
		//return By.xpath("//td[contains(@class,'x-datepicker-selected')]/parent::tr/following::tr/td[3]");
		
		return By.xpath("//div[@id='datefield-1285-picker-innerEl']//td[contains(@class,'x-datepicker-selected')]/parent::tr/following::tr/td[3]");
	 
	}
	
	
	*/
	
	
	
	
	
	
	
	public static final By getAlldatefromAstartDateCalendarPopup()
	{
		return By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default x-unselectable x-border-box')]//table/tbody/tr/td");
	}
	
	public static final By clickOnCloneButton()
	{
		
		return By.xpath("//span[text()='Clone']/parent::span/parent::span/parent::a");
	}
	
	// xpath for Hierarchy
	
	public static final By clickonhierarchy()
	{
		//return By.xpath("//div[@class='x-menu-bodyWrap']//span[text()='Hierarchy']/parent::a");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Hierarchy']");
	}
	
	
	//xpath for Add Task on Card
	
	public static final By ClickOnaddTask()
	{
		//return By.xpath("//div[@class='x-menu-bodyWrap']//span[text()='Add Task']/parent::a");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Add Task']");
	}
	
	public static final By EnterSubject()
	{
		//return By.xpath("//input[@placeholder='Enter the Subject']");
		return By.xpath("//input[@placeholder='Enter the subject']");
	}
	
	public static final By EnterDescription()
	{
		return By.xpath("//textarea[@name='Description' and @name='Description' and @maxlength='32000']");
	}
	
	public static final By clickOnAssignOwner()
	{
		//return By.xpath("//input[@name='OwnerID']/parent::div/following-sibling::div[@id='combo-1272-trigger-picker']");
		//return By.xpath("//div[contains(@id,'taskEditorPanel-')]//input[@name='OwnerID']/parent::div/following-sibling::div");
		
		return By.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//input[@name='OwnerID']/parent::td/following-sibling::td");
	}
	
	public static final By clickonpriorityforTask()
	{
		//return By.xpath("//div[contains(@id,'taskEditorPanel-')]//input[@name='Priority']/parent::div/following-sibling::div");
		return By.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//input[@name='Priority']/parent::td/following-sibling::td");
	}
	
	public static final By SelectNormalPriority()
	{
		return By.xpath("//li[text()='Normal']");
	}
	
	public static final By SearchUserIninputFieldforTask()
	{
		return By.xpath("//input[@placeholder='Search for user']");
	}
	public static final By ClickONSEarchIcon()
	{
		//return By.xpath("//input[@placeholder='Search for user']/parent::div/following-sibling::div[2]");
		
		return By.xpath("//input[@placeholder='Search for user']/parent::td/following-sibling::td[2]");
	}
	public static final By SelectUserForTask()
	{
		return By.xpath("//span[text()='Pratish Laad']");
	}
	public static final By clickingOnStatusDropdown()
	{
		//return By.xpath("//input[@name='Status']/parent::div/following-sibling::div");
		
		return By.xpath("//input[@name='Status']/parent::td/following-sibling::td");
	}
	public static final By SelectInprogressStatusFromdropdown() 
	{
		return By.xpath("//li[text()='In Progress']");
	}
	public static final By taskSaveButton()
	{
		//return By.xpath("//div[contains(@id,'taskEditorPanel-')]//a[2]");
		
		return By.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//span[text()='Save']");
	}
	
	
	
	//xpath for Updating the task
	
	public static final By ClickOnTaskminiture()
	{
		//return By.xpath("//table[contains(@id,'customGanttPanel-1049-timelineview-')]/tbody/tr//div[@class='kanbantaskcls']/div");
	    //return By.xpath("//table[contains(@id,'customGanttPanel')]/tbody/tr//div[@class='kanbantaskcls']/div");
		
		return By.xpath("//table[@id='ext-comp-1009-timelineview-table']//div[@class='kanbantaskcls']/div");
	}
	
	public static final By clickoneditTask()
	{
		//return By.xpath("//div[contains(@id,'TaskListWindow-')]//table/tbody/tr/td[2]/div[@class='editLog editClick']");
		//return By.xpath("//div[contains(@id,'TaskListWindow-')]//table[@class='statusLog']//div[@class='editLog']");
		
		//return By.xpath("//div[contains(@id,'TaskListWindow-')]//table[contains(@class,'statusLog')]//div[contains(@class,'editLog')]");// spring 24
		
		return By.xpath("//div[contains(@class,'subscriberListCls ')]//table[contains(@class,'statusLog')]//div[contains(@class,'editLog')]");//summer 24
	}
	
	public static final By EnterSubjectForupdateTask()
	{
		//return By.xpath("//input[@placeholder='Enter the Subject']");
		
		return By.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//input[@name='Name']");//summer 24
	}
	public static final By EnterdescriptionforUpdateTask()
	{
		return By.xpath("//textarea[@name='Description' and @maxlength='32000']");
	}
	
	public static final By ClickOnpriorityForupdatetask()
	{
		
		return By.xpath("//div[@style='width: 500px; left: 0px; top: 20px; height: 241px;']//input[@name='Priority']/parent::td/following::td[1]");// use this later
		//return By.xpath("//div[contains(@id,'taskEditorPanel-')]//input[@name='Priority']/parent::div/following-sibling::div");
	}
	
	public static final By ClickonStatusDropdownforUpdateTask()
	{
		//return By.xpath("//input[@name='Status']/parent::div/following-sibling::div");
		return By.xpath("//input[@name='Status']/parent::td/following-sibling::td");
	}
	public static final By SelectHighPriority()
	{
		return By.xpath("//li[text()='High']");
	}
	
	public static final By SelectCompletedStatusFromdropdown()
	{
		return By.xpath("//li[text()='In Progress']");
	}
	
	public static final By ChatterOnedittask()
	{
		return By.xpath("//div[contains(@class,'subscriberListCls ')]/div/table/tbody/tr/td[3]/div[@class='chatterIcon']");
	}
	
	public static final By DeleteOnEDitTask()
	{
		return By.xpath("//div[contains(@class,'subscriberListCls ')]/div/table/tbody/tr/td[4]/div[@title='Delete Task']");
	}
	
	public static final By OnDeletepopupClickOnCancel()
	{
		//return By.xpath("//div[contains(@class,'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]/div[2]/div[2]/div/div/a[3]");
		
		return By.xpath("//div[contains(@class,'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]/child::div[3]/div/div/a[3]");//summer 24
	}
	
	//xpath for adding the files on card on Cv
	
	public static final By ClickonFiles()
	{
		//return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Files']/parent::a");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Files']");
	}
	public static final By salesforcefileuploadTab()
	{
		return By.xpath("//div[contains(@class,'x-panel x-box-item x-window-item x-panel-default')]//span[text()='Salesforce Files Upload']");
	}
	
	public static final By panelTab()
	{
		return By.xpath("//div[@class='x-panel x-panel-default-framed x-tabpanel-child']");
	}
	
	public static final By uploadImageOnFilesInputFieldArea()
	{
		
		return By.xpath("//input[@type='file']");
		
	}
	public static final By clickOnUploadButton()
	{
		return By.xpath("//span[text()='Upload']");
	}
	
	public static final By afterUploadButtonClick()
	{
		//return By.xpath("//div[contains(@id,'loadmask-')]");
		return By.xpath("//div[contains(@class,'x-mask-msg x-layer x-mask-msg-default x-border-box')]");
	}
	
	public static final By ClickonCrossPopUp()
	{
		//return By.xpath("/html/body/div[14]/div[1]/div/div/div/div[2]");
		
		//return By.xpath("//div[@style='width: 588px; height: 20px;']/div/div[@class='x-tool x-box-item x-tool-default x-tool-after-title']");
		
		return By.xpath("//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//div[@class='x-tool x-box-item x-tool-default x-tool-after-title']");
	}
	                      
	
	//xpath for Quick action
	
	public static final By CheckQuickActionCondition()
	{
	 //return By.xpath("//div[@class='x-menu-bodyWrap']//span[text()='Quick Actions']/parent::a");
	 
		//return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Quick Actions']");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-border-box']//span[text()='Change Date']");
	}
	
	public static final By ClickonChangeDate()
	{
		return By.xpath("//span[text()='Change Date']");
	}
	
	public static final By switchingIframe()
	{
		//return By.xpath("//iframe[@class='x-component x-fit-item x-window-item x-component-default']");
		return By.tagName("iframe");
	}
	public static final By StartdateAndDuatedatewindowisvisible()
	{
		return By.xpath("//div[@class='kanban-card-quickaction slds-scope']");
	}
	public static final By isStartDateCalendarVisible()
	{
		return By.xpath("//label[text()='Start Date']");
	}
	public static final By clickOnQuickActionDueDateCalendarField()
	{
		return By.xpath("//label[text()='Due Date']/following::input");
	}
	public static final By getSelectedDateFromQuickActionDueDateCalendar()
	{
		return By.xpath("//table[contains(@class,'slds-datepicker')]//tbody//td[@aria-selected='true']");
	}
	
	public static final By getAllRowElementsOfSelectDate()
	{
		return By.xpath("//td[@aria-selected='true']/parent::tr/child::td");
	}
	
	public static final By clickOnSaveButtonAfterDateSelectedOnQuickAction()
	{
		return By.xpath("//button[text()='Save']");
	}
	
	public static final By selectDateFromQuickActionCalendarOnNextRow()
	{
		return By.xpath("//td[@aria-selected='true']/parent::tr/following::tr/td[3]");
	}
	
	public static final By ClickOnDeleteButton()
	{
		//return By.xpath("//div[@class='x-menu-bodyWrap']//span[text()='Delete']/parent::a");
		
		return By.xpath("//div[@class='x-panel x-layer x-panel-default x-menu x-menu-plain x-border-box']//span[text()='Delete']");// summer 24
	}
	
	public static final By OnPopupSelectDeleteOption()
	{
		//return By.xpath("//div[@class='x-toolbar x-docked x-toolbar-footer x-box-layout-ct']/div/div/a[2]//span[text()='Delete']");
		
		//return By.xpath("//div[@role='alertdialog']/descendant::a[2]");
		
		return By.xpath("//div[@class='x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//a[2]");
	}
	
	public static final By clickOnYesOnDeleteAlltaskPopup()
	{
		return By.xpath("//span[text()='Yes']");
	}
	
	public static final By Allcategoryelements()
	{
		return By.xpath("//li[text()='Default']/parent::ul/child::li");
	}
	
	public static final By ClickOnZoomtoFitButton()
	{
		//return By.xpath("//table[@class='x-table-layout']/tbody/tr//div[text()='Zoom to fit']");
		
		return By.xpath("//div[@class='x-btn-group x-btn-group-default-framed x-box-item x-toolbar-item']//table[@class='x-table-layout']/tbody/tr//span[text()='Zoom to fit']");//summer24
	}
	
	public static final By enterDescriptionformileststone()
	{
		return By.xpath("//textarea[@name='Description']");
	}
	
	public static final By ClickonZoomTobutton()
	{
		return By.xpath("//table[@class='x-table-layout']/tbody/tr//div[text()='Zoom to fit']");
	}
	
	public static final By ClickOnMaskborder()
	{
		//return By.xpath("//div[@class='x-mask x-border-box']");
		return By.xpath("//div[@class='x-mask']");
	}
	
	public static final By RightClickOnCardfordeleting()
	{
		return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/following-sibling::table[1]");
	}

	
	public static final By clickONQuickAction()
	{
		return By.xpath("//div[contains(@id,'taskMenu-')]//span[text()='Quick Actions']");
	}
	
	
	
}
