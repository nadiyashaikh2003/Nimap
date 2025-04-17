package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSendkeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.xpath("//div[text()='Cierra']/following-sibling::div//span[@title='Edit']")).click();
        WebElement firstname=driver.findElement(By.id("firstName"));
        firstname.click();
        firstname.clear();
        Thread.sleep(2000);
        firstname.sendKeys(Keys.chord(Keys.CONTROL));
        Thread.sleep(2000);
        firstname.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        firstname.sendKeys("Akshay");
    }
}