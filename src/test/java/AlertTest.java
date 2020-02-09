import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {
    private static final  String CUSTOMER_CSS="input[name='cusid']";
    private static final  String SUBMIT_CSS="input[name='submit']";

    @Test
    public  void  TestClick(){
        System.setProperty("webdriver.chrome.driver","D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(CUSTOMER_CSS)).sendKeys("123");
        driver.findElement(By.cssSelector(SUBMIT_CSS)).click();
        Alert alert =driver.switchTo().alert();
        String actual = alert.getText();
        Assert.assertEquals(actual, "Do you really want to delete this Customer?");
        alert.accept();

    }



}
