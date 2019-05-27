package ru.pflb.autotests.habr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    public void setEmail() {
        WebElement fieldDisplayEmail = driver.findElementByXPath("//input[@id='email_field']");

        wait.until(ExpectedConditions.visibilityOf(fieldDisplayEmail));

        fieldDisplayEmail.clear();
        fieldDisplayEmail.sendKeys("HabrUser");
    }
    public void setPassword() {
        WebElement fieldDisplayPass = driver.findElementByXPath("//input[@id='password_field']");

        wait.until(ExpectedConditions.visibilityOf(fieldDisplayPass));

        fieldDisplayPass.clear();
        fieldDisplayPass.sendKeys("12345");
    }

    public WebElement getWarningElement() {
        WebElement warning =
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains (text(),'корректный e-mail')]")));
        return wait.until(ExpectedConditions.visibilityOf(warning));

    }
}
