package ru.pflb.autotests.habr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {

    public void setRegisterEmail() {
        WebElement fieldRegisterEmail = driver.findElementByXPath("//input[@id='email_field']");

        wait.until(ExpectedConditions.visibilityOf(fieldRegisterEmail));

        fieldRegisterEmail.clear();
        fieldRegisterEmail.sendKeys("HabrUser@email.ru");
    }

    public void setRegisterNickName() {
        WebElement fieldRegisterNickName = driver.findElementByXPath("//input[@id='nickname_field']");

        wait.until(ExpectedConditions.visibilityOf(fieldRegisterNickName));

        fieldRegisterNickName.clear();
        fieldRegisterNickName.sendKeys("HabrUser");
    }

    public void setRegisterPassword() {
        WebElement fieldRegisterPass = driver.findElementByXPath("//input[@id='password_field']");

        wait.until(ExpectedConditions.visibilityOf(fieldRegisterPass));

        fieldRegisterPass.clear();
        fieldRegisterPass.sendKeys("12345sdsdf");
    }

    public void setRegisterPasswordRepeat() {
        WebElement fieldRegisterPassRepeat = driver.findElementByXPath("//input[@id='password_repeat']");

        wait.until(ExpectedConditions.visibilityOf(fieldRegisterPassRepeat));

        fieldRegisterPassRepeat.clear();
        fieldRegisterPassRepeat.sendKeys("12345sdsdf");
    }

    public void setRegisterCaptcha() {
        WebElement fieldRegisterCaptcha = driver.findElementByXPath("//input[@id='captcha']");

        wait.until(ExpectedConditions.visibilityOf(fieldRegisterCaptcha));

        fieldRegisterCaptcha.clear();
        fieldRegisterCaptcha.sendKeys("G4H234");
    }

    public void clickRegisterButton() {
        WebElement registerButton = driver.findElementByXPath("//button[@id='registration_button']");
        registerButton.click();
    }

    public WebElement getWarningElement() {
        WebElement warning =
                wait.until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//div[contains (text(),'Неверно указаны символы с изображения')]")));
        return wait.until(ExpectedConditions.visibilityOf(warning));

    }
}
