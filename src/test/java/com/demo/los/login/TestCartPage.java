package com.demo.los.login;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

import static com.demo.pages.Pages.cartPage;


public class TestCartPage {

    @Test
    public void checkEmptyCart() {
        open("https://amazon.com");
        cartPage().goToCart();
        String expected = "Your Amazon Cart is empty";
        Assert.assertTrue(cartPage().getMainText().contains(expected));
    }
}
