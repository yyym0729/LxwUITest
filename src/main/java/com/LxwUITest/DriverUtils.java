package com.LxwUITest;

import org.openqa.selenium.WebDriver;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月21日下午3:44:43 */
public class DriverUtils {
     protected WebDriver driver;
     
     public DriverUtils(WebDriver dr){
    	 driver = dr;
     }
     
     public void openWeb(String url){
    	 driver.get(url);
     }
     
     public void back(){
    	 driver.navigate().back();
     }
     
     public void forward(){
    	 driver.navigate().forward();
     }
     
}    
