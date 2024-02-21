package helper_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import common_package.CommonMethodsOfWebDriver;
import pom_package.CreateCardLocators;

public class ApplyStickerToAllKanbanCardHelper extends CommonMethodsOfWebDriver {
	
	


	final int divisor = 5;
	
	public void addStickersOnBacklogMasterContainerKanbanCards()
	{		
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
		
		//Sticker added on Backlog Master Container's cards
		int i;
		int x=0;
		int y=1;
		int z=x+y;
		System.out.println("\nValue of z outside the loop : "+z);
		for(i=1; i<=FolderProjectKanbanCardHelper.cardLimit; i++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			//Edit Card code
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+z+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+z+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")).click();
						
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(CreateCardLocators.clickOnStickerSideColumn()));
			findElement(CreateCardLocators.clickOnStickerSideColumn()).click();
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.getFormIdAttributeColumn()));
			String trimValue = findElement(CreateCardLocators.getFormIdAttributeColumn()).getAttribute("id").substring(17);
			
			//apply sticker
			for(int count=11;count<=20;count++)
			{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("arguments[0].scrollIntoView();",findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")));
				findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")).click();
				try {Thread.sleep(500);}catch(InterruptedException ie) {}
			}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
			findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
						
			System.out.print(divisor*i+" ");
			
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+divisor+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
			
			x = divisor;
			y = z;
			z = x+y;
			System.out.print(z+" \n");
		}
		System.out.println("last of value of i :--> "+i);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
				
		scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-32']//div[@id='ext-dataview-element-container-2']/div["+divisor+"/FolderProjectKanbanCardHelper.cardLimit)+"]//div[@class='kanbancard ']/div[2]/div[2]/ul/li[8]")));
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	//Sticker added on InProgress Master Container's cards
	public void addStickersOnInProgressMasterContainerKanbanCards()
	{
		int j;
		int a = 0;
		int b = 1;
		int sum = a+b;
		System.out.println("Value of sum outside the loop : "+sum);
		
		for(j=1; j<=FolderProjectKanbanCardHelper.cardLimit; j++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+sum+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+sum+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
							
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(CreateCardLocators.clickOnStickerSideColumn()));
			findElement(CreateCardLocators.clickOnStickerSideColumn()).click();
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
				
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.getFormIdAttributeColumn()));
			String trimValue = findElement(CreateCardLocators.getFormIdAttributeColumn()).getAttribute("id").substring(17);
				
			for(int count=11;count<=20;count++)
			{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;			
				js1.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")));					
				driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")).click();
				try {Thread.sleep(500);}
				catch(InterruptedException ie) {}
			}
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
			findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
						
			System.out.print(divisor*j+" ");			
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+(divisor*j)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
						
			a = divisor;
			b = sum;
			sum = a+b;
			System.out.print(sum +" \n");
			
		}
		System.out.println("\nlast of value of j :--> "+j);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-33']//div[@id='ext-dataview-element-container-3']/div["+(divisor*(j-1)/FolderProjectKanbanCardHelper.cardLimit)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	//START FROM HERE SCRIPT  Sticker added on Review&Approval Master Container's cards//
	public void addStickersOnReviewAndApprovalMasterContainerKanbanCards()
	{
		int k;
		int p = 0;
		int q = 1;
		int r = p+q;
		System.out.println("Value of r outside the loop is : "+r);
		
		for(k=1; k<=FolderProjectKanbanCardHelper.cardLimit; k++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+r+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+r+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
							
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(CreateCardLocators.clickOnStickerSideColumn()));
			findElement(CreateCardLocators.clickOnStickerSideColumn()).click();
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.getFormIdAttributeColumn()));
			String trimValue = findElement(CreateCardLocators.getFormIdAttributeColumn()).getAttribute("id").substring(17);
			
			for(int count=11;count<=20;count++)
			{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;			
				js1.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")));					
				driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")).click();
				try {Thread.sleep(500);}
				catch(InterruptedException ie) {}
			}

			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
			findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
						
			System.out.print(divisor*k+" ");			
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+(divisor*k)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
						
			p = divisor;
			q = r;
			r = p+q;
			System.out.print(r +" \n");
		}
		
		System.out.println("\nlast of value of k :--> "+k);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-34']//div[@id='ext-dataview-element-container-4']/div["+(divisor*(k-1)/FolderProjectKanbanCardHelper.cardLimit)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	//Sticker added on Done Master Container's cards
	public void addStickersOnDoneMasterContainerKanbanCards()
	{
		int l;
		int e = 0;
		int f = 1;
		int g = e+f;
		System.out.println("Value of g outside the loop : " +g);
		
		for(l=1; l<=FolderProjectKanbanCardHelper.cardLimit; l++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+g+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+g+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
							
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(CreateCardLocators.clickOnStickerSideColumn()));
			findElement(CreateCardLocators.clickOnStickerSideColumn()).click();
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.getFormIdAttributeColumn()));
			String trimValue = findElement(CreateCardLocators.getFormIdAttributeColumn()).getAttribute("id").substring(17);
			
			for(int count=11;count<=20;count++)
			{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;			
				js1.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")));					
				driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")).click();
				try {Thread.sleep(500);}
				catch(InterruptedException ie) {}
			}

			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
			findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
						
			System.out.print(divisor*l+" ");
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+(divisor*l)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
						
			e = divisor;
			f = g;
			g = e+f;
			System.out.print(g +" \n");
		}
		
		System.out.println("\nlast of value of l :--> "+l);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-35']//div[@id='ext-dataview-element-container-5']/div["+(divisor*(l-1)/FolderProjectKanbanCardHelper.cardLimit)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
		try {Thread.sleep(2000);}catch(InterruptedException ie) {}
	}
	
	
	//Sticker added on Archive Master Container's cards
	public void addStickersOnArchiveMasterContainerKanbanCards()
	{
		int i;
		int x = 0;
		int y = 1;
		int z = x+y;
		System.out.println("Value of z outside the loop : "+z);
		
		for(i=1; i<=FolderProjectKanbanCardHelper.cardLimit; i++)
		{
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+z+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
			findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+z+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")).click();
							
			try {Thread.sleep(1000);}catch(InterruptedException ie) {}
			scrollinToView(findElement(CreateCardLocators.clickOnStickerSideColumn()));
			findElement(CreateCardLocators.clickOnStickerSideColumn()).click();
			try {Thread.sleep(4000);}catch(InterruptedException ie) {}
			
			explicitWaitElementToBeClickable(findElement(CreateCardLocators.getFormIdAttributeColumn()));
			String trimValue = findElement(CreateCardLocators.getFormIdAttributeColumn()).getAttribute("id").substring(17);
			
			for(int count=11;count<=20;count++)
			{
				JavascriptExecutor js1 = (JavascriptExecutor) driver;			
				js1.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")));					
				driver.findElement(By.xpath("//*[@id='ext-stickersView-"+trimValue+"']/div[1]/div[2]//*[@style='transform: translate3d(0px, 0px, 0px);']/div["+count+"]")).click();
				try {Thread.sleep(500);}
				catch(InterruptedException ie) {}
			}

			explicitWaitElementToBeClickable(findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()));
			findElement(CreateCardLocators.clickOnEditCardFinalSaveButton()).click();
						
			System.out.print(divisor*i+" ");			
			scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+(divisor*i)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
						
			x = divisor;
			y = z;
			z = x+y;
			System.out.print(z +" \n");
		}
		
		System.out.println("\nlast of value of i :--> "+i);
		try {Thread.sleep(1000);}catch(InterruptedException ie) {}
		scrollinToView(findElement(By.xpath("//form[@id='ext-zonePanel-36']//div[@id='ext-dataview-element-container-6']/div["+(divisor*(i-1)/FolderProjectKanbanCardHelper.cardLimit)+"]//div[@class='kanbancard  visibleKanbanCardClass']/div[2]/div[2]/ul/li[8]")));
	}
}