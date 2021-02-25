package resources.testRunner;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
        features = { "src/test/java/resources/features" },
        glue = {"stepDefinitions"},
        plugin = { "pretty", "json:target/cucumber/cucumber.json" }
)

public class testRun  {
    private TestNGCucumberRunner testNGCucumberRunner;
    // protected static RemoteWebDriver driver = null;
//
//    @BeforeClass(alwaysRun = true)
//    public void setUpCucumber() {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
//
//    @Test(groups = "cucumber scenarios", description = "Runs Cucumber Scenarios")
//    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
//        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//        testNGCucumberRunner.finish();
//    }
}

