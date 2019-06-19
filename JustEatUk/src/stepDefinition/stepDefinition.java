package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;


public class stepDefinition {
	WebDriver driver;

    @Given("^I want food in \"([^\"]*)\"$")
    public void i_want_food_in_something(String strArg1) throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ms\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    	driver.get("https://www.just-eat.co.uk/");
    	driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("AR51 1AA");
    }

    @When("^I search for restaurants$")
    public void i_search_for_restaurants() throws Throwable {

		driver.findElement(By.xpath("//*[@id=\'skipToMain\']/form/div/button/span")).click();
    }

    @Then("^I should see some restaurants in \"([^\"]*)\"$")
    public void i_should_see_some_restaurants_in_something(String strArg1) throws Throwable {
    	System.out.println(driver.getTitle());

    }

    @Then("^I should see some free delivery restaurants in \"([^\"]*)\"$")
    public void i_should_see_some_free_delivery_restaurants_in_something(String strArg1) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\'skipToMain\']/main/div/div[1]/div/div[5]/div[2]/span[2]/label")).click();

    }

    @Then("^I should see some italian restaurants in \"([^\"]*)\"$")
    public void i_should_see_some_italian_restaurants_in_something(String strArg1) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\'skipToMain\']/main/div/div[1]/div/div[3]/div/div/span[2]/label")).click();
    }
} 