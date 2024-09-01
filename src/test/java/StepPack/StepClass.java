package StepPack;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import BasePack.BaseClass;
import Locator.AddTowidlist;
import Locator.AssertPage;
import Locator.CheckOut;
import Locator.CompareList;
import Locator.HomePage;
import Locator.RemoveFromCart;
import Locator.Scroll;
import Locator.shoppingcart;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {

	HomePage hp = new HomePage();

	Scroll sl = new Scroll();

	CompareList cp = new CompareList();

	AddTowidlist wp = new AddTowidlist();

	shoppingcart sp = new shoppingcart();

	CheckOut ck = new CheckOut();

	AssertPage as = new AssertPage();

	RemoveFromCart rm = new RemoveFromCart();

	@Given("User launch {string}")
	public void user_launch(String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (Browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

	
		} else {
			System.out.println("No browsers were found");
		}

		maximize();
	}

	@When("Launch The Url")
	public void launch_the_url() {

		Url("https://magento.softwaretestingboard.com/");
	}

	@When("User {string}")
	public void user(String string) {
		hp.Login();
		hp.user();

	}

	@When("user2 {string}")
	public void user2(String string) {
		hp.pass();
		hp.Signin();
	}

	@When("Scroll")
	public void scroll() throws InterruptedException {
		sl.Scroll();
	}

	@When("ComparetoList")
	public void compareto_list() throws InterruptedException {
		cp.ComparetoList();
	}

	@When("ComparetowidList")
	public void comparetowid_list() {
		cp.ComparetowidList();
	}

	@When("AddCompafreList")
	public void add_compafre_list() {
		cp.AddCompareList();
	}

	@When("scrollComapareProducts")
	public void scroll_comapare_products() {
		cp.ScrollComapareProducts();
	}

	@When("AddToCart")
	public void add_to_cart() throws InterruptedException {
		cp.AddToCart();
	}

	@When("AddtoWidlist")
	public void addto_widlist() {
		wp.AddtoWidlist();
	}

	@When("ShoppingCart")
	public void shopping_cart() throws InterruptedException {
		sp.ShoppingCart();
	}

	@When("Edite")
	public void edite() {
		sp.Edite();
	}

	@When("Update")
	public void update() {
		sp.update();
	}

	@When("CheckOut")
	public void check_out() throws InterruptedException {
		ck.Scroll5();
		ck.CheckOut();
		ck.ScrollIntoShipping();
	}

	@Then("User3 {string}")
	public void user3(String string) throws InterruptedException {
		try {
			String expectedText = "First Name";
			String text = driver.findElement(as.AssertThePage).getText();

			Assert.assertEquals(expectedText, text);
			System.out.println("Fine It's Working");

		} catch (Exception e) {

			System.out.println("Its not Working");
		}

		NavigateBack();
		}

	@Then("Remove from Cart")
	public void remove_from_cart() throws InterruptedException {
		rm.scrollMyCart();
		rm.Mycart();
		rm.RemoveFromMycart();
		rm.ClickOK();

	
	quit();

}
	
}
