package ru.pflb.autotests.habr.pageobjects;

import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage {

    public void clickRatingButton() {
        WebElement ratingButton = driver.findElementByXPath("//a[text()='по рейтингу']");
        ratingButton.click();
    }

    public void goToPage() {
        WebElement toPageButton = driver.findElementByXPath("//a[text()='4']");
        driver.scrollToElement(toPageButton);
        toPageButton.click();

        // использовать несколько значений xpath //input[@id='123' and @class = '']
    }

    public void clickOnArticle() {
        WebElement articleClick = driver.findElementByXPath("//div[@id='broadcast_posts_today']/ul/li['1']/a");
        driver.scrollToElement(articleClick);
        articleClick.click();
    }

    public void clickOnLogin() {
        WebElement loginClick =
                driver.findElementByXPath("//html/body/div['3']/div['5']/div/div['1']/div['1']/div/ul/li['1']/a");
        driver.scrollToElement(loginClick);
        loginClick.click();
    }
}
