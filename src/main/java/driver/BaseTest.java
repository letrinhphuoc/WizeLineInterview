package driver;
import commons.AbstractTest;
import commons.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class BaseTest extends AbstractTest {
    protected WebDriver driver;

    @BeforeClass
    @Parameters({"browser"})
    public void setup(@Optional("chrome") String browser) {
        driver = DriverManager.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.get(Constants.URL);
    }

    @AfterClass
    public void teardown() {
        closeBrowser(driver);
    }
}
