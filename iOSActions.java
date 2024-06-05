package qatar.livestock.pageObjects.ios;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;
import qatar.livestock.utilities.iOSBaseTest;

public class iOSActions extends iOSBaseTest{
	
	public void IOSLongPress() {
		WebElement ele=driver.findElement(AppiumBy.iOSClassChain(""));
		Map <String,Object>params=new HashMap<>();
		params.put("element", ((RemoteWebElement)ele).getId());
		params.put("duration",5);
		driver.executeScript("mobile:touchAndHold",params);
	}
	
	public void ScrollText() throws InterruptedException {
		
		WebElement ele=driver.findElement(AppiumBy.accessibilityId(""));
		Map<String, Object>params=new HashMap<>();
		params.put("direction", "down");
		params.put("element", ((RemoteWebElement)ele).getId());
		driver.executeScript("mobile:scroll", params);
		Thread.sleep(2000);
		
		
	}

}
