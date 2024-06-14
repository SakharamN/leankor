package test_package;

import java.awt.AWTException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common_package.CommonMethodsOfWebDriver;
import helper_package.AddKanbanCardRegressionOnCalendarViewHelper;
import pom_package.AddKanbanCardRegressionOnCalendarViewLocater;

public class TestAddKanbanCardRegressionOnCalendarView {
	
	AddKanbanCardRegressionOnCalendarViewHelper CalendarViewcard =new AddKanbanCardRegressionOnCalendarViewHelper();
	
	SoftAssert softAssert = new SoftAssert();
 
	@Test(priority=0)
	public void KanbanBoard() throws InterruptedException
	{
		CalendarViewcard.create_KanbanBoard();
	}
	
	@Test(priority=1)
	public void kanbanCard() throws AWTException
	{
		CalendarViewcard.create_KanbanCardOnCalendarView();
	//	softAssert.assertEquals("sakharam Nilkhan", CalendarViewcard.getVerifycardOwneroncard());
	//	softAssert.assertEquals("finance department", CalendarViewcard.getVerifycardTitleOnCard());
	//	softAssert.assertAll();
		
	}
	
	@Test(priority=2)
	public void UpdateCVcard()
	{
		CalendarViewcard.UpdateCVcard();
		
		//softAssert.assertEquals(false, CalendarViewcard.getverifycardmodeEstimationDays());
		//softAssert.assertEquals(false, CalendarViewcard.getVerifyEnddateField());
		////softAssert.assertAll();
		//try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
	//	explicitWaitElementToBeClickable(findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SaveCard()));
	  //  findElement(CreateCardsOnDifferentMasterContainersOnCVLocator.SaveCard()).click();
		
	}
	
	

	@Test(priority=3,enabled=false) 
	public void ClickingOnDiscuss()
	{
		CalendarViewcard.ClickingOnDiscuss();
	}
	
	@Test(priority=4)
	public void CloneCardBYStartDate()
	{
		CalendarViewcard.CloneCardBYStartDate();
		//softAssert.assertEquals(false, CalendarViewcard.getverifycardmodeEstimationDays());
	}
	
	@Test(priority=5)
	public void CloneCardBYDueDate() 
	{
		CalendarViewcard.CloneCardByDueDate();
	}
	
	@Test(priority=6)
	public void Hierarchy()
	{
		CalendarViewcard.Hierarchy();
	}
	
	@Test(priority=7)
	public void AddingTaskOnCvcard()
	{
		CalendarViewcard.ClickOnAddTask();
	}
	
	@Test(priority=8)
	public void UpdateTask() throws AWTException
	{
		CalendarViewcard.EditTaskonCVCard();
	}	
	
	
	@Test(priority=9)
	public void UploadfileOnCV()
	{
		CalendarViewcard.UploadFileonCV();
	}
	
	@Test(priority=10)// causing of auick action method delete method failed
	public void clickingOnQuickAction()
	{
		CalendarViewcard.ClickOnQuickactionOnCv();
	}
	
	
	@Test(priority=11)
	public void deleteCardonCV()
	{
		CalendarViewcard.DeleteCardOnCV();
	}
	
	
	
	
}
