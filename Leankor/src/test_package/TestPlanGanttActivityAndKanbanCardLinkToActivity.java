package test_package;

import org.testng.annotations.Test;

import helper_package.PlanGanttActivityAndKanbanCardLinkToActivityHelper;

public class TestPlanGanttActivityAndKanbanCardLinkToActivity {

	PlanGanttActivityAndKanbanCardLinkToActivityHelper planGanttActivity = new PlanGanttActivityAndKanbanCardLinkToActivityHelper();
	
	@Test
	public void KanbanBoard() throws InterruptedException
	{
		planGanttActivity.kanbanBoard();
	}
	
	
	@Test
	public void PlanGantt()
	{
		planGanttActivity.clickOnPlanGantt();
	}
}
