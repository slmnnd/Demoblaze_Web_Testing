package formulatrix.pages;

import formulatrix.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {
    private WebDriver driver;

    public NavigationBar() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //home
    @FindBy(xpath = "//li[@class='nav-item active']//a[@class='nav-link']")
    private WebElement menuHome;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
    private WebElement txtHome;

    public void clickMenuHome(){
        menuHome.click();
    }
    public String setTxtHome(){
        return txtHome.getText();
    }

    //contact
    @FindBy(xpath = "//a[normalize-space()='Contact']")
    private WebElement menuContact;
    @FindBy(xpath = "//*[@id=\"recipient-email\"]")
    private WebElement inputContactEmail;
    @FindBy(xpath = "//*[@id=\"recipient-name\"]")
    private WebElement inputContactName;
    @FindBy(xpath = "//*[@id=\"message-text\"]")
    private WebElement inputMessage;
    @FindBy(xpath = "//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")
    private WebElement btnSendMessage;

    public void clickMenuContact(){
        menuContact.click();
    }
    public void setInputContactEmail(String contactEmail){
        inputContactEmail.sendKeys(contactEmail);
    }
    public void setInputContactName(String contactName){
        inputContactName.sendKeys(contactName);
    }
    public void setInputMessage(String message){
        inputMessage.sendKeys(message);
    }
    public void clickBtnSendMessage(){
        btnSendMessage.click();
    }

    //Cart
    @FindBy(xpath = "//a[@id='cartur']")
    private WebElement menuCart;
    @FindBy(xpath = "//button[normalize-space()='Place Order']")
    private WebElement btnPlaceOrder;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement inputName;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement inputCountry;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement inputCity;
    @FindBy(xpath = "//*[@id=\"card\"]")
    private WebElement inputCreditCard;
    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement inputMonth;
    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement inputYear;
    @FindBy(xpath = "//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    private WebElement btnPurchase;
    @FindBy(xpath = "/html/body/div[10]/h2")
    private WebElement txtOrderProduct;

    @FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
    private WebElement btnOKModal;
    @FindBy(xpath = "//a[normalize-space()='Sony vaio i5']")
    private WebElement sonyVaio;
    @FindBy(xpath = "//a[normalize-space()='ASUS Full HD']")
    private WebElement asusFull;

    public void clickMenuCart(){
        menuCart.click();
    }
    public void clickBtnPlaceOrder(){
        btnPlaceOrder.click();
    }
    public void setInputName(){
        inputName.sendKeys("aisha");
    }
    public void setInputCountry(){
        inputCountry.sendKeys("indonesia");
    }
    public void setInputCity(){
        inputCity.sendKeys("jakarta");
    }
    public void setInputCreditCard(){
        inputCreditCard.sendKeys("12345");
    }
    public void setInputMonth(){
        inputMonth.sendKeys("march");
    }
    public void setInputYear(){
        inputYear.sendKeys("2024");
    }
    public void clickBtnPurchase(){
        btnPurchase.click();
    }

    public String setTxtOrderProduct(){
        return txtOrderProduct.getText();
    }
    public void clickBtnOkModal(){
        btnOKModal.click();
    }
    public void clickSonyVaio(){
        sonyVaio.click();
    }
    public void clickAsusFull(){
        asusFull.click();
    }


    //logout
    @FindBy(xpath = "//a[@id='logout2']")
    private WebElement menuLogOut;
    @FindBy(xpath = "//a[@id='signin2']")
    private WebElement txtLogOut;

    public void clickMenuLogOut(){
        menuLogOut.click();
    }
    public String setTxtLogOut(){
        return txtLogOut.getText();
    }


}
