package test_package;

import org.testng.annotations.Test;

import helper_package.PlanGanttBoardSettingHelper;

public class TestPlanGanttBoardSetting {

	PlanGanttBoardSettingHelper pgboard = new PlanGanttBoardSettingHelper();

	@Test(priority = 0)
	public void Create_SingleActivity() {
		pgboard.Create_SingleActivity();
	}

	@Test(priority = 1)
	public void showCriticalPath() {
		pgboard.showCriticalPath();
	}

}
