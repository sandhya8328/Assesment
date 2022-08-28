package com.program.connect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://tide.com/en-us");
driver. manage().window().maximize();
driver.findElement(By.xpath("//header[@id=\"site-header\"]/div[1]/div/div/div/div[2]/span/a")).click();

driver.findElement(By.xpath("//main[@id=\"site-content\"]/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a")).click();
for(String mychild:driver.getWindowHandles()) {
	driver.switchTo().window(mychild);
}
driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Sandhya");
driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sandy123@gmail.com");
driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Sandy1234!");
driver.findElement(By.xpath("//div[@id=\"scroll\"]/div/div/div/div/div[2]/form/div[6]/div/input")).click();

	}

}
