package com.LxwUITest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日上午8:52:51 */
public class WebElemntUtils extends DriverUtils{
      public WebElemntUtils(WebDriver dr){
    	  super(dr);
      }
      
      //查找元素xpath//
      //
      public WebElement findElement (String by,String locatorValue){
    	  WebElement el;
    	  switch(by){ //java1.7以上版本支持字符串
    	  case "id":
    		  el = driver.findElement(By.cssSelector(locatorValue));
    		  break;
    	  case "name":
    		  el = driver.findElement(By.cssSelector(locatorValue));
    		  break;
    	  case "xpath":
    		  el = driver.findElement(By.cssSelector(locatorValue));
    		  break;
    	  case "css":
    		  el = driver.findElement(By.cssSelector(locatorValue));
    		  break;
          default:
    		  el = driver.findElement(By.cssSelector(locatorValue)); 
    	  }
    	  return el;
    	  
      }
      
}
