package pom_package;

import org.openqa.selenium.By;

import helper_package.FolderProjectKanbanCardCloningCardsfromOneMcToAnotherMC;
import helper_package.KanbanBoardRegressionHelper;
import helper_package.KanbanBoardSettingHelper;

public class KanbanBoardSettingLocators {
	
	
	//Reach towards kanbanBoard xpath
	public static final By clickOnProjectBoard()
	{
		return By.xpath("//div[text()='Project Boards']");
	}
	
	public static final By clickOn_KanbanBoardZoomIcon()
	{
		return By.id("zoomIcon");
	}
	
	public static final By clickOnCreatedKanbanBoard()
	{
		return By.xpath("//div[text()='Regression Kanban Board']");
	}
	
	public static final By toolBarSettingIcon()
	{
		return By.id("listIconBtn");
		
		//return By.xpath("//div[@id='listIconBtn']");
	}
	
	public static final By saveOptionUnderSetting()
	{
		return By.xpath("//*[contains(@class,'saveBtnCls')]");
	}
	
	public static final By preferenceOption()
	{
		return By.xpath("//div[contains(@class,'preferenceBtnCls')]");
	}
	
	public static final By subscriberToCardsToggleSlider()
	{
		return By.xpath("//div[@style='margin: 15px 0px 0px !important;']//div[contains(@id,'ext-slider-')]");
	}
	
	public static final By tickAllCheckboxForSubscribeToCards()
	{
		return By.xpath("//*[contains(@id,'ext-formpanel-') and @class='x-container x-unsized x-form']/div//div[@class='x-component-outer']");
	}
	
	public static final By followOnChatterToggleSlider()
	{
		return By.xpath("//div[@style='margin: 0px 0px 5px !important;']//*[contains(@id,'ext-slider-')]");
	}
	
	public static final By followOnChatterAllCheckbox()
	{
		return By.xpath("//div[@class='x-inner x-panel-inner x-vertical x-align-stretch x-pack-start x-layout-box']/div[contains(@id,'ext-checkboxfield-')]/div[@class='x-component-outer']");
	}
	
