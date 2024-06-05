package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PremiseVisitHistory {
	
	IOSDriver driver;
	public PremiseVisitHistory(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbutton;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Heading 1: Premise Visit History\"`]")
	public WebElement historyheader;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == \"XCUIElementTypeCell\"")
	public List<WebElement> visithistorylist;
	
	//List details
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"EMP\"`]")
	public WebElement name;
	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \" am\"`]")
	public WebElement visittime;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Animal\"`]")
	public WebElement tagtxt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Comments\"`]")
	public WebElement comments;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeOther[`name contains \"Last 5 visits\"`]")
	public WebElement last5visittxt;
	
	public boolean backBtnClicked() {
		boolean val=false;
		if(backbutton.isDisplayed()) {
			backbutton.click();
			val=true;
			
		}
		else {
			System.out.println("Not able to navigate back to Premise Page from Visit History");
		}
		return val;
	}
	
	public boolean historyHeaderVerify() {
		boolean val=false;
		if(historyheader.isDisplayed()) {
			System.out.println(historyheader.getText());
			
			val=true;
		}
		else {
			System.out.println("Premise Visit History header is not displayed");
		}
		return val;
	}
	
	public boolean verifyHistoryList() {
		boolean val=false;
		if(visithistorylist.size()!=0) {
			System.out.println(name.getText());
			System.out.println(visittime.getText());
			System.out.println(tagtxt.getText());
			System.out.println(comments.getText());
			System.out.println(last5visittxt.getText());
			val=true;
		}
		else {
			System.out.println("Not able to find any Premise History Lists");
		}
		return val;
	}
	
	public boolean visitTextDisp() {
		boolean val=true;
		if(last5visittxt.isDisplayed()) {
			System.out.println(last5visittxt.getText()+":is displayed");
			val=true;
		}
		else {
			System.out.println("Last 5 Visit text is not displayed");
		}
		return val;
	}

}
