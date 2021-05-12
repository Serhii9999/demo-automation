package com.demo.los.login;

import com.demo.core.base.BaseTest;
import com.demo.entity.Book;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;
import static com.demo.pages.Pages.bookPage;

public class TestBook extends BaseTest {


    @Test
    public void checkBook() {
        open("https://www.amazon.com/s?k=Java&i=stripbooks-intl-ship&ref=nb_sb_noss");
        bookPage().convertData();
        List<Book> temp =bookPage().addBooks();
        String actual = String.valueOf(temp.get(0));
        String expectedTitle = "Effective Java";
        String expectedAuthor = "Joshua Bloch";
        String expectedBestseller = "true";

        Assert.assertTrue(actual.contains(expectedTitle));
        Assert.assertTrue(actual.contains(expectedAuthor));
        Assert.assertTrue(actual.contains(expectedBestseller));

    }






}
