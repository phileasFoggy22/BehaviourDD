package Testing;

public class BehaviorDrivenTest {
	// public static WebDriver driver;
	//
	// @Before
	// public static void init() {
	// System.setProperty("webdriver.chrome.driver",
	// "C:\\Users\\Admin\\Documents\\chromedriver.exe");
	// driver = new ChromeDriver();
	// }
	//
	// @Given("^the correct web address$")
	// public void the_correct_web_address() {
	// // Write code here that turns the phrase above into concrete actions
	// driver.manage().window().maximize();
	// driver.get(Constant.URL1);
	// // WebElement getURL = driver.findElement(By.xpath("/html/head/meta[8]"));
	// // assertEquals("",getURL.getAttribute("content"));
	//
	// }
	//
	// @When("^I navigate to the 'Menu' page$")
	// public void i_navigate_to_the_Menu_page() {
	//
	// driver.navigate().to("http://www.practiceselenium.com/menu.html");
	// // Write code here that turns the phrase above into concrete actions
	//
	// }
	//
	// @Then("^I can browse a list of the available products\\.$")
	// public void i_can_browse_a_list_of_the_available_products() {
	//
	// WebElement greenTea = driver.findElement(
	// By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong"));
	// // assertEquals(greenTea.getText(), "Green Tea");
	// if (greenTea.getText().toLowerCase().contains("tea")) {
	// System.out.println("Green Tea Found");
	// assertTrue(greenTea.getText().contains("Tea"));
	//
	// } else {
	// System.out.println("not found");
	//
	// }
	//
	// // Write code here that turns the phrase above into concrete actions
	//
	// }
	//
	// @When("^I click the checkout button$")
	// public void i_click_the_checkout_button() throws InterruptedException {
	// driver.navigate().to("http://www.practiceselenium.com/menu.html");
	// WebDriverWait wait = new WebDriverWait(driver, 20);
	// wait.until(ExpectedConditions
	// .visibilityOfElementLocated(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]")));
	// WebElement checkOut = driver
	// .findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]"));
	// checkOut.click();
	// //
	// // Write code here that turns the phrase above into concrete actions
	//
	// }
	//
	// @Then("^I am taken to the checkout page$")
	// public void i_am_taken_to_the_checkout_page() {
	// // Write code here that turns the phrase above into concrete actions
	// WebElement checkOutSuccess = driver.findElement(
	// By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000451990420\"]/div/pre/strong/span"));
	// assertTrue(checkOutSuccess.getText().contains("billing"));
	// }
	//
	// @After
	// public static void finalise() {
	// driver.quit();
	// }
}
