package pom_package;

import org.openqa.selenium.By;

import helper_package.CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper;
import helper_package.CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper;

public class CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator {

	public static final By clickOnThreeDots() {
		return By.xpath("//div[text()='A "
				+ CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper.createFolderNameRandomly
				+ "']/following-sibling::div[@class='lmenu']");
	}

	public static final By clickOnCreatedProject() {
		return By.xpath("//div[contains(text(),'"
				+ CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper.createProjectNameRandomly + "')]");
	}

	public static final By addNewActivity() {
		return By.xpath("//div[@class='x-menu-item x-menu-item-default x-box-item']//span[text()='Add Activity']");
	}

	public static final By clickOnAddButton() {
		return By.xpath(
				"//span[text()='Activity1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Add']");
	}

	public static final By clickOnAddButtonOnMilestone() {
		return By.xpath(
				"//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Add']");
	}

	public static final By addActivityAbove() {
		// return By.xpath("//div[contains(@class,'x-menu
		// subMenu1')]//span[text()='Activity Above']");
		return By.xpath(
				"//div[contains(@class,'x-box-inner x-box-scroller-body-vertical x-scroller')]//span[text()='Activity Above']");
	}

	public static final By addActivityBelow() {
		// return By.xpath("//div[contains(@class,'x-menu
		// subMenu1')]//span[text()='Activity Below']");

		return By.xpath(
				"//div[contains(@class,'x-box-inner x-box-scroller-body-vertical x-scroller')]//span[text()='Activity Below']");
	}

	public static final By addMilestone() {
		// return By.xpath("//div[contains(@class,'x-menu
		// subMenu1')]//span[text()='Milestone']");
		return By.xpath(
				"//div[contains(@class,'x-box-inner x-box-scroller-body-vertical x-scroller')]//span[text()='Milestone']");
	}

	public static final By addActivityGroup() {
		// return By.xpath("//div[contains(@class,'x-menu
		// subMenu1')]//span[text()='Activity Group']");
		return By.xpath(
				"//div[contains(@class,'x-box-inner x-box-scroller-body-vertical x-scroller')]//span[text()='Activity Group']");
	}

	// following xpath for Discuss on activity

	public static final By clickOnDiscussColumn() {
		return By.xpath(
				"//span[text()='Activity1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Discuss']");
	}

	public static final By clickOnDiscussColumnonmilestone() {
		return By.xpath(
				"//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Discuss']");
	}

	public static final By iFrameSrcValueAndSwitchToframe() {
		// return
		// By.xpath("//iframe[@src='"+CreateCardsOnDifferentMasterContainersOnCVHelper.getIframeSRCAttribute+"']");

		return By.xpath("//iframe[@src='"
				+ CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper.getIframeSRCAttribute + "']");
	}

	public static final By iFrameSrcValueAndSwitchToframeMile() {
		// return
		// By.xpath("//iframe[@src='"+CreateCardsOnDifferentMasterContainersOnCVHelper.getIframeSRCAttribute+"']");

		return By.xpath("//iframe[@src='"
				+ CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.getIframeSRCAttribute + "']");
	}

	public static final By clickOnPostWriteSomething() {
		// return
		// By.xpath("//div[@id='chatterfeedshell']//div[@class='publisherTextAreaInner']/textarea");
		return By.xpath("//div[@class='publisherWrapper']");
	}

	public static final By getChildiFrameClassAttributeValue() {
		return By.xpath("//iframe[@class='"
				+ CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper.childIframevalue + "']");
	}

