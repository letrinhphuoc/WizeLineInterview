package commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPages {

    public void waitForElementToVisible(WebDriver driver, String locator) {
        By by = By.xpath(locator);
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForElementToBeClickAble(WebDriver driver, String locator) {
        By by = By.xpath(locator);
        WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIMEOUT);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public boolean isControlDisplayed(WebDriver driver, String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        return element.isDisplayed();
    }

    public void clickToElement(WebDriver driver, String locator) {
        WebElement element = driver.findElement(By.xpath(locator));
        element.click();
    }

    public void sendKeyToElement(WebDriver driver, String locator, String value) {
        WebElement element = driver.findElement(By.xpath(locator));
        element.clear();
        element.sendKeys(value);
    }
    public void selectItemInDropdown(WebDriver driver, String locator, String value) {
        Select select = new Select(driver.findElement(By.xpath(locator)));
        select.selectByVisibleText(value);
    }
}
