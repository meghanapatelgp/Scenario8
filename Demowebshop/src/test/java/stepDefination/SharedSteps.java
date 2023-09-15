package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pageFactory.DigitalDownloadPage;
import pageFactory.WishListPage;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;



public class SharedSteps extends Tools{

	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}

class Tools {
	protected static WebDriver driver;
}

class Driver extends Tools{

	
	public static RequestSpecification httprequest;
	public static Response response;
	public static Logger logger;
	
	protected static DigitalDownloadPage digitalDownloadPage;
	protected static  WishListPage  wishListPage;

	public static void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");


		digitalDownloadPage = new DigitalDownloadPage(driver);
		wishListPage = new  WishListPage(driver);
		 logger = Logger.getLogger("LogDemo");
			PropertyConfigurator.configure("log4j.properties");
			logger.setLevel(Level.DEBUG);
	}
}