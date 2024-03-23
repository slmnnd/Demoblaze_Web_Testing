package formulatrix.pages;

import formulatrix.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductList {
    private WebDriver driver;

    public ProductList() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Samsung galaxy s6']")
    private WebElement samsungS6;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/h2")
    private WebElement txtDetailProduct;
    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    private WebElement btnAddToCart;
    @FindBy(xpath = "//div[@id='contcont']//a[2]")
    private WebElement categoryOfPhones;
    @FindBy(xpath = "//a[normalize-space()='Nokia lumia 1520']")
    private WebElement txtPhones;
    @FindBy(xpath = "//a[normalize-space()='Sony vaio i5']")
    private WebElement txtLaptops;
    @FindBy(xpath = "//a[3]")
    private WebElement categoryOfLaptops;
    @FindBy(xpath = "//a[4]")
    private WebElement categoryOfMonitors;
    @FindBy(xpath = "//a[normalize-space()='Apple monitor 24']")
    private WebElement txtMonitors;

    public void clickSamsungS6(){
        samsungS6.click();
    }
    public String setTxtDetailProduct(){
        return txtDetailProduct.getText();
    }
    public void clickBtnAddToCart(){
        btnAddToCart.click();
    }
    public void clickCategoryOfPhones(){
        categoryOfPhones.click();
    }
    public String setTxtPhones(){
        return txtPhones.getText();
    }
    public void clickCategoryOfLaptops(){
        categoryOfLaptops.click();
    }
    public String setTxtLaptops(){
        return txtLaptops.getText();
    }
    public void clickCategoryOfMonitors(){
        categoryOfMonitors.click();
    }
    public String setTxtMonitors(){
        return txtMonitors.getText();
    }
}
