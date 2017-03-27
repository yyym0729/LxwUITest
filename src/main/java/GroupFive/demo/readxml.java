package GroupFive.demo;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import GroupFive.uiframework.Locator;
import GroupFive.utils.xmlUtils;


public class readxml {

	public static void main(String[] args) throws DocumentException {
		HashMap<String,Locator> ls= xmlUtils.readElementInfo("LoginPage.xml");
		ls.get("fantiLink").getElementName();
		
	}
}
