package com.kitapyurdu.pages;


import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.xpath("//*[@id='search-input']"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.click(By.cssSelector(".pr-img-link"));

        methods.scrollWithAction(By.cssSelector("#review-reply-button"));
        methods.waitBySeconds(3);

        methods.selectByText(By.cssSelector("location = this.value;"),"Oylama = Yüksek)");
        methods.waitBySeconds(5);




        methods.scrollWithAction(By.cssSelector(".product-cr>.grid_2>.hover-menu>.add-to-favorites"));


    }
    public void getDown(){
        methods.scrollWithAction(By.cssSelector(".product-cr"));
        methods.waitBySeconds(5);
    }
    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text: " + attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(3);

    }
        public void addToList() {
            methods.scrollWithAction(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/a"));
            methods.click(By.xpath("(//ai[@class='fa fa-heart'])[6]"));



        }

    public void addToFavourites() {
        methods.scrollWithAction(By.xpath("//*[@id='header-top']/div/div[2]/ul/li[1]/div/ul/li/a"));


    }


    public void textControlTest() {
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text: " + text);
        logger.info("Alınan text: " + text);
        methods.waitBySeconds(3);
    }

    public void valueControlTest () {
        methods.sendKeys(By.id("search-input"), "testinium");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text: " + value);
        logger.info("Alınan text: " + value);
        Assert.assertEquals("testinium", value);
        methods.waitBySeconds(5);
    }

}

