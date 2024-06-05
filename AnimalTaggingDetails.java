package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.HideKeyboardStrategy;

public class AnimalTaggingDetails {
	
	IOSDriver driver;
	
	public AnimalTaggingDetails(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Back\"`]")
	public WebElement backbtn;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeStaticText[@name=\"Heading 1: Animal Tagging\"])[3]")
	public WebElement heading;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable")
	public WebElement table;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public WebElement cattlecell;
	
	@iOSXCUITFindBy(accessibility="Check boxCattleUnselected")
	public WebElement checkboxcattle;
	
	@iOSXCUITFindBy(accessibility="Cattle")
	public WebElement cattletxt;
	
	@iOSXCUITFindBy(accessibility="TaggedCattleCount")
	public WebElement taggedcattlecount;
	
	@iOSXCUITFindBy(accessibility="Enter untaggedCattleCount")
	public WebElement untaggedcattlecnt;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[2]")
	public WebElement goatcell;
	
	@iOSXCUITFindBy(accessibility="Check boxGoatUnselected")
	public WebElement checkboxgoat;
	
	@iOSXCUITFindBy(accessibility="Goat")
	public WebElement goattxt;
	
	@iOSXCUITFindBy(accessibility="TaggedGoatCount")
	public WebElement taggedgoatcnt;
	
	@iOSXCUITFindBy(accessibility="Enter untaggedGoatCount")
	public WebElement untaggedgoatcnt;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTable/XCUIElementTypeCell[3]")
	public WebElement sheepcell;
	
	@iOSXCUITFindBy(accessibility="Check boxSheepUnselected")
	public WebElement checkboxsheep;
	
	@iOSXCUITFindBy(accessibility="Sheep")
	public WebElement sheeptxt;
	
	@iOSXCUITFindBy(accessibility="TaggedSheepCount")
	public WebElement taggedsheepcnt;
	
