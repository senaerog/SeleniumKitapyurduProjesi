package com.kitapyurdu.tests;


import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.pages.LogoutPage;
import org.junit.Test;

public class LogoutTest  extends BaseTest {

    @Test
    public void LogOutTest(){
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.logout();




    }


}
