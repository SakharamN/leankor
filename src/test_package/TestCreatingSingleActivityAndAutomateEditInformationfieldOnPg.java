package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper_package.CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper;

public class TestCreatingSingleActivityAndAutomateEditInformationfieldOnPg

{
	CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper SingleActivity = new CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper();
	
	SoftAssert softAssert = new SoftAssert();	
	
	@Test(priority=0)
	public void Create_SingleActivity()
	{
		SingleActivity.Create_SingleActivity();
	}
	
	
	
	@Test(priority=1)
	public void ClickOn_SideStatusColumn()
	{
		SingleActivity.ClickOn_SideStatusColumn();
		
		//softAssert.assertEquals(CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper.ActivityStartDateWhileCreating, SingleActivity.verifyDateOfStatusRegister());
		//softAssert.assertEquals("Activity status is 50 percent", SingleActivity.verifyStatusRegisterDescription());
		//softAssert.assertEquals("Amber", SingleActivity.verifyStatusRegisterOnTime());
		//softAssert.assertEquals("Green", SingleActivity.verifyOnQualityColumn());
		//softAssert.assertEquals("Green", SingleActivity.verifyOnBudgetColumn());
		//softAssert.assertEquals("50%", SingleActivity.verifypercentageComplete());
		
		//softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void ClickOn_SideLogTimeColumn()
	{
		SingleActivity.ClickOn_SideLogTimeColumn();
		
		//softAssert.assertEquals("CreatingSingleActivityAndAutomateEditInformationfieldOnPgHelper.ActivityStartDateWhileCreating", SingleActivity.getLogTimeDate());
		//softAssert.assertEquals("56", SingleActivity.verifyLoggedHours());
		//softAssert.assertEquals("This is a LogTimeDescriptiom", SingleActivity.verfyLogTimeDescription());
		//softAssert.assertAll();
		
	}
	
	@Test(priority=3)
	public void editLogTime()
	{
		SingleActivity.editLogTime();
		//softassert.assertEquals("true", SingleActivity.verifyLogTimeDateafterEdit());
		//softassert.assertEquals("104", SingleActivity.verifyLoggedhrsAfterEdit());
		//softassert.assertEquals("This is a Updated LogTimeDescriptiom", SingleActivity.verifyUpdatedDescription());

		//softassert.assertAll();
	}
	
	@Test(priority=4)
	public void clickOn_RiskTab()
	{
		SingleActivity.clickOn_RiskTab();
		
		//softassert.assertEquals(" setUncheck", SingleActivity.verifyresolvedCheckboxOnRiskRegisterTab());
	    //softassert.assertEquals("true", SingleActivity.verifyDateOnRiskAddedTab());
		//softassert.assertEquals("4", SingleActivity.getRiskScore());
		//softassert.assertEquals("Issue", SingleActivity.verifyRiskType());
		//softassert.assertEquals("This is the activity description", SingleActivity.getDetailDescriptionofActivity());
		
		//softassert.assertAll();
	}
	
	@Test(priority=5,enabled=false)
	public void editRisk()
	{
		SingleActivity.editRiskRegister();
		
	//	softassert.assertEquals("setCheck", SingleActivity.verifyResolvedCheckbox());
		
		//softassert.assertEquals("true", SingleActivity.verifyDateofRiskafterEdit());
     	//softassert.assertEquals("9", SingleActivity.verifyScoreofRiskAfterEdit());
		//softassert.assertEquals("Business Dependency", SingleActivity.verifyStatusofRiskAfterEdit());
		
		
		//softassert.assertAll();
	}
	
	
	@Test(priority=6)
	public void clickOnSubscriberOfActivity()
	{
		SingleActivity.clickOn_SubscriberTab();
		
		softAssert.assertEquals("sakharam Nilkhan", SingleActivity.verifySubscriberUser());
		softAssert.assertEquals("setCheck", SingleActivity.verifySubscriberPercentageDoneCheckBox());
		softAssert.assertEquals("setCheck", SingleActivity.verifySubscriberActivityPastDueDateCheckbox());
		
		softAssert.assertAll();
	}
	
	@Test(priority=7)
	public void clickOneditSubscriber()
	{
		SingleActivity.editSubscriberofActivity();
		
		softAssert.assertEquals("sakharam Nilkhan", SingleActivity.verifySubscriberUserAfterEdit());
		softAssert.assertEquals("setUncheck", SingleActivity.verifySubscriberPercentageDoneCheckBoxAfterEdit());
		softAssert.assertEquals("setUncheck", SingleActivity.verifySubscriberActivityPastDueDateCheckboxAfterEdit());
		
		
		softAssert.assertAll();
		
	}
	
	@Test(priority=8)
	public void clickOn_ResourceTabOnActivity()
	{
		SingleActivity.clickOn_ResourceTabOnActivity();
		
        //softAssert.assertEquals("sakharam Nilkhan", SingleActivity.verifyResourceAllocation());
		//softAssert.assertEquals("100", SingleActivity.verifyResourceAllocation());
		
	}	
	
	@Test(priority=9)
	public void clickOn_Normal_SchedulingMode()
	{
		SingleActivity.Normal_SchedulingMode();
		
		//softAssert.assertEquals("2 days",SingleActivity.verifyActivityModeDurationfieldTrigger());
		
		softAssert.assertAll();
	
	}
	
	@Test(priority=10)
	public void fixedDuration_SchedulingMode()
	{
		SingleActivity.fixedDuration_SchedulingMode();
		
		// try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		// softAssert.assertEquals("20 days", SingleActivity.verifyActualEffortfield());
		
		 softAssert.assertAll();
	}
	
	@Test(priority=11)
	public void effortDriven_SchedulingMode()
	{
		SingleActivity.effortDriven_SchedulingMode();
		
		
		// softAssert.assertEquals("display: none;", SingleActivity.verifyActivityInfoModeDurationforEffortDrivenScheduleMode());
		
		 softAssert.assertAll();
		
	}
	
	@Test(priority=12)
	public void dynamicAssignment_SchedulingMode()
	{
		SingleActivity.dynamicAssignment_SchedulingMode();
		
		SingleActivity.verifyResourceAllocationforDynamicAssignmentSchedulingmode();
	}

	@Test(priority=13)
	public void addingStickers_OnActivity()
	{
		SingleActivity.addingStickers_OnActivity();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
