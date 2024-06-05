package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
public class GoatDetails {
	
	IOSDriver driver;
	
	public GoatDetails(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
//	@iOSXCUITFindBy(accessibility="Back")
//	public WebElement backbtn;
//	
//	@iOSXCUITFindBy(accessibility="Heading 1 Species NameGoat")
//	public WebElement goatheading;
//	
//	@iOSXCUITFindBy(accessibility="Species search")
//	public WebElement searchbtn;
//	
//	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == \"Heading 2: Species Count \"`]")
//	public WebElement speciescntheading;
//	
//	@iOSXCUITFindBy(accessibility=". 2 Elements")
//	public WebElement graphview;
//	
//	@iOSXCUITFindBy(accessibility="Goat : 12.5 % of 100")
//	public WebElement goatpercent;
//	
//	@iOSXCUITFindBy(accessibility="Others : 87.5 % of 100")
//	public WebElement otherspercent;
//	
//	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell")
//	public List<WebElement> goatlist;
//	
//	@iOSXCUITFindBy(accessibility="Back")
//	public WebElement backtogoatlist;
//	
//	public boolean verifyHeader() throws InterruptedException {
//		boolean val=false;
//		Thread.sleep(3000);
//		if(backbtn.isDisplayed()) {
//			System.out.println("Back button is displayed");
//			val=true;
//		}
//		else {
//			System.out.println("Back button is not found");
//		}
//		
//		if(goatheading.isDisplayed()) {
//			System.out.println(goatheading.getText());
//			val=true;
//		}
//		else {
//			System.out.println("Goat heading is not displayed");
//		}
//		
//		if(searchbtn.isDisplayed()) {
//			System.out.println("search button is diaplayed");
//			val=true;
//		}
//		else {
//			System.out.println("Search button is not displayed");
//		}
//		return val;
//		
//	}
//	
//	public boolean goatSpeciesCount() {
//		boolean val =false;
//		if(speciescntheading.isDisplayed()) {
//			System.out.println(speciescntheading.getText());
//			val=true;
//		}
//		else {
//			System.out.println("Species heading is not found");
//		}
//		return val;
//	}
//	
//
//public Boolean verifyGraph() {
//	boolean val=false;
//	if(graphview.isDisplayed()) {
//		System.out.println("Goat percentage:"+goatpercent.getText());
//		System.out.println("Other animal percentage:"+otherspercent.getText());
//		val=true;
//	}
//	else {
//		System.out.println("Goat percentage and other animal percenyage is not displayed properly in the graph");
//	}
//	return val;
//}
//
//public boolean verifyGoatList() throws InterruptedException {
//	boolean val=false;
//	if(goatlist.size()!=0) {
//		for(int i=0;i<goatlist.size();i++) {
//			System.out.println(goatlist.get(i).getText());
//			Thread.sleep(3000);
//			goatlist.get(i).click();
//			backtogoatlist.click();
//			
//		}
//		val=true;
//	}
//	return val;
//	
//}
}