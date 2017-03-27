package com.LxwUITest;
/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月21日下午8:36:33 */
public class LocalConfig {
	
	static PropertiesUtils propertiesUtils = new PropertiesUtils("local.properties");
	public static final String URL = propertiesUtils.getPropertieValue("url");
	public static final String CHROME_PATH = propertiesUtils.getPropertieValue("chromeDriverPath");
	public static final String FIREFOX_PATH = propertiesUtils.getPropertieValue("fireFoxDriverPath");
	public static final String IE_PATH = propertiesUtils.getPropertieValue("ieDriverPath");
	

}
