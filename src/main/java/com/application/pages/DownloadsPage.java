package com.application.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadsPage {
    WebDriver webDriver;
    public DownloadsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

public void launchDownloads() {
        String expectedTitle = "Downloads | Selenium";
        webDriver.findElement(By.linkText("Downloads")).click();
        String actualTitle = webDriver.getTitle();
        Assert.assertEquals(actualTitle , expectedTitle , "No Match");
    }

    public void verifyDownloadHeader() {
        String exceptedHeader = "Downloads";
        String actualHeader = webDriver.findElement(By.xpath("//h1[contains(text(),'Downloads')]")).getText();
        Assert.assertEquals(actualHeader , exceptedHeader , "Not Matching");
    }
}
