package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PremiseRecordDetail {
	IOSDriver driver;
	public PremiseRecordDetail(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Certificate For\"`]")
	public WebElement certificateheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeOther[`name contains \"com.apple.paper.canvasElementResizeView\"`]")
	public WebElement certificate;
	
	public boolean backBtnClick() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to find back button at Premise Records Details page");
		}
		return val;
		
	}
	
	public boolean verifyCertificateHeader() {
		boolean val=false;
		if(certificateheader.isDisplayed()) {
			System.out.println(certificateheader.getText());
			val=true;
		}
		else {
			System.out.println("Not able to find Certificate header at Premise Records Details page");
		}
		return val;
		
	}
	
	public boolean verifyCertificate() {
		boolean val=false;
		if(certificate.isDisplayed()) {
			System.out.println("Certificate is displayed");
			val=true;
		}
		else {
			System.out.println("Not able to find certificate");
		}
		return val;
	}

}
