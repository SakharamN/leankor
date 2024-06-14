package test_package;

import org.testng.annotations.Test;

import helper_package.PlanGanttActivityDependencyHelper;

public class TestPlanGanttActivityDependency {
	
	PlanGanttActivityDependencyHelper planGanttDependency = new PlanGanttActivityDependencyHelper();
	
	@Test
	public void PlanGanttDependencyFinishToStart()
	{
		planGanttDependency.applyPlanGanttActivityFinishToStartDependency();
	}
}
