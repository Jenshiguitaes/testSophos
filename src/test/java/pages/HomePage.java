package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
	
	@FindBy(id="sg-popup-content-wrapper-5998")
	private WebElement popUpInicial;
	
	@FindBy(xpath="//html")
	private WebElement webPage;
	
	@FindBy(id="mega-menu-item-1541")
	private WebElement opcionTrabaja;
	
	
	
	public HomePage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void closePopUp() {		
		getWait().until(ExpectedConditions.visibilityOf(popUpInicial));
		pressKey(webPage,Keys.ESCAPE);
	}
	
	public TrabajaConNosotrosPage accessTrabajaConNosotros() {		
		click(opcionTrabaja);
		return new TrabajaConNosotrosPage();
		
	}

}
