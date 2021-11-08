package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {
    public static void main(String[] args) throws InterruptedException {


        //Opening webpage
        String appUrl = "https://login2.nextbasecrm.com";
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
       // WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(appUrl);




        //login placeholder locator
        WebElement login = driver.findElement(By.cssSelector("input[placeholder='Login']"));
        //inserting helpdesk user login id 'helpdesk35@cybertekschool.com'
        login.sendKeys("helpdesk35@cybertekschool.com");

        //password placeholder locator
        WebElement password = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        //Inserting helpdesk user password 'UserUser'
        password.sendKeys("UserUser");

        Thread.sleep(1234);

        //<input type="submit" value="Log In" class="login-btn" onclick="BX.addClass(this, 'wait');">

        //login button locator
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='login-btn']"));
        //Click on login button
        loginButton.click();

        //"https://login2.nextbasecrm.com/stream/?login=yes";

        //Verifying if the user is on the homepage by locating username
        WebElement headerSearch = driver.findElement(By.cssSelector("#user-name")); // we can use this for unique id
        //<span class="user-name" id="user-name">helpdesk35@cybertekschool.com</span>



        if (headerSearch.isDisplayed()){
            System.out.println("PASS: Login Successfully");
        }else{
            System.out.println("FAIL: Login failed");
        }

        Thread.sleep(4000);

        driver.quit();


    }

}
