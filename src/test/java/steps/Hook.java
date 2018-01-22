package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before

    public void InitializeTest() {
        System.out.println("Opening The broweser :  Mock");
        // Passing a dummy webdrive instance
        System.setProperty("webdriver.gecko.driver", "V:\\Java_Tutotorial_EA\\lib\\geckodriver.exe");
        base.Driver = new FirefoxDriver();
        base.Driver.manage().window().maximize();

    }

    @After

    public void TearDownSteps(Scenario scenario) {

        if ((scenario.isFailed()))

            System.out.println(scenario.getName());

        base.Driver.close();
        System.out.println("Tear down The broweser :  Mock");

    }

}
