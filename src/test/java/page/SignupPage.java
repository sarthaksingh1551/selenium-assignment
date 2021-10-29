package page;

import configuration.DriverConfig;
import map.SignupMap;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import signup.dataprovider.PersonalInformation;
import org.openqa.selenium.support.ui.Select;


public class SignupPage
{
    private SignupMap signupMap;

    public SignupPage(){
        signupMap = new SignupMap();
    }

    public void proceedToCheckout(){
        WebElement proceedToCheckout = DriverConfig.webDriver.findElement(signupMap.proceedToCheckoutSelector());
        proceedToCheckout.click();
    }

    public void emailInput(PersonalInformation personalInformation)
    {
        WebElement emailInput = DriverConfig.webDriver.findElement(signupMap.emailInputSelector());
        emailInput.sendKeys(personalInformation.getEmail());

        WebElement createAnAccount = DriverConfig.webDriver.findElement(signupMap.createAnAccountSelector());
        createAnAccount.click();
    }

    public void inputPersonalInformation(PersonalInformation personalInformation){
        WebDriverWait webDriverWait = new WebDriverWait(DriverConfig.webDriver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(signupMap.titleMarkSelector()));

        WebElement titleMark = DriverConfig.webDriver.findElement(signupMap.titleMarkSelector());
        titleMark.click();

        WebElement firstNameInput = DriverConfig.webDriver.findElement(signupMap.firstNameInputSelector());
        firstNameInput.sendKeys(personalInformation.getfName());

        WebElement lastNameInput = DriverConfig.webDriver.findElement(signupMap.lastNameInputSelector());
        lastNameInput.sendKeys(personalInformation.getlName());

        WebElement passwordInput = DriverConfig.webDriver.findElement(signupMap.passwordInputSelector());
        passwordInput.sendKeys(personalInformation.getPassword());

        Select dropDayInput = new Select(DriverConfig.webDriver.findElement(signupMap.dropDayInputSelector()));
        dropDayInput.selectByIndex(1);

        Select dropMonthInput = new Select(DriverConfig.webDriver.findElement(signupMap.dropMonthInputSelector()));
        dropMonthInput.selectByIndex(1);

        Select dropYearInput = new Select(DriverConfig.webDriver.findElement(signupMap.dropyearInputSelector()));
        dropYearInput.selectByIndex(1);

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(signupMap.addressInputSelector()));

        WebElement addressInput = DriverConfig.webDriver.findElement(signupMap.addressInputSelector());
        addressInput.sendKeys(personalInformation.getAddress());

        WebElement cityInput = DriverConfig.webDriver.findElement(signupMap.cityInputSelector());
        cityInput.sendKeys(personalInformation.getCity());

        Select dropStateInput = new Select(DriverConfig.webDriver.findElement(signupMap.dropStateInputSelector()));
        dropStateInput.selectByIndex(1);

        WebElement zipCodeInput = DriverConfig.webDriver.findElement(signupMap.zipCodeInputSelector());
        zipCodeInput.sendKeys(personalInformation.getZipCode().toString());

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(signupMap.mobileNumberInputSelector()));

        WebElement mobileNumberInput = DriverConfig.webDriver.findElement(signupMap.mobileNumberInputSelector());
        mobileNumberInput.sendKeys(personalInformation.getMobileNumber().toString());

        WebElement aliasInput = DriverConfig.webDriver.findElement(signupMap.aliasInputSelector());
        aliasInput.sendKeys(personalInformation.getAlias());

        WebElement registerClick = DriverConfig.webDriver.findElement(signupMap.registerButtonSelector());
        registerClick.click();
    }

    public void proceedToFinalShipping(){
        WebDriverWait webDriverWait = new WebDriverWait(DriverConfig.webDriver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(signupMap.proceedToSummaryButtonSelector()));

        WebElement proceedToSummary = DriverConfig.webDriver.findElement(signupMap.proceedToSummaryButtonSelector());
        proceedToSummary.click();

        WebElement termsOfServiceCheckbox = DriverConfig.webDriver.findElement(signupMap.termsOfServiceCheckboxSelector());
        termsOfServiceCheckbox.click();

        WebElement proceedToPaymentClick = DriverConfig.webDriver.findElement(signupMap.proceedToPaymentButtonSelector());
        proceedToPaymentClick.click();

        WebElement payByBankWireClick = DriverConfig.webDriver.findElement(signupMap.payByBankWireButtonSelector());
        payByBankWireClick.click();

        WebElement iConfirmMyOrderClick = DriverConfig.webDriver.findElement(signupMap.iConfirmMyOrderButtonSelector());
        iConfirmMyOrderClick.click();
    }
}
