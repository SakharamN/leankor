package pom_package;

import org.openqa.selenium.By;
import helper_package.AddToBoardFanButtonHelper;
import helper_package.KanbanBoardRegressionHelper;

public class AddToBoardFanButtonLocators {
	
	
	public static final By regressionKanbanBoardMasterContainers()//set method return type to By
	{
		return By.xpath("//div[contains(@id,'ext-productSwimlaneContainer-')]//form[contains(@style,'rgb(232, 232, 232);')]");
	}
	
	public static final By templateMasterContainer()
	{
		return By.id("ext-zonePanel-31");
	}
	
	public static final By backlogMasterContainer()
	{
		return By.xpath("//form[@id='ext-zonePanel-8']/div[1]/div[2]/div/div[2]/div[1]/div[1]/div/form/div[1]/div[2]/div[1]/div/div/form/div[1]/div[2]/div/div/div[1]/div[1]/div[1]/div[1]");
	}
	
	public static final By inprogressMasterContainer()
	{
		return By.id(KanbanBoardRegressionHelper.getMasterContainerDynamicWebElementId);
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
	
	//***********************************************| Add Fan Button xpath for Text,Visual Analytics,Image,Kanban Card,Sticker Xpath |*********************************************
	
	
	//******************************Click on Add fan Board, Create Text To kanban board and Resize text Xpath*************************
	public static final By clickOnAddToBoardFan()
	{
		return By.xpath("//div[@id='mainMenuBtn']");
	}
	
	public static final By addTextToBoardUnderFanButton()
	{
		return By.id("floatingLabelUpload");
	}
	
	public static final By clickOnPlusButtonToIncreaseFontSize()
	{
		return By.xpath("//div[contains(@id,'ext-spinnerfield-')]//div[contains(@class,'x-spinner-button-up')]");
	}
	
	public static final By openColorInputDropDown()
	{
		return By.xpath("//div[@class='x-dock-body']//div[@style='transform: translate3d(0px, 0px, 0px);']/div[contains(@id,'ext-panel-')]/div/div[2]/div/div[2]");		
	}
	
	public static final By colorDropDownColorPickerList()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div");
	}
	
