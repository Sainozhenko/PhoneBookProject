package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        this.driver = new ChromeDriver();
        this.driver.get("https://telranedu.web.app");
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void openHomePageTest(){
        System.out.println("Home component is " + isHomeComponentPresent());
}

public boolean isHomeComponentPresent(){
        return  driver.findElements(By.xpath("//h1[text()='Home Component']")).size()>0;

}
}
