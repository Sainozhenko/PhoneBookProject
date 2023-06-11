package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        this.driver = new ChromeDriver();
        this.driver.get("https://demowebshop.tricentis.com/");
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testSearchElements(){
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElements(By.cssSelector(".span"));
        driver.findElement(By.cssSelector(".bar-notification"));
        driver.findElement(By.cssSelector(".close"));
        driver.findElements(By.cssSelector("[href='https://demowebshop.tricentis.com/Themes/DefaultClean/Content/images/logo.png']"));
        driver.findElements(By.cssSelector("img[alt='Tricentis Demo Web Shop']"));
        driver.findElements(By.cssSelector("h1[text='Home Component']"));
        driver.findElements(By.cssSelector("div[class='']"));
        driver.findElements(By.cssSelector("h1[text='']"));
        driver.findElements(By.cssSelector("h2[text='']"));



    }
    @Test
    public void testSearchElementsByXpath(){
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[span]"));
        driver.findElement(By.xpath("//*[@class='bar-notification']"));
        driver.findElement(By.xpath("//*[@class='close']"));
        driver.findElement(By.xpath("//img[@src='/Themes/DefaultClean/Content/images/logo.png']"));
        driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
        driver.findElements(By.xpath("//h1[text()='Home Component']"));
        driver.findElements(By.xpath("//div[class='']"));
        driver.findElements(By.xpath("//h1[text()='']"));
        driver.findElements(By.xpath("//h2[text()='']"));
    }

    public boolean results(){
   return  driver.findElements(By.xpath("//h2[not(text())='']")).size()>0;
    }
    @Test
    public void openResults(){
        System.out.println("Div components is: "+results());
    }
}
