package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class CartPage {

    SelenideElement cartButton = element(By.xpath("//a[@id='nav-cart']"));
    SelenideElement cartMainText = element(By.xpath("//div[@id='sc-active-cart']//h2"));

    public void goToCart() {
        cartButton.click();
    }

    public String getMainText() {
        String temp = cartMainText.getText();
        return temp;
    }
}
