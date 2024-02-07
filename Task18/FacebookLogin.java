package Task18;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

		public static void main(String[] args) {
		//load the driver
			WebDriver driver = new ChromeDriver();
			//pass the url
		driver.navigate().to("https://www.facebook.com/");
		//add implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//add window maximize
		driver.manage().window().maximize();
		// redirect to the homepage (to refresh it)
		driver.navigate().refresh();
		//choose create account 
	    WebElement account= driver.findElement(By.linkText("Create new account"));
	    account.click();
	    //select first name
	    WebElement first = driver.findElement(By.name("firstname"));
	    first.sendKeys("usha");
	    //select lastname
	    WebElement last = driver.findElement(By.name("lastname"));
	    last.sendKeys("rambabu");
	    //enter the mail id
	    WebElement email = driver.findElement(By.name("reg_email__"));
	    email.sendKeys("Ct3.staffing@gmail.com");
	    // conformation mail id
	    WebElement con = driver.findElement(By.name("reg_email_confirmation__"));
	    con.sendKeys("Ct3.staffing@gmail.com");
	    // create a password
	    WebElement pass = driver.findElement(By.name("reg_passwd__"));
	    pass.sendKeys("zuvipriya");
	    
	    //locate the select tag
	    // choose birthday  date
	    WebElement day = driver.findElement(By.name("birthday_day"));
	    Select sel = new Select(day);
	    sel.selectByValue("27");
	    //choose month
	    WebElement month =driver.findElement(By.name("birthday_month"));
	    Select sel1 = new Select(month);
	    sel1.selectByValue("9");
	    // choose birth year
	    WebElement year = driver.findElement(By.name("birthday_year"));
	    Select sel2 = new Select(year);
	    sel2.selectByValue("1993");
	    // choose gender value as female
	    WebElement name = driver.findElement(By.xpath("//label[text()=\"Female\"]"));
	    name.click();
	    // click on sign in button  then it shows sending the code to registered email
	    WebElement sub = driver.findElement(By.name("websubmit"));
        sub.click();
        // after sign in redirect to home page.
	    driver.navigate().refresh();



	}

}
