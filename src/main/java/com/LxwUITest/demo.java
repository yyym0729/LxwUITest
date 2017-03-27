package com.LxwUITest;
/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月21日下午11:38:43 */
import org.openqa.selenium.WebDriver;

public class demo {

	public static void main(String[] args) {
//		PropertiesUtils propertiesUtils = new PropertiesUtils("local.properties");
//		String url = propertiesUtils.getPropertieValue("url");
//		System.out.println(url);
		WebDriver driver = DriverFactory.getChromeDriver();
		driver.get("https://www.baidu.com");
//		String path = System.getProperty("user.dir");
//		System.out.println(path+"\\Driver");
	}
}
