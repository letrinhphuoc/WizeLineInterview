package wizeline.tests;


import commons.AbstractTest;
import commons.PageFactoryManager;
import driver.BaseTest;
import org.testng.annotations.Test;
import pages.Step1_Test_US_About_YourselfPageObject;
import commons.DataHelper;

import java.io.IOException;
import java.util.Properties;

public class Step1_Success extends BaseTest {
    AbstractTest abstractTest = new AbstractTest();
    Step1_Test_US_About_YourselfPageObject step;
    Properties prop = DataHelper.readPropertiesFile("stepInfo.properties");

    public Step1_Success() throws IOException {
    }
    @Test
    public void Step_01_SubmitTheFormSuccessFully(){
        step = PageFactoryManager.getLoginPage(driver);

        step.inputFirstNameToTextBox(prop.getProperty("firstName"));
        step.inputLastNameToTextBox(prop.getProperty("lastName"));
        step.inputEmailToTextBox(prop.getProperty("email"));
        step.selectMonthInDropdown(prop.getProperty("month"));
        step.selectDateInDropdown(prop.getProperty("date"));
        step.selectYearInDropdown(prop.getProperty("year"));
        step.clickNextButton();

    }

}
