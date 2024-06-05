package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LogoutPage {
	
	IOSDriver driver;
	
	public LogoutPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement logoutalertbox;
	
	@iOSXCUITFindBy(accessibility="Are you sure you want to logout?")
	public WebElement logoutalertmsg;
	
	@iOSXCUITFindBy(iOSNsPredicate="name == \"Ok\" AND label == \"Ok\" AND type == \"XCUIElementTypeButton\"")
	public WebElement logoutalertokbrn;
	
	@iOSXCUITFindBy(iOSNsPredicate="name == \"Cancel\" AND label == \"Cancel\" AND type == \"XCUIElementTypeButton\"")
	public WebElement logoutalertcancelbtn;
	
	//Login
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Login/authenticate\"`]")
	public WebElement loginbtn;
	
	public boolean confirmLogoutAlertbox() throws InterruptedException {
		
		boolean val=false;
		
			//System.out.println(logoutalertmsg.getText());
						
			if(logoutalertokbrn.isDisplayed()) {
				Thread.sleep(3000);
			logoutalertokbrn.click();
			val=true;
			}
			else {
				System.out.println("Ok button is not found");
			}
			
		return val;
	}
	
	public boolean Login() {
		boolean val=false;
		
		if(loginbtn.isDisplayed()) {
			loginbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to login");
		}
		return val;
	}

}
