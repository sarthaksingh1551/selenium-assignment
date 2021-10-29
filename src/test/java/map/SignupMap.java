package map;

import org.openqa.selenium.By;

public class SignupMap
{
    public By proceedToCheckoutSelector(){
        return By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    }

    public By createAnAccountSelector(){
        return By.cssSelector("#SubmitCreate");
    }

    public By emailInputSelector() {
        return By.cssSelector("#email_create");
    }

    public By titleMarkSelector(){
        return By.cssSelector("#uniform-id_gender1");
    }

    public By firstNameInputSelector(){
        return By.cssSelector("#customer_firstname");
    }

    public By lastNameInputSelector(){
        return By.cssSelector("#customer_lastname");
    }

    public By passwordInputSelector(){
        return By.cssSelector("#passwd");
    }

    public By addressInputSelector(){
        return By.cssSelector("#address1");
    }

    public By cityInputSelector(){
        return By.cssSelector("#city");
    }

    public By zipCodeInputSelector(){
        return By.cssSelector("#postcode");
    }

    public By mobileNumberInputSelector(){
        return By.cssSelector("#phone_mobile");
    }

    public By aliasInputSelector(){
        return By.cssSelector("#alias");
    }

    public By dropDayInputSelector(){
        return By.cssSelector("#days");
    }

    public By dropMonthInputSelector(){
        return By.cssSelector("#months");
    }

    public By dropyearInputSelector(){
        return By.cssSelector("#years");
    }

    public By dropStateInputSelector(){
        return By.cssSelector("#id_state");
    }

    public By registerButtonSelector(){
        return By.cssSelector("#submitAccount");
    }

    public By proceedToSummaryButtonSelector(){
        return By.cssSelector("#center_column > form > p > button");
    }

    public By termsOfServiceCheckboxSelector(){
        return By.cssSelector("#cgv");
    }

    public By proceedToPaymentButtonSelector(){
        return By.cssSelector("#form > p > button");
    }

    public By payByBankWireButtonSelector(){
        return By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    }

    public By iConfirmMyOrderButtonSelector(){
        return By.cssSelector("#cart_navigation > button");
    }
}
