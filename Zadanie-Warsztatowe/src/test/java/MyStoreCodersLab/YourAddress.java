package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YourAddress {

    private static WebDriver driver;


    @FindBy(xpath = "//div[@class='address-body']")
    private List<WebElement> addresses;

    @FindBy(xpath = "//a[@data-link-action='delete-address']")
    private List<WebElement> deleteButtons;


    @FindBy(xpath = "//div[@class='addresses-footer']//a")
    private WebElement createNewAddressButton;

    public YourAddress(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCreateNewAddressButton() {
        createNewAddressButton.click();
    }


    public boolean isAddressVisible() {
        return addresses.size() == 2;
    }


    public String getSavedAddress() {
        return addresses.get(1).getText();
    }

    public void deleteAddress() {
        deleteButtons.get(1).click();
    }


    public boolean isAddressRemoved() {
        return addresses.size() == 1;
    }


}