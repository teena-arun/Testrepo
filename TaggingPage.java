package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TaggingPage {
	IOSDriver driver;
	public TaggingPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITFindBy(accessibility="Heading 1: Tagging Request Details")
	public WebElement header;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell")
	public List<WebElement> tagreqlist;
	
	@iOSXCUITFindBy(accessibility="Create new tagging request")
	public WebElement newreqbtn;
	
	
	
	//Tagging request details
	@iOSXCUITFindBy(accessibility="Close tagging details")
	public WebElement closetagdetails;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Heading 1 Request Number\"`]")
	public WebElement reqid;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Created On\"`]")
	public WebElement createddate;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Appointment Date\"`]")
	public WebElement appointmentdate;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Status - Visited\"`]")
	public WebElement status;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Technician Name\"`]")
	public WebElement technician;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Technician Number\"`]")
	public WebElement techniciannum;
	
	@iOSXCUITFindBy(accessibility="Tagging Details")
	public WebElement taggingdetailstext;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Heading 2 Tagging Details\"`]")
	public WebElement taggingdetails;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Heading 3 Comments\"`]")
	public WebElement comments;
			
	
	public boolean tagReqHeading() {
		boolean val=false;
		if(header.isDisplayed()) {
			System.out.println("Heading:"+header.getText());
			val=true;
		}
		else {
			System.out.println("Tag Request heading is not found at Tagging page");
		}
		return val;
	}
	
	public boolean verifyTagList() {
		boolean val=false;
		if(tagreqlist.size()!=0) {
			for(int i=0;i<tagreqlist.size();i++) {
				System.out.println(tagreqlist.get(i).getText());
				val=true;
			}
			
		}
		return val;
		
	}
	
	public boolean createTagRequest() {
		boolean val=false;
		if(newreqbtn.isDisplayed()) {
			System.out.println(newreqbtn.getText());
			newreqbtn.click();
			val=true;
		}
		return val;
	}
	
	public boolean tagReqClicked() {
		boolean val=false;
		
		for(int i=0;i<tagreqlist.size();i++) {
			tagreqlist.get(i).click();
			tagReqDetails();
			closetagdetails.click();
			val=true;
		}
		return val;
	}
	
	public boolean tagReqDetails() {
		boolean val=false;
		System.out.println(reqid.getText());
		System.out.println("Created On:"+createddate.getText());
		System.out.println("Appointment Date:"+appointmentdate.getText());
		System.out.println("Status:"+status.getText());
		System.out.println("Technician Name:"+technician.getText());
		System.out.println("Technician Number:"+techniciannum.getText());
		System.out.println(taggingdetailstext.getText()+":"+taggingdetails.getText());
		System.out.println("Comments:"+comments.getText());
		val=true;
		return val;
	}

}
