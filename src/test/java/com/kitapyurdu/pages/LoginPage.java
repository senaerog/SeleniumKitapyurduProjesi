package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {

    Methods methods;
    public LoginPage(){

        methods = new Methods();
    }

    public void login(){
        methods.click(By.cssSelector("div.menu-top-button-login"));
        methods.waitBySeconds(5);

        methods.sendKeys(By.xpath("//*[@id='login-email']"),"senaagca94@gmail.com"); //(By.cssSelector(“input #login-email”))
        methods.waitBySeconds(5);

        methods.sendKeys(By.id("login-password"),"S5a29d348");
        methods.waitBySeconds(5);

        methods.click(By.xpath("//*[@id='login']/div[5]/button"));
        methods.waitBySeconds(5);


    }
}

