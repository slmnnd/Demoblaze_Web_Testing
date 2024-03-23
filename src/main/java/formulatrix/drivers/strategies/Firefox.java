package formulatrix.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public WebDriver setStrategy() {
        String path = "C:\\Users\\DELL\\work pray balance\\Demoblaze_Web_Testing\\file\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", path);
        WebDriver driver = new FirefoxDriver();
        return driver;
    }

}
