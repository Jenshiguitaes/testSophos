package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverController;

public class BasePage extends DriverController {
	
	private static WebDriverWait wait;
	
	public static void initBrowser (String url) {
		getDriver().get(url);	
		wait =new WebDriverWait(getDriver(), Duration.ofSeconds(20));

	}
	
	public static WebDriverWait getWait() {
		return wait;
	}
	
	public void type(String inputText, WebElement element) {
		element.sendKeys(inputText);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void pressKey(WebElement element, Keys key) {
		element.sendKeys(key);
	}
	
	public static String getTextNode(WebElement e)
	{
	    String text = e.getText().trim();
	    List<WebElement> children = e.findElements(By.xpath("./*"));
	    for (WebElement child : children)
	    {
	        text = text.replaceFirst(child.getText(), "").trim();
	    }
	    return text;
	}
}
