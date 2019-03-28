package ru.lanit.edu;


import org.openqa.selenium.WebDriver;



public class YandexMainPage extends AdstractPage  {
/*
    @FindBy(id = "text")
    private WebElement input;
    @FindBy(xpath = "/html/body/table/tbody/tr[2]/td/form/div[2]/button")
    private WebElement button;
*/
    // public for block
    public SearchArr SearchArr;


    public YandexMainPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultsPage searchFor(String myQuestion){


        SearchArr.searchFor(myQuestion);
        return new SearchResultsPage(driver);
    }

}






    //public void isEnabled(search){

    //}


