package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ChangeLanguage {
	
	IOSDriver driver;
	
	public ChangeLanguage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

}
