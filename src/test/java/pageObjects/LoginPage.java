package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage enterUserName(String username) {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        return this;
    }

    public LoginPage clickButtonLogin() {
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        return this;
    }
}
