package GroupFive.uiframework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebElementUtils{

	public BasePage(WebDriver dr) {
		super(dr);
	}
	
	//获取网页源代码、js弹窗的问题、frame。。。
	
	public String getPageSource(){
		wait(3);
		return driver.getPageSource();
	}
	
	public void alertAccept(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void alertdismiss(){
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public String getalertText(){
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
	
	public void inputAlert(String value){
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}
}
