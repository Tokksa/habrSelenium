package ru.pflb.autotests.habr.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    public void open() {
        driver.get("https://habr.com");
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElementByXPath("//button[@id='search-form-btn']");
        searchButton.click();
    }

    public void clickRegisterButton() {
        WebElement registerButton = driver.findElementByXPath("//a[text()='Регистрация']");
        registerButton.click();

    }

    public void enterSearchQuery() {
        WebElement searchQuery = driver.findElementByXPath("//input[@id='search-form-field']");
        wait.until(ExpectedConditions.visibilityOf(searchQuery));

        searchQuery.sendKeys("xpath" +"\n");
    }

    public void clickOnAdvertising() {
        WebElement AdvertisingClick =
                driver.findElementByXPath("//a[text()='Реклама']");
        driver.scrollToElement(AdvertisingClick);
        AdvertisingClick.click();
        driver.getWindow();
    }



}
