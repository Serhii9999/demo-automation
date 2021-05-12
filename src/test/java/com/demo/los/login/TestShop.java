package com.demo.los.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.demo.pages.Pages.*;


public class TestShop {

    @Test
    public void testGoToCameraANdPhotoPage() {
        open("https://amazon.com");
        mainPage().clickAllProductsButton();
        shopPage().goToElectronicsSection();
        shopPage().goToCameraAndPhotoPage();
        String expectedURL = "https://www.amazon.com/s?bbn=16225009011&rh=i%3Aspecialty-aps%2Cn%3A%2116225009011%2Cn%3A502394&ref_=nav_em__nav_desktop_sa_intl_camera_and_photo_0_2_5_3";
        String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }

    @Test
    public void testSamsungButton() {
        open("https://www.amazon.com/s?bbn=16225009011&rh=i%3Aspecialty-aps%2Cn%3A%2116225009011%2Cn%3A502394&ref_=nav_em__nav_desktop_sa_intl_camera_and_photo_0_2_5_3");
        cameraAndPhotoPage().clickSamsungCheckBox();
        cameraAndPhotoPage().getSamsungCheckBox().shouldBe(Condition.selected);

    }

    @Test
    public void testSamsungInProductName(){
        open("https://amazon.com");
        mainPage().clickAllProductsButton();
        shopPage().goToElectronicsSection();
        shopPage().goToCameraAndPhotoPage();
        cameraAndPhotoPage().clickSamsungCheckBox();
        String expected = "SAMSUNG";
        Assert.assertTrue(cameraAndPhotoPage().getSamsungProductTitle().contains(expected));


    }

    @Test
    public void testGettingBookBasedOnModifiers() {
        open("https://amazon.com");
        mainPage().filter("Books");
        mainPage().searchFor("Java");
        shopPage().clickFourStarRating();
        shopPage().clickWindowsCheckBoxButton();
        String expected = "Effective Java";
        Assert.assertEquals(shopPage().getFirstBook(), expected);
    }




}