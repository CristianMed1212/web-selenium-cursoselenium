package practica;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalcularRFCyCURP {
		
		private WebDriver driver;
		
		@BeforeTest 
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "C://GIT//web-selenium-cursoselenium//SeleniumAutomation/Driver//Chrome//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.sinube.mx/calcula-tu-rfc-y-curp");
			
		}
		@Test
		public void testgenerarCURP() {
			
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			assertEquals("Calcula tu RFC y CURP — sinube",driver.getTitle());
			WebElement cerrar = driver.findElement(By.className("sqs-popup-overlay-close"));
			cerrar.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/main/section/div/div[3]/div[2]/div/div/div/iframe")));
			WebElement nombres = driver.findElement(By.xpath("//*[@id=\"x-auto-5-input\"]"));
			nombres.click();
			nombres.clear();
			nombres.sendKeys("Cristian Roberto");
			WebElement apaterno = driver.findElement(By.xpath("//*[@id=\"x-auto-8-input\"]"));
			apaterno.click();
			apaterno.clear();
			apaterno.sendKeys("Medina");
			WebElement amaterno = driver.findElement(By.xpath("//*[@id=\"x-auto-11-input\"]"));
			amaterno.click();
			amaterno.clear();
			amaterno.sendKeys("Hernandez");
			WebElement fecha = driver.findElement(By.xpath("//*[@id=\"x-auto-18-input\"]"));
			fecha.click();
			fecha.clear();
			fecha.sendKeys("12-12-1985");
			
			}
		
		

	}

	


