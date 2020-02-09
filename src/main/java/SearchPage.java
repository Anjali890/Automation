import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private static final String searchbox_XPAth ="//*[@id='c-omni-container']/div/div[2]/div[1]/input";
    private static final String dr_XPATH="//*[@id=\"c-omni-container\"]/div/div[2]/div[2]/div[1]/div[2]/span/div[1]";

    public void enterSearchBox(WebDriver driver, String DoctorName){
        WebElement element=driver.findElement(By.xpath( searchbox_XPAth));
        element.sendKeys(DoctorName);
    }

    public void clickdrname(WebDriver driver)
    {
        WebElement element=driver.findElement(By.xpath(dr_XPATH));
        element.click();
    }

}

