package pom_package;

import org.openqa.selenium.By;

import helper_package.CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper;

public class CreateMilestoneAndAutomateThreedotfunctionalityOnPgLocator {

	public static final By clickOnThreeDot() {
		return By.xpath(
				"//div[text()='A " + CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.createFolderNameRandomly
						+ "']/following-sibling::div[@class='lmenu']");
	}

	public static final By clickOnCreatedProject() {
		return By.xpath("//*[contains(text(),'"
				+ CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.createProjectNameRandomly + "')]");
	}

	public static final By iFrameSrcValueAndSwitchToframe() {

		return By.xpath("//iframe[@src='"
				+ CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.getIframeSRCAttribute + "']");
	}

	public static final By getChildiFrameClassAttributeValue() {
		return By.xpath("//iframe[@class='" + CreateMilestoneAndAutomateThreedotfunctionalityOnPgHelper.childIframevalue
				+ "']");
	}

}
