package pageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DigitalDownloadPage {

	@FindBy(linkText="Digital downloads")
	private WebElement DigitalDownloadLink;
	
	@FindBy(id="products-orderby")
	private WebElement SortByItem;
	
	@FindBy(id="products-pagesize")
	private WebElement DisplayPerPage;
	
	@FindBy(id="products-viewmode")
	private WebElement DisplayViewMode;
	

	@FindBy(xpath="(//div[contains(@class,'picture')])[1]")
	private WebElement FirstItem;

	@FindBy(xpath="(//div[contains(@class,'picture')])[2]")
	private WebElement SecondItem;

	@FindBy(xpath="(//div[contains(@class,'picture')])[3]")
	private WebElement ThirdItem;


	@FindBy(xpath="//input[contains(@class,'button-2 add-to-wishlist-button')]")
	private WebElement wishListBTN;
	
	


	JavascriptExecutor js;
	WebDriverWait wait;
	Actions actions ;

	public DigitalDownloadPage(WebDriver driver)

	{
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));

	}

	public void addtoCart() throws InterruptedException {
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",FirstItem );
		js.executeScript("arguments[0].click()", FirstItem);

		js.executeScript("arguments[0].scrollIntoView()",wishListBTN );
		js.executeScript("arguments[0].click()", wishListBTN);


	}
	public void  clickOnDigitalDownloadLink() {
		DigitalDownloadLink.click();	
	}

	public void  clickOnFirstItem() {
		FirstItem.click();	
	}

	public void  clickOnSecondItem() {
		SecondItem.click();	
	}

	public void  clickOnThirdItem() {
		ThirdItem.click();	
	}

	public void  clickOnwishListBTN() {
		wishListBTN.click();	
	}
	
	public void  clickOnSortByItem() {
			
		 Select select = new Select(SortByItem);
		 select.selectByVisibleText("Name: A to Z");
	}
	

	public void  clickOnDisplayPerPage() {
		
		 Select select = new Select(DisplayPerPage);
		 select.selectByVisibleText("8");
	}
	
	public void  clickOnDisplayViewMode() {
		
		 Select select = new Select(DisplayViewMode);
		 //select.selectByVisibleText("Grid");
		 select.selectByVisibleText("List");
	}


}
