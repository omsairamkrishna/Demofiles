package Task18;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
	
        //launch the browser
		WebDriver driver = new ChromeDriver();
		//load the jquary url use navigate method
		driver.navigate().to("https://jqueryui.com/droppable/");
		// choose  implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// maximize the window
		driver.manage().window().maximize();
		//inside frame path loaded 
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		// switch to frame
		driver.switchTo().frame(frame);   
		//select the source id
		WebElement source = driver.findElement(By.id("draggable"));
		//select the destination id
		WebElement destination = driver.findElement(By.id("droppable"));
		//add action class operation on mouse courser
		Actions mouse = new Actions(driver);
		//use drag and drop element and print  its reached the target
		mouse.dragAndDrop(source, destination).perform();
		System.out.println(destination.getText());
		//choose the dropped box color and print it
		String css = driver.findElement(By.id("droppable")).getAttribute("color");
		System.out.println("target element css:" +css);
	
		
	
		

		
		
		
	
		
		

	}

}
