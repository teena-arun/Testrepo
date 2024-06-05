package qatar.livestock.pageObjects.ios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PremiseWeatherInfo {
	
	IOSDriver driver;
	
	public PremiseWeatherInfo(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement weatheralertview;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Weather Info\"`]")
	public WebElement alertheader;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Close weather information\"`]")
	public WebElement alertclosebtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeImage[`name contains \"yellow_location_btn\"`]")
	public WebElement locimg;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Address/Area\"`]")
	public WebElement addressarea;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"San Francisco\"`]")
	public WebElement place;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]")
	public WebElement image;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \" °C\"`]")
	public WebElement temperature;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Weather:\"`]")
	public WebElement weathercondition;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \" | Humidity:\"`]")
	public WebElement humiditypercent;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Wind:\"`]")
	public WebElement windspeed;
	
	public boolean alertDisp() {
		boolean val=false;
		if(weatheralertview.isDisplayed()) {
			System.out.println("Weather Alert view is displayed");
			alertHeaderDisp();
			locationDetailsDisp();
			imageDisp();
			tempDisp();
			val=true;
		}
		else {
			System.out.println("Weather alert view is not displayed");
		}
		return val;
	}
	
	public boolean alertHeaderDisp() {
		boolean val=false;
		if(alertheader.isDisplayed()) {
			System.out.println(alertheader.getText());
			val=true;
		}
		else {
			val=false;
		}
		return val;
	}
	
	public boolean locationDetailsDisp() {
		boolean val=false;
		if(locimg.isDisplayed()) {
			System.out.println("Location image is displayed");
			val=true;
		}
		else {
			System.out.println("Location image is not displayed");
		}
		
		if(addressarea.isDisplayed()) {
			System.out.println(addressarea.getText()+":"+place.getText());
			val=true;
		}
		else {
			System.out.println("Place Address is not displayed");
		}
		
		return val;
	}
	
	
	public boolean imageDisp() {
		boolean val=false;
		if(image.isDisplayed()) {
			System.out.println("Image is displayed");
			val=true;
		}
		else {
			System.out.println("Image is not displayed");
		}
		return val;
	}
	
	public boolean tempDisp() {
		boolean val=false;
		if(temperature.isDisplayed()) {
			System.out.println("Temperature:"+temperature.getText());
			val=true;
		}
		else {
			System.out.println("Temperature is not displayed");
		}
		return val;
	}
	
	public boolean weatherConditionDisp() {
		boolean val=false;
		if(weathercondition.isDisplayed()) {
			System.out.println(weathercondition.getText());
			val=true;
		}
		else {
			System.out.println("Weather condition is not found");
		}
		
		if(humiditypercent.isDisplayed()) {
			System.out.println(humiditypercent.getText());
			val=true;
		}
		else {
			System.out.println("Humidity percentage is not displayed");
		}
		
		if(windspeed.isDisplayed()) {
			System.out.println(windspeed.getText());
			val=true;
		}
		else {
			System.out.println("Windspeed is not displayed");
		}
		
		return val;
	}
	
	public boolean closeAlertView() {
		boolean val=false;
		if(alertclosebtn.isDisplayed()) {
			alertclosebtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to close Weather Info Alert");
		}
		return val;
	}
	

}
