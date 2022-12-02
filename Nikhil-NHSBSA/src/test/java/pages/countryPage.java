package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class countryPage {
	
	WebDriver driver; 
	
	By englandRadioButton = By.id("radio-england");
	By scotlandRadioButton = By.id("radio-scotland");
	By walesRadioButton = By.id("radio-wales");
	By northernIrelandRadioButton = By.id("radio-nire");
	By nextButton = By.id("next-button");

	public countryPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectEngland() {
		driver.findElement(englandRadioButton).click();

	}
	
	public void selectScotland() {
		driver.findElement(scotlandRadioButton).click();

	}
	
	public void selectWales() {
		driver.findElement(walesRadioButton).click();

	}
	
	public void selectNorthernIreland() {
		driver.findElement(northernIrelandRadioButton).click();

	}
	
	public void clickNextButton() {
		driver.findElement(nextButton).click();

	}

}
