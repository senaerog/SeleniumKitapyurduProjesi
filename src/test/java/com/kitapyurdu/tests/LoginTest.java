package com.kitapyurdu.tests;


import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.pages.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }
}
