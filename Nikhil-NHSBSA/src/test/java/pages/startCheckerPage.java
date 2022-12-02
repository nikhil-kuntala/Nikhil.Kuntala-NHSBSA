package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class startCheckerPage {
	
	WebDriver driver; 
	
	By startNowButton = By.id("next-button");
	By acceptAnalytics = By.id("nhsuk-cookie-banner__link_accept_analytics");

	public startCheckerPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickStartNow() {
		driver.findElement(startNowButton).click();

	}
	
	public void clickAcceptAnalytics() {
		driver.findElement(acceptAnalytics).click();

	}
}
