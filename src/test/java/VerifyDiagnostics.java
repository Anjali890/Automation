import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyDiagnostics {

    @Test
    public  void TestDiagnostics(){
        System.setProperty("webdriver.chrome.driver","D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();
        HomePage home= new HomePage();
        home.clickdiagnostics(driver);

    }
}
