import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class verifyPharmacy {


    @Test
    public void  TestPharmacy()
    {
        System.setProperty("webdriver.chrome.driver","D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();
        HomePage home=new HomePage();
        home.clickpharmacy(driver);
        searchpharmacy search=new searchpharmacy();
        search.searchpharmacytab(driver,"Dispo Van Syringe 2 ml");
        driver.navigate().refresh();
        search.searchpharmacytab(driver,"Dispo Van Syringe 2 ml");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);








    }
}
