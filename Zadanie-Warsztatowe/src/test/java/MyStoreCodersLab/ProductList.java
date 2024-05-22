package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductList {

    private static WebDriver driver;

    @FindBy(xpath = "//article[@data-id-product='2']//li[@class='product-flag discount']")
    private WebElement hummingbirdDiscount;

    @FindBy(xpath = "//article[@data-id-product='2']//h2[@class='h3 product-title']//a")
    private WebElement hummingbirdProductTitle;

    public ProductList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHummingbirdDiscount(){
        return hummingbirdDiscount.getText();
    }

    public void clickHummingbirdTitle(){
        hummingbirdProductTitle.click();
    }
}