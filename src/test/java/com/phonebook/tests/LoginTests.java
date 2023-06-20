package com.phonebook.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.isLoginLinkPresent()){
            app.clickOnSignOutButton();
        }
        app.clickOnLoginLink();
    }

    @Test
    public void loginPositiveTest(){
        app.fillLoginRegistrationForm(new User()
                .setEmail("ma121nnnnnn@gmail.com")
                .setPassword( "M12annn1234$"));

        app.clickOnLoginButton();
        Assert.assertTrue(app.isSignOutButtonPresent());
    }
    @Test
    public void loginNegativeWithoutPasswordTest(){
        app.fillLoginRegistrationForm(new User().setEmail("ma121nnnnnn@gmail.com"));
        app.clickOnLoginButton();
        Assert.assertTrue(app.isAlertPresent());
    }
}