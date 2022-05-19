package com.kitapyurdu.tests;


import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.pages.HomePage;
import com.kitapyurdu.pages.LoginPage;
import com.kitapyurdu.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();

        productPage.scrollAndSelect();
    }

    @Test
    public void getAttribute(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }

    @Test
    public void getTextTest(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginPage.login();
        productPage.textControlTest();
    }

    @Test
    public void valueTest(){
        ProductPage productPage = new ProductPage();

        productPage.valueControlTest();
    }


    @Test
    public void getDown(){
        ProductPage productPage = new ProductPage();

        productPage.getClass();
    }
}




