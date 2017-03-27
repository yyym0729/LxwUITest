package com.LxwUITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日下午1:25:04 */
public class TaskPage {

	private WebDriver driver;
	private WebElement tasklink;
	private WebElement assignedtotab;
	private WebElement openedbytab;
	private WebElement finishedbytab;
	private WebElement closedbytab;
	private WebElement canceledbytab;
	
	public WebDriver getDriver() {
		return driver;
	}

	public TaskPage(WebDriver dr){
		this.driver = dr;
		
		tasklink = driver.findElement(By.cssSelector("nav#modulemenu ul.nav li:nth-of-type(3)"));
		
		assignedtotab = driver.findElement(By.cssSelector("li[id='assignedToTab']"));
		openedbytab = driver.findElement(By.cssSelector("li[id='openedByTab']"));
		finishedbytab = driver.findElement(By.cssSelector("li[id='finishedByTab']"));
		closedbytab = driver.findElement(By.cssSelector("li[id='closedByTab']"));
		canceledbytab = driver.findElement(By.cssSelector("li[id='canceledByTab']"));
		
	}
}
	                                  

