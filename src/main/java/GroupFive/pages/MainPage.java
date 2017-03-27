package GroupFive.pages;

import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import GroupFive.uiframework.BasePage;
import GroupFive.uiframework.Locator;


public class MainPage extends BasePage{
	

	
	public MainPage(WebDriver dr){
		super(dr);
	}
	
	Locator userMenu = getLocator("userMenu");
	
	public String getLoginUserName(){
		wait(2);
		return getText(userMenu);
	}

}
