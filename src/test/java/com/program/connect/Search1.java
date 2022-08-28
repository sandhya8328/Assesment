package com.program.connect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search1 {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://tide.com/en-us");
driver. manage().window().maximize();
	driver.findElement(By.xpath("//header[@id=\"site-header\"]/div[2]/div/div/div/form/div/input")).click();
	driver.findElement(By.xpath("//header[@id=\"site-header\"]/div[2]/div/div/div/form/div/input")).sendKeys("Stain remover");
	driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[2]/div/div/div/form/div/button")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//main[@id=\"site-content\"]/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/a")).click();
	}

}
