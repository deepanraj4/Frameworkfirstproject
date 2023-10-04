package org.sample;

import org.check.AdactinPom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PomMethods extends AdactinPom{


	public  PomMethods() {
	
		PageFactory.initElements(driver, this);
	}
		@FindBy(how = How.ID , using = "username")
		private WebElement username;
		
		public WebElement getUsername() {
			return username;			
		}
		
		@FindBy(how = How.ID, using = "password")
		private WebElement password;

		public WebElement getPassword() {
			return password;
		}
		
		@FindBy(how = How.ID , using = "login")
		private WebElement login;

		public WebElement getLogin() {
			return login;
		
		}
		
		@FindBy(how = How.ID, using = "location")
		private WebElement Location;

		public WebElement getLocation() {
			return Location;
		}
		
		@FindBy(how = How.ID, using = "hotels")
		private WebElement hotels;

		public WebElement getHotels() {
			return hotels;
		}
		
		@FindBy(how = How.ID, using = "room_type")
		private WebElement roomtype;

		public WebElement getRoomtype() {
			return roomtype;
		}
		
		@FindBy(how = How.ID, using = "room_nos")
		private WebElement numberOfRoom;

		public WebElement getNumberOfRoom() {
			return numberOfRoom;
		}
		
		@FindBy(how = How.ID, using = "datepick_in")
		private WebElement dateCheckin;

		public WebElement getDateCheckin() {
			return dateCheckin;
		}
		
		@FindBy(how = How.ID, using = "datepick_out")
		private WebElement dateCheckOut;

		
		
		public WebElement getDateCheckOut() {
			return dateCheckOut;
		}

		public void setDateCheckOut(WebElement dateCheckOut) {
			this.dateCheckOut = dateCheckOut;
		}
		@FindBy(how = How.ID, using = "adult_room")
		private WebElement adultsPerRoom;

		public WebElement getAdultsPerRoom() {
			return adultsPerRoom;
		}
		
		
		@FindBy(how = How.ID, using = "Submit")
		private WebElement Submit;

		public WebElement getSubmit() {
			return Submit;
		}
		
		@FindBy(how = How.ID, using = "radiobutton_0")
		private WebElement radiobutton;

		public WebElement getRadiobutton() {
			return radiobutton;
			
		}
		@FindBy(how = How.ID, using = "continue")
		private WebElement next;

		public WebElement getNext() {
			return next;
		}
		
		@FindBy(how = How.ID, using = "first_name")
		private WebElement firstname;

		public WebElement getFirstname() {
			return firstname;	
		}

		@FindBy(how = How.ID, using = "last_name")
		private WebElement lastname;

		public WebElement getLastname() {
			return lastname;
		}
		
		@FindBy(how = How.ID, using = "address")
		private WebElement address;

		public WebElement getAddress() {
			return address;
		}
		
		@FindBy(how = How.ID, using = "cc_num")
		private WebElement cardNumber;

		public WebElement getCardNumber() {
			return cardNumber;
		}
		
		@FindBy(how = How.ID, using = "cc_type")
		private WebElement cardType;

		public WebElement getCardType() {
			return cardType;
		}

		@FindBy(how = How.ID, using = "cc_exp_month")
		private WebElement expMonth;

		public WebElement getExpMonth() {
			return expMonth;
		}
		
		@FindBy(how = How.ID, using = "cc_exp_year")
		private WebElement expYear;

		public WebElement getExpYear() {
			return expYear;
		}
		
		@FindBy(how = How.ID, using = "cc_cvv")
		private WebElement cvv;

		public WebElement getCvv() {
			return cvv;
		}
		@FindBy(how = How.ID, using = "book_now")
		private WebElement bookNow;

		public WebElement getBookNow() {
			return bookNow;
		}
		
		
		
		}
		
		
		

	

