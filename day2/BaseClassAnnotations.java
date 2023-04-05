package week6.day2;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClassAnnotations {
	public ChromeDriver driver;
	public ChromeOptions option;
	public String excelFile;
	@Parameters({"url","uname","pwd"})
	@BeforeMethod
	
	public void preCondition(String url,String uname,String pwd) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	@DataProvider(name="fetchData")

	public String[][] getdata() throws IOException {
		
		String[][] inputData =ReadInput.inputData(excelFile);
		return inputData;

	}
}
