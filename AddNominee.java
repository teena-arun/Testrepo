package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddNominee {
	
	IOSDriver driver;
	
	public AddNominee(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Nominee Details\"`]")
	public WebElement addnomineeheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`name contains \"Nominee name\"`]")
	public WebElement nomineename;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`name contains \"Qatar number\"`]")
	public WebElement qid;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`name contains \"Mobile number\"`]")
	public WebElement mobilenum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Remove nominee\"`]")
	public WebElement removenomineebtn;
	
	//Add Nominee
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Add nominee\"`]")
	public WebElement addnomineeplusbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`name contains \"Enter nominee name\"`]")
	public WebElement nomineenametxtbox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`name contains \"Enter qatar number\"`]")
	public WebElement qatarnumtxtbox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`name contains \"Enter mobile number\"`]")
	public WebElement mobnumtxtbox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Add new nominee\"`]")
	public WebElement addnomineebtn;
	
	//Add nominee alert
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement addedalert;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Nominee added successfully\"`]")
	public WebElement nomineeaddedmsg;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Ok\"`]")
	public WebElement nomineeaddedokbtn;
	
	//Remove Nominee
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement alertview;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Are you sure you want to remove existing nominee?\"`]")
	public WebElement alerttext;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Ok\"`]")
	public WebElement okbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Cancel\"`]")
	public WebElement cancelbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement deletedalert;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Ok\"`]")
	public WebElement deletedokbtn;
	
	public boolean backToHomePage() {
		boolean val=false;
		
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate back to Home page from Add Nominee page");
		}
		return val;
		
	}
	
	public boolean verifyAddNomineeHeader() {
		boolean val=false;
		if(addnomineeheader.isDisplayed()) {
			System.out.println(addnomineeheader.getText());
			val=true;
		}
		else {
			System.out.println("Header is not displayed at Add Nomiee page under Hamburger menu");
		}
		return val;
	}
	
	public boolean verifyAddedNomineeDetails() {
		boolean val=false;
		if(nomineename.isDisplayed()) {
			System.out.println("Nominee Name:"+nomineename.getText());
			val=true;
		}
		else {
			System.out.println("Nominee name is not displayed");
		}
		
		if(qid.isDisplayed()) {
			System.out.println("QID:"+qid.getText());
			val=true;
		}
		else {
			System.out.println("QID is not displayed");
		}
		
		if(mobilenum.isDisplayed()) {
			System.out.println("Mobile Number:"+mobilenum.getText());
			val=true;
		}
		else {
			System.out.println("Mobile Number is not displayed");
		}
		return val;
		
	}
	
	public boolean removeNomineeClicked() {
		boolean val=false;
		if(removenomineebtn.isDisplayed()) {
			removenomineebtn.click();
			
			if(alerttext.isDisplayed()) {
				System.out.println(alerttext.getText());
				okbtn.isDisplayed();
				cancelbtn.isDisplayed();
				okbtn.click();
				
			}
			else {
				System.out.println("Delete nominee confirmation alert is not displayed");
			}
			
			if(deletedalert.isDisplayed()) {
				System.out.println(deletedalert.getText());
				deletedokbtn.click();
				val=true;
			}
			else {
				System.out.println("Deleted nominee alert is not displayed");
			}
			
			val=true;
		}
		else {
			System.out.println("Not able to remove existing Nominee");
		}
		return val;
	}
	
	public boolean addnewNominee() {
		boolean val=false;
		if(addnomineeplusbtn.isDisplayed()) {
			addnomineeplusbtn.click();
			nomineenametxtbox.sendKeys("Shemin");
			qatarnumtxtbox.sendKeys("54872495601");
			mobnumtxtbox.sendKeys("79453902");
			addnomineebtn.click();
			nomineeaddedokbtn.click();
			
			val=true;
		}
		else {
			System.out.println("");
		}
		return val;
		
	}
	
}
