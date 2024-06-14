package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper_package.CreateSingleMilestoneAndAutomateEditInformationfieldHelper;

public class TestCreateSingleMilestoneAndAutomateEditInformationfield {
	
	CreateSingleMilestoneAndAutomateEditInformationfieldHelper singlemilestone = new CreateSingleMilestoneAndAutomateEditInformationfieldHelper();
	
	SoftAssert softAssert = new SoftAssert();	
	@Test(priority=0)
	public void singleMilestone()
	{
		singlemilestone.singleMilestone();
	}
	
	@Test(priority=1)
	public void clickOn_SideStatusColumn()
	{
		singlemilestone.ClickOn_SideStatusColumn();
	}
	
	@Test(priority=2)
	public void clickOn_SideLogTimeColumn()
	{
		singlemilestone.ClickOn_SideLogTimeColumn();
	}
	
	@Test(priority=3)
	public void clickOn_editLogTime()
	{
		singlemilestone.editLogTime();
	}
	
	
	@Test(priority=4)
	public void clickOn_RiskTab()
	{
		singlemilestone.clickOn_RiskTab();
		
		//softassert.assertEquals(" setUncheck", singlemilestone.verifyresolvedCheckboxOnRiskRegisterTab());
	    //softassert.assertEquals("true", singlemilestone.verifyDateOnRiskAddedTab());
		//softassert.assertEquals("4", singlemilestone.getRiskScore());
		//softassert.assertEquals("Issue", singlemilestone.verifyRiskType());
		//softassert.assertEquals("This is the activity description", singlemilestone.getDetailDescriptionofActivity());
		
		//softassert.assertAll();
	}
	
	@Test(priority=5,enabled=false)
	public void editRisk()
	{
		singlemilestone.editRiskRegister();
		
	      //	softassert.assertEquals("setCheck", singlemilestone.verifyResolvedCheckbox());
		
		 //softassert.assertEquals("true", singlemilestone.verifyDateofRiskafterEdit());
    	//softassert.assertEquals("9", singlemilestone.verifyScoreofRiskAfterEdit());
	   //softassert.assertEquals("Business Dependency", singlemilestone.verifyStatusofRiskAfterEdit());
		
		
		//softassert.assertAll();
	}
	
	
	@Test(priority=6)
	public void clickOnSubscriberOfActivity()
	{
		singlemilestone.clickOn_SubscriberTab();
		
		softAssert.assertEquals("pratish laad", singlemilestone.verifySubscriberUser());
		softAssert.assertEquals("setCheck", singlemilestone.verifySubscriberPercentageDoneCheckBox());
		softAssert.assertEquals("setCheck", singlemilestone.verifySubscriberActivityPastDueDateCheckbox());
		
		softAssert.assertAll();
	}
	
	@Test(priority=7)
	public void clickOneditSubscriber()
	{
		singlemilestone.editSubscriberofActivity();
		
		softAssert.assertEquals("pratish laad", singlemilestone.verifySubscriberUserAfterEdit());
		softAssert.assertEquals("setUncheck", singlemilestone.verifySubscriberPercentageDoneCheckBoxAfterEdit());
		softAssert.assertEquals("setUncheck", singlemilestone.verifySubscriberActivityPastDueDateCheckboxAfterEdit());
		
		
		softAssert.assertAll();
		
	}
	
	@Test(priority=8)
	public void clickOn_ResourceTabOnActivity()
	{
		singlemilestone.clickOn_ResourceTabOnActivity();
		
        //softAssert.assertEquals("sakharam Nilkhan", singlemilestone.verifyResourceAllocation());
		//softAssert.assertEquals("100", singlemilestone.verifyResourceAllocation());
		
	}	
	
	
	@Test(priority=9)
	public void clickOn_Normal_SchedulingMode()
	{
		singlemilestone.Normal_SchedulingMode();
		
		//softAssert.assertEquals("2 days",singlemilestone.verifyActivityModeDurationfieldTrigger());
		
		softAssert.assertAll();
	
	}
	
	@Test(priority=10,enabled=false)
	public void fixedDuration_SchedulingMode()
	{
		singlemilestone.fixedDuration_SchedulingMode();
		
		// try {Thread.sleep(1000);} catch (InterruptedException ie) {}
		// softAssert.assertEquals("20 days", singlemilestone.verifyActualEffortfield());
		
		 softAssert.assertAll();
	}
	
	@Test(priority=11)
	public void effortDriven_SchedulingMode()
	{
		singlemilestone.effortDriven_SchedulingMode();
		
		
		// softAssert.assertEquals("display: none;", singlemilestone.verifyActivityInfoModeDurationforEffortDrivenScheduleMode());
		
		 softAssert.assertAll();
		
	}
	
	@Test(priority=12)
	public void dynamicAssignment_SchedulingMode()
	{
		singlemilestone.dynamicAssignment_SchedulingMode();
		
		singlemilestone.verifyResourceAllocationforDynamicAssignmentSchedulingmode();
	}

	@Test(priority=13)
	public void add_files_OnMilestone()
	{
		singlemilestone.add_files_OnMilestone();
	}
	


}





