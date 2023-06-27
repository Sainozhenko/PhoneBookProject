package com.phonebook.tests;


import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnSignOutButton();
        }
        app.getHeader().clickOnLoginLink();
    }

    @Test
    public void loginPositiveTest() {
        //enter email field
        app.getUser().fillLoginRegistrationForm(new User()
                .setEmail("ma121nnnnnn@gmail.com")
                .setPassword("M12annn1234$"));
        //click on Login button
        app.getUser().clickOnLoginButton();
        //assert user logged in(check Sign Out button displayed)
        Assert.assertTrue(app.getHeader().isSignOutButtonPresent());
    }

    @Test
    public void loginNegativeWithoutPasswordTest() {
        //enter email field
        app.getUser().fillLoginRegistrationForm(new User().setEmail("kan@gmai.com"));
        //click on Login button
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());
    }
}