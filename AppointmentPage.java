package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AppointmentPage {
	
	IOSDriver driver;
	
	public AppointmentPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Appointment\"`]")
	public WebElement heading;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Make an Appointment\"`]")
	public WebElement appointmentbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell")
	public List<WebElement> appointmentcell;
	
	//List
	
	
	public boolean headerVerify() {
		boolean val=false;
		if(heading.isDisplayed()) {
			System.out.println(heading.getText());
			val=true;
		}
		else {
			System.out.println("Not able to display Appointment page header");
		}
		return val;
	}
	
	public boolean newAppointment() throws InterruptedException {
		boolean val=false;
		Thread.sleep(3000);
		if(appointmentbtn.isDisplayed()) {
			appointmentbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to find and click on appointment button at Appointment page");
		}
		return val;
	}
	
	public boolean verifyAppointmentList() {
		
		boolean val=false;
		//String index=System.out.println(properties.getProperty("landingpageindex"));
		if(appointmentcell.size()!=0) {
			System.out.println(appointmentcell.size());
			for(int i=0;i<=appointmentcell.size();i++) {
				//System.out.println(appointmentcell.get(i));
				//appointmentcell.get(properties.getProperty("landingpageindex")).click();
				appointmentcell.get(0).click();
				val=true;
				
			}
		}
		else {
			System.out.println("Couldn't find Appointment list");
		}
		return val;
	}

}
