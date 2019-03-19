package ru.lanit.edu;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","E:\\ch_driver\\chromedriver.exe") ;

    WebDriver driver1 = new ChromeDriver();

    driver1.get("https:\\ya.ru") ;



    System.out.println("Hello World!");
    }
}
