package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.NavigateArrivals;

public class NavigateStepDef  {
	NavigateArrivals navigateArrivals;
	@Given("User4 opens the browser and go to webpage")
	public void user_opens_the_browser_and_go_to_webpage() {
		navigateArrivals=new NavigateArrivals();
	}

	@When("User4 click shop menu")
	public void user_click_shop_menu() {
		navigateArrivals.clickShop();
	}

	@When("user4 click on Home menu")
	public void user_click_on_Home_menu() {
		navigateArrivals.clickHome();
	}

	@When("test home page has three arrivals only3")
	public void test_home_page_has_three_arrivals_only() {
		navigateArrivals.checkArrival();
	}

	@When("check its only have three arrivals3")
	public void check_its_only_have_three_arrivals() {
		navigateArrivals.confirm();
	}

	@When("user clicks image in the arrival3")
	public void user_clicks_image_in_the_arrival() {
		navigateArrivals.clickOnImage();
	}

	@When("check whether it is navigating to next page2")
	public void check_whether_it_is_navigating_to_next_page() {
		navigateArrivals.checkingNavigation();
	}

	@When("add that book into basket2")
	public void add_that_book_into_basket() {
		navigateArrivals.addToBasket();
	}

	@Then("check the user can add to basket1")
	public void check_the_user_can_add_to_basket() {
		navigateArrivals.checkingBasket();
	}

}
