package ru.lanit.edu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YandexMainPage {



    @FindBy(id = "text")
    private WebElement input;

    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/form/div[2]/button")
    private WebElement button;


    public YandexMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String myQuestion){
        input.sendKeys(myQuestion);
        button.click();

    }

    public boolean isEndbled(){
        return input.isDisplayed();

    }
    //public void isEnabled(search){

    //}

}
