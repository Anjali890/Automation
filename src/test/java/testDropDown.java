import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testDropDown {

    private static String dropdown_CSS = "select[id='testingDropdown']";
    private static String textbox_CSS="input[id='fname']";
    private static String submit_botton="button[id='idOfButton']";
    private static String radio_button="input[id='female']";
    private static String double_click="button[id='dblClkBtn']";
    private static String check_box="input[class='Automation']";
    private static String link="//div[@class='container']//a";


    @Test
    public void verifydropdown() {
        System.setProperty("webdriver.chrome.driver", "D:\\automation\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.cssSelector(dropdown_CSS));
        Select st= new Select(ele);
     //   st.selectByVisibleText("Performance Testing");
     //   st.selectByIndex(2);
        st.selectByValue("Performance");
        WebElement el=driver.findElement(By.cssSelector(textbox_CSS));
        el.sendKeys("Anjali");
        WebElement element =driver.findElement(By.cssSelector(submit_botton));

        element.click();
        WebElement a=driver.findElement(By.cssSelector(radio_button));
        a.click();
        WebElement b = driver.findElement(By.cssSelector(double_click));
        b.click();
        WebElement c = driver.findElement(By.cssSelector(check_box));
        c.click();

        WebElement d= driver.findElement(By.xpath(link));
        d.click();
        



    }
}
