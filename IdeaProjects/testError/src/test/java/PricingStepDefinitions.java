import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PricingStepDefinitions {

    @Given("i am on openNMS pricing page")
    public void iAmOnOpenNMSPricingPage() {
    }

    @When("the page loaded")
    public void thePageLoaded() {
    }

    @Then("i verify the label <EssentialPricingModelLabel> has the <LabelText>")
    public void iVerifyTheLabelEssentialPricingModelLabelHasTheLabelText(DataTable ess, String pricingLabel, String expectedResult) {




        // TODO: find the element that is related to pricingLabel parameter, then you want to compare
        //       the value from this element to the parameter expectedResult.


    }



}
