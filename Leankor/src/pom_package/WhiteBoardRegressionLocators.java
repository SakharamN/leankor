package pom_package;

import org.openqa.selenium.By;

public class WhiteBoardRegressionLocators {
		
	public static final By clickOnWhiteBoard()
	{
		return By.xpath("//div[text()='Whiteboards']");
	}
	
	public static final By selectCreatedWhiteBoard()
	{
		return By.xpath("//div[text()='White Board Regression']");
	}
	
	public static final By clickOnWhiteBoardThreeDots()
	{
		return By.xpath("//div[contains(text(),'Whiteboards')]/following::div[2]");
	}
	
	public static final By createWhiteBoard()
	{
		return By.xpath("//div[contains(text(),'Create Whiteboard')]");
	}
	
	public static final By enterWhiteBoardName()
	{
		return By.xpath("//input[@placeholder='New Whiteboard']");
	}
	
	public static final By clickOnWhiteBoardAddButton()
	{
		return By.xpath("//div[contains(@class,'addBtnCls')]");
	}
	
	public static final By openWhiteBoard()
	{
		return By.xpath("//div[contains(text(),'White Board Regression')]");
	}
	
	public static final By whiteBoardLoadMask()
	{
		return By.xpath("//div[contains(@id,'ext-loadmask-')]//div[@class='x-loading-spinner-outer']");
	}
	
	public static final By clickOnWhiteBoardZoomIcon()
	{
		return By.id("zoomIcon");
	}
	
	public static final By addTextToWhiteBoard()
	{
		return By.id("floatingLabelUpload");
	}
	
	public static final By whiteBoardBackground()
	{
		return By.id("backgroundContainer");
	}
	
	public static final By increaseFontSize()
	{
		return By.xpath("//div[contains(@id,'ext-spinnerfield-')]/child::div[2]//div[contains(text(),'+')]");
	}
	
