package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DOBPage;
import pages.benefitsPage;
import pages.careHomePage;
import pages.countryPage;
import pages.dentalPage;
import pages.diabetesPage;
import pages.glaucomaPage;
import pages.gpPage;
import pages.hadChildPage;
import pages.injuryPage;
import pages.islandsPage;
import pages.partnerPage;
import pages.savingsPage;
import pages.seriousConditionsPage;
import pages.startCheckerPage;

public class startCheckerSteps {
	
	WebDriver driver;
	startCheckerPage startChecker;
	countryPage countrySelect;
	gpPage gpSelect;
	dentalPage dentalSelect;
	DOBPage DOBenter;
	partnerPage partnerSelect;
	benefitsPage benefitsSelect;
	hadChildPage hadChildSelect;
	injuryPage injurySelect;
	diabetesPage diabetesSelect;
	seriousConditionsPage seriousConditionsSelect;
	careHomePage careHomeStatus;
	savingsPage savingsSelect;
	islandsPage islandsStatus;
	glaucomaPage glaucomaStatus;
		
	
	
	@Given("the User is on Start page")
	public void the_user_is_on_start_page() {
				
		FirefoxOptions options = new FirefoxOptions();
		WebDriverManager.firefoxdriver().avoidBrowserDetection().setup();
		driver = new FirefoxDriver(options);
		
		driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
			
	}

	@And("the user clicks on Start Now button")
	public void the_user_clicks_on_start_now_button() throws InterruptedException {
		startChecker = new startCheckerPage(driver); 
		
		startChecker.clickAcceptAnalytics();
		startChecker.clickStartNow();
		Thread.sleep(1000);
	}

	@When("the User selects the Country they Live in as England")
	public void the_user_selects_the_country_they_live_in_as_England() throws InterruptedException {
		
		countrySelect = new countryPage(driver); 
		
		countrySelect.selectEngland();
		countrySelect.clickNextButton();
		Thread.sleep(1000);
	     
	}
	
	@When("the User selects the Country they Live in as Scotland")
	public void the_user_selects_the_country_they_live_in_as_scotland() throws InterruptedException {
		
		countrySelect = new countryPage(driver); 
		
		countrySelect.selectScotland();
		countrySelect.clickNextButton();
		Thread.sleep(1000);
	     
	}
	
	@When("the User selects the Country they Live in as Wales")
	public void the_user_selects_the_country_they_live_in_as_Wales() throws InterruptedException {
		
		countrySelect = new countryPage(driver); 
		
		countrySelect.selectWales();
		countrySelect.clickNextButton();
		Thread.sleep(1000);
	     
	}
	
	@When("the User selects the Country they Live in as Northern Ireland")
	public void the_user_selects_the_country_they_live_in_as_Northern_Ireland() throws InterruptedException {
		
		countrySelect = new countryPage(driver); 
		
		countrySelect.selectNorthernIreland();
		countrySelect.clickNextButton();
		Thread.sleep(1000);
	     
	}
	
	@When("the User clicks on next button without selecting any option")
	public void the_user_clicks_on_next_without_any_optiond() throws InterruptedException {
		
		countrySelect = new countryPage(driver); 
		
		countrySelect.clickNextButton();
		Thread.sleep(1000);
	     
	}
	
	@And("the User selects whether they live in highlands as No")
	public void the_user_selects_they_live_inhighlands_as_no() throws InterruptedException {
		
		islandsStatus = new islandsPage(driver);
		
		islandsStatus.selectNoButton();
		islandsStatus.clickNextButton();
		Thread.sleep(1000);
	}

	@And("the User selects whether their GP is out of England as NO")
	public void the_user_selects_whether_their_gp_is_out_of_england_as_no() throws InterruptedException {
		
		gpSelect = new gpPage(driver);
		
		gpSelect.selectNoButton();
		gpSelect.clickNextButton();
		Thread.sleep(1000);
	}
	
	@And("the User selects whether their GP is out of England as Yes")
	public void the_user_selects_whether_their_gp_is_out_of_england_as_yes() throws InterruptedException {
		
		gpSelect = new gpPage(driver);
		
		gpSelect.selectYesButton();
		gpSelect.clickNextButton();
		Thread.sleep(1000);
	}

