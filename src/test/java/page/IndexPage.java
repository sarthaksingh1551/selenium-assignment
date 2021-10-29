package page;

import configuration.DriverConfig;
import map.IndexMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class IndexPage
{
    private IndexMap indexMap;

    public IndexPage(){
        indexMap = new IndexMap();
    }

    public void addToCartClick()
    {
        Actions actions = new Actions(DriverConfig.webDriver);
        WebDriverWait webDriverWait = new WebDriverWait(DriverConfig.webDriver, 10);

        WebElement dressDiv = DriverConfig.webDriver.findElement(indexMap.dressSelector());
        actions.moveToElement(dressDiv).build().perform();
        WebElement addDressToCartButton = DriverConfig.webDriver.findElement(indexMap.addDressToCartSelector());
        addDressToCartButton.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(indexMap.crossButtonSelector()));
        WebElement crossButtonClick = DriverConfig.webDriver.findElement(indexMap.crossButtonSelector());
        crossButtonClick.click();

        WebElement tShirtDiv = DriverConfig.webDriver.findElement(indexMap.tShirtSelector());
        actions.moveToElement(tShirtDiv).build().perform();
        WebElement addTShirtToCardButton = DriverConfig.webDriver.findElement(indexMap.addTShirtToCartButtonSelector());
        addTShirtToCardButton.click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(indexMap.proceedToCheckoutButtonSelector()));
        WebElement proceedToCheckout = DriverConfig.webDriver.findElement(indexMap.proceedToCheckoutButtonSelector());
        proceedToCheckout.click();
    }
}
