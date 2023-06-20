package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {
            app.clickOnSignOutButton();

        }
        app.clickOnSignOutButton();
    }


    @Test
    public void existedUserRegistrationNegativeTest(){
        app.fillLoginRegistrationForm(new User().setEmail("ma121nnnnnn@gmail.com").setPassword("M12annn1234$"));
        app.clickOnRegistrationButton();
        Assert.assertTrue(app.isAlertPresent());
    }

}