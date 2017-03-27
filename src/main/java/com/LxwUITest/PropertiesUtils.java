package com.LxwUITest;
/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月21日下午3:04:54 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {
	private static Properties properties = null;
	private static String propertiesFileName;
	
	public PropertiesUtils(String path){
		this.propertiesFileName = path;		
	}
	public  String getPropertieValue(String keyName){
		properties = new Properties();
		InputStream in = PropertiesUtils.class.getClassLoader()
                .getResourceAsStream("config/" + propertiesFileName);
		String value = null;
		try {
			properties.load(in);
			value = properties.getProperty(keyName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
