package selenium;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenImagesEx {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().browserVersion("").setup();
		WebDriver driver = new ChromeDriver();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		List<String> links = new ArrayList();
		for(WebElement ele : elements) {
			links.add(ele.getAttribute("href"));
		}
		
		for(String url:links) {
			if(url.isEmpty()) {
				//assert fail
				
			}else if(url.contains("domain")) {
				//assert fail
			}else {
				HttpURLConnection huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				if(huc.getResponseCode() > 400) {
					//assert fail - broken image
				}else {
					//not a broken image
				}
			}
		}
		
	}

}
