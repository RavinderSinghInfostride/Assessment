package Marks_and_Spencer.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By signInLink = By.xpath("(//a/i)[1]");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void signInLinkClick()
    {
        driver.findElement(signInLink).click();
    }
}
