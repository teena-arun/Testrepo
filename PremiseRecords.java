package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PremiseRecords {
	
	IOSDriver driver;
	
	public PremiseRecords(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backtopremise;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Premise Records\"`]")
	public WebElement premiserecordheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name contains \"Certificate For\"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
    public List<WebElement> records;
	
	public boolean backToPremise() {
		boolean val=false;
		if(backtopremise.isDisplayed()) {
			backtopremise.click();
			val=true;
		}
		else {
			System.out.println("Back button is not found at Premise Records page");
		}
		return val;
	}
	
	public boolean premiseHeaderDisp() {
		boolean val=false;
		if(premiserecordheader.isDisplayed()) {
			System.out.println(premiserecordheader.getText());
			val=true;
		}
		else {
			System.out.println("Premise header is not found");
		}
		return val;
	}
	
	public boolean verifyRecords() {
		boolean val=false;
		if(records.size()!=0) {
			//System.out.println(records.get(i));
			for(int i=0;i<records.size();i++) {
				records.get(i).click();
			}
		}
		val=true;
		return val;
	}
}
