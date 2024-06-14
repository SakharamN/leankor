package pom_package;

import org.openqa.selenium.By;

import helper_package.ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper;

public class ToCreatingMultipleCardsOnDifferentMasterContainerInCvLocater {
	
	
	
	public static final By clickOnThreeDots()
	{
		return By.xpath("//div[text()='A "+ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	} //return By.xpath("//div[text()='A "+CreateCardsOnDifferentMasterContainersOnCVHelper.createFolderNameRandomly+"']/following-sibling::div[@class='lmenu']");
	
	public static final By clickOnCreatedProject()
	{
	    return By.xpath("//div[contains(text(),'"+ ToCreatingMultipleCardsOnDifferentMasterContainerInCVHelper.createProjectNameRandomly +"')]");
	}
	public static final By clickingOnTemplatemasterContainer() 
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//div[contains(@style,' transform: translate3d(0px, 0px, 0px);')]//table[2]");
	}
	
	public static final By clickingOnBacklogmasterContainer()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//div[contains(@style,' transform: translate3d(0px, 0px, 0px);')]//table[3]");
	}
	
	public static final By clickingOnInprogressmasterContainer()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//div[contains(@style,' transform: translate3d(0px, 0px, 0px);')]//table[4]");
	}
	public static final By clickingOnReviewAndApprovemasterContainer()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//div[contains(@style,' transform: translate3d(0px, 0px, 0px);')]//table[6]");
	}
	public static final By clickingOnDonemastercontainer()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//div[contains(@style,' transform: translate3d(0px, 0px, 0px);')]//table[7]");
	}
	public static final By clickingOnArchivemasterContainer()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//div[contains(@style,' transform: translate3d(0px, 0px, 0px);')]//table[8]");
	}
	
	public static final By LoadindBoardXmask()
	{
		return By.xpath("//div[@class='x-mask-loading x-mask-msg-inner ']//div[contains(@id,'loadmask-')]");
	}
	
	public static final By templateMC()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//table[@data-recordid='497']");
	}
	public static final By backlogMC()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//table[@data-recordid='498']");
	}
	
	public static final By inprogressMC()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//table[@data-recordid='500']");
	}
	
	public static final By reviewAndApproveMC()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//table[@data-recordid='501']");
	}
	
	public static final By doneMC()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//table[@data-recordid='502']");
	}
	public static final By archiveMC()
	{
		return By.xpath("//div[@class='x-grid-scrollbar-clipper ']//table[@data-recordid='503']");
	}
	
	public static final By xmaskloadcreatingcardsave()
	{
		return By.xpath("//div[contains(@id,'loadmask-')]//div[@class=' x-mask-msg-inner ']");
	}
	
	public static final By xmaskloadaftersave()
	{
		//return By.xpath("//div[contains(@id,'loadmask-')]//div[@class='x-mask-loading x-mask-msg-inner ']");
		
		//return By.xpath("//div[@class='x-component x-border-box x-mask x-component-default x-focus x-component-focus x-component-default-focus']//div[contains(@id,'loadmask-')]//div[@class='x-mask-loading x-mask-msg-inner ']/div");
		
		return By.xpath("//div[contains(@id,'loadmask-')]");
	}
	
	public static final By elbowIMGofTemplateMc()
	{
		return By.xpath("//span[contains(text(),'Template ')]/preceding-sibling::img");
	}

	public static final By elbowIMGofBacklogMC()
	{
		return By.xpath("//span[contains(text(),'Backlog ')]/preceding-sibling::img");
	}
	
	public static final By elbowIMGofInprogressMC()
	{
		return By.xpath("//span[contains(text(),'In Progress')]/preceding-sibling::img");
	}
	
	public static final By elbowIMGofReviewAndApproveMC()
	{
		return By.xpath("//span[contains(text(),'Review & Approve')]/preceding-sibling::img");
	}
	
	public static final By elbowIMGofDoneMC()
	{
		return By.xpath("//span[contains(text(),'Done ')]/preceding-sibling::img");
	}
	
	public static final By elbowIMGofArchiveMC()
	{
		return By.xpath("//span[contains(text(),'Archive ')]/preceding-sibling::img");
	}
	
	
	//following xpath for the common xpath for all grid for master container
	
	public static final By CommonXpathforAllGridForMasterContainer()
	{
		return By.xpath("//tr[contains(@class,'x-grid-tree-node-expanded  x-grid-row')]");
	}
	
	public static final By CommonXpathForGridnodeformasterContainer()
	{
		return By.xpath("//tr[contains(@class,'x-grid-tree-node-expanded  x-grid-row')]/td/div/img");
	}
	
	
	//following xpath collapse and expanding all the master containers
	public static final By kanbanBoardnode()
	{
		return By.xpath("//span[contains(text(),'Template ')]/preceding-sibling::img/ancestor::table/preceding-sibling::table/descendant::img");
	}
	
	public static final By treenodeExpander()
	{
		return By.xpath("//td[contains(@class,'first x-grid-cell')]/div/img");
	}
	
	public static final By treeNodeExpanderSixmasterContainer()
	{
		return By.xpath("//td[contains(@class,'first x-grid-cell')]/div/img");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
