package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001N {
    public static void main(String[] args) {
        String appUrl = "https://login2.nextbasecrm.com";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(appUrl);

//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get(appUrl);
        WebElement emailPlaceHolder= driver.findElement(By.cssSelector("input[name='USER_LOGIN']"));
        if(emailPlaceHolder.isDisplayed()){
            System.out.println("You are on the Log In page!");
        }
        emailPlaceHolder.sendKeys("invalid@email.com");
        WebElement passPlaceHolder= driver.findElement(By.cssSelector("input[name='USER_PASSWORD']"));
        passPlaceHolder.sendKeys("password");
        WebElement loginBtn=driver.findElement(By.cssSelector("input[value='Log In']"));
        loginBtn.click();
        String titleLoginPage=driver.getCurrentUrl();
        String expectedTitle= "https://login2.nextbasecrm.com/?login=yes";
        if(expectedTitle.equals(titleLoginPage)){
            System.out.println("invalid login or password ");
        }


    }
}