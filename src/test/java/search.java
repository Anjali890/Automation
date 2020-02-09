import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class search {

    @Test
    public void testsearchfunctionality(){
        System.setProperty("webdriver.chrome.driver", "D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();
        HomePage home=new HomePage();
        home.clickdoctors(driver);
        SearchPage searchPage = new SearchPage();
        searchPage.enterSearchBox(driver,"Swati Kedia");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        searchPage.clickdrname(driver);
        String actual = home.getDrName_CSS(driver);
        Assert.assertEquals(actual,"Dr. Swati Kedia");

    }

}
