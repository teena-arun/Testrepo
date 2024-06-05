package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Goat {
	IOSDriver driver;
	
	public Goat(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility="Back")
	public WebElement backBtn;
	
	@iOSXCUITFindBy(accessibility="Heading 1 Species NameGoat")
	public WebElement goatnameheader;
	
	@iOSXCUITFindBy(accessibility="Species search")
	public WebElement goatSearchbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == 'Heading 2: Species Count '`]")
	public WebElement goatcntheader;
	
	@iOSXCUITFindBy(accessibility=". 2 Elements")
	public WebElement graphview;
	
	@iOSXCUITFindBy(accessibility="Goat : 12.5 % of 100")
	public WebElement goatpercent;
	
	@iOSXCUITFindBy(accessibility="Others : 87.5 % of 100")
	public WebElement otherpercent;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell")
	public List<WebElement> goatlist;
	
	@iOSXCUITFindBy(accessibility="Back")
	public WebElement backfromgoatdetails;
	
	
	
	public boolean verifyGoatHeader() {
		
		boolean val=false;
		if(backBtn.isDisplayed()) {
			System.out.println("Back button is displayed");
			val=true;
		}
		else {
			System.out.println("Back button is not displayed");
		}
		
		if(goatnameheader.isDisplayed()) {
			System.out.println("Header:"+goatnameheader.getText());
			val=true;
		}
		else {
			System.out.println("Goat header name is not displayed");
		}
		if(goatSearchbtn.isDisplayed()) {
			System.out.println("Search button is displayed in Goat species page");
			val=true;
		}
		else {
			System.out.println("Search button is not displayed Goat species page header");
		}
		return val;
	}
	
	public boolean verifyGoatGraph() throws InterruptedException {
		boolean val=false;
		if(goatcntheader.isDisplayed()) {
			System.out.println("Species count header:"+goatcntheader.getText());
			val=true;
		}
		else {
			System.out.println("Goat count header is not displayed");
		}
		
		if(graphview.isDisplayed()) {
			System.out.println("Graph view is displayed");
			val=true;
		}
		else {
			System.out.println("Graph view is not displayed");
		}
		Thread.sleep(3000);
		if(goatpercent.isDisplayed()) {
			
			System.out.println("Total % of Goat:"+goatpercent.getText());
			val=true;
		}
		else {
			System.out.println("Total count percentage of goats are not displayed");
		}
		Thread.sleep(3000);
		if(otherpercent.isDisplayed()) {
			
			System.out.println("Percentage of species other than goat:"+otherpercent.getText());
			val=true;
		}
		else {
			System.out.println("Percentage of species other than goat is not displayed");
		}
		return val;
	}
	
	public boolean verifyGoatList() {
		boolean val=false;
		for(int i=0;i<goatlist.size();i++) {
			System.out.println(goatlist.get(i).getText());
			goatlist.get(i).click();
			backfromgoatdetails.click();
		}
		val=true;
		return val;
	}
	
	public boolean backBthClicked() {
		boolean val=false;
		if(backBtn.isDisplayed()) {
			backBtn.click();
			val=true;
		}
		return val;
	}

}
