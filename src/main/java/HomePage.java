import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage 
{
@FindBy(id="twotabsearchtextbox")
WebElement searchfield;
@FindBy(how=How.PARTIAL_LINK_TEXT , using="OnePlus 7T (Glacier Blue, 8GB RAM, Fluid AMOLED Display, 128GB Storage, 3800mAH Battery)")
 WebElement item;

public void search(String username) {
	searchfield.sendKeys(username);
	searchfield.sendKeys(Keys.ENTER);
	item.click();
}
}
