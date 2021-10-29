package test;

import configuration.DriverConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.IndexPage;
import page.SignupPage;
import signup.dataprovider.PersonalInformation;
import signup.dataprovider.SignupDataProvider;


public class LoginWithValidCredentials
{
    public String baseURL;
    public WebDriver webDriver = new DriverConfig().webDriver;
    public IndexPage indexPage;
    public SignupPage signupPage;

    @BeforeMethod
    public void setup() {
        baseURL = "http://automationpractice.com/index.php";
        webDriver.get(baseURL);
        indexPage = new IndexPage();
        signupPage = new SignupPage();
    }

//    @Test()
//    public void testAddToCart()
//    {
//        indexPage.addToCartClick();
//    }

    @Test(dataProvider = "data-provider", dataProviderClass = SignupDataProvider.class)
    public void testCheckoutProcess(PersonalInformation personalInformation)
    {
        indexPage.addToCartClick();
        signupPage.proceedToCheckout();
        signupPage.emailInput(personalInformation);
        signupPage.inputPersonalInformation(personalInformation);
        signupPage.proceedToFinalShipping();
    }
}
