package com.LxwUITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日下午2:54:36 */
public class TestTaskPage {
	private WebDriver driver;
	private WebElement tasklink;
	private WebElement waittesttask;
	private WebElement donetesttask;
	private WebElement assigntometab;
	private WebElement closedbymetab;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public TestTaskPage(WebDriver dr){
		this.driver = dr;
		
		tasklink = driver.findElement(By.cssSelector("nav#modulemenu ul.nav li:nth-of-type(6)"));
		
		waittesttask = driver.findElement(By.cssSelector("li[id='waitTesttask']"));
		donetesttask = driver.findElement(By.cssSelector("li[id='doneTesttask']"));
		assigntometab = driver.findElement(By.cssSelector("li[id='assigntomeTab']"));
		closedbymetab = driver.findElement(By.cssSelector("li[id='closedbymeTab']"));
		
	}
}
