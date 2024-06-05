package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Sheep {
	
	IOSDriver driver;
	
	public Sheep(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	@iOSXCUITFindBy(accessibility="Back")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(accessibility="Heading 1 Species NameSheep")
	public WebElement sheepheader;
	
	@iOSXCUITFindBy(accessibility="Species search")
	public WebElement searchbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == 'Heading 2: Species Count '`]")
	public WebElement speciescntheader;
	
	@iOSXCUITFindBy(accessibility=". 2 Elements")
	public WebElement graphview;
	
	@iOSXCUITFindBy(accessibility="Sheep : 12.5 % of 100")
	public WebElement sheeppercent;
	
	@iOSXCUITFindBy(accessibility="Others : 87.5 % of 100")
	public WebElement otherspeciespercent;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell")
	public List<WebElement> sheeplist;
	
	@iOSXCUITFindBy(accessibility="Back")
	public WebElement backtosheep;
	
	public boolean verifyHeader() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			System.out.println("Back button is displayed at Sheep species page");
			val=true;
		}
		else {
			System.out.println("Back button is not displayed at sheep species page");
		}
		
		if(sheepheader.isDisplayed()) {
			System.out.println("Header:"+sheepheader.getText());
			val=true;
		}
		else {
			System.out.println("Header is not displayed at Sheep species page");
		}
		if(searchbtn.isDisplayed()) {
			System.out.println("Search button is diaplayed at Sheep species page");
			val=true;
		}
		else {
			System.out.println("Search button is not displayed at sheep species page");
		}
		return val;
		
	}
	
	public boolean verifyGraph() {
		boolean val=false;
		if(speciescntheader.isDisplayed()) {
			System.out.println("Header:"+speciescntheader.getText());
			val=true;
		}
		else {
			System.out.println("Sheep count header is not displayed");
		}
		
		if(graphview.isDisplayed()) {
			System.out.println("Graph view is displayed");
			val=true;
		}
		else {
			System.out.println("Graph view is not displayed at Sheep species page");
		}
		
		if(sheeppercent.isDisplayed()) {
			System.out.println("Sheep count %:"+sheeppercent.getText());
			val=true;
		}
		else {
			System.out.println("Sheep count is not displayed at graph at Sheep species page");
		}
		
		if(otherspeciespercent.isDisplayed()) {
			System.out.println("Other species count%:"+otherspeciespercent.getText());
			val=true;
		}
		else {
			System.out.println("Other species count is not displayed in graph in Sheep species page");
		}
		return val;
	}
	
	public boolean verifySheepList() throws InterruptedException {
		boolean val=false;
		for(int i=0;i<sheeplist.size();i++) {
			Thread.sleep(3000);
			System.out.println(sheeplist.get(i).getText());
			sheeplist.get(i).click();
			backtosheep.click();
			val=true;
		}
		return val;
	}

}
