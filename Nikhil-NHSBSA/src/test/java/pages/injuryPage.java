package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class injuryPage {
	
	
	WebDriver driver; 
	
	By yesRadioButton = By.id("radio-yes");
	By noRadioButton = By.id("radio-no");
	By nextButton = By.id("next-button");
	
	public injuryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectYesButton() {
		driver.findElement(yesRadioButton).click();

	}
	
	public void selectNoButton() {
		driver.findElement(noRadioButton).click();

	}
	
	public void clickNextButton() {
		driver.findElement(nextButton).click();

	}

}
