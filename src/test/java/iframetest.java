import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iframetest {
    public static final String Iframe_XPATH = "/html/body/a/img";


    @Test
    public void TestClick() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath(Iframe_XPATH)).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.quit();

    }
}