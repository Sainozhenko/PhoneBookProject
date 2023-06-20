package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    public static void searchNewCreatedContact() {
        app.click(By.cssSelector("h3"));
    }

    public static void removeElement() {
        app.click(By.xpath("//button[text()='Remove']"));
    }

    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop();
    }

}
