package Git.Git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class test {
	WebDriver driver=new FirefoxDriver();
	public void google(){
		driver.navigate().to("https://www.google.co.uk/?gws_rd=ssl");
		}
	}
