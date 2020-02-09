import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {

    @Test
    public void testGoogle (){
        System.setProperty("webdriver.chrome.driver","D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();

    }


}
