package pom_package;

import org.openqa.selenium.By;
import helper_package.KanbanBoardRegressionHelper;


public class KanbanBoardRegressionLocators extends KanbanBoardRegressionHelper {

	
	/*public KanbanBoardRegressionLocators(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

	public static final By guideWindow()
	{
		return By.xpath("//div[@class='introjs-tooltip']");
	}
	
	public static final By clickOnSkipButtonOnGuideWindow()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Skip']");
	}
	
	public static final By clickOnBackButtonOnGuideWindow()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Back']");
	}
	
	public static final By clickOnNextButtonOnGuideWindow()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Next']");
	}
	
	public static final By clickOnOffButtonOnGuideWindow()
	{
		return By.xpath("//div[@class='introjs-tooltip']/div[@class='introjs-tooltipbuttons']/a[text()='Off']");
	}
	
	public static final By leankorLeftNavigation()
	{
		return By.xpath("//div[contains(@class,'navigationview-inner')]");
	}
	
	
	public static final By clickOnFolderIcon()
	{
		//return By.className("addicon");
		
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
		return By.xpath("//*[text()='Regression Folder']");
	}
	
	public static final By clickOnThreeDots()
	{
		return By.xpath("//div[text()='Regression Folder']/following-sibling::div[@class='lmenu']");
	}	
	
	public static final By clickOnAddProject()
	{
		//return By.xpath("//div[@class='x-innerhtml ']/div[contains(text(),'Add Project')]");
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
		return By.xpath("//div[text()='Regression Project']");
	}
	
	//Project setup for created Project
	public static final By clickOnProjectSetupUnderCreatedProject()
	{
		return By.xpath("//div[text()='Project Setup']");
	}
	
	public static final By checkAssignActivityResourceUnderProjectSetup()
	{
		return By.xpath("//div[contains(@class,'bPageBlock')]//div[@id='j_id0:page:j_id3:j_id36:0:j_id37']/div[2]//tr[6]/td[2]//input");
	}
	
	public static final By checkRollupCheckBox()
	{
		return By.xpath("//div[@class='pbSubsection']/table[@class='detailList']//table[@class='list slds-vf-data-table']/tbody/tr[2]/td[2]/input");
	}
	
	public static final By checkProjectBoardOpenInANewTabCheckBox()
	{
		return By.xpath("//div[@class='pbSubsection']/table[@class='detailList']//table[@class='list slds-vf-data-table']/tbody/tr[3]/td[4]/input");
	}
	
	public static final By clickOnSaveButtonForProjectSetup()
	{
		return By.xpath("//input[@value='Save']");
	}
	
	public static final By projectSetupSaveSuccessMessageAfterSave()
	{
		return By.xpath("//div[@class='message confirmM3']");
	}
	
	public static final By clickOn_NavIconScroller()
	{
		return By.xpath("//div[@class='x-unsized x-button menu x-dock-item x-docked-right x-has-height x-iconalign-center']");
	}
	
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
		return By.xpath("//div[contains(@class,'addBtnCls')]");
	}
	
	public static final By openKanbanBoard()
	{
		return By.xpath("//div[contains(text(),'Regression Kanban Board')]");
		//return By.xpath("//div[contains(text(),'Kanban Board1')]");
	}
	
	public static final By iframeOfKanbanBoard()
	{
		return By.xpath("//iframe[contains(@onload,'Kanban Board')]");
	}
	
	public static final By clickOn_KanbanBoardZoomIcon()
	{
		return By.id("zoomIcon");
	}
	
	public static final By clickOnAddToBoardFan()
	{
		return By.id("mainMenuBtn");
	}
	
	public static final By clickOnAddCardToBoardUnderFanButton()
	{
		return By.xpath("//*[contains(@id,'cardFanBtn')]");
	}
	
	public static final By templateMasterContainer()
	{
		return By.xpath("//form[@id='ext-zonePanel-7']/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/form/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]");
	}
	
	public static final By backlogMasterContainer()
	{
		return By.xpath("//form[@id='ext-zonePanel-8']/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/form/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]");
	}
	
	public static final By inprogressMasterContainer()
	
	{
		return By.id("ext-zonePanel-33");
	}
	
	public static final By reviewAndApproveMasterContainer()
	{
		return By.id("ext-zonePanel-34");
	}
	
	public static final By doneMasterContainer()
	{
		return By.id("ext-zonePanel-35");
	}
	
	public static final By archiveMasterContainer()
	{
		return By.id("ext-zonePanel-36");
	}
	
	//Card xpath's
	
	public static final By clickOnCategoryDropDown()
	{
		return By.id("categoryTextBtn");
	}
	
	public static final By selectCategoryFromDropDownValueDefault()
	{
		return By.xpath("//div[text()='Default']");
	}
	
	public static final By selectCategoryFromDropDownValueFinance()
	{
		return By.xpath("//div[text()='Finance']");
	}
	
	public static final By selectCategoryFromDropDownValueHr()
	{
		return By.xpath("//div[text()='HR']");
	}
	
	public static final By selectCategoryFromDropDownValueMarketing()
	{
		//return By.xpath("//div[text()='cat1']");
		
		return By.xpath("//div[contains(@class,'categoryListCls ')]//div[text()='cat1']");
	}
	
	public static final By selectCategoryFromDropDownValueOperations()
	{
		return By.xpath("//div[text()='Operations']");
	}
	
	public static final By selectCategoryFromDropDownValueSales()
	{
		return By.xpath("//div[text()='Sales']");
	}
	
	public static final By enterCardId()
	{
		return By.xpath("//input[@name='CardID']");
	}
	
	public static final By enterCardTitle()
	{
		return By.xpath("//input[@name='Name']");
	}
	
	public static final By enterCardDescription()
	{
		return By.xpath("//textarea[contains(@class,'descriptionTextAreaCls') and @name='Description']");
	}	
	
	public static final By descriptionFieldOfCardOnEdit()
	{
		return By.xpath("//textarea[@name='Description']");
	}
	
	public static final By enterCardAcceptanceCriteria()
	{
		return By.xpath("//div[@class='x-unsized x-field-input']/textarea[@name='AcceptanceCriteria']");
	}
	
	public static final By clickOnAssignAnOwnerDropDown()
	{
		return By.xpath("//div[@id='assignUserBtn']");
	}
	
	public static final By assignAnOwnerSearchInputFieldUnderDropDown()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	public static final By clickOnPrioirtyDropDown()
	{
		return By.xpath("//div[@id='priorityBtn']");
	}
	
	public static final By selectPriorityFromDropDownCritical()
	{
		return By.xpath("//span[contains(text(),'Critical')]");
	}
	
	public static final By selectPriorityFromDropDownMedium()
	{
		return By.xpath("//span[text()='Medium']");
	}
	
	public static final By selectPriorityFromDropDownLow()
	{
		return By.xpath("//span[text()='Low']");
	}
	
	public static final By cardsAllocationBar()
	{
		return By.xpath("//div[contains(@style,'margin: 1px 5px 0px 0px') and contains(@class,'x-field-mySpinner')]/div[2]/div[text()='-']");
	}
	
	public static final By enterEstimationTime()
	{
		return By.xpath("//input[@name='EstimatedDuration']");
	}
	
	public static final By clickOnCardDurationDropDown()
	{
		return By.xpath("//input[@name='DurationUnits']");
	}
	
	public static final By selectValueFromCardDurationDropDownMinutes()
	{
		return By.xpath("//div[contains(@class,'selectFld-allOverlayList')]//div[contains(@class,'item-first')]");
	}
	
	public static final By clickOnPointsDropDown()
	{
		return By.xpath("//input[@name='Point']");
	}
	
	public static final By sizeOfPointsFiboNumbers()
	{
		return By.xpath("//div[contains(@id,'ext-simplelistitem-')]");
	}
	
	public static final By selectValueUnderPointDropDown()
	{
		return By.xpath("//div[contains(@id,'ext-simplelistitem-')]");
	}
	
	public static final By fetchDueDateOfCardWhileCreating()
	{
		return By.xpath("//div[contains(@class,'calanderDueDateIcon')]//span");
	}
	
	public static final By fetchStartDateOfCardWhileCreating()
	{
		return By.xpath("//div[contains(@class,'calanderStartDateIcon')]//span");
	}
	
	public static final By clickOnCreateButtonForCard()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	//Edit card xpath's	
	public static final By editCard()
	{
		return By.xpath("//div[@class='wrapper']/child::div[2]/ul/li[@class='edit']");
	}
	
	public static final By clickOnCardInfo()
	{
		return By.xpath("//div[text()='Card Info']");
	}
	
	public static final By assignAnOwnerClickOnSearchIcon()
	{
		return By.xpath("//div[@style='width: 350px !important; height: 350px !important; z-index: 12 !important;']//div[@class='x-button-normal x-button searchBtnCls x-layout-box-item x-stretched']");
	}
	
	public static final By selectOwnerNameAfterSearch()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	public static final By getSelectUserName()
	{
		return By.xpath("//div[@id='assignUserBtn']//span[@class='btn_lbl_cls']");
	}
	
	public static final By selectDurationOfCardUnderDurationDropdown()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized x-selectFld-allOverlayList x-floating']//div[@style='transform: translate3d(0px, 0px, 0px);']/child::div[5]");
	}
	
	public static final By clickOnHoldCheckboxOnKanbanCard()
	{
		return By.xpath("//div[contains(@class,'preferencesCheckboxcls')]/child::div[2]");
	}
	
	public static final By clickOnSaveButtonForUpdateCard()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	//Kanban Card Data value
	public static final By createdKanbanCardDataValue()
	{
		return By.xpath("//div[@class='kanbancard ']");
	}
	
	
	// xpath's for verification of kanban Card CardInfo
	
	public static final By verifyCardCategory()
	{
		return By.xpath("//div[@class='wrapper']/child::div/p[@class='title']");
	}
	
	public static final By verifyCardTitle()
	{
		return By.xpath("//div[@class='wrapper']/child::div/p[@class='name']");
	}
	
	public static final By verifyCardDate()
	{
		return By.xpath("//div[@class='wrapper']/child::div/p[@class='date']/span[@class='dateSpan']");
	}
	
	public static final By verifyCardId()
	{
		return By.xpath("//div[@class='wrapper']/child::div/p[@class='date']/span[@class='idSpan']");
	}
	
	public static final By verifyCardEffort()
	{
		return By.xpath("//div[@class='wrapper']/child::div[2]/ul/li[@title='Days Effort ']");
	}
	
	public static final By verifyCardOwner()
	{
		return By.tagName("img");
	}
	
	//click on Status side column
	public static final By clickOnStatusSideColumn()
	{
		return By.xpath("//div[contains(text(),'Status')]");
	}
	
	public static final By statusOnTimeDropDown()
	{
		return By.xpath("//div[@class='x-container x-panel x-layout-box-item x-sized']/div[1]/div[1]/div[1]/div[2]/span[text()='Green']");
	}
	
	public static final By enterStatusOnTimeValueDropDownValue()
	{
		return By.xpath("//span[contains(text(),'Green')]");
	}
	
	public static final By statusOnQualityDropDown()
	{
		return By.xpath("//div[@class='x-container x-panel x-layout-box-item x-sized']/div[1]/div[2]/div[1]/div[2]/span[text()='Green']");
	}	
	
	public static final By enterStatusOnQualityValueDropDown()
	{
		return By.xpath("//span[text()='Amber']");
	}
		
	public static final By statusOnBudgetDropDown()
	{
		return By.xpath("//div[@class='x-container x-panel x-layout-box-item x-sized']/div[1]/div[3]/div[1]/div[2]/span[text()='Green']");
	}	
	
	public static final By enterStatusOnBudgetValueDropDown()
	{
		return By.xpath("//span[text()='Red']");
	}
	
	public static final By percentageCompleteHarveyBall()
	{
		return By.xpath("//div[contains(@class,'parcentcompleteCls')]//span[contains(@class,'harveyBallPanel_50')]");
	}
	
	public static final By statusDescriptionTextArea()
	{
		return By.xpath("//textarea[@name='description ']");
	}
	
	public static final By statusAddButton()
	{
		return By.xpath("//div[@class='x-container x-unsized x-panel x-has-height']/div[@class='x-body']/div[@class='x-unsized x-button x-button-plain logAddBtn saveBtnClss x-floating']/span[@class='x-button-label']");
	}
	
	public static final By statusRegisterTab()
	{
		return By.xpath("//span[text()='Status Register']");
	}
	
	// xpath's for verification of status
	public static final By statusRegisterDateVerify()
	{
		return By.xpath("//td[@class='percentComplete wrapData']");
	}
	
	public static final By statusRegisterDescriptionVerify()
	{
		return By.xpath("//td[@class='detail wrapData']/p");
	}
	
	public static final By statusRegisterOnTime()
	{
		return By.xpath("//p[@class='Green']");
	}
	
	public static final By statusRegisterOnQuality()
	{
		return By.xpath("//p[@class='Amber']");
	}
	
	public static final By statusRegisterOnBudget()
	{
		return By.xpath("//p[@class='Red']");
	}
	
	public static final By clickOnEditCardFinalSaveButton()
	{
		//return By.xpath("//div[contains(@class,'x-container x-toolbar x-toolbar-greyToolbar x-dock-item x-docked-bottom x-sized')]//span[text()='Save']");
		return By.xpath("//div[contains(@class,'x-container x-toolbar x-toolbar-greyToolbar x-dock-item x-docked-bottom x-sized')]//div[@class='x-button-normal x-button saveBtnClss x-layout-box-item x-stretched']//span[text()='Save']");
	}
	
	//click on Task and Added Task on Kanban Board
	public static final By clickOnTaskSideColumn()
	{
		return By.xpath("//div[text()='Task']");
	}
	
	public static final By addTaskSubject()
	{
		return By.xpath("//input[@placeholder='Enter the Subject']");
	}
	
	public static final By addDescriptionToTask()
	{
		return By.xpath("//textarea[@name='descriptionTaskTask']");
	}
	
	public static final By clickOnAssignAUserDropDown()
	{
		return By.xpath("//div[contains(@class,'-topBarBtn prority_')]//span[text()='Assign an User']");
	}
	
	public static final By assignAnOwnerForTaskSearchIcon()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized overlayFloatingClsNew']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
	}
	
	public static final By searchUserNameInInputField()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	public static final By selectUserAfterSearch()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	public static final By taskPriority()
	{
		return By.xpath("//div[@class='x-container x-form-fieldset fieldSetCls x-layout-box-item x-flexed x-sized']/div[1]/div[@class='x-dock-body']/div[1]/div[1]/span[text()='Normal']");
	}
	
	public static final By selectTaskPriorityFromDropDown()
	{
		return By.xpath("//span[text()='Normal']");
	}
	
	public static final By clickOnTaskAddButton()
	{
		return By.xpath("//div[@class='x-button-normal x-button saveBtnClss x-layout-box-item x-stretched']/span[text()='Add']");
	}
	
	public static final By clickOnTaskSaveButton()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	//verification of Task on kanban card
	public static final By createdTaskName()
	{
		return By.xpath("//*[contains(@id,'ext-list-')]//td[@class='subjectCmp_Task wrapData']");
	}
	
	public static final By createdTaskDate()
	{
		return By.xpath("//*[contains(@id,'ext-list-')]//*[contains(@id,'ext-simplelistitem-')]//*[contains(@class,'activityDateCmp_Task')]");
	}
	
	public static final By createdTaskStatus()
	{
		return By.xpath("//*[contains(@id,'ext-list-')]//*[contains(@id,'ext-simplelistitem-')]//*[contains(@class,'statusCmp_Task wrapData')]");
	}
	
	
	// Edit Task xpath
	public static final By clickOnEditTaskIcon()
	{
		return By.xpath("//*[contains(@id,'ext-list-')]//*[contains(@id,'ext-simplelistitem-')]//*[contains(@class,'editLog')]");
	}	
	
	
	public static final By editTaskSubjectName()
	{
		return By.xpath("//input[@name='SubjectTask']");
	}
	
	public static final By editTaskDescription()
	{
		return By.xpath("//textarea[@name='descriptionTaskTask']");
	}
	
	public static final By editTaskAssignToDropdown()
	{
		return By.xpath("//div[contains(@class,'button-topBarBtn')]//span[text()='Pratish Laad']");
	}
	
	public static final By editTaskAssignAnOwnerInputFieldForSearchName()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	
	public static final By clickOnSearchMagnifierIcon()
	{
		return By.xpath("//div[contains(@class,'searchBtnCls')]");
	}
	
	public static final By selectOwnerNameAfterSearchUnderEditTask()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
		
	
	public static final By editTaskPriorityDropdown()
	{
		return By.xpath("//div[contains(@class,'button-topBarBtn')]//span[text()='Normal']");
	}
	
	public static final By selectPriorityForTask()
	{
		return By.xpath("//span[text()='High']");
	}
	
	public static final By editTaskDueDateCalender()
	{
		return By.xpath("//input[@name='dueDateTask']");
	}
	
	public static final By selectHighlightedDateUpdateTask()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li[contains(@class,'picked')]");
	}
	
	public static final By dayPanelList()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li");
	}
	
	public static final By dayPanelListUpdateTaskCalender()
	{
		return By.xpath("//div[contains(@class,'datepicker-top-left')]//div[@class='datepicker-panel']/ul[3]/li");
	}
	
	public static final By editTaskClickOnStatusDropdown()
	{
		return By.xpath("//form[contains(@id,'ext-newPostTasks-')]//div[contains(@id,'ext-selectfield-')]/div[2]");
	}
	
	public static final By selectTaskStatusUnderStatusDropDown()
	{
		return By.xpath("//span[text()='In Progress']");
	}
	
	public static final By editTaskClickOnUpdateButton()
	{
		return By.xpath("//span[text()='Update']");
	}
	
	
	//click on Log Time
	public static final By clickOnLogTimeSideColoumn()
	{
		return By.xpath("//div[text()='Log Time']");
	}
	
	public static final By clickOnDateForLogTime()
	{
		return By.xpath("//input[@name='LogTime']");
	}
	
	public static final By clickOnCalenderTodayButton()
	{
		return By.xpath("//input[@class='buttonC today ok']");
	}
	
	public static final By clickOnLogTimeAssignToTaskDropDown()
	{
		return By.xpath("//*[contains(@id,'ext-logTime-')]//input[@name='TaskID']/following-sibling::div[1]");
	}
	
	public static final By selectTaskNameFromList()
	{
		return By.xpath("//span[text()='This is updated task name : Task2']");
	}
	
	public static final By loggedTimeInputField()
	{
		return By.xpath("//input[@name='Estimation']");
	}
	
	public static final By clickOnDurationDropDown()
	{
		return By.xpath("//div[starts-with(@id,'ext-selectfield-')]//div[contains(@class,'-has-height')]");
	}
	
	public static final By selectValueDayFromDurationDropDown()
	{
		return By.xpath("//span[text()='Days']");
	}              
		
	public static final By clickOnLogTimeAssignAUserDropDown()
	{
		return By.xpath("//div[contains(@style,'height: 67px')]//div[contains(@class,'-topBarBtn prority_lbl_white')]");
	}
	
	public static final By clickOnLogTimeAssignAnOwnerSearchField()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	public static final By clickOnNextArrow()
	{
		return By.xpath("//div[@class='x-button x-button-topBarBtn x-stretched nextBtnCls']");
	}
	
	public static final By selectUserFromList()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	public static final By enterDescriptionOnLogTimeField()
	{
		return By.xpath("//*[contains(@id,'ext-logTime-')]//*[contains(@id,'ext-textareafield-')]//textarea[@name='Description']");
	}	
	
	public static final By clickOnLogTimeAddButton()
	{
		return By.xpath("//div[@class='x-container x-panel x-layout-box-item x-sized']/div[@class='x-body']/div[@class='x-unsized x-button x-button-plain logAddBtn saveBtnClss x-floating']/span[text()='Add']");
	}
	
	public static final By logTimeDate()
	{
		return By.xpath("//*[contains(@id,'ext-logTime-')]//*[contains(@id,'ext-simplelistitem-')]//*[contains(@class,'activityDateCmp')]");//1for form 2for tablelist 3for 
	}
	
	public static final By logTimeTaskName()
	{
		return By.xpath("//*[contains(@id,'ext-logTime-')]//*[contains(@id,'ext-simplelistitem-')]//tr/td[3]");
	}
	
	public static final By logTimeHours()
	{
		return By.xpath("//*[contains(@id,'ext-logTime-')]//*[contains(@id,'ext-simplelistitem-')]//*[contains(@class,'statusCmp wrapData')]");
	}
	
	public static final By logTimeDescription()
	{
		return By.xpath("//*[contains(@id,'ext-logTime-')]//*[contains(@id,'ext-simplelistitem-')]//tr/td[5]");
	}
	
	
	//Edit Kanban Card Logtime	
	public static final By editLogTimeEditIcon()
	{
		return By.xpath("//*[contains(@id,'ext-logTime-')]//*[contains(@id,'ext-simplelistitem-')]//tr/td[6]");
	}
	
	public static final By clickOnEditDateForLogTime()
	{
		return By.xpath("//div[contains(@class,'calanderStartDateIcon')]//input[@name='LogTime']");
	}
	
	public static final By editLogTimeSelectDateFromDatePicker()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown')]/div[contains(@class,'datepicker-panel')]/ul[@data-view='days']/li[25]");
	}	
	
	public static final By editLogTimeLoggedTime()
	{
		return By.xpath("//input[@name='Estimation']");
	}	
	
	public static final By clickOnEditLogtimeDurationDropDown()//Nu
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//div[starts-with(@id,'ext-panel-')]//div[contains(@id,'ext-fieldset-')]");
	}	
	
	public static final By selectValueFromDurationDropdownupdate()
	{
		return By.xpath("//span[text()='Weeks']");
	}
	
	
	public static final By editLogTimeAssignAnOwnerDropdown()
	{
		return By.xpath("//div[contains(@class,'button-topBarBtn')]//span[text()='Pratish Laad']");
	}
	
	public static final By editLogTimeAssignAnOwnerSearchInputField()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	public static final By editLogTimeAssignAnOwnerSearchIcon()
	{
		return By.xpath("//div[contains(@class,'overlayFloatingClsNew')]/div[1]/div[2]/div[1]/div[1]/div[1]/div[contains(@class,'searchBtnCls')]");
	}
	
	public static final By selectOwnerNameAferClickOnSearchIcon()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	
	public static final By editLogTimeDescriptionField()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//textarea[@name='Description' and contains(@class,'descriptionTextAreaCls')]");
	}
	
	public static final By editLogTimeclickOnUpdateButton()
	{
		return By.xpath("//span[text()='Update']");
	}
	
	//click on Risk Side column
	public static final By clickOnRiskSideColumn()
	{
		return By.xpath("//div[text()='Risk']");
	}
	
	public static final By loadMaskAfterSave()//open window
	{
		return By.xpath("//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
	
	public static final By clickOnRiskDateField()
	{
		return By.xpath("//form[starts-with(@id,'ext-formpanel-')]/div/div/child::div/div/div/div/input[@name='LogTime']");
	}
	
	public static final By clickOnRiskAssignToTaskDropDown()
	{
		return By.xpath("//*[contains(@id,'ext-riskView-')]//input[@name='TaskID']/following-sibling::div[1]");		
	}
	////form[starts-with(@id,'ext-formpanel-')]/div/div/child::div/child::div[2]/child::div[2]/div/input[contains(@class,'x-input-el x-input-text x-form-field selectBorderCls')]
	public static final By selectTaskNameUnderRiskColumn()
	{
		return By.xpath("//div[contains(@class,'selectFld-allOverlayList')]//div[contains(@class,'-item-last')]");
	}
	
	public static final By clickOnRadioButtonForRiskType()
	{
		return By.xpath("//*[contains(@id,'ext-riskView-')]//span[text()='Issue']");
	}
	
	public static final By detailRiskInputField()
	{
		return By.xpath("//textarea[@name='Detail']");
	}
	
	public static final By riskMitigationRiskInputField()
	{
		return By.xpath("//textarea[@name='riskMitigation']");
	}
	
	public static final By clickOnWeightHowImportantDropDown()
	{		
		return By.xpath("//*[contains(@id,'ext-riskView-')]//input[@name='Weight']/following-sibling::div[1]");
	}
	
	public static final By selectValueFromWeightHowImportantDropDown()
	{
		return By.xpath("//span[text()='Very Important']");
	}
	
	public static final By clickOnProbabilityHowLikely()
	{		
		return By.xpath("//*[contains(@id,'ext-riskView-')]//input[@name='Probability']/following-sibling::div[1]");
	}
	
	public static final By selectValueFromProbabilityHowLikely()
	{
		return By.xpath("//span[text()='Imminent']");
	}
	
	public static final By clickOnAtRiskCheckbox()
	{
		return By.xpath("//div[contains(@id,'ext-checkboxfield-') and @style='margin: 25px 15px !important;']/child::div[2]");
	}
	
	public static final By clickOnRiskAddButton()
	{
		return By.xpath("//div[@class='x-button x-button-plain logAddBtn saveBtnClss x-layout-box-item x-stretched']/span[text()='Add']");
	}
	
	public static final By clickOnRiskRegisterTab()
	{
		return By.xpath("//div[contains(@class,'x-tabbar-inner')]//span[text()='Risk Register']");
	}
			
	public static final By riskDate()
	{
		return By.xpath("//*[contains(@id,'ext-simplelistitem-')]//*[contains(@class,'activityDateCmp')]");
	}
	
	public static final By riskTaskName()
	{
		return By.xpath("//*[contains(@id,'ext-simplelistitem-')]//tr/td[3]");
		
	}
	
	public static final By riskScore()
	{
		return By.xpath("//*[contains(@id,'ext-simplelistitem-')]//tr/td[4]");
		
	}
	
	public static final By riskType()
	{
		return By.xpath("//*[contains(@id,'ext-simplelistitem-')]//tr/td[5]");
	}
	
	public static final By riskDetail()
	{
		return By.xpath("//*[contains(@id,'ext-simplelistitem-')]//tr/td[6]");
	}
	
	public static final By updateRiskDetail()
	{
		return By.xpath("//*[contains(@id,'ext-simplelistitem-')]//tr/td[contains(@title,'Detail of Risk is updated')]");
	}
	//*[contains(@id,'ext-simplelistitem-')]//tr/td[7]
	//Edit Risk xpath
	public static final By editRiskClickOnRiskEditIcon()
	{
		return By.id("Edit");
	}
	
	public static final By editRiskResolvedCheck()
	{
		return By.xpath("//*[contains(@id,'ext-simplelistitem-')]//tr/td[1]/span");
	}
	
	public static final By editRiskDate()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//div[contains(@class,' calanderStartDateIcon')]//input[contains(@class,'selectBorderCls cursorPointer')]");
	}
	
	public static final By editRiskDatePickerFromCalender()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown')]/div[@class='datepicker-panel']/ul[3]/li[33]");
	}
	
	public static final By editRiskSelectBusinessDependencyRadioButton()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//div[contains(@class,'statusradiofieldset')]/div/child::div[3]//span[text()='Business Dependency']");
	}
	
	public static final By editRiskDetailTextArea()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//textarea[@name='Detail']");
	}
	
	public static final By editRiskRiskMitigationTextArea()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//textarea[@name='riskMitigation']");
	}
	
	public static final By editClickOnResolvedCheckbox()
	{
		return By.xpath("//div[contains(@class,'x-form-label preferencesCheckboxLabel')]/following-sibling::div/child::div/child::input[@name='Resolved']/following-sibling::div");
	}
	
	public static final By editClickOnResolvedDateCalendar()
	{
		return By.xpath("//div[contains(@class,'calanderStartDateIcon')]//input[@name='ResolvedTime']");
	}
	
	public static final By getSelectedDateOfTodayUpdateRiskResolvedCalendar()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li[contains(@class,'ed picked')]");
	}
	
	public static final By getListOfAllElement()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown') and contains(@style,'top: 63px;')]//div[@class='datepicker-panel']/ul[3]/li");
	}
	
	public static final By editRiskWeightAndProbabilityCommonDropdown()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//div[@style='margin: 5px 15px !important;']//div[contains(@id,'ext-selectfield-')]/div[2]");
	}
	
	public static final By editRiskSelectValueFromWeightHowImportantDropdown()
	{
		return By.xpath("//div[@class='x-scroll-container x-size-monitored x-paint-monitored']//div[@style='min-height: 40px !important;']//span[text()='Critical']");
	}
	
	public static final By editRiskSelectValueFromProbabiltyHowLikely()
	{
		return By.xpath("//div[@class='x-scroll-container x-size-monitored x-paint-monitored']//div[@style='min-height: 40px !important;']//span[text()='Very Likely']");
	}
	
	public static final By editRiskClickOnUpdateButton() 
	{
		return By.xpath("//span[text()='Update']");
	}
	
	public static final By getVerifyRiskTypeAfterEdit()
	{
		return By.xpath("//table//tr/td[@title='Business Dependency']");
	}
	
	//xpath's for link kanban card
	
	public static final By clickOnGoBackProjectNav()
	{
		return By.xpath("//span[text()='GO BACK']");
	}
	
	public static final By clickOnCreatedProjectForLinking()
	{
		return By.xpath("//div[text()='Regression Project for link kanban card']");
	}
	
	public static final By clickOnRegressionKanbanBoard()
	{
		return By.xpath("//div[contains(text(),'Regression Kanban Board for link one card to it')]");
	}
		
	public static final By loadMaskCountForKanbanBoard()
	{
		return By.xpath("//div[contains(@id,'ext-viewport')]//div[contains(@id,'ext-loadmask-')]//div[contains(@class,'-spinner-outer')]");
	}
	
	public static final By clickOnLinkSideColumn()
	{
		return By.xpath("//div[text()='Link']");
	}
		
	public static final By clickOnLinkToProject()
	{
		return By.xpath("//form[contains(@id,'ext-linkView-')]/div[1]/child::div[2]/div[1]/div[5]//div[@class='x-dock-body']");
	}
	
	public static final By clickOnFolderWhichWillSelect()
	{
		return By.xpath("//div[text()='Regression Folder']");
	}
	
	
	public static final  By clickOnfoderwhichwilselectForHyperjump()
	{
		return By.xpath("//div[text()='MyFolder']");
	}
	
	
	
	
	public static final By selectProjectName()
	{
		return By.xpath("//div[text()='Regression Project for link kanban card']");
	}
	
	
	
	public static final By clickOnLinkToProjectBoard()
	{
		return By.xpath("//form[contains(@id,'ext-linkView-')]/div[1]/child::div[2]/div[1]/div[6]//div[@class='x-dock-body']");
	}
	
	public static final By selectKanbanBoard()
	{
		return By.xpath("//*[contains(@id,'ext-formpanel-')]//*[contains(@id,'ext-list-')]//div[contains(@class,'assignUserItemCls') and contains(@style,'0px, 40px, 0px')]");
	}
	
	public static final By clickOnLinkToCard()
	{
		return By.xpath("//form[contains(@id,'ext-linkView-')]/div[1]/child::div[2]/div[1]/div[7]//div[@class='x-dock-body']");
	}
	
	public static final By selectKanbanCardFromList()
	{
		return By.xpath("//*[contains(@class,'x-list-item-first x-list-header-wrap x-list-item-last x-list-footer-wrap x-unsized x-list-item assignUserItemCls x-has-height x-list-item-tpl')]");
	}
	
	public static final By clickOnCopyURLButton()
	{
		return By.xpath("//div[contains(@class,'cancelBtn')]//span[text()='Copy URL']");
	}
	
	public static final By inputUrlField()
	{
		return By.xpath("//*[contains(@name,'UrlLink')]");
	}
	
	public static final By verifyLinkSignOnKanbanCardAfterLinking()
	{
		return By.xpath("//li[@class='link linkactive ']");
	}
	
	//click on Subscriber
	
	public static final By clickOnSubscribersSideColumn()
	{
		return By.xpath("//div[text()='Subscribers']");
	}
	
	public static final By clickOnSelectSubscriberDropDown()
	{
		return By.xpath("//*[contains(@class,'x-button x-button-topBarBtn prority_lbl_white x-layout-box-item x-sized')]//span[text()='Assign a Subscriber']");
	}
	
	public static final By clickOnSelectSubscriberSearchIcon()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized overlayFloatingClsNew']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
	}
	
	public static final By selectSubscriberSearchInputField()
	{
		return By.xpath("//*[contains(@placeholder,'Search by Name...')]");
	}
	
	public static final By selectSubscriberUserFromListAfterSearch()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	public static final By clickOnSubscriberAddButton()
	{
		return By.xpath("//div[@class='x-unsized x-button x-button-plain logAddBtn saveBtnClss x-dock-item x-docked-right x-has-height']");
	}
	
	public static final By clickOnUserColumn()
	{
		return By.xpath("//*[contains(@id,'ext-newPostSubscriber-')]//th[text()='User']");
	}
	
	public static final By movedCheckBox()
	{
		return By.xpath("//*[contains(@class,'x-list-item-first x-list-header-wrap x-list-item-last x-list-footer-wrap x-unsized x-list-item x-has-height x-list-item-tpl')]//div[2]//table//tbody//tr//td[2]/p[@class='subcriberlistp setCheck']");
	}
	
	public static final By doneCheckbox()
	{
		return By.xpath("//*[contains(@class,'x-list-item-first x-list-header-wrap x-list-item-last x-list-footer-wrap x-unsized x-list-item x-has-height x-list-item-tpl')]//div[2]//table//tbody//tr//td[3]/p");
	}
	
	public static final By cardPastDueCheckBox()
	{
		return By.xpath("//*[contains(@class,'x-list-item-first x-list-header-wrap x-list-item-last x-list-footer-wrap x-unsized x-list-item x-has-height x-list-item-tpl')]//div[2]//table//tbody//tr//td[4]/p");
	}
	
	public static final By taskPastDueCheckBox()
	{
		return By.xpath("//*[contains(@class,'x-list-item-first x-list-header-wrap x-list-item-last x-list-footer-wrap x-unsized x-list-item x-has-height x-list-item-tpl')]//div[2]//table//tbody//tr//td[5]/p");
	}
	
	public static final By taskCompletedCheckBox()
	{
		return By.xpath("//*[contains(@class,'x-list-item-first x-list-header-wrap x-list-item-last x-list-footer-wrap x-unsized x-list-item x-has-height x-list-item-tpl')]//div[2]//table//tbody//tr//td[6]/p");				
	}	
	
	
	// xpath's for Custom Fields
	public static final By clickOnKanbanBoardHomeIcon()
	{
		return By.xpath("//div[contains(@class,'topBarButtonCls carouselHome')]");
	}
	
	public static final By clickOnPlusIconOnLeankorPage()
	{
		return By.xpath("//img[@title='All Tabs']");
	}
	
	public static final By clickOnKanbanCardObjectName()
	{
		return By.linkText("Kanban Cards");
	}
	
	public static final By tryLexDailogWindowAfterClickingOnKanbanCardObject()
	{
		return By.xpath("//div[@class='overlayDialog tryLightning']");
	}
	
	public static final By tryLexDailogWindowClickOnCross()
	{
		return By.xpath("//div[@id='tryLexDialog']//a[@id='tryLexDialogX']");
	}
	
	public static final By clickOnNoThankxOnLexWindows()
	{
		return By.id("lexNoThanks");
	}
	
	public static final By clickOnKanbanCardRecordPageSideHandle()
	{
		return By.className("handle");
	}
	
	public static final By clickOnViewFieldOptionUnderHandle()
	{
		return By.linkText("View Fields");
	}
	
	public static final By clickOnNewButtonForCustomFieldAndRelationships()
	{
		return By.xpath("//input[@name='new_field']");
	}
	
	public static final By selectCurrencyRadioButtonFromCustomFieldPage()
	{
		return By.id("dtypeC");
	}
	
	public static final By nextButtonOnDataTypePage()
	{
		return By.name("goNext");
	}
	
	public static final By fieldLabelNameForCurrencyRadioButton()
	{
		return By.id("MasterLabel");
	}
	
	public static final By clickOnVisibileCheckBoxOnFieldLevelSecurityPage()
	{
		return By.xpath("//input[@title='Visible']");
	}
	
	public static final By clickOnSaveButtonToAddCustomField()
	{
		return By.name("save");
	}
	
	public static final By selectTextRadioButtonFromCustomFieldPage()
	{
		return By.id("dtypeS");
	}
	
	public static final By enterLengthOfTextField()
	{
		return By.id("Length");
	}
	
	public static final By clickOnFieldSetsLink()
	{
		return By.id("FieldSetList_link");
	}
	
	public static final By clickOnFieldSetColumnNewButton()
	{
		return By.xpath("//input[@title='New Field Sets']");
	}
	
	public static final By fieldSetLabelForNewFieldSet()
	{
		return By.id("MasterLabel");
	}
	
	public static final By fieldSetNameForNewFieldSet()
	{
		return By.id("DeveloperName");
	}
	
	public static final By fieldSetDescriptionWhereIsThisUsed()
	{
		return By.id("Description");
	}
	
	public static final By clickOnFieldSetSaveButton()
	{
		return By.name("save_close");
	}
	
	public static final By selectCurrencyFieldUnderFieldSet()
	{
		return By.xpath("//span[text()='deepCurrencyCusto...']");
	}
	
	public static final By selectTextFieldUnderFieldSet()
	{
		return By.xpath("//span[text()='deepTextCustomField']");
	}
	
	public static final By inTheFieldSetAreaWhereFieldsToBeDropped()
	{
		return By.xpath("//div[@id='defaultView']");
	}
	
	public static final By clickOnSaveButtonOfFieldSet()
	{
		return By.xpath("//button[text()='Save']");
	}
	
	
	// custom field and click on card info
	public static final By clickOnCategoryDropDownForSetCustomField()
	{
		return By.xpath("//div[@id='categoryTextBtn']");
	}
	
	public static final By clickOnOperationCategoryEditPensilIcon()
	{
		return By.xpath("//div[contains(@style,'144px')]//span[@title='Edit Category']");
	}
	
	public static final By clickOnCustomFieldsDropDownUnderEditCategory()
	{
		return By.xpath("//div[starts-with(@id,'ext-selectfield-')]//div[contains(@class,'field-input')]");
	}
	
	public static final By selectFieldSetNameFromList()
	{
		return By.xpath("//span[text()='DeepFieldSet']");
	}
	
	public static final By radioButtonApplyToEntireProject()
	{
		return By.xpath("//span[text()='Apply to Entire Project']");
	}
	
	public static final By clickOnEditCategorySaveButton()
	{
		return By.xpath("//div[@style='min-width: 65px !important;']//span[text()='Save']");
	}
	
	public static final By clickOnCustomFieldsSideColumn()
	{
		return By.xpath("//div[text()='Custom Fields']");
	}
	
	public static final By enterValueOnCurrencyCustomField()
	{
		return By.name("deepCurrencyCustomField__c");
	}
	
	public static final By enterValueOnTextCustomField()
	{
		return By.name("deepTextCustomField__c");
	}
	
	
	//xPath resource on kanban card
	
	public static final By clickOnResourceSideColumn()
	{
		return By.xpath("//div[text()='Resource']");
	}
	
	public static final By verifyResourceName()
	{
		//return By.xpath("//div[contains(@class,'fslListItem')]//td[2]");
		return By.xpath("//div[contains(@class,'fslListItem')]//td[text()='Pratish Laad  ']");
	}
	
	public static final By verifyResourceAllocationFromCard()
	{
		return By.xpath("//div[contains(@class,'fslListItem')]//td[3]");
	}
	
	// Card Mode	
	public static final By clickOnCardModeSideColumn()
	{
		return By.xpath("//div[text()='Card Mode']");
	}
	
	public static final By schedulingModeAndEffortUnitCommonXpath()
	{
		return By.xpath("//form[contains(@id,'ext-cardMode-')]//div[contains(@id,'ext-selectfield-')]//div[@class='x-unsized x-field-input']");
	}
	
	public static final By selectValueFromCardModeScheduleModeDropDown()
	{
		return By.xpath("//span[text()='Effort driven']");
	}
	
	public static final By selectValueFromSchedulingModeDropDown()
	{
		return By.xpath("//span[text()='Normal']");
	}
	
	public static final By actualEffortInputField()
	{
		return By.xpath("//form[contains(@id,'ext-cardMode-')]//div[contains(@id,'ext-numberfield-')]//div[@class='x-unsized x-field-input']/input[@name='Effort']");
	}
	
	public static final By selectValueFromEffortUnitDropDown()
	{
		return By.xpath("//span[text()='Weeks']");
	}
	
	public static final By clickOnCardInfoForCardMode()
	{
		return By.xpath("//div[text()='Card Info']");
	}
	
	public static final By scrollDownToAccecptanceCriteriaInputTextField()
	{
		return By.xpath("//div[@class='x-unsized x-field-input']/textarea[@name='AcceptanceCriteria']");
	}
	
	public static final By estimationInputFieldCardInfo()
	{
		return By.name("EstimatedDuration");
	}	
	
	public static final By durationInputFieldCardInfo()
	{
		return By.name("DurationUnits");
	}
	
	
	// Click on Add to board fan and click on stickers
	
	public static final By addStickerToBoardOrCard()
	{
		return By.id("stickerFanBtn");
	}
	
	public static final By dropToBackLogMasterContainer()
	{
		return By.xpath("//form[@id='ext-zonePanel-8']/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/form/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]");
	}
	
	public static final By clickOnStickerUploaderPlusIcon()
	{
		return By.xpath("//div[contains(@class,'sidemenuCls')]//div[contains(@class,'addSwimlaneCls')]");
	}
	
	public static final By uploadStickerGlobalFieldCheck()
	{
		return By.xpath("//div[contains(@class,'preferencesCheckboxLabel')]");
	}
	
	public static final By enterNameOnUploadStickerInputField()
	{
		return By.xpath("//input[@name='Name']");
	}
	
	public static final By chooseFileNameFromDriveForUploadSticker()
	{
		return By.xpath("//input[@accept='image/*']");
	}
	
	public static final By uploadStickerUploadButton()
	{
		return By.xpath("//span[text()='Upload']");
	}	
	
	public static final By cardEditAfterUploadSticker()
	{
		return By.xpath("//div[contains(@class,'kanbancard ')]/child::div[2]/child::div[2]/ul/li[@class='edit']");
	}
	
	public static final By clickOnStickerSideColumn()
	{
		return By.xpath("//div[text()='Stickers']");
	}
	
	public static final By getFormIdAttributeColumn()//means all stickers form
	{
		return By.xpath("//*[contains(@id,'ext-stickersView-')]");
	}
	
	public static final By stickerWindowsElementSize()
	{
		return By.xpath("//div[contains(@class,'allStickerList')]//div[contains(@class,'categoryListCls')]");
	}
	
	//Clone Kanban card xpath
	public static final By clickOnCloneSideColumn()
	{
		return By.xpath("//div[text()='Clone']");
	}
	
	public static final By clickOnCloneCardStartDate()
	{
		return By.xpath("//div[contains(@class,'calanderStartDateIcon')]//div[@class='x-unsized x-field-input']");
	}
	
	public static final By pickStartDateFromCloneCardByStartDateCalendarPopup()
	{
		return By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li[contains(@class,'highlighted')]");
	}
	
	
	public static final By getAllDatesLiElementFromCloneCardPopup()
	{
		return By.xpath("//div[contains(@class,'picker-panel') or contains(@data-view,'days picker')]/ul[@data-view='days']/li");
	}
	
	public static final By selectDateFromStartDatePicker()
	{
		return By.xpath(" //div[@class='datepicker-container datepicker-dropdown datepicker-bottom-left']/div[@data-view='days picker']/ul[@data-view='days']/li[16]");
		//return By.xpath("//div[@class='datepicker-container datepicker-dropdown datepicker-top-left']/div[@data-view='days picker']/ul[@data-view='days']/li[16]");
	}
	
	                

	
	public static final By clickOnCloneButton()
	{
		return By.xpath("//span[text()='Clone']");
	}
	
	public static final By masterContainersFormAttributeCount()
	{
		return By.xpath("//form[contains(@style,'1px solid rgb(232, 232, 232);')]");
	}
	
	public static final By clickOnParentKanbanCardEditIcon()
	{
		return By.xpath("//form[@id='"+getMasterContainerDynamicWebElementId+"']//div[contains(@id,'ext-kanbandataview-')]/child::div[1]/div//div[@class='footer']/ul/li[@class='edit']");
	}
	
	public static final By clickOnCloneCardDueDate()
	{
		return By.xpath("//div[contains(@class,'calanderDueDateIcon')]//div[@class='x-unsized x-field-input']");
	}
	
	public static final By selectDateFromDueDatePicker()
	{
		
		//return By.xpath("//div[@class='datepicker-container datepicker-dropdown datepicker-bottom-left']/div[@data-view='days picker']/ul[@data-view='days']/li[26]");
		return By.xpath("//div[@class='datepicker-container datepicker-dropdown datepicker-top-left']/div[@data-view='days picker']/ul[@data-view='days']/li[26]");
	}
	
	public static final By clonekanbanCardWithStartDate()
	{
		
		return By.xpath("//form[@id='"+getMasterContainerDynamicWebElementId+"']//div[contains(@id,'ext-kanbandataview-')]/child::div[1]//div[@class='x-unsized x-dataview-container']/div[1]");
	}
	
	public static final By cloneKanbanCardWithDueDate()
	{
		return By.xpath("//form[@id='"+getMasterContainerDynamicWebElementId+"']//div[contains(@id,'ext-kanbandataview-')]/child::div[1]//div[@class='x-unsized x-dataview-container']/div[2]");
	}
	
	//Hyper Jump Kanban Card xpath
	public static final By clickOnHyperJumpSideColumn()
	{
		return By.xpath("//div[text()='Hyper Jump']");
	}
	
	//Get all the dropdown common xpath
	public static final By hyperJumpCardsSubWindows()
	{
		return By.xpath("//form[@style='width: 350px !important; height: 90% !important; max-height: 600px !important; z-index: 8 !important;']/div[1]/child::div[2]//div[@class='x-container x-panel x-layout-box-item x-stretched']//div[@style='margin: 3px 10px 0px !important;']/div/div/div/div[2]");
	}                                  // width: 350px !important; height: 90% !important; max-height: 600px !important; z-index: 8 !important;
	
	public static final By clickOnFolderUnderSelectProjectDropdown()
	{
		return By.xpath("//div[@class='x-dock-body']//div[@style='width: 100% !important; padding: 0px !important;']");
	}
	
	public static final By selectProjectNameAfterFolderExpand()
	{
		return By.xpath("//div[text()='Regression Project for link kanban card']");
		
		
	}
	

	
	public static final By selectKanbanBoardUnderSelectProjectBoardDropdown()
	{
		return By.xpath("//div[text()='Regression Kanban Board for link one card to it']");
		
	}
	
	
	
	public static final By selectInProgressMasterContainerUnderSelectColumnDropdown()
	{
		return By.xpath("//div[@class='x-list-item x-stretched x-list-item-tpl']//div[text()='In Progress']");
	}
	
	public static final By hyperJumpCardsJumpButton()
	{
		return By.xpath("//span[text()='Jump']");
	}
	
	
	//Kanban Card hierarchy xpath
	public static final By clickOnEditIconOfKanbanCardForHierarchyParentCard()
	{
		return By.xpath("//form[@id='"+masterContainerDynamicallyGetFormIdOfAnotherKanbanBoard+"']//div[contains(@id,'ext-kanbandataview-')]/child::div[1]/div//div[@class='footer']/ul/li[@class='edit']");
	}
	
	public static final By clickOnHierarchySideColumn()
	{
		return By.xpath("//div[text()='Hierarchy']");
	}
	
	public static final By cardHierarchyLoader()
	{
		return By.xpath("//div[contains(@id,'loadmask-')]//div[@class='x-mask-msg-text']");
	}
	
	public static final By verifyCardIsPresentOrNotAfterClickOnHierarchySideCloumn()
	{
		return By.xpath("//div[@style='width:59px;']");
	}
	
	//Get Form ID attribute value
	public static final By formIdAttributeValue()
	{
		//return By.xpath("//form[@id='ext-zonePanel-32']");
		//return By.xpath("ext-zonePanel-9");
	    return By.xpath("//form[@id='ext-zonePanel-9']//child::form");
	}
		
	// Uploading Files on the kanban Card xpath
	
	public static final By clickOnEditIconOfkanbanCardHasSticker()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[@class='wrapper']/child::div[2]/ul/li[@class='edit']");
	}
	
	public static final By kanbanBoardToolBar()
	{
		return By.xpath("//div[text()='Regression Project for link kanban card - Regression Kanban Board for link one card to it']");
	}
	
	public static final By repositorySourceTab()
	{
		return By.xpath("//span[text()='Repository Sources']");
	}
	
	public static final By switchToSalesforceFilesUpload()
	{
		return By.xpath("//div[contains(@class,'FieldServiceTabs fileConnect')]//span[contains(text(),'Salesforce Files Upload')]");
	}
	
	public static final By clickOnFilesSideColumn()
	{
		return By.xpath("//div[text()='Files']");
	}
	
	public static final By uploadImageOnFilesInputField()
	{
		return By.xpath("//input[@type='file']");
	}
	
	public static final By clickOnUploadButton()
	{
		return By.xpath("//span[text()='Upload']");
		
		
	}
	
	public static final By afterUploadButtonClick()
	{
		return By.xpath("//div[contains(@id,'ext-fileDataView-')]//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
	
	//verification of KanbanCard Footers
	public static final By kanbanCardLinkFooter()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[2]");
	}
	
	public static final By kanbanCardDaysEffortFooter()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[3]");
	}
	
	public static final By kanbanCardPriorityFooter()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[4]");
	}
	
	public static final By kanbanCardChatterIconFooter()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[5]");
	}
	
	public static final By kanbanCardTaskFooter()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[6]");
	}
	
	public static final By kanbanCardStatusFooter()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[7]");
	}
		
	public static final By getStickerHeaderLiElementList()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div[1]/div/div[@class='header']/ul/li[@class='sticker']/img");
	}
	
	public static final By getCardOwnerFromStickerCard()
	{
		return By.xpath("//form[@id='"+getIdValueOfForm+"']//li[@class='owner']/img");
	}
	
	//Delete Kanban Card xpath
	
	public static final By clickOnEditIconForDeleteKanbancard()
	{
		//return By.xpath("//form[@id='"+getIdValueOfForm+"']//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[8]");
		return By.xpath("//div[contains(@class,'x-unsized x-dataview-container')]/child::div//div[@class='footer']/ul/li[8]");
	}
	
	public static final By clickOnDeleteSideColumn()
	{
		return By.xpath("//div[text()='Delete']");
	}
	
	public static final By clickOnDeletePopupYesButton()
	{
		//return By.xpath("//span[text()='Yes']");
		
		return By.xpath("//div[@class='x-container x-unsized x-msgbox-dark x-msgbox x-floating']//span[text()='Yes']");
	}
	
	public static final By kanbanBoardRandomZonePath()
	{
		return By.xpath("//form[@id='ext-zonePanel-21']");
	}
	
	public static final By clickOnDeleteAllTaskPopupYesButton()
	{
		return By.xpath("//span[text()='Yes']");
	}
	
	public static final By clickOnDeleteAllTaskPopupNoButton()
	{
		//return By.xpath("//span[text()='No']");
		return By.xpath("//div[@class='x-container x-unsized x-msgbox-dark x-msgbox x-floating']//span[text()='No']");
	}
	
	
	// quick Action xath
	
	public static final By quickActionCheckCondition()
	{
		return By.xpath("//div[contains(@class,'preferenceLeftMenuList')]//div[contains(@style,', 200px')]/child::div[2]/div");
	}
	
	public static final By clickOnQuickAction()
	{
		return By.xpath("//div[text()='Quick Actions']");
	}
	
	public static final By clickOnChangeDateQuickAction()
	{
		return By.xpath("//div[text()='Change Date']");
	}
	
	public static final By isChangeDateWindowVisible()
	{
		return By.xpath("//div[contains(@id,'ext-container-') and contains(@style,'width: 100%')]");
	}
	
	public static final By switchToiFrame()
	{
		return By.tagName("iframe");
	}
	
	public static final By isStartDateCalendarVisibleUnderiFrame()
	{
		return By.xpath("//label[text()='Start Date']");
	}
	
	public static final By clickOnQuickActionDueDateCalendarField()
	{
		return By.xpath("//label[text()='Due Date']/following::input");
	}
	
	public static final By dueDateQuickActionCalendarAfterOnClick()
	{
		return By.xpath("//div[contains(@class,'slds-datepicker')]");
	}
	
	public static final By getSelectedDateFromQuickActionDueDateCalendar()
	{
		return By.xpath("//div[contains(@class,'slds-datepicker')]//tbody//td[@aria-selected='true']");
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
	
	public static final By performRandomClickOnKanbanBoard()
	{
		return By.xpath("//div[contains(text(),'Regression Kanban Board')]");
	}
	
	public static final By verifyDateQuickActionChange()
	{
		return By.xpath("//div[contains(@class,'kanbancard')]//div[@class='footer']/ul/li[@title='Days Effort ']");
	}
	public static final By clickOnPlanganttcheckbox()
	{
		return By.xpath("//input[contains(@name,'j_id0:page:j_id3:theBlock:thetable:0:j_id56')]");
	}
	
}