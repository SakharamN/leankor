package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper_package.ToCheckingHeaderButtonsOnCalendarViewHelper;

public class ToCheckingHeaderButtonsOnCalendarViewLocator {
	
	
	public static final By ClickOnAddButton()
	{
		
		return By.xpath("//div[@class='x-container mainCls x-fullscreen x-layout-card-item x-sized']/descendant::div[text()='ALL FOLDERS']/following-sibling::div");
		
	}
	
	public static final By clickOnThreeDots()
	{
		return By.xpath("//div[text()='A "+ToCheckingHeaderButtonsOnCalendarViewHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	} //return By.xpath("//div[text()='A "+CreateCardsOnDifferentMasterContainersOnCVHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	
	
	public static final By ClickingOnThreeDots()
	{
		return By.xpath("//div[text()='"+ToCheckingHeaderButtonsOnCalendarViewHelper.folderName+"']/following-sibling::div[@class='lmenu']");
	}
	
	
	public static final By ClickingOnCreatedProject()
	{
		return By.xpath("//div[contains(text(),'"+ToCheckingHeaderButtonsOnCalendarViewHelper.projectName+"')]");
	}
	
	
	public static final By ClickingOnCreatedKanbanBoard()
	{
		//return By.xpath("//div[contains(text(),'Kanban Board1')]");
		return By.xpath("//div[contains(@id,'ext-simplelistitem-')]//div[text()='"+ToCheckingHeaderButtonsOnCalendarViewHelper.kanbanBoardName+"']");
	}
	
	
	
	
	
	
	
	
	
	
	public static final By clickOnCreatedProject()
	{
	    return By.xpath("//div[contains(text(),'"+ ToCheckingHeaderButtonsOnCalendarViewHelper.createProjectNameRandomly +"')]");
	}
	
	
	public static final By CommonXapthForHEaderElements()
	{
		//return By.xpath("//div[@class='x-btn-group x-btn-group-default-framed x-box-item']//table[@class='x-table-layout']//table/tbody/tr");
		
		return By.xpath("//div[@class='x-btn-group x-btn-group-default-framed x-box-item x-toolbar-item']//table[@class='x-table-layout']//table/tbody/tr//a");
		
	}
	
	public static final By ClickonSizeofbutton()
	{
		String j = null;
	
		return By.xpath("//*[text()='"+ToCheckingHeaderButtonsOnCalendarViewHelper.sizeofbutton+"["+j+"]']");
	}
	
	public static final By ClickOnOneWeekbutton()
	{
		//return By.xpath("//div[@class='x-btn-group x-btn-group-default-framed x-box-item']//table[@id='resolutionDiv-table']//table//div[text()='1 week']");
		
		return By.xpath("//div[contains(@id,'toolbar-')]//table//tr//td//span[text()='1 week']");
	}
	
	public static final By ClickingOnDeleteButton()
	{
		return By.xpath("//div[@class='x-menu-item x-menu-item-default x-box-item']//span[text()='Delete']");
	}
	
	public static final By ChooseDeleteOptionOnDeletePopup()
	{
		return By.xpath("//div[@class='x-toolbar x-docked x-toolbar-footer x-box-layout-ct']//span[text()='Delete']");
	}
	
	public static final By ChooseNOOptionDeleteAllTaskPopup()
	{
		//return By.xpath("//div[@id='messagebox-1040']//div[contains(@class,'x-toolbar x-docked x-toolbar-footer x-box-layout-ct')]/div/div/a[3]");
		
		return By.xpath("//span[text()='No']");
	}
	
	public static final By ClickOnZoomToFitButton()
	{
		//return By.xpath("//table[@class='x-table-layout']/tbody/tr//div[text()='Zoom to fit']");
		//return By.xpath("//div[contains(@class,'x-panel viewToolsPanel')]//table[1]/tbody/tr/td[3]//div[text()='Zoom to fit']");
		
		return By.xpath("//div[@class='x-toolbar x-docked x-toolbar-default x-docked-top x-toolbar-docked-top x-toolbar-default-docked-top x-box-layout-ct']//div[@class='x-btn-group-body x-btn-group-body-default-framed x-table-layout-ct x-btn-group-body-default-framed']//table//span[text()='Zoom to fit']");
	}
	
	public static final By ClickonUndoButton()
	{
		return By.xpath("//a[@id='toolDivUndoIcon']");
	}
	
	public static final By YesnUndoAction()
	{
		return By.xpath("//div[@class='x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box']//span[text()='Yes']");
	}
	
	public static final By SetPercenntforfirstRow()
	{
		return By.xpath("//div[contains(@class,'x-panel viewToolsPanel x-box-item')]/div/div/div/div/div[3]/div[2]//table//table//tr[1]");
	}
	
	public static final By SetPercetforsecondRow()
	{
		return By.xpath("//div[contains(@class,'x-panel viewToolsPanel x-box-item')]/div/div/div/div/div[3]/div[2]//table//table//tr[2]");
	}
	
	public static final By sideClickingOnCard()
	{
		return By.xpath("//div[contains(@class,'x-grid-scrollbar-clipper x-grid-scrollbar-clipper-locked ')]//table[5]");
	}
	
	public static final By SetpercentCommon()
	{
		return By.xpath("//div[contains(@class,'x-panel viewToolsPanel x-box-item')]/div/div/div/div/div[3]/div[2]//table//table//td");
	}
	
	public static final By printCancelbutton()
	{
		return By.xpath("//a[contains(@class,'cancelBtnClss')]");
	}
	
	public static final By CaptreProjectname()
	{
		return By.xpath("//div[contains(@class,'x-panel viewToolsPanel x-box-item x-panel-default x-panel-after-title')]/div/div/div/div/div[4]//label[1]");
	}
	
	public static final By CaptureBoardname()
	{
		return By.xpath("//div[contains(@class,'x-panel viewToolsPanel x-box-item x-panel-default x-panel-after-title')]/div/div/div/div/div[4]//label[2]");
	}
	
	public static final By ShowCardsHundredPercentdonecheckbox()
	{
		return By.xpath("//div[contains(@class,'x-panel viewToolsPanel x-box-item x-panel-default x-panel-after-title')]/div/div/div/div/div[5]/div/div/div/div/div[1]//table/tbody/tr/td/a");
	}
	
	public static final By ShowAlltasksCheckbox()
	{
		return By.xpath("//div[contains(@class,'x-panel viewToolsPanel x-box-item x-panel-default x-panel-after-title')]/div/div/div/div/div[5]/div/div/div/div/div[2]//table/tbody/tr/td/a");
	}
	
	//xpath for show critical path
	
	public static final By ShowCriticalpath()
	{
		return By.xpath("//div[@class='x-panel settingCls x-box-item x-panel-default']//table//div[text()='Show Critical Path']");
	}
	
	public static final By ClickOnPopOutToNewBrowserTab()
	{
		return By.xpath("//div[contains(@style,'rgb(215, 228, 242);')]//a[1]");
	}
	
	public static final  By ClickOnSetCalendarPreferences()
	{
		return By.xpath("//div[contains(@style,'rgb(215, 228, 242);')]//a[2]");
	}
	
	
	public static final By Clickonsevendaycheckbox()
	{
		
	 return By.xpath("//span[text()='Seven day work week:']/parent::span/parent::label/parent::div");
	}
	
	public static final By CancelButtonOnsevenDayworkweek()
	{
		return By.xpath("//div[contains(@id,'preferenceWindow-')]//div[@class='x-toolbar x-docked x-toolbar-footer x-box-layout-ct']/div/div/a[2]");
	}
	
	public static final By SaveButtonOnsevenDayworkweek()
	{
		return By.xpath("//div[contains(@id,'preferenceWindow-')]//div[@class='x-toolbar x-docked x-toolbar-footer x-box-layout-ct']/div/div/a[1]");
	}
	
	public static final By CLickNoOnProceedconfermation()
	{
		return By.xpath("//div[contains(@class,'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]/div/following-sibling::div/div[2]/div/div/a[3]");
	}
	
	public static final By ClickYESOnProceedconfermation()
	{
		return By.xpath("//div[contains(@class,'x-window x-message-box x-layer x-window-default x-closable x-window-closable x-window-default-closable x-border-box')]/div/following-sibling::div/div[2]/div/div/a[2]");
	}
	
	
	public static final By Calendarnonworkingday()
	{
		return By.xpath("//td[contains(@class,'nonworking sch-header-cell-center')]");
	}
	
	public static final By AllcolumntdElements()
	{
		//return By.xpath("//td[contains(@class,'sch-column-header sch-dayheadercell-')]");
		
		//return By.xpath("//td[contains(@class,'sch-column-header sch-dayheadercell-')]");
		
		//return By.xpath("//td[@headerposition='bottom']");
	//	return By.xpath("//td[contains(@data-date,'20230')][position() > 3]");
		
		return By.xpath("//div[contains(@class,'x-column-header sch-simple-timeaxis x-column-header-align-left x-box-item x-column-header-default x-unselectable x-column-header-first x-column-header-last')]/div/div[2]/table[2]/tbody/tr/td");
	}
	
	public static final By ClickOnbaselinedropdown()
	{
		return By.xpath("//div[contains(@style,'rgb(215, 228, 242);')]//div[@id='baselineCombo']");
	}
	
	public static final By redflashHilighted()
	{
		return By.xpath("//table/tbody/tr[@class=' x-grid-row sch-gantt-task-highlighted']");
	}
	public static final By redflashHilightedOF()
	{
		return By.xpath("//table/tbody/tr[@class=' x-grid-row']");
	}

	
	public static final By SelectUser()
	{
		return By.xpath("//span[text()='Pratish Laad']");
	}
	
	public static final By SelectMarketingCategory()
	{
		return By.xpath("//li[text()='cat1']");
	}
	
	public static final By InprogressMasterContainer()
	{
		//return By.xpath("//span[text()='In Progress [0/0]']/ancestor::table");
		
		//return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table");
		return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table//tr[3]/td");
		
	}
	
	public static final By TemplateMasterContainer()
	{
		return By.xpath("//span[contains(text(),'Template ')]/ancestor::table");
	}
	
	public static final By BackLogMasterContainer()
	{
		return By.xpath("//span[contains(text(),'Backlog')]/ancestor::table");
	}
	
	public static final By ReviewAndApproveMasterContainer()
	{
		return By.xpath("//span[contains(text(),'Review & Approve')]/ancestor::table");
	}
	
   public static final By CommonXpathforallAvailableCardsOnCv()
   {
	   return By.xpath("//div[contains(@style,'ellipsis')]/ancestor::table");
   }
	
	public static final By DoneMasterContainer()
	{
		return By.xpath("//span[contains(text(),'Done ')]/ancestor::table");
	}
	
	public static final By ArchiveMasterContainer()
	{
		return By.xpath("//span[contains(text(),'Archive ')]/ancestor::table");
	}
	
	// descendant  preceding 
	
	public static final By FirstCardInprogressmaterContainer()
	{
		//return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/following-sibling::table[1]");
		
		return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/tbody/tr[4]");
	}
	
	public static final By SecondcardInprogressmasterContainer()
	{
		return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/tbody/tr[5]");
	}
	
	
	    //following xpath for Advanced filter on calendar View
	
		public static final By ClickingOnfilterCard()
		{
			return By.xpath("//div[contains(@class,'settingCls ')][3]/div/div/div/div/div[3]/div/div/div/div/a[2]");
		}
		
		public static final By AllfilterdropdownElement()
		{
			return By.xpath("//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/div[position() > 1]");
		}
		
		
		// selecting the owner from dropdown
		
		public static final By SelectOwnerUnderCardTAskMIlestonefirst()
		{
			return By.xpath("//td[text()='Anshita Bhadoria']/ancestor::table");
		}
		
		public static final By SelectOwnerUnderCardTaskmilestoneSecond()
		{
			return By.xpath("//td[text()='Lokesh Shukla']/ancestor::table");
		}
	
		public static final By SelectOwnerUnderCardTAskMilestoneOwner()
		{
			return By.xpath("//td[text()='Lokesh Shukla']/ancestor::div[contains(@class,'filterPanelDataviewScroll')]/div[position() < 3]");
		}
		
		public static final By SelectfirstOwner()
		{
			//return By.xpath("//div[text()='By Card/MileStone/Task Owner']/ancestor::div[contains(@class,'x-panel-header x-header x-docked')]/following-sibling::div/child::div[2]/div/div/div/div[1]");
			
			//return By.xpath("//div[contains(@id,'dataview-')][1]/div/table/tbody/tr/td[3][1]");
			
			return By.xpath("//div[contains(@class,'filterPanelDataviewScroll')]/div[1]//td[@style='min-width: 240px;max-width: 240px;height: 25px;']");
		}
		
		public static final By SelectSecondOwner()
		{
			//return By.xpath("//div[text()='By Card/MileStone/Task Owner']/ancestor::div[contains(@class,'x-panel-header x-header x-docked')]/following-sibling::div/child::div[2]/div/div/div/div[2]");
			
			return By.xpath("//div[contains(@class,'filterPanelDataviewScroll')]/div[2]//td[@style='min-width: 240px;max-width: 240px;height: 25px;']");
		}
		
		public static final By CommonXpathforOwner()
		{
			return By.xpath("//div[text()='By Card/MileStone/Task Owner']/ancestor::div[contains(@class,'x-panel-header x-header x-docked')]/following-sibling::div/child::div[2]/div/div/div/div[position() <3]//input[@class='filterCheckBoxCls']");
		}
		
		public static final By CheckboXpathforOwner()
		{
			return By.xpath("//div[contains(@id,'dataview-')]//td[@style='min-width: 240px;max-width: 240px;height: 25px;']");
		}
		
		
		
	    //following xpath for Category dropdown 
		
		public static final By AllOwnerDropdown()
		{
			return By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[2]//div[contains(@class,'filterPanelDataviewScroll')]/div//input");
		}
		
		public static final By allCategoryCheckboxXpath()//for following xpath iterate he elements at div elements
		{
			return By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[3]//div[contains(@class,'filterPanelDataviewScroll')]/div//input[@type='checkbox']");
		}
		
		public static final By AllStickersCheckboxes()
		{
			return By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[4]//div[contains(@class,'filterPanelDataviewScroll')]/div//input[@type='checkbox']");
		}
		
		public static final By AllPriorityDropdown()
		{
			return By.xpath("//div[contains(@class,'filterPanelCls')]//div[@class='x-container x-container-default x-accordion-layout-ct']/div/div/child::div[5]//div[contains(@class,'x-component x-component-default x-scroller')]/div//input[@type='checkbox']");
		}
		
		public static final By CheckAllCheckboxfourxpath()
		{
			return By.xpath("//span[text()='Check All:']/ancestor::label/following-sibling::div//input");
		}
		
		
		public static final By AddStickersOnfirstCard()
		{
			return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/following-sibling::table[1]/tbody/tr/td[2]");
		}
		
		public static final By AddStickersOnSecondCard()
		{
			return By.xpath("//span[contains(text(),'In Progress')]/ancestor::table/following-sibling::table[2]/tbody/tr/td[2]");
		}
	
		
		public static final By SelectSticker()
		{
			return By.xpath("//div[contains(@class,'stickerOverlayCls ')]//input[@type='checkbox']");
		}
	

		public static final By ClickOnSaveAfterselectStickers()
		{
			return By.xpath("//div[contains(@class,'stickerOverlayCls')]/child::div[2]/child::div[3]/div/div/a[2]");
		}
		
		
	   public static final By SliderLeftlable()
	   {
		   return By.xpath("//div[@id='filterRangeSlider']//div[@class='ui-rangeSlider-label ui-rangeSlider-leftLabel']");
	   }
		
	   public static final By SliderRightlabel()
	   {
		   return By.xpath("//div[@id='filterRangeSlider']//div[@class='ui-rangeSlider-label ui-rangeSlider-rightLabel']");
	   }
		
		public static final By PercentageOnCardleftSlider()
		{
			return By.xpath("//div[@id='filterRangeSlider']//div[@class='ui-rangeSlider-label ui-rangeSlider-leftLabel']/div");
		}
		
		public static final By PercentageOnCardRightSlider()
		{
			return By.xpath("//div[@id='filterRangeSlider']//div[@class='ui-rangeSlider-label ui-rangeSlider-rightLabel']/div[1]");
		}
		
		
		public static final By ClickOnSavefilterButton()
		{
			return By.xpath("//div[contains(@class,'filterPanelCls')]//span[text()='Save Filter']");
		}
		
		public static final By filterIconOnKb()
		{
			return By.xpath("//div[@class='x-button x-button-topBarBtn x-stretched topBarButtonCls x-layout-box-item x-iconalign-center']/span[2]");
		}
		
		public static final By ClearfilterButton()
		{
			return By.xpath("//span[contains(@class,'clearFilterBtnCls')]");
		}
		
		public static final By ClosefilterPanel()
		{
			return By.xpath("//span[contains(@class,'filterPanelCloseBtnIconCls')]");
		}
		
		public static final By filerBykeyword()
		{
			return By.xpath("//div[contains(@class,'textFieldPlaceholderCls')]//input");
		}
		
		public static final By NavigationSlide()
		{
			return By.xpath("//div[contains(@class,'x-container x-navigationview slide')]");
		}
		
		public static final By DescriptionFieldForSecondCard()
		{
			return By.xpath("//textarea[@name='Description']");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
