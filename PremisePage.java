package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PremisePage {
	IOSDriver driver;
	public PremisePage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Premise Details\"`]")
	public WebElement premiseheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Premise Name:Cattle House\"`]")
	public WebElement premisename;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Permit Status\"`]")
	public WebElement permitstatus;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Premise records\"`]")
	public WebElement premiserecordbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Premise location\"`]")
	public WebElement premiselocbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Premise visit history\"`]")
	public WebElement premisevisithistorybtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Premise weather information\"`]")
	public WebElement premiseweatherinfobtn;
	
	//Owner Info
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeOther[1]")
	public WebElement ownerheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Heading 2:Collapse Owner Info\"`]")
	public WebElement ownercollapsebtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Expand Owner Info\"`]")
	public WebElement expandownerinfobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Owner Name\"`]")
	public WebElement ownernametxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Suhail Sathar\"`]")
	public WebElement ownername;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Owner Number\"`]")
	public WebElement ownernumbertxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"66367668\"`]")
	public WebElement ownernumber;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Owner QID\"`]")
	public WebElement ownerqidtxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"28425001233\"`]")
	public WebElement ownerqid;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Gender\"`]")
	public WebElement gendertxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Male\"`]")
	public WebElement gender;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Age\"`]")
	public WebElement agetxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"45-65\"`]")
	public WebElement age;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Address\"`]")
	public WebElement addresstxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Ad Dawhah\"`]")
	public WebElement address;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"PO Box\"`]")
	public WebElement poboxtxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"14614\"`]")
	public WebElement pobox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Fax\"`]")
	public WebElement faxtxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"555-123-4569\"`]")
	public WebElement fax;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Email ID\"`]")
	public WebElement emailidtxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"@gmail.com\"`]")
	public WebElement emailid;
	
	//Location Info
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Expand Location Info\"`]")
	public WebElement expandlocbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Collapse Location Info\"`]")
	public WebElement collapselocbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Zone No\"`]")
	public WebElement zonenotxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"2\"`]")
	public WebElement zoneno;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Sub MM Name\"`]")
	public WebElement subnametxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Ad Dawhah (Doha)\"`]")
	public WebElement subname;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"PIN Number\"`]")
	public WebElement pinnumbertxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"02033333\"`]")
	public WebElement pinnumber;
	
	
	//Premise Info
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Expand Premise Info\"`]")
	public WebElement expandpremiseinfobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Collapse Premise Info\"`]")
	public WebElement collapsepremiseinfobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Type of Ownership\"`]")
	public WebElement typeofownershiptxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Commercial Farm\"`][1]")
	public WebElement typeofownership;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Premise Name\"`]")
	public WebElement premisenametxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Cattle House\"`]")
	public WebElement premisname;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Type of Premise\"`]")
	public WebElement typeofpremisetxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Commercial Farm\"`][2]")
	public WebElement typeofpremise;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Municipality\"`]")
	public WebElement municipalitytxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Ad Dawhah (Doha)\"`]")
	public WebElement municipality;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Ration Card No\"`]")
	public WebElement rationcardnotxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"RC\"`]")
	public WebElement rationcardno;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Purpose\"`]")
	public WebElement purposetxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Sell\"`]")
	public WebElement purpose;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Source of Water\"`]")
	public WebElement sourceofwatertxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Borewell\"`]")
	public WebElement sourceofwater;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Premise Area\"`]")
	public WebElement premiseareatxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"5000.0\"`]")
	public WebElement premisearea;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Date of latest census\"`]")
	public WebElement dateoflastcensustxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"01/02/2022\"`]")
	public WebElement dateoflastcensus;
	
	//Co-Workers Info
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Expand Co-Workers Info\"`]")
	public WebElement expandcoworkersinfobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Collapse Co-Workers Info\"`]")
	public WebElement collapsecoworkersinfobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Qatari\"`]")
	public WebElement qataritxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"0\"`]")
	public WebElement qatarivalue;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Non Qatari\"`]")
	public WebElement nonqataritxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"1\"`]")
	public WebElement nonqatarivalue;
	
	//Nominee Info
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Expand Nominee Info\"`]")
	public WebElement expandnomineeinfobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Collapse Nominee Info\"`]")
	public WebElement collapsenomineeinfobtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Nominee Name\"`]")
	public WebElement nomineenametxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Shemin\"`]")
	public WebElement nomineename;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Nominee Number\"`]")
	public WebElement nomineenumtxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"84997979\"`]")
	public WebElement nomineenum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Nominee QID\"`]")
	public WebElement nomineeqidnumtxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"54546948797\"`]")
	public WebElement nomineeqid;
	
	 
	
	
	public boolean verifyPremiseHeader() {
		boolean val=false;
		if(premiseheader.isDisplayed()) {
			System.out.println("Header:"+premiseheader.getText());
			val=true;
		}
		else {
			System.out.println("Premise header is not displayed");
		}
		return val;
		
	}
	
	public boolean mainDetails() {
		boolean val=false;
		if(premisename.isDisplayed()) {
			System.out.println("Premise Name:"+premisename.getText());
			val=true;
		}
		else {
			System.out.println("Premise name is not found");
		}
		
		if(permitstatus.isDisplayed()) {
			System.out.println("Premise Status:"+permitstatus.getText());
			val=true;
		}
		else {
			System.out.println("Premise status is not found");
		}
		
		//premiseRecordClick();
		return val;
	}
	
	public boolean ownerInfoDisp() throws InterruptedException {
		boolean val=false;
		Thread.sleep(3000);
		if(ownernametxt.isDisplayed()) {
			System.out.println(ownernametxt.getText()+":"+ownername.getText());
			val=true;
		}
		else {
			System.out.println("Owner name is not displayed");
		}
		return val;
	}
	
	public boolean premiseRecordClick() {
		boolean val=false;
		if(premiserecordbtn.isDisplayed()) {
			premiserecordbtn.click();
			val=true;
		}
		else {
			System.out.println("Premise Record is not found");
		}
		return val;
	}
	
	public boolean premiseLocationClick() {
		boolean val=false;
		if(premiselocbtn.isDisplayed()) {
			premiselocbtn.click();
			val=true;
		}
		else {
			System.out.println("Premise location button is not found");
		}
		return val;
	}
	
	public boolean premiseHistoryClick() {
		boolean val=false;
		if(premisevisithistorybtn.isDisplayed()) {
			premisevisithistorybtn.click();
			val=true;
		}
		else {
			System.out.println("Premise history button is not found");
		}
		return val;
	}
	
	public boolean premiseWeatherInfo() {
		boolean val=false;
		if(premiseweatherinfobtn.isDisplayed()) {
			premiseweatherinfobtn.click();
			val=true;
		}
		else {
			System.out.println("Premise weather info is not found");
		}
		return val;
	}
	
	public boolean verifyOwnerInfo() {
		boolean val=false;
		if(ownerheader.isDisplayed()) {
			System.out.println(ownerheader.getText());
			val=true;
		}
		else {
			System.out.println("Owner header text is not displayed");
		}
		
		if(ownernametxt.isDisplayed()) {
			System.out.println(ownernametxt.getText()+":"+ownername.getText());
			val=true;
		}
		else {
			System.out.println("Owner name is not displayed");
		}
		
		if(ownernumbertxt.isDisplayed()) {
			System.out.println(ownernumbertxt.getText()+":"+ownernumber.getText());
			val=true;
		}
		else {
			System.out.println("Owner number is not displayed");
		}
		
		if(ownerqidtxt.isDisplayed()) {
			System.out.println(ownerqidtxt.getText()+":"+ownerqid.getText());
			val=true;
		}
		else {
			System.out.println("Owner qid is not displayed");
		}
		
		if(gendertxt.isDisplayed()) {
			System.out.println(gendertxt.getText()+":"+gender.getText());
			val=true;
		}
		else {
			System.out.println("Gender is not displayed");
		}
		
		if(agetxt.isDisplayed()) {
			System.out.println(agetxt.getText()+":"+age.getText());
			val=true;
		}
		else {
			System.out.println("Age is not displayed");
		}
		
		if(addresstxt.isDisplayed()) {
			System.out.println(addresstxt.getText()+":"+address.getText());
			val=true;
		}
		else {
			System.out.println("Adrress is not displayed");
		}
		
		if(poboxtxt.isDisplayed()) {
			System.out.println(poboxtxt.getText()+":"+pobox.getText());
			val=true;
		}
		else {
			System.out.println("PO Box is not displayed");
		}
		
		if(faxtxt.isDisplayed()) {
			System.out.println(faxtxt.getText()+":"+fax.getText());
			val=true;
		}
		else {
			System.out.println("Fax is not displayed");
		}
		
		if(emailidtxt.isDisplayed()) {
			System.out.println(emailidtxt.getText()+":"+emailid.getText());
			val=true;
		}
		else {
			System.out.println("Email id is not displayed");
		}
		
		collapseOwnerInfo();
		return val;
	}
	
	public boolean collapseOwnerInfo() {
		boolean val=false;
		if(ownercollapsebtn.isDisplayed()) {
			ownercollapsebtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to collapse Owner Info");
		}
		return val;
	}
	
	public boolean verifyLocationInfo() {
		boolean val=false;
		if(expandlocbtn.isDisplayed()) {
			System.out.println("Location Heading:"+expandlocbtn.getText());
			expandlocbtn.click();
			val=true;
		}
		else {
			System.out.println("Expand button is not found");
		}
		
		if(zonenotxt.isDisplayed()) {
			System.out.println(zonenotxt.getText()+":"+zoneno.getText());
			val=true;
		}
		else {
			System.out.println("Zone number is not displayed");
		}
		
		if(subnametxt.isDisplayed()) {
			System.out.println(subnametxt.getText()+":"+subname.getText());
			val=true;
		}
		else {
			System.out.println("Sub name is not displayed");
		}
		
		if(pinnumbertxt.isDisplayed()) {System.out.println(pinnumbertxt.getText()+":"+pinnumber.getText());
		val=true;
		}
		else {
			System.out.println("Pin number is not displayed");
		}
		
		collapseLoInfo();
		
		return val;
	}
	
	public boolean collapseLoInfo() {
		boolean val=false;
		if(collapselocbtn.isDisplayed()) {
			collapselocbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to collapse Location Info");
		}
		return val;
	}
	
	public boolean verofyPremiseInfo() {
		boolean val=false;
		
		if(expandpremiseinfobtn.isDisplayed()) {
			expandpremiseinfobtn.click();
			//System.out.println("Premise Info header:"+expandpremiseinfobtn.getText());
			val=true;
		}
		else {
			System.out.println("Expand Premise Info button is not found");
		}
		
		if(typeofownershiptxt.isDisplayed()) {
			System.out.println(typeofownershiptxt.getText()+":"+typeofownership.getText());
			val=true;
		}
		else {
			System.out.println("Type of ownership is not displayed");
		}
		
		if(premisenametxt.isDisplayed()) {
			System.out.println(premisenametxt.getText()+":"+premisname.getText());
			val=true;
		}
		else {
			System.out.println("Premise name is not displayed");
		}
		
		if(typeofpremisetxt.isDisplayed()) {
			System.out.println(typeofpremisetxt.getText()+":"+typeofpremise.getText());
			val=true;
		}
		else {
			System.out.println("Type of premise is not displayed");
		}
		
		if(municipalitytxt.isDisplayed()) {
			System.out.println(municipalitytxt.getText()+":"+municipality.getText());
			val=true;
		}
		else {
			System.out.println("Municipality is not displayed");
		}
		
		if(rationcardnotxt.isDisplayed()) {
			System.out.println(rationcardnotxt.getText()+":"+rationcardno.getText());
			val=true;
		}
		
		else {
			System.out.println("Ration card number is not displayed");
		}
		
		if(purposetxt.isDisplayed()) {
			System.out.println(purposetxt.getText()+":"+purpose.getText());
			val=true;
		}
		else {
			System.out.println("Purpose text is not displayed");
		}
		
		if(sourceofwatertxt.isDisplayed()) {
			System.out.println(sourceofwatertxt.getText()+":"+sourceofwater.getText());
			val=true;
		}
		else {
			System.out.println("Source of water is not displayed");
		}
		
		if(premiseareatxt.isDisplayed()) {
			System.out.println(premiseareatxt.getText()+":"+premisearea.getText());
			val=true;
		}
		else {
			System.out.println("Premise area is not displayed");
		}
		
		if(dateoflastcensustxt.isDisplayed()) {
			System.out.println(dateoflastcensustxt.getText()+":"+dateoflastcensus.getText());
			val=true;
				
		}
		else {
			System.out.println("Date of last census is not displayed");
		}
		
		collapsePremiseInfo();
		
		return val;
	}
	
	public boolean collapsePremiseInfo() {
		boolean val=false;
		if(collapsepremiseinfobtn.isDisplayed()) {
			collapsepremiseinfobtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to collapse Premise Info");
		}
		return val;
	}
	
	public boolean verifyCoworkersInfo() {
		boolean val=false;
		if(expandcoworkersinfobtn.isDisplayed()) {
			expandcoworkersinfobtn.click();
			//System.out.println(expandcoworkersinfobtn.getText());
			val=true;
		}
		else {
			System.out.println("Expand Co-workers Info button is not found");
		}
		
		if(qataritxt.isDisplayed()) {
			System.out.println(qataritxt.getText()+":"+qatarivalue.getText());
			val=true;
		}
		else {
			System.out.println("Qutari value is not displayed.");
		}
		
		if(nonqataritxt.isDisplayed()) {
			System.out.println(nonqataritxt.getText()+":"+nonqatarivalue.getText());
			val=true;
		}
		else {
			System.out.println("Non qatari valus is not displayed");
		}
		
		collapseCoWorkersInfo();
		return val;
		
	}
	
	public boolean collapseCoWorkersInfo() {
		boolean val=false;
		if(collapsecoworkersinfobtn.isDisplayed()) {
			collapsecoworkersinfobtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to collapse Co-woekers Info button");
		}
		return val;
	}
	
	public boolean verifyNomineeInfo() {
		boolean val=false;
		if(expandnomineeinfobtn.isDisplayed()) {
			expandnomineeinfobtn.click();
			//System.out.println(expandnomineeinfobtn.getText());
			val=true;
			
		}
		else {
			System.out.println("Expand Nominee Info button is not found");
		}
		
		if(nomineenametxt.isDisplayed()) {
			System.out.println(nomineenametxt.getText()+":"+nomineename.getText());
			val=true;
		}
		else {
			System.out.println("Nominee name is not displayed");
		}
		
		if(nomineenumtxt.isDisplayed()) {
			System.out.println(nomineenumtxt.getText()+":"+nomineenum.getText());
			val=true;
		}
		else {
			System.out.println("Nominee number is not displayed");
		}
		
		if(nomineeqidnumtxt.isDisplayed()) {
			System.out.println(nomineeqidnumtxt.getText()+":"+nomineeqid.getText());
			val=true;
		}
		else {
			System.out.println("Nominee number is not displayed");
		}
		
		collapseNomineeInfo();
		return val;
	}
	
	public boolean collapseNomineeInfo() {
		boolean val=false;
		if(collapsenomineeinfobtn.isDisplayed()) {
			collapsenomineeinfobtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to collapse nominee Info");
		}
		return val;
	}

}
