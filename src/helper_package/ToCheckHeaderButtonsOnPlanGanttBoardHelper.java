package helper_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.ToCheckHeaderButtonsOnPlanGanttBoardLocator;

public class ToCheckHeaderButtonsOnPlanGanttBoardHelper extends CommonMethodsOfWebDriver {

	public static String createFolderNameRandomly, createProjectNameRandomly, ActivityStartDateWhileCreating,
			getIframeWindowNameAttributeValue, handlevaluefokanbanBoardwindow, kanbanBoardwindowhandless;

	public void singleMilestone() {

		try {
			Thread.sleep(5000);
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

		explicitWaitElementToBeClickable(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnThreeDot()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnThreeDot()).click();

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

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCreatedProject()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCreatedProject()).click();

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

	// advanced filter feature
	public void advancefilterOnPlantGantt() throws InterruptedException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated", ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnfilterIcon());
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnfilterIcon()).click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeVisibleAllListItems(
				findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()));
		int advanceFilterSize = findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).size();
		System.out.println("filter button size :" + advanceFilterSize);

		// click on activity,milestone owner from dropdown

		findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).get(advanceFilterSize - 6)
				.click();
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnOwnerCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnOwnerCheckbox()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnOwnerCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnOwnerCheckbox()).click();

		// now clicking on Category dropdown

		findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).get(advanceFilterSize - 5)
				.click();
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCategoryCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCategoryCheckbox()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCategoryCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCategoryCheckbox()).click();

		// now clicking on By sticker dropdown

		findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).get(advanceFilterSize - 4)
				.click();
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnStickersCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnStickersCheckbox()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnStickersCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnStickersCheckbox()).click();

		// now clicking on By priority Dropdown

		findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).get(advanceFilterSize - 3)
				.click();
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnMediumCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnMediumCheckbox()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnMediumCheckbox()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnMediumCheckbox()).click();

		// now clicking on By linked card Dropdown
		// here checkbox available only when activity to link with kanaban card
		findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).get(advanceFilterSize - 2)
				.click();

		// now clicking on percentage complete dropdown and perform Slider movement
		// action left and right

		findElements(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterDropDownList()).get(advanceFilterSize - 1)
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// locate the left slider
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.rangeSliderleft()));
		WebElement leftSlider = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.rangeSliderleft());
		System.out.println("\nlocation of left slider :" + leftSlider.getLocation());

		// Get initial X-coordinate
		int initialX = leftSlider.getLocation().getX();
		System.out.println("Initial X-coordinate of left slider: " + initialX);

		// Move left slider 100px right
		actions.dragAndDropBy(leftSlider, 100, 0).build().perform();

		// Get final X-coordinate
		int finalX = leftSlider.getLocation().getX();
		System.out.println("Final X-coordinate of left slider: " + finalX);

		// Verify the movement is exactly 100px
		if (finalX - initialX == 100) {
			System.out.println("Left slider moved exactly 100px right - Test Passed ✅");
		} else {
			System.out.println("Left slider did not move correctly! Moved:- Test Failed ❌"
					+ "****************************************************************************************************************************************************************************************");
		}

		// Locate right slider once
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.rangeSliderRight()));
		WebElement rightSlider = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.rangeSliderRight());
		System.out.println("\nlocation of right slider :" + rightSlider.getLocation());

		// Get initial X-coordinate
		int initialXRight = rightSlider.getLocation().getX();
		System.out.println("Initial X-coordinate of right slider: " + initialXRight);

		// Move right slider 50px left
		actions.dragAndDropBy(rightSlider, -50, 0).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// Get final X-coordinate
		int finalXRight = rightSlider.getLocation().getX();
		System.out.println("Final X-coordinate of right slider: " + finalXRight);

		// Verify the movement is exactly -50px
		if (initialXRight - finalXRight == 50) {
			System.out.println("Right slider moved exactly 50px left - Test Passed ✅");
		} else {
			System.out.println("Right slider did not move correctly! Moved: -Test Failed ❌");
		}

		// Again Move left slider back 100px left And Move right slider back 50px right
		actions.dragAndDropBy(leftSlider, -100, 0).build().perform();

		actions.dragAndDropBy(rightSlider, 50, 0).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// click on all downward arrow And clicking on check all checkbooks

		// Locate all dropdown elements
		List<WebElement> dropdownelement = driver
				.findElements(By.xpath("//div[contains(@class,'filterPanelAccordionPanelChildCls ')]"));
		System.out.println("\nFilter button size: " + dropdownelement.size());

		// Iterate through each dropdown and click on the "Check All" checkboxes

		for (WebElement dropdown : dropdownelement) {
			dropdown.click();

			// Wait for the "Check All" checkboxes to be visible
			Thread.sleep(1000);

			List<WebElement> checkAllElements = dropdown
					.findElements(By.xpath(".//div[contains(@id,'checkboxfield-')]//label//span[text()='Check All:']"));

			// Locate and click the "Check All" elements within the expanded dropdown
			for (WebElement checkAllElement : checkAllElements) {
				checkAllElement.click();
			}

			Thread.sleep(1000);
		}

		// wait and clicking on filter save button

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterSaveButton()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterSaveButton()).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// Wait for the "Apply Filter" to appear
		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.applyFilterclass()));
		WebElement applyFilter = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.applyFilterclass());

		// Verify if the green "Apply Filter" button is displayed
		boolean greenFilterDisplayed = applyFilter.isDisplayed();
		System.out
				.println("After clicking the filter save button, is the apply filter green? : " + greenFilterDisplayed);

		if (greenFilterDisplayed) {
			// Wait for and click the "Clear Filter" button
			WebElement clearFilterButton = findElement(
					ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnClearfilterBtn());
			explicitWaitVisibilityOf(clearFilterButton);
			clearFilterButton.click();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.closefilterPanelButton()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.closefilterPanelButton()).click();
		System.out.println(
				"***************************************************************************************************************************************");

	}

	public void checkUndoButtonFunctionality() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// Perform the Undo Operation On Activity Name
		// Locate the element to interact with

		WebElement elementToModify = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.activityName());

		String elementText = elementToModify.getText(); // Fetch the text content of the element
		System.out.println("Activity Name befor Undo: " + elementText);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickOnThreeDotOnActivityActivityAbove());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickOnThreeDotOnActivityActivityAbove()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",
				ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnActivitityAboveEditinformationforUndo());
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnActivitityAboveEditinformationforUndo()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.titleofActivity()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.titleofActivity()).clear();
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.titleofActivity()).sendKeys("Aplite");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton)

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// Verify the state after the action

		WebElement elementToModify2 = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.activityName());

		String modifiedText = elementToModify2.getText(); // Fetch the text content of the element
		System.out.println("after modify activity name:  " + modifiedText);
		if ("ActivityAbove".equals(modifiedText)) {
			System.out.println("Test failed: Text not entered correctly.");
			return;
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnUndoButton()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnUndoButton()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnYesOnUndo()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnYesOnUndo()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// Verify the state after the undo action

		WebElement elementToModify3 = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.activityName());

		String undoText = elementToModify3.getText();
		System.out.println("activity Name after click On Undo:" + undoText);

		if (!"ActivityAbove".equals(undoText)) {
			System.out.println("Test failed: Undo action did not revert the text.");
		} else {
			System.out.println("Test passed: Undo action successfully reverted the text.");
		}

	}

	// Performed Operation on Timespan functionality

	public void checkTimespanFunctionality() {

		/*
		 * // Wait for and capture the initial position of the time indicator
		 * explicitWaitVisibilityOf(findElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.todayLineCurrentTimeIndicator()))
		 * ; WebElement timeIndicator =
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.
		 * todayLineCurrentTimeIndicator());
		 * System.out.println("\nInitial location of time indicator: " +
		 * timeIndicator.getLocation());
		 * 
		 * 
		 * // Get initial X and Y coordinates of the time indicator int
		 * initialcurrentTimeLocation = timeIndicator.getLocation().getX();
		 * System.out.println(initialcurrentTimeLocation);
		 * 
		 * // before click on previous timespan arrow click on zoom to fit
		 * 
		 * try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * 
		 * // Wait for and click the next timespan button
		 * explicitWaitVisibilityOf(findElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnNextTimespan()));
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnNextTimespan()
		 * ).click();
		 * 
		 * 
		 * // Get initial X and Y coordinates of the time indicator int
		 * AfterCurrentTimeLOcation = timeIndicator.getLocation().getX();
		 * System.out.println(AfterCurrentTimeLOcation);
		 * 
		 */

		// checking Next TimeSpan functionality

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnNextTimespan()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnNextTimespan()).click();
		System.out.println("\nAfter Clicking on NextTimespan Data is Shifting to next TimeSpan");

		// checking Previous TimeSpan functionality

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnPreviousTimeSpan()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnPreviousTimeSpan()).click();
		System.out.println("After Clicking on Previous TimeSpan Data is Shifting to previous TimeSpan");

	}

	public void createMultipleBaselines() {

		/*
		 * //list of elements present on baseline window
		 * explicitWaitVisibilityOf(findElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.
		 * clickOnBaselineDropdown()).click();
		 * 
		 * // Wait for the Baseline History element to be visible and store it
		 * WebElement listOfElementsOnBaselineWindow =
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.
		 * listOfElementsOnBaselineWindow());
		 * explicitWaitVisibilityOf(listOfElementsOnBaselineWindow);
		 * 
		 * // Check if the element is displayed boolean isBaselineHistoryDisplayed =
		 * listOfElementsOnBaselineWindow.isDisplayed();
		 * 
		 * if (isBaselineHistoryDisplayed) { // Get the text of the Baseline History
		 * element String textElements = listOfElementsOnBaselineWindow.getText();
		 * System.out.println("listOfElementsOnBaselineWindow Text: " + textElements); }
		 * 
		 * 
		 * 
		 * // Create multiple baselines using a loop String[] baselineNames =
		 * {"Baseline1", "Baseline2", "Baseline3"};
		 * 
		 * for (String baselineName : baselineNames) {
		 * 
		 * // Wait for and click the "Create Baseline" button try
		 * {Thread.sleep(2000);}catch(InterruptedException ie) {} //
		 * explicitWaitVisibilityOf(findElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCreateBaseline())); //
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCreateBaseline
		 * ()).click();
		 * 
		 * 
		 * handleElementClickInterceptedExpectionWhileClickOnElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCreateBaseline());
		 * actions.moveToElement(listOfElementsOnBaselineWindow) // Enter the baseline
		 * name explicitWaitVisibilityOf(findElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.enterBaselineName()));
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.enterBaselineName()).
		 * sendKeys(baselineName);
		 * 
		 * // Click on "Add Baseline" button explicitWaitVisibilityOf(findElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline()));
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline())
		 * .click();
		 * 
		 * // Wait for the UI to update after adding the baseline try
		 * {Thread.sleep(1000);}catch(InterruptedException ie) {}
		 * explicitWaitVisibilityOf(findElement(
		 * ToCheckHeaderButtonsOnPlanGanttBoardLocator.DottedBaselineBorder()));
		 * 
		 * System.out.println("Baseline '" + baselineName + "' created successfully.");
		 * }
		 * 
		 * // Verify if the baselines are displayed boolean baselineDisplayed =
		 * findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.DottedBaselineBorder(
		 * )).isDisplayed(); System.out.
		 * println("Baseline is displayed after set on activity or milestone: " +
		 * baselineDisplayed);
		 * 
		 */

		// Create Baseline 1

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

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		boolean baseline = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.DottedBaselineBorder())
				.isDisplayed();
		System.out.println("Baseline is displayed after set on activity or milestone : " + baseline);

		// create baseline 2

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
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.enterBaselineName()).sendKeys("Baseline2");

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// create baseline3

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
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.enterBaselineName()).sendKeys("Baseline3");

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnAddBaseline()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

	public void showAndHideBaseline() {

		// hide baseline

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnhideBaseline()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnhideBaseline()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		boolean baselineafterhide = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.DottedBaselineBorder())
				.isDisplayed();
		System.out.println("Basline is invisible after click on hide baseline : " + baselineafterhide);

		// again show baseline

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowBaseline()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowBaseline()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		boolean baseline1 = findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.DottedBaselineBorder())
				.isDisplayed();
		System.out.println(
				"Again Baseline is displayed after click On ShowBaseline on activity or milestone : " + baseline1);

	}

	public void showBaselineHistory() {

		// clicking on baseline history

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseLineHistory()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseLineHistory()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}
		// Wait for the Baseline History Launch Menu to be visible and store it

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.baselineHistoryLaunchMenu()));
		WebElement createdbaselineHistoryMenu = findElement(
				ToCheckHeaderButtonsOnPlanGanttBoardLocator.baselineHistoryLaunchMenu());

		// Check if the menu is displayed

		boolean launchMenuDisplayed = createdbaselineHistoryMenu.isDisplayed();
		System.out.println("Baseline history launch menu is displayed: " + launchMenuDisplayed);

		if (launchMenuDisplayed) {
			// Get the text of the Baseline History menu

			String getBaselineHistory = createdbaselineHistoryMenu.getText();
			System.out.println("Set baseline is created on date:\n" + getBaselineHistory);
		}

		explicitWaitElementBy("elementToBeLocated", By.xpath("//body"));
		findElement(By.xpath("//body")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

	}

	public void checkFilterBaselinefunctionality() {

		// filter baseline1
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseLineHistory()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseLineHistory()).click();

		// filter and click on baseline1
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterByTitle()).sendKeys("Baseline1");

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBasline1()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBasline1()).click();
		System.out.println("Baseline1 filterd and Successfully selected  from baseline history.");

		// filter baseline2

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseLineHistory()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseLineHistory()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.filterByTitle()).sendKeys("Baseline2");

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseline2()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaseline2()).click();
		System.out.println("Baseline2 filterd and Successfully selected  from baseline history.");

		// hide baseline
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnBaselineDropdown()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnhideBaseline()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnhideBaseline()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

	}

	public void clickOnShowTab() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		String OriginalWindow = driver.getWindowHandle();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowDownArrow()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowDownArrow()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCapacityPlanning()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnCapacityPlanning()).click();
		System.out.println("Capacity Planning Tab Opened Successfully");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().window(OriginalWindow);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().frame(0);

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowDownArrow()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowDownArrow()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnResourceUtilization()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnResourceUtilization()).click();

		System.out.println("Resource Utilization Tab Opened Successfully");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().window(OriginalWindow);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().frame(0);

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowDownArrow()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnShowDownArrow()).click();

		explicitWaitVisibilityOf(findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnResourceSchedule()));
		findElement(ToCheckHeaderButtonsOnPlanGanttBoardLocator.clickOnResourceSchedule()).click();

		System.out.println("Resource Schedule Tab Opened Successfully"
				+ "\n*********************************************************************************************************************************************************************");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().window(OriginalWindow);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		driver.switchTo().frame(0);

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

	}

}
