import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private static final String USERNAME_CSS = "input[id='username']";
    private static final String PASSWORD_CSS = "input[id='password']";
    private static final String LOGIN_CSS = "button[id='login']";

    public void enterUsername(WebDriver driver, String Username ){
        WebElement use=  driver.findElement(By.cssSelector(USERNAME_CSS));
        use.sendKeys(Username);
    }

    public void enterPassword(WebDriver driver,String Password){
        WebElement pass=driver.findElement(By.cssSelector(PASSWORD_CSS));
        pass.sendKeys(Password);
    }

    public void clickLoginBtn(WebDriver driver)
    {
        WebElement log=driver.findElement(By.cssSelector(LOGIN_CSS));
        log.click();
    }
    //Method is used to get login text
    public String getLoginText(WebDriver driver){
        WebElement text=driver.findElement(By.cssSelector(LOGIN_CSS));
        return text.getText();
    }


}