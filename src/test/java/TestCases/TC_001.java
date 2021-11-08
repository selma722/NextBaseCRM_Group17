package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {
    public static void main(String[] args) throws InterruptedException {


        String appUrl = "https://login2.nextbasecrm.com";
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
       // WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);

        //helpdesk35@cybertekschool.com
        //UserUser

        WebElement login = driver.findElement(By.cssSelector("input[placeholder='Login']"));
        login.sendKeys("helpdesk35@cybertekschool.com");

        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        password.sendKeys("UserUser");

        Thread.sleep(1234);

        //<input type="submit" value="Log In" class="login-btn" onclick="BX.addClass(this, 'wait');">

        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        //"https://login2.nextbasecrm.com/stream/?login=yes";

        WebElement headerSearch = driver.findElement(By.cssSelector("#user-name")); // we can use this for unique id
        //<span class="user-name" id="user-name">helpdesk35@cybertekschool.com</span>

        if (headerSearch.isDisplayed()){
            System.out.println("PASS: Login Successfully");
        }else{
            System.out.println("FAIL: Login failed");
        }

        driver.quit();


    }

}
