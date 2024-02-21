package test_package;

import org.testng.annotations.Test;

import helper_package.CardsCreatingAndCloningInMaterContainerHelper;

public class TestCardsCreatingAndCloningInMaterContainer {

	
	CardsCreatingAndCloningInMaterContainerHelper cardcloning =new CardsCreatingAndCloningInMaterContainerHelper();
	
	@Test(priority=0)
	public void CreateKanbanBoard()
	{
		
		cardcloning.clickOn_CreateFolderProjectKanbanBoardAndCloneCards();
		cardcloning.CardsCreateOnEachMasterContainer();
		
	}
	
	@Test(priority=1)
	public void CardsCreateOnEachMasterContainer()
	{
		cardcloning.CardsCreateOnEachMasterContainer();
	}
}
