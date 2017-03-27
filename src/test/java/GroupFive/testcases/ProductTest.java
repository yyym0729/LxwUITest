package GroupFive.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import GroupFive.pages.LoginPage;
import GroupFive.pages.MainPage;
import GroupFive.pages.ProductPage;
import GroupFive.utils.AssertUtils;

/** * @author 李小卫 E-mail:2483384955@qq.com @date 创建时间2017年3月22日下午4:18:05 */
public class ProductTest {
	WebDriver driver;
	AssertUtils assertUtils; 
	
	@BeforeMethod//先退出再登录
	public void setUp(){
		assertUtils = new AssertUtils();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @Test
    public void ProductTest01(){
		
    }
    @Test
    public void ProductPage02() throws InterruptedException{
    	
    	
    }

    @AfterTest
    public void tearDown() throws InterruptedException{
    	Thread.sleep(3000);
    	driver.close();
    }
  }


