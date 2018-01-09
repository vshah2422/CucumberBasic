package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before

    public void InitializeTest()
    {
        System.out.println("Opening The broweser :  Mock" );
        // Passing a dummy webdrive instance
        base.StepInfo ="FirefoxDriver";

    }

    @After

    public void TearDownSteps(Scenario scenario)
    {
        if ((scenario.isFailed()==true))

                System.out.println(scenario.getName());


        System.out.println("Tear down The broweser :  Mock" );

    }

}
