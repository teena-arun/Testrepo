package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NotificationsDetails {
	IOSDriver driver;
	
	public NotificationsDetails(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Notifications\"`]")
	public WebElement header;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 2:Schedule tagging request\"`]")
	public WebElement reqheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Tagging Request Number - REQ\"`]")
	public WebElement reqnum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Request Status\"`]")
	public WebElement reqstatus;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Appointment Date\"`]")
	public WebElement appointmentdate;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Technician Name\"`]")
	public WebElement technicianname;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Scheduled Date \"`]")
	public WebElement scheduleddate;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Tagging Details \"`]")
	public WebElement tagdetails;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains\"Comments \"`]")
	public WebElement comments;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Call technician\"`]")
	public WebElement callbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Premise \"`]")
	public WebElement premise;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Location \"`]")
	public WebElement location;
	
	public boolean backToNotificationsList() {
		boolean val=false;
		
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Back button is not found");
		}
		return val;
		
	}
	
	public boolean verifyNitificationHeader() {
		boolean val=false;
		
		if(header.isDisplayed()) {
			System.out.println(header.getText());
			val=true;
		}
		else {
			System.out.println("Notifications Header is not available");
			
		}
		return val;
	}
	
	public boolean verifyNotificationsDetails() {
		boolean val=false;
		if(reqheader.isDisplayed()) {
			System.out.println(reqheader.getText());
			val=true;
		}
		else {
			System.out.println("System header is not found");
		}
		
		if(reqnum.isDisplayed()) {
			System.out.println(reqnum.getText());
			val=true;
		}
		else {
			System.out.println("Request number is not found");
		}
		
		if(reqstatus.isDisplayed()) {
			System.out.println(reqstatus.getText());
				val=true;
			}
			else {
				System.out.println("Request status is not displayed");
			}
		
		if(appointmentdate.isDisplayed()) {
			System.out.println(appointmentdate.getText());
			val=true;
		}
		else {
			System.out.println("Appointment date is not found");
		}
		
		if(technicianname.isDisplayed()) {
			System.out.println(technicianname.getText());
			val=true;
		}
		else {
			System.out.println("Technician name is not found");
		}
		
		if(scheduleddate.isDisplayed()) {
			System.out.println(scheduleddate.getText());
			val=true;
		}
		else {
			System.out.println("Scheduled Date is not found");
		}
		
		if(tagdetails.isDisplayed()) {
			System.out.println(tagdetails.getText());
			val=true;
		}
		else {
			System.out.println("Tagging details is not found");
		}
		
		if(comments.isDisplayed()) {
			System.out.println(comments.getText());
			val=true;
		}
		else {
			System.out.println("Comments is not found");
		}
		
		if(callbtn.isDisplayed()) {
			System.out.println(callbtn.getText());
			//callbtn.click();
			val=true;
		}
		else {
			System.out.println("Call button is not displayed");
			}
		
		if(premise.isDisplayed()) {
			System.out.println(premise.getText());
			val=true;
		}
		else {
			System.out.println("Premise details is not displayed");
		}
		
		if(location.isDisplayed()) {
			System.out.println(location.getText());
			val=true;
		}
		else {
			System.out.println("Premise detail is not displayed");
		}
		return val;
	}
}
