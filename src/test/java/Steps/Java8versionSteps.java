package Steps;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class Java8versionSteps implements En {
    public Java8versionSteps() {
        And("^i just need to see how cucumber java (\\d+) looks$", (Integer arg0) -> {
            // Write code here that turns the phrase above into concrete actions

        });
    }
}
