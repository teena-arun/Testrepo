package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AppointmentDetails {
	IOSDriver driver;
	public AppointmentDetails(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1 Appointment Number\"`]")
	public WebElement appntnum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 2Purpose\"`]")
	public WebElement apptpurpose;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Appointment Status\"`]")
	public WebElement appntmtstatus;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Destination\"`]")
	public WebElement appntmtdestination;
	
	@iOSXCUITFindBy(iOSClassChain="*/XCUIElementTypeStaticText[`name contains \"Date of shipping\"`]")
	public WebElement dateofshipping;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Means of shipping\"`]")
	public WebElement meansofshipping;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Exporting purpose\"`]")
	public WebElement exportingpurpose;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Sampling required\"`]")
	public WebElement samplingreqstatus;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Animal Type - Individual\"`]")
	public WebElement animaltype;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Animal Tag Number\"`]")
	public WebElement animaltagnum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Assigned To\"`]")
	public WebElement assignedto;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Assignee Contact Number\"`]")
	public WebElement assigneecntctnum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Scheduled Date\"`]")
	public WebElement scheduleddate;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 3Clinic NameAl\"`]")
	public WebElement clinicname;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 4Booking number\"`]")
	public WebElement bookingid;
	
	public boolean verifyAppointmentDetails() {
		boolean val=false;
		if(appntnum.isDisplayed()) {
			System.out.println("Appointment Number:"+appntnum.getText());
			System.out.println("Appointment Purpose:"+apptpurpose.getText());
			System.out.println("Appointment status:"+appntmtstatus.getText());
			System.out.println("Destination:"+appntmtdestination.getText());
			//System.out.println("Date of shipping:"+dateofshipping.getText());
			System.out.println("Means of shipping:"+meansofshipping.getText());
			System.out.println("Exporting purpose:"+exportingpurpose.getText());
			System.out.println("Sampling required:"+samplingreqstatus.getText());
			System.out.println("Animal Type:"+animaltype.getText());
			System.out.println("Animal Tag number:"+animaltagnum.getText());
			System.out.println("Assugned to:"+assignedto.getText());
			System.out.println("Assignee contact number:"+assigneecntctnum.getText());
			System.out.println("Scheduled date:"+scheduleddate.getText());
			System.out.println("Clinic Name:"+clinicname.getText());
			System.out.println("Booking Id:"+bookingid.getText());
			val=true;
		}
		else {
			System.out.println("Not able to find Appointment number");
		}
		return val;
	}
	
	public boolean backtoAppointment() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Failed in going back to Appointment page");
		}
		return val;
	}
	

}
