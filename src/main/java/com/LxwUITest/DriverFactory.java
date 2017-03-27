package com.LxwUITest;
/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月21日下午11:36:54 */
import java.io.IOException;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	private static WebDriver driver;
	static Runtime runtime = Runtime.getRuntime();
	
	public static WebDriver getChromeDriver(){
		try {
			runtime.exec("taskkill /F /IM chrome.exe");//杀死进程
		} catch (IOException e) {
			e.printStackTrace();
		}
		String driverPath = System.getProperty("user.dir")+LocalConfig.CHROME_PATH;
		System.setProperty("webdriver.chrome.driver",driverPath);
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches",
				Arrays.asList("--start-maximized"));
		options.addArguments("--test-type", "--start-maximized");
		driver = new ChromeDriver(options);
		return driver;
	}
	
	
	public static WebDriver getFirefoxDriver() {
		try {
			runtime.exec("taskkill /F /IM firefox.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String path = System.getProperty("user.dir")+"/Driver/geckodriver.exe";
		System.setProperty("webdriver.firefox.driver",path);
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("extensions.firebug.currentVersion", "2.0.4");
		profile.setPreference("extensions.firebug.allPagesActivation",
				"off");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "C:\\selenium");
		profile.setPreference(
				"browser.helperApps.neverAsk.saveToDisk",
				"application/octet-stream, applicationnd.ms-excel, text/csv, application/zip,application/exe");
		driver = new FirefoxDriver(profile);
		return driver;
		
		
	}

	
	
}

