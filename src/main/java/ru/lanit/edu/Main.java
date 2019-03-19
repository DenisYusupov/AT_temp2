package ru.lanit.edu;


import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","E:\\ch_driver\\chromedriver.exe") ;

    WebDriver driver = new ChromeDriver();

    driver.get("https:\\ya.ru") ;
    WebElement input = driver.findElement(By.id("text")) ;

   // WebElement inputBtn = driver1.findElement(By.id("Text")) ;

    //input.setKeys("sdfsdf");
    input.sendKeys("asdasd");
    input.sendKeys(Keys.ENTER);





    System.out.println("Hello World!");
    }
}
