package com.LxwUITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日上午11:17:43 */
public class HomePage{
	private WebDriver driver;
	private WebElement refreshlink;
	private WebElement editlink;
	private WebElement removelink;
	
	public HomePage(WebDriver dr){
		this.driver = dr;

		refreshlink = driver.findElement(By.cssSelector("div.col-sm-6.col-md-7 div#block1 div.panel-heading"))
				.findElement(By.cssSelector("a[class='refresh-panel']"));
		editlink = driver.findElement(By.cssSelector("div.col-sm-6.col-md-7 div#block1 div.panel-heading"))
				.findElement(By.cssSelector("a[class='edit-block']"));
		removelink = driver.findElement(By.cssSelector("div.col-sm-6.col-md-7 div#block1 div.panel-heading"))
				.findElement(By.cssSelector("a[class='remove-panel']"));
	}

}
