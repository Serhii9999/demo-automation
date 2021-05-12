package com.demo.pages;

import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class LanguagePage {

    SelenideElement languageButton =  element(By.xpath("//a[@id='icp-nav-flyout']"));
    SelenideElement espanolButton = element(By.xpath("//div[@class='a-column a-span7']/div[@class='a-row a-spacing-mini'][2]//span[@class='a-label a-radio-label']"));
    SelenideElement espanolRadioElement = element(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i"));
    SelenideElement translationTitle = element(By.xpath("//span[@id='icp-sl-t-title']"));
    public void goToLanguagePage ()  {
        languageButton.click();
    }

    public void changeLanguageToEspanol() {
        espanolButton.click();
    }

    public String getText() {
        String temp = translationTitle.getText();
        return temp;
    }

    public SelenideElement getEspanolRadioElement() {
        return espanolRadioElement;
    }

}
