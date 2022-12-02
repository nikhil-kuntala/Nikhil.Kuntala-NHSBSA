package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DOBPage {
	
	WebDriver driver; 
	
	By ddTextInput = By.id("dob-day");
	By mmTextInput = By.id("dob-month");
	By yyyyTextInput = By.id("dob-year");
	By nextButton = By.id("next-button");
	
	public DOBPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterDDtext(String DD) {
		driver.findElement(ddTextInput).sendKeys(DD);

	}
	
	public void enterMMtext(String MM) {
		driver.findElement(mmTextInput).sendKeys(MM);

	}
	
	public void enterYYYYtext(String YYYY) {
		driver.findElement(yyyyTextInput).sendKeys(YYYY);

	}
	
	public void clickNextButton() {
		driver.findElement(nextButton).click();

	}

}
