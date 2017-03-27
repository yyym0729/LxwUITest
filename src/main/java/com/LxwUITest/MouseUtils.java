package com.LxwUITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日上午9:55:05 */
public class MouseUtils {
    private Actions action;
    
    public MouseUtils(WebDriver dr){
    	action = new Actions(dr);
    }
}
