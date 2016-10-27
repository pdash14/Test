import java.util.List;

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myclass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Punyasmin\\Downloads\\geckodriver.exe");

	    WebDriver driver = new FirefoxDriver();   

	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Cheese!\n"); // send also a "\n"
	    element.submit();

	    // wait until the google page shows the result
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

	    List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

	    	}
}
