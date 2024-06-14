package pom_package;

import org.openqa.selenium.By;

public class CreateCardLocators  {
	
	public static final By switchToMainFrame()
	{
		return By.xpath("//iframe[contains(@name,'vfFrameId_')]");
	}
	
	public static final By switchToKanbanBoardIframeWindow()
	{
		return By.name("boardIfram");
	}
	
	public static final By errorPopUpOnKanbanBoard()
	{
		return By.xpath("//div[@class='x-container x-sized']/div[1]/div[1]/div[1]/div[1]/div[1]/div[@class='x-dock x-dock-horizontal x-unsized']");
	}
	
	public static final By clickOnOkButtonOnErrorMessage()
	{
		return By.xpath("//span[text()='OK']");
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
	
	public static final By clickOnAddCardToBoardUnderFanButton()
	{
		return By.xpath("//*[contains(@id,'cardFanBtn')]");
	}
	
	public static final By clickOnZoomIcon()
	{
		return By.id("zoomIcon");
	}
	
	public static final By clickOnNewToAddCardToBoard()
	{
		return By.xpath("//div[@class='x-inner x-toolbar-inner x-horizontal x-align-center x-pack-start x-layout-box']/div[@class='x-button x-button-topBarBtn x-stretched x-iconalign-left newTopBtn x-layout-box-item']");
	}	
	
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
		return By.xpath("//div[text()='Marketing']");
	}
	
	public static final By selectCategoryFromDropDownValueOperations()
	{
		return By.xpath("//div[text()='HR']");
	}
	
	public static final By selectCategoryFromDropDownValueSales()
	{
		return By.xpath("//div[text()='Sales']");
	}
	
	//Dynamically select category for card
	public static final By selectCategoryFromDropDownDynamically()//not understand  locater value
	{
		return By.xpath("//*[contains(@style,'width: 280px !important; height: 320px !important; left: 541.5px !important; margin: -11px 0px 0px !important; z-index: 12 !important; top: 164px !important;')]//div[@class='x-body x-scroll-view']/div[3]/div[1]/div[9]");
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
	
	public static final By enterCardAcceptanceCriteria()
	{
		return By.xpath("//div[@class='x-unsized x-field-input']/textarea[@name='AcceptanceCriteria']");
	}
	
	public static final By clickOnAssignAnOwnerDropDown()
	{
		return By.xpath("//div[@id='assignUserBtn']");
	}
	
	public static final By clickOnPrioirtyDropDown()
	{
		return By.xpath("//div[@id='priorityBtn']");
	}
	
	public static final By selectPriorityFromDropDown()
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
	
	public static final By enterEstimationTime()
	{
		return By.xpath("//input[@name='EstimatedDuration']");
	}
	
	public static final By clickOnCreateButtonForCard()
	{
		return By.xpath("//span[text()='Create']");
	}
	
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
	
	public static final By editCard()
	{
		return By.xpath("//div[@class='footer']/ul/li[8]");
	}
	
	public static final By kanbanBoardDuplicateView()
	{
		return By.xpath("//div[@id='zoomIcon']");
	}
	
	public static final By assignAnOwnerForTaskSearchIcon()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized overlayFloatingClsNew']/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
	}
	
	public static final By createdTaskName()
	{
		return By.xpath("//*[contains(@id,'ext-newPostTasks-')]//td[@class='subjectCmp_Task']");
	}
	
	public static final By clickOnTaskSideColumn()
	{
		//return By.xpath("//div[text()='Task']");
		return By.xpath("//div[contains(@class,'x-unsized x-list-item x-has-height x-list-item-tpl')]//div[text()='Task']");
		
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
		return By.xpath("//div[@class='x-container x-form-fieldset fieldSetCls x-layout-box-item x-flexed x-sized']/div[1]/div[2]/div[1]/div[@class='x-button x-button-topBarBtn prority_lbl_white x-layout-box-item x-sized']/span[text()='Assign an User']");
	}
	
	public static final By searchUserNameInInputField()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	public static final By selectUserAfterSearch()
	{
		return By.xpath("//div[text()='sakharam Nilkhan']");
	}	
	
	public static final By taskPriority()
	{
		return By.xpath("//div[@class='x-container x-form-fieldset fieldSetCls x-layout-box-item x-flexed x-sized']/div[1]/div[@class='x-dock-body']/following::div[5]/child::div[1]/child::div");
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
	

	//click on Link	
	public static final By clickOnAssignAnAccount()
	{
		return By.xpath("//div[@class='x-inner x-form-inner x-translatable x-size-monitored x-paint-monitored x-scroll-scroller']//*[contains(@style,'margin: 10px 10px 0px !important;')]//*[contains(@class,'x-dock-body')]");
	}
	
	public static final By clickOnAssignAnOpportunity()
	{
		return By.xpath("");
	}
	
	
	
	
	
		
	
	
	// Resource tab
	
	public static final By clickOnResourceSideColumn()
	{
		return By.xpath("//div[text()='Resource']");
	}
	
	public static final By whoIsTheOwnerOfResource()
	{
		return By.xpath("//td[@style='width:200px;color:#8192aa;cursor: default;']");
	}
	
	public static final By allocationColumn()
	{
		return By.xpath("//td[@style='width:260px;color:#8192aa;cursor: default;']");
	}
	
	public static final By clickOnEditCardFinalSaveButton()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	// Click on Add to board fan and click on stickers
	public static final By clickOnAddToBoardFan()
	{
		return By.xpath("//div[@id='mainMenuBtn']");
	}
	
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
		return By.xpath("//div[@class='x-button x-button-topBarBtnNew x-sized addSwimlaneCls x-layout-box-item']");
	}
	
	public static final By uploadStickerGlobalFieldCheck()
	{
		return By.xpath("//div[@class='x-form-label preferencesCheckboxLabel']");
	}
	
	public static final By enterNameOnUploadStickerInputField()
	{
		return By.xpath("//input[@name='Name']");
	}
	
	public static final By chooseFileNameFromDriveForUploadSticker()
	{
		//return By.xpath("//input[@accept='image/*']");
		return By.xpath("//div[contains(@class,'fileuploadbtn ')]");
	}
	
	public static final By uploadStickerUploadButton()
	{
		return By.xpath("//span[text()='Upload']");
	}
	
	public static final By clickOnStickerSideColumn()
	{
		return By.xpath("//div[text()='Stickers']");
	}
	
	public static final By getFormIdAttributeColumn()
	{
		return By.xpath("//*[contains(@id,'ext-stickersView-')]");
	}
	
	public static final By cardStickersVerify()
	{
		return By.xpath("//*[contains(@class,'kanbancard  visibleKanbanCardClass')]//li[@class='sticker']/img[1]");
	}
	
	public static final By firstKanbanCard()
	{
		return By.xpath("//*[contains(@style,'background: transparent; font-size: 0.9em; -webkit-box-flex: 1;')]//div[@class='x-unsized x-dataview-container']/div[@class='x-dataview-item']/div[1]");
	}
	
	public static final By secondKanbanCard()
	{
		return By.xpath("//*[contains(@style,'background: transparent; font-size: 0.9em; -webkit-box-flex: 1;')]//div[@class='x-unsized x-dataview-container']/div[@class='x-dataview-item x-item-selected']/div[1]");
	}
	
	public static final By clickOnSearchCategory()
	{
		return By.xpath("//input[@placeholder='Search by Name..']");
	}
}