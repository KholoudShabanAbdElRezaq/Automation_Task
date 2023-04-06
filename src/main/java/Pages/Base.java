package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Base {
    public  static WebDriver webDriver;
    public static Properties properties = new Properties();


    public  void lunchBrowser() throws IOException {
      FileInputStream fileInputStream = new FileInputStream(new File("src/main/java/configuration/config"));
      properties.load(fileInputStream);
      if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
      {
          ChromeOptions co = new ChromeOptions();
          co.addArguments("--remote-allow-origins=*");
          webDriver=new ChromeDriver(co);
          webDriver.manage().window().maximize();
      }
      else if (properties.getProperty("browser").equalsIgnoreCase("firefox"))
      {
          webDriver=new FirefoxDriver();
          webDriver.manage().window().maximize();
      }
      else
      {
          System.out.println("Error in Browser");
      }
       webDriver.get(properties.getProperty("url"));

    }
}
