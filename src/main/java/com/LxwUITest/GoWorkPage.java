package com.LxwUITest;
/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日下午12:27:50 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoWorkPage {
	
	private WebDriver driver;
	private WebElement goworklink;
	private WebElement todaylink;
	private WebElement yestodaylink;
	private WebElement thisweeek;
	private WebElement lastweeek;
	private WebElement thismonth;
	private WebElement lastmonth;
	private WebElement thisseason;
	private WebElement thisyear;
	private WebElement future;
	private WebElement before;
	private WebElement all;
	private WebElement bydate;
	
	public WebDriver getDriver() {
		return driver;
	}

	public GoWorkPage(WebDriver dr){
		this.driver = dr;
		
		todaylink = driver.findElement(By.cssSelector("nav#modulemenu ul.nav li:nth-of-type(3)"));
		
		todaylink = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(1)"));
		yestodaylink = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(2)"));
		thisweeek = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(3)"));
		lastweeek = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(4)"));
		thismonth = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(5)"));
		todaylink = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(6)"));
		thisseason = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(7)"));
		thisyear = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(8)"));
		future = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(9)"));
		before = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(10)"));
		all = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(11)"));
		bydate = driver.findElement(By.cssSelector("ul.nav li:nth-of-type(12)"));
		
	}
}
	                                                                                                                                    