package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!isElementPresent(By.xpath("//a[.='LOGIN']"))){
            click(By.xpath("//button[.='Sign Out']"));
        }    //click login link
//        driver.findElement(By.xpath("//a[.='LOGIN']")).click();
        click(By.xpath("//a[.='LOGIN']"));
    }

    @Test
    public void loginPositiveTest(){
        //enter email field
        //[placeholder='Email']
        type(By.cssSelector("[placeholder='Email']"), "ma121nnnnnn@gmail.com");


        //enter password field
        //[placeholder='Password']
        type(By.cssSelector("[placeholder='Password']"), "M12annn1234$");


        //click on Registration button
        //by.name - registration
//        driver.findElement(By.cssSelector(By.name())).click();
        click(By.name("login"));

        //assert user logged in
        Assert.assertTrue(isElementPresent1(By.xpath("//button[.='Sign Out']")));


    }
}
