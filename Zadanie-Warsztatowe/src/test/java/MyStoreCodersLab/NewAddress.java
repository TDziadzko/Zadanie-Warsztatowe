package MyStoreCodersLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAddress {

    private static WebDriver driver;

    private String enteredAddress;

    @FindBy(id="field-firstname")
    private WebElement firstName;

    @FindBy(id="field-lastname")
    private WebElement lastName;

    @FindBy(id="field-alias")
    private WebElement aliasInput;

    @FindBy(id="field-address1")
    private WebElement addressInput;

    @FindBy(id="field-city")
    private WebElement cityInput;

    @FindBy(id="field-postcode")
    private WebElement postalCodeInput;

    @FindBy(id="field-phone")
    private WebElement phoneInput;

    @FindBy(id="field-id_country")
    private WebElement countrySelect;

    @FindBy(xpath = "//footer[@class='form-footer clearfix']/button")
    private WebElement formSubmitButton;




    public NewAddress(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillOutTheAddressForm(String alias, String address, String city,
                                      String postalcode, String country, String phone) {

        aliasInput.clear();
        aliasInput.sendKeys(alias);

        addressInput.clear();
        addressInput.sendKeys(address);

        cityInput.clear();
        cityInput.sendKeys(city);

        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalcode);

        // Using Selenium Select class to pick the element from dropdown by its text(Country name in this case)
        Select dropdown = new Select(countrySelect);
        dropdown.selectByVisibleText(country);

        phoneInput.clear();
        phoneInput.sendKeys(phone);

        // Placing the formatted address into the variable to compare it with the data in Your Addresses page
        this.enteredAddress = alias + "\n" + firstName.getAttribute("value") + " "
                + lastName.getAttribute("value")
                + "\n" + address + "\n" + city + "\n" + postalcode
                + "\n" + country + "\n" + phone;
    }

    public void saveAddress() {
        formSubmitButton.click();
    }

    public String getEnteredAddress() {
        return this.enteredAddress;
    }
}