	@iOSXCUITFindBy(accessibility="Enter untaggedSheepCount")
	public WebElement untaggedsheepcnt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Accept the confirmation policy\"`]")
	public WebElement confirmationcheckbox;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"I confirm that\"`]")
	public WebElement confirmstmnt;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Create new tagging request\"`]")
	public WebElement submitbtn;
	
	
	//Alert:
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeWindow/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther")
	public WebElement alertview;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name contains \"Invalid request details\"`]")
	public WebElement alerttext;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"Ok\"`]")
	public WebElement alertokbtn;
	
	
	public boolean verifyHeader() {
		boolean val=false;
		if(heading.isDisplayed()) {
			System.out.println("Heading:"+heading.getText());
			val=true;
		}
		else {
			System.out.println("Heading is not displayed at tagging details page");
		}
		return val;
	}
	
	public boolean speciesTableDisp() {
		boolean val=false;
		if(table.isDisplayed()) {
			System.out.println("Species table is displayed");
			val=true;
		}
		else {
			System.out.println("Species table is not displayed");
		}
		cattleCell();
		goatCell();
		sheepCell();
		
		return val;
	}
	
	public boolean cattleCell() {
		boolean val=false;
		if(cattlecell.isDisplayed()) {
			if(checkboxcattle.isDisplayed()) {
				System.out.println("Cattle checkbox is dispalyed");
				checkboxcattle.click();
				val=true;
			}
			else {
				System.out.println("Cattle checkbox is not displayed");
			}
			
			
		}
		else {
			System.out.println("Cattle table is not displayed");
		}
		
		if(cattletxt.isDisplayed()) {
			System.out.println("Cattle text:"+cattletxt.getText());
			val=true;
		}
		else {
			System.out.println("Cattle text is not displayed");
		}
		
		if(taggedcattlecount.isDisplayed()) {
			System.out.println("Count of Tagged cattle:"+taggedcattlecount.getText());
			val=true;
		}
		else {
			System.out.println("Tagged cattle count is not displayed");
		}
		
		if(untaggedcattlecnt.isDisplayed()) {
			System.out.println("Untagged cattle count:"+untaggedcattlecnt.getText());
//			untaggedcattlecnt.sendKeys("3");
//			System.out.println("Untagged cattle count:"+untaggedcattlecnt.getText());
			val=true;
		}
		else {
			System.out.println("Untagged cattle count is not displayed");
		}
		return val;
	}
	
	public boolean goatCell() {
		boolean val=false;
		if(goatcell.isDisplayed()) {
			System.out.println("Goat cell is displayed");
			val=true;
		}
		else {
			System.out.println("Goat cell is not displayed");
		}
		
		if(checkboxgoat.isDisplayed()) {
			System.out.println("Goat checkbox is displayed");
			checkboxgoat.click();
			System.out.println("Goat checkbox is checked now");
			val=true;
		}
		else {
			System.out.println("Checkbox corresponding to goat is not displayed");
		}
		
		if(goattxt.isDisplayed()) {
			System.out.println("Sheep text:"+goattxt.getText());
			val=true;
		}
		else {
			System.out.println("Sheep text is not displayed");
		}
		
		if(taggedgoatcnt.isDisplayed()) {
			System.out.println("Tagged Goats:"+taggedgoatcnt.getText());
			val=true;
		}
		else {
			System.out.println("Tagged Goat count is not found");
		}
		
		if(untaggedgoatcnt.isDisplayed()) {
			System.out.println("Untagged goat count:"+untaggedgoatcnt.getText());
//			untaggedgoatcnt.sendKeys("4");
//			System.out.println("Untagged goat count:"+untaggedgoatcnt.getText());
			val=true;
		}
		else {
			System.out.println("No value found under untagged goat count");
		}
		
		return val;
	}
	
	public boolean sheepCell() {
		boolean val=false;
		if(sheepcell.isDisplayed()) {
			System.out.println("Sheep cell is displayed");
			val=true;
		}
		else {
			System.out.println("Sheep cell is not found");
		}
		
		if(checkboxsheep.isDisplayed()) {
			System.out.println("Checkbox corresponding to shee cell is displayed");
			checkboxsheep.click();
			val=true;
		}
		else {
			System.out.println("Checkbox corresponding to sheep cell is not displayed");
		}
		
		if(sheeptxt.isDisplayed()) {
			System.out.println("Sheep text:"+sheeptxt.getText());
			val=true;
		}
		else {
			System.out.println("Sheep text is not displayed");
		}
		
		if(taggedsheepcnt.isDisplayed()) {
			System.out.println("Tagged sheep count:"+taggedsheepcnt.getText());
			val=true;
		}
		else {
			System.out.println("Tagged sheep count is not displayed");
		}
		
		if(untaggedsheepcnt.isDisplayed()) {
			System.out.println("Untagged sheep count:"+untaggedsheepcnt.getText());
//			untaggedsheepcnt.sendKeys("1");
//			System.out.println("Untagged sheep count:"+untaggedsheepcnt.getText());
			val=true;
			//driver.hideKeyboard();
			//((IOSDriver) driver).hideKeyboard(HideKeyboardStrategy.PRESS_KEY, "Done");
			}
		return val;
	}
	
	public boolean submitAnimalTaggingValues() {
		boolean val =false;
		if(confirmationcheckbox.isDisplayed()) {
			confirmationcheckbox.click();
			val=true;
		}
		else {
			System.out.println("Confirmation checkbox is not found");
		}
		
		if(confirmstmnt.isDisplayed()) {
			System.out.println("Confirmation text:"+confirmstmnt.getText());
			val=true;
		}
		else {
			System.out.println("Confirmation text is not found");
		}
		
		if(submitbtn.isDisplayed()) {
			submitbtn.click();
			val=true;
		}
		else {
			System.out.println("Submit button is not found");
		}
		return val;
	}
	
	public boolean alertView() {
		boolean val=false;
		if(alertview.isDisplayed()) {
			System.out.println("alertview is displayed");
			val=true;
		}
		else {
			System.out.println("Alert view is not displayed");
		}
		
		if(alerttext.isDisplayed()) {
			System.out.println(alerttext.getText());
			val=true;
		}
		else {
			System.out.println("Alert text is not displayed");
		}
		
		if(alertokbtn.isDisplayed()) {
			alertokbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to dismiss the alert view");
		}
		return val;
	}
	
	public boolean backfromanimaltaggingdetails() {
		boolean val=false;
		if(backbtn.isDisplayed()) {
			backbtn.click();
			val=true;
		}
		else {
			System.out.println("Not able to find back button");
		}
		return val;
	}

}
