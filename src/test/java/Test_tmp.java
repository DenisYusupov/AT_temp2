import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.lanit.edu.YandexMainPage;



public class Test_tmp {

    private WebDriver driver ;
    private YandexMainPage page;

    public void Test_tmp(){
        //System.setProperty("webdriver.chrome.driver","E:\\ch_driver\\chromedriver.exe") ;
        //WebDriver driver = new ChromeDriver();

    }

    @Before
    public void setUP(){
        System.setProperty("webdriver.chrome.driver","E:\\ch_driver\\chromedriver.exe") ;
        driver = new ChromeDriver();
        page = new YandexMainPage(driver);

    }


    @Test
    public void smokeTest(){
        //System.setProperty("webdriver.chrome.driver","E:\\ch_driver\\chromedriver.exe") ;
        //WebDriver driver = new ChromeDriver();
        driver.get("https:\\ya.ru") ;

        //YandexMainPage Page = new YandexMainPage(driver);
        //YandexMainPage page = new YandexMainPage(driver);
        Assert.assertTrue(page.isEndbled());
        //Assert.assertNotNull(input);
        // WebElement inputBtn = driver1.findElement(By.id("Text")) ;
        //input.setKeys("sdfsdf");
        //input.sendKeys("asdasd");
        //input.sendKeys(Keys.ENTER);
        driver.quit();

    }

    @After
    public void tearDown(){
        driver.quit();

    }

    @Test

    //String Str_input

    public void firstTest( ) throws InterruptedException {

        String Str_input = "Ololo" ;
        System.setProperty("webdriver.chrome.driver","E:\\ch_driver\\chromedriver.exe") ;
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\ya.ru") ;
        WebElement input = driver.findElement(By.id("text")) ;
        // WebElement inputBtn = driver1.findElement(By.id("Text")) ;
        //input.setKeys("sdfsdf");
        //input.sendKeys("asdasd");
        //input.sendKeys(Keys.ENTER);
        YandexMainPage yandexMainPage = new YandexMainPage(driver);
        yandexMainPage.searchFor(Str_input);


        Thread.sleep(1000);

        Assert.assertTrue(driver.getCurrentUrl().contains(Str_input));



        }



    }

