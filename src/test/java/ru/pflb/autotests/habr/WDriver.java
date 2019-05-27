package ru.pflb.autotests.habr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class WDriver {
    static ChromeDriver driver = null;

    public static Logger log = LogManager.getLogger();
    public static WebDriverWait wait = null;

    private static WDriver instance;

    public static WDriver getInstance() {
        if (instance == null) {
            instance = new WDriver();
        }
        return instance;
    }

    private WDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Project\\java\\habr\\bin\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars"); //отключение верхней секции с информацией
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10, 200);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.PAGE_DOWN);
    }

    public WebElement findElementByXPath(String xpath) {
        log.info(String.format("Ищу элемент с локатором: '%s'", xpath));
        return driver.findElementByXPath(xpath);

    }

    public void maximizeWindow() {
        log.info("Разворачиваю окно на весь экран");
        driver.manage().window().maximize();
    }

    public void get(String url) {
        log.info(String.format("Открываю страницу по адрусу: '%s'", url));
        driver.get(url);
    }

    public void scrollToElement(WebElement registerButton) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", registerButton);
    }

    public void getWindow() {
        ((JavascriptExecutor)driver).executeScript("window.open('about:blank', '_blank');");

        Set<String> tab_handles = driver.getWindowHandles();
        int number_of_tabs = tab_handles.size();
        int new_tab_index = number_of_tabs-1;
        driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
    }

    public void close() {
        log.info("Закрываю окно браузера");
        driver.close();
    }

}


