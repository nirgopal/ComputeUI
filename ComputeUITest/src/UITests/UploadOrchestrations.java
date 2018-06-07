package UITests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class UploadOrchestrations {
	
	WebDriver driver = null;
	String key = "actionBtn";
  @Test
  public void uploadBlankOrchesration() throws InterruptedException, IOException {
	  
	  driver.findElement(By.xpath("//*[@id='subbanner-orchestrations']/p/span")).click();
      driver.findElement(By.xpath("//*[@id='"+key+"']//*[text()='Upload Orchestration']")).click();
      driver.findElement(By.id("selectFileBtn")).click();
          
     
          System.out.println("Executing autoIt scripts");
      Thread.sleep(10000);
      Runtime.getRuntime().exec("D:/Scripts/UploadBlankOrch.exe");
      System.out.println("Completed autoIt scripts");
      Thread.sleep(10000);
      driver.findElement(By.xpath("//*[@id='"+key+"']//*[text()='Upload']")).click();
      Thread.sleep(3000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
      String path  = "//*[@id='form']/div/input[2])";
      
      String url = "https://den00spw.us.oracle.com:4443/mycompute/console/view.html";
      System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(url);
      driver.findElement(By.id("username")).sendKeys("manon.delisle@oracle.com");
      driver.findElement(By.id("simAccount")).sendKeys("mdtestqaraw4");
      driver.findElement(By.className("submit-button")).click();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
