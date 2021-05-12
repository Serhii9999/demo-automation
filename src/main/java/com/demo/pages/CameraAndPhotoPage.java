package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.elements;

public class CameraAndPhotoPage {



    SelenideElement samsungBrand = element(By.xpath("//span[text()='Samsung Electronics']"));
    SelenideElement samsungCheckBox = element(By.xpath("//li[@id='p_89/Samsung Electronics']//input"));
    SelenideElement samsungBrandTitle = element(By.xpath("//div[@class='s-expand-height s-include-content-margin s-border-bottom s-latency-cf-section']//span[@class='a-size-base-plus a-color-base a-text-normal']"));

    public void clickSamsungCheckBox() {
        samsungBrand.click();
    }

    public SelenideElement getSamsungCheckBox() {
        return samsungCheckBox;
    }

    public String getSamsungProductTitle() {
        String temp = samsungBrandTitle.getText();
        return temp;
    }


}
