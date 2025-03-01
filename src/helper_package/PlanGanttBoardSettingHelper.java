package helper_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import common_package.CommonMethodsOfWebDriver;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;
import pom_package.PlanGanttBoardSettingLocator;

public class PlanGanttBoardSettingHelper extends CommonMethodsOfWebDriver {

	public static String createFolderNameRandomly, createProjectNameRandomly, ActivityStartDateWhileCreating,
			getIframeWindowNameAttributeValue, handlevaluefokanbanBoardwindow, kanbanBoardwindowhandless;
	public static int sizeofSchedulemodeonactivity, sizeOfElementOnPG;
	public static int initialDividerBarPosition;
	public static String getIframeSRCAttribute, childIframevalue, textAreaIDAttribute,
			classAttributeValueOfQuickActionSideColumn;

	public void Create_SingleActivity() {

		try {
			Thread.sleep(8000);
		} catch (InterruptedException ie) {
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

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
		System.out.println("folder name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg class:: "+ createFolderNameRandomly);

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterFolderName()).sendKeys("A " + createFolderNameRandomly);
		explicitWaitElementToBeClickable(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddButton()));
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

		explicitWaitElementToBeClickable(findElement(PlanGanttBoardSettingLocator.clickOnThreeDot()));
		findElement(PlanGanttBoardSettingLocator.clickOnThreeDot()).click();

		createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg ::"+ createProjectNameRandomly);

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

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitVisibilityOf(findElement(PlanGanttBoardSettingLocator.clickOnCreatedProject()));
		findElement(PlanGanttBoardSettingLocator.clickOnCreatedProject()).click();

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
		driver.findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.AddNewActivityButton())
				.get(sizeOfElementOnPG - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("Activity1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

	public void showCriticalPath() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(PlanGanttBoardSettingLocator.clickOnSettingGearIcon()));
		findElement(PlanGanttBoardSettingLocator.clickOnSettingGearIcon()).click();

		// Click to Show Critical Path
		explicitWaitVisibilityOf(findElement(PlanGanttBoardSettingLocator.clickOnShowCriticalpath()));
		findElement(PlanGanttBoardSettingLocator.clickOnShowCriticalpath()).click();

		// Check if red borders are displayed
		boolean isRedflashBorderShown = findElement(PlanGanttBoardSettingLocator.redColourBordershow()).isDisplayed();
		System.out.println("After clicking 'Show Critical Path', red border is visible: " + isRedflashBorderShown);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(PlanGanttBoardSettingLocator.clickOnSettingGearIcon()));
		findElement(PlanGanttBoardSettingLocator.clickOnSettingGearIcon()).click();

		// again clicking on show critical path and off the toggle
		explicitWaitVisibilityOf(findElement(PlanGanttBoardSettingLocator.clickOnShowCriticalpath()));
		findElement(PlanGanttBoardSettingLocator.clickOnShowCriticalpath()).click();

		// Check if red border disappears
		boolean isRedflashBorderRemoved = findElement(
				PlanGanttBoardSettingLocator.redColourShowAfteroftheShowcriticalPath()).isDisplayed();
		System.out.println("After toggling 'Show Critical Path' off, red border removed: " + isRedflashBorderRemoved);

		// check zoom to fit functionality

		try {

			explicitWaitVisibilityOf(findElement(PlanGanttBoardSettingLocator.clickOnSettingGearIcon()));
			findElement(PlanGanttBoardSettingLocator.clickOnSettingGearIcon()).click();

			explicitWaitElementToBeClickable(
					findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.planGanttZoomToFit()));
			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.planGanttZoomToFit()).click();
			System.out.println("Zoom to fit operation perform successfully ");

		} catch (Exception e) {
			System.err.println("Error while performing Zoom to Fit: " + e.getMessage());
		}

	}

}
