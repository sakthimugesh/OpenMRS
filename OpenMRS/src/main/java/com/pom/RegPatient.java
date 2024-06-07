package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPatient {
	static WebDriver driver;
	

	public RegPatient(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div[@id='apps']/a)[4]")
	private WebElement registerPatient;

	public WebElement getRegisterPatient() {
		return registerPatient;
	}
	
	@FindBy(xpath = "//input[@name='givenName']")
	private WebElement givenName;

	public WebElement getGivenName() {
		return givenName;
	}

	@FindBy(xpath = "//input[@name='familyName']")
	private WebElement familyName;

	public WebElement getFamilyName() {
		return familyName;
	}
	
	@FindBy(xpath = "//button[@id='next-button']")
	private WebElement nextButton;

	public WebElement getNextButton() {
		return nextButton;
	}
	
	@FindBy(xpath = "//select[@id='gender-field']")
	private WebElement gender;

	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(xpath = "//input[@name='birthdateDay']")
	private WebElement day;

	public WebElement getDay() {
		return day;
	}
	
	@FindBy(xpath = "//select[@id='birthdateMonth-field']")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(xpath = "//*[@id='birthdateYear-field']")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(xpath = "//input[@id='cityVillage']")
	private WebElement city;

	public WebElement getCity() {
		return city;
	}
	
	@FindBy(xpath = "//input[@id='stateProvince']")
	private WebElement state;

	public WebElement getState() {
		return state;
	}
	
	@FindBy(xpath = "//input[@id='country']")
	private WebElement country;

	public WebElement getCountry() {
		return country;
	}
	
	@FindBy(xpath = "//input[@id='postalCode']")
	private WebElement pincode;

	public WebElement getPincode() {
		return pincode;
	}
	
	@FindBy(xpath = "//input[@name='phoneNumber']")
	private WebElement phoneNumber;

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	
	@FindBy(xpath = "//select[@id='relationship_type']")
	private WebElement relationship;

	public WebElement getRelationship() {
		return relationship;
	}
	
	@FindBy(xpath = "//input[@placeholder='Person Name']")
	private WebElement personName;

	public WebElement getPersonName() {
		return personName;
	}
	
	@FindBy(xpath = "(//p[@class='left']/child::ul/li/a)[6]")
	private WebElement selPersonName;

	public WebElement getSelPersonName() {
		return selPersonName;
	}
	
	@FindBy(xpath = "//input[@id='submit']")
	private WebElement confirm;

	public WebElement getConfirm() {
		return confirm;
	}
	
	@FindBy(xpath = "//div[@class='float-sm-right']/span")
	public WebElement patientId;

	public WebElement getPatientId() {
		return patientId;
	}
	
	@FindBy(xpath = "//span[@class='PersonName-givenName']")
	private WebElement patientDetailsPageStatus;

	public WebElement getPatientDetailsPageStatus() {
		return patientDetailsPageStatus;
	}
	
	@FindBy(xpath = "//div[@class='gender-age col-auto']/child::span[contains(text(),'23 year')]")
	private WebElement ageVerifyStatus;

	public WebElement getAgeVerifyStatus() {
		return ageVerifyStatus;
	}
	
	@FindBy(xpath = "//div[@id='dataCanvas']/div/p[1]")
	private WebElement verifyName;


	public WebElement getVerifyName() {
		return verifyName;
	}

	//verify
	@FindBy(xpath = "//div[@id='dataCanvas']/div/p[2]")
	private WebElement verifygender;


	public WebElement getVerifygender() {
		return verifygender;
	}
	
	@FindBy(xpath = "//div[@id='dataCanvas']/div/p[3]")
	private WebElement verifyDob;


	public WebElement getVerifyDob() {
		return verifyDob;
	}
	
	@FindBy(xpath = "//div[@id='dataCanvas']/div/p[4]")
	private WebElement verifyAddress;


	public WebElement getVerifyAddress() {
		return verifyAddress;
	}
	
	@FindBy(xpath = "//div[@id='dataCanvas']/div/p[5]")
	private WebElement verifyphoneNum;


	public WebElement getVerifyphoneNum() {
		return verifyphoneNum;
	}
}
