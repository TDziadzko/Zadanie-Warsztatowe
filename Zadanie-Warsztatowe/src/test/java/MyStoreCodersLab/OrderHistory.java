package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderHistory {

    private static WebDriver driver;

    @FindBy(xpath = "//td[@class='text-xs-right']")
    private List<WebElement> prices;

    @FindBy(xpath = "//td/span[@class='label label-pill bright']")
    private List<WebElement> orderStatuses;

    public OrderHistory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getLastOrderPrice(){
        return prices.get(0).getText();
    }

    public String getLastOrderStatus(){
        return orderStatuses.get(0).getText();
    }
}