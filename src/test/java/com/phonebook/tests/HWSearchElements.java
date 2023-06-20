package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HWSearchElements extends TestBase{
    @Test
    public void searchHeader(){
        Assert.assertTrue(app.isLogoPresent());
    }

    @Test
    public void searchHome(){
        Assert.assertTrue(app.isHomeLinkPresent());
    }

    @Test
    public void searchAbout(){
        Assert.assertTrue(app.isAboutLinkPresent());
    }

    @Test
    public void searchLogin(){
        Assert.assertTrue(app.isLoginLinkPresent());
    }
}
