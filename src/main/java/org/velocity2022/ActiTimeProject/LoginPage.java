package org.velocity2022.ActiTimeProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath = "//input[@type='text']")
	private WebElement userNameToLogin;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement passwordToLogin;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement rememberMeCheckBox;
	
	@FindBy (xpath = "(//tbody//a//div)[1]")
	private WebElement loginButtonToLogin;
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginToApplicationAction()
	{
		userNameToLogin.sendKeys("admin");
		passwordToLogin.sendKeys("manager");
		rememberMeCheckBox.click();
		loginButtonToLogin.click();
	}
	
//	@FindBy (xpath= "//input[@class='taskSearchField']")
//	private WebElement addTaskByName;
//	
//	@FindBy (xpath= "//span[text()='Add Recent Task']")
//	private WebElement addRecentTask;
//	
//	@FindBy (xpath= "//span[text()='Add Tasks from the List']")
//	private WebElement addTasksFromList;
//	
//	@FindBy (xpath= "//span[@onclick='openAddNewTasksPopup();']")
//	private WebElement openAddNewTasksPopup;
//	
//	@FindBy (xpath= "//span[text()='Task']")
//	private WebElement tastLists;
//	
//	@FindBy (xpath= "//td[@width='76px']")
//	private WebElement deadLineofTask;
//	
//	public LoginPage(WebDriver driver) 
//	{
//		PageFactory.initElements(driver, this);
//	}
//	public void addNewTask()
//	{
//		openAddNewTasksPopup.click();
//	}
}
