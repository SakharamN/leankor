package pom_package;

import org.openqa.selenium.By;

import helper_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper;

public class CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator {
	
	
	
	public static final By customLoadspinner()
	{
		return By.xpath("//div[@class='customloader']");
	}
	
	public static final By clickOnThreeDot()
	{
		return By.xpath("//div[text()='A "+CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	}
	
	public static final By clickOnCreatedProject()
	{
		return By.xpath("//*[contains(text(),'"+ CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper.createProjectNameRandomly+"')]");
	}
	   
	public static final By clickOnPlanGantt()
	{
		//return By.xpath("//div[contains(@id,'ext-navigationSideMenu-')]//div[contains(text(),'Plan')]);
		return By.xpath("//div[contains(@id,'ext-navigationSideMenu-')]//div[contains(text(),'Plan')]");
				
	//	return By.xpath("//div[contains(@id,'ext-navigationSideMenu-')]//div[@class='x-list-item-first x-list-header-wrap x-list-item x-stretched x-list-item-tpl x-item-selected']//div[@class='columnname']");//spring 24
		
		//return By.xpath("//div[@class='x-container x-navigationview slide x-layout-box-item x-stretched out']//div[@class='x-list-item-first x-list-header-wrap x-list-item x-stretched x-list-item-tpl x-item-selected']/div/div/div[1]");
		
	//	return By.xpath("//div[@class='x-container x-navigationview slide x-layout-box-item x-stretched out']//div[@class='x-list-item-first x-list-header-wrap x-list-item x-stretched x-list-item-tpl x-item-selected']/div/div");
	}
	
	public static final By loadingSpinner()
	{
		return By.xpath("//div[@class='x-mask-msg']");
	}
	
	public static final  By clickOnPlusIcon()
	{
		//return By.xpath("//div[contains(@id,'namecolumn-')]//span[@name='addButton']");//Qa5 org,QA4
		
		return By.xpath("//div[contains(@id,'ganttcolumn-name-')]//span[@name='addButton']");// org 20
	}
	
	public static final By loadMask()
	{
		return By.xpath("//div[@class='x-mask-loading x-mask-msg-inner ']/div");
	}

	public static final By iframeOnPg()
	{
		return By.xpath("//iframe[@name='boardIfram']");
	}
	
	public static final By iframe()
	{
		return By.tagName("iframe");
	}
	
	public static final By addActivity()
	{
		//return By.xpath("/html/body/div[15]/div/div/div[2]/div/div[1]/a/span");
		return By.xpath("//div[@class='x-menu x-layer x-menu-default x-border-box'][1]/div/div/child::div[2]/div/div[1]");
	}
	
	public static final By addActivityButton()
	{
		return By.xpath("//span[text()='Add Activity']");
	}
	
	public static final By writeActivityNameInputTextfield()
	{
		//return By.xpath("//input[contains(@id,'textfield-')]");
		//return By.xpath("//input[@id='textfield-1030-inputEl']");
		
		return By.xpath("//div[@id='textfield-1030-bodyEl']/ancestor::table//input");
		
		//return By.xpath("//span[@style='visibility: hidden;']");
	//	return By.xpath("//div[contains(@class,'x-boundlist x-boundlist-floating x-layer')]/following-sibling::div[contains(@class,'launchBoardMenuCls ')][2]/div/div/div/div/div[1]");
		
		//return By.xpath("//div[contains(@class,'x-editor x-small-editor x-grid-editor x-grid-cell-editor')]//input");
	}
	
	public static final By clickOnThreeDotOnActivity()
	{
		return By.xpath("//span[text()='Activity1']/parent::span/following-sibling::span");
		
		//return By.xpath("//span[text()='milestone1']/parent::span/following-sibling::span");
	}
	
	public static final By clickOnThreeDotOnMilestone()
	{
		return By.xpath("//span[text()='milestone1']/parent::span/following-sibling::span");
	}
	
	
	public static final By loadmaskElemenet()
	{
		//return By.xpath("//div[@class='x-component x-border-box x-mask x-component-default']/div/div/div[contains(@id,'loadmask-')]");
		return By.xpath("//div[contains(@id,'loadmask-')]//div[@class='x-mask-loading x-mask-msg-inner ']");
	}
	
	public static final By clickingOnEditInformation()
	{
		
		return By.xpath("//span[text()='Activity1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Edit Information']");
		
		//return By.xpath("//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Edit Information']");
	}
	
	
	public static final By clickingOnEditInformationofMilestone()
	{
		return By.xpath("//span[text()='milestone1']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box'][1]//span[text()='Edit Information']");
	}
	
	
	public static final By activityCategory()
	{
		return By.xpath("//input[@name='TemplateID']");
	}
	public static final By searchActivityfield()
	{
		return By.xpath("//input[@placeholder='Search by Name...']");
	}
	
	public static final By searchActivitytrigger()
	{
		return By.xpath("//input[@placeholder='Search by Name...']/parent::div/following-sibling::div[2]");
	}
	
	public static final By selectCategory()
	{
		return By.xpath("//div[@class='categoryListCls']//div[text()='cat1']");
	}
	
	public static final By titleField()
	{
		return By.xpath("//div[contains(@class,'x-window taskEditorPluginCls')]//div[@class='x-field x-form-item x-form-item-default x-form-type-text x-field-default x-anchor-form-item x-field-focus']//input[@name='Name']");
	}
	
	public static final By descriptionfield()
	{
		return By.xpath("//textarea[@name='Description']");
	}
	
	public static final By assignOwner()
	{
		return By.xpath("//div[contains(@class,'x-window taskEditorPluginCls')]//input[@name='OwnerID']");
	}
	
	public static final By searchOwnerfield()
	{
		return By.xpath("//div[contains(@class,'popupGridStyleCls')]//input[@placeholder='Search by Name...']");
	}
	
	public static final By OwnerSearchTrigger()
	{
		return By.xpath("//div[contains(@class,'popupGridStyleCls')]//input[@placeholder='Search by Name...']/parent::div/following-sibling::div[2]");
	}
	
	public static final By selectOwner()
	{
		//return By.xpath("//span[text()='Pratish Laad']");
		return By.xpath("//span[text()='pratish laad']");
	}
	
	
	public static final By clickOnPriority()
	{
		return By.xpath("//div[contains(@class,'x-window taskEditorPluginCls')]//input[@name='Priority']");
	}
	
	public static final By selectMediumPriority()
	{
		return By.xpath("//li[text()='Medium']");
	}
	
	public static final By startDateCalendar()
	{
		return By.xpath("//fieldset[contains(@class,'x-fieldset x-fieldset-with-title x-fieldset-with-legend')]//input[@name='StartDate']");
	}
	
	
	
	public static final By fetchStartDateOfActivityWhileCreating() 
	{
		return By.xpath("//div[contains(@class,'x-field x-form-field-date green-color-date-icon')]//input[@name='StartDate']");
	}
	
	
	public static final By fetchDueDateofActivityWhileCreating()
	{
		return By.xpath("//div[contains(@class,'x-field x-form-field-date red-color-date-icon')]//input[@name='DueDate']");
	}
	
	
	
	
	public static final By dueDateCalendar()
	{
		return By.xpath("//fieldset[contains(@class,'x-fieldset x-fieldset-with-title x-fieldset-with-legend')]//input[@name='DueDate']");
	}
	
	public static final By durationfieldforActivityInfo()
	{
		//return By.xpath("//div[contains(@class,'x-field durationFieldCls')]//input[@name='EstimatedDuration']");
		
		return By.xpath("//div[contains(@class,'x-field durationFldcls x-form-item x-form-item-default x-form-type-text x-box-item x-field-default x-hbox-form-item')]//input[@name='EstimatedDuration']");
		
	}
	
	public static final By editPopSaveButton()
	{
		return By.xpath("//a[contains(@class,'editPopUpSaveBtn ')]");
	}
	
	public static final By deleteCardButton()
	{
		return By.xpath("//a[contains(@class,'deleteCardBtn')]");
	}
	
	public static final By alertPopforDeletecardselectNO()
	{
		return By.xpath("//div[contains(@class,'alertMsgCls')]//a[contains(@class,'cancelBtn ')]");
	}
	
	
	
	public static final By clickOn_ActivityInfo()
	{
		return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']//span[text()='Activity Info']");
	}
	
	/*
	 * public static final By clickOn_ActivityInfo() { return By.
	 * xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']//span[text()='Activity Info']"
	 * ); }
	 */
	

	public static final By saveActivityButton()
	{
		return By.xpath("//a[contains(@class,'editPopUpSaveBtn ')]");
	}
	
	
	//Activity status xpath
	
	public static final By clickOn_Status()
	{
		return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']//span[text()='Status']");
	}
	
	public static final By onTime_dropdown()
	{
		return By.xpath("//div[@class='x-panel cardStatusFormCls x-tabpanel-child x-panel-default']/div/div/div/div/child::div[2]//a[1]");
	}
	
	public static final By onQuality_dropdown()
	{
		return By.xpath("//div[@class='x-panel cardStatusFormCls x-tabpanel-child x-panel-default']/div/div/div/div/child::div[2]//a[2]");
	}
	
	public static final By onBudget_dropdown()
	{
		return By.xpath("//div[@class='x-panel cardStatusFormCls x-tabpanel-child x-panel-default']/div/div/div/div/child::div[2]//a[3]");
	}
	
	public static final By enterStatusOnTimedropdown()
	{
		return By.xpath("//span[text()='Amber']");
	}
	
	public static final By enterStatusOnQualityValueDropDown()
	{
		return By.xpath("//span[text()='Green']");
	}
	
	public static final By enterStatusOnBudgetValueDropDown()
	{
		return By.xpath("//span[text()='Red']");
	}
	
	public static final By percentageCompleteharveyball()
	{
		return By.xpath("//div[@class='itemSelectorCls']/span[@class='harveyBallPanel_50 overclass']");
	}
	
	public static final By activityStatusDescription()
	{
		return By.xpath("//textarea[@name='detail']");
	}
	
	public static final By addStatusButton()
	{
		return By.xpath("//a[contains(@class,'addStatusLogBtn')]");
	}
	
	public static final By statusAddedMsg()
	{
		return By.xpath("//div[contains(@class,'hideShowMsgCls')]//div[text()=' Status Added']");
	}
	
	public static final By statusRegisterTab()
	{
		return By.xpath("//div[contains(@class,'statusTabBarCls ')]//a[2]");
	}
	
	public static final By statusRegisterDateVerify()
	{
		//return By.xpath("//div[@class='customStatusCls x-item-selected']/table/tbody/tr/td[1]/p");
		//return By.xpath("//div[contains(@class,'customStatusCls')]/table/tbody/tr/td[1]/p");
		//return By.xpath("//div[contains(@class,'subscriberListC')]/div/table/tbody/tr/td[1]/p");
		
		return By.xpath("//td[@class='wrapData'][1]/p");
	}
	
	public static final By verifyStatusRegisterDescription()
	{
		//return By.xpath("//div[contains(@class,'subscriberListC')]/div/table/tbody/tr/td[2]/p");
		return By.xpath("//td[@class='wrapData'][2]/p");
	}
	
	public static final By verifyStatusRegisterOnTime()
	{
		return By.xpath("//td[@class='wrapData'][2]/following-sibling::td[1]/p");
	}
	
	public static final By verifyStatusRegisterOnQuality()
	{
		return By.xpath("//td[@class='wrapData'][2]/following-sibling::td[2]/p");
	}
	
	public static final By verifyStatuRegisterOnBudget()
	{
		return By.xpath("//td[@class='wrapData'][2]/following-sibling::td[3]/p");
	}
	
	public static final By verifyStatusRegisterOnPercentageCompleteColumn()
	{
		return By.xpath("//td[@class='wrapData'][2]/following-sibling::td[4]/p");
	}
	
	
	//Activity logTime xpath 
	
	public static final By clickOn_logTime()
	{
		return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']//span[text()='Log Time']");
	}
	
	public static final By clickOnDatefieldforlogtime()
	{
		//return By.xpath("//input[@name='LogTime']");
		return By.xpath("//div[contains(@class,'x-field x-form-field-date green-color-date-icon ')]//input[@name='LogTime']");
		
	}
	
	public static final By clickOnCalendarToday()
	{
		return By.xpath("//div[@class='x-datepicker-footer']//span[text()='Today']");
	}
	
	public static final By clickOnAssignedUser()
	{
		return By.xpath("//input[@name='AssignedAUser']");
	}
	
	public static final By searchForUser()
	{
		return By.xpath("//input[@placeholder='Search for user']");
	}
	
	public static final By searchIconOnLogTime()
	{
		//return By.xpath("//div[@class='x-form-trigger x-form-trigger-default x-form-search-trigger x-form-search-trigger-default ']");
		return  By.xpath("//input[@placeholder='Search for user']/parent::div/following-sibling::div[2]");
	}
	
	public static final By selectUserfromList()
	{
		//return By.xpath("//span[text()='Pratish Laad']");
		
		return By.xpath("//span[text()='pratish laad']");
	}
	
	
	public static final By clickOnLoggedTimeSpinnerUp()
	{
		return By.xpath("//input[@name='Estimation']/parent::div/following-sibling::div/child::div[1]");
	}
	
	public static final By clickOnDurationdropdown()
	{
		return By.xpath("//input[@name='Duration']");
	}
	
	public static final By selectValueDayFromDurationDropDown()
	{
		return By.xpath("//li[text()='Days']");
	}              
		
	public static final By logTimeDescriptiom()
	{
		return By.xpath("//textarea[@name='LogDescription']");
	}
	
	public static final By clickOnLogTimeAddButton()
	{
		//return By.xpath("//a[contains(@class,'addStatusLogBtn ')]//span[text()='Add']");//qa5
		//return By.xpath("//div[contains(@class,'statusTabpanelCls ')][2]/div/child::div[2]//a//span[text()='Add']");//spring24
		
		return By.xpath("//div[contains(@id,'logtimeinformation-')]//a[contains(@class,'addStatusLogBtn ')]//span[text()='Add']");
	}
	
	public static final By clickOnTotalLoggedTime()
	{
		return By.xpath("//span[text()='Total Logged Time']");
	}
	
	public static final By getLogTimeDate()
	{
		return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[2]");
	}
	
	public static final By getLogTimeHrs()
	{
		return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[3]");
	}
	
	public static final By getLogTimeDescription()
	{
		return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[4]");
	}
	
	public static final By clickOnEditLogTime()
	{
		return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[5]");
	}
	
	public static final By clickOnDeleteLogTime()
	{
		return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[6]");
	}
	
	public static final By logTimeStatusAddedMSG()
	{
		return By.xpath("//div[@class='riskIssueAdded']");
	}
	
	
	//edit logtime
	public static final By clickOnEditLogTimeDate()
	{
		return By.xpath("//input[contains(@id,'dateCustomField-')]");
	}
	
	public static final By selectDatefromDatePicker()
	{
		return By.xpath("//div[@class='x-datepicker x-layer x-datepicker-default x-unselectable x-border-box x-datepicker-above']//tr[5]/td[5]");
	}
	
	public static final By clickOnAssignedUserforeditLogtime()
	{
		return By.xpath("//div[contains(@id,'logtimeeditformpanel-')]//input[@name='AssignedAUser']");
	}
    public static final By selectUserfromListEditlogTime()
    {
    	//return By.xpath("//span[text()='Sakharam Nilkhan']");
    	
    	return By.xpath("//span[text()='pratish laad']");
    }
	
   public static final By clickOnUpdateButton()
   {
	   return By.xpath("//a[contains(@class,'addStatusLogBtn ')]//span[text()='Update']");
   }
   
   public static final By magnifyingGlassSearchUser()
   {
	   return By.xpath("//input[@placeholder='Search for user']/parent::div/following-sibling::div[2]");
   }
	
   public static final By clickOnEditLogTimeSpinnerUp()
   {
	   return By.xpath("//div[contains(@id,'logtimeeditformpanel-')]//input[@name='Estimation']/parent::div/following-sibling::div/child::div[1]");
   }
	
   public static final By clickOnEditLogTimeDuratiomfield()
   {
	   return By.xpath("//div[contains(@id,'logtimeeditformpanel-')]//input[@name='Duration']");
   }
   
   public static final By selectDurationValue()
   {
	  // return By.xpath("//ul[@id='combo-1466-picker-listEl']/li[3]");
	   
	   //return By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box' and @style='width: 203px; left: 1625px; top: 229px; height: auto; z-index: 99000;']/div/ul/li[text()='Days']");
	   return By.xpath("//ul[@id='combobox-1508-picker-listEl']/li[text()='Days']");
   }
   
   public static final By editLogtimeDescriptionfield()
   {
	   return By.xpath("//div[contains(@id,'logtimeeditformpanel-')]//textarea[@name='Description']");
   }
   
   public static final By logTimeUpdatedMSG()
   {
	   return By.xpath("//div[contains(@class,'hideShowMsgCls ')]//div[text()='Log Time Updated']");
   }
   
   public static final By verifyLogTimeDateafterEdit()
   {
	   return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[2]");
   }
   
   public static final By verifyLoggedHrsAfterEdit()
   {
	   return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[3]");
   }
   
   public static final By verifyLoggedDescriptionAfterEdit()
   {
	   return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//div[contains(@class,'x-dataview-item')]/table/tbody/tr/td[4]");
   }
   
   
   //risk Tab xpath
   
   public static final By clickOnRiskTab()
   {
	   return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']/div/div/div/div/div/child::a[4]");
   }
   
   public static final By clickOnWeighthowImportantDropdown()
   {
	   return By.xpath("//input[@name='Weight']/parent::div/following-sibling::div");
   }
   
   public static final By selectValuefromWeightHowImportantDropdown()
   {
	  // return By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//li[text()='Very Important']");
	   return By.xpath("//li[text()='Very Important']");
   }
   
   public static final By clickOnProbabilityHowLikelyDropdown()
   {
	   return By.xpath("//input[@name='Probability']/parent::div/following-sibling::div");
   }
   
   public static final By selectValuefromProbabilityHowLikelyDropdown()
   {
	   //return By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box']//li[text()='Very Likely']");
	   return By.xpath("//li[text()='Very Likely']");
   }
   
   public static final By clickOnRadiobuttonforRiskTypeIssue()
   {
	   return By.xpath("//div[@class='x-panel radiofieldCls x-panel-default']/div/div/div/div/child::div[2]");
   }
   
   public static final By riskDescription()
   {
	   return By.xpath("//textarea[@name='Detail']");
   }
   
   public static final By riskMitigation()
   {
	   return By.xpath("//textarea[@name='riskMitigation']");
   }
   
   public static final By clickOnDatefieldofRisk()
   {
	   return By.xpath("//div[@class='x-panel radiofieldCls x-panel-default']/following-sibling::div[3]//input[@name='LogTime']");
   }
   
   public static final By clickOnTodayDate()
   {
	   return By.xpath("//div[@class='x-datepicker x-layer x-datepicker-default x-unselectable x-border-box x-datepicker-above']//span[text()='Today']");
   }
   
   public static final By clickOnAddRiskButton()
   {
	   return By.xpath("//div[@class='x-panel radiofieldCls x-panel-default']/following-sibling::div[3]/div/div/div/div/a");
   }
   
   public static final By riskIssueAddedMsg()
   {
	   return By.xpath("//div[@class='x-panel radiofieldCls x-panel-default']/following-sibling::div[3]/div/div/div/div/div[3]//div[@class='riskIssueAdded']");
   }

   
   public static final By clickOnriskRegistertab()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//a[2]");
   }
   
   
   
