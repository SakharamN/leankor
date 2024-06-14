package pom_package;

import org.openqa.selenium.By;

public class CalenderViewForKanbanBoardAndDependencyLocators{

	public static final By clickOnCalenderViewIcon()
	{
		return By.xpath("//div[@id='calenderViewBtn']");
	}
	
	public static final By zoomToFit()
	{
		//return By.xpath("//div[@style='height: 78px; margin: 0px; right: auto; top: 0px; left: 0px; width: 358px;']//div[@style='left: 0px; height: 56px; top: 18px; width: 354px;']//table[@role='presentation']//a//span[@id='button-1051-btnEl']");
		return By.xpath("//table[@role='presentation']//tbody[@id='buttongroup-1185-tbody']/tr[1]");
	}
	
	public static final By setCalenderPreferenceIcon()
	{
		return By.xpath("//div[@style='width: 122px; left: 0px; top: 0px; height: 26px;']//a[@data-qtip='Set calendar preferences']");
	}
	
	//For Creating card from calendar view in template master container
	public static final By templateSection()
	{
		return By.xpath("//*[contains(@id,'treeview-1040-body')]//*[contains(@style,'text-align:left;border-top: 7px solid #DBDB12;border-left: 3px solid #DBDB12;')]");
	}
	
	public static final By addCardInTemplateSection()
	{
		return By.xpath("//span[text()='Add Card']");
	}
	
	public static final By addCardTitleInputField()
	{
		return By.xpath("//input[@id='textfield-1094-inputEl']");
	}
	
	public static final By addCardSaveButtonUnderTemplate()
	{
		return By.xpath("//span[text()='Save']");
	}
	
	public static final By clickOnCardDependencyArrow()
	{
		return By.xpath("//img[@class='sch-dependency-arrow sch-dependency-arrow-left -arrow']");
	}
	
	public static final By underCardDependencyArrowSignClickOnTypeDropDown()
	{
		return By.xpath("//input[@name='combobox-1028-inputEl']");
	}
	
	public static final By selectValueUnderTypeDropDown()
	{
		return By.xpath("//li[text()='Finish-To-Start']");
	}
	
	public static final By clickonUpdateButtonOfDropDown()
	{
		return By.xpath("//div[@id='toolbar-1032']//a//span[@id='button-1033-btnEl']");
	}
}