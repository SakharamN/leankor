package helper_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.AddNewColumsOnPGLocater;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;

public class AddNewColumsOnPGHelper extends CommonMethodsOfWebDriver {

	public static String createFolderNameRandomly, createProjectNameRandomly, ActivityStartDateWhileCreating,
			getIframeWindowNameAttributeValue, handlevaluefokanbanBoardwindow, kanbanBoardwindowhandless;
	public static int sizeofSchedulemodeonactivity, sizeOfElementOnPG;
	public static int initialDividerBarPosition;

	public void Create_SingleActivity() {

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String newTabTitle = driver.getTitle();
		System.out.println("New title of the tab is: " + newTabTitle);
		// wait.until(ExpectedConditions.titleIs(newTabTitle));

		wait.until(ExpectedConditions.titleIs("Leankor | Salesforce"));

		try {
			Thread.sleep(8000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()).click();

		// wait.until(ExpectedConditions.presenceOfElementLocated(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()));

		// try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		// findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()).click();

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

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.clickOnThreeDots()));
		findElement(AddNewColumsOnPGLocater.clickOnThreeDots()).click();

		createProjectNameRandomly = generateRandomString(5);
		System.out.println("Project name with random method in CreatingSingleActicityAndAutomateEditInformationfieldOnPg ::"+ createProjectNameRandomly);

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddProject()).click();

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterProjectName()).sendKeys(createProjectNameRandomly);

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProjectAddButton()).click();

		// try {Thread.sleep(4000);}catch(InterruptedException ie) {}

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitVisibilityOf(findElement(AddNewColumsOnPGLocater.clickOnCreatedProject()));
		findElement(AddNewColumsOnPGLocater.clickOnCreatedProject()).click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.Customloadspinner()));

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()));
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitElementBy("invisibilityOfElementLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()));
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

	}

	public void addPercentageDoneColumn() {

		// Wait for the Plus Icon to be visible and click it
		try {
			Thread.sleep(6000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		// After click on the plus Icon Button We capture the all popUp elements ara
		// available
		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();
		// System.out.println("Add New Column size is :"+addNewColumnSize);

		// clicking on the Add new Column button
		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		// Find all the popup elements that represent the column options
		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());
		// System.out.println("All list of columns available on popup is
		// :"+allPopUpElements);

		// Loop through all popup elements and click the "% Done" column

		for (WebElement popUpElement : allPopUpElements) {
			String columnNames = popUpElement.getText();

			if (columnNames.equals("% Done")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("% Done column clicked successfully.");

				popUpElement.click();

				break; // Exit the loop once the column is found
			}
		}

		// following code for splitter bar
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		initialDividerBarPosition = findElement(AddNewColumsOnPGLocater.dividerBar()).getLocation().getX();
		System.out.println("Initial Slider position :" + initialDividerBarPosition);

		int maxSliderPosition = 1120;

		// explicitWaitElementBy("elementToBeLocated",
		// AddNewColumsOnPGLocater.dividerBar());

		actions.dragAndDropBy(findElement(AddNewColumsOnPGLocater.dividerBar()), maxSliderPosition, 0).build()
				.perform();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

	public void addAssignedResourceColumn() {

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {
			String columnNames = popUpElement.getText();

			if (columnNames.equals("Assigned Resources")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Assigned Resources column clicked successfully.");

				popUpElement.click();

				break; // Exit the loop once the column is found
			}
		}
	}

	public void addCategoryColumn()

	{

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Category")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Category column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addDescriptionColumn() {

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {
			String columnNames = popUpElement.getText();

			if (columnNames.equals("Description")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Description column clicked successfully.");

				popUpElement.click();

				break;
			}

		}

	}

	public void addDiscussColumn() {

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Discuss")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Discuss column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addElapsedTimeColumn() {
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Elapsed Time")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Elapsed Time column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addFilesColumn() {
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Files")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Files column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addOnHoldColumn() {

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("On Hold")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("On Hold column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addPredecessorColumn() {

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Predecessors")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Predecessors column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addPriorityColumn() {

		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Priority")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Priority column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addRiskColumn() {
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Risk")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Risk column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addSequenceColumn() {
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Sequence")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Sequence column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addStickersColumn() {
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Stickers")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Stickers column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addSuccessorsColumn() {
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Successors")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Successors column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	public void addTimetoLaunchColumn() {
		explicitWaitElementBy("elementToBeLocated",CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		int addNewColumnSize = findElements(AddNewColumsOnPGLocater.addNewColumn()).size();

		driver.findElements(AddNewColumsOnPGLocater.addNewColumn()).get(addNewColumnSize - 1).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		List<WebElement> allPopUpElements = findElements(AddNewColumsOnPGLocater.addNewColumnsAllPopUpElementsSize());

		for (WebElement popUpElement : allPopUpElements) {

			String columnNames = popUpElement.getText();

			if (columnNames.equals("Time To Launch")) {

				System.out.println("Column Name: " + columnNames);

				System.out.println("Time To Launch column clicked successfully.");

				popUpElement.click();

				break;

			}

		}

	}

	// following code for removing the Added columns

	public void removePercentageDoneColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removePercentageDoneColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removePercentageDoneColumn())).build().perform();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofPercentageDoneColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofPercentageDoneColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

		/*
		 * // After the column is removed, verify that it is no longer present on the UI
		 *
		 * boolean isColumnRemoved = isColumnAbsent("% Done");
		 * 
		 * if (isColumnRemoved) {
		 * System.out.println("% Done column removed successfully."); } else {
		 * System.out.println("Failed to remove % Done column."); }
		 * 
		 * 
		 */

	}

	public void removeAssignedResourceColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeAssignedResourceColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeAssignedResourceColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofAssignedResourceColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofAssignedResourceColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeCategoryColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeCategoryColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeCategoryColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofCategoryColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofCategoryColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeDescriptionColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeDescriptionColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeDescriptionColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofDescriptionColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofDescriptionColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeDiscussColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeDiscussColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeDiscussColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofDiscussColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofDiscussColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeElapsedTimeColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeElapsedTimeColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeElapsedTimeColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofElapsedTimeColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofElapsedTimeColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeFilesColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeFilesColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeFilesColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofFilesColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofFilesColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeOnHoldColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeOnHoldColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeOnHoldColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofOnHoldColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofOnHoldColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removePredecessorColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removePredecessorColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removePredecessorColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofPredecessorColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofPredecessorColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removePriorityColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removePriorityColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removePriorityColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofPriorityColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofPriorityColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeRiskColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeRiskColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeRiskColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofRiskColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofRiskColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeSequenceColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeSequenceColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeSequenceColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofSequenceColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofSequenceColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeStickersColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeStickersColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeStickersColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofStickersColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofStickersColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeSuccessorsColumn() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeSuccessorsColumn());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeSuccessorsColumn())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofSuccessorColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofSuccessorColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

	public void removeTimeToLaunch() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", AddNewColumsOnPGLocater.removeTimeToLaunch());

		actions.moveToElement(findElement(AddNewColumsOnPGLocater.removeTimeToLaunch())).build().perform();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.triggerofTimeToLaunchColumn()));
		findElement(AddNewColumsOnPGLocater.triggerofTimeToLaunchColumn()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementToBeClickable(findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()));
		findElement(AddNewColumsOnPGLocater.ClickOnRemoveColumn()).click();

	}

}
