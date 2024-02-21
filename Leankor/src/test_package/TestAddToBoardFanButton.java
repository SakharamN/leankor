package test_package;

import org.testng.annotations.Test;
import helper_package.AddToBoardFanButtonHelper;
import helper_package.KanbanBoardRegressionHelper;

public class TestAddToBoardFanButton {

	AddToBoardFanButtonHelper addToBoard = new AddToBoardFanButtonHelper();
	KanbanBoardRegressionHelper kb= new KanbanBoardRegressionHelper();
	
	
	@Test(priority=0)
	public void creatingSingleKanbanCard()
	{
		kb.creatingSingleKanbanCard();
		
	}
	
	@Test(priority=1)
	public void AddTextToKanbanBoard()
	{
		addToBoard.addTextToKanbanBoard();
	}
		
	@Test(priority=2)
	public void ResizeText()
	{
		addToBoard.clickOn_TextAreaForResize();
	}	
	
	@Test(priority=3)
	public void LinkText()
	{
		addToBoard.clickOn_LinkTextToKanbanBoard();
	}
	
	@Test(priority=4)
	public void ShuffleTextBehindAnotherText()
	{
		addToBoard.clickOn_TextShuffleToFront();
	}	
	
	@Test(priority=5)
	public void ShuffleTextFrontAnotherText()
	{
		addToBoard.clickOn_TextShuffleToBehind();
	}
	
	@Test(priority=6,enabled=false)
	public void ChatterOnText()
	{
		addToBoard.chatterOnFirstlyCreatedText();
	}	
	
	
	@Test(priority=7)
	public void UpdateTextArea()
	{
		addToBoard.updateText();
	}
	
	
	@Test(priority=8)
	public void AddVisualAnalytic()
	{
		addToBoard.addVisualAnalyticsToKanbanBoard();
	}
	
	@Test(priority=9)
	public void AddImageToKanbanBoard()
	{
		addToBoard.addImageToKanbanBoard();
	}
	
	@Test(priority=10)
	public void LinkImageToKanbanCard()
	{
		addToBoard.clickOn_LinkIcon();
	}
	
	@Test(priority=11)
	public void LockImage()
	{
		addToBoard.clickOn_ImageLockIcon();
	}
	
	@Test(priority=12)
	public void CloneImage()
	{
		addToBoard.clickOn_CloneImage();
	}
	
	@Test(priority=13)
	public void ImageShuffleUpAndDown()
	{
		addToBoard.shuffleImageByClickingUpArrowAndDownArrow();
	}
	
	@Test(priority=14)
	public void ResizeImage()
	{
		addToBoard.clonedImageResize();
	}
	
	@Test(priority=15)
	public void ChatterOnImage()
	{
		addToBoard.chatterOnClonedImage();
	}
	
	@Test(priority=16)
	public void AddKanbanCard()
	{
		addToBoard.addKanbanCardToKanbanBoard();
	}
	
	@Test(priority=17)
	public void UploadSticker()
	{
		addToBoard.uploadStickerOnKanbanBoard();
	}
}