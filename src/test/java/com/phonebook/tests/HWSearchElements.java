package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HWSearchElements extends TestBase{
    @Test
    public void searchHeader(){
        Assert.assertTrue(isElementPresent1(By.xpath("//h1")));
    }

    @Test
    public void searchHome(){
        Assert.assertTrue(isElementPresent1(By.xpath("//a[@href='/home']")));
    }

    @Test
    public void searchAbout(){
        Assert.assertTrue(isElementPresent1(By.xpath("//a[@href='/about']")));
    }
    @Test
    public void searchLogin(){
        Assert.assertTrue(isElementPresent1(By.xpath("//a[@href='/login']")));
    }
}
