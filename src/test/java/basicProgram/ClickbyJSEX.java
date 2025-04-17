package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class ClickbyJSEX {


    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadiobtn = driver.findElement(By.id("yesradio"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].click();", yesRadiobtn);
        System.out.println("Click on yes Radio button");

    }
}