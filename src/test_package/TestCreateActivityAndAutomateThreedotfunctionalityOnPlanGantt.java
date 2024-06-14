package test_package;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import helper_package.CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper;
import pom_package.CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttLocator;
import pom_package.KanbanBoardRegressionLocators;

public class TestCreateActivityAndAutomateThreedotfunctionalityOnPlanGantt {
	
	CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper automatethreedotfunctionality = new CreateActivityAndAutomateThreedotfunctionalityOnPlanGanttHelper();
	
	@Test(priority=0)
	public void Create_SingleActivity()
	{
		automatethreedotfunctionality.Create_SingleActivity();
	}
	
	@Test(priority=1)
	public void addButtonfunctionality()
	{
		automatethreedotfunctionality.addButtonfunctionality();
	}
	
	@Test(priority=2,enabled=false)
	public void clickOnDiscussTabOnActivity()
	{
		automatethreedotfunctionality.clickOnDiscussTabOnActivity();
	}

	@Test(priority=3)
	public void converToActivityGroup()
	{
		automatethreedotfunctionality.convertToActivityGroup();
	}
	
	@Test(priority=4)
	public void convertTomilestone()
	{
		automatethreedotfunctionality.convertTomilestone();
	}
	
	@Test(priority=5,enabled=false)
	public void discusstabOnmilestone()
	{
		automatethreedotfunctionality.discusstabOnmilestone();
	}
	
	@Test(priority=6)
	public void quickActionsOnActivity()
	{
		automatethreedotfunctionality.quickActionsOnactivity();
	}
	
	@Test(priority=7,enabled=false) // not able to find the xpath for three dot
	public void quickActionsOnMilstone()
	{
		automatethreedotfunctionality.quickActionsOnMilstone();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
