package qatar.livestock.pageObjects.ios;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Cattle {
	
	IOSDriver driver;
	
	public Cattle(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@iOSXCUITFindBy(accessibility="Back")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(accessibility="Heading 1 Species NameCattle")
	public WebElement cattleheader;
	
	@iOSXCUITFindBy(accessibility="Species search")
	public WebElement searchbtn;
	
	@iOSXCUITFindBy(iOSNsPredicate="name == 'Heading 2: Species Count '")
	public WebElement speciescntheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeOther[`name == \"chartViewBg_Identifier\"`]/XCUIElementTypeStaticText[2]")
	public WebElement chartview;
	
	@iOSXCUITFindBy(accessibility="Cattle : 75.00 % of 100")
	public WebElement cattlepercent;
	
	@iOSXCUITFindBy(accessibility="Others : 25.00 % of 100")
	public WebElement otherspercent;
	
	@iOSXCUITFindBy(accessibility=". 2 Elements")
	public WebElement graph;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell")
	public List<WebElement> cattlelist;
	
	@iOSXCUITFindBy(accessibility="CATTLENumber:A000033")
	public WebElement scrollele1;
//	
//	@iOSXCUITFindBy(accessibility="CATTLENumber:A000038")
//	public WebElement scrollele1;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement scrollele;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name == 'CATTLENumber:A000033, Age 1-3 years, Healthy, Bahrain'`]")
	public WebElement cattle1;
	
	@iOSXCUITFindBy(accessibility="Back")
	public WebElement backfromcattledetails;
	
	public boolean verifyHeaderDetails() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			System.out.println("Back button is displayed");
			val=true;
		}
		else {
			System.out.println("Back button is not displayed");
		}
		
		if(cattleheader.isDisplayed()) {
			System.out.println(cattleheader.getText());
			val=true;
		}
		else {
			System.out.println("Cattle heading is not displayed");
		}
		
		if(searchbtn.isDisplayed()) {
			System.out.println("Search button is displayed");
			val=true;
		}
		else {
			System.out.println("Search button is not displayed");
		}
		return val;
	}
	 public boolean verifySpeciescountHeader() {
		 boolean val=false;
		 if(speciescntheader.isDisplayed()) {
			 System.out.println(speciescntheader.getText());
			 val=true;
		 }
		 else {
			 System.out.println("Species count header is not displayed");
		 }
		 return val;
	 }
	 
	 public boolean verifyChartView() {
		 boolean val=false;
		 if(chartview.isDisplayed()) {
			 System.out.println("Chart view is displayed");
			 val=true;
		 }
		 else {
			 System.out.println("Chart view is not displayed");
		 }
		 
		 if(cattlepercent.isDisplayed()) {
			 System.out.println("Cattle %:"+cattlepercent.getText());
			 val=true;
		 }
		 else {
			 System.out.println("Cattle percentage is not displayed");
		 }
		 
		 if(otherspercent.isDisplayed()) {
			 System.out.println("Other percentage:"+otherspercent.getText());
			 val=true;
		 }
		 else {
			 System.out.println("Other percentage is not displayed");
		 }
		 return val;
	 }
	
	public boolean verifyCattleList() throws InterruptedException {
		boolean val=false;
		if(cattlelist.size()!=0) {
			val=true;
			for(int i=0;i<((cattlelist.size()/2)+1);i++) {
				System.out.println(cattlelist.get(i).getText());
				cattlelist.get(i).click();
				backfromcattledetails.click();
				
			}		
	
			WebElement ele=driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
			Map<String, Object>params=new HashMap<>();
			params.put("direction", "down");
			params.put("element", ((RemoteWebElement)ele).getId());
			driver.executeScript("mobile:scroll", params);
			
			val=true;
			for(int j=6;j<cattlelist.size();j++) {
				System.out.println(cattlelist.get(j).getText());
				cattlelist.get(j).click();
				backfromcattledetails.click();
				
			}
		
		
		}
		
		return val;
	}
	
	public boolean cattleDetails() throws InterruptedException {
		boolean val=false;
		Thread.sleep(3000);
		
			cattlelist.get(0).click();
			val=true;
		
		return val;
	}

	public boolean backBtnClicked() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		return val;
	}
	

}
