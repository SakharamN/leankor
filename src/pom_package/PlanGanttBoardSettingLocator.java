package pom_package;

import org.openqa.selenium.By;

import helper_package.PlanGanttBoardSettingHelper;

public class PlanGanttBoardSettingLocator {

	public static final By clickOnThreeDot() {
		return By.xpath("//div[text()='A " + PlanGanttBoardSettingHelper.createFolderNameRandomly+ "']/following-sibling::div[@class='lmenu']");
	}

	public static final By clickOnCreatedProject() {
		return By.xpath("//*[contains(text(),'" + PlanGanttBoardSettingHelper.createProjectNameRandomly + "')]");
	}

	public static final By clickOn_NavIconScroller() {
		return By.xpath("//div[@class='x-unsized x-button menu x-dock-item x-docked-right x-has-height x-iconalign-center']");
	}

	public static final By clickOnPlantGanttBoard() {
		return By.xpath("//div[@class='x-list-item-first x-list-header-wrap x-list-item x-stretched x-list-item-tpl']//div[contains(@class,'advanceoption ')]");
	}

	// xpath for setting gear icon

	public static final By clickOnSettingGearIcon() {
		return By.xpath("//div[@class='x-box-inner']//div[contains(@class,'x-field combo-custom-cls-setting')]");
	}

	public static final By spinnerLoaderforPlanGantt() {
		return By.xpath("//div[@class='x-container screenloader x-layout-fit-item x-stretched']//div[@class='customloader']");
	}

	public static final By clickOnShowCriticalpath() {
		return By.xpath("//li[contains(text(),'Show Critical Path')]");
	}

	public static final By clickOnShowCriticalpathRoundSlider() {
		return By.xpath("//input[@name='ShowCriticalPath']/following-sibling::span");
	}

	public static final By redColourBordershow() {
		return By.xpath("(//tr[@class=' sch-gantt-task-highlighted  x-grid-row'])[2]");
	}

	public static final By redColourShowAfteroftheShowcriticalPath() {
		return By.xpath("//div[@class='task-body-parent-custom projectgantt']");
	}

	public static final By clickOnCollapseAllActivity() {
		return By.xpath("//li[contains(text(),'Collapse All')]");
	}

	public static final By clickOnExpandAllActivity() {
		return By.xpath("//li[contains(text(),'Expand All')]");
	}

	public static final By clickOnToday() {
		return By.xpath("//li[contains(text(),'Today')]");
	}

	public static final By showActivitieshundredPercentDone() {
		return By.xpath("//li[contains(text(),'Show Activities 100% Done')]");
	}

	public static final By hidecards() {
		return By.xpath("//li[contains(text(),'Hide Cards')]");
	}

	public static final By clickOnPreferences() {
		return By.xpath("//li[contains(text(),'Preferences')]");
	}

	public static final By clickOnActivityhistory() {
		return By.xpath("//li[contains(text(),'Activity History')]");
	}

	public static final By clickOnCopyUrl() {
		return By.xpath("//li[contains(text(),'Copy URL')]");
	}

	public static final By doubleClickOnSecodActivity() {
		return By.xpath("(//div[@class='x-grid-item-container'])[2]//table[3]//div[@class='task-body-parent-custom projectgantt']");
	}

	public static final By doubleClickOnActivityAbove() {
		return By.xpath("(//div[@class='x-grid-item-container']//table[2]//div[@class='task-body-parent-custom projectgantt'])[1]");
	}

	public static final By clickOnharveyBallHundredPercentDone() {
		return By.xpath("//div[@id='launchmenu']//div[@class='x-component x-box-item x-component-default']//div[5]");

	}

}
