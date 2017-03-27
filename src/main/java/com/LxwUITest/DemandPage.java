package com.LxwUITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日下午3:03:12 */
public class DemandPage {
	private WebDriver driver;
	private WebElement demanlink;
	private WebElement assignedtotab;
	private WebElement openedbytab;
	private WebElement reviewedbytab;
	private WebElement closedbytab;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public DemandPage(WebDriver dr){
		this.driver = dr;
		
            demanlink = driver.findElement(By.cssSelector("nav#modulemenu ul.nav li:nth-of-type(7)"));
		
		assignedtotab = driver.findElement(By.cssSelector("li[id='assignedToTab']"));
		openedbytab = driver.findElement(By.cssSelector("li[id='openedByTab']"));
		reviewedbytab = driver.findElement(By.cssSelector("li[id='reviewedByTab']"));
		closedbytab = driver.findElement(By.cssSelector("li[id='closedByTab']"));
		
	}
}
