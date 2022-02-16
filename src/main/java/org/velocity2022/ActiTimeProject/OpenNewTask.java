package org.velocity2022.ActiTimeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewTask {

	
	@FindBy (xpath= "//input[@class='taskSearchField']")
	private WebElement addTaskByName;
	
	@FindBy (xpath= "//span[text()='Add Recent Task']")
	private WebElement addRecentTask;
	
	@FindBy (xpath= "//span[text()='Add Tasks from the List']")
	private WebElement addTasksFromList;
	
	@FindBy (xpath= "//span[@onclick='openAddNewTasksPopup();']")
	private WebElement openAddNewTasksPopup;
	
	@FindBy (xpath= "//span[text()='Task']")
	private WebElement tastLists;
	
	@FindBy (xpath= "//td[@width='76px']")
	private WebElement deadLineofTask;
	
	public OpenNewTask(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void addNewTask()
	{
		openAddNewTasksPopup.click();
	}
	
}
