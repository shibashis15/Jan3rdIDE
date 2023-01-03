package com.application.tests;

import com.application.pages.DocumentationPage;
import com.application.pages.DownloadsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
    WebDriver driver;
    DownloadsPage downloads;
    DocumentationPage documents;
    @BeforeMethod
    public void setUp() throws InterruptedException {
        String root= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",root+"//src//test//resources//chromedriver.exe");
        driver= new ChromeDriver();
        downloads= new DownloadsPage(driver);
        documents= new DocumentationPage(driver);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.selenium.dev/");
    }
    @Test
    public void verifyDownloadsPage(){
        downloads.launchDownloads();
        downloads.verifyDownloadHeader();
    }
    @Test
    public void verifyDocumentationPage(){
        documents.launchDocumentation();
        documents.verifyDocumentationHeader();
    }
    public void tearDown(){
        driver.quit();
    }
}

