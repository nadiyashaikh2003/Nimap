package automationlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Nimaplogin {
    WebDriver driver;

    @Test(priority=1)
    void openapp()
    {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testffc.nimapinfotech.com/");
        driver.manage().window().maximize();

    }
    @Test(priority=2)
    void testLogin()
    {
        driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("nadiyashaikh2003@gmail.com");
        driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sh@ikh2003");
        driver.findElement(By.xpath("//button[@id='kt_login_signin_submit']")).click();

    }
    @Test(priority=3)
    void addCustomer()
    {
        driver.findElement(By.xpath("//span[text()='My Customers']")).click();
        driver.findElement(By.xpath("//span[text( )=' New Customer ']")).click();
        driver.findElement(By.xpath("//input[@data-placeholder='Lead/Customer Name']")).sendKeys("volks");
        driver.findElement(By.xpath("//input[@data-placeholder='Contact Person Name']")).sendKeys("Farnandis");
        driver.findElement(By.xpath("//input[@data-placeholder='Mobile Number']")).sendKeys("8541236547");
        driver.findElement(By.xpath("//input[@data-placeholder='Email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//span[text( )=' Save ']")).click();
        driver.close();
    }
}