	@And("the User Selects which Country is their Dental Practice in as England")
	public void the_user_selects_which_country_is_their_dental_practice_in_as_eng() throws InterruptedException {
	     
		dentalSelect = new dentalPage(driver); 
		
		dentalSelect.selectEngland();
		dentalSelect.clickNextButton();
		Thread.sleep(1000);
	}
	
	@And("the User Selects which Country is their Dental Practice in as Scotland")
	public void the_user_selects_which_country_is_their_dental_practice_in_as_Scotland() throws InterruptedException {
	     
		dentalSelect = new dentalPage(driver); 
		
		dentalSelect.selectScotland();
		dentalSelect.clickNextButton();
		Thread.sleep(1000);
	}
	
	@And("the User Selects which Country is their Dental Practice in as Wales")
	public void the_user_selects_which_country_is_their_dental_practice_in_as_Wales() throws InterruptedException {
	     
		dentalSelect = new dentalPage(driver); 
		
		dentalSelect.selectWales();
		dentalSelect.clickNextButton();
		Thread.sleep(1000);
	}

	@And("^the User enters their DOB as (.*) (.*) (.*)$")
	public void the_user_enters_their_dob(String DD, String MM, String YYYY) throws InterruptedException {
		
		DOBenter = new DOBPage(driver);
		
		DOBenter.enterDDtext(DD);
		DOBenter.enterMMtext(MM);
		DOBenter.enterYYYYtext(YYYY);
		
		DOBenter.clickNextButton();
		Thread.sleep(1000);
	}

	@And("the User selects if they have a partner as Yes")
	public void the_user_selects_if_they_have_a_partner_as_Yes() throws InterruptedException {
		
		partnerSelect = new partnerPage(driver);
		
		partnerSelect.selectYesButton();
		partnerSelect.clickNextButton();
		Thread.sleep(1000);
	     
	}
	
	@And("the User selects if they have a partner as No")
	public void the_user_selects_if_they_have_a_partner_as_No() throws InterruptedException {
		
		partnerSelect = new partnerPage(driver);
		
		partnerSelect.selectNoButton();
		partnerSelect.clickNextButton();
		Thread.sleep(1000);
	     
	}

	@And("the User selects if they claim any benefits or tax credits as No")
	public void the_user_selects_if_they_claim_any_benefits_or_tax_credits_as_no() throws InterruptedException {

		benefitsSelect = new benefitsPage(driver);
		
		benefitsSelect.selectNoButton();
		benefitsSelect.clickNextButton();
		Thread.sleep(1000);
	}
	
	@And("the User selects if they claim any benefits or tax credits as Yes")
	public void the_user_selects_if_they_claim_any_benefits_or_tax_credits_as_Yes() throws InterruptedException {

		benefitsSelect = new benefitsPage(driver);
		
		benefitsSelect.selectYesButton();
		benefitsSelect.clickNextButton();
		Thread.sleep(1000);
	}

	@And("the User answers if they are pregnant or had child in last year as No")
	public void the_user_answers_if_they_are_pregnant_or_had_child_in_last_year_as_no() throws InterruptedException {
		
		hadChildSelect = new hadChildPage(driver);
		
		hadChildSelect.selectNoButton();
		hadChildSelect.clickNextButton();
		Thread.sleep(1000);
	}
	
	@And("the User answers if they are pregnant or had child in last year as Yes")
	public void the_user_answers_if_they_are_pregnant_or_had_child_in_last_year_as_Yes() throws InterruptedException {
		
		hadChildSelect = new hadChildPage(driver);
		
		hadChildSelect.selectYesButton();
		hadChildSelect.clickNextButton();
		Thread.sleep(1000);
	}

	@And("the User selects if they have any injury or illness due to Army Service as No")
	public void the_user_selects_if_they_have_any_injury_or_illness_due_to_army_service_as_no() throws InterruptedException {
		
		injurySelect = new injuryPage(driver);
		
		injurySelect.selectNoButton();
		injurySelect.clickNextButton();
		Thread.sleep(1000);
	}
	
	@And("the User selects if they have any injury or illness due to Army Service as Yes")
	public void the_user_selects_if_they_have_any_injury_or_illness_due_to_army_service_as_Yes() throws InterruptedException {
		
		injurySelect = new injuryPage(driver);
		
		injurySelect.selectYesButton();
		injurySelect.clickNextButton();
		Thread.sleep(1000);
	}

