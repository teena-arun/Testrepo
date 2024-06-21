package qatar.livestock.pageObjects.ios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage {
	
	IOSDriver driver;
	
	public HomePage(IOSDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			
	}
	@iOSXCUITFindBy(accessibility="menuButton_identifier")
	public WebElement slidemenubtn;
	
	@iOSXCUITFindBy(accessibility="liveStockLogo_identifier")
	public WebElement livestocklogo;
	
	@iOSXCUITFindBy(accessibility="ownerNameLbl_identifier")
	public WebElement ownernamelbl;
	
	@iOSXCUITFindBy(accessibility="animalPremisesLabel_identifier")
	public WebElement assosciatedanimalslbl;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name == 'liveStockTableViewCell_identifier'`]")
	public List<WebElement> livestockanimallist;
	
	@iOSXCUITFindBy(accessibility="Cattle -")
	public WebElement cattlelbl;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText")
	public WebElement speciesnumlbl;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == 'Healthy'`]")
	public WebElement healthylbl;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == '8'`]")
	public WebElement healthynum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == 'Unhealthy'`]")
	public WebElement unhealthylbl;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeStaticText[`name == '2'`][1]")
	public WebElement unhealthynum;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name == 'Next'`][1]")
	public WebElement nextbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name == \"liveStockTableViewCell_identifier\"`][1]")
	public WebElement cattle;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name == 'liveStockTableViewCell_identifier'`][2]")
	public WebElement goat;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[`name == 'liveStockTableViewCell_identifier'`][3]")
	public WebElement sheep;
	
	//Tabbar elements clicked
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name == \"tab_bar\"`][1]")
	public WebElement livestockbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name == \"tab_bar\"`][2]")
	public WebElement taggingbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name == \"tab_bar\"`][3]")
	public WebElement appointmentbtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name == \"tab_bar\"`][4]")
	public WebElement premisebtn;
	
	//Hamburger Menu:
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[`name contains \"menuButton_identifier\"`]")
	public WebElement hamburgerbtn;
	
	
	
	public boolean verifyLogo() {
		
		boolean val=false;
		if(livestocklogo.isDisplayed()) {
			System.out.println("Livestock logo is displayed");
			val=true;
		}
		return val;
		
	}
	
	public boolean verifyOwnerName() {
		boolean val=false;
		if(ownernamelbl.isDisplayed())
		{
			System.out.println("Welcome owner message:"+ownernamelbl.getText());
			val=true;
		}
		return val;
	}
	
	public boolean verifyAssocAnimals() {
		boolean val =false;
		if(assosciatedanimalslbl.isDisplayed()) {
			System.out.println(assosciatedanimalslbl.getText());
			Assert.assertEquals("Associated Animals", assosciatedanimalslbl.getText());
                        System.out.println("Value asserted successfully");
                        System.out.println("Value asserted successfully,Teena");
                        System.out.println("Value 1 asserted successfully,Teena");
			
			val=true;
		}
		return val;
	}
	
	public boolean verifyAnimalList() {
		boolean val=false;
		if(livestockanimallist.size()!=0) {
			for(int i=0;i<livestockanimallist.size();i++) {
				System.out.println(livestockanimallist.get(i).getText());
			}
			
		}
		val=true;
		return val;
	}
	public boolean cattleSpeciesClicked() {
		boolean val=false;
		if(cattle.isDisplayed()) {
			cattle.click();
		}
		val=true;
		return val;
		
	}
	
	public boolean goatSpeciesClicked() {
		boolean val=false;
		if(goat.isDisplayed()) {
			goat.click();
			val=true;
		}
		return val;
	}
	
	public boolean sheepSpeciesClicked() {
		boolean val =false;
		if(sheep.isDisplayed()) {
			sheep.click();
			val=true;
		}
		return val;
	}
	
	public boolean gotoLiveStockPage() {
		boolean val=false;
		if(livestockbtn.isDisplayed())	{
			livestockbtn.click();
			val=true;
		}
		return val;	
		
	}
	
	public boolean gotoTaggingPage() {
		boolean val=false;
		if(taggingbtn.isDisplayed()) {
			taggingbtn.click();
			val=true;
		}
		return val;
	}
	public boolean gotoAppointmentPage() throws InterruptedException {
		boolean val=false;
		Thread.sleep(5000);
		if(appointmentbtn.isDisplayed()) {
			appointmentbtn.click();
			val=true;
		}
		return val;
	}
	
	public boolean gotoPremisePage() {
		boolean val=false;
		if(premisebtn.isDisplayed()) {
			premisebtn.click();
			val=true;
		}
		return val;
	}
	
	public boolean hamburgerMenuClicked() {
		boolean val=false;
			if(hamburgerbtn.isDisplayed()) {
				hamburgerbtn.click();
				val=true;
			}
			else {
				System.out.println("Not able to find Hamburger menu");
			}
			return val;
	}

}
