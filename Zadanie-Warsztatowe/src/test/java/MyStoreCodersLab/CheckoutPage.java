package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    private static WebDriver driver;

    @FindBy(name = "confirm-addresses")
    private WebElement confirmAddressBtn;

    @FindBy(id = "delivery_option_1")
    private WebElement prestaShopDeliveryRadio;

    @FindBy(name = "confirmDeliveryOption")
    private WebElement confirmDeliveryBtn;

    @FindBy(id = "payment-option-1")
    private WebElement payByCheckRadio;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsOfServiceCheckbox;

    @FindBy(xpath = "//div[@id='payment-confirmation']//button")
    private WebElement placeOrderBtn;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void confirmAddress() {
        confirmAddressBtn.click();
    }

    public void chooseDeliveryMethod(){


        if(!prestaShopDeliveryRadio.isSelected()) {
            prestaShopDeliveryRadio.click();
        }
        confirmDeliveryBtn.click();
    }

    public void choosePaymentMethod() {
        payByCheckRadio.click();
    }

    public void agreeTermsOfService() {
        termsOfServiceCheckbox.click();
    }

    public void placeOrder(){
        placeOrderBtn.click();
    }

}