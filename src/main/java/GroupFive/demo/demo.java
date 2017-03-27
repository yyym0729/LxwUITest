package GroupFive.demo;

import org.openqa.selenium.WebDriver;

import GroupFive.utils.PropertiesUtils;


public class demo {

	public static void main(String[] args) {
		PropertiesUtils propertiesUtils = new PropertiesUtils("local.properties");
		String url = propertiesUtils.getPropertieValue("url");
		System.out.println(url);
//		WebDriver driver = DriverFactory.getChromeDriver();
//		driver.get("https://www.baidu.com");
//		String path = System.getProperty("user.dir");
//		System.out.println(path+"\\Driver");
	}

}
