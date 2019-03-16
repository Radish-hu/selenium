package com.Radish.hu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class Demo {
    public void init() throws InterruptedException {
        String key = "webdriver.chrome.driver";
        String value = "C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe";
        System.setProperty(key, value);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("胡萝卜");
        driver.findElement(By.id("su")).click();
        String expect = "胡萝卜_百度搜索";
        Thread.sleep(3000);
        String actual = driver.getTitle();
        System.out.println(actual);
        Assert.assertEquals(actual, expect);
        driver.quit();
    }
}
