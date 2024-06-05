package qatar.livestock.pageObjects.ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LandingPage {
	IOSDriver driver;
	public LandingPage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITFindBy(accessibility="MMLogo")
	public WebElement minofmunlogo;
	
	@iOSXCUITFindBy(accessibility="Heading 1: Animal Premises")
	public WebElement animalpremiseheading;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell")
	public List<WebElement> premisedetails;
	
	//**/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther
	//**/XCUIElementTypeCell/XCUIElementTypeOther[1]/XCUIElementTypeOther
	@iOSXCUITFindBy(accessibility="Premise Name:")
	public List<WebElement> premisename;
	
	@iOSXCUITFindBy(accessibility="Premise Code:")
	public List<WebElement> premisecode;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name == 'Premise Name:Ad Dawhah (Doha), Premise Code:33333'`]/XCUIElementTypeOther[1]/XCUIElementTypeOther")
	public WebElement row1;
	//**/XCUIElementTypeCell[`name == "Premise Name:Ad Dawhah (Doha), Premise Code:33333"`]/XCUIElementTypeOther[1]/XCUIElementTypeOther
	
	
	
	public boolean verifyministrylogo() throws InterruptedException {
		
		boolean val=false;

		HashMap<String, String> args = new HashMap<>();
	    args.put("action", "getButtons");
		List<String> buttons = (List<String>)driver.executeScript("mobile: alert", args);
		System.out.println(buttons);
		Thread.sleep(5000);
		if (buttons.get(2).equals("Allow While Using App")) {
			
			String btntxt=buttons.get(2);
			
			System.out.println("Button text at index 2:"+btntxt);
			
			
			//args.put("action", "accept");
			args.put("action", "accept");
	        args.put("buttonLabel", "Allow While Using App");
	        driver.executeScript("mobile: alert", args);
	        System.out.println("Alert button is clicked");
	        val=true;
		}
		else {
			System.out.println("Alert button not clicked");
		}
		
		HashMap<String, String> arg1 = new HashMap<>();
		arg1.put("action", "getButtons");
		List<String> button1 = (List<String>)driver.executeScript("mobile: alert", arg1);
		System.out.println(button1);
		
		Thread.sleep(5000);
		if (button1.get(1).equals("Allow")) {
			String btntxt1=button1.get(1);
			
			System.out.println("Button text at index 2:"+btntxt1);
			
			
			//args.put("action", "accept");
			arg1.put("action", "accept");
            Thread.sleep(5000);
	        arg1.put("buttonLabel", "Allow");
	        driver.executeScript("mobile: alert", arg1);
	        System.out.println("Alert button is clicked");
	        val=true;
		}
		else {
			System.out.println("Alert button not clicked");
		}

		Thread.sleep(5000);

		return val;
	}
	
	public boolean premiseList() {
		boolean val=false;
		
		if(minofmunlogo.isDisplayed()) {
			System.out.println("Ministry of Municipality logo is verified");
			val=true;
		}
		else {
			System.out.println("Couldn't find Ministry of Municipality logo");
		}
		
		if(animalpremiseheading.isDisplayed()) {
			System.out.println("Animal Premise Heading is displayed");
			val=true;
		}
		else {
			System.out.println("Animal Premise heading is not found");
		}
		
		System.out.println(premisedetails.size());
		for(int i=0;i<premisedetails.size();i++) {
			String entry=premisedetails.get(i).getText();
			System.out.println(entry);
		}
		//row1.click();
		return val;
	
	}
	
	public boolean elementClicked() {
		boolean val=false;
		//row1.click();
		premisedetails.get(0).click();
		val=true;
		return val;
		
	}

}
