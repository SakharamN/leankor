package pom_package;

import org.openqa.selenium.By;

import helper_package.CreateKanbanCardsOnDifferentMasterContainersHelper;

public class CreateKanbanCardsOnDifferentMasterContainerLocators {
	
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
		return By.xpath("//div[text()='A "+CreateKanbanCardsOnDifferentMasterContainersHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
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
			return By.xpath("//div[contains(text(),'"+ CreateKanbanCardsOnDifferentMasterContainersHelper.createProjectNameRandomly +"')]");
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
		return By.xpath("//div[contains(text(),'Kanban Board1')]");
	}
	
	public static final By clickOn_KanbanBoardZoomIcon()
	{
		return By.id("zoomIcon");
	}
	
	
	public static final By clickOnNewToAddCardToBoard()
	{
		return By.id("newCardBtn");
		//return By.xpath("//div[@class='x-inner x-toolbar-inner x-horizontal x-align-center x-pack-start x-layout-box']/div[@class='x-button x-iconalign-left newTopBtn x-button-topBarBtn x-stretched x-layout-box-item']");
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
		return By.xpath("//div[text()='cat2']");
	}
	
	public static final By selectCategoryFromDropDownValueHr()
	{
		return By.xpath("//div[text()='cat1']");
	}
	
	public static final By selectCategoryFromDropDownValueMarketing()
	{
		return By.xpath("//div[text()='cat3']");
	}
	
	public static final By selectCategoryFromDropDownValueOperations()
	{
		return By.xpath("//div[text()='cat4']");
	}
	
	public static final By selectCategoryFromDropDownValueSales()
	{
		return By.xpath("//div[text()='cat5']");
	}
	
	//Dynamically select category for card
	public static final By selectCategoryFromDropDownDynamically()
	{
		//return By.xpath("//*[contains(@style,'background: transparent; margin-top: 5px; -webkit-box-flex: 1;')]//div[@class='x-body x-scroll-view']/div[3]/div[1]/div");
		return By.xpath("//div[@class='x-container x-form-fieldset fieldSetCls x-layout-box-item x-flexed x-stretched']//div[@id='categoryTextBtn']");
	}
	
	public static final By enterCardId()
	{
		return By.xpath("//div[@class='x-container x-field-text x-field x-label-align-top x-field-labeled x-form-label-nowrap x-empty x-layout-box-item x-flexed x-stretched']/div[2]/div[1]/input[1]");
	}
	
	public static final By enterCardTitle()
	{
		return By.xpath("//div[@class='x-container x-field-text x-field x-label-align-top x-form-label-nowrap x-empty x-field-labeled']/div[2]/div[1]/input[1]");
	}
	
	public static final By enterCardDescription()
	{
		return By.xpath("//div[@class='x-container x-field-textarea x-field x-label-align-top x-form-label-nowrap x-empty x-field-labeled']/div[2]/div[1]/textarea[@name='Description']");
	}
	
	public static final By enterCardAcceptanceCriteria()
	{
		return By.xpath("//div[@class='x-unsized x-field-input']/textarea[@name='AcceptanceCriteria']");
	}
	
	public static final By selectAssignAnOwnerDropDown()
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
		return By.xpath("//span[contains(text(),'Low')]");
	}
	
	public static final By enterEstimationTime()
	{
		return By.xpath("//input[@name='EstimatedDuration']");
	}
	
	public static final By clickOnCreateButtonForCard()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	public static final By clickOnAddToBoardFan()
	{
		return By.xpath("//div[@id='mainMenuBtn']");
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
	
	public static final By ClickOnSearchField()
	{
		return By.xpath("//input[contains(@placeholder,'Search by Name..')]");
	}
	
	
	//xpath for creating new category
	public static final By ClickonCreateButtonforCreatingNewCategory()
	{
		return By.xpath("//div[contains(@class,'x-container x-panel x-sized sidemenuCls x-floating')]//span[text()='Create']");
	}
	
	public static final By CategoryNameInputfield()
	{
		return By.xpath("//input[@name='categoryName']");
	}
	
	public static final By CategoryColourDropdown()
	{
		return By.xpath("//div[contains(@class,'categoryColorField')]");
	}
	
	public static final By ColourPickerlist()
	{
		return By.xpath("//div[contains(@class,'x-container x-panel x-sized x-floating')]//div[contains(@class,'x-unsized x-dataview-container')]/div");
	}
	
	public static final By SelectSafronColourfromPicklist()
	{
		return By.xpath("//div[contains(@class,'x-container x-panel x-sized x-floating')]//div[contains(@class,'x-unsized x-dataview-container')]/div[5]");
	}
	public static final By selectRedColourfrompicklist()
	{
		return By.xpath("//div[contains(@class,'x-container x-panel x-sized x-floating')]//div[contains(@class,'x-unsized x-dataview-container')]/div[17]");
	}
	
	public static final By selctgreenColourfrompicklist()
	{
		return By.xpath("//div[contains(@class,'x-container x-panel x-sized x-floating')]//div[contains(@class,'x-unsized x-dataview-container')]/div[3]");
	}
	
	public static final By selectyellowcolourfrompicklist()
	{
		return By.xpath("//div[contains(@class,'x-container x-panel x-sized x-floating')]//div[contains(@class,'x-unsized x-dataview-container')]/div[8]");
	}
	
	public static final By ClickonCategorySaveButton()
	{
		return By.xpath("//div[contains(@class,'x-container x-panel x-sized sidemenuCls x-floating')]//span[text()='Save']");
	}
	
	public static final By selectCategoryFromDropDownValueCategory1()
	{
		return By.xpath("//div[text()='Category1']");
	}
	
	public static final By Allcategorynames()
	{
		return By.xpath("//div[@class='x-dock-body']//div[contains(@id,'ext-simplelistitem-')]");
	}
	
	public static final By selectUserAfterSearch()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	public static final By clickOnStickerColumn()
	{
		return By.xpath("//div[text()='Stickers']");
	}
	
	public static final By stickerWindowsElementSize()
	{
		return By.xpath("//div[contains(@class,'allStickerList')]//div[contains(@class,'categoryListCls')]");
	}
		
}