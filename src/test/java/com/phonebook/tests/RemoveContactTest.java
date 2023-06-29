package com.phonebook.tests;

import com.phonebook.model.Contact;
import com.phonebook.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class RemoveContactTest extends TestBase {
//    @BeforeMethod
//    public void beforeCheckingRemovesContact(){
//        app.getHeader().clickOnLoginLink();
//        app.getUser().fillLoginRegistrationForm(new User().setEmail("ma121nnnnnn@gmail.com").setPassword("M12annn1234$"));
//        app.getUser().clickOnLoginButton();
//        app.getHeader().clickOnAddLink();
//                app.getContact().fillAddContactForm(new Contact()
//                .setName("Marc")
//                .setLastname("Eddinberg")
//                .setPhone("12345678910")
//                .setEmail("eddinberg@gmail.com")
//                .setAddress("Koblenz")
//                .setDesc("goalkeeper"));
//        app.getContact().clickOnSaveButton();
//    }
//
//    @Test
//    public void checkRemoveContact(){
//        int sizeBefore = app.getContact().sizeOfContacts();
//
//        app.getContact().removeContact();
//       app.getContact().pause(1000);
////        Assert.assertTrue(app.getContact().isContactListEmpty());
//
//        int sizeAfter = app.getContact().sizeOfContacts();
//
//        Assert.assertEquals(sizeAfter,sizeBefore-1);
//    }
//
    WebDriver driver;
@BeforeMethod
public void ensurePrecondition() {
    if (!app.getHeader().isLoginLinkPresent()) {
        app.getHeader().clickOnSignOutButton();
    }
    app.getHeader().clickOnLoginLink();
    app.getUser().fillLoginRegistrationForm(new User()
            .setEmail("ma121nnnnnn@gmail.com")
            .setPassword("M12annn1234$"));
    app.getUser().clickOnLoginButton();
    app.getHeader().clickOnAddLink();
    app.getHeader().clickOnAddLink();
    app.getContact().fillAddContactForm(new Contact()
                .setName("Marc")
                .setLastname("Eddinberg")
                .setPhone("12345678910")
                .setEmail("eddinberg@gmail.com")
                .setAddress("Koblenz")
                .setDesc("goalkeeper"));
        app.getContact().clickOnSaveButton();
   
    Assert.assertTrue(app.getContact().isContactCreated("Marc"));
}
    @Test
    public void removeContactPositiveTest() {
        int sizeBefore = app.getContact().sizeOfContacts();
        System.out.println(sizeBefore);
        app.getContact().removeContact();
        app.getContact().pause(1000);
        int sizeAfter = app.getContact().sizeOfContacts();
        System.out.println(sizeAfter);
        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }
}

