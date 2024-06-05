package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HamburgerPage {
	
	IOSDriver driver;
	public HamburgerPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Close menu\"`]")
	public WebElement closehamburger;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Hello\"`]")
	public WebElement hellotxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Contact Number\"`]")
	public WebElement contactnum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Address/Area\"`]")
	public WebElement addressarea;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"Settings\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement settingsbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"Notifications\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement notificationsbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"Add Nominee\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement addnomineebtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"FAQ\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement faqbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"عربي\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement languagebtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"Contact Us\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement contactusbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"Logout\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement logoutbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Facebbok\"`]")
	public WebElement facebookbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Twitter\"`]")
	public WebElement twitterbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Linkedin\"`]")
	public WebElement linkedinbtn;
	
	public boolean verifyHeaderArear() {
		boolean val=false;
		if(hellotxt.isDisplayed()) {
			System.out.println(hellotxt.getText());
			val=true;
		}
		else {
			System.out.println("Hello text is not displayed in Hamburger menu");
		}
		
		if(contactnum.isDisplayed()) {
			System.out.println(contactnum.getText());
			val=true;
		}
		else {
			System.out.println("COntact number is not displayed in Hamburger menu");
		}
		
		if(addressarea.isDisplayed()) {
			System.out.println(addressarea.getText());
			val=true;
		}
		else {
			System.out.println("Address area is not displayed");
		}
		return val;
			
		
	}
	
	public boolean verifyHamburgerMenu() {
		boolean val=false;
		if(settingsbtn.isDisplayed()) {
			System.out.println("Settings option is displayed in Hamburger menu");
			val=true;
		}
		else {
			System.out.println("Settings option is not displayed");
		}
		
		if(notificationsbtn.isDisplayed()) {
			System.out.println("Notifications option is displayed at Hmburger menu.");
			val=true;
		}
		else {
			System.out.println("Notifications option is not displayed in Hamburger menu");
		}
		
		if(addnomineebtn.isDisplayed()) {
			System.out.println("Add nominee option is displayed in  Hamburger menu.");
			val=true;
		}
		else {
			System.out.println("Add nominee option is not displayed in Hamburger menu.");
		}
		
		if(faqbtn.isDisplayed()) {
			System.out.println("FAQ option is displayed in Hamburger menu.");
			val=true;
		}
		else {
			System.out.println("FAQ option is not displayed in Hamburger menu");
		}
		
		if(languagebtn.isDisplayed()) {
			System.out.println("Change Language option is displayed in Hamburger menu.");
			val=true;
		}
		else {
			System.out.println("Change Language option is not displayed in Hamburger menu.");
		}
		
		if(contactusbtn.isDisplayed()) {
			System.out.println("Contact Us option is displayed in Hamburger menu.");
			val=true;
		}
		else {
			System.out.println("Contact Us option is not displayed in Hamburger menu.");
		}
		
		if(logoutbtn.isDisplayed()) {
			System.out.println("Logout option is displayed in Hamburger menu.");
			val=true;
		}
		else {
			System.out.println("Logout option is not displayed in Hamburger menu.");
		}
		return val;
	}
	
	public boolean verifySocialMediaLinks() {
		boolean val=false;
		if(facebookbtn.isDisplayed()) {
			System.out.println("Facebook link is displayed in Hamburger menu footer.");
			val=true;
		}
		else {
			System.out.println("Facebook link is not displayed in Hamburger menu footer.");
		}
		
		if(twitterbtn.isDisplayed()) {
			System.out.println("Twitter link is displayed in Hamburger menu footer.");
			val =true;
		}
		else {
			System.out.println("Twitter link is not displayed in Hamburger menu footer.");
		}
		
		if(linkedinbtn.isDisplayed()) {
			System.out.println("Linkedin link is displayed in Hamburger menu footer");
			val=true;
		}
		else {
			System.out.println("Linkedin link is not displyed in Hamburger menu footer.");
		}
		return val;
	}
	
	public boolean closeHamburgerMenu() {
		boolean val=false;
		if(closehamburger.isDisplayed()) {
			closehamburger.click();
			val=true;
		}
		else {
			System.out.println("Not able to close Hamburger menu.");
		}
		return val;
	}
	
	public boolean settingsLinkClicked() {
		boolean val=false;
		if(settingsbtn.isDisplayed()) {
			settingsbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to Settings Page");
		}
		return val;
	}
	
	public boolean notificationsLinkClicked() {
		boolean val=false;
		if(notificationsbtn.isDisplayed()) {
			notificationsbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to Notifications page");
		}
		return val;
	}
	
	public boolean addNomineeLinkClicked() {
		boolean val=false;
		
		if(addnomineebtn.isDisplayed()) {
			addnomineebtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to Add Nominee Page from Hamburger menu");
		}
		return val;
	}
	
	public boolean faqLinkClicked() {
		
		boolean val=false;
		if(faqbtn.isDisplayed()) {
			faqbtn.click();
			val=true;
		}
		else {
			System.out.println("not able to navigate to FAQ page from Hamburger menu");
		}
		return val;
	}
	
	public boolean changeLanguageLinkClicked() {
		boolean val=false;
	
		if(languagebtn.isDisplayed()) {
			languagebtn.click();
			val=true;
	}
		else {
			System.out.println("Not able to navigate to change language page from Hamburger menu");
		}
		return val;
}
	
	public boolean contactUsLinkClicked() {
		boolean val=false;
		if(contactusbtn.isDisplayed()) {
			contactusbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to Contact Us page from Hamburger menu");
		}
	
		return val;
	}
	
	public boolean logoutLinkClicked() {
		boolean val=false;
		if(logoutbtn.isDisplayed()) {
			logoutbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to Logout page from Hamburger menu");
		}
		return val;
	}
	
	public boolean facebookLinkClicked() {
		boolean val=false;
		if(facebookbtn.isDisplayed()) {
			facebookbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to Facebook page from Hamburger menu");
		}
		return val;
	}
	
	public boolean twitterLinkClicked() {
		boolean val=false;
		if(twitterbtn.isDisplayed()) {
			twitterbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to twitter page from Hamburger menu");
		}
		return val;
	}
	
	
	public boolean linkedinLinkClicked() {
		boolean val=false;
		if(twitterbtn.isDisplayed()) {
			twitterbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to Linkedin page from Hamburger menu");
		}
		return val;
	}
}
