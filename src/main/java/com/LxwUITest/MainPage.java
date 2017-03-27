package com.LxwUITest;
/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月21日上午10:38:44 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	private WebDriver driver;
	private WebElement userMenu;
	
	public MainPage(WebDriver dr){
		this.driver = dr;
		this.userMenu = driver.findElement(By.cssSelector("div#userMenu"));
	}
	
	public String getLoginUserName(){
		return userMenu.getText();
	}

}


