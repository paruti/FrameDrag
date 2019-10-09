

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Parthi Rajan\\Desktop\\New folder\\FrameDrag\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement scroll = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scroll);
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		WebElement addclose = driver.findElement(By.id("CloseBtn"));
		addclose.click();
		driver.switchTo().defaultContent();
		
		WebElement bnk = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dbt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(bnk, dbt).perform();
		Thread.sleep(2000);
		
		WebElement amt1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement holder = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(amt1, holder).perform();
		Thread.sleep(2000);
		
		WebElement sls = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement cdt = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(sls,cdt).perform();
		Thread.sleep(2000);
		
		WebElement amt2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement hldr1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(amt2,hldr1).perform();
		
	}

}