	public static final By allCategoryCheckboxList()//need to change xpath
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-') and @style='height: 333px !important;']/div/div/div[@class='x-component-outer']");
	}
	
	public static final By loadMaskAfterSave()//after loading
	{
		//return By.xpath("//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
		
		return By.xpath("//form//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
	
	public static final By clickOnSaveButton()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	
	public static final By clickOnZoomIcon()
	{
		return By.xpath("//div[contains(@class,'zoomIcon ')]");
	}
	
	public static final By sizeofallvalue()
	{
		return By.xpath("//div[@class='slds-form-element slds-hint-parent']//input");
	}
	
	
	public static final By clickOnTaskIconFromCardFace()
	{
		return By.xpath("//div[contains(@class,'kanbancard')]//div[@class='footer']/ul/li[6]");
	}
	
	public static final By taskFlyPopupWindowAfterClickOnCardFace()
	{
		return By.id("TaskOverListPnl");
	}
	
	public static final By taskRecordListOnTaskFlyPopupWindow()
	{
		return By.xpath("//div[contains(@class,'taskListOverlayCls')]//div[contains(@class,'-item-first')]");
	}
	
	public static final By clickOnTaskCompletionButton()
	{
		return By.xpath("//div[contains(@class,'taskListOverlayCls')]//div[contains(@class,'-item-first')]//td[5]/div");
	}
	
	public static final By floatingWindowOverTask()
	{
		return By.xpath("//div[contains(@class,'x-sized x-floating') and contains(@style,'z-index: 499')]");
	}
	
	public static final By getChatterCountFromCardFaceAfterTaskMarkComplete()
	{
		return By.xpath("//div[contains(@class,'kanbancard')]//div[@class='footer']/ul/li[5]/span");
	}
	
	//Securtiy xPath
	public static final By clickOnSecurityOptionUnderPreference()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[4]");
	}
	
	public static final By clickOnCEODesignationEdit()
	{
		return By.xpath("//div[contains(@class,'securityListCls')]//div[contains(@class,'-item-first')]//div[@title='Edit Security']");
	}
	
	public static final By disableAbilityToMoveCardsCheckbox()
	{
		return By.id("canMoveCheckBox");
	}
	
	public static final By disableAbilityToEditCards()
	{
		return By.id("canEditCheckBox");
	}
	
	public static final By clickOnDoneButtonRolePreferenceUnderSecurity()
	{
		return By.xpath("//span[text()='Done']");
	}
	
	public static final By ceoDisableMoveCheckbox()
	{
		return By.xpath("//div[contains(@class,'-item-first')]//table/tbody/tr/td[2]/span");
	}
	
	
	public static final By ceoDisableEditCheckbox()
	{
		return By.xpath("//div[contains(@class,'-item-first')]//table/tbody/tr/td[3]/span");
	}
	
	
	// Cases xPath
	public static final By clickOnCasesOptionUnderPreference()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[5]");
	}
	
	public static final By turnOnCaseSyncCheckbox()
	{
		return By.xpath("//div[contains(@id,'ext-casesSettings-')]//div[@class='x-container x-field-checkbox x-field x-label-align-left preferencesCheckboxcls x-form-label-nowrap x-field-labeled']/div[2]");
	}
	
	public static final By clickOnChooseNewCaseCardCategoryDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-casesSettings-')]//div[starts-with(@id,'ext-fieldset-')]");
	}
	
	public static final By selectCategoryFromDropdown()
	{
		return By.xpath("//div[text()='Finance']");
	}
	
	public static final By homeButtonKanbanBoard()
	{
		return By.xpath("//div[contains(@class,'topBarButtonCls carouselHome')]");
	}
	
	public static final By clickOnPlusIconOnLeankorHomePage()
	{
		
		//return By.xpath("//li[@id='AllTab_Tab']/a");
		//return By.xpath("//div[@class='slds-no-print oneAppNavContainer']//span[text()='Cases']");
		
		//return By.xpath("//ul[@class='slds-global-actions']//li//div[contains(@class,'globalCreateContainer branding-global-create oneGlobalCreate')]");
		//return By.xpath("/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[3]/div/div/div[1]/div/div/a/div/lightning-icon/span/lightning-primitive-icon/svg");
		
		return By.xpath("/html/body/div[4]/div[1]/section/header/div[2]/span/div[2]/ul/li[3]");
	}
	
	public static final By selectCasesObjectName()
	{
		return By.linkText("New Case");
		////ul[@class='scrollable']/li[6]
	}
	
	
	public static final By clickOnaccName()
	
	{
		
		return By.xpath("//div[@class='listContent']//ul");
	}
	
	
	public static final By selectthestatus()
	{
		return By.xpath("//div[@class='slds-grid slds-gutters_small mdp cols-1 forcePageBlockSectionRow']//div[@class='uiPopupTrigger']//a");
		
	}
	
	public static final By clickonNew()
	{
		
		return By.xpath("//a[@title='New']");
	}
	
	
	public static final By clickOnsaveButtonForcases()
	{
		
		return By.xpath("//div[@class='slds-grid bottomBar']//span");
		//return By.xpath("//div[@class='slds-grid bottomBar']//div[2]");
	}
	
	public static final By clickOnCrossIconOnLexWindow()
	{
		return By.id("tryLexDialogX");
	}
	
	public static final By clickOnNewButtonForCreateCase()
	{
		//return By.name("new");
		return By.xpath("//div[@class='slds-grid']//ul/li/a//div[@title='New']");
	}
	
	public static final By selectCaseRecordType()
	{
		//return By.id("p3");
		return By.xpath("//div[@class='changeRecordTypeRow']//div[@class='changeRecordTypeOptionRightColumn']//div[text()='This case record type is for technical issues']");
	}
	
	public static final By selectContinueButtonFromCaseTypePage()
	{
		//return By.xpath("//input[@title='Continue']");
		return By.xpath("//button[@type='button']//span[text()='Next']");
		
	}
	
	
	
	public static final By AllElementsOnCaseIT()
	{
		
		//return By.xpath("//div[@class='record-layout-container']//div[contains(@id,'sectionContent-')]//div[contains(@class,'slds-form-element__control')]");
		//return By.xpath("//div[@class='slds-form']//button[contains(@id,'combobox-button-')]");
		return By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_case___0123s000000ixjzaaq___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/support-lwc-input-case-status/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/button");
	}
	
	public static final By caseObjectStatusDropdown()
	{
		//return By.id("cas7");
		//return By.id("//div[contains(@id,'sectionContent-')]//div[contains(@class,'slds-form-element__control')]//button[contains(@data-value,'New')]");
		return By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_case___0123s000000ixjzaaq___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[1]/slot/records-record-layout-item[1]/div/span/slot/support-lwc-input-case-status/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/button");
	}
	
	
	public static final By ClickOnnewDropdownValue()
	{
		
		return By.xpath("//div[contains(@id,'dropdown-element-')]/lightning-base-combobox-item[3]");
	}
	
	
	public static final By caseObjectCaseOriginDropdown()
	{
		 //return By.id("cas11");
		// return By.xpath("//div[contains(@id,'sectionContent-')]//records-record-layout-item[@field-label='Case Origin']");
		return By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div[1]/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_case___0123s000000ixjzaaq___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[2]/div/div/div/slot/records-record-layout-row[2]/slot/records-record-layout-item[1]/div/span/slot/records-record-picklist/records-form-picklist/lightning-picklist/lightning-combobox/div/lightning-base-combobox/div/div[1]/button");
	}
	
	
	public static final By clickOnPhonevalue()
	{
		return By.xpath("//div[contains(@id,'sectionContent-')]//records-record-layout-item[@field-label='Case Origin']//div[contains(@id,'dropdown-element-')]/lightning-base-combobox-item[3]");
	}
	

	public static final By saveButtonOnCaseObjectPage()
	{
		//return By.name("save");
		return By.xpath("//button[contains(@class,'slds-button slds-button_brand') and (@type='button')]");
	}
	
	public static final By getCasesId()
	{
		return By.className("pageDescription");
	}
	
	public static final By verifyCaseNameOnCaseCard()
	{
		return By.xpath("//*[contains(text(),'"+KanbanBoardSettingHelper.getCaseNameFromCaseObjectPage+"')]");
	}
	
	public static final By getOpportunityId()
	{
		return By.className("pageDescription"); 
	}
	
	public static final By getTitleOfOpportunityCard()
	{
		return By.xpath("//p[text()='Opportunity:OpportunityCreatedByAutomatedTestScript']");
	}
	
	//Opportunity Card creation xPath
	
	public static final By clickOnOpprotunitiesOptionUnderPreference()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[6]");
	}
	
	public static final By turnOffCaseSyncCheckbox()
	{
		return By.xpath("//div[contains(@id,'ext-casesSettings-')]//div[@class='x-container x-field-checkbox x-field x-label-align-left preferencesCheckboxcls x-form-label-nowrap x-field-labeled']/div[2]");
	}
	
	public static final By turnOnOpportunitySyncCheckbox()
	{
		return By.xpath("//div[contains(@id,'ext-opportunitySettings-')]//div[@class='x-container x-field-checkbox x-field x-label-align-left preferencesCheckboxcls x-form-label-nowrap x-field-labeled']/div[2]");
	}
	
	public static final By scrollToNewOpportunityCardCategoryDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-opportunitySettings-')]//div[contains(@class,'prority_lbl_white')]");
	}
	
	public static final By clickOnNewOpportunityCardCategoryDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-opportunitySettings-')]//div[contains(@class,'-width fieldSetCls')]");
	}
	
	public static final By selectCategoryFromOpportunityDropdown()
	{
		return By.xpath("//div[text()='Marketing']");
	}
	
	public static final By selectOpportunitiesObjectName()
	{
		return By.linkText("New Opportunity");
	}
	
	
	public static final By clickOnNewButtonForCreateOpportunity()
	{
		//return By.xpath("//div[@class='slds-grid']//ul/li/a/div[text()='New']");
		
		return By.xpath("//div[@class='slds-grid']//ul/li/a//div[@title='New']");
	}

	public static final By selectOpportuntiyCloseDate()
	{
		
		
		//return By.xpath("//input[@name='CloseDate']//parent::div");
		
	//	return By.xpath("//div[contains(@class,'slds-form-element__control slds-input-has-icon slds-input-has-icon_right')]");//nw ths work
		
		//return By.xpath("//input[@name='CloseDate']");
		//return By.xpath("CloseDate");
		//return By.xpath("//span[@class='dateFormat']/a");
		
		return By.xpath("/html/body/div[4]/div[1]/section/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[1]/section/div/section/div/div/div/div/div/div[3]/div/div/div/div/div/input");
	}
	
	
	
	
   public static final By SelectDateFromCalendor()
	
	{
		//return By.xpath("//div[contains(@class,'slds-datepicker slds-dropdown slds-dropdown_left')]//tbody/tr//td//span[text()='14']");
          return By.xpath("/html/body/div[8]/div/div[2]/table/tbody/tr[4]/td[4]/span");
	}
	 
   
   
   
   public static final By SelectAllCheckbox()
   {
	   return By.xpath("//div[contains(@id,'sectionContent-')]//input[contains(@id,'input-')]");
   }
   
   
   
 
	
	public static final By enterOpportunityNameInPutField()
	{
		//return By.xpath("//input[@name='Name']");
		//return By.id("opp3");
		return By.xpath("/html/body/div[4]/div[1]/section/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[1]/section/div/section/div/div/div/div/div/div[1]/div/div/div/div/input");
	}
		
	public static final By clickOnAccountNameLookupIcon()
	{
		//return By.xpath("//img[contains(@title,'Account Name Lookup')]");
		
		return By.xpath("//input[contains(@placeholder,'Search Accounts...')]");
	}
	
	
	  public static final By clickonLokAccountNameIcon()
	   
	   {
		  //return By.xpath("//div[contains(@style,'position: fixed; z-index: 9115; left: 42px; right: auto; top: 357px; width: 353.5px;')]//ul[@role='group']/li[2]");
		   return By.xpath("//div[contains(@id,'dropdown-element-')]/ul/li[3]");
		  //return By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[2]/div/div/div/records-modal-lwc-detail-panel-wrapper/records-record-layout-event-broker/slot/records-lwc-detail-panel/records-base-record-form/div/div/div/div/records-lwc-record-layout/forcegenerated-detailpanel_opportunity___012000000000000aaa___full___create___recordlayout2/records-record-layout-block/slot/records-record-layout-section[1]/div/div/div/slot/records-record-layout-row[3]/slot/records-record-layout-item[1]/div/span/slot/records-record-layout-lookup/lightning-lookup/lightning-lookup-desktop/lightning-grouped-combobox/div[1]/div/lightning-base-combobox/div/div[2]/ul/li[2]/lightning-base-combobox-item/span[2]/span");
	   }
	   

	public static final By ClickOnStagedropdown()
	{
		
		return By.xpath("/html/body/div[4]/div[1]/section/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[1]/section/div/section/div/div/div/div/div/div[4]/div/div/div/div/div/div[1]/div/div/a");
	}
	  
	  
	public static final By SelectDropdownValueQualification()
	{
		//return By.xpath("//div[@class='slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left slds-dropdown_length-with-icon-10']//span[text()='Qualification']");
		
		return By.xpath("/html/body/div[8]/div/ul/li[3]/a");
	}
	
	public static final By clickOnsaveButtonforopp()
	{
		
		//return By.xpath("//button[text()='Save']");
		return By.xpath("//div[@class='slds-grid bottomBar']//span");
	}
	  
	  
	  
	  
	  
	  
	  
	  
	public static final By inspectFrameTag()
	{
		return By.tagName("frameset");
	}	
	
	public static final By newButtonCreateAccountRecord()
	{
		return By.name("new");
	}
	
	public static final By accountNameInputField()
	{
		return By.xpath("//form[@id='new']//input[@type='text' and @id='2']");
	}
	
	public static final By accountRecordSaveButton()
	{
		return By.xpath("//div[@class='pbBottomButtons']//input[@name='save' and @title='Save']");
	}
	
	

	
	
	public static final By opportunityObjectStageDropdown()
	{
		return By.id("opp11");
	}
	
	public static final By opportunityObjectSaveButtonList()
	{
		return By.name("save");
	}
	
	
	//Default link xPath
	public static final By opportunitySynchronizationOkButton()
	{
		return By.xpath("//span[text()='OK']");
	}
	
	public static final By ClickOnGoBackIcon()
	{
		return By.xpath("//div[contains(@class,'gobackbtncls')]//span[contains(text(),'GO BACK')]");
	}
	
	public static final By clickOnPlanGantt()
	{
		return By.xpath("//div[contains(@class,'-item-first')]//div[contains(text(),'Plan')]");
	}
	
	public static final By planGanttMaskLoader()
	{
		return By.xpath("//div[contains(@id,'-msgWrapEl') and contains(@style,'left: ')]");
	}
	
	public static final By clickOnPlusIconToAddActivity()
	{
		return By.className("addBtnTop");
	}
	
	public static final By addActivity()
	{		
		//return By.xpath("//*[text()='Add Activity']");
		
		return By.xpath("//div[@class='x-menu x-layer x-menu-default x-border-box'][1]/div/div/child::div[2]/div/div[1]");
	}
	
	public static final By enterActivityName()
	{
		
		return By.xpath("//table[contains(@id,'treeview-')]/tbody/tr//td[contains(@class,'-nameColumnId ')]//span[contains(@class,'columnname x-tree-node-text ')]/span[text()='AT']");
		//return By.xpath("//table[contains(@id,'treeview-')]/tbody/tr//td[contains(@class,'-nameColumnId')]//span[contains(@class,'-tree-node-text')]/span[text()='Default']");
	}
	
	public static final By writeActivityName()
	{
		return By.xpath("//table[contains(@class,'x-grid-item x-grid-item-selected')]//td[@data-columnid='nameColumnId']");
	}
	
	public static final By clickOnDefaultLinkOptionUnderPreference()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[7]");
	}
	
	public static final By projectLinkToProjectBoardAndCardCommonDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-linkPreferences-')]//div[@style='margin: 7px 10px 0px !important;']//div[contains(@class,'x-button-topBarBtn')]");
	}
	
	public static final By clickOnFolderName()
	{
		return By.xpath("//div[text()='Regression Folder']");		
	}
	
	public static final By clickOnProjectName()
	{
		return By.xpath("//div[text()='Regression Project']");
	}
	
	public static final By selectPlanBoard()
	{
		return By.xpath("//div[text()='Plan Board(Regression Project)']");
	}
	
	public static final By selectActivityName()
	{
		//return By.xpath("//div[text()='Default']");
		
		//return By.xpath("//p[text()='Activity1']");
		return By.xpath("//div[text()='Activity1']");
		
	}
	
	public static final By verifyMiniatureOnActivityCardCount()
	{
		return By.xpath("//div[contains(@id,'customganttpanel-')]//table[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div");
	}
	
	public static final By planGanttSettingGearIcon()
	{
		return By.xpath("//div[contains(@id,'header-innerCt')]//div[contains(@class,'setting')]");
	}
	
	public static final By planGanttZoomToFit()
	{
		return By.id("copy_1");
	}
	
	
	//Board Setting xPath
	
	public static final By clickOnBoardSettingUnderPreference()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[9]");
	}
	
	public static final By boardSettingBothDropdownList()
	{
		return By.xpath("//div[contains(@id,'ext-boardSetting-')]//div[contains(@id,'ext-selectfield-')]/div[2]");
	}
	
	public static final By selectValueFromCardEffortIndicatorDropdownHours()
	{
		//return By.xpath("//span[text()='Hours']");
		
		return By.xpath("//div[@class='x-container x-panel x-sized x-selectFld-allOverlayList x-floating']//span[text()='Hours']");
	}
	
	public static final By selectValueFromCardEffortIndicatorDropdownPoint()
	{
		return By.xpath("//span[text()='Points']");
	}
	
	public static final By selectValueFromCardEffortIndicatorDropdownDays()
	{
		return By.xpath("//span[text()='Days']");
	}
	
	public static final By selectValueFromChatterFromLinkedRecordDropdownCasesChatter()
	{
		return By.xpath("//span[text()='Cases Chatter']");
	}
	
	public static final By selectValueFromChatterFromLinkedRecordDropdownOpportunitiesChatter()
	{
		return By.xpath("//span[text()='Opportunities Chatter']");
	}
	
	public static final By selectValueFromChatterFromLinkedRecordDropdownKanbanCardsChatter()
	{
		return By.xpath("//span[text()='Kanban Cards Chatter']");
	}
	
	public static final By boardSettingAllCheckBox()
	{
		return By.xpath("//div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div[contains(@class,'preferencesCheckboxcls')]/div[@class='x-component-outer']");
	}
	
	public static final By scrollToRollupModeCheckbox()
	{
		return By.xpath("//div[contains(@id,'ext-boardSetting-')]//div[contains(@class,'x-pack-start')]/div[8]/div[@class='x-component-outer']");
	}
	
	public static final By filterConfirmationField()
	{
		return By.name("cardsRequireFilterConfirmation");
	}
	
	
	//Inbound EMail xPath
	public static final By clickOnInboundEmailUnderPreference()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[10]");
	}
	
	public static final By defaultOwnerDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-inboundEmail-')]//div[contains(@class,'x-form-fieldset-inner')]");
	}
	
	public static final By inputFieldUnderOwnerDropdown()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	public static final By clickOnSearchIconUnderDropdown()
	{
		return By.xpath("//div[contains(@class,'searchBtnCls')]");
	}
	
	public static final By selectOwnerAfterSearch()
	{
		return By.xpath("//div[text()='Pratish Laad']");
	}
	
	public static final By defaultCategoryDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-inboundEmail-')]//div[contains(@id,'ext-input-')]");
	}
	
	public static final By selectCategoryFromDefaultCategoryDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-element-') and contains(@class,'x-scroll-scroller')]/div[5]");
	}
	
	
	//Clone Kanban Board xPath
	
	public static final By cloneKanbanBoardOption()
	{
		return By.xpath("//div[contains(@class,'cloneBtnCls ')]");
	}
	
	public static final By cloneProjectBoardName()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//input[@name='projectBoard']");
	}
	
	public static final By selectProjectDropdown()
	{
		//return By.xpath("//div[@id='selectedProjectRoom']/div[2]");
		//return By.xpath("//*[@id=\"ext-button-120\"]");
     	return By.xpath("//div[contains(@class,'x-inner x-vertical x-align-stretch x-pack-start x-layout-box')]//div[contains(@id,'ext-fieldset-1')]/div");
				
		
	}
	
	public static final By selectProjectFromDropdownForClone()
	{
		//return By.xpath("//span[text()='Regression Project']");
		return By.xpath("//div[text()='Regression Project']");
		
	}
	
	public static final By cloneProjectStartDateCalender()
	{
		return By.xpath("//div[contains(@class,'calanderStartDateIcon')]//input");
	}
	
	public static final By selectDateFromStartDateCalender()
	{
		return By.xpath("//input[@value='Today']");
	}
	
	public static final By selectHighlightedDate()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li[@class='highlighted picked']");
	}
	
	public static final By dayPanelList()
	{
		return By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-panel']/ul[3]/li");
	}
	
	public static final By createButtonForCloneKanbanBoard()
	{
		//return By.xpath("//span[text()='Create']");
		//return By.xpath("//div[contains(@class,'saveBtnClss ')]/span[3]");
		
		return By.xpath("//form[@class='x-container x-form x-sized x-paint-monitored overlayFloatingClsNew']//div[contains(@class,'saveBtnClss ')]/span[3]");// summer 24
	}
	
	
	public static final By cloneProjectDueDateCalender()
	{
		return By.xpath("//div[contains(@class,'calanderDueDateIcon')]//input");
	}
	
	//Filter on Kanban Board
	
	public static final By filterIcon()
	{
		//return By.id("searchBtn");
		return By.id("searchBtn");
	}
	
	public static final By advanceFilterDropdownList()
	{
		return By.xpath("//div[contains(@class,'advanceFilterButton')]");
	}
	
	public static final By clickOnOwnerUnderCardTaskOwner()
	{
		//return By.xpath("//div[contains(@id,'ext-list-')]//div[contains(@style,'translate3d(0px, 40px, 0px);')]");
		return By.xpath("//div[contains(@id,'ext-list-')]//div[@class='stickerText']");
	}
	
	public static final By selectCategoryUnderCategoryDropdown()
	{
		return By.xpath("//div[text()='cat2']");
	}
	
	public static final By uploadStickerOnDemoCardEdit()
	{
		return By.xpath("//form[@id='ext-zonePanel-33']//div[@class='footer']/ul/li[@class='edit']");
	}
	
	public static final By clickOnStickerSideColumn()
	{
		return By.xpath("//div[text()='Stickers']");
	}
	
	public static final By selectStickerForUploadOnDemoKanbanCard()
	{
		return By.xpath("//div[contains(@class,'allStickerList')]//div[@style='transform: translate3d(0px, 0px, 0px);']//div[contains(@class,'categoryListCls')]");
	}
	
	public static final By clickOnStickerForFilterCard()
	{
		//return By.xpath("//div[text()='img 0']");
		//return By.xpath("// div[text()='1']");
		return By.xpath("// div[text()='Stickers1']");
	}
	
	public static final By selectPriorityFromPriorityDropdown()
	{
		return By.xpath("//div[text()='Medium']");
	}
	
	public static final By selectByPortfolioPlanGantt()
	{
		return By.xpath("//div[@class='stickerText' and contains(@style,'text-overflow:')]//self::div[text()='Default']");
	}
	
	public static final By selectByPortfolioKanbanBoard()
	{
		return By.xpath("//div[text()='Card For Link:One Card is link to this card']");
	}
	
	// All advanced filter applied xPath
	public static final By selectCardTaskOwner()
	{
		//return By.xpath("//div[contains(@id,'ext-list-')]//div[contains(@style,'translate3d(0px, 40px, 0px);')]");
		return By.xpath("//div[contains(@id,'ext-list-')]//div[contains(@class,'stickerText')]");
	}
	
	public static final By selectCategory()
	{
		return By.xpath("//div[text()='Default']");
	}
	
	public static final By selectPriority()
	{
		return By.xpath("//div[text()='Low']");
	}
	
	public static final By saveFilterButton()
	{
		return By.xpath("//span[text()='Save Filter']");
	}
	
	public static final By calenderViewIcon()
	{
		return By.id("calenderViewBtn");
	}
	
	public static final By calenderViewLoader()
	{
		return By.xpath("//div[contains(@id,'loadmask-')]//div[@class='x-mask-msg-text']");
	}
	
	public static final By resetFilter()
	{
		return By.xpath("//span[contains(@class,'clearFilterICon')]");
	}
	
	public static final By closeFilterWindow()
	{
		return By.xpath("//div[contains(@class,'removeSwimlaneCls') and contains(@class,'topBarBtnNew')]");
	}
	
	public static final By collapseExpandIcon()
	{
		return By.xpath("//div[contains(@class,'collapseIcon')]");
	}
	
	public static final By collapseAndExpandAllMasterContainerElementSize()
	{
		return By.xpath("//div[contains(@style,'width: 245px !important; height: 45%')]//div[contains(@class,'x-unsized x-list-item categoryListCls x-has-height x-list-item-tpl')]");
	}
	
	public static final By collapseAllMasterContainerCheck()
	{
		return By.xpath("//*[starts-with(@id,'ext-input-')]/input");
	}
	
	public static final By clickOnCollapseAllCheckbox()
	{
		return By.xpath("//div[contains(@style,'width: 245px !important; height: 45%')]//div[contains(@id,'ext-checkboxfield-') and contains(@class,'preferencesCheckboxcls')]");
	}
	
	public static final By masterContainerCountUnderCollapseExpandWindow()
	{
		return By.xpath("//div[contains(@style,'width: 245px !important; height: 45%')]//div[contains(@class,'x-unsized x-list-item categoryListCls x-has-height x-list-item-tpl')]");
	}
	
	
	//Pan Kanban board and Reset kanban Board xPath
	public static final By panBoardIcon()
	{
		return By.id("handbtn");
	}
	
	public static final By inProgressMasterContainer()
	{
		return By.id("ext-zonePanel-33");
	}
	
	public static final By kanbanBoardToolBarHeader()
	{
		return By.id("valueStreamDisplayName");
	}
	public static final By resetKanbanBoardIcon()
	{
		return By.id("resetButton");
	}
	
	public static final By masterContainerName()
	{
		return By.xpath("//div[contains(text(),'Review & Approve ')]");
	}
	
	//View/Save as PDF xPath
	public static final By viewSaveAsPdfIcon()
	{
		return By.id("importAsPdfBtn");
	}
	
	public static final By closePdfWindow()
	{
		return By.xpath("//div[contains(@class,'closeBtn')]");
	}
	
	public static final By pdfWindowIframe()
	{
		return By.tagName("iframe");
	}
	
	public static final By clickOnSaveAsPdfWindow()
	{
		return By.xpath("//div[contains(@id,'ext-toolbar-')]");
	}
	
	public static final By pdfWindow()
	{
		return By.tagName("embed");
	}
	
	
	//view all chatter xPath
	
	public static final By viewAllChatterIcon()
	{
		return By.id("valuestreamChatterButton");
	}
	
	public static final By chatterWindowOpenButton()
	{
		return By.xpath("//span[text()='Open']");
	}
	
	public static final By inspectIframe()
	{
		return By.xpath("//div[contains(@class,'overlayFloatingChatter')]//iframe");
	}
	
	public static final By iFrameSrcValueAndSwitchTo()
	{
		return By.xpath("//iframe[@src='"+KanbanBoardSettingHelper.getIframeSRCAttribute+"']");
	}	
	
	public static final By clickOnPostLink()
	{
		return By.xpath("//span[text()='Post']");
	}
	
	public static final By afterClickOnPostLinkWindowsVisibility()
	{
		return By.xpath("//div[@class='publisherWrapper']");
	}
	
	public static final By inspectChildiFrame()
	{
		return By.xpath("//iframe[contains(@title,'Rich Text Editor')]");
	}
	
	public static final By getChildiFrameClassAttributeValue()
	{
		return By.xpath("//iframe[@class='"+KanbanBoardSettingHelper.childiFrameValue+"']");
	}
	
	public static final By clickOnChatterTextArea()
	{
		return By.xpath("//body[text()='Write something...']");
	}
	
	public static final By writeOnChatterTextArea()
	{
		return By.xpath("//body[contains(@class,'chatterPublisherRTE')]");
	}
	
	public static final By chatterShareButton()
	{
		return By.id("publishersharebutton");
	}
	
	public static final By textDivArea()
	{
		return By.xpath("//div[contains(@class,'cxfeeditem ')]");
	}
	
	public static final By getTextFromChatterSubWindow()
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"+KanbanBoardSettingHelper.textAreaIDAttribute+"']//div[@class='cxfeeditemtextwrapper']//p");
	}
	
	public static final By getChatterTextFromHomePage()
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[@id='"+KanbanBoardSettingHelper.textAreaIDAttribute+"']//div[@class='cxfeeditemtextwrapper']//p");
	}
	
	public static final By closeKanbanBoardChatterPopup()
	{
		return By.xpath("//div[contains(@class,'overlayFloatingChatter')]//*[contains(@class,'closeBtn')]");
	}
	
	public static final By closeChatterWindow()
	{
		return By.xpath("//*[contains(@class,'closeBtn')]");
	}
	
	public static final By isCardCategoryChatterWindowVisible()
	{
		return By.xpath("//div[contains(@class,'openChatterlistItem')]");
	}
	
	public static final By openSalesCategoryCardChatter()
	{
		return By.xpath("//div[contains(@class,'openChatterlistItem')]//div[starts-with(@id,'ext-simplelistitem-')]//input[@class='chatterOpenListBtnCls']");
	}
	
	public static final By clickOnSalesCardChatterIcon()
	{
		return By.xpath("//form[contains(@id,'"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+"')]//div[contains(@class,'kanbancard ')]/div[2]/div[2]/ul/li[@class='chatter']");
	}
	
	public static final By salesCategoryCardCount()
	{
		return By.xpath("//form[contains(@id,'ext-zonePanel-33')]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[@class='chatter']/span");
	}
	
	public static final By salesCategoryCardLoadMask()
	{
		return By.xpath("//div[contains(@id,'ext-panel-')]//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
	
	
	//View All Card History
	
	public static final By notificationBellIcon()
	{
		return By.xpath("//div[contains(@class,'notificationIcon')]");
	}
	
	//Add Card To Board
	public static final By addCardToBoard()
	{
		return By.id("newCardBtn");
	}
	
	//Undo Kanban Board Action
	public static final By selectCardToPerformUndoAction()
	{
		return By.xpath("//form[@id='ext-zonePanel-32']//div[@class='x-unsized x-dataview-container']//div[@class='wrapper']//p[contains(@title,'Card Creating by new icon')]/following::div[1]/ul/li[@class='edit']");
	}
	
	public static final By clickOnDeleteSideColumn()
	{
		return By.xpath("//div[text()='Delete']");
	}
	
	public static final By yesButtonAfterDelete()
	{
		return By.xpath("//span[text()='Yes']");
	}
	
	public static final By NoButtonForTaskDelete()
	{
		return By.xpath("//span[text()='No']");
	}
	
	public static final By undoIcon()
	{
		return By.id("undoBtnMain");
	}
	
	public static final By verifyCardAfterUndoAction()
	{
		return By.xpath("//p[text()='HR']/following::p[contains(@title,'icon')]");
	}
	
	
	//Backlog master container Clone cards xPath
	
	public static final By kanbanBoardMasterContainersToolBarCount()
	{                   //div[contains(@class,'mainPanel') and starts-with(@id,'ext-productMasterContainer-')]
		return By.xpath("//div[contains(@class,'mainPanel') and starts-with(@id,'ext-productMasterContainer-')]");
	}
	
	public static final By clickOnBacklogMasterContainerArrow()
	{
		return By.xpath("//form[@id='ext-zonePanel-8']//div[contains(@class,'mainMasterTttl')]/div/child::div[2]/div[3]");
	}
	
	public static final By clickOnCloneCardsUnderBacklogMasterContainer()
	{
		return By.xpath("//div[text()='Clone Cards']");//for hyperjump
		//return By.xpath("//div[text()='Clone all Cards']");
	}
	
	public static final By selectKanbanBoardUnderSelectProjectBoard() 
	{
		return By.xpath("//div[text()='Regression Kanban Board']");	
	}
	
	public static final By hyperJumpCardsSubWindows()
	{
		return By.xpath("//form[contains(@style,'width: 350px !important; height: 90% !important; max-height: 600px') or contains(@id,'ext-formpanel-')]/div[1]/child::div[2]//div[@class='x-container x-panel x-layout-box-item x-stretched']//div[@style='margin: 3px 10px 0px !important;']/div/div/div/div[2]");
		
		//return By.xpath("//div[text()='Hyper Jump cards']");
	}
	
	public static final By selectReviewAndApprovalMasterContainerUnderSelectColumnDropdown()
	{
		//return  By.xpath("//div[contains(@style,'translate3d(0px, 138px')]");
		//return By.xpath("ext-zonePanel-34");
		
		return By.xpath("//div[text()='Review & Approve']");
	}
	
	public static final By clickOnCloneCardsButton()
	{
		return By.xpath("//span[text()='Clone']");
	}
	
	public static final By getListOfAllClonedKanbanCard()
	{
		return By.xpath("//form[@id='"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+"']//div[@class='x-unsized x-dataview-container']/div");
	}
	
	//Review And Approval master container Hyper Jump Cards xPath
	public static final By clickOnReviewAndApprovalMasterContainerArrow()
	{
		return By.xpath("//div[@id='"+KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId+"']//div[contains(@class,'mainMasterTttl')]/div/child::div[2]/div[3]");
	}
	
	public static final By clickOnHyperjumpCardsUnderReviewAndArroveMasterContainer()
	{
		return By.xpath("//div[text()='Hyper Jump cards']");
	}
	
	public static final By clickOnFolderWhichWillSelect()
	{
		return By.xpath("//div[text()='Regression Folder']");
	}
	
	
	public static final By selectProjectNameAfterExpandFolder()
	{
		return By.xpath("//div[text()='Regression Project']");
	}
	
	 

	public static final By selectKanbanBoardUnderProjectBoardDropdown()
	{
		return By.xpath("//div[text()='Regression Kanban Board']");
	}
	
	public static final By clickOnJumpButton()
	{
		return By.xpath("//span[text()='Jump']");
	}
	
	public static final By alertMessageOnKanbanBoard()
	{
		return By.xpath("//div[contains(@id,'ext-messagebox-')]");
	}
	
	public static final By clickOkButtonOnAlertMessage()
	{
		return By.xpath("//span[text()='OK']");
	}
	
	public static final By ClickOnOKBUtton()
	{
		return By.xpath("//div[contains(@id,'ext-messagebox-')]//div[contains(@class,'x-button-normal x-button saveBtnClss x-layout-box-item x-stretched')]/span[3]");
	}
	
	
	public static final By clickOnfoderwhichwilselectForHyperjump()
	{
		return By.xpath("//div[text()='MyFolder']");
	}
	
	public static final By selectProjectNameAfterExpandFolderforHyperjump()
	{
		return By.xpath("//div[text()='MyProject']");
	}
	
	public static final By selectKanbanBoardUnderProjectBoardDropdownforHyperjump()
	{
		return By.xpath("//div[text()='kb1']");
		
	}
	
	public static final By SearchProjectName()
	{
		return By.xpath("//input[@placeholder='Search by Project Name...']");
	}
	
	public static final By clickOnProject()
	{
		return By.xpath("//div[text()='Regression Project']");
	}
	
	
	
}