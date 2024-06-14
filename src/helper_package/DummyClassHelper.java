package helper_package;

import org.openqa.selenium.By;

import common_package.CommonMethodsOfWebDriver;
//import pom_package.DummyClassLocators;
import pom_package.KanbanBoardSettingLocators;
//import pom_package.WhiteBoardRegressionLocators;

public class DummyClassHelper extends CommonMethodsOfWebDriver {

	public static String dummyHandleValueOfKanbanBoardiFrame;
	
	public static void dummyToBoard()
	{
		/*explicitWaitVisibilityOf(findElement(DummyClassLocators.clickOnFolderName()));
		findElement(DummyClassLocators.clickOnFolderName()).click();
		
		explicitWaitVisibilityOf(findElement(DummyClassLocators.clickOnProjectName()));
		findElement(DummyClassLocators.clickOnProjectName()).click();
		
		explicitWaitVisibilityOf(findElement(DummyClassLocators.clickOnProjectBoard()));
		findElement(DummyClassLocators.clickOnProjectBoard()).click();
		
		explicitWaitVisibilityOf(findElement(DummyClassLocators.clickOnCreatedKanbanBoard()));
		findElement(DummyClassLocators.clickOnCreatedKanbanBoard()).click();
				
		switchToiFrame("boardIfram");
		
		explicitWaitElementBy("invisibilityOfElementLocated", DummyClassLocators.loadMaskAfterSave());
		
		explicitWaitVisibilityOf(findElement(KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon()));
		findElement(KanbanBoardRegressionLocators.clickOn_KanbanBoardZoomIcon()).click();
		
		for(String windowHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(windowHandle);
		}
		
		explicitWaitElementBy("invisibilityOfElementLocated", DummyClassLocators.loadMaskAfterSave());*/
		
		//explicitWaitElementBy("elementToBeLocated", By.tagName("iframe"));
		//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		//Dummy script
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnFolderName());
		findElement(KanbanBoardSettingLocators.clickOnFolderName()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnProjectName());
		findElement(KanbanBoardSettingLocators.clickOnProjectName()).click();
		
		//explicitWaitElementBy("elementToBeLocated", DummyClassLocators.clickOnProjectNameAnotherOne());
		//findElement(DummyClassLocators.clickOnProjectNameAnotherOne()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnProjectBoard());
		findElement(KanbanBoardSettingLocators.clickOnProjectBoard()).click();
		
		//explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.clickOnWhiteBoard());
		//findElement(WhiteBoardRegressionLocators.clickOnWhiteBoard()).click();
		
		explicitWaitElementBy("elementToBeLocated", KanbanBoardSettingLocators.clickOnCreatedKanbanBoard());
		findElement(KanbanBoardSettingLocators.clickOnCreatedKanbanBoard()).click();
		
		//explicitWaitElementBy("elementToBeLocated", DummyClassLocators.clickOnCreatedKanbanBoardAnotherOne());
		//findElement(DummyClassLocators.clickOnCreatedKanbanBoardAnotherOne()).click();
		
		//explicitWaitElementBy("elementToBeLocated", WhiteBoardRegressionLocators.selectCreatedWhiteBoard());
		//findElement(WhiteBoardRegressionLocators.selectCreatedWhiteBoard()).click();
		
		switchToiFrame("boardIfram");
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
		
		dummyHandleValueOfKanbanBoardiFrame = driver.getWindowHandle();
		System.out.println("Window handle value from dummy method iFrame:"+dummyHandleValueOfKanbanBoardiFrame+"\n*******************************************************************************************************************");
		try{Thread.sleep(2000);}catch (InterruptedException ie) {}
		explicitWaitVisibilityOf(findElement(KanbanBoardSettingLocators.clickOn_KanbanBoardZoomIcon()));
		findElement(KanbanBoardSettingLocators.clickOn_KanbanBoardZoomIcon()).click();
		
		for(String windowHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(windowHandle);
		}
		
		explicitWaitElementBy("invisibilityOfElementLocated", KanbanBoardSettingLocators.loadMaskAfterSave());
	}
	
	public void createCategory()
	{
		driver.findElement(By.xpath("//*[text()='Card1']/following::div[@class='footer'][1]/ul/li[8]")).click();
		try{Thread.sleep(1000);}catch (InterruptedException ie1) {}
	 	
	 	driver.findElement(By.xpath("//*[text()='Card Info']")).click();
	 	try{Thread.sleep(3000);}catch (InterruptedException ie1) {} 
	 	
	 	driver.findElement(By.xpath("//*[text()='Category']/following::div[1]//span[3]")).click();
	 	//Thread.sleep(2000);
	 	//Actions category = new Actions(driver);
	    //category.moveToElement(driver.findElement(By.xpath("//*[text()='Category']/following::div[1]//span[@class='btn_lbl_cls' ]"))).build().perform();
	 	//category.moveToElement(driver.findElement(By.xpath("//*[text()='Category']/following::div[1]//span[text()='Default']"))).build().perform();
	    //driver.findElement(By.xpath("//*[text()='Category']/following::div[1]//span[@class='btn_lbl_cls' ]")).click();
	 	try{Thread.sleep(1000);}catch (InterruptedException ie1) {}
	 	
	 	//int count=1;
	 	
	 	for(int i=31; i<=50; i++)
	 	{
	 		driver.findElement(By.xpath("//*[text()='Create']")).click();
	 		try{Thread.sleep(1000);}catch (InterruptedException ie1) {}
	 	
	 		driver.findElement(By.xpath("//*[text()='Category Name']/following::div[1]//input")).sendKeys("COD Requirements - William J Rutter Center Parking Structure"+i);
	 		
	 		try {Thread.sleep(1000);}catch (InterruptedException ie1){}
	 			 		
	 		driver.findElement(By.xpath("//*[text()='Apply to All Projects']/following::div[1]//input/following-sibling::div[1]")).click();
	 		
	 		try {Thread.sleep(1000);}catch (InterruptedException ie1){}
	 	 	driver.findElement(By.xpath("//body//*[@id='ext-viewport']/*[@class='x-body']/div[1]/div[@class='x-dock x-dock-vertical x-sized'][1]/div[2]/div[1]/div[2]/span[text()='Save']")).click();
	 	 	
	 	 	System.out.print(i+" ");
	 	}
	 	System.out.println("***********************************************************************************************************");
	 	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	 	
	 	for(int i=51; i<=100; i++)
	 	{
	 		driver.findElement(By.xpath("//*[text()='Create']")).click();
	 		try{Thread.sleep(1000);}catch (InterruptedException ie1) {}
	 	
	 		driver.findElement(By.xpath("//*[text()='Category Name']/following::div[1]//input")).sendKeys("Award Notification - Sierra Madre Apts, Carport"+i);
	 		
	 		try {Thread.sleep(1000);}catch (InterruptedException ie1){}
	 			 		
	 		driver.findElement(By.xpath("//*[text()='Apply to All Projects']/following::div[1]//input/following-sibling::div[1]")).click();
	 		
	 		try {Thread.sleep(1000);}catch (InterruptedException ie1){}
	 	 	driver.findElement(By.xpath("//body//*[@id='ext-viewport']/*[@class='x-body']/div[1]/div[@class='x-dock x-dock-vertical x-sized'][1]/div[2]/div[1]/div[2]/span[text()='Save']")).click();
	 	 	System.out.print(i+" ");
	 	}
	 	
	 	System.out.println("***********************************************************************************************************");
	 	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	 	
	 	for(int i=101; i<=150; i++)
	 	{
	 		driver.findElement(By.xpath("//*[text()='Create']")).click();
	 		try{Thread.sleep(1000);}catch (InterruptedException ie1) {}
	 	
	 		driver.findElement(By.xpath("//*[text()='Category Name']/following::div[1]//input")).sendKeys("Approval to Mobilize - Sierra Madre Apts, Carport"+i);
	 		
	 		try {Thread.sleep(1000);}catch (InterruptedException ie1){}
	 			 		
	 		driver.findElement(By.xpath("//*[text()='Apply to All Projects']/following::div[1]//input/following-sibling::div[1]")).click();
	 		
	 		try {Thread.sleep(1000);}catch (InterruptedException ie1){}
	 	 	driver.findElement(By.xpath("//body//*[@id='ext-viewport']/*[@class='x-body']/div[1]/div[@class='x-dock x-dock-vertical x-sized'][1]/div[2]/div[1]/div[2]/span[text()='Save']")).click();
	 	 	System.out.print(i+" ");
	 	}
	 	
	 	
	 	try {Thread.sleep(1000);}catch(InterruptedException ie) {}
	 	driver.findElement(By.xpath("//span[text()='Save']")).click();
	}
}