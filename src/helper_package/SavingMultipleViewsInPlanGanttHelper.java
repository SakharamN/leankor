package helper_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddNewColumsOnPGLocater;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.SavingMultipleViewsInPlanGanttLocators;
import pom_package.ToCheckHeaderButtonsOnPlanGanttBoardLocator;

public class SavingMultipleViewsInPlanGanttHelper extends CommonMethodsOfWebDriver {

	public static String createFolderNameRandomly, createProjectNameRandomly, ActivityStartDateWhileCreating,
			getIframeWindowNameAttributeValue, handlevaluefokanbanBoardwindow, kanbanBoardwindowhandless;
	public static String classAttributeValueofSaveCurrentIConButton, classAttributeValueofSaveCurrentIConButton1;

	public static int initialDividerBarPosition;

	public void singleMilestone() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie)

		{
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String newTabTitle = driver.getTitle();
		System.out.println("New title of the tab is: " + newTabTitle);

		wait.until(ExpectedConditions.titleIs("Leankor | Salesforce"));

		try {
			Thread.sleep(8000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()).click();

		createFolderNameRandomly = generateRandomString(6);
		System.out.println(
				"folder name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg class:: "
						+ createFolderNameRandomly);

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterFolderName())
				.sendKeys("A " + createFolderNameRandomly);
		explicitWaitElementToBeClickable(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		scrollinToView(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));
		explicitWaitVisibilityOf(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));
		jsExecutorClickOnElement(findElement(By.xpath("//*[text()='A " + createFolderNameRandomly + "']")));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnThreeDot()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnThreeDot()).click();

		createProjectNameRandomly = generateRandomString(5);
		System.out.println(
				"Project name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg ::"
						+ createProjectNameRandomly);

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName())
				.sendKeys(createProjectNameRandomly);

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreatedProject()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreatedProject()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ie) {
		}
		int sizeOfElementOnPG = driver
				.findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.AddNewActivityButton())
				.size();
		System.out.println("Number of elements of sizeof elements :" + sizeOfElementOnPG);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.AddNewActivityButton())
				.get(sizeOfElementOnPG - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("ActivityAbove");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		explicitWaitElementBy("invisibilityOfElementLocated",
				ToCheckHeaderButtonsOnPlanGanttBoardLocator.loaderofSavingActivity());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

	// when run the suite keep saveDefaultView Comment out bcoz Current View already
	// save while performing the filter save button functionality

	public void saveDefaultView() {

		// verify view eye icon Button

		WebElement eyeIcon = findElement(SavingMultipleViewsInPlanGanttLocators.viewButton());

		if (eyeIcon.isDisplayed()) {

			System.out.println("viewIcon button is available");
		} else {
			System.out.println("viewIcon button is not available");
		}

		// verify Save Current view Icon icon Button

		WebElement saveCurrentViewIcon = findElement(SavingMultipleViewsInPlanGanttLocators.saveIconButton());

		if (saveCurrentViewIcon.isDisplayed()) {

			System.out.println("The Save Current View icon is located directly next to the View Icon");
		} else {
			System.out.println("saveIcon button is not available");
		}

		// verify schedule icon Button

		WebElement scheduleButton = findElement(SavingMultipleViewsInPlanGanttLocators.showAndHideSchedule());

		if (scheduleButton.isDisplayed()) {

			System.out.println("scheduleButton button is available");
		} else {
			System.out.println("scheduleButton button is not available");
		}

		// verify history

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// when we run the suite then view history option not available bcoz Board view
		// already saved when check Advanced filter Save button functionality

		// boolean viewhistory =
		// findElement(SavingMultipleViewsInPlanGanttLocators.verifyHistory()).isDisplayed();

		// System.out.println("In a newly created board, the dropdown shows No History
		// Available :"+viewhistory);

		explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		findElement(By.xpath("//body")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		// Check Condition for Save current view Icon button is enabled or disabled

		explicitWaitElementBy("elementToBeLocated", SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour());
		classAttributeValueofSaveCurrentIConButton = findElement(
				SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour()).getDomAttribute("class");
		System.out.println("Class Attribute value of Save current view Icon Button :"
				+ classAttributeValueofSaveCurrentIConButton);

		if (!classAttributeValueofSaveCurrentIConButton.equals("enabled")) {
			System.out.println(
					"The icon appears gray when there are no changes to save or when all changes have already been saved. :");

		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		initialDividerBarPosition = findElement(AddNewColumsOnPGLocater.dividerBar()).getLocation().getX();
		System.out.println("Initial Slider position :" + initialDividerBarPosition);

		int maxSliderPosition = 200;

		// explicitWaitElementBy("elementToBeLocated",
		// AddNewColumsOnPGLocater.dividerBar());

		actions.dragAndDropBy(findElement(AddNewColumsOnPGLocater.dividerBar()), maxSliderPosition, 0).build()
				.perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// We moved the divider bar position in right side and see save current view
		// button is enabled

		explicitWaitElementBy("elementToBeLocated", SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour());
		classAttributeValueofSaveCurrentIConButton1 = findElement(
				SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour()).getDomAttribute("class");
		System.out.println("Class Attribute value of Save current view Icon Button :"
				+ classAttributeValueofSaveCurrentIConButton1);

		if (classAttributeValueofSaveCurrentIConButton1.contains("enabled")) {
			System.out.println(
					"The icon turns orange when changes are detected on the board, indicating that the user needs to save the current view. :");

		}

		// Wait for the visibility of the save button and click it

		WebElement saveCurrentViewIconButton = findElement(SavingMultipleViewsInPlanGanttLocators.saveIconButton());
		explicitWaitVisibilityOf(saveCurrentViewIconButton);
		saveCurrentViewIconButton.click();

		System.out.println("After click on Save Current View Icon Button then current view saved with Default view :");

	}

	public void createView1WithAddColumn() {

		// create View1 With Add % Column

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreateViewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreateViewButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.enterTitleforview()));
		findElement(SavingMultipleViewsInPlanGanttLocators.enterTitleforview()).sendKeys("View1WithAddColumn");

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnAddButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnAddButton()).click();

		System.out.println("Board is successfully saved with View1WithAddColumn ");

		// add the column on View1WithAddColumn

		try {
			Thread.sleep(6000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
		System.out.println("Add New Column size is :" + addNewColumnSize);

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		System.out.println("Total Number of popup elements are :" + allPopUpElements);

		for (WebElement popUpElement : allPopUpElements) {
			String columnNames = popUpElement.getText();

			if (columnNames.equals("% Done")) {

				popUpElement.click();

			}
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// Wait for the visibility of the save button and click it

		WebElement saveCurrentViewIconButton1 = findElement(SavingMultipleViewsInPlanGanttLocators.saveIconButton());
		explicitWaitVisibilityOf(saveCurrentViewIconButton1);
		saveCurrentViewIconButton1.click();

		System.out.println("We saved the View1WithAddColumn board with % done column");

		// explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		// findElement(By.xpath("//body")).click();

	}

	public void createView2Withfilter() {

		// Check View functionality with filter

		explicitWaitElementBy("elementToBeLocated", ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnfilterIcon());
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnfilterIcon()).click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeVisibleAllListItems(
				findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()));
		int filterButtonSize = findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).size();
		System.out.println("\nfilter button size :" + filterButtonSize);

		// click on activity,milestone owner from dropdown

		findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).get(filterButtonSize - 6)
				.click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnOwnerCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnOwnerCheckbox()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// After setting the filter, click on the Save Filter button.

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterSaveButton()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterSaveButton()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.closefilterPanelButton()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.closefilterPanelButton()).click();

		// After close the Advance Filter window Save the current board

		WebElement saveCurrentViewIconButton1 = findElement(SavingMultipleViewsInPlanGanttLocators.saveIconButton());
		explicitWaitVisibilityOf(saveCurrentViewIconButton1);
		saveCurrentViewIconButton1.click();

		// After applying the Advanced filter save the current view and Create a new
		// view by providing a unique name create View2Withfilter

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreateViewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreateViewButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.enterTitleforview()));
		findElement(SavingMultipleViewsInPlanGanttLocators.enterTitleforview()).sendKeys("createView2Withfilter");

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnAddButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnAddButton()).click();

		System.out.println("Board createView2Withfilter Is Successfully saved with view functionality of filter ");

	}

	// Baseline Functionality in View Management

	public void createView3WithBaseline() {

		// Create Baseline On activity

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCreateBaseline()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCreateBaseline()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.enterBaselineName()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.enterBaselineName()).sendKeys("Baseline1");

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		boolean baseline = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.DottedBaselineBorder())
				.isDisplayed();
		System.out.println("\nBaseline is displayed after set on activity or milestone : " + baseline);

		// After Applied the Baseline along with the current view configuaration Click
		// On Save Current View.

		WebElement saveCurrentViewIconButton1 = findElement(SavingMultipleViewsInPlanGanttLocators.saveIconButton());
		explicitWaitVisibilityOf(saveCurrentViewIconButton1);
		saveCurrentViewIconButton1.click();

		// Create a new view by providing a unique name View3WithBaseline with the
		// baseline, which is then saved as part of that view.

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreateViewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnCreateViewButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.enterTitleforview()));
		findElement(SavingMultipleViewsInPlanGanttLocators.enterTitleforview()).sendKeys("View3WithBaseline");

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.clickOnAddButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.clickOnAddButton()).click();

		System.out.println(
				"Board View3WithBaseline Is Successfully saved with Baseline Functionality in View Management");

		// Viewing Baselines in Saved Views:

	}

	public void filterBoardByTitle() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// Here we search the default View and opend that view

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.filterTitle()));
		findElement(SavingMultipleViewsInPlanGanttLocators.filterTitle()).sendKeys("default");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.selectDefaultView()));
		findElement(SavingMultipleViewsInPlanGanttLocators.selectDefaultView()).click();

		System.out.println("\nAfter filter board By title default view from View History and Opend Default View ");

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// Again Search the View3WithBaseline Board And check Baseline view

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()));
		findElement(SavingMultipleViewsInPlanGanttLocators.viewButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.filterTitle()));
		findElement(SavingMultipleViewsInPlanGanttLocators.filterTitle()).sendKeys("Baseline");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// after filter the view board click on filtered board View3 With Baseline
		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.selectView3WithBaseline()));
		findElement(SavingMultipleViewsInPlanGanttLocators.selectView3WithBaseline()).click();

		System.out.println(
				"When a user selects a view that includes a baseline from the View History, the associated baseline will be visible."
						+ "\n**************************************************************************************************************************************************************");

		explicitWaitElementBy("invisibilityOfElementLocated", SavingMultipleViewsInPlanGanttLocators.loadmaskLoader());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

	}

	public void hideAndShowScheduleICon() {

		// verify schedule icon Button

		WebElement scheduleButton = findElement(SavingMultipleViewsInPlanGanttLocators.showAndHideSchedule());

		if (scheduleButton.isDisplayed()) {

			System.out.println(
					"scheduleButton button is located next to the Save Current View Icon In the header section");
		} else {
			System.out.println("scheduleButton button is not available");
		}

		// Click on the Hide Schedule button to hide the timeline or right grid.

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.showAndHideSchedule()));
		WebElement showHideButton = findElement(SavingMultipleViewsInPlanGanttLocators.showAndHideSchedule());
		explicitWaitVisibilityOf(showHideButton);
		showHideButton.click();

		// Verify After clicking the hide schedule The Save Current View button becomes
		// active And The button color changes from gray to orange, indicating the
		// timeline is hidden.

		explicitWaitElementBy("elementToBeLocated", SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour());
		classAttributeValueofSaveCurrentIConButton1 = findElement(
				SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour()).getDomAttribute("class");
		System.out.println("Class Attribute value of Save current view Icon Button :"
				+ classAttributeValueofSaveCurrentIConButton1);

		if (classAttributeValueofSaveCurrentIConButton1.contains("enabled")) {
			System.out.println(
					"The icon turns orange when changes are detected on the board, indicating the timeline or right grid is hidden :");

		}

		// Now again Click on the Show Schedule button to re-enable the timeline view.

		explicitWaitVisibilityOf(findElement(SavingMultipleViewsInPlanGanttLocators.showAndHideSchedule()));
		WebElement showSchedule = findElement(SavingMultipleViewsInPlanGanttLocators.showAndHideSchedule());
		explicitWaitVisibilityOf(showSchedule);
		showSchedule.click();

		// After enabling this option, The Save Current View button becomes active again
		// to save the updated view.

		explicitWaitElementBy("elementToBeLocated", SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour());
		classAttributeValueofSaveCurrentIConButton1 = findElement(
				SavingMultipleViewsInPlanGanttLocators.saveIConButtonColour()).getDomAttribute("class");
		System.out.println("Class Attribute value of Save current view Icon Button :"
				+ classAttributeValueofSaveCurrentIConButton1);

		if (classAttributeValueofSaveCurrentIConButton1.contains("enabled")) {
			System.out.println(
					" After enabling this show schedule option, The Save Current View button becomes active again to save the updated view and timeline or right grid is re-enabled now.");

		}

	}

}
