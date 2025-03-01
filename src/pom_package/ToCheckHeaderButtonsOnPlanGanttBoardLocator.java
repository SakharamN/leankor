package pom_package;

import org.openqa.selenium.By;

import helper_package.ToCheckHeaderButtonsOnPlanGanttBoardHelper;

public class ToCheckHeaderButtonsOnPlanGanttBoardLocator {

	public static final By clickOnThreeDot() {
		return By.xpath("//div[text()='A " + ToCheckHeaderButtonsOnPlanGanttBoardHelper.createFolderNameRandomly
				+ "']/following-sibling::div[@class='lmenu']");
	}

	public static final By clickOnCreatedProject() {
		return By.xpath(
				"//*[contains(text(),'" + ToCheckHeaderButtonsOnPlanGanttBoardHelper.createProjectNameRandomly + "')]");
	}

	public static final By clickOnfilterIcon() {
		// return By.xpath("//div[@class='x-box-inner']//a[contains(@class,'filterBtnCls
		// ')]");
		return By.xpath("//div[@class='x-panel x-border-item x-box-item x-panel-default']/div/div/div/a[4]");
	}

	public static final By filterDropDownList() {
		return By.xpath("//div[contains(@class,'filterPanelAccordionPanelChildCls ')]");
	}

	public static final By loaderofSavingActivity() {
		return By.xpath("//div[contains(@id,'loadmask-')]//div[@class='x-mask-msg-text' and text()='Saving ...' ]");
	}

	public static final By clickOnOwnerCheckbox() {
		return By.xpath("//input[@class='filterCheckBoxCls']");
	}

	public static final By clickOnCategoryCheckbox() {
		return By.xpath("//td[text()='Default']/preceding-sibling::td/input[@type='checkbox']");
	}

	public static final By clickOnStickersCheckbox() {
		// return By.xpath("//div[text()='By
		// Sticker']/ancestor::div[contains(@class,'filterPanelAccordionPanelChildCls
		// ')]/div[2]//table//tr");
		return By.xpath(
				"//div[text()='By Sticker']/ancestor::div[contains(@class,'filterPanelAccordionPanelChildCls ')]/div[2]");

	}

	public static final By clickOnMediumCheckbox() {
		return By.xpath("//td[text()='Medium']");
	}

	public static final By rangeSliderleft() {
		return By.xpath("//div[@id='filterRangeSlider']/div[4]");
	}

	public static final By rangeSliderRight() {
		return By.xpath("//div[@id='filterRangeSlider']/div[5]");
	}

	public static final By checkAllSetCheckBoxes() {
		// return By.xpath("//div[@class='x-field x-form-item x-form-item-default
		// x-form-type-checkbox x-box-item x-toolbar-item x-field-default
		// x-hbox-form-item']");

		// return By.xpath("//div[contains(@class,'filterPanelAccordionPanelChildCls
		// ')]/div[2]/div//label//span[text()='Check All:']");

		return By.xpath("//div[contains(@id,'checkboxfield-')]//label//span[text()='Check All:']");
	}

	public static final By filterSaveButton() {
		return By.xpath("//div[contains(@id,'searchfilterpanel-')]//a[contains(@class,'saveFilterBtnCls ')]");
	}

	public static final By applyFilterclass() {
		return By.xpath("//a[contains(@class,'applyFilterOnCls')]");
	}

	public static final By clickOnClearfilterBtn() {
		return By.xpath("//div[contains(@id,'searchfilterpanel-')]//a[contains(@class,'clearFilterBtnCls')]");
	}

	public static final By closefilterPanelButton() {
		return By.xpath("//div[contains(@id,'searchfilterpanel-')]//a[contains(@class,'filterPanelCloseBtnCls ')]");
	}

	public static final By titleofActivity() {
		return By.xpath("//input[@name='Name']");
	}

	public static final By activityName() {
		return By.xpath("//div[@class='x-grid-item-container']//table[2]//span[1]/span");
	}

	public static final By clickOnUndoButton() {
		return By.xpath("//div[@class='x-box-inner']//a[@id='undoBtn']");
	}

	public static final By clickOnYesOnUndo() {
		return By.xpath("//div[contains(@class,'alertMsgCls')]//a[2]");
	}

	public static final By clickOnPreviousTimeSpan() {
		// return By.xpath("//div[@class='x-box-inner']//span[text()='Previous
		// Timespan']");

		return By.xpath("//div[@class='x-box-inner']//a[7]");

	}

	public static final By clickOnNextTimespan() {
		// return By.xpath("//div[@class='x-box-inner']//span[text()='Next Timespan']");
		return By.xpath("//div[@class='x-box-inner']//a[8]");
	}

	// xpath for baseline

	public static final By clickOnBaselineDropdown() {
		return By.xpath("//div[@class='x-box-inner']//input[contains(@id,'baselineCombo-')]");
	}

	public static final By listOfElementsOnBaselineWindow() {
		// return By.xpath("//div[@id='baselineCombo-picker']/div/ul/div");
		return By.xpath("//div[@id='baselineCombo-picker']/div/ul/div/div");
	}

	public static final By clickOnCreateBaseline()// before set baseline now create baseline
	{
		// return By.xpath("//div[@id='baselineCombo-picker']/div/ul/div[1]");

		// return By.xpath("//div[@id='baselineCombo-picker-listWrap']/ul/div[1]");
		// return By.xpath("//div[text()='Create Baseline']");

		return By.xpath(
				"//div[contains(@class,'x-boundlist x-boundlist-floating ')]/div[@id='baselineCombo-picker-listWrap']/ul/div[1]");

	}

