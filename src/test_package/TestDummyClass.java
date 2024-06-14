package test_package;

import org.testng.annotations.Test;

import helper_package.DummyClassHelper;

public class TestDummyClass {

	DummyClassHelper dch = new DummyClassHelper();
	
	@Test
	public void TowardsFolderBoard()
	{
		DummyClassHelper.dummyToBoard();
	}
	
	@Test
	public void Category()
	{
		dch.createCategory();
	}
	
}
