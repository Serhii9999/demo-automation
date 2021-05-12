package com.demo.los.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.demo.core.base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.demo.pages.Pages.languagePage;

public class TestLanguagePage extends BaseTest {

    @Test
    public void testLanguageChange() {
        open("https://amazon.com");
        languagePage().goToLanguagePage();
        languagePage().changeLanguageToEspanol();
        String actual = languagePage().getText();
        String expected = "Traducción";
        Assert.assertEquals(actual,expected);
    }



}
