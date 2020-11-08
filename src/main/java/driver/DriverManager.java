package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DriverManager {
    private static final Map<String, Supplier<WebDriver>> mapDriver = new HashMap<>();

    private static final Supplier<WebDriver> chromeDriverSupplier = () ->{
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-extensions");
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");
        return new ChromeDriver(options);
    };
    private static final Supplier<WebDriver> firefoxDriverSupplier = () -> {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    };

    static {
        mapDriver.put(DriverTypes.CHROME.getType(), chromeDriverSupplier);
        mapDriver.put(DriverTypes.FIREFOX.getType(), firefoxDriverSupplier);
    }

    public static final WebDriver getDriver(String type) {
        return mapDriver.get(type).get();
    }
}
