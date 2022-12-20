package com.nopcommerce.demo.cucumber.pages;

import com.nopcommerce.demo.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(xpath = "//div[@class='category-grid sub-category-grid']//h2/a")
    List<WebElement> subMenuLinks;


    public String getPageTitleText() {
        String message = getTextFromElement(pageTitle);

        Reporter.log("Get pageTitle text : " + pageTitle.getText() + "<br>");
        return message;
    }

    public void clickOnSubMenu(String subTab) {
        for (WebElement menu : subMenuLinks) {
            if (menu.getText().contains(subTab)) {

                Reporter.log("Click on '" + subTab + "' link <br>");
                clickOnElement(menu);
                break;
            }
        }
    }
}






//public class ComputerPage extends Utility {
//    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
//
//    public ComputerPage() {
//        PageFactory.initElements(ManageDriver.driver, this);
//    }
//
//    @CacheLookup
//    @FindBy(css = "div[class='page-title'] h1")
//    WebElement pageTitle;
//
//    @CacheLookup
//    @FindBy(xpath = "//div[@class='category-grid sub-category-grid']//h2/a")
//    List<WebElement> subMenuLinks;
//
//
//    public String getPageTitleText() {
//        String message = getTextFromElement(pageTitle);
//        log.info(" Get Page Title text :"+ pageTitle);
//        return message;
//    }
//
//    public void clickOnSubMenu(String subTab) {
//        for (WebElement menu : subMenuLinks) {
//            if (menu.getText().contains(subTab)) {
//                clickOnElement(menu);
//                log.info("Click on SubMenu :  "+ subMenuLinks);
//                break;
//            }
//        }
//    }
//
//}
