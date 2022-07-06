package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.BasePage;

public class App extends BasePage
{
    public WebDriver driver;

    public App(WebDriver driver){
        this.driver=driver;
    }

    private By rosh =  By.name("Rosh");

    public void rosh(){
        driver.findElement(rosh);
    }

}
