import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static final String SIGNUP_CSS="a[name='Practo login']";
    private static final String ProfileName_CSS = "#root > div > div > div.global-nav-bar > div.practo_GlobalNavigation > div.navbar.desktop.en > div > div.nav-right.text-right > div.nav-items.u-d-trigger.dropdown-toggle.push-droparrow > span > span.user_info_top";
    private static final String Doctors_XPATH="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/a/div[1]";
    private static final String DrName_CSS="#container > div.o-page-container > div > div.pure-g.u-spacer--top > div.pure-u-18-24 > div.pure-g.g-card > div.pure-u-20-24 > div:nth-child(1) > h1";
    private static final String pharmacy_XPATH="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/a/div[2]";
    private static final String diagnostics_XPATH="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[4]/a/div[1]";

    public void clickSignupBtn(WebDriver driver){
        WebElement btn=driver.findElement(By.cssSelector(SIGNUP_CSS));
        btn.click();
    }

    public String getProfileName(WebDriver driver){
        WebElement profileEle = driver.findElement(By.cssSelector(ProfileName_CSS));
        return profileEle.getText();

    }
    public void  clickdoctors(WebDriver driver){
        WebElement cli=driver.findElement(By.xpath(Doctors_XPATH));
        cli.click();
    }

    public String getDrName_CSS(WebDriver driver)
    {
        WebElement profile=driver.findElement(By.cssSelector(DrName_CSS));
        return profile.getText();
    }
    public void clickpharmacy(WebDriver driver){
        WebElement pha =driver.findElement(By.xpath(pharmacy_XPATH));
        pha.click();
    }
    public void clickdiagnostics(WebDriver driver)
    {
        WebElement dia=driver.findElement(By.xpath(diagnostics_XPATH));
        dia.click();
    }
}
