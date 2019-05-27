package ru.pflb.autotests.habr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdvestingPage extends BasePage {

    public WebElement getAdvestingElement() {
        WebElement advesting =
                wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//div[@class='inner']/h1")));
        return wait.until(ExpectedConditions.visibilityOf(advesting));

    }

//    public WebElement getWarningElement() {
//        WebElement warning =
//                wait.until(ExpectedConditions.presenceOfElementLocated
//                        (By.xpath("//div[@class='inner']/h1")));
//        return wait.until(ExpectedConditions.visibilityOf(warning));
//
//    }

//    public void clickTestButton() {
//        WebElement testButton = driver.findElementByXPath("//a[text()='Услуги']");
//        wait.until(ExpectedConditions.visibilityOf(testButton));
//        testButton.click();
//    }
}
