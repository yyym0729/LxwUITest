package com.LxwUITest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月21日上午10:22:18 */
public class LoginPage {
	
	private WebDriver driver;
	private WebElement usernameInputBox;
	private WebElement passwordInputBox;
	private WebElement loginButton;
	private Alert alert;
	
	public WebDriver getDriver() {
		return driver;
	}

	public LoginPage(WebDriver dr){
		this.driver = dr;

		driver.get("http://127.0.0.1/zentao");

		driver.get(LocalConfig.URL);

		usernameInputBox = driver.findElement(By.cssSelector("input#account"));
		passwordInputBox = driver.findElement(By.cssSelector("input[name='password']"));
		loginButton = driver.findElement(By.cssSelector("button#submit"));
	}
	
	public MainPage loginOperate(String name,String password){
		usernameInputBox.sendKeys(name);
		passwordInputBox.sendKeys(password);
		loginButton.click();
		return new MainPage(getDriver());
	}
	
	public String loginFailOperate(String name,String password){
		usernameInputBox.sendKeys(name);
		passwordInputBox.sendKeys(password);
		loginButton.click();
		wait(2);
		alert= driver.switchTo().alert();
		String value = alert.getText();
		alert.accept();
		return value;
	}
	
	public void wait(int seconds){
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
