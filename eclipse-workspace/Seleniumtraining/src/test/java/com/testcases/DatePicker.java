package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[4]")).click();
		

	}



	}


