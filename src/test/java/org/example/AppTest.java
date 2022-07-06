package org.example;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import resources.BasePage;
import org.junit.Test;

public class AppTest extends BasePage
{
    public WebDriver driver;
    @Test
    public void OpenUrl()
    {
       driver= launchBrowser();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
    }
    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
