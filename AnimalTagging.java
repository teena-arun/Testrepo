package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AnimalTagging {
	IOSDriver driver;
	public AnimalTagging(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == \"Heading 1: Animal Tagging\"`]")
	public WebElement animaltaggingheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Owner name\"`]")
	public WebElement ownername;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Qatar-ID\"`]")
	public WebElement qatarid;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Mobile number\"`]")
	public WebElement mobnum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Premise-ID\"`]")
	public WebElement premiseid;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Premise location\"`]")
	public WebElement premiseloc;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Nominee name\"`]")
	public WebElement nomineename;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name BEGINSWITH \"Nominee Qatar Number\"`]")
	public WebElement qidnum;
	
	@iOSXCUITFindBy(accessibility="Create new tagging request")
	public WebElement nextbtn;
	
	public boolean gotoTaggingReqPage() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		return val;
	}
	
	public boolean verifyHeading() {
		boolean val=false;
		if(animaltaggingheader.isDisplayed()) {
			System.out.println("Heading:"+animaltaggingheader.getText());
			val=true;
		}
		return val;
	}
	
	public boolean verifyOwnerDetails() {
		boolean val=false;
		if(ownername.isDisplayed()) {
			System.out.println("Owner Nam:"+ownername.getText());
			val=true;
			
		}
		else {
			System.out.println("Owner name is not displayed");
		}
		
		if(qatarid.isDisplayed()) {
			System.out.println("Owner Qid:"+qatarid.getText());
			val=true;
		}
		else {
			System.out.println("Owner qid is not displayed");
		}
		
		if(mobnum.isDisplayed()){
		System.out.println("Owner mobile number:"+mobnum.getText());
		val=true;
		}
		else {
			System.out.println("Owner mobile number is not displayed");
		}
		
		if(premiseid.isDisplayed()) {
			System.out.println("Premise id:"+premiseid.getText());
			val=true;
		}
		else {
			System.out.println("Premise id is not displayed");
		}
		
		if(premiseloc.isDisplayed()){
			System.out.println("Premise location:"+premiseloc.getText());
			val=true;
		}
		else {
			System.out.println("Premise location is not displayed");
		}
		return val;
	}
	
	public boolean verifyNomineeDetails() {
		boolean val=false;
		if(nomineename.isDisplayed()) {
			System.out.println("Nominee Name:"+nomineename.getText());
			val=true;
		}
		else {
			System.out.println("Nominee name is  not diaplayed");
		}
		
		if(qidnum.isDisplayed()) {
			System.out.println("Nominee qid:"+qidnum.getText());
		}
		else {
			System.out.println("Nominee qid is not displayed");
		}
		return val;
	}
	
	public boolean nextBtnClicked() {
		boolean val=false;
		if(nextbtn.isDisplayed()) {
			nextbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate to next page from Animal Tagging page");
		}
		return val;
	}
	
	public boolean backBtn() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to navigate back to Tagging Request page");
		}
		return val;
	}

}
