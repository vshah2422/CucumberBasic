package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryCountTransformer;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    private BaseUtil base;


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("The Driver is : " + base.StepInfo);
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        // Write code here that turns the phrase above into concrete actions

    }


    @Then("^I should see the userform page$")
    public void iShouldSeeTheUserformPage() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter the username as admin and password as admin$")
    public void iEnterTheUsernameAsAdminAndPasswordAsAdmin() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^I enter the username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username is " + username + "  Password as  " + password);
    }

    @And("^i enter following details for the login to site$")
    public void iEnterFollowingDetailsForTheLoginToSite(DataTable table) {
        // Write code here that turns the phrase above into concrete actions

        table.raw();
        List<List<String>> data = table.raw();

        //Create ArrayList

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user : users) {
            System.out.println("The Password is :" + user.username);
            System.out.println("The Password is :" + user.password);

        }

    }

    @When("^I enter login details ([^\"]*) and password as ([^\"]*)$")
    public void iEnterLoginDetailsUsernameAndPasswordAsPassword(String username, String password) {
        System.out.println("The Username is :" + username);
        System.out.println("The Password is :" + password);

    }

    @And("^I enter users email address with Email:([^\"]*)$")
    public void iEnterUsersEmailAddressWithEmailAdmin(@Transform(EmailTransform.class) String email) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Email is :" + email);

    }

    @And("^I verify count of salary digits for Rs ([^\"]*)$")
    public void iVerifyCountOfSalaryDigitsForRs(@Transform(SalaryCountTransformer.class) int salary) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Salary digit count is " + salary);
    }

    public static class User

    {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
