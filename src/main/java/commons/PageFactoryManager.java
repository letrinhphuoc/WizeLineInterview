package commons;

import org.openqa.selenium.WebDriver;
import pages.Step1_Test_US_About_YourselfPageObject;

public class PageFactoryManager {

    public static Step1_Test_US_About_YourselfPageObject getLoginPage(WebDriver driver){
        return new Step1_Test_US_About_YourselfPageObject(driver);
    }
}