	public static final By selectWhiteColorOfTextFromColorDropDown()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div[2]");
	}	
	
	public static final By openBackGroundInputDropDown()
	{
		return By.xpath("//div[@class='x-dock-body']//div[@style='transform: translate3d(0px, 0px, 0px);']/div[contains(@id,'ext-panel-')]/div/div[3]/div/div[2]");
	}
	
	public static final By selectBrownColorFromBackGroundDropDown()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div[6]");
	}
	
	public static final By writeSomeTextOnTextAreaField()
	{
		return By.name("TextLabel");
	}
	
	public static final By clickOnCreateButtonForAddImageToKanbanBoard()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	public static final By createTextOnKanbanBoard()
	{
		return By.xpath("//*[contains(@class,'markerShadow-inner')]");
	}
	
	public static final By clickOnCreatedTextForEdit()
	{
		return By.xpath("//*[contains(@id,'ext-labelText-')]");
	}
	
	public static final By clickOnResizeForIncreaseTextArea()
	{
		return By.xpath("//div[contains(@class,'resizeBtnCls')]");
	}
		
	public static final By stretchTextAreaForCompletelyVisibleText()
	{
		return By.id("movereziedocumentmarker");
	}
	
	public static final By clickOnTextAreaAfterResize()
	{
		return By.xpath("//div[contains(@class,'resizeBtnClsOn')]");
	}	
	
	//****************************Click on Text and Link Text to kanban Card xpath*************************
	
	public static final By clickOnLinkIconOnText()
	{
		return By.xpath("//div[contains(@class,'stickerlinkBtnCls')]");
	}
	
	public static final By getListOfProjectBoardProjectAndLinkToCardDropDown()
	{
		return By.xpath("//div[contains(@id,'ext-fieldset-')]//div[contains(@class,'prority_lbl_white')]");
	}
	
	public static final By clickOnFolderWhichWillSelect()
	{
		return By.xpath("//div[text()='Regression Folder']");
	}
	
	public static final By selectProjectName()
	{
		//return By.xpath("//div[text()='Regression Project for link kanban card']");
		return By.xpath("//div[text()='Regression Project']");
	}
	
	public static final By selectKanbanBoard()
	{		
		//return By.xpath("//div[text()='Regression Kanban Board for link one card to it']");
		return By.xpath("//div[text()='Regression Kanban Board']");
	}
	
	public static final By selectKanbanCardFromList()
	{
		//return By.xpath("//div[text()='Card For Link:One Card is link to this card']");
		return By.xpath("//div[text()='New Card']");
	}
	
	public static final By clickOnSaveButtonForLinkTo()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	
	//******************************Text Shuffle********************************

	public static final By selectBlackColorFromBackGroundDropDown()
	{
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div[98]");
	}
	
	public static final By bothTextAreaXpath()
	{
		//return By.xpath("//div[contains(@style,'left: 2639px !important; top: 2156px')]");
		return By.xpath("//div[contains(@id,'ext-labelText-')]");                             //Not found
		//div[contains(@style,'left: 2849px !important; top: 2156px')]
		
	}
	
	public static final By clickOnSmallTextArea()
	{
		return By.xpath("//div[contains(@style,'left: 2639px !important; top: 2156px')]");// small text area xpath
	}
	
	public static final By clickOnArrowDownIconForShuffleTextToBehind()
	{
		return By.xpath("//div[contains(@class,'arrowDown')]");
	}
	
	public static final By clickOnArrowUpIconForShuffleTextToFront()
	{
		return By.xpath("//div[contains(@class,'arrowUp')]");
	}
	
	//Chatter on Long text xpath
	
	public static final By clickOnChatterIconOfText()
	{
		return By.xpath("//div[contains(@class,'markerChatterCls')]");
	}
	
	public static final By inspectIframe()
	{
		return By.tagName("iframe");
	}
	
	public static final By iFrameSrcValueAndSwitchTo()
	{
		//return By.xpath("//iframe[@src='"+AddToBoardFanButtonHelper.getIframeSRCAttribute+"']");
		return By.xpath("//iframe[@src='"+AddToBoardFanButtonHelper.getIframeSRCAttribute+"']");
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
		return By.xpath("//iframe[contains(@title,'publisherRichTextEditor')]"); //NOt Found ----------Now found right click and inspect
	}
	
	public static final By getChildiFrameClassAttributeValue()
	{
		return By.xpath("//iframe[@class='"+AddToBoardFanButtonHelper.childiFrameValue+"']");
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
	
	public static final By closeChatterWindow()
	{
		return By.xpath("//*[contains(@class,'closeBtn')]");
	}
	
	
	// Update Text Large Text Area xpath
	
	public static final By clickOnEditPensilIcon()
	{
		return By.xpath("//*[contains(@class,'editChartBtnCls')]");
	}
		
	public static final By increaseTextValueOnEdit()
	{
		return By.xpath("//div[contains(@id,'ext-spinnerfield-')]/div[2]/div[contains(@class,'x-spinner-button-up')]");
	}
	
	public static final By selectRedColorOfTextFromColorDropDown()
	{
		//return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@id,'ext-dataview-element-container-')]/div[17]");
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div[17]");
	}
	
	public static final By selectLightblueColorOfTextFromBackGroundDropDown()
	{
		//return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@id,'ext-dataview-element-container-')]/div[23]");
		return By.xpath("//div[@class='x-container x-panel x-sized x-floating']//div[contains(@class,'x-unsized x-dataview-container')]/div[23]");
	}
		
	public static final By clickOnUpdateButtonOfText()
	{
		return By.xpath("//span[text()='Update']");
	}
	
	
	//Add Visual Analytics to Kanban Board xPath
	
	public static final By addVisualAnalytics()
	{
		return By.id("ext-menuitem-chartUpload");
	}
	
	public static final By OpenReportNameDropDown()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//div[@class='x-inner x-form-inner x-vertical x-align-stretch x-pack-start x-layout-box']//div[contains(@id,'ext-selectfield-')]//div[contains(@id,'ext-input-')]");
	}
	
	public static final By selectSixtyDayZoneCycleFromReportNameDropDown()
	{
		return By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div[72]");
	}
	
	public static final By clickOnCreateButtonForAddVisual()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	public static final By clickOnReportNameDropDown()
	{
		return By.xpath("//form[contains(@id,'ext-formpanel-')]//div[@class='x-inner x-form-inner x-vertical x-align-stretch x-pack-start x-layout-box']//div[contains(@id,'ext-selectfield-')]//div[contains(@id,'ext-input-')]");
	}
	
	public static final By selectBurnDownReportFromReportNameDropDown()
	{
		return By.xpath("//div[contains(@class,'x-selectFld-allOverlayList')]//div[@class='x-inner x-size-monitored x-paint-monitored x-scroll-scroller']/div[4]");
	}
	
	
	//this is Second created Visual Chart
	public static final By createdVisualAnalyticBurnDownReportChart()
	{
		return By.xpath("//div[@id='ext-chart-1']//div[contains(@id,'ext-spacer-')]");
	}
	
	
	//this is firstly created Visual Chart
	public static final By createdVisualAnalyticSixtyDayZoneCycleChart()
	{
		return By.xpath("//div[@id='ext-chart-2']//div[contains(@id,'ext-spacer-')]");
	}
	
	
	// Add Image to kanban Board xPath
	public static final By addImageToKanbanBoard()
	{
		return By.id("ext-menuitem-Upload");
	}
	
	public static final By sendImageToInputField()
	{
		return By.name("photo");
	}
	
	public static final By clickOnUploadButtonForUploadImage()
	{
		return By.xpath("//span[text()='Upload']");
	}
	
	public static final By clickOnImageAndDrag()
	{
		//return By.id("ext-img-1");
		
		return By.xpath("ext-menuitem-Upload");
	}
	
	public static final By imageLinkIcon()
	{
		return By.xpath("//div[contains(@class,'linkBtnCls')]");
	}
	
	public static final By linkToWindowLinkToProjectBoardCardAndProjectDropdownList()
	{
		return By.xpath("//div[contains(@class,'prority_lbl_white')]");
	}
	
	//Select Project Name
	public static final By selectProjectNameChild()
	{
		return By.xpath("//div[text()='Regression Project']");
	}

	//Select Kanban Board Name
	public static final By selectKanbanBoardChild()
	{
		return By.xpath("//div[text()='Regression Kanban Board']");
	}
	
	//Select Kanban Card Name
	public static final By selectKanbanCardChild()
	{
		return By.xpath("//div[starts-with(@class,'x-list-item-first')]");
		//div[starts-with(@class,'x-list-item-first') and contains(@class,'header-wrap')]
	}
	
	public static final By clickOnClearLinkButton()
	{
		return By.xpath("//*[contains(text(),'Clear Link')]");
	}
	
	public static final By clickOnSaveButtonLinkToWindow()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	
	//Image lock xPath
	public static final By clickOnImageLockIcon()
	{
		return By.xpath("//div[contains(@class,'lockBtnCls')]");
	}
	
	public static final By clickOnCloneIcon()
	{
		return By.xpath("//div[contains(@class,'copyBtnCls')]");
	}
	
	public static final By clonedImageChild()
	{
		return By.id("ext-img-2");
	}
	
	public static final By imagePopupUpArrow()
	{
		return By.xpath("//div[contains(@class,'arrowUp')]");
	}
	
	public static final By imagePopupDownArrow()
	{
		return By.xpath("//div[contains(@class,'arrowDown')]");
	}
	
	//Resize image xPath
	public static final By imageResizeIcon()
	{
		return By.xpath("//div[contains(@class,'resizeBtnCls')]");
	}
	
	public static final By cloneImageSmallDivForResize()
	{
		return By.xpath("//div[@id='ext-marker-1']//div[@id='movereziedocumentmarker']");//change only Number
	}
	
	
	//Chatter On Image xPath
	public static final By imageChatterIcon()
	{
		return By.xpath("//div[contains(@class,'markerChatterCls')]");
	}
	
	public static final By inspectiFrameOnChatterWindowOfClonedImage()
	{
		return By.xpath("//div[contains(@class,'overlayFloatingChatter')]//iframe");
	}
	
	public static final By getParentiFramexPath()
	{
		return By.xpath("//iframe[@src='"+AddToBoardFanButtonHelper.getSrcAttributeValueClonedImageWindow+"']");
	}
	
	public static final By clickOnPostLinkOnChatterWindow()
	{
		return By.xpath("//span[text()='Post']");
	}
	
	public static final By chatterTextAreaiFramexPath()
	{
		return By.xpath("//iframe[@class='"+AddToBoardFanButtonHelper.childiFrameValueOnClonedImageWindow+"']");
				
	}
	
	
	//Add Kanban Card to Kanban Board xPath
	public static final By addKanbanCardToBoard()
	{
		return By.id("cardFanBtn");
	}
	
	public static final By categoryDropdownOnKanbanCard()
	{
		return By.id("categoryTextBtn");
	}
	
	public static final By selectCategoryFromDropdown()
	{
		//return By.xpath("//div[contains(@class,'footer-wrap') and contains(@class,'categoryListCls')]");
		return By.xpath("//div[text()='HR']");
	}
	
	public static final By enterCardId()
	{
		return By.name("CardID");
	}
	
	public static final By enterCardTitle()
	{
		return By.name("Name");
	}
	
	public static final By enterCardDescription()
	{
		return By.name("Description");
	}
	
	public static final By clickOnCreateButton()
	{
		return By.xpath("//span[text()='Create']");
	}
	
	
	//Upload Sticker on Kanban Board  xPath
	public static final By dragToAddStickerOnBoard()
	{
		return By.id("stickerFanBtn");
	}
	
	public static final By clickOnPlusIconForStickerUpload()
	{
		return By.xpath("//div[contains(@class,'sidemenuCls')]//*[contains(@class,'addSwimlaneCls')]");
	}
	
	public static final By uploadStickerWindowNameInputField()
	{
		return By.name("Name");
	}
	
	public static final By inputFieldForImageUpload()
	{
		return By.name("photo");
	}
	
	public static final By clickOnUploadButtonStickerWindow()
	{
		return By.xpath("//span[text()='Upload']");
	}
}