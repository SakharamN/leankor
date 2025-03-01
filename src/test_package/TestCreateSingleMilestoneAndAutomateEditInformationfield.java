package test_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import helper_package.CreateSingleMilestoneAndAutomateEditInformationfieldHelper;

public class TestCreateSingleMilestoneAndAutomateEditInformationfield {

	CreateSingleMilestoneAndAutomateEditInformationfieldHelper singlemilestone = new CreateSingleMilestoneAndAutomateEditInformationfieldHelper();

	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 0)
	public void singleMilestone() {
		singlemilestone.singleMilestone();
	}

	@Test(priority = 1)
	public void clickOn_SideStatusColumn() {
		singlemilestone.ClickOn_SideStatusColumn();
	}

	@Test(priority = 2)
	public void clickOn_SideLogTimeColumn() {
		singlemilestone.ClickOn_SideLogTimeColumn();
	}

	@Test(priority = 3)
	public void clickOn_editLogTime() {
		singlemilestone.editLogTime();
	}

	@Test(priority = 4)
	public void clickOn_RiskTab() {
		singlemilestone.clickOn_RiskTab();

		// softassert.assertEquals(" setUncheck",
		// singlemilestone.verifyresolvedCheckboxOnRiskRegisterTab());
		// softassert.assertEquals("true", singlemilestone.verifyDateOnRiskAddedTab());
		// softassert.assertEquals("4", singlemilestone.getRiskScore());
		// softassert.assertEquals("Issue", singlemilestone.verifyRiskType());
		// softassert.assertEquals("This is the activity description",
		// singlemilestone.getDetailDescriptionofActivity());

		// softassert.assertAll();
	}

	@Test(priority = 5)
	public void editRisk() {
		singlemilestone.editRiskRegister();

		// softassert.assertEquals("setCheck",
		// singlemilestone.verifyResolvedCheckbox());
		// softassert.assertEquals("true", singlemilestone.verifyDateofRiskafterEdit());
		// softassert.assertEquals("9", singlemilestone.verifyScoreofRiskAfterEdit());
		// softassert.assertEquals("Business Dependency",
		// singlemilestone.verifyStatusofRiskAfterEdit());

		// softassert.assertAll();
	}

	@Test(priority = 6)
	public void clickOn_SubscriberTabOnMilestone() {
		singlemilestone.clickOn_SubscriberTabOnMilestone();

		softAssert.assertEquals("sakharam Nilkhan", singlemilestone.verifySubscriberUser());
		softAssert.assertEquals("setCheck", singlemilestone.verifySubscriberPercentageDoneCheckBox());
		softAssert.assertEquals("setCheck", singlemilestone.verifySubscriberActivityPastDueDateCheckbox());

		softAssert.assertAll();
	}

	@Test(priority = 7)
	public void editSubscriberOnMilestone() {
		singlemilestone.editSubscriberOnMilestone();

		softAssert.assertEquals("sakharam Nilkhan", singlemilestone.verifySubscriberUserAfterEdit());
		softAssert.assertEquals("setUncheck", singlemilestone.verifySubscriberPercentageDoneCheckBoxAfterEdit());
		softAssert.assertEquals("setUncheck", singlemilestone.verifySubscriberActivityPastDueDateCheckboxAfterEdit());

		softAssert.assertAll();

	}

	@Test(priority = 8)
	public void add_files_OnMilestone() {
		singlemilestone.add_files_OnMilestone();
	}
}
