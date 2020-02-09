import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin {

    @Test
    public void testLogin()throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();
        HomePage page=new HomePage();
        LoginPage loginPage = new LoginPage();
        page.clickSignupBtn(driver);
        Thread.sleep(2000);
        loginPage.enterUsername(driver, "7206463133");
        loginPage.enterPassword(driver,"divisha@123");
        loginPage.clickLoginBtn(driver);
        String actualName = page.getProfileName(driver);
        Assert.assertEquals(actualName, "Divvjhgjhisha");


    }
}
