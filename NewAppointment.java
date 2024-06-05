package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NewAppointment {
	
	IOSDriver driver;
	public NewAppointment(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name == \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Schedule Appointment\"`]")
	public WebElement scheduleappointmentheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Select PurposeCombo box\"`]")
	public WebElement purposecombobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Select PurposeCombo box\"[0]`]")
	public WebElement drfarmvisit;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextView[`name contains \"Enter Comments\"`]")
	public WebElement commentsbox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Select ClinicCombo box\"`]")
	public WebElement cliniccombo;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Select Clinic NameCombo box\"`]")
	public WebElement clinicname;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Book an appointment\"`]")
	public WebElement submitbtn;
	
	
	public boolean backtoAppointment(){
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to find back button at New Appointment page");
		}
		return val;
	}
	
	public boolean verifyHeader() {
		boolean val=false;
		if(scheduleappointmentheader.isDisplayed()) {
			System.out.println("Header:"+scheduleappointmentheader.getText());
			val=true;
			
		}
		else {
			System.out.println("Appointment header is not displayed");
		}
		return val;
	}
	
	public boolean verifyCombo() {
		boolean val=false;
		
		
		
		if(purposecombobtn.isDisplayed()) {
			purposecombobtn.click();
			System.out.println(purposecombobtn.getText());
			purposecombobtn.click();
			//purposecombobtn.sendKeys(purposecombobtn.getText());
			val=true;
		}
		else {
			System.out.println("Purpose combo button is not displayed");
		}
		return val;
				
	}
	
	public boolean writeComments() {
		boolean val=false;
		if(commentsbox.isDisplayed()) {
			commentsbox.sendKeys("Test");
			System.out.println();
			val=true;
		}
		else {
			System.out.println("Not able to enter values in comments text field");
		}
		return val;
	}
	
	public boolean selectClinicType() {
		boolean val=false;
		if(cliniccombo.isDisplayed()) {
			cliniccombo.click();
			System.out.println(cliniccombo.getText());
			cliniccombo.click();
			val=true;
		}
		else {
			System.out.println("Not able to select Clinic type");
		}
		return val;
	}
	
	public boolean selectClinicName() {
		boolean val=false;
		if(clinicname.isDisplayed()) {
			clinicname.click();
			System.out.println(clinicname.getText());
			clinicname.click();
			val=true;
		}
		else {
			System.out.println("Not able to select clinic name");
		}
		return val;
	}
	
	public boolean bookanAppointment() {
		boolean val=false;
		if(submitbtn.isDisplayed()) {
			submitbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to submit appointment");
		}
		return val;
	}

}
