package ru.lanit.edu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;


@FindBy(xpath = "//*[@role='search']")
public class SearchArr extends HtmlElement {

    @FindBy(id = "text")
    private WebElement input;

    @FindBy(xpath = ".//*[@role='button']")
    private WebElement button;

    public void searchFor(String myQuestion){
        input.sendKeys(myQuestion);
        button.click();
    }

    public boolean isEndbled() {
        return input.isDisplayed();
    }



}
