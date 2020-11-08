package pages;

import commons.AbstractPages;
import org.openqa.selenium.WebDriver;
import pagesUI.Step1_Test_US_About_YourselfPageUI;

public class Step1_Test_US_About_YourselfPageObject extends AbstractPages {
    private WebDriver driver;
    public Step1_Test_US_About_YourselfPageObject(WebDriver driver){
        this.driver = driver;
    }
    public void inputFirstNameToTextBox(String firstName){
        waitForElementToVisible(driver, Step1_Test_US_About_YourselfPageUI.FIRSTNAME);
        sendKeyToElement(driver, Step1_Test_US_About_YourselfPageUI.FIRSTNAME,firstName);
    }
    public void inputLastNameToTextBox(String lastName){
        waitForElementToVisible(driver, Step1_Test_US_About_YourselfPageUI.LASTNAME);
        sendKeyToElement(driver, Step1_Test_US_About_YourselfPageUI.LASTNAME,lastName);
    }
    public void inputEmailToTextBox(String email){
        waitForElementToVisible(driver, Step1_Test_US_About_YourselfPageUI.EMAIL);
        sendKeyToElement(driver, Step1_Test_US_About_YourselfPageUI.EMAIL,email);
    }
    public void selectMonthInDropdown(String month){
        waitForElementToVisible(driver, Step1_Test_US_About_YourselfPageUI.MONTH);
        selectItemInDropdown(driver,Step1_Test_US_About_YourselfPageUI.MONTH,month);
    }
    public void selectDateInDropdown(String date){
        waitForElementToVisible(driver, Step1_Test_US_About_YourselfPageUI.DATE);
        selectItemInDropdown(driver,Step1_Test_US_About_YourselfPageUI.DATE,date);
    }
    public void selectYearInDropdown(String year){
        waitForElementToVisible(driver, Step1_Test_US_About_YourselfPageUI.YEAR);
        selectItemInDropdown(driver,Step1_Test_US_About_YourselfPageUI.YEAR,year);
    }
    public void clickNextButton(){
        waitForElementToBeClickAble(driver, Step1_Test_US_About_YourselfPageUI.NEXT_LOCATION_BUTON);
        clickToElement(driver,Step1_Test_US_About_YourselfPageUI.NEXT_LOCATION_BUTON);
    }

    public boolean isInvalidMessageDisplayed(){
        waitForElementToVisible(driver, Step1_Test_US_About_YourselfPageUI.INVALID_MESSAGE);
        return isControlDisplayed(driver,Step1_Test_US_About_YourselfPageUI.INVALID_MESSAGE);
    }






}
