import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyStepdefEssential {


    public List<EssentialLabel> label = new ArrayList<>();
    //Todo!
    public List<TestList> labelTest;
    @Before
    public void setup()  {
        labelTest = new ArrayList<>();

        for (int i =0; i < 2;i++){
            TestList testList = new TestList();
            labelTest.add(testList);

        }
    }




//   @Then("the label EssentialLabel has the {string}")
//    public void the_label_essential_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//        //Todo!
//       System.out.println(labelTest.get(0).toString());
//
//       //Assert.assertEquals(string, label.get(1).toString());
//
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the label PriceLabel has the {string}")
//    public void the_label_price_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the label SupportLabel has the {string}")
//    public void the_label_support_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label RecommendedLabel has the {string}")
//    public void the_label_recommended_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label ChoosePlanLabel has the {string}")
//    public void the_label_choose_plan_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the label MeridianCoreLabel has the {string}")
//    public void the_label_meridian_core_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label MinionsLabel has the {string}")
//    public void the_label_minions_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label installationConsultingLabel has the {string}")
//    public void the_label_installation_consulting_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label HelmLabel has the {string}")
//    public void the_label_helm_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the label PostgreSQlLabel has the {string}")
//    public void the_label_postgre_s_ql_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the label ResponseTimesLabel has the {string}")
//    public void the_label_response_times_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("the label CriticalLabel has the {string}")
//    public void the_label_critical_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label NonUrgentLabel has the {string}")
//    public void the_label_non_urgent_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label BusinessHoursTitleLabel has the {string}")
//    public void the_label_business_hours_title_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the label BusinessHoursLabel has the {string}")
//    public void the_label_business_hours_label_has_the(String string) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(string);
//       // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

    @Then("the label {string} has the {string}")
    public void the_label_has_the(String string, String string2) {

        throw new io.cucumber.java.PendingException();
    }

}
