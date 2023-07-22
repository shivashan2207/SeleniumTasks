package com.SeleniumTasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		WebElement Loginpopup= driver.findElement(By.xpath("//span[text()=\"Enter Email/Mobile number\"]"));
//		
//		Loginpopup.isDisplayed();
//		if () {
//		}
//		else if {
//			
//		}

		
			WebElement clo = driver.findElement(By.cssSelector("._2KpZ6l._2doB4z"));
			clo.click();

		WebElement flights = driver.findElement(By.cssSelector("img[alt='Flights']"));
		flights.click();
		
      

		WebElement Departlocation = driver.findElement(By.cssSelector("input[name='0-departcity']"));
		Departlocation.click();
//		
        Departlocation.sendKeys("chenn");
		Thread.sleep(2000);
//		,Keys.DOWN,Keys.ENTER
		Departlocation.sendKeys(Keys.DOWN);
		Departlocation.sendKeys(Keys.ENTER);
		
//		Robot Enterloc= new Robot();
//		Enterloc.keyPress(KeyEvent.VK_KP_DOWN);
//		Enterloc.keyRelease(KeyEvent.VK_KP_DOWN);
//		Enterloc.keyPress(KeyEvent.VK_ENTER);
//		Enterloc.keyRelease(KeyEvent.VK_ENTER);
//		
//		WebElement FromLoc= driver.findElement(By.xpath("(//span[text()=\"Chennai\"])[1]"));
//		FromLoc.click();
//	        
//		Actions act= new Actions(driver);
//		act.moveToElement(Departlocation).perform();
//		act.click();
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].setAttribute( 'value','Chennai, MAA - Chennai Airport, India')",Departlocation);	
		
        //WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.
//		
//		//WebElement Depart = driver.findElement(By.cssSelector("input[value=\"Chennai, MAA - Chennai Airport, India\"]"));
//		
		

		WebElement Arrival = driver.findElement(By.cssSelector("input[name='0-arrivalcity']"));
		Arrival.click();
		Arrival.sendKeys("delhi");
		
		Thread.sleep(2000);
//		,Keys.DOWN,Keys.ENTER
		Arrival.sendKeys(Keys.DOWN);
		Arrival.sendKeys(Keys.ENTER);
		
//		
//		Actions act1= new Actions(driver);
//		act1.moveToElement(Arrival).perform();
//		act1.click();
//
//
		WebElement SelectDate = driver.findElement(By.cssSelector("input[name='0-datefrom']"));
		SelectDate.click();
//
		Thread.sleep(4000);
		WebElement Traveldate = driver.findElement(By.cssSelector("input[value='22 Jul, Sat']"));
		Traveldate.click();
//
		WebElement Travelers = driver.findElement(By.cssSelector("input[name='0-travellerclasscount']"));
		Travelers.click();
//
		Thread.sleep(2000);
		WebElement Persons = driver.findElement(By.cssSelector("button._2KpZ6l._34K0qG._37Ieie>svg>path[fill='#2874f0']"));
		Persons.click();
//
		Thread.sleep(1000);
		WebElement Done = driver.findElement(By.cssSelector(".aC49_F._14Me7y"));
		Done.click();
//
		WebElement Search = driver.findElement(By.cssSelector("._2F2Cuf"));
		Search.click();
//
	}}

