package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.elements;

public class ShopPage {


    SelenideElement electronicsLink = element(By.xpath("//a[@data-menu-id='5']"));
    SelenideElement cameraAndPhotoLink = element(By.xpath("//a[text()='Camera & Photo']"));
    SelenideElement fourStarRating = element(By.xpath("//li[@id='p_72/1250221011']//i[@class='a-icon a-icon-star-medium a-star-medium-4']"));
    SelenideElement windowsPlatformButton = element(By.xpath("//li[@id='p_n_feature_two_browse-bin/10806568011']"));
    SelenideElement firstBook = element(By.xpath("//div[@class='a-section a-spacing-medium']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']"));


    public void clickFourStarRating() {
        fourStarRating.click();
    }

    public void clickWindowsCheckBoxButton() {
        windowsPlatformButton.click();
    }


    public String getFirstBook() {
        String temp = firstBook.getText();
        return temp;
    }


    public void goToElectronicsSection() {
        electronicsLink.click();
    }

    public void goToCameraAndPhotoPage() {
        cameraAndPhotoLink.click();
    }

}