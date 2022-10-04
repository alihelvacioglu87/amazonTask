package com.cydeo.AmazonTask;

import com.cydeo.pages.Amazon;
import com.cydeo.util.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.*;

public class AmazonTask {

    Amazon amazon;

    //1. Go to 'https://www.amazon.com.tr/'


    //4. Click iPhone13 at the top of the list
    //5. Log the following values for each size
    //.Size information .Price .Color .Stock status

    String searchText = "iPhone13 512";
    @BeforeMethod
    public void testSetup() {

        amazon = new Amazon();
        //1. Go to 'https://www.amazon.com.tr/'
        Driver.getDriver().get("https://www.amazon.com.tr/");

        Driver.getDriver().findElement(By.xpath("//input[@id='sp-cc-accept']")).click();

        //2. Search iPhone13 512

        amazon.searchBox.sendKeys(searchText + Keys.ENTER);

    }

    @AfterMethod
    public void tearDownTest(){

        Driver.closeDriver();
    }

    @Test
    public void test1() {

        //3. Check that the results are listed
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchText));


        //4. Click iPhone13 at the top of the list
        if (amazon.checkThis.getText().contains(" için sonuçlar gösteriliyor")) {
            amazon.otherFirstSearchResult.click();

        } else {
            amazon.firstSearchResult.click();
        }
        //5. Log the following values for each size
        //.Size information .Price .Color .Stock status
        amazon.firstSizeOption.click();

        System.out.println(amazon.modelName.getText() + "\tSize: " + amazon.size.getText());
        System.out.println("Color: " + amazon.color.getText() + "\tPrice: " + amazon.price.getAttribute("innerHTML"));
        System.out.println(amazon.stock.getText());

    }

    @Test
    public void test2() {

        //3. Check that the results are listed
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchText));


        //4. Click iPhone13 at the top of the list
        if (amazon.checkThis.getText().contains(" için sonuçlar gösteriliyor")) {
            amazon.otherFirstSearchResult.click();

        } else {
            amazon.firstSearchResult.click();
        }
        //5. Log the following values for each size
        //.Size information .Price .Color .Stock status
        amazon.secondSizeOption.click();

        System.out.println(amazon.modelName.getText() + "\tSize: " + amazon.size.getText());
        System.out.println("Color: " + amazon.color.getText() + "\tPrice: " + amazon.price.getAttribute("innerHTML"));
        System.out.println(amazon.stock.getText());

    }

    @Test
    public void test3() {

        //3. Check that the results are listed
        Assert.assertTrue(Driver.getDriver().getTitle().contains(searchText));


        //4. Click iPhone13 at the top of the list
        if (amazon.checkThis.getText().contains(" için sonuçlar gösteriliyor")) {
            amazon.otherFirstSearchResult.click();

        } else {
            amazon.firstSearchResult.click();
        }
        //5. Log the following values for each size
        //.Size information .Price .Color .Stock status
        amazon.thirdSizeOption.click();

        System.out.println(amazon.modelName.getText() + "\tSize: " + amazon.size.getText());
        System.out.println("Color: " + amazon.color.getText() + "\tPrice: " + amazon.price.getAttribute("innerHTML"));
        System.out.println(amazon.stock.getText());

    }
}
