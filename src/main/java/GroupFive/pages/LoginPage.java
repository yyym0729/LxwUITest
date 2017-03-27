package GroupFive.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import GroupFive.config.LocalConfig;
import GroupFive.uiframework.BasePage;
import GroupFive.uiframework.Locator;
import GroupFive.uiframework.MouseUtils;


public class LoginPage extends BasePage{
	
	private Alert alert;


	public LoginPage(WebDriver dr){
		super(dr);
		openWeb(LocalConfig.URL);
	}
	
	Locator usernameInputbox = getLocator("usernameInputbox");
	Locator passwordInputbox = getLocator("passwordInputbox");			
	Locator loginButton = getLocator("loginButton");
	
	public void inputUserName(String name){
		input(usernameInputbox,name);
	}
	
	public void inputPassword(String password){
		input(passwordInputbox,password);
	}
	
	public void clickLoginButton(){
		click(loginButton);		
	}
	

}
