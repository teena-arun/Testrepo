package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NotificationsPage {
	
	IOSDriver driver;
	
	public NotificationsPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Notifications\"`]")
	public WebElement notificationsheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"REQ\"`]")
	public List<WebElement> notificationlist;
	
	public boolean verifyHeading() {
		boolean val=false;
		if(notificationsheader.isDisplayed()) {
			System.out.println(notificationsheader.getText());
			val=true;
		}
		else {
			System.out.println("Header is not displayed at Notifications page under Hamburger menu");
		}
		return val;
	}
	public boolean verifyNotificationsList() throws InterruptedException {
		boolean val=false;
		//Thread.sleep(3000);
		System.out.println(notificationlist.size());
		if(notificationlist.size()!=0) {
			for(int i=0;i<notificationlist.size();i++) {
			notificationlist.get(0).click();
			}
			val=true;
			

		}
		else {
			System.out.println("Not able to verify notifications list.");
		}
		return val;
	}
	
	public boolean backToHomePage() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate back to notifications page");
		}
		return val;
	}

}
