package com.ani.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;


class UpdateTest {
	
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeEach
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testUpdateMovie1() {
		

//		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/EditR/20");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("mname")).click();
		driver.findElement(By.name("mname")).sendKeys("Pokiri");
		driver.findElement(By.name("type")).click();
		driver.findElement(By.name("type")).sendKeys("Action/Romantic");
		driver.findElement(By.name("timing")).click();
		driver.findElement(By.name("timing")).sendKeys("BJKK");
		driver.findElement(By.name("update")).submit();
        assertEquals("Data Updated Successfully","Data Updated Successfully");
	}
	

}
