package pageFactory;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WishListPage {
	@FindBy(xpath="(//a[contains(@class,'ico-wishlist')])[1]")
	private WebElement wishListLink;

	@FindBy(xpath="(//input[contains(@name,'removefromcart')])[1]")
	private WebElement FirstCheckBox;

	@FindBy(xpath="(//input[contains(@name,'removefromcart')])[2]")
	private WebElement SecondCheckBox;

	@FindBy(xpath="(//input[contains(@name,'removefromcart')])[3]")
	private WebElement ThirdCheckBox;

	@FindBy(xpath="(//input[contains(@class,'button-2 update-wishlist-button')])[1]")
	private WebElement UpdateWishlistBTN;

	@FindBy(xpath="//div[contains(@class,'wishlist-content')]")
	private WebElement VerifyText;



	JavascriptExecutor js;
	WebDriverWait wait;
	Actions actions ;

	public WishListPage(WebDriver driver)

	{
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}

	public void addtoCart() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",wishListLink );
		js.executeScript("arguments[0].click()",wishListLink);

		js.executeScript("arguments[0].scrollIntoView()",FirstCheckBox );
		js.executeScript("arguments[0].click()",FirstCheckBox);

		js.executeScript("arguments[0].scrollIntoView()",UpdateWishlistBTN);
		js.executeScript("arguments[0].click()",UpdateWishlistBTN);


	}

	public void  clickOnwishListLink() {
		wishListLink.click();	
	} 

	public void  clickOnFirstCheckBox() {
		FirstCheckBox.click();	
	} 

	public void  clickOnSecondCheckBox() {
		SecondCheckBox.click();	
	} 

	public void  clickOnThirdCheckBox() {
		ThirdCheckBox.click();	
	} 

	public void  clickOnUpdateWishlistBTN() {
		UpdateWishlistBTN.click();	
	} 



	public String getSignInText() {
		String text = VerifyText.getText();
		return text ;
	}
}