   //
   public static final By clickOnAtriskCheckbox()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']/div/child::div[3]/div");
   }
   
   public static final By verifyResolvedCheckboxAfterAddedRiskOnActivity()
   {
	   //return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[1]");
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[1]/span");
   }
   public static final By getDateofriskRegistertab()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[2]");
   }
   
   public static final By getRiskScoreofActivity()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[3]");
   }
   
   public static final By verifyRiskType()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[4]");
   }
   
   public static final By getDetailDescriptionofRisk()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[5]");
   }
   
   public static final By clickOnEditRisk()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[6]");
   }
   
   public static final By clickOnDeleteRiskButton()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[7]");
   }
   
   ///following xpath for edit risk 
   
   public static final By editRiskPopUp()
   {
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')][2]");
   }
   
   public static final By clickOnWeightHowImportantDropdownforEditRisk()
   {
	  // return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')][2]//div[@style='padding:10px 10px 10px 10px']/div[1]//input[@name='Weight']/parent::div/following-sibling::div");
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')]//input[@name='Weight']/parent::div/following-sibling::div");
   }
   
   public static final By clickOnProbabilityHowLikelyDropdownforEditRisk()
   {
	   //return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')][2]//div[@style='padding:10px 10px 10px 10px']/div[1]//input[@name='Probability']/parent::div/following-sibling::div");
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')]//input[@name='Probability']/parent::div/following-sibling::div");
   }
   
   public static final By selectValuefromHowImportantDropdown()
   {
	   //return By.xpath("//div[contains(@class,'x-boundlist x-boundlist-floating ')][6]/div/ul/li[3]");
	   
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls')]/following-sibling::div[3]//li[3]");
   }
   
   public static final By selectValuefromHowLikelyDropdown()
   {
	   //return By.xpath("//div[contains(@class,'x-boundlist x-boundlist-floating ')][7]/div/ul/li[3]");
	   return  By.xpath("//div[contains(@class,'popupToolbarBorderCls')]/following-sibling::div[4]//li[3]");
   }
   
  
   public static final By radioButtonofBusinessDependancy()
   {
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')]//label[text()='Business Dependency']");
   }
   
   public static final By editRiskDescription()
   {
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')]//textarea[@name='Detail']");
   }
   
   public static final By editRiskMitigation()
   {
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')]//textarea[@name='riskMitigation']");
   }
   
   public static final By clickOnResolvedDateCalendar()
   {
	   return By.xpath("//input[@name='ResolvedTime']");
   }
   
   public static final By clickOnTodayDateOnResolvedDate()
   {
	   return By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default')][2]/div/div[2]/a");
   }
   
   public static final By clickResolvedCheckbox()
   {
	   return By.xpath("//div[contains(@class,'checkBoxlblCls ')]");
   }
   
   public static final By clickOnEditRiskDateCalendar()
   {
	   return By.xpath("//input[contains(@id,'dateCustomField-')]");
   }
   
   public static final By clickOnEditRiskTodayDate()
   {
	   return By.xpath("//div[contains(@class,'x-datepicker x-layer x-datepicker-default')][3]//div[@class='x-datepicker-footer']/a");
   }
   public static final By clickOnUpdateRiskStatus()
   {
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')]//span[text()='Update']");
   }
   
   //verify risk after edit
   
   public static final By verifyResolvedCheckbox()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[1]/span");
   }
   
   public static final By getDateofRiskAfterEdit()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[2]");
   }
   
   public static final By getRiskScoreAfterEdit()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[3]");
   }
   
   
   public static final By getTypeofRiskStatusAfterEdit()
   {
	   
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[4]");
   }
   public static final By getDetailDescriptionofRiskAfterEdit()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[5]");
   }
   
   public static final By ClickOnDeleteEditedRisk()
   {
	   return By.xpath("//div[@class='x-panel statusTabpanelCls x-tabpanel-child x-panel-default']//div[@class='x-dataview-item']/table/tbody/tr/td[7]");
   }
 
   //following xpath for Subscribers tab 
   
   public static final By clickOnSubscriberTab()
   {
	   return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']/div/div/div/div/div/child::a[5]");
	  
   }
   
   public static final By clickOnSubscriberDropdown()
   {
	   return By.xpath("//div[contains(@class,'x-field prority_lbl_white_Subscriber')]/div/div/child::div[2]");
   }
   
   public static final By searchUserSubscriberInputfield()
   {
	   return By.xpath("//div[contains(@class,'popupGridStyleCls ')]//input[@placeholder='Search for user']");
   }
   
   public static final By clickOnSubscriberSearchIcon()
   {
	   return By.xpath("//div[contains(@class,'popupGridStyleCls ')]//input[@placeholder='Search for user']/parent::div/following-sibling::div[2]");
   }
   
   public static final By selectSubscriberUSerAfterclickOnSearchIcon()
   {
	   return By.xpath("//span[text()='pratish laad']");
   }
   
   public static final By notifyPercentageCompleteDoneCheckbox()
   {
	   //return By.xpath("//div[contains(@class,'x-field prority_lbl_white_Subscriber')]/following-sibling::div[1]//input[@type='checkbox']");
	 //  return By.xpath("//div[contains(@class,'x-field subscribersCheckBoxCls ')][1]");
	   
	   return By.xpath("//div[contains(@id,'subscribersinformation-')]//div[contains(@class,'x-field subscribersCheckBoxCls ')][1]");
	   
   }
   
   public static final By notifyActivityPastDueDate()
   {
	   //return By.xpath("//div[contains(@class,'x-field prority_lbl_white_Subscriber')]/following-sibling::div[1]//input[@type='checkbox']");
	  // return By.xpath("//div[contains(@class,'x-field subscribersCheckBoxCls ')][2]");
	   
	   return By.xpath("//div[contains(@id,'subscribersinformation-')]//div[contains(@class,'x-field subscribersCheckBoxCls ')][2]");
   }
   
   public static final By clickOnAddSubscriberStatusLogButton()
   {
	   return By.xpath("//div[contains(@class,'x-field prority_lbl_white_Subscriber')]/following-sibling::a");
   }
   
   public static final By getUserImage()
   {
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//tr/td/img");
   }
   
   public static final By clickOnDoneCheckbox()
   {
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//tr/td[2]/span");
   }
   
   public static final By clickOnActivityPastDueDate()
   {
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//tr/td[3]/span");
   }
   
   public static final By clickSubscriberEditIcon()
   {
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//tr/td[4]/div");
   }
   
   public static final By clickOnDeleteScubscriber()
   {
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//tr/td[5]/div");
   }
   
   public static final By chooseNoOptionOnDeleteSubscriberPopUp()
   {
	   return By.xpath("//div[text()='Delete Subscriber']/ancestor::div[contains(@class,'x-window x-message-box x-layer')]//a[3]");
   }
   
   //xpath of edit subscriber
   
   public static final By editPercentageCompleteDoneCheckbox()
   {
	   return By.xpath("//div[contains(@class,'x-window popupToolbarBorderCls')]//div[contains(@class,'subscribersCheckBoxCls ')][1]");
   }
   
   public static final By editActivityPastDueDate()
   {
	   return By.xpath("//div[contains(@class,'x-window popupToolbarBorderCls')]//div[contains(@class,'subscribersCheckBoxCls ')][2]");
   }
   
   public static final By clickOnUpdateSubscriber()
   {
	   return By.xpath("//div[contains(@class,'x-window popupToolbarBorderCls')]//a[contains(@class,'editPopUpSaveBtn ')]");
   }
   
   // following xpath of Resource on activity 
   
   public static final By clickOnResourceTab()
   {
	   return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']/div/div/div/div/div/child::a[7]");
   }
   
   public static final By clickOnAllDropdown()
   {
	   return By.xpath("//div[@class='x-panel gnt-assignmentgrid x-tabpanel-child x-panel-default x-grid']/div/div[1]//input[@value='All']");
   }
   
   public static final By chooseAllvalue()
   {
	   //return By.xpath("//div[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box'][5]//ul/li[1]");
	   return By.xpath("//ul[@class='x-list-plain']/li[text()='All']");
   }
   
   public static final By clickOnAddResourcebutton()
   {
	   return By.xpath("//div[@class='x-panel gnt-assignmentgrid x-tabpanel-child x-panel-default x-grid']/div/div[2]//a[1]");
	   //return By.xpath("//div[@class='x-panel x-tabpanel-child x-panel-default']//span[text()='Add']");// SUMMER 24
   }
   
   public static final By chooseResourceOptions()
   {
	  
	   return By.xpath("//div[@class='x-menu x-layer x-menu-default x-border-box']//span[text()='Resource']");
	   
	   //return By.xpath("//div[contains(@class,'taskEditorPluginCls ')]//label[text()='Resource']");//summer24
   }
   
   public static final By doubleclickOnResourcenameColumn()
   {
	   //return By.xpath("//div[@class='x-grid-item-container' and @style='width: 548px; transform: translate3d(0px, 0px, 0px);']//tr/td[2]");
	   
	   return By.xpath("//div[@class='x-grid-item-container' ]//tr/td[contains(@class,'resourcenamecolumn-')]");
	   
	   //return By.xpath("//input[@placeholder='Select Leankor Resources']");//summer24
   }
   
   public static final By searchResourceInputfield()
   {
	   return By.xpath("//input[@placeholder='Search for Resource']");
   }
   
   public static final By clickOnSearchIcon()
   {
	   return By.xpath("//input[@placeholder='Search for Resource']/parent::div/following-sibling::div[2]");
   }
   
   public static final By selectSearchResource()
   {
	   return By.xpath("//span[text()='pratish laad']");
   }
   
   public static final By selectSecondSearchResource()
   {
	   return By.xpath("//span[text()='Anshita Bhadoria']");
   }
   
   public static final By filterResourcesInputfield()
   {
	  // return By.xpath("//div[@class='x-panel gnt-assignmentgrid x-tabpanel-child x-panel-default x-grid']/div/div[1]//input[@placeholder='Filter Resources']");
	   
	   return By.xpath("//div[contains(@class,'taskEditorPluginCls ')]//input[@placeholder='Filter Resources']");
   }
   
   public static final By searchIconfilterResource()
   {
	   return By.xpath("//div[contains(@class,'taskEditorPluginCls ')]//input[@placeholder='Filter Resources']/parent::div/following-sibling::div[2]");
   }
   
   public static final By selectOnfilteredResourceIMG()
   {
	   //return By.xpath("//div[@class='x-grid-item-container' and @style='width: 548px; transform: translate3d(0px, 0px, 0px);']//tr/td[2]/div[text()='Pratish Laad']");
	   
	  // return By.xpath("//div[@class='x-grid-item-container' and @style='width: 548px; transform: translate3d(0px, 0px, 0px);']//tr/td[1]");
	   //return By.xpath("//div[contains(@class,'x-grid-view x-grid-with-row-lines ')]//div[@class='x-grid-item-container' ]//tr/td[contains(@class,'ownerColumn')]");
	   
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//img");
   }
   
   public static final By clickOnDeleteResource()
   {
	   return By.xpath("//div[@class='x-panel gnt-assignmentgrid x-tabpanel-child x-panel-default x-grid']/div/div[2]//a[2]");
	   
	   //return By.xpath("//div[contains(@class,'subscriberListCls ')]//div[@class='deleteLog']");
	   //return By.xpath("//div[contains(@id,'resourceassignmentinformation-')]//div[contains(@class,'subscriberListCls ')]//div[@class='deleteLog']");
   }
   
   public static final By chooseYesOptionOnDeleteResource()
   {
	   return By.xpath("//div[text()='Delete Resource ?']/ancestor::div[@class='x-window-bodyWrap']/child::div[2]//a[2]");
   }
   
   
   public static final By verifyResource()
   {
	  // return By.xpath("//div[@class='x-grid-item-container' and @style='width: 548px; transform: translate3d(0px, 0px, 0px);']//tr/td[1]");
	  // return By.xpath("//div[@class='x-grid-item-container' and @style='width: 548px; transform: translate3d(0px, 0px, 0px);']//tr/td[1]/div/img");
	 //  return By.xpath("//div[contains(@class,'x-grid-view x-grid-with-row-lines ')]//div[@class='x-grid-item-container' ]//tr/td[contains(@class,'ownerColumn')]");
	   
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//td[2]");
   }
   
   public static final By verifyAllocation()
   {
	   //return By.xpath("//div[@class='x-grid-item-container' and @style='width: 548px; transform: translate3d(0px, 0px, 0px);']//tr/td[3]/div");
	 //  return By.xpath("//div[contains(@class,'x-grid-view x-grid-with-row-lines ')]//div[@class='x-grid-item-container' ]//tr/td[contains(@class,'assignmentunitscolumn-')]");
	   
	   return By.xpath("//div[contains(@class,'subscriberListCls ')]//td[3]/span");
   }
   
   
   //following xpath for activity mode 
   
   public static final By clickOn_activityMode()
   {
	   return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']/div/div/div/div/div/child::a[8]");
   }
   
   public static final By clickOn_ActivitySchedulingModeDropdown()
   {
	  // return By.xpath("//div[contains(@id,'activitymodeinformation-')]/table/tbody/tr[1]/td/div[1]/div/div/child::div[2]");
	   
	   return By.xpath("//div[contains(@id,'activitymodeinformation-')]//label[contains(@id,'schedulingmodefield-')]/following-sibling::div");
   }
   
   public static final By actualEffortInputTextfield()
   {
	   // return By.xpath("//div[contains(@id,'activitymodeinformation-')]/table/tbody/tr[2]/td/div[1]/div/div/child::div/input");
	   //return By.xpath("//table[contains(@id,'activitymodeinformation-')]//input[@name='Effort']");
	   
	   return By.xpath("//div[contains(@id,'activitymodeinformation-')]//div[contains(@id,'effortfield-')]//input[@name='Effort']");
	    
   }
   
   public static final By getActuatEffortField()
   {
	   //return By.xpath("//div[contains(@class,'activityModeFormCls ')]//div[@class='x-field x-form-item x-form-item-default x-form-type-text x-field-default x-table-form-item x-form-dirty']/div");
	   return By.xpath("//div[contains(@class,'activityModeFormCls ')]//div[@class='x-field x-form-item x-form-item-default x-form-type-text x-field-default x-table-form-item x-form-dirty']//input");
   }
   
   public static final By clickOnConstraintTypeDropdown()
   {
	   return By.xpath("//div[contains(@id,'activitymodeinformation-')]/table/tbody/tr[3]/td/div[1]/div/div/child::div[2]");
   }
   
   public static final By clickOnConstraintDateCalendar()
   {
	   return By.xpath("//div[contains(@id,'activitymodeinformation-')]/table/tbody/tr[4]/td/div[1]/div/div/child::div[2]");
   }
   
   public static final By clickOnManuallyScheduleCheckbox()
   {
	   return By.xpath("//div[contains(@id,'activitymodeinformation-')]/table/tbody/tr[5]/td/div[1]/div/div/span/input");
   }
   
   public static final By schedulingModeOptions()
   {
	   return By.xpath("//div[contains(@id,'schedulingmodefield-')]/div/ul/li");
   }
   
   
   public static final By activityDurationforNormalMode()
   {
	  // return By.xpath("//div[contains(@class,'x-field durationFieldCls')]//input[@name='EstimatedDuration']/parent::div/following-sibling::div");
	   return By.xpath("//input[@name='EstimatedDuration']");
   }
   
   
   public static final By loadSpinnerofAddingActivity()
   {
	   return By.xpath("//div[@class='x-window taskEditorPluginCls gnt-taskeditor-window gnt-projecteditor-window x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box x-masked']//div[@class='x-mask-loading x-mask-msg-inner ']//div[contains(@id,'loadmask-')]");
   }
   
   public static final By elementsOnPopUp()
   {
	   return By.xpath("//div[contains(@class,'popupToolbarBorderCls ')]");
   }
   
   public static final By durationfieldforActivityInfoTrigger()
   {
	   //return By.xpath("//div[contains(@class,'x-field durationFldcls x-form-item x-form-item-default x-form-type-text x-box-item x-field-default x-hbox-form-item')]//div[@class='x-form-trigger-wrap x-form-trigger-wrap-default']/child::div[2]");
	   
	   return By.xpath("//div[contains(@id,'cardeditforminformation-')]//input[@name='EstimatedDuration']");
   }
   
   
	
   // xpath for adding stickers On activity
   

	public static final By clickOn_NavIconScroller()
	{
		return By.xpath("//div[@class='x-unsized x-button menu x-dock-item x-docked-right x-has-height x-iconalign-center']");
	}
	
	public static final By clickOn_ThreeDotOnProjectBoards()
	{
		//return By.xpath("//div[@class='x-inner x-scroll-scroller-vertical x-scroll-scroller']//div[@title='Project Boards']/following-sibling::div[2]");
		return By.xpath("//div[@title='Project Boards']/parent::div/div[3]");
	}
	
	public static final By clickOn_CreateKanbanBoard()
	{
		return By.xpath("//div[text()='Create Kanban Board']");
	}
	
	public static final By inputTextareaforNewBoard()
	{
		return By.xpath("//input[@placeholder='New Kanban Board']");
	}
   
	public static final By clickOn_AddkanbanBoardButton()
	{
		return By.xpath("//div[@id='launchmenu']//div[contains(@class,'addBtnCls ')]");
	}
	
	public static final By clickOn_OpenCreatedKBboard()
	{
		//return By.xpath("//div[text()='kanban1']");
		//return By.xpath("//div[@class='innerclass contentseprator ']//div[text()='kanban1']");
		
		return By.xpath("//div[@class='columnname'  and @title='kanban1']");
	}
	
	public static final By loadMaskAfterSave()
	{
		return  By.xpath("//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
	
	public static final By iframeofkanbanBoard()
	{
		return By.xpath("//iframe[contains(@onload,'Kanban Board')]");
	}
	
	public static final By switchToiFrame()
	{
		return By.tagName("iframe");
	}
   
	public static final By clickOn_AddtoBoardFanOutPlusIconButton()
	{
		return By.id("mainMenuBtn");
	}
	
	public static final By dragStickerFanOutButton()
	{
		return By.id("stickerFanBtn");
	}
	
	public static final By clickOn_uploadStickersPlusIcon()
	{
		return By.xpath("//div[contains(@class,'topBarBtnNew ')]");
	}
	
	public static final By inprogressMasterContainer()
	{
		return By.xpath("//form[@id='ext-zonePanel-31']");
	}
	
	public static final By uploadStickerWindowNameInputfield()
	{
		return By.xpath("//input[@class='x-input-el x-input-text x-form-field stickerUpload']");
	}
	
	public static final By inputfieldforImageUpload()
	{
		return By.name("photo");
	}
	
	public static final By clickOn_UploadStickerButtonwindow()
	{
		return By.xpath("//span[text()='Upload']");
	}
	
	public static final By clickOn_GlobalCheckbox()
	{
		return By.xpath("//div[@class='x-form-label preferencesCheckboxLabel']");
	}
	
	//add stickers
	
	public static final By clickOn_StickersSideColumn()
	{
		return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']//span[text()='Stickers']");
	}
	
	public static final By sizeofStickers()
	{
		return By.xpath("//div[contains(@id,'stickersinformation-')]//div[@class='x-grid-item-container']/table");
	}
	
	//add files on activity
	
   public static final By clickOn_files()
   {
	   return By.xpath("//div[@class='x-panel x-fit-item x-window-item x-panel-default']/div/div/div/div/div/child::a[10]");
   }
   
   public static final By editPopUpSaveButton()
   {
	   return By.xpath("//div[contains(@class,'taskEditorPluginCls ')]//a[contains(@class,'editPopUpSaveBtn ')]//span[text()='Save']");
   }
   
    
	
}
