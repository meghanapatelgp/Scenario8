package stepDefination;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WishlistSteps extends Driver {


	@Given("User is on the homepage of the demo webshop")
	public void user_is_on_the_homepage_of_the_demo_webshop() {
		assertTrue(driver.getTitle().equals("Demo Web Shop"));
        logger.info("user is on landing page");
	}
	

	@When("User click on {string}")
	public void user_click_on(String string) {
		digitalDownloadPage.clickOnDigitalDownloadLink();
		digitalDownloadPage.clickOnSortByItem();
		digitalDownloadPage.clickOnDisplayPerPage();
		digitalDownloadPage.clickOnDisplayViewMode();
		 logger.info("dropdowdown selected sucessfully");
	}

	@When("User add all products to the wishlist")
	public void user_add_all_products_to_the_wishlist() {
		
		
		
		//digitalDownloadPage.clickOnDigitalDownloadLink();
		digitalDownloadPage.clickOnFirstItem();
		digitalDownloadPage.clickOnwishListBTN();
		
		digitalDownloadPage.clickOnDigitalDownloadLink();
		digitalDownloadPage.clickOnSecondItem();
		digitalDownloadPage.clickOnwishListBTN();
		
		digitalDownloadPage.clickOnDigitalDownloadLink();
		digitalDownloadPage.clickOnThirdItem();
		digitalDownloadPage.clickOnwishListBTN();
		
		 logger.info("product added to wishlist successfully");
	}

	@When("User go to the wishlist and remove all products")
	public void user_go_to_the_wishlist_and_remove_all_products() {
		wishListPage.clickOnwishListLink();
		wishListPage.clickOnFirstCheckBox();
		wishListPage.clickOnSecondCheckBox();
		wishListPage.clickOnThirdCheckBox();
		wishListPage.clickOnUpdateWishlistBTN();
		 logger.info("Removed all product from the wishlist successfully");
	}

	@Then("User should see the message {string}")
	public void user_should_see_the_message(String string) {
		String expectedText=string;
		String actualText = wishListPage.getSignInText();
		Assert.assertEquals(actualText,expectedText);
		 logger.info("Message asserted successfully");
	}
}