	public static final By selectColorFromBackgroundInput()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div[7]");
	}
	
	public static final By enterTextAreaField()
	{
		return By.tagName("textarea");
	}
	
	public static final By clickOnCreateButton()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	public static final By firstTextCreatedOnWhiteBoard()
	{
		return By.id("ext-labelText-1");
	}
	
	public static final By clickOnTextLinkIcon()
	{
		return By.xpath("//div[contains(@class,'stickerlinkBtnCls')]");
	}
	
	public static final By selectProjectName()
	{
		return By.xpath("//div[text()='Regression Project']");
	}
	
	public static final By selectKanbanCardFromList()
	{
		return By.xpath("//div[contains(text(),'Card Creating by new icon')]");
	}
	
	public static final By linkToWindowSaveButtonOnWhiteBoard()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	public static final By clickOnUpArrow()
	{
		return By.xpath("//div[contains(@class,'arrowUp')]");
	}
	
	public static final By selectBlackColorFromBackgroundColorDropdown()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div[94]");
	}
	
	public static final By secondTextCreatedOnWhiteBoard()
	{
		return By.id("ext-labelText-2");
	}
	
	public static final By clickOnDownArrow()
	{
		return By.xpath("//div[contains(@class,'arrowDown')]");
	}
	
	public static final By clickOnDeleteTextOnWhiteBoard()
	{
		return By.xpath("//div[contains(@class,'deleteBtnCls')]");
	}	
	
	public static final By yesButtonAfterDelete()
	{
		return By.xpath("//span[text()='Yes']");
	}
	
	public static final By clickOnReportNameDropdown()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//div[@class='x-inner x-form-inner x-vertical x-align-stretch x-pack-start x-layout-box']//div[contains(@id,'ext-selectfield-')]/child::div[2]");
	}
	
	public static final By selectSixtyDayZoneCycleTimeFromReportNameDropDown()
	{
		return By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div[77]");
	}
	
	public static final By visualAnalyticChartToolbar()
	{
		return By.xpath("//div[contains(@id,'ext-chart-1')]//div[contains(@id,'ext-toolbar-')]");
	}
	
	public static final By visualAnalyticOptionButton()
	{
		return By.xpath("//div[contains(@class,'optionChartBtnCls')]");
	}
	
	public static final By resizeVisualAnalyticChartIcon()
	{
		return By.xpath("//div[contains(@class,'resizeBtnCls')]");
	}
	
	public static final By resizeVisualChartToolPoint()
	{
		return By.id("movereziedocumentmarker");
	}
	
	public static final By cloneVisualAnalyticIcon()
	{
		return By.xpath("//div[contains(@class,'copyBtnCls')]");
	}
	
	public static final By clickOnVisualAnalyticChartFirst()
	{
		return By.xpath("//div[@id='ext-chart-1']//div[contains(@class,'optionChartBtnCls')]");
	}
	
	public static final By deleteVisualAnalyticChart()
	{
		return By.xpath("//div[contains(@class,'deleteBtnCls')]");
	}
	
	public static final By clickOnVisualAnalyticChartSecond()
	{
		return By.xpath("//div[@id='ext-chart-2']//div[contains(@class,'optionChartBtnCls')]");
	}
	
	public static final By imageCreatedOnWhiteBoard()
	{
		return By.id("ext-image-2");
	}
	
	public static final By secondImageOnWhiteBoard()
	{
		return By.id("ext-image-3");
	}
	
	public static final By selectKanbanCardForImageLink()
	{
		return By.xpath("//*[contains(text(),'Medium : Case')]");
	}
	
	
	//Add card to board xPath
	public static final By selectKanbanCard()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-1')]");
	}
	
	public static final By editKanbanCardPensilIcon()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-1')]//div[contains(@class,'editKanbanBtnCls')]");
	}
	
	public static final By cardAllocationBar()
	{
		return By.xpath("//div[@id='ext-spinnerfield-1']//div[text()='-']");
	}
	
	//verify kanban card xPath
	public static final By getCardCategory()
	{
		return By.xpath("//form[@id='ext-kanbanpanel-1']//div[contains(@class,'kanbanToolbarCls')]//div[contains(@class,'kanbanTitleCls')]");
	}
	
	public static final By getCardDuration()
	{
		return By.xpath("//form[@id='ext-kanbanpanel-1']//div[contains(@class,'kanbanToolbarCls')]//div[contains(@class,'estimateTimePanelCls')]");
	}
	
	public static final By getCardPercentStatus()
	{
		return By.xpath("//form[@id='ext-kanbanpanel-1']//div[contains(@class,'harveyBallPanel_')]");
	}
	
	public static final By getCardTitleAndDescription()
	{
		return By.xpath("//form[@id='ext-kanbanpanel-1']/div/child::div[2]//div[contains(@class,'kanbanDatePanelCls')]");
	}
	
	public static final By getCardDate()
	{
		return By.xpath("//form[@id='ext-kanbanpanel-1']/div/child::div[3]");
	}
	
	public static final By getCardPriority()
	{
		return By.xpath("//div[@id='ext-kanbancard-1']//div[contains(@id,'ext-tabbar-')]//div[5]");
	}
	
	//Update kanban card xPath
	public static final By updateKanbanCardDescriptionField()
	{
		return By.xpath("//form[contains(@id,'ext-cardInfo-')]//textarea[@name='Description']");
	}
	
	public static final By selectOwnerNameAfterSearch()
	{
		return By.xpath("//div[text()='chirayu malviya']");
	}
	
	public static final By updateCardAllocationBar() 
	{
		return By.xpath("//form[contains(@id,'ext-cardInfo-')]//div[contains(@id,'ext-spinnerfield-')]//div[text()='-']");
	}
	
	
	//kanban card status side column xPath
	public static final By kanbanCardStatusSideColumnAddButton()
	{
		return By.xpath("//form[contains(@id,'ext-statusView-')]//div[contains(@class,'logAddBtn')]");
	}
	
	
	public static final By selectPlanBoardforLinkToProjectBoard()
	{
		return By.xpath("//*[contains(text(),'Plan Board(Regression Project)')]");
	}
	
	public static final By selectActivityForLinkToCard()
	{
		return By.xpath("//div[contains(@class,'x-list-item-last') and contains(@class,'assignUserItemCls')]");
	}
	
	public static final By clickOnKanbanCardLinkIcon()
	{
		return By.xpath("//div[contains(@class,'linkIdPanelCls')]");
	}
	
	public static final By planGanttLoader()
	{
		return By.xpath("//div[@id='loadmask-1077']//div[@id='loadmask-1077-msgEl']");
	}
	
	public static final By getWhiteBoardMinatureOnActivity()
	{
		return By.xpath("//div[contains(@id,'customganttpanel-')]//table[contains(@id,'customganttpanel-') and @data-recordindex='1']//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div");
	}
	
	public static final By whiteBoardLogTimeAddButton()
	{
		return By.xpath("//form[contains(@id,'ext-logTime-')]//span[text()='Add']");
	}
	
	
	//kanban card Subscriber xPath
	
	public static final By selectUserForSubscriber()
	{
		return By.xpath("//div[text()='varsha rawat']");
	}
	
	public static final By clickOnSelectSubscriberDropDown()
	{
		return By.xpath("//*[contains(@class,'x-button x-button-topBarBtn prority_lbl_white x-layout-box-item')]//span[text()='Assign a Subscriber']");
	}
	
	public static final By addButtonOnKanbanCard()
	{
		return By.xpath("//form[contains(@id,'ext-newPostSubscriber-')]//span[text()='Add']");
	}
	
	
	//kanban card custom field xPath
	public static final By getCurrencyCustomFieldValue()
	{
		return By.xpath("//div[contains(@id,'ext-currencyField-')]//div[@class='x-unsized x-field-input']");
	}
	
	public static final By getTextCustomFieldValue()
	{
		return By.xpath("//div[contains(@id,'ext-CustomFields-')]//div[contains(@id,'ext-textfield-')]//div[@class='x-unsized x-field-input']");
	}
	
	
	//kanban card Upload sticker xPath
	public static final By uploadStickerPlusButton()
	{
		return By.xpath("//div[contains(@class,'addStickerCls')]");
	}
	
	public static final By enterNameOnUploadStickerInputField()
	{
		return By.xpath("//input[contains(@class,'stickerUpload')]");
	}
	
	public static final By uploadStickerWindowUploadButton()
	{
		return By.xpath("//div[contains(@class,'saveBtnClss')]");
	}
	
	public static final By getWhiteBoardSticker()
	{
		return By.xpath("//div[contains(@class,'stickerContainerCls')]//div[contains(@class,'stickerBtnCls')]");
	}
	
	//Clone kanban card xPath
	public static final By clonedKanbanCardCount()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-')]");
	}
	
	public static final By cardFirstAfterClone()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-2')]");
	}
	
	public static final By cardSecondAfterClone()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-3')]");
	}
	
	
	//Hyperjump whiteboard card xPath 
	public static final By editSecondKanbanCardPensilIcon()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-3')]//div[contains(@class,'editKanbanBtnCls')]");
	}
	
	public static final By searchBoardNameOnHyperjumpWindow()
	{
		return By.xpath("//div[contains(@id,'ext-textfield-')]//input");
	}
	
	public static final By selectkanbanBoarAfterSearch()
	{
		return By.xpath("//p[text()='Regression Kanban Board']");
	}
	
	public static final By clickOnJumpButton()
	{
		return By.xpath("//span[text()='Jump']");
	}
	
	
	public static final By editFirstKanbanCardPensilIcon()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-2')]//div[contains(@class,'editKanbanBtnCls')]");
	}
	
	public static final By randomArea()
	{
		return By.xpath("//div[text()='Regression Project - White Board Regression']");
	}
	
	public static final By getFilesUploadCountOnKanbanCard()
	{
		return By.xpath("//div[@id='ext-kanbancard-1']//div[contains(@class,'chatImageCls')]/span[1]");
	}
	
	
	//White board Under Preferences
	
	//Security xpath
	public static final By clickOnCEODesignationEditIcon()
	{
		return By.xpath("//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div[3]//table/tbody/tr/td[4]");
	}
	
	public static final By getDisableMoveCheckbox()
	{
		return By.xpath("//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div[3]//table/tbody/tr/td[2]/span");
	}
	
	public static final By getDisableEditCheckbox()
	{
		return By.xpath("//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div[3]//table/tbody/tr/td[3]/span");
	}
		
	public static final By clickOn_HomeButtonOnWhiteBoard()
	{
		return By.xpath("//div[contains(@class,'carouselHome')]");
	}
	
	public static final By accountFieldName()
	{
		return By.id("opp4");
	}
	
	public static final By getTitleOfOpportunityCard()
	{
		return By.xpath("//div[text()='Opportunity:TestOpportunityOnWhiteBoard']");
	}
	
	public static final By opportunityCard()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-2')]");
	}
	
	public static final By planGanttLoaderDynamically()
	{
		return By.xpath("//div[@style='left: 640px; top: 216px;']");
	}
	
	public static final By selectActivityToLink()
	{
		return By.xpath("//div[contains(@class,'item-last')]//div[text()='Default']");
	}
	
	public static final By waitUntillActivityIsVisible()
	{
		//return By.xpath("//div[@id='customganttpanel-1011-timelineview']//following-sibling::table[4]//div[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']/child::div[2]");
		return By.xpath("//div[@id='customganttpanel-1011-timelineview']//following-sibling::table[3]//div[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']/child::div[2]");
	}
	
	public static final By getMiniatureCountOnActivity()
	{
		//return By.xpath("//div[@id='customganttpanel-1011-timelineview']//following-sibling::table[4]//div[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div");
		return By.xpath("//div[@id='customganttpanel-1011-timelineview']//following-sibling::table[3]//div[contains(@id,'customganttpanel-')]//div[@class='task-body-parent-custom projectgantt']/child::div[2]/div");
	}
	
	//Board Setting Under Preferences
	public static final By clickOnBoardSettingUnderPrefeneces()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[8]");
	}
	
	public static final By clickOnInboundEmailsUnderPreferences()
	{
		return By.xpath("//div[contains(@id,'ext-container-')]//div[contains(@id,'ext-listitemheader-')]/following-sibling::div[2]//div[9]");
	}
	
	public static final By selectCategoryFromDefaultCategoryDropdown()
	{
		return By.xpath("//div[contains(@id,'ext-element-') and contains(@class,'x-scroll-scroller')]//div[6]");
	}
	
	
	//Clone Complete white board xPath
	
	public static final By selectHighlightedDate()
	{
		return By.xpath("//div[@class='datepicker-container datepicker-dropdown datepicker-top-left']//div[@class='datepicker-panel']/ul[3]/li[@class='highlighted picked']");
	}
	
	
	//Zoom In and Zoom Out White Board xPath
	
	public static final By minusIcon()
	{
		return By.id("minusbtn");
	}
	
	public static final By plusIcon()
	{
		return By.id("plusbtn");
	}
	
	
	//View All Chatter xPath's
	
	public static final By kanbanBoardChatterOpenButton()
	{
		return By.xpath("//span[text()='Open']");
	}
	
	public static final By getTextFromChatterSubWindow()
	{
		return By.xpath("//div[@id='chatterexpando']//div[@id='feedwrapper']//div[contains(@class,'cxfeeditem feeditem')]//div[@class='cxfeeditemtextwrapper']//p[1]");
	}
	
	public static final By clickOnCaseCardUnderViewAllChatterOnWhiteBoard()
	{
		return By.xpath("//div[contains(@class,'openChatterlistItem')]//div[contains(@id,'ext-simplelistitem-') and contains(@class,'item-first')]//td[4]");
	}
	
	public static final By selectCaseCardForVerifyChatter()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-1')]//div[contains(@class,'chatImageCls')]");
	}
	
	public static final By clickOnOpportunityCardUnderViewAllChatterOnWhiteBoard()
	{
		return By.xpath("//div[starts-with(@id,'ext-simplelistitem-') and contains(@class,'-item-last')]//td[4]");
	}
	
	public static final By selectOpportunityForVerifyChatter()
	{
		return By.xpath("//div[contains(@id,'ext-kanbancard-2')]//div[contains(@class,'chatImageCls')]");
	}
	
	public static final By viewAllCardHistoryIcon()
	{
		return By.id("notificationIconBtn");
	}
	
	
	//Board Design WhiteBoard xPath
	
	public static final By clickOnBoardDesignIcon()
	{
		return By.id("secondtb");
	}
	
	public static final By importIconUnderBoardDesign()
	{
		return By.id("importBgBtn");
	}
	
	public static final By uploadFileOnImport()
	{
		return By.xpath("//input[@name='photo']");
	}
	
	public static final By uploadButtonOnImportSubWindow()
	{
		return By.xpath("//button[text()='Upload']");
	}
	
	public static final By clickOnSuccessMessageAfterImageUpload()
	{
		return By.xpath("//*[text()='OK']");
	}
	
	public static final By clickOnLibraryIcon()
	{
		return By.id("libraryBgBtn");
	}
	
	public static final By selectImageFromLibraryWindow()
	{
		return By.xpath("//div[@title='nobita']");
	}
	
	public static final By clickOnUploadedImageOnWhiteBoard()
	{
		return By.xpath("//div[contains(@id,'ext-image-') and (contains(@style,'background-image:'))]");
	}
	
	public static final By clickOnRemoveIconFromWhiteBoard()
	{
		return By.id("removeBgBtn");
	}
	
	public static final By clickOnCreateIconOnWhiteBoard()
	{
		return By.xpath("//div[contains(@class,'zoneCreateIcon')]");
	}
	
	public static final By enterCustomZoneTitle()
	{
		return By.xpath("//input[@name='Title']");
	}
	
	public static final By openZoneModeDropDown()
	{
		return By.xpath("//div[contains(@id,'ext-selectfield-')]//div[2]");
	}
	
	public static final By selectZoneModeAsRowFromDropDown()
	{
		return By.xpath("//span[text()='Rows']");
	}
	
	public static final By selectOpportunityCardForMoveToZone()
	{
		return By.id("ext-kanbancard-2");
	}
	
	public static final By zoneArea()
	{
		//return By.id("kanbancardinsidezonelistext-zone-1");
		return By.xpath("//div[@id='kanbancardinsidezonelistext-zone-1']/child::div[1]/div[2]/div[1]");
	}
	
	public static final By clickOnMoveZoneTab()
	{
		return By.id("zonechange");
	}

	
	public static final By moveCustomCreatedZoneToAnotherPlaceOnWhiteBoard()
	{
		return By.id("movereziedocumentzone");
	}
	
}