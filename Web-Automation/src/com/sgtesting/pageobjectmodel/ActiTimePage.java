package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//WebElement for User Name Text Field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//WebElement for Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Users
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUsers;
	public WebElement getUsers()
	{
		return oUsers;
	}
	
	//WebElement for AddUsers
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement oAddUsers;
	public WebElement getAddUsers()
	{
		return oAddUsers;
	}
	//WebElement for FirstName
	@FindBy(xpath="//*[@id=\'userDataLightBox_accountInformationSection\"]/div[3]/div[1]/div[1]/div")
	private WebElement oFirstName;
	public WebElement getFirstName()
	
	{
		return oFirstName;
		
	}
	
	//WebElement for LastName
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement oLastName;
	public WebElement getLastName()
	{
		return oLastName;
	}
	
	//WenElement for Email
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement oEmail;
	public WebElement getEmail()
	{
		return oEmail;
	}
	//WebElement for UsersNames
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement oUserNames;
	public WebElement getUserNames()
	{
		return oUserNames;
	}
	
	//WebElemnt of Password
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement oPassword;
	public WebElement getUserPassword()
	{
		return oPassword;
	}
	
	//WebElement of RetypePassword
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement oRetypePassword;
	public WebElement getRetypepassword()
	{
		
		return oRetypePassword;
	}
	
	//WebElemnt of CreateUser
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
	private WebElement oCreateUser;
	public WebElement getCreateUser()
	{
		return oCreateUser;
	}
	
	

	
	
	
	//WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}
	
}
      //
