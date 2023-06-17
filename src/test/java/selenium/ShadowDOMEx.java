package herokuapp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/shadowdom");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement element = (WebElement) jse.executeScript("return document.querySelector('my-paragraph > span')");
		System.out.println("TExt: "+element.getText());
		
		WebElement element2 = (WebElement) jse.executeScript("return document.querySelector(\"my-paragraph:nth-child(5) > ul\")");
		String text = element2.getText();
		System.out.println("Sub Text: "+text);
	}

}
