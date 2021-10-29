package map;

import org.openqa.selenium.By;

public class IndexMap
{
    public By tShirtSelector(){
        return By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div");
    }

    public By addTShirtToCartButtonSelector(){
        return By.cssSelector("#homefeatured [data-id-product='1']");
    }

    public By proceedToCheckoutButtonSelector(){
        return By.cssSelector("[title='Proceed to checkout']");
    }

    public By dressSelector()
    {
        return By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div");
    }

    public By addDressToCartSelector()
    {
        return By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.last-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default");

    }

    public By crossButtonSelector()
    {
        return By.cssSelector("span[title='Close window']");
    }
}
