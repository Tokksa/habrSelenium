package ru.pflb.autotests.habr;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.pflb.autotests.habr.pageobjects.*;

public class SearchTest {
    MainPage mainPage = new MainPage();
    ResultPage resultPage = new ResultPage();
    AccountPage accountPage = new AccountPage();
    RegisterPage registerPage = new RegisterPage();
    AdvestingPage advestingPage = new AdvestingPage();

    @Test
    public void test() {
        mainPage.maximize();
        mainPage.open();
        mainPage.clickSearchButton();
        mainPage.enterSearchQuery();
        resultPage.clickRatingButton();
        resultPage.goToPage();
        resultPage.clickOnArticle();
        resultPage.clickOnLogin();
        accountPage.setEmail();
        accountPage.setPassword();
        accountPage.getWarningElement();

        WebElement warning = accountPage.getWarningElement();
        Assert.assertNotNull(warning);

        resultPage.close();
    }

    @Test
    public void test2() {
        mainPage.maximize();
        mainPage.open();
        mainPage.clickRegisterButton();
        registerPage.setRegisterEmail();
        registerPage.setRegisterNickName();
        registerPage.setRegisterPassword();
        registerPage.setRegisterPasswordRepeat();
        registerPage.setRegisterCaptcha();
        registerPage.clickRegisterButton();

        WebElement warning = registerPage.getWarningElement();
        Assert.assertNotNull(warning);

        registerPage.close();
    }

    @Test
    public void test3() {
        mainPage.maximize();
        mainPage.open();
        mainPage.clickOnAdvertising();


        WebElement advesting = advestingPage.getAdvestingElement();
        Assert.assertNotNull(advesting);

        advestingPage.close();
    }



}


