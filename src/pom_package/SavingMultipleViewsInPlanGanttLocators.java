package pom_package;

import org.openqa.selenium.By;

import helper_package.SavingMultipleViewsInPlanGanttHelper;

public class SavingMultipleViewsInPlanGanttLocators {

	public static final By clickOnThreeDot() {
		return By.xpath("//div[text()='A " + SavingMultipleViewsInPlanGanttHelper.createFolderNameRandomly
				+ "']/following-sibling::div[@class='lmenu']");
	}

	public static final By clickOnCreatedProject() {
		return By.xpath(
				"//*[contains(text(),'" + SavingMultipleViewsInPlanGanttHelper.createProjectNameRandomly + "')]");
	}

	public static final By viewButton() {
		return By.xpath("//div[@class='x-box-inner']//a[@id='viewBtn']");

		// return By.xpath("//div[contains(@class,'x-panel-header x-header
		// x-header-noborder') and @id='panel-1020_header']/div/div/a[1]");
	}

	public static final By verifyHistory() {
		return By.xpath("//div[text()='No History Available']");

		// return By.xpath("//div[@id='launchmenu-body']//div[text()='No History
		// Available' or contains(text(),'Default')]"); // here we take two xpaths
	}

	public static final By saveIconButton() {
		return By.xpath(
				"//div[contains(@class,'x-panel-header x-header x-header-noborder') and @id='panel-1020_header']/div/div/a[2]");
	}

	public static final By saveIConButtonColour() {
		return By.xpath(
				"//div[contains(@class,'x-panel-header x-header x-header-noborder') and @id='panel-1020_header']/div/div/a[2]//span[contains(@id,'btnIconEl')]");
	}

	public static final By showAndHideSchedule() {
		return By.xpath(
				"//div[contains(@class,'x-panel-header x-header x-header-noborder') and @id='panel-1020_header']/div/div/a[3]");
	}

	public static final By searchFilterByTitleButton() {
		return By.xpath("//input[@placeholder='Filter by title...']");
	}

	public static final By clickOnCreateViewButton() {
		return By.xpath("//span[text()='Create View']");
	}

	public static final By enterTitleforview() {
		return By.xpath("//input[@placeholder='Enter a Title']");
	}

	public static final By clickOnAddButton() {
		return By.xpath("//a[contains(@class,'setBaselineButtonCls ')]//span[text()='Add']");
	}

	public static final By loadmaskLoader() {
		return By.xpath("//div[contains(@id,'loadmask-')]//div[text()='Please Wait...']");
	}

	public static final By dividerBar() {
		return By.xpath("//div[@role='separator']");
	}

	public static final By filterTitle() {
		return By.xpath("//input[@placeholder='Filter by title...']");
	}

	public static final By selectDefaultView() {
		return By.xpath("//div[@id='launchmenu']//div[contains(text(),'Default')]");
	}

	public static final By selectView3WithBaseline() {
		return By.xpath("//div[@id='launchmenu']//div[contains(text(),'View3WithBaseline')]");
	}

}
