package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinExcelRead extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		getDriver("Chrome");
		getUrl("https://adactinhotelapp.com/");
		
		
		WebElement userName = driver.findElement(By.id("username"));
		textSendBasedOnJS(excelRead(0,0), userName);
		
		WebElement password = driver.findElement(By.id("password"));
		textSendBasedOnJS(excelRead(0,1), password);
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		selectMethod(location, excelRead(1,0));
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		selectMethod(hotels, excelRead(1,1));
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		selectMethod(roomType, excelRead(3,1));
		
		WebElement numberofrooms = driver.findElement(By.id("room_nos"));
		selectMethod(numberofrooms, excelRead(2,1));
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		textSendBasedOnJS(excelRead (4,1), datein);
		
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		textSendBasedOnJS(excelRead (5,1), dateout);		
		
		WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
		selectMethod(adultsPerRoom, excelRead(6,1));
		
		WebElement searchbutton = driver.findElement(By.id("Submit"));
		searchbutton.click();
		
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		radiobutton.click();
		
		WebElement contineau = driver.findElement(By.id("continue"));
		contineau.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		textSendBasedOnJS(excelRead (7,1), firstname);
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		textSendBasedOnJS(excelRead (8,1), lastName);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("1/274,gandhinagar paramathi velur namakkal dt");
		
		WebElement cardNumber = driver.findElement(By.id("cc_num"));
		textSendBasedOnJS(excelRead (10,1), cardNumber);
		
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		selectMethod(cardtype, excelRead(11,1));
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		selectMethod(month, excelRead(12,1));
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		selectMethod(year, excelRead(13,1));
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		textSendBasedOnJS(excelRead (14,1), cvv);
		
		WebElement bookNow = driver.findElement(By.id("book_now"));
		bookNow.click();
		
		
	}
}
 