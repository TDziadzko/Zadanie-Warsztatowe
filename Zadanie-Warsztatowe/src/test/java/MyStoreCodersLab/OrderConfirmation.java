package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation {

    private static WebDriver driver;

    @FindBy(xpath = "//div/h3[@class='h1 card-title']")
    private WebElement orderConfirmationMessage;

    @FindBy(xpath = "//tr[@class='total-value font-weight-bold']/td[2]")
    private WebElement orderTotal;

    @FindBy(xpath = "//a[@title='View my customer account']")
    private WebElement myAccountBtn;

    public OrderConfirmation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getOrderConfirmationMessage(){
        return orderConfirmationMessage.getText();
    }

    public String getOrderTotal() { return orderTotal.getText();}

    public void goToMyAccount(){
        myAccountBtn.click();
    }
}