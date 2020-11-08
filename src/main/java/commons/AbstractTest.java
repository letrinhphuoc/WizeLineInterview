package commons;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AbstractTest {
    // init log
    public  final Log log;
    public AbstractTest() {
        log = LogFactory.getLog(getClass());
    }

    private boolean checkPassed(boolean condition) {
        boolean pass = true;
        try {
            if (condition == true)
                log.info("===PASSED===");
            else
                System.out.println("false");
            log.info("===FALSED===");
            Assert.assertTrue(condition);
        } catch (Throwable e) {
            pass = false;

        }
        return pass;

    }

    public boolean verifyTrue(boolean condition) {
        return checkPassed(condition);
    }

    private boolean checkFailed(boolean condition) {
        boolean pass = true;
        try {
            if (condition == false)
                log.info("===PASSED===");
            else
                log.info("===FAILED===");
            Assert.assertFalse(condition);
        } catch (Throwable e) {
            pass = false;

        }
        return pass;
    }


    protected void closeBrowser(WebDriver driver) {

        try {

            String osName = System.getProperty("os.name").toLowerCase();
            String cmd = "";
            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
            }
            if (driver.toString().toLowerCase().contains("chrome")) {
                if (osName.toLowerCase().contains("mac")) {
                    cmd = "pkill chromedriver";
                } else {
                    cmd = "taskskill /IM chromedriver.exe /F";
                }
                Process process = Runtime.getRuntime().exec(cmd);
                process.waitFor();
            }
            if (driver.toString().toLowerCase().contains("internetexplorer")) {
                cmd = "taskskill /IM IEDriverServer.exe /F";
                Process process = Runtime.getRuntime().exec(cmd);
                process.waitFor();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