	public static final By getTextFromChatterSubWindowofActivity()// The value of the id attribute is being dynamically
																	// determined based on the value of the
																	// textAreaIDAttribute variable.
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"
				+ CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper.textAreaIDAttribute
				+ "']//div[@class='cxfeeditemtextwrapper']//p");
	}

	public static final By getTextFromChatterSubWindowofMilestone()// The value of the id attribute is being dynamically
																	// determined based on the value of the
																	// textAreaIDAttribute variable.
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"
				+ CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.textAreaIDAttribute
				+ "']//div[@class='cxfeeditemtextwrapper']//p");
	}

	public static final By inspectiframe() {
		// return By.xpath("//div[contains(@class,'x-window-body-default-closable
		// x-window-body-default x-window-body-default-closable x-resizable
		// x-window-body')]//iframe");
		// return By.xpath("//div[@class='x-window x-layer x-window-default x-closable
		// x-window-closable x-window-default-closable x-border-box x-resizable
		// x-window-resizable x-window-default-resizable']//iframe");

		return By.xpath("//div[@class='x-window-bodyWrap']//iframe");
	}

	public static final By convertToActivityGroup() {
		return By.xpath(
				"//span[text()='Activity1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Convert to Activity Group']");
	}

	public static final By convertToActivityformilestone() {
		// return
		// By.xpath("//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu
		// launchBoardMenuCls x-layer x-menu-default
		// x-border-box'][1]//span[text()='Convert to Activity Group']");
		return By.xpath(
				"//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box']/div/div/div/div/child::div[4]");
	}

	public static final By clickOnActivityBelow() {
		// return
		// By.xpath("//span[text()='ActivityBelow']/parent::span/following-sibling::span");

		return By.xpath("(//span[text()='ActivityBelow']/parent::span/following-sibling::span)[1]");// suite
	}

	public static final By clickOnmilestone1() {
		// return
		// By.xpath("//span[text()='milestone1']/parent::span/following-sibling::span");
		return By.xpath(
				"//div[@class='x-grid-item-container']//table//span[text()='milestone1']/parent::span/following-sibling::span");
	}

	public static final By clickOnIndent() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Indent']");
	}

	public static final By clickOnOutdent() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Outdent']");
	}

	public static final By savingChangesLoadmask() {
		return By.xpath("//div[contains(@id,'loadmask-')]//div[text()='saving changes...']");
	}

	public static final By clickOnExternalDependency() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='External Dependency']");
	}

	public static final By clickOnQuickActions() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Quick Actions']");
	}

	public static final By clickOnCloneOptions() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Clone']");
	}

	public static final By Loadmaskloader() {
		return By.xpath("//div[contains(@id,'loadmask-')]//div[text()='Loading...']");
	}

	public static final By deleteOptionOnActivity() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Delete']");
	}

	public static final By clickOnfirstActivity() {
		return By.xpath(
				"//div[@class='x-grid-item-container']//table[4]//tr//span[text()='ActivityBelow']/parent::span/following-sibling::span");
	}

	public static final By selectNoOptions() {
		return By.xpath("//div[contains(@class,'alertMsgCls')]//a[3]");
	}

	public static final By selectYesOptions() {
		return By.xpath("//div[contains(@class,'alertMsgCls')]//a[2]");
	}

	public static final By deletingLoadmask() {
		return By.xpath("//div[contains(@id,'loadmask-')]//div[text()='Deleting...']");
	}

	public static final By activityhighlighting() {
		return By.xpath("//div[@class='task-body-parent-custom projectgantt highlight-task-cls']");
	}

	public static final By maskloadofduplicatewindow() {
		return By.xpath("//div[@class='x-component x-border-box x-mask x-component-default']");
	}

	public static final By convertToActivity() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Convert to Activity']");
	}

	// following xpath for converting activity into milestone

	public static final By converttomilestone() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Convert to Milestone']");
	}

	public static final By clickOnmilestone() {
		return By.xpath("//span[text()='milestone1']/parent::span/following-sibling::span");
		// return
		// By.xpath("(//span[text()='milestone1']/parent::span/following-sibling::span)[2]");

	}

	public static final By OnIndent() {
		return By.xpath("//span[text()='Indent']");
	}

	public static final By deleteOptionOnMilestone() {
		return By.xpath(
				"//span[text()='ActivityBelow']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Delete']");
	}

	public static final By milestoneHighlighting() {
		return By.xpath("//div[@class='x-grid-item-container']//img[contains(@class,'highlight-task-cls')]");
	}

	public static final By threedotOnMilestone() {
		return By.xpath("//span[text()='milestone1']/parent::span/following-sibling::span");
	}

	public static final By plusIconforPDG() {
		return By.xpath("//div[contains(@id,'ganttcolumn')]//span[@name='addButton']");
	}

	// following xpath for quick actions

	public static final By clickQuickActionsOnActivity() {
		return By.xpath(
				"//span[text()='Activity1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Quick Actions']");

		// return
		// By.xpath("//span[text()='Activity1']/ancestor::body/child::div[@class='x-menu
		// launchBoardMenuCls x-layer x-menu-default
		// x-border-box']//div[@id='quickActionSubMenu']");
	}

	public static final By clickQuickActionsOnMilestone() {
		return By.xpath(
				"//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Quick Actions']");

	}

	public static final By quickActionCheckCondition() {

		return By.xpath(
				"//span[text()='Activity1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box']//div[@id='quickActionSubMenu']/a");
	}

	public static final By quickActionCheckConditionOnMilestone() {

		return By.xpath(
				"//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box']//div[@id='quickActionSubMenu']/a");
	}

	public static final By clickOnChangeDatequickActionsOnActivity() {
		return By.xpath("//span[text()='Change Date']");
	}

	public static final By isChangeDateWindowVisible() {
		// return By.xpath("//div[@id='lightning']");

		// return By.xpath("//div[@class='kanban-card-quickaction
		// slds-scope']/child::div[2]");

		return By.xpath("//html[@class=' ext-strict']");
	}

	public static final By iframeOnQuickActions() {
		return By.xpath("//div[@id='oDialogBox']//iframe");
	}

	public static final By Activity1Displayed() {
		return By.xpath("//span[text()='Activity1']");
	}

	public static final By iframeAfterSaveonQuickActivon() {
		return By.xpath("//iframe[@name='boardIfram']");
	}

	// following xpath for discuss tab

	public static final By inspectchildirframe() {
		return By.xpath("//iframe[contains(@title,'Rich Text Editor')]");
	}

	public static final By ClickOnchatterTextarea() {
		return By.xpath("//body[text()='Write something...']");
	}

	public static final By writeOnChatterTextArea() {
		return By.xpath("//body[contains(@class,'chatterPublisherRTE')]");
	}

	public static final By ClickOnshareButton() {
		return By.id("publishersharebutton");
	}

	public static final By textDivArea() {
		return By.xpath("//div[contains(@class,'cxfeeditem ')]");
	}

	public static final By closeKanbanBoardChatterPopup() {
		return By.xpath(
				"//div[@class='x-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-resizable x-window-resizable x-window-default-resizable']//div[@class='x-tool x-box-item x-tool-default x-tool-after-title']");
		// return By.xpath("//div[contains(@class,'x-window-header x-header
		// x-header-draggable x-docked x-unselectable')]//div[@class='x-tool x-box-item
		// x-tool-default x-tool-after-title']");
	}

	// quick Actin

	public static final By isStartDateCalendarVisibleUnderiFrame() {
		return By.xpath("//label[text()='Start Date']");
	}

	public static final By clickOnQuickActionDueDateCalendarField() {
		return By.xpath("//label[text()='Due Date']/following::input");
	}

	public static final By dueDateQuickActionCalendarAfterOnClick() {
		return By.xpath("//div[contains(@class,'slds-datepicker')]");
	}

	public static final By getSelectedDateFromQuickActionDueDateCalendar() {
		return By.xpath("//div[contains(@class,'slds-datepicker')]//tbody//td[@aria-selected='true']");
	}

	public static final By getAllRowElementsOfSelectDate() {
		return By.xpath("//td[@aria-selected='true']/parent::tr/child::td");
	}

	public static final By clickOnSaveButtonAfterDateSelectedOnQuickAction() {
		return By.xpath("//button[text()='Save']");
	}

	public static final By selectDateFromQuickActionCalendarOnNextRow() {
		return By.xpath("//td[@aria-selected='true']/parent::tr/following::tr/td[3]");
	}

	public static final By loadMaskCountForKanbanBoard() {
		return By.xpath(
				"//div[contains(@id,'ext-viewport')]//div[contains(@id,'ext-loadmask-')]//div[contains(@class,'-spinner-outer')]");
	}

	public static final By clickOnPostLink() {
		return By.xpath("//span[text()='Post']");
	}

	public static final By loadSpinnerForSavingChanges() {
		return By.xpath("//div[contains(@id,'loadmask-')]//div[text()='saving changes...']");
	}

	public static final By activityList() {
		return By.xpath(
				"//div[@class='x-grid-scrollbar-clipper x-grid-scrollbar-clipper-locked ']//div[@class='x-grid-item-container']/table");
	}

}
