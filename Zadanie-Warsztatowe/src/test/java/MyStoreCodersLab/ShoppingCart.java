package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

    private static WebDriver driver;
    @FindBy(xpath = "//div[@class='text-sm-center']//a")
    private WebElement proceedToCheckoutBtn;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckout() {
        proceedToCheckoutBtn.click();
    }
}
