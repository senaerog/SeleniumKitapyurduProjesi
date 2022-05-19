package com.kitapyurdu.tests;


import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.pages.HomePage;
import org.junit.Test;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage= new HomePage();

        homePage.home();
    }

}
