package test_package;

import org.testng.annotations.Test;

import helper_package.SavingMultipleViewsInPlanGanttHelper;

public class TestSavingMultipleViewsInPlanGant {

	SavingMultipleViewsInPlanGanttHelper saveMultipleView = new SavingMultipleViewsInPlanGanttHelper();

	@Test(priority = 0)
	public void Singlemilestone() {
		saveMultipleView.singleMilestone();
	}

	@Test(priority = 1)
	public void saveDefaultView() {
		saveMultipleView.saveDefaultView();
	}

	@Test(priority = 2)
	public void createView1WithAddColumn() {
		saveMultipleView.createView1WithAddColumn();
	}

	@Test(priority = 3)
	public void createView2Withfilter() {
		saveMultipleView.createView2Withfilter();
	}

	@Test(priority = 4)
	public void createView3WithBaseline() {
		saveMultipleView.createView3WithBaseline();
	}

	@Test(priority = 5)
	public void filterBoardByTitle() {
		saveMultipleView.filterBoardByTitle();
	}

	@Test(priority = 16)
	public void hideAndShowScheduleICon() {
		saveMultipleView.hideAndShowScheduleICon();
	}

}
