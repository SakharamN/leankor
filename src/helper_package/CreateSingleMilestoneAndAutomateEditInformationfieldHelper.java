package helper_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateSingleMilestoneAndAutomateEditInformationfieldLocator;
import pom_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator;

public class CreateSingleMilestoneAndAutomateEditInformationfieldHelper extends CommonMethodsOfWebDriver {

	public static String createFolderNameRandomly, createProjectNameRandomly, ActivityStartDateWhileCreating,
			getIframeWindowNameAttributeValue, handlevaluefokanbanBoardwindow, kanbanBoardwindowhandless;
	public static int sizeofSchedulemodeonactivity, sizeOfElementOnPG;

	public void singleMilestone() {

		try {
			Thread.sleep(6000);
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

		explicitWaitElementToBeClickable(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnFolderIcon()).click();

		// wait.until(ExpectedConditions.presenceOfElementLocated(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()));

		// try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		// findElement(ToCheckingHeaderButtonsOnCalendarViewLocator.ClickOnAddButton()).click();

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

		explicitWaitElementToBeClickable(
				findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDot()));
		findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDot()).click();

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

		explicitWaitVisibilityOf(
				findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnCreatedProject()));
		findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnCreatedProject()).click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.Customloadspinner()));

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()));
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

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()));
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlusIcon()).click();

		// explicitWaitElementBy("elementToBeLocated",
		// CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addActivity());
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addActivity()).click();

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
		// findElement(PlanGanttActivityAndKanbanCardLinkToActivityLocator.writeActivityNameInputField()).clear();
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys("milestone1");
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.writeActivityNameInputField())
				.sendKeys(Keys.ENTER);

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadmaskElemenet());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone());
		findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone()).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",
				CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickingOnEditInformation());
		findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickingOnEditInformation()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityCategory()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityCategory()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadSpinnerofAddingActivity());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		boolean elementsOnPopUp = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.elementsOnPopUp()).isDisplayed();

		if (elementsOnPopUp) {

			// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield()));
			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield())
					.sendKeys("cat1");
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectCategory()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectCategory()).click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.SaveActivityButton()));
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.SaveActivityButton()).click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()));
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()).sendKeys("activity1");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()).click();
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield()).clear();
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.descriptionfield())
				.sendKeys("This is milestone description");

		// findElement(By.xpath("//body")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.assignOwner()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.assignOwner()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchActivityfield())
				.sendKeys("sakharam Nilkhan");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.OwnerSearchTrigger()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.OwnerSearchTrigger()).click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectOwner());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectOwner()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPriority()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPriority()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectMediumPriority()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectMediumPriority()).click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.StartDateCalendar()));
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.StartDateCalendar()).click();

		int activityStartDateSize = findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.fetchStartDateOfActivityWhileCreating()).size();
		System.out.println("activityStartDateSize :" + activityStartDateSize);

		String ActivityStartDateWhileCreating = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
						.fetchStartDateOfActivityWhileCreating()).getDomAttribute("value");
		System.out.println("ActivityStartDateWhileCreating :" + ActivityStartDateWhileCreating);

		int activityDueDateSize = findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.fetchStartDateOfActivityWhileCreating()).size();
		System.out.println("activityStartDateSize :" + activityStartDateSize);

		String ActivityDueDateWhileCreating = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
						.fetchStartDateOfActivityWhileCreating()).getDomAttribute("value");
		System.out.println("ActivityStartDateWhileCreating :" + ActivityStartDateWhileCreating);

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo())
				.clear();
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo())
				.sendKeys("2");

		// String getDurationField =
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.durationfieldforActivityInfo()).getDomAttribute("value");
		// System.out.println("duration field of activity :"+getDurationField);

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.deleteCardButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.deleteCardButton()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.alertPopforDeletecardselectNO()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.alertPopforDeletecardselectNO())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()).click();

	}

	// adding status of milestone

	public void ClickOn_SideStatusColumn() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnThreeDotOnMilestone())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickingOnEditInformationofMilestone());
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformationofMilestone())
						.click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		// to this comment out when run single

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_Status()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_Status()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onTime_dropdown()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onTime_dropdown()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnTimedropdown()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnTimedropdown())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onQuality_dropdown()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onQuality_dropdown()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnQualityValueDropDown()));
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnQualityValueDropDown())
						.click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onBudget_dropdown()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.onBudget_dropdown()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnBudgetValueDropDown()));
		boolean isRedBoxDisplayed = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnBudgetValueDropDown())
						.isDisplayed();

		if (isRedBoxDisplayed) {
			findElement(
					CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.enterStatusOnBudgetValueDropDown())
							.click();
		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.percentageCompleteharveyball()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.percentageCompleteharveyball())
				.click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityStatusDescription()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.activityStatusDescription())
				.sendKeys("milestone is upto date");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addStatusButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.addStatusButton()).click();

		// verify status added message
		boolean isStatusAddedmessage = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusAddedMsg()).isDisplayed();
		System.out.println(" Status Added message is displayed After Click On add button :" + isStatusAddedmessage);

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterTab()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterTab()).click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterDateVerify());

	}

	public String verifyDateOfStatusRegister() {
		String StatusDate = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.statusRegisterDateVerify()).getText()
						.substring(0, 11);
		System.out.println("Activity StatusDate :" + StatusDate
				+ "\n****************************************************************************************************************");
		return StatusDate;
	}

	public String verifyStatusRegisterDescription() {
		return findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatusRegisterDescription())
						.getText();
	}

	public String verifyStatusRegisterOnTime() {
		return findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatusRegisterOnTime())
						.getText();
	}

	public String verifyOnQualityColumn() {
		return findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatusRegisterOnQuality())
						.getText();
	}

	public String verifyOnBudgetColumn() {
		return findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyStatuRegisterOnBudget())
						.getText();
	}

	public String verifypercentageComplete() {
		return findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.verifyStatusRegisterOnPercentageCompleteColumn()).getText();
	}

	// LogTime Added on Milestone

	public void ClickOn_SideLogTimeColumn() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_logTime()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_logTime()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldforlogtime()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldforlogtime())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnCalendarToday()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnCalendarToday()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUser()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUser()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchForUser())
				.sendKeys("sakharam Nilkhan");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchIconOnLogTime()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchIconOnLogTime()).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromList()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromList()).click();

		for (int i = 0; i <= 5; i++) {

			explicitWaitVisibilityOf(findElement(
					CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLoggedTimeSpinnerUp()));
			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLoggedTimeSpinnerUp())
					.click();

		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDurationdropdown()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDurationdropdown()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValueDayFromDurationDropDown()));
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectValueDayFromDurationDropDown())
						.click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeDescriptiom()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeDescriptiom()).sendKeys(
				"Logging time in a milestone typically involves tracking the amount of time spent on a task, often for project management or reporting purposes");

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLogTimeAddButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnLogTimeAddButton()).click();

		String isLogtimeAddedMSgDisplayed = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeStatusAddedMSG()).getText();
		System.out.println("LogTimeAddedmessage is displayed :" + isLogtimeAddedMSgDisplayed);

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTotalLoggedTime()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTotalLoggedTime()).click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDate()));
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDate());

	}

	public String getLogTimeDate() {
		String getLogTimeDate = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDate()).getText();
		System.out.println("getLogTimedate is displayed : " + getLogTimeDate);
		return getLogTimeDate;

	}

	public String verifyLoggedHours() {
		String getLogTimehours = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeHrs()).getText();
		System.out.println("Logtime hours of activity is :" + getLogTimehours);
		return getLogTimehours;
	}

	public String verfyLogTimeDescription() {
		String LogTimeDescription = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getLogTimeDescription()).getText();
		System.out.println("LogtimeDescription of activity is :" + LogTimeDescription
				+ "\n*********************************************************************************************************************************************");
		return LogTimeDescription;

	}

	// editing the milestone logtime
	public void editLogTime() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTime()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTime()).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDate()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDate()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDatefromDatePicker()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDatefromDatePicker())
				.click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUserforeditLogtime()));
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAssignedUserforeditLogtime())
						.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchForUser())
				.sendKeys("sakharam Nilkhan");

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.magnifyingGlassSearchUser()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.magnifyingGlassSearchUser())
				.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromListEditlogTime()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectUserfromListEditlogTime())
				.click();

		for (int i = 0; i <= 5; i++) {

			explicitWaitVisibilityOf(findElement(
					CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeSpinnerUp()));
			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeSpinnerUp())
					.click();

		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDuratiomfield()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditLogTimeDuratiomfield())
				.click();

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDurationValue()));
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.selectDurationValue()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editLogtimeDescriptionfield()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editLogtimeDescriptionfield())
				.clear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editLogtimeDescriptionfield())
				.sendKeys("This is a Updated LogTimeDescriptiom");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateButton()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeUpdatedMSG()));
		boolean isLogtimeUpdatedMessageDisplayed = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.logTimeUpdatedMSG()).isDisplayed();
		System.out.println("LogTime successfully updated :" + isLogtimeUpdatedMessageDisplayed);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLogTimeDateafterEdit());

	}

	public boolean verifyLogTimeDateafterEdit() {
		boolean LogTimedateafterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLogTimeDateafterEdit())
						.isDisplayed();
		System.out.println("LogTimeDateAfteredit :" + LogTimedateafterEdit);
		return LogTimedateafterEdit;
	}

	public String verifyLoggedhrsAfterEdit() {
		String loggedHrsAfterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLoggedHrsAfterEdit()).getText();
		System.out.println("LoggedHrs after editlogtime :" + loggedHrsAfterEdit);
		return loggedHrsAfterEdit;
	}

	public String verifyUpdatedDescription() {
		String descriptionAfterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyLoggedDescriptionAfterEdit())
						.getText();
		System.out.println("Update LogTime description is :" + descriptionAfterEdit
				+ "\n*******************************************************************************************************");
		return descriptionAfterEdit;
	}

	// Applied risk on milestone

	public void clickOn_RiskTab() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRiskTab()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRiskTab()).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeighthowImportantDropdown()));
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeighthowImportantDropdown());
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnWeighthowImportantDropdown())
						.click();

		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.selectValuefromWeightHowImportantDropdown());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.selectValuefromWeightHowImportantDropdown()).click();

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickOnProbabilityHowLikelyDropdown()));
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnProbabilityHowLikelyDropdown())
						.click();

		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.selectValuefromProbabilityHowLikelyDropdown());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.selectValuefromProbabilityHowLikelyDropdown()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRadiobuttonforRiskTypeIssue()));
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnRadiobuttonforRiskTypeIssue())
						.click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskDescription()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskDescription())
				.sendKeys("This is the risk description");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskMitigation()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskMitigation()).sendKeys(
				"Risk mitigation is defined as taking steps to reduce adverse effects. There are four types of risk mitigation strategies that hold unique to Business Continuity and Disaster Recovery. It's important to develop a strategy that closely relates to and matches your company's profile");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldofRisk()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDatefieldofRisk()).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDate());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDate()).click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddRiskButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddRiskButton()).click();

		boolean isRiskAppliedMessageDisplayed = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.riskIssueAddedMsg()).isDisplayed();
		System.out.println("riskIssue Added message isDisplayed after added the risk on activity :"
				+ isRiskAppliedMessageDisplayed);

		if (isRiskAppliedMessageDisplayed) {
			explicitWaitVisibilityOf(findElement(
					CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnriskRegistertab()));
			findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnriskRegistertab())
					.click();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

	public boolean verifyDateOnRiskAddedTab() {

		boolean riskAddeddate = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDateofriskRegistertab())
						.isDisplayed();
		System.out.println("risk Added Date on riskRegister tab :" + riskAddeddate);
		return riskAddeddate;

	}

	public String getRiskScore() {
		String getriskscore = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getRiskScoreofActivity()).getText();
		System.out.println("Risk score of activity :" + getriskscore);
		return getriskscore;

	}

	public String verifyRiskType() {
		String typeofrisk = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyRiskType()).getText();
		System.out.println("Type of risk on activity :" + typeofrisk);
		return typeofrisk;

	}

	public String getDetailDescriptionofActivity() {
		String getDescription = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDetailDescriptionofRisk())
						.getText();
		System.out.println("DetailDescription of risk on activity :" + getDescription
				+ "\n********************************************************************************************");
		return getDescription;

	}

	// following code for edit the risk on milestone

	public void editRiskRegister() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRisk()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRisk()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.radioButtonofBusinessDependancy()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.radioButtonofBusinessDependancy())
				.click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskDescription()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskDescription()).clear();
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskDescription())
				.sendKeys("risk register status has changed from issue to Business Dependency");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskMitigation()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskMitigation()).clear();
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editRiskMitigation())
				.sendKeys("Mitigation of risk is Updated");

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResolvedDateCalendar()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnResolvedDateCalendar())
				.click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDateOnResolvedDate());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDateOnResolvedDate())
				.click();

		// edit risk date
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRiskDateCalendar());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditRiskDateCalendar())
				.click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDateEditRiskOnActivity());
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnTodayDateEditRiskOnActivity())
						.click();

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickResolvedCheckbox()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickResolvedCheckbox()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateRiskStatus()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateRiskStatus()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// explicitWaitElementBy("elementToBeLocated",
		// CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.verifyResolvedCheckbox());

	}

	public boolean verifyDateofRiskafterEdit() {
		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDateofRiskAfterEdit()));
		boolean DateofriskafterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getDateofRiskAfterEdit())
						.isDisplayed();
		return DateofriskafterEdit;

	}

	public String verifyScoreofRiskAfterEdit() {
		String scoreofriskafterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getRiskScoreAfterEdit()).getText();
		System.out.println("Score of risk after edit :" + scoreofriskafterEdit);
		return scoreofriskafterEdit;
	}

	public String verifyStatusofRiskAfterEdit() {
		String Typeofrisk = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getTypeofRiskStatusAfterEdit())
						.getText();
		System.out.println("Risk status changed from :" + Typeofrisk);
		return Typeofrisk;
	}

	// Added the subscriber on milestone

	public void clickOn_SubscriberTabOnMilestone() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberTab()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberTab()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberDropdown()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberDropdown())
				.click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchUserSubscriberInputfield());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.searchUserSubscriberInputfield())
				.sendKeys("sakharam Nilkhan");

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberSearchIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnSubscriberSearchIcon())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.selectSubscriberUSerAfterclickOnSearchIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.selectSubscriberUSerAfterclickOnSearchIcon()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		// click on add subscriber button

		explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickOnAddSubscriberStatusLogButton()));
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnAddSubscriberStatusLogButton())
						.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

	public String verifySubscriberUser() {
		String getSubscriberUser = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getUserImage())
						.getDomAttribute("title");
		System.out.println("Activity subscriber User name :" + getSubscriberUser);
		return getSubscriberUser;

	}

	public String verifySubscriberPercentageDoneCheckBox() {

		// String percentageCompleteDoneCheckboxClassAttributValue =
		// findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDoneCheckbox()).getDomAttribute("class").substring(128);

		String percentagedonecheckbox = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDoneCheckbox())
						.getDomAttribute("class").substring(18);
		System.out.println("Get percentage CompleteDone Checkbox Class Attribut Value :" + percentagedonecheckbox);
		return percentagedonecheckbox;
	}

	public String verifySubscriberActivityPastDueDateCheckbox() {
		String activityPastdueDateCheckboxClassAttributeValue = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnActivityPastDueDate())
						.getDomAttribute("class").substring(18);
		System.out.println("Activity past due date checkbox class Attribute value :"
				+ activityPastdueDateCheckboxClassAttributeValue);
		return activityPastdueDateCheckboxClassAttributeValue;
	}

	// editing the subscriber
	public void editSubscriberOnMilestone() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickSubscriberEditIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickSubscriberEditIcon()).click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPercentageCompleteDoneCheckbox());
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPercentageCompleteDoneCheckbox())
						.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editActivityPastDueDate()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editActivityPastDueDate()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateSubscriber()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUpdateSubscriber()).click();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDeleteScubscriber()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDeleteScubscriber())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.chooseNoOptionOnDeleteSubscriberPopUp());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.chooseNoOptionOnDeleteSubscriberPopUp()).click();

	}

	public String verifySubscriberUserAfterEdit() {
		String getSubscriberUserafterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.getUserImage())
						.getDomAttribute("title");
		System.out.println("Activity subscriber User name :" + getSubscriberUserafterEdit);
		return getSubscriberUserafterEdit;

	}

	public String verifySubscriberPercentageDoneCheckBoxAfterEdit() {

		String percentagedonecheckboxafterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnDoneCheckbox())
						.getDomAttribute("class").substring(18);
		System.out.println(
				"Get percentage CompleteDone Checkbox Class Attribut Value :" + percentagedonecheckboxafterEdit);
		return percentagedonecheckboxafterEdit;
	}

	public String verifySubscriberActivityPastDueDateCheckboxAfterEdit() {
		String activityPastdueDateCheckboxClassAttributeValueAfterEdit = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnActivityPastDueDate())
						.getDomAttribute("class").substring(18);
		System.out.println("activityPAstDueDateCheckboxClassAttributeValueAfterEdit  :"
				+ activityPastdueDateCheckboxClassAttributeValueAfterEdit);
		return activityPastdueDateCheckboxClassAttributeValueAfterEdit;

	}

	// following code for adding stickers on milestone

	public void addingStickers_OnActivity() {
		// first we need to upload stickers from kb

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		driver.switchTo().parentFrame();

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ThreeDotOnProjectBoards()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_ThreeDotOnProjectBoards())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_CreateKanbanBoard());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_CreateKanbanBoard())
				.click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inputTextareaforNewBoard());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inputTextareaforNewBoard())
				.sendKeys("kanban1");

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddkanbanBoardButton());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddkanbanBoardButton())
				.click();

		//// explicitWaitVisibilityOf(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_OpenCreatedKBboard()));
		//// explicitWaitElementBy("elementToBeLocated",
		//// CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_AddkanbanBoardButton());

		explicitWaitElementToBeLocated(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_OpenCreatedKBboard());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_OpenCreatedKBboard())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframeofkanbanBoard());

		handlevaluefokanbanBoardwindow = driver.getWindowHandle();
		System.out.println("kanban board window handle value:" + handlevaluefokanbanBoardwindow);

		getIframeWindowNameAttributeValue = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframeofkanbanBoard())
						.getDomAttribute("name");
		System.out.println("iframe window value :" + getIframeWindowNameAttributeValue);

		explicitWaitElementBy("elementToBeLocatedByWebElement",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.switchToiFrame());

		driver.switchTo()
				.frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.switchToiFrame()));

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadMaskAfterSave());

		try {
			Thread.sleep(6000);
		} catch (InterruptedException ie) {
		}
		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_KanbanBoardZoomIcon()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_KanbanBoardZoomIcon())
				.click();

		try {
			Thread.sleep(7000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadMaskAfterSave());

		for (String kanbanBoardwindowhandles : driver.getWindowHandles()) {
			System.out.println("kanbanBoard window handle value :" + kanbanBoardwindowhandles);
			driver.switchTo().window(kanbanBoardwindowhandles);
			// Add your logic for each window handle here
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickOn_AddtoBoardFanOutPlusIconButton());

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickOn_AddtoBoardFanOutPlusIconButton()).click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.dragStickerFanOutButton());

		WebElement sourceAddStickerButton = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.dragStickerFanOutButton());

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inprogressMasterContainer()));
		WebElement destinationsource = findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inprogressMasterContainer());

		actions.dragAndDrop(sourceAddStickerButton, destinationsource).build().perform();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_uploadStickersPlusIcon());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_uploadStickersPlusIcon())
				.click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.uploadStickerWindowNameInputfield());
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.uploadStickerWindowNameInputfield())
						.sendKeys("Image1");

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_GlobalCheckbox()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_GlobalCheckbox()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.inputfieldforImageUpload())
				.sendKeys(filePath + "\\ImageFolder/download4.jpg");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_UploadStickerButtonwindow());
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_UploadStickerButtonwindow())
						.click();

		driver.switchTo().window(handlevaluefokanbanBoardwindow);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		// driver.switchTo().parentFrame();
		// driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.switchToiFrame()));

		driver.switchTo().frame(0);

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_NavIconScroller()).click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnPlanGantt()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.customLoadspinner());

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		try {
			Thread.sleep(4000);
		} catch (InterruptedException ie) {
		}

		driver.switchTo().frame(findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.iframe()));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitElementBy("elementToBeLocated",
				CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone());
		findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnThreeDotOnMilestone()).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated", CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator
				.clickingOnEditInformationofMilestone());
		findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickingOnEditInformationofMilestone())
						.click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.loadingSpinner());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(findElement(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_StickersSideColumn()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_StickersSideColumn())
				.click();

		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.sizeofStickers());
		int sizeofAllStickers = findElements(
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.sizeofStickers()).size();
		System.out.println("Size of stickers are avaiable on activity :" + sizeofAllStickers);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		findElements(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.sizeofStickers())
				.get(sizeofAllStickers - 1).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.editPopUpSaveButton()).click();

	}

	public void add_files_OnMilestone() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		explicitWaitVisibilityOf(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_files()));
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOn_files()).click();

		boolean salesforcetabIsvisible = findElement(
				CreateSingleMilestoneAndAutomateEditInformationfieldLocator.salesforceTabIsVisible()).isDisplayed();
		System.out.println("is salesforceTab is visibile on upload file tab:" + salesforcetabIsvisible);

		if (salesforcetabIsvisible) {

			explicitWaitElementBy("elementToBeLocated",
					CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnSalesforcefileUpload());
			findElement(CreateSingleMilestoneAndAutomateEditInformationfieldLocator.clickOnSalesforcefileUpload())
					.click();

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}

		}

		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.uploadImageOnFilesInputField())
				.sendKeys(filePath + "\\ImageFolder/" + "download4.jpg");

		explicitWaitElementToBeClickable(
				findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUploadButton()));// upload
																														// button
																														// not
																														// clickable
																														// by
																														// autoation
																														// script
																														// by
																														// manually
																														// it
																														// is
																														// working
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnUploadButton()).click();

		explicitWaitElementBy("invisibilityOfElementLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.waitAfterUploadButtonClick());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		explicitWaitElementBy("elementToBeLocated",
				CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditCardFinalSaveButton());
		findElement(CreatingSingleActivityAndAutomateEditInformationfieldOnPgLocator.clickOnEditCardFinalSaveButton())
				.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}

	}

}
