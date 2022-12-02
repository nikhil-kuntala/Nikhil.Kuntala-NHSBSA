package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dentalPage {
	
	WebDriver driver; 
	
	By englandRadioButton = By.id("radio-england");
	By scotlandRadioButton = By.id("radio-scotland");
	By walesRadioButton = By.id("radio-wales");
	By northernIrelandRadioButton = By.id("radio-ni");
	By notRegisteredRadioButton = By.id("radio-not-registered");
	By nextButton = By.id("next-button");
	
	public dentalPage(WebDriver driver) {
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
	
	public void clickNotRegisteredRadioButton() {
		driver.findElement(notRegisteredRadioButton).click();

	}
	public void clickNextButton() {
		driver.findElement(nextButton).click();

	}

}
