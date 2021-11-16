package pages;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TrabajaConNosotrosPage extends BasePage {
	
	@FindBy(css = ".premium-blog-post-outer-container")
	private List <WebElement> listJobs;
		
	public TrabajaConNosotrosPage () {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean existList() {
		return listJobs.size()>0;
	}
	
	public void getJobs() {		
		AtomicInteger i = new AtomicInteger();
		i.set(0);
		
		listJobs.stream().peek(x -> i.incrementAndGet()).forEach(e -> {			
			System.out.println("Oferta "+i.get()+":");
			System.out.println("Nombre de la oferta: "+e.findElement(By.cssSelector(".premium-blog-entry-title")).getText());
			System.out.println("Fecha de publicación: "+e.findElement(By.cssSelector(".premium-blog-entry-meta span span")).getText());
			System.out.println("Descripción: "+getTextNode(e.findElement(By.cssSelector(".premium-blog-post-content")))+"\n");
			
		});
	}

}
