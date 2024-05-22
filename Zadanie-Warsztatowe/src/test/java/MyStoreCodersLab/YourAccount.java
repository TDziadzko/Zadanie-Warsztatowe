package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccount {

    private static WebDriver driver;

    @FindBy(id = "addresses-link")
    private WebElement addressesIcon;

    @FindBy(id = "history-link")
    private WebElement orderHistoryIcon;

    @FindBy(xpath = "//li[@id='category-3']//a")
    private WebElement clothesCategoryLink;

    public YourAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAdressesIcon() {
        addressesIcon.click();
    }

    public void clickOrderHistoryIcon() { orderHistoryIcon.click();}

    public void goToClothesPDP() {
        clothesCategoryLink.click();
    }


}
