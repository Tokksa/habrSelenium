package ru.pflb.autotests.habr.pageobjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.pflb.autotests.habr.WDriver;

public abstract class BasePage {
    WDriver driver = WDriver.getInstance();
    WebDriverWait wait = WDriver.wait;
    Logger log = WDriver.log;

    public BasePage() {

    }

    public void close() {
        driver.close();
    }

    public void maximize () {
        driver.maximizeWindow();
    }

}
