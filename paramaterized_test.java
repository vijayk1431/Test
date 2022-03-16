package TestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class paramaterized_test
{
   WebDriver driver;
   @Test()
   @Parameters({"browser","url"})//for cross browsing.
  
   public void verifytitle(String browsername)
 {
	   if(browsername.equalsIgnoreCase("chrome"))
	   {
		   WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
	   }
	   else if(browsername.equalsIgnoreCase("edgebrowser"))
	   {
		   WebDriverManager.edgedriver().setup();
		   driver=new EdgeDriver();
	   }
	   else
	   {
		   System.out.println("completed");
	   }
	   driver.manage().window().maximize();
	   driver.get("url");
   }
 }

