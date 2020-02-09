import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

private static final String MEDNAME_XPATH="//*[@id=\"root\"]/div[2]/div/div[8]/div/div[3]/div[1]/span";

    public String getmedtext(WebDriver driver) {
        WebElement getmed = driver.findElement(By.xpath(MEDNAME_XPATH));
        return getmed.getText();
    }


}
