import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyStepdefPricing {
    WebDriver driver = new FirefoxDriver();



    @Given("i am on the openNMS pricing web page")
    public void iAmOnTheOpenNMSPricingWebPage() {

        driver.get("https://opennmsstaging.wpengine.com/pricing");
        driver.manage().window().maximize();
         driver.findElement(By.cssSelector("#hs-eu-confirmation-button")).click();
    }

    @When("i verify that i am on the Pricing page")
   public void iVerifyThatIAmOnThePricingPage() {
        boolean dis = driver.findElement(By.cssSelector(".title-heading-left")).isDisplayed();
        Assert.assertEquals(true, dis);
   }


    @Then("quit browser")
    public void quitBrowser() {
        driver.quit();
    }


}
