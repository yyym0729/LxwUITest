package com.LxwUITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日下午3:05:58 */
public class DynamicPage {
	private WebDriver driver;
	private WebElement dynamiclink;
	private WebElement todaylink;
	private WebElement yesterdaylink;
	private WebElement twodaysagolink;
	private WebElement thisweeklink;
	private WebElement lastweeklink;
	private WebElement thismonthlink;
	private WebElement lastmonthlink;
	private WebElement alllink;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public DynamicPage(WebDriver dr){
		this.driver = dr;
		
            dynamiclink = driver.findElement(By.cssSelector("nav#modulemenu ul.nav li:nth-of-type(8)"));
		
            todaylink = driver.findElement(By.cssSelector("li[id='today']"));
            yesterdaylink = driver.findElement(By.cssSelector("li[id='yesterday']"));
            twodaysagolink = driver.findElement(By.cssSelector("li[id='twodaysago']"));
            thisweeklink = driver.findElement(By.cssSelector("li[id='thisweek']"));
            lastweeklink = driver.findElement(By.cssSelector("li[id='lastweek']"));
            thismonthlink = driver.findElement(By.cssSelector("li[id='thismonth']"));
            lastmonthlink = driver.findElement(By.cssSelector("li[id='lastmonth']"));
            alllink = driver.findElement(By.cssSelector("li[id='all']"));
		
	}
}
