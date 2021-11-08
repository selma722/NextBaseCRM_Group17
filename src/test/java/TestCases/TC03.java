package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03 {

    private static java.lang.Object WebDriverManager;

    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String url="https://login2.nextbasecrm.com";
        driver.get(url);

        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("hr36@cybertekschool.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser"+ Keys.ENTER);
        WebElement loginBtn= driver.findElement(By.xpath("//input[@value='Log In']"));
        loginBtn.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Authorization";

        System.out.println(actualTitle.equals(expectedTitle) ? "Pass": "Failed");




    }
}

   /*Step 1. Open website
Step 2. User should see "Email" in placeholder and type-in valid email address there
Step 3. User should see "Password" in placeholder and type-in valid password there
Step 4. Click on the "Log in" button*/
