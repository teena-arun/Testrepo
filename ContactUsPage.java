package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ContactUsPage {
	
	IOSDriver driver;
	
	public ContactUsPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement contactusbackbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Contact Us\"`]")
	public WebElement contactusheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains\"Call at 184 call center\"`]")
	public WebElement callbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Mail us to info@mm.gov.qa\"`]")
	public WebElement emailbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Post office box number 2727\"`]")
	public WebElement poboxnumbtn;
	
	public boolean backtoHomePageClicked(){
		boolean val=false;
		if(contactusbackbtn.isDisplayed()) {
			contactusbackbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to find back button at Contact Us page.");
		}
		return val;
	}
	
	public boolean verifyContactusHeader() {
		
		boolean val=false;
		
		if(contactusheader.isDisplayed()) {
			System.out.println(contactusheader.getText());
			val=true;
		}
		else {
			System.out.println("Contact Us header is not displayed");
		}
		return val;
		
	}
	
	public boolean verifyContactusDetails() {
		
		boolean val=false;
		
		if(callbtn.isDisplayed()) {
			System.out.println(callbtn.getText());
			//callbtn.click();
			val=true;
		}
		else {
			System.out.println("Call details is not available  in Contact Us page");
		}
		
		if(emailbtn.isDisplayed()) {
			System.out.println(emailbtn.getText());
			//emailbtn.click();
			val=true;
		}
		else {
			System.out.println("Email details is not available in Contact Us page");
		}
		
		if(poboxnumbtn.isDisplayed()) {
			System.out.println(poboxnumbtn.getText());
			//poboxnumbtn.click();
			val=true;
		}
		else {
			System.out.println("PO box details is not displayed in Contact Us page");
		}
		return val;
	}
	
	
}
