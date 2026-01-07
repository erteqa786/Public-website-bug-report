import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window();
        driver.get("https://sweetshop.vivrichards.co.uk/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleInputEmail"))).sendKeys("test@example.com");
        driver.findElement(By.id("exampleInputPassword")).sendKeys("password123");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        boolean loginLinkVisible = driver.findElement(By.xpath("//a[@href='/login' and text()='Login']")).isDisplayed();
        System.out.println("Is login bug present? " + loginLinkVisible);
        driver.quit();
    }
}


