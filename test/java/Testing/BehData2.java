package Testing;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BehData2 {
	public static WebDriver driver;

	@Before
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		driver.get(arg1);
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		WebElement searchBar = driver.findElement(By.id("sb_form_q"));
		searchBar.sendKeys(arg1);
		searchBar.sendKeys(Keys.ENTER);

	}

	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("b_results")));
		WebElement results = driver.findElement(By.id("b_results"));
		assertTrue(results.isDisplayed());

	}

	@After
	public static void finalise() {
		driver.quit();
	}
}
