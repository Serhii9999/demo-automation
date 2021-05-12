package com.demo.los.login;

import com.codeborne.selenide.WebDriverRunner;
import com.demo.core.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.demo.pages.Pages.mainPage;

public class TestMain extends BaseTest {



    @Test
    public void search() {
        open("https://amazon.com");
        mainPage().filter("Books");
        mainPage().searchFor("Java");
        String expectedURL = "https://www.amazon.com/s?k=Java&i=stripbooks-intl-ship&ref=nb_sb_noss";
        String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL );
    }

    @Test
    public void search1() {
        open("https://amazon.com");
        mainPage().filter("Books");
        mainPage().searchFor("Java");
        String expectedURL1 = "https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dstripbooks-intl-ship&field-keywords=Java";
        String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL1 );
    }

    @Test
    public void testGoToTodayDealsPage() {
        open("https://amazon.com");
        mainPage().goToTodayDeals();
        String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
        String expectedURL = "https://www.amazon.com/international-sales-offers/b/?ie=UTF8&node=15529609011&ref_=nav_cs_gb_intl_52df97a2eee74206a8343034e85cd058";
        Assert.assertEquals(actualURL,expectedURL );

    }

    @Test void testForUSDollarCurrency() {
        open("https://amazon.com");
        String dollar = "Dollar";
        Assert.assertTrue(mainPage().currentCurrency().contains(dollar));
    }



}
