package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;


public class LogoutPage {

    Methods methods;
    public LogoutPage(){
        methods= new Methods();

    }

    public void logout(){
        methods.click(By.partialLinkText("Çıkış"));
        methods.waitBySeconds(5);
    }

}
