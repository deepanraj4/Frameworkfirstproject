package org.junitSample;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.sample.PomMethods;

public class JunitTest extends BaseClass {

	@BeforeClass
	public static void junit01() {
		
		getDriver("Chrome");
		getUrl("https://adactinhotelapp.com/");
		windMax();
		
	}

	@Before
	public void junit02() throws IOException {
		
	PomMethods l = new PomMethods();
	
	WebElement username = l.getUsername();
	username.sendKeys("deepanraj4444");
	WebElement password = l.getPassword();
	textSendBasedOnJS(excelRead(0, 1), password);

	}

	@Test
	public void junit03() {
		
		PomMethods l = new PomMethods();
		WebElement login = l.getLogin();
		login.click();

	}

	@After
	public void junit04() {
		
		System.out.println("04");

	}

	@AfterClass
	public static void junit05() {
		System.out.println("05");

	}
}