	public static final By clickOnhideBaseline() {
		return By.xpath("//div[@id='baselineCombo-picker']/div/ul/div[2]");
	}

	public static final By clickOnBaseLineHistory() {
		return By.xpath("//div[@id='baselineCombo-picker']/div/ul/div[3]");
	}

	public static final By enterBaselineName() {
		// return By.xpath("//input[@placeholder='Baseline Title']");
		return By.xpath("//input[@placeholder='Enter a Title']");
	}

	public static final By clickOnAddBaseline() {
		return By.xpath("//a[contains(@class,'setBaselineButtonCls')]");
	}

	public static final By DottedBaselineBorder() {
		return By.xpath("//div[contains(@class,'baseline sch-gantt-baseline-item')]");
	}

	public static final By clickOnShowBaseline() {
		return By.xpath("//div[@id='baselineCombo-picker']/div/ul/div//div[text()='Show Baseline']");
	}

	public static final By getBaselinehistory() {
		return By.xpath("//div[@id='launchmenu']//div[@class='x-grid-item-container']//td/div/div");
	}

	public static final By baselineHistoryLaunchMenu() {
		return By.xpath("//div[@id='launchmenu']");
	}

	//

	public static final By clickOnShowDownArrow() {
		return By.xpath("//input[@name='ViewOption']");
	}

	public static final By clickOnCapacityPlanning() {
		// return By.xpath("//div[contains(@class,'x-boundlist
		// x-boundlist-floating')][2]//ul/div[1]");//qa9
		// return By.xpath("(//div[contains(@class,'x-boundlist
		// x-boundlist-floating')])[5]//ul/div[1]");

		return By.xpath("//div[contains(@class,'x-boundlist x-boundlist-floating')]//div[text()='Capacity Planning']");

	}

	public static final By clickOnResourceUtilization() {
		// return By.xpath("//div[contains(@class,'x-boundlist
		// x-boundlist-floating')][2]//ul/div[2]");//qa9
		// return By.xpath("(//div[contains(@class,'x-boundlist
		// x-boundlist-floating')])[5]//ul/div[2]");

		return By.xpath(
				"//div[contains(@class,'x-boundlist x-boundlist-floating')]//div[text()='Resource Utilization']");
	}

	public static final By clickOnResourceSchedule() {
		// return By.xpath("//div[contains(@class,'x-boundlist
		// x-boundlist-floating')][2]//ul/div[3]");
		// return By.xpath("(//div[contains(@class,'x-boundlist
		// x-boundlist-floating')])[5]//ul/div[3]");
		return By.xpath("//div[contains(@class,'x-boundlist x-boundlist-floating')]//div[text()='Resource Schedule']");
	}

	public static final By clickOnActivitityAboveEditinformationforUndo() {
		// return
		// By.xpath("//span[text()='ActivityAbove']/ancestor::body/child::div[@class='x-menu
		// launchBoardMenuCls x-layer x-menu-default
		// x-border-box'][2]//span[text()='Edit Information']");

		return By.xpath(
				"//span[text()='ActivityAbove']/ancestor::body/child::div[@class='x-menu launchBoardMenuCls x-layer x-menu-default x-border-box']//span[text()='Edit Information']");
	}

	public static final By positionOfActivity() {
		return By.xpath(
				"(//td[contains(@class,'x-grid-cell x-grid-td x-grid-cell-timeaxiscolumn-')])[2]//label[text()='ActivityAbove']");
	}

	public static final By todayLineCurrentTimeIndicator() {
		return By.xpath("//div[@title='Current time']");
	}

	public static final By planGanttSettingGearIcon() {
		// return By.id("combo-1070-triggerWrap");
		// return By.id("combo-1313-trigger-picker");
		return By.id("//div[@id='combobox-1325-trigger-picker']");

		// return By.id("//div[contains(@class,'x-field combo-custom-cls-setting
		// x-form-item ')]");
	}

	public static final By planGanttZoomToFit() {
		// return By.xpath("//span[contains(@id,'button-1072-btnWrap')]");
		return By.xpath("//li[contains(text(),'Zoom to Fit')]");

		// return By.xpath("//li[contains(text(),'Zoom to fit')]");
	}

	// xpath for setting gear icon

	public static final By clickOnSettingGearIcon() {
		return By.xpath("//div[@class='x-box-inner']//div[contains(@class,'x-field combo-custom-cls-setting')]");
	}

	public static final By clickOnBasline1() {
		return By.xpath(
				"//div[contains(@class,'baseLine-history-custom-cls')]//table//td//div//div[contains(text(),'Baseline1')]");
	}

	public static final By clickOnBaseline2() {
		return By.xpath(
				"//div[contains(@class,'baseLine-history-custom-cls')]//table//td//div//div[contains(text(),'Baseline2')]");
	}

	public static final By clickOnBaseline3() {
		return By.xpath(
				"//div[contains(@class,'baseLine-history-custom-cls')]//table//td//div//div[contains(text(),'Baseline3')]");
	}

	public static final By filterByTitle() {
		return By.xpath("//input[@placeholder='Filter by title...']");
	}

}
