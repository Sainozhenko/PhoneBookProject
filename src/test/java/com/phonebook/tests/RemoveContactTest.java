package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {
    @BeforeMethod
    public void beforeCheckingRemovesContact(){
        app.getHeader().clickOnLoginLink();
        app.getUser().fillLoginRegistrationForm(new User().setEmail("kan@gmai.com").setPassword("Kan123$-_$"));
        app.getUser().clickOnLoginButton();
        checkRemoveContact();
    }

    @Test
    public void checkRemoveContact(){
        Assert.assertTrue(app.getContact().isContactListEmpty());
    }

}