package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.isLoginLinkPresent()){
            app.click(By.xpath("//button[.='Sign Out']"));
        }  
        app.clickOnLoginLink();
        app.fillLoginRegistrationForm(new User().setEmail("ma121nnnnnn@gmail.com").setPassword( "M12annn1234$"));
        app.clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest(){
        //click on the ADD link
        app.clickOnAddLink();
//        int i = (int) (System.currentTimeMillis() / 1000) % 3600;
        //fill in the add contact form
        app.fillAddContactForm("Abdul", "Musaev", "01768786612", "abdulmusaev98@gmail.com", "Kazachstan", "grill-man");
        //click on the Save button
        app.clickOnSaveButton();
        //assert the contact is added
        Assert.assertTrue(app.isContactCreated("Abdul"));
    }
    @AfterMethod
    public void removeContact(){
        searchNewCreatedContact();
        removeElement();
    }

}
