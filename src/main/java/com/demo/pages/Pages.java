package com.demo.pages;

import com.demo.core.allure.AllureLogger;

public class Pages extends AllureLogger {
    /**
     * Pages
     */
    private static LoginPage loginPage;
    private static NavigationPage navigationPage;
    private static MainPage mainPage;
    private static BookPage bookPage;
    private static LanguagePage languagePage;
    private static CartPage cartPage;
    private static ShopPage shopPage;
    private static CameraAndPhotoPage cameraAndPhotoPage;

    /**
     * This function return an instance of `LoginPage`
     */
    public static LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    /**
     * This function return an instance of `NavigationPage`
     */
    public static NavigationPage navigationPage() {
        if (navigationPage == null) {
            navigationPage = new NavigationPage();
        }
        return navigationPage;
    }

    public static MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public static BookPage bookPage() {
        if (bookPage == null) {
            bookPage = new BookPage();
        }
        return bookPage;
    }


    public static LanguagePage languagePage() {
        if (languagePage == null) {
            languagePage = new LanguagePage();
        }
        return languagePage;
    }

    public static CartPage cartPage() {
        if (cartPage == null) {
            cartPage = new CartPage();
        }
        return cartPage;
    }

    public static ShopPage shopPage() {
        if (shopPage == null) {
            shopPage = new ShopPage();
        }
        return shopPage;
    }

    public static CameraAndPhotoPage cameraAndPhotoPage() {
        if (cameraAndPhotoPage == null) {
            cameraAndPhotoPage = new CameraAndPhotoPage();
        }
        return cameraAndPhotoPage;
    }







}