import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchpharmacy {
    private static final String Searchpha_CSS="input[class='u-p-l--40 text-steel heading-elipson u-shape-wid--full']";
    private static final String clickMed_XPATH="//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div[2]/a[1]/div[2]/div[2]";
    private static final String MEDNAME_XPATH="//*[@id=\"root\"]/div[2]/container/div[2]/div[1]/div[1]/h1";
    private static final String ADDCART_XPATH="//*[@id=\"root\"]/div[2]/container/div[1]/div/div[2]/div[3]/div[4]";
    private static final String VIEWCART_XPATH="//*[@id=\"root\"]/div[2]/container/div[1]/div/div[2]/div[3]/div[4]";
    private static final String GETLOCATION_XPATH="//*[@id=\"root\"]/div[2]/div/div[8]/div/div[3]/div[1]/span";

    public void searchpharmacytab(WebDriver driver, String Medicinename) {
        WebElement pelement = driver.findElement(By.cssSelector(Searchpha_CSS));
        pelement.sendKeys(Medicinename);
    }

    public void clickMedicine(WebDriver driver ) {
        WebElement element = driver.findElement(By.xpath(clickMed_XPATH));
       element.click();
    }
    public String getmedtext(WebDriver driver){
        WebElement getmed=driver.findElement(By.xpath(MEDNAME_XPATH));
        return getmed.getText();

    }
    public void AddCart(WebDriver driver){
        WebElement elemen=driver.findElement(By.xpath(ADDCART_XPATH));
        elemen.click();
    }
    public void ViewCart(WebDriver driver){
        WebElement ele=driver.findElement(By.xpath(VIEWCART_XPATH));
        ele.click();

    }
    public void UseLoc(WebDriver driver)
    {
        WebElement el=driver.findElement(By.xpath( GETLOCATION_XPATH));
        el.click();
    }

}

