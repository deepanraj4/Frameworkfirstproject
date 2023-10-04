package org.check;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.sample.PomMethods;

public class AdactinPom extends BaseClass {
	public static void main(String[] args) throws IOException {

		getDriver("Chrome");
		driver.get("https://adactinhotelapp.com/");

		PomMethods l = new PomMethods();

		WebElement username = l.getUsername();
		username.sendKeys("deepanraj4444");

		WebElement password = l.getPassword();
		password.sendKeys("12345678");

		WebElement login = l.getLogin();
		login.click();

		WebElement location = l.getLocation();
		selectMethod(location, excelRead(1, 0));

		WebElement hotels = l.getHotels();
		selectMethod(hotels, excelRead(1, 1));

		WebElement roomtype = l.getRoomtype();
		selectMethod(roomtype, excelRead(3, 1));

		WebElement numberOfRoom = l.getNumberOfRoom();
		selectMethod(numberOfRoom, excelRead(2, 1));

		WebElement dateCheckin = l.getDateCheckin();
		textSendBasedOnJS(excelRead(4, 1), dateCheckin);

		WebElement dateCheckout = l.getDateCheckOut();
		textSendBasedOnJS(excelRead(5, 1), dateCheckout);

		WebElement adultsPerRoom = l.getAdultsPerRoom();
		selectMethod(adultsPerRoom, excelRead(6, 1));

		WebElement submit = l.getSubmit();
		submit.click();

		WebElement radiobutton = l.getRadiobutton();
		radiobutton.click();

		WebElement next = l.getNext();
		next.click();

		WebElement firstname = l.getFirstname();
		textSendBasedOnJS(excelRead(7, 1), firstname);

		WebElement lastname = l.getLastname();
		textSendBasedOnJS(excelRead(8, 1), lastname);

		WebElement address = l.getAddress();
		address.sendKeys("1/274,gandhinagar paramathi velur namakkal dt");

		WebElement cardNumber = l.getCardNumber();
		textSendBasedOnJS(excelRead(10, 1), cardNumber);

		WebElement cardType = l.getCardType();
		selectMethod(cardType, excelRead(11, 1));

		WebElement expMonth = l.getExpMonth();
		selectMethod(expMonth, excelRead(12, 1));

		WebElement expYear = l.getExpYear();
		selectMethod(expYear, excelRead(13, 1));

		WebElement Cvv = l.getCvv();
		textSendBasedOnJS(excelRead (14,1), Cvv);

		WebElement BookNow = l.getBookNow();
		BookNow.click();

	}

}
