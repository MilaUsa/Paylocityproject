package stepdefinitions;

import Pages.paylocityPages.DashbordPage;
import Pages.paylocityPages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginPageSteps {
    WebDriver driver= DriverHelper.getDriver();
    LoginPage loginPage= new LoginPage(driver);
    DashbordPage dashbordPage=new DashbordPage(driver);

    @Given("an Employer")
    public void an_employer() {
      driver.get(ConfigReader.readProperty("paylocityurl"));

    }
    @Given("I am on the Benefits Dashboard page")
    public void i_am_on_the_benefits_dashboard_page() {
        loginPage.LoginPageInfo(ConfigReader.readProperty("Username"),ConfigReader.readProperty("Password"));

    }
    @When("I select Add employee")
    public void i_select_add_employee() {
       // DashbordPage dashbordPage=new DashbordPage(driver);
        dashbordPage.clickAddEmployeeBtn();

    }
    @Then("I should be able to enter employee details")
    public void i_should_be_able_to_enter_employee_details() {
      dashbordPage.EmployeeDetails();

    }
    @Then("First Name does not begin with {string} or {string}")
    public void first_name_does_not_begin_with_or(String firstname, String lastname) {
        Assert.assertFalse(firstname.startsWith("a"));
        Assert.assertFalse(firstname.startsWith("A"));
    }
    @Then("the employee should save")
    public void the_employee_should_save() {
        Assert.assertEquals(dashbordPage.ValidatedName(),"Cristina");

    }
    @Then("I should see the employee in the table")
    public void i_should_see_the_employee_in_the_table() {
    Assert.assertTrue(dashbordPage.NameIsDisplayed());
    }
    @Then("the benefits cost calculations are correct")
    public void the_benefits_cost_calculations_are_correct() {
     Assert.assertEquals(dashbordPage.BenefitCost(),"269.23");
    }

}
