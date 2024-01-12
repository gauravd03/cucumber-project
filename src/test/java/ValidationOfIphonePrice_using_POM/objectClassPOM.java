package ValidationOfIphonePrice_using_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class objectClassPOM {
	WebDriver driver;
	
	By HomePrice = By.xpath("");
	By product = By.linkText("Iphone 6 32gb");
	By ProductPrice= By.xpath("//*[@id=\"tbodyid\"]/h3");
	
	public objectClassPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getHomePrice() {
		WebElement homeP = driver.findElement(HomePrice);
		String str = homeP.getText();
		return str;
	}
	
	public void clickProduct() {
		driver.findElement(product).click();
	}
	
	public String getProductPrice() {
		WebElement ProductP = driver.findElement(ProductPrice);
		String str1 = ProductP.getText();
		return str1;
	}

}
