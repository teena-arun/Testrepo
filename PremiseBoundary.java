package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PremiseBoundary {
	
	IOSDriver driver;
	public PremiseBoundary(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Premise Boundaries\"`]")
	public WebElement premiseboundaryheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
	public WebElement boundarybox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Declared Boundaries\"`]")
	public WebElement declaredboundarylbl;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Actual Boundaries\"`]")
	public WebElement actualboundarieslbl;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]")
	public WebElement boundarymap;
	
	public boolean backtoPremise() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
			
		}
		else {
			System.out.println("Not able to find back button at premise boundaries page");
		}
		return val;
	}
	
	public boolean verifyHeader() {
		boolean val=false;
		if(premiseboundaryheader.isDisplayed()) {
			System.out.println(premiseboundaryheader.getText());
			val=true;
		}
		else {
			System.out.println("Premise boundary header is not displayed");
		}
		return val;
	}
	
	public boolean verifyBoundaries() {
		boolean val=false;
		if(boundarybox.isDisplayed()) {
			System.out.println(declaredboundarylbl.getText());
			System.out.println(actualboundarieslbl.getText());
			val=true;
		}
		else {
			System.out.println("Not able to find boundary details");
		}
		return val;
	}
	
	public boolean verifyMap() {
		boolean val=false;
		if(boundarymap.isDisplayed()) {
			System.out.println("Boundary Map is displayed");
			val=true;
		}
		else {
			System.out.println("Boundary map is not displayed");
		}
		return val;
	}

}