	@And("the User selects if they have diabetes as Yes")
	public void the_user_selects_if_they_have_diabetes_as_yes() throws InterruptedException {
		
		diabetesSelect = new diabetesPage(driver);
		
		diabetesSelect.selectYesButton();
		diabetesSelect.clickNextButton();
		Thread.sleep(1000);
		diabetesSelect.selectNoButton();
	     
	}
	
	@And("the User selects if they have diabetes as No")
	public void the_user_selects_if_they_have_diabetes_as_no() throws InterruptedException {
		
		diabetesSelect = new diabetesPage(driver);
		
		diabetesSelect.selectNoButton();
		diabetesSelect.clickNextButton();
		Thread.sleep(1000);
		
	     
	}
	
	@And("the User selects if they have glaucoma as Yes")
	public void the_user_selects_if_they_haveglaucoma_as_yes() throws InterruptedException {
		
		glaucomaStatus = new glaucomaPage(driver);
		
		glaucomaStatus.selectYesButton();
		glaucomaStatus.clickNextButton();
		Thread.sleep(1000);
	
	     
	}
	
	@And("the User selects if they have glaucoma as No")
	public void the_user_selects_if_they_haveglaucoma_as_no() throws InterruptedException {
		
		glaucomaStatus = new glaucomaPage(driver);
		
		glaucomaStatus.selectNoButton();
		glaucomaStatus.clickNextButton();
		Thread.sleep(1000);
	
	     
	}

	@And("the User selects if they are affected by any serious conditions as No")
	public void the_user_selects_if_they_are_affected_by_any_serious_conditions_as_no() throws InterruptedException {
		
		seriousConditionsSelect = new seriousConditionsPage(driver);
		
		seriousConditionsSelect.selectNoButton();
		seriousConditionsSelect.clickNextButton();
		Thread.sleep(1000);
		
	}
	
	@And("the User selects if they are affected by any serious conditions as Yes")
	public void the_user_selects_if_they_are_affected_by_any_serious_conditions_as_yes() throws InterruptedException {
		
		seriousConditionsSelect = new seriousConditionsPage(driver);
		
		seriousConditionsSelect.selectYesButton();
		seriousConditionsSelect.clickNextButton();
		Thread.sleep(1000);
		
	}

	@And("the User selects if they live in care home as No")
	public void the_user_selects_if_they_live_in_care_home_as_no() throws InterruptedException {
		
		careHomeStatus = new careHomePage(driver);
		
		careHomeStatus.selectNoButton();
		careHomeStatus.clickNextButton();
		Thread.sleep(1000);
		
	     
	}
	
	@And("the User selects if they live in care home as Yes")
	public void the_user_selects_if_they_live_in_care_home_as_Yes() throws InterruptedException {
		
		careHomeStatus = new careHomePage(driver);
		
		careHomeStatus.selectYesButton();
		careHomeStatus.clickNextButton();
		Thread.sleep(1000);
		
		careHomeStatus.selectNoButton();
		
	     
	}

	@And("the User selects if they have more than 16K savings as Yes")
	public void the_user_selects_if_they_have_more_than_16k_savings_as_yes() throws InterruptedException {
		
		savingsSelect = new savingsPage(driver);
		
		savingsSelect.selectYesButton();
		savingsSelect.clickNextButton();
		Thread.sleep(1000);
		
	     
	}
	
	@And("the User selects if they have more than 16K savings as No")
	public void the_user_selects_if_they_have_more_than_16k_savings_as_no() throws InterruptedException {
		
		savingsSelect = new savingsPage(driver);
		
		savingsSelect.selectNoButton();
		savingsSelect.clickNextButton();
		Thread.sleep(1000);
		
	     
	}

	@Then("the User is shown the NHS Costs Status in result page")
	public void the_user_is_shown_the_nhs_costs_Status_in_result_page() throws InterruptedException {
	     driver.getCurrentUrl().contains("result");
	     Thread.sleep(2000);
	     driver.quit();
	}
	
	@Then("the User is shown the service unavailable message in result page")
	public void the_user_is_shown_the_service_unavailable_msg_in_result_page() throws InterruptedException {
	     driver.getCurrentUrl().contains("service-not-northern-ireland");
	     Thread.sleep(2000);
	     driver.quit();
	}
	
	@Then("the User is shown an error message")
	public void the_user_is_shown_an_error_message() throws InterruptedException {
	     driver.findElement(By.id("error-summary-heading")).isDisplayed();
	     Thread.sleep(2000);
	     driver.quit();
	}


}
