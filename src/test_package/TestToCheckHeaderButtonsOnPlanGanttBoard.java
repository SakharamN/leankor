package test_package;

import org.testng.annotations.Test;

import helper_package.ToCheckHeaderButtonsOnPlanGanttBoardHelper;

public class TestToCheckHeaderButtonsOnPlanGanttBoard {

	ToCheckHeaderButtonsOnPlanGanttBoardHelper HeaderButtonsOnPg = new ToCheckHeaderButtonsOnPlanGanttBoardHelper();

	@Test(priority = 0)
	public void Singlemilestone() {
		HeaderButtonsOnPg.singleMilestone();
	}

	@Test(priority = 1)
	public void advancefilterOnPlantGantt() throws InterruptedException {
		HeaderButtonsOnPg.advancefilterOnPlantGantt();
	}

	@Test(priority = 2)
	public void checkUndoButtonFunctionality() {
		HeaderButtonsOnPg.checkUndoButtonFunctionality();
	}

	@Test(priority = 3)
	public void checkTimespanFunctionality() {
		HeaderButtonsOnPg.checkTimespanFunctionality();
	}

	@Test(priority = 4)
	public void createMultipleBaselines() {
		HeaderButtonsOnPg.createMultipleBaselines();
	}

	@Test(priority = 5)
	public void showAndHideBaseline() {
		HeaderButtonsOnPg.showAndHideBaseline();
	}

	@Test(priority = 6)
	public void showBaselineHistory() {
		HeaderButtonsOnPg.showBaselineHistory();
	}

	@Test(priority = 7)
	public void checkFilterBaselinefunctionality() {
		HeaderButtonsOnPg.checkFilterBaselinefunctionality();
	}

	@Test(priority = 8)
	public void clickOnShowTab() {
		HeaderButtonsOnPg.clickOnShowTab();
	}

}
