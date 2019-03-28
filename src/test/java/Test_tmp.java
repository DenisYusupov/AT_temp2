import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.lanit.edu.SearchArr;
import ru.lanit.edu.YandexMainPage;



public class Test_tmp {

    //private WebDriver driver ;
    protected WebDriver driver ;
    private YandexMainPage page;
    private YandexMainPage p2;
    //private YandexMainPage SearchResultsPage;


    @Before
    public void setUP(){
        System.setProperty("webdriver.chrome.driver","E:\\ch_driver\\chromedriver.exe") ;
        driver = new ChromeDriver();
        page = new YandexMainPage(driver);

    }


    @Test
    public void smokeTest(){
        driver.get("https:\\ya.ru") ;   //https://yandex.ru/
        Assert.assertTrue(page.SearchArr.isEndbled());
    }


    @Test
    public void firstTest( ) throws InterruptedException {

        String strInput = "Ololo" ;
        driver.get("https:\\ya.ru") ;
        // Thread.sleep(1000);
        //page.SearchArr.searchFor(strInput);

        //Thread.sleep(1000);
        //Assert.assertTrue(driver.getCurrentUrl().contains(strInput));

        //driver.get("https:\\ya.ru") ;

        new YandexMainPage(driver)
                .searchFor("asfas")
                .iCanGoHome();


    }


    @After
    public void tearDown(){
        driver.quit();

    }







    }

