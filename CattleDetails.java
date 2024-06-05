package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CattleDetails {
	IOSDriver driver;
	public CattleDetails(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Header
	@iOSXCUITFindBy(accessibility="Back")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText")
	public WebElement cattleid;
	
	
	//Primary Details
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement cattleprimarydetails;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage")
	public WebElement cattleimage;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText")
	public WebElement id;
	
	@iOSXCUITFindBy(accessibility="RFID TagNumber2000005000000133")
	public WebElement rfid;
	
	@iOSXCUITFindBy(accessibility="Status Live")
	public WebElement status;
	
	@iOSXCUITFindBy(accessibility="Animal location")
	public WebElement animalloc;
	
	//Demographic data
	@iOSXCUITFindBy(accessibility="Heading 2:Collapse Demographic Data")
	public WebElement democollapsebtn;
	
	@iOSXCUITFindBy(accessibility="Species")
	public WebElement speciestxt;
	
	@iOSXCUITFindBy(accessibility="Cattle")
	public WebElement species;
	
	@iOSXCUITFindBy(accessibility="Age")
	public WebElement agetext;
	
	@iOSXCUITFindBy(accessibility="1-3 years")
	public WebElement age;
	
	@iOSXCUITFindBy(accessibility="Gender")
	public WebElement gendertext;
	
	@iOSXCUITFindBy(accessibility="Female")
	public WebElement gender;
	
	@iOSXCUITFindBy(accessibility="Animal Keeper Name")
	public WebElement animalkeepernametxt;
	
	@iOSXCUITFindBy(accessibility="Rayyan Rasheed")
	public WebElement animalkeeper;
	
	@iOSXCUITFindBy(accessibility="Date of Birth")
	public WebElement dateofbirthtxt;
	
	@iOSXCUITFindBy(accessibility="02/03/2021")
	public WebElement dateofbirth;
	
	@iOSXCUITFindBy(accessibility="Breed")
	public WebElement breedtext;
	
	@iOSXCUITFindBy(accessibility="Baladi")
	public WebElement breed;
	
	@iOSXCUITFindBy(accessibility="Passport No")
	public WebElement passportnumtxt;
	
	@iOSXCUITFindBy(accessibility="WXDF26")
	public WebElement passportnum;
	
	@iOSXCUITFindBy(accessibility="Purpose")
	public WebElement purposetext;
	
	@iOSXCUITFindBy(accessibility="Milk")
	public WebElement purpose;
	
	@iOSXCUITFindBy(accessibility="Heading 2:Expand Demographic Data")
	public WebElement demoexpandbtn;
	
	//Medical Records
	@iOSXCUITFindBy(accessibility="Heading 2:Expand Medical Records")
	public WebElement expandMedrecords;
	
	@iOSXCUITFindBy(accessibility="Heading 2:Collapse Medical Records")
	public WebElement collapsemedrecord;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == \"No data available\"`][1]")
	public WebElement medrecorddetails;
	//driver.findElement(MobileBy.iOSNsPredicateString(“propertyName CONTAINS propertyValue”));
	//@AndroidFindBy(xpath = ".//android.widget.TextView[contains(@text,'Port of Exit')]")
	//private WebElement portOfExit;
	//Traceability Info
	
	@iOSXCUITFindBy(accessibility="Heading 2:Expand Traceability Info")
	public WebElement expandtraceinfo;
	
	@iOSXCUITFindBy(accessibility="Heading 2:Collapse Traceability Info")
	public WebElement collapsetraceinfo;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == \"No data available\"`][2]")
	public WebElement traceabilityinfo;
	//**/XCUIElementTypeOther[`name == "No data available"`][2]
	
	//Traceability Document
	@iOSXCUITFindBy(accessibility="Heading 2:Expand Traceability Document")
	public WebElement expandtracedoc;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name == 'Heading 2:Collapse Traceability Document'`]")
	public WebElement collapsetracedoc;
	//Heading 2:Collapse Traceability Document
	
	@iOSXCUITFindBy(xpath="**/XCUIElementTypeStaticText[`name == \"No data available\"`][3]")
	public WebElement traceabilitydoc;
	//**/XCUIElementTypeOther[`name == "No data available"`][3]
	
	
	public boolean verifyHeader() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			System.out.println("Back button is found");
			val=true;
		}
		else {
			System.out.println("Not able to find back button");
		}
		
		
		if(cattleid.isDisplayed()) {
			System.out.println("Cattle ID:"+cattleid.getText());
			val=true;
		}
		else {
			System.out.println("Not able to find cattle id");
		}
		return val;
	}
	
	public boolean verifyPrimaryDetails() {
		boolean val=false;
//		for(int i=0;i<cattleprimarydetails.size();i++) {
//			System.out.println(id.get(i).getText());
//			System.out.println(rfid.get(i).getText());
//			System.out.println(status.get(i).getText());
//			val=true;
//		}
		if(cattleimage.isDisplayed()) {
			System.out.println("Cattle image is displayed");
			val=true;
		}
		else {
			System.out.println("Cattle image is not displayed");
		}
		
		if(cattleimage.isDisplayed()) {
		System.out.println("Cattle id:"+id.getText());
		val=true;
		}
		else {
			System.out.println("Cattle id is not displayed");
		}
		
		if(rfid.isDisplayed()) {
		System.out.println("RFID:"+rfid.getText());
		val=true;
		}
		else {
			System.out.println("RFID is not displayed");
		}
		
		if(status.isDisplayed()) {
		System.out.println("Cattle Status:"+status.getText());
		val=true;
		}
		else {
			System.out.println("Cattle status is not displayed");
		}
		
		if(animalloc.isDisplayed()) {
			System.out.println("Animal location is displayed");
			val=true;
		}
		else {
			System.out.println("Animal location is not displayed");
		}
		
		return val;
	}
	
	public boolean verifyDemographicData() {
		boolean val=false;
		if(democollapsebtn.isDisplayed()) {
			System.out.println("Collapse button is found");
			System.out.println(democollapsebtn.getText());
			val=true;
		}
		else {
			System.out.println("Not able to find collapse button");
		}
		
		if(speciestxt.isDisplayed()) {
			System.out.println(speciestxt.getText()+":"+species.getText());
			val=true;
		}
		else {
			System.out.println("Species is not displayed");
		}
		
		if(agetext.isDisplayed()) {
			System.out.println(agetext.getText()+":"+age.getText());
			val=true;
		}
		else {
			System.out.println("Age data is not available for the selected cattle ID");
		}
		
		if(gendertext.isDisplayed()) {
			System.out.println(gendertext.getText()+":"+gender.getText());
			val=true;
		}
		else {
			System.out.println("Gender data is not available for the selected cattle ID");
		}
		
		if(animalkeepernametxt.isDisplayed()) {
			System.out.println(animalkeepernametxt.getText()+":"+animalkeeper.getText());
			val=true;
		}
		else {
			System.out.println("Animal Keeper name is not available for the selected cattle ID");
		}
		
		if(dateofbirthtxt.isDisplayed()) {
			System.out.println(dateofbirthtxt.getText()+":"+dateofbirth.getText());
			val=true;
		}
		else {
			System.out.println("Date of birth data is not available for the selected animal ID");
		}
		
		if(breedtext.isDisplayed()) {
			System.out.println(breedtext.getText()+":"+breed.getText());
			val=true;
		}
		else {
			System.out.println("Breed data is not available for the selected animal ID");
		}
		
		if(passportnumtxt.isDisplayed()) {
			System.out.println(passportnumtxt.getText()+":"+passportnum.getText());
			val=true;
		}
		else {
			System.out.println("Passport data is not available for the selected cattle ID");
		}
		
		if(purposetext.isDisplayed()) {
			System.out.println(purposetext.getText()+":"+purpose.getText());
			val=true;
		}
		else {
			System.out.println("Purpose data is not available for the selectecd cattle ID");
		}
		return val;
	}
	
	public boolean collapseDemoData() {
		boolean val=false;
		if(democollapsebtn.isDisplayed()) {
			democollapsebtn.click();
			val=true;
		}
		else {
			System.out.println("Demographic data is in collapsed state");
		}
		return val;
	}
	
	public boolean expandMedicalRecords() {
		boolean val=false;
		collapseDemoData();
		expandMedrecords.click();
		val=true;
		return val;
	}
	
	public boolean verifyMedicalRecords() {
		boolean val=false;
		if(medrecorddetails.isDisplayed()) {
			System.out.println(medrecorddetails.getText());
			val=true;
			
		}
		else {
			System.out.println("No records found under Traceability Info tab.");		
		}
		
		collapsemedrecord.click();
		val=true;
		return val;
		
	}
	
	public boolean expandTraceabilityInfo() throws InterruptedException {
		boolean val=false;
		//collapseDemoData();
		Thread.sleep(3000);
		if(expandtraceinfo.isDisplayed()) {
			System.out.println(expandtraceinfo.getText());
			expandtraceinfo.click();
			val=true;
		}
		else {
			System.out.println("Expand Traceability Info button is not found");
		}
		return val;
		
	}
	
	public boolean verifyTraceabilityInfo() throws InterruptedException
	{
		boolean val=false;
		Thread.sleep(3000);
		if(traceabilityinfo.isDisplayed()) {
			System.out.println(traceabilityinfo.getText());
			val=true;
		}
		else {
			System.out.println("No records found under Traceability Info tab.");
		}
		//val=true;
		Thread.sleep(3000);
		collapsetraceinfo.click();
		return val;
		
	}
	
	public boolean expandTraceabilityDoc() {
		boolean val=false;
		
		if(expandtracedoc.isDisplayed()){
			System.out.println(expandtracedoc.getText());
			expandtracedoc.click();
			val=true;
			
		}
		else {
			System.out.println("Not able to find Expand Traceability document button");
		}
		return val;
	}
	
	public boolean verifyTraceabilityDoc() throws InterruptedException {
		boolean val=false;
		//collapseDemoData();
		Thread.sleep(3000);
		if(traceabilitydoc.isDisplayed()) {
			System.out.println(traceabilitydoc.getText());
			val=true;
		}
		else {
			System.out.println("No data found under Traceability doc");
		}
		//val=true;
		collapsetracedoc.click();
		return val;
		
	}
	public boolean goBack() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
		}
		return val;
	}

}
