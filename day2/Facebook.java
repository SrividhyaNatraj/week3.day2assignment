package week3.day2;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {;

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://en-gb.facebook.com/");
	    List<WebElement> findElements = driver.findElements(By.tagName("a"));
	        System.out.println(findElements.size());
	    for (int i = 0; i < findElements.size(); i++) {
	        System.out.println(findElements.get(i).getText());
	    }       
	    }
	}
    