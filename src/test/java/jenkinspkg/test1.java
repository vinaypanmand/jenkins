package jenkinspkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	
	@BeforeClass
	public void before() {
		
		
		String b1=System.getProperty("browser", "chrome");
		
		if(b1.equalsIgnoreCase("edge")){
			
			driver = new EdgeDriver();	
			
		}
		
		if(b1.equalsIgnoreCase("chrome")){
			
			driver = new ChromeDriver();	
			
		}
		
		
		
		
	}
	
	@Test
	public void te1(){
		
		
		driver.get("https://accounts.simplilearn.com/user/login");
		driver.manage().window().maximize();	
		
		
		
	}
	

	

}
