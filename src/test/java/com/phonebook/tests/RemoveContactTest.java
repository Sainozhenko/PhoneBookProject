package com.phonebook.tests;

import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase {
    @BeforeMethod
    public void beforeCheckingRemovesContact(){
        app.getHeader().clickOnLoginLink();
        app.getUser().fillLoginRegistrationForm(new User().setEmail("ma121nnnnnn@gmail.com").setPassword("M12annn1234$"));
        app.getUser().clickOnLoginButton();
        app.getHeader().clickOnAddLink();
                app.getContact().fillAddContactForm(new Contact()
                .setName("Marc")
                .setLastname("Eddinberg")
                .setPhone("12345678910")
                .setEmail("eddinberg@gmail.com")
                .setAddress("Koblenz")
                .setDesc("goalkeeper"));
        app.getContact().clickOnSaveButton();
    }

    @Test
    public void checkRemoveContact(){
        int sizeBefore = app.getContact().sizeOfContacts();

        app.getContact().removeContact();
       app.getContact().pause(1000);
//        Assert.assertTrue(app.getContact().isContactListEmpty());

        int sizeAfter = app.getContact().sizeOfContacts();

        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }

}