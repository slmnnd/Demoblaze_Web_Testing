package formulatrix;

import formulatrix.drivers.DriverSingleton;
import formulatrix.utils.TestCase;
import formulatrix.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
    static WebDriver driver;
    static ExtentTest extentTest;
    static ExtentReports extentReports = new ExtentReports("target/extent-report.html");

    @Before
    public static void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        TestCase[] test = TestCase.values();
        extentTest = extentReports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }
    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if (scenario.isFailed()){
            String screenshotPath = Utils.getScreenshot(driver, scenario.getName()
                    .replace(" ", " "));
            extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
            +extentTest.addScreenCapture(screenshotPath));
        }
    }
    @After
    public void endTestCase(){
        extentReports.endTest(extentTest);
        extentReports.flush();
    }
    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
