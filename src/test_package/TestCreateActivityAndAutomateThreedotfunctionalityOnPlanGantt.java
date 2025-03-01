package test_package;

import org.testng.annotations.Test;

import helper_package.CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper;

public class TestCreateActivityAndAutomateThreedotfunctionalityOnPlanGantt {

	CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper automatethreedotfunctionality = new CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper();

	@Test(priority = 0)
	public void Create_SingleActivity() {
		automatethreedotfunctionality.Create_SingleActivity();
	}

	@Test(priority = 1)
	public void quickActionsOnActivity() {
		automatethreedotfunctionality.quickActionsOnactivity();
	}

	@Test(priority = 2)
	public void addButtonfunctionality() {
		automatethreedotfunctionality.addButtonfunctionality();
	}

	@Test(priority = 3)
	public void clickOnDiscussTabOnActivity() {
		automatethreedotfunctionality.clickOnDiscussTabOnActivity();
	}

	@Test(priority = 4)
	public void converToActivityGroup() {
		automatethreedotfunctionality.convertToActivityGroup();
	}

	@Test(priority = 5)
	public void performIndentOutdentOperatisOnActivity() {
		automatethreedotfunctionality.performIndentOutdentOperatisOnActivity();
	}

	@Test(priority = 6)
	public void cloneActivity() {
		automatethreedotfunctionality.cloneActivity();
	}

	@Test(priority = 7)
	public void deleteOperation_OnActivity() {
		automatethreedotfunctionality.deleteOperation_OnActivity();
	}

	@Test(priority = 8)
	public void performExternalDependancyOperationOnActivity() {
		automatethreedotfunctionality.performExternalDependancyOperationOnActivity();
	}

}
