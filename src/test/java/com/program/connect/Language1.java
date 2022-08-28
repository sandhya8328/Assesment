package com.program.connect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Language1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://tide.com/en-us");
driver. manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"site-header\"]/div[1]/div/div/div/div[2]/button/svg")).click();



		
	}

}

