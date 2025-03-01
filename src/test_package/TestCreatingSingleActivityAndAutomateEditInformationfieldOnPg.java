package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper;

public class TestCreatingSingleActivityAndAutomateEditInformationfieldOnPg

{
	CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper SingleActivity = new CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper();

	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 0)
	public void Create_SingleActivity() {
		SingleActivity.Create_SingleActivity();
	}

	@Test(priority = 1)
	public void ClickOn_SideStatusColumn() {
		SingleActivity.ClickOn_SideStatusColumn();

		// softAssert.assertEquals(CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper.ActivityStartDateWhileCreating,
		// SingleActivity.verifyDateOfStatusRegister());
		softAssert.assertEquals("Activity is upto date", SingleActivity.verifyStatusRegisterDescription());
		softAssert.assertEquals("Amber", SingleActivity.verifyOnTimeColoumn());
		softAssert.assertEquals("Green", SingleActivity.verifyOnQualityColoumn());
		softAssert.assertEquals("Green", SingleActivity.verifyOnBudgetColoumn());
		softAssert.assertEquals("50%", SingleActivity.verifyPercentageCompleteColumn());

		softAssert.assertAll();
	}

	@Test(priority = 2)
	public void ClickOn_LogTimeSideColumn() {
		SingleActivity.ClickOn_LogTimeSideColumn();

		// softAssert.assertEquals("CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper.ActivityStartDateWhileCreating",
		// SingleActivity.getLogTimeDate());
		// softAssert.assertEquals("56", SingleActivity.verifyLoggedHours());
		// softAssert.assertEquals("Logging time in a Kanban card typically involves
		// tracking the amount of time spent on a task, often for project management or
		// reporting purposes", SingleActivity.verfyLogTimeDescription());
		softAssert.assertAll();

	}

	@Test(priority = 3)
	public void editLogTime() {
		SingleActivity.editLogTime();
		// softAssert.assertEquals("true", SingleActivity.verifyLogTimeDateAfterEdit());
		// softAssert.assertEquals("144", SingleActivity.verifyLogTimeHoursAfterEdit());
		// softAssert.assertEquals("This is a Updated LogTime detail",
		// SingleActivity.verifyUpdatedLogTimeDescriptionAfterEdit());

		// softAssert.assertAll();
	}

	@Test(priority = 4)
	public void clickOn_RiskSideColumn() {
		SingleActivity.clickOn_RiskSideColumn();

		// softAssert.assertEquals("true", SingleActivity.verifyDateOnRiskAddedTab());
		softAssert.assertEquals("4", SingleActivity.verifyRiskScore());
		softAssert.assertEquals("Issue", SingleActivity.verifyRiskType());
		softAssert.assertEquals("risk activity description", SingleActivity.verifyRiskDetail());

		softAssert.assertAll();
	}

	@Test(priority = 5)
	public void editRisk() {
		SingleActivity.editRisk();

		// softAssert.assertEquals("true", SingleActivity.verifyDateofRiskafterEdit());
		softAssert.assertEquals("4", SingleActivity.verifyScoreofRiskAfterEdit());
		softAssert.assertEquals("Business Dependency", SingleActivity.verifyRiskTypeAfterEdit());

		softAssert.assertAll();
	}

	@Test(priority = 6)
	public void clickOn_SubscriberSideColumn() {
		SingleActivity.clickOn_SubscriberSideColumn();

		softAssert.assertEquals("sakharam Nilkhan", SingleActivity.verifySubscriberUser());
		softAssert.assertEquals("setCheck", SingleActivity.verifySubscriberPercentageDoneCheckBox());
		softAssert.assertEquals("setCheck", SingleActivity.verifySubscriberActivityPastDueDateCheckbox());

		softAssert.assertAll();
	}

	@Test(priority = 7)
	public void clickOneditSubscriber() {
		SingleActivity.editSubscriberOfActivity();

		softAssert.assertEquals("sakharam Nilkhan", SingleActivity.verifySubscriberUserAfterEdit());
		softAssert.assertEquals("setUncheck", SingleActivity.verifySubscriberPercentageDoneCheckBoxAfterEdit());
		softAssert.assertEquals("setUncheck", SingleActivity.verifySubscriberActivityPastDueDateCheckboxAfterEdit());

		softAssert.assertAll();

	}

	@Test(priority = 8)
	public void clickOn_ResourceSideColumnOnActivity() {
		SingleActivity.clickOn_ResourceSideColumnOnActivity();

		softAssert.assertEquals("sakharam Nilkhan", SingleActivity.verifyResourceOnActivity());
		softAssert.assertEquals("100 %", SingleActivity.verifyResourceAllocation());

	}

	@Test(priority = 9)
	public void clickOn_Normal_SchedulingMode() {
		SingleActivity.Normal_SchedulingMode();

		softAssert.assertEquals("2 days", SingleActivity.verifyActivityModeDurationfieldTrigger());

		softAssert.assertAll();

	}

	@Test(priority = 10)
	public void fixedDuration_SchedulingMode() {
		SingleActivity.fixedDuration_SchedulingMode();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
		}
		softAssert.assertEquals("20 days", SingleActivity.verifyActualEffortfield());

		softAssert.assertAll();
	}

	@Test(priority = 11)
	public void effortDriven_SchedulingMode() {
		SingleActivity.effortDriven_SchedulingMode();

		softAssert.assertEquals("display: none;",
				SingleActivity.verifyActivityInfoModeDurationforEffortDrivenScheduleMode());

		softAssert.assertAll();

	}

	@Test(priority = 12)
	public void dynamicAssignment_SchedulingMode() {
		SingleActivity.dynamicAssignment_SchedulingMode();

		SingleActivity.verifyResourceAllocationforDynamicAssignmentSchedulingmode();
	}

	@Test(priority = 13)
	public void addingStickers_OnActivity() {
		SingleActivity.addingStickers_OnActivity();
	}

	@Test(priority = 14)
	public void clickOn_FilesSideColumn() {
		SingleActivity.clickOn_FilesSideColumn();
	}

}
