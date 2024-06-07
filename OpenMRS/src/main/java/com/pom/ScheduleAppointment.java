package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScheduleAppointment {
	
static WebDriver driver;

public ScheduleAppointment(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//i[@class='icon-home small']")
	private WebElement homeIconclick;

	public WebElement getHomeIconclick() {
		return homeIconclick;
	}
	
	@FindBy(xpath = "//div[@id='apps']/a[1]")
	private WebElement findPatientRecord;

	public WebElement getFindPatientRecord() {
		return findPatientRecord;
	}
	
	@FindBy(xpath = "//input[@id='patient-search']")
	private WebElement searchpatientID;

	public WebElement getSearchpatientID() {
		return searchpatientID;
	}
	
	@FindBy(xpath = "//table[@class='table table-sm dataTable']/tbody/tr[1]")
	private WebElement patientClick;

	public WebElement getPatientClick() {
		return patientClick;
	}
	
	@FindBy(xpath = "//div[normalize-space(text())='Schedule Appointment']")
	private WebElement scheduleAppointment;

	public WebElement getScheduleAppointment() {
		return scheduleAppointment;
	}
	
	@FindBy(xpath = "//div[@id='viewAllAppointmentTypes']/a")
	private WebElement viewAllType;

	public WebElement getViewAllType() {
		return viewAllType;
	}
	
	@FindBy(xpath = "(//div[@class='dialog-content']/div/a)[23]")
	private WebElement selServiceType;

	public WebElement getSelServiceType() {
		return selServiceType;
	}
	
	@FindBy(xpath = "(//i[@class='icon-calendar small add-on'])[3]")
	private WebElement timeFrame;

	public WebElement getTimeFrame() {
		return timeFrame;
	}
	
	@FindBy(xpath = "(//div[@role='application'])[3]/table/tbody/tr[2]/td[7]")
	private WebElement selDate;

	public WebElement getSelDate() {
		return selDate;
	}
	
	@FindBy(xpath = "(//i[@class='icon-calendar small add-on'])[4]")
	private WebElement timeEndFrame;

	public WebElement getTimeEndFrame() {
		return timeEndFrame;
	}
	
	@FindBy(xpath = "(//div[@role='application'])[4]/table/tbody/tr[2]/td[7]")
	private WebElement selEndDate;

	public WebElement getSelEndDate() {
		return selEndDate;
	}
	
	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement searchAppointment;

	public WebElement getSearchAppointment() {
		return searchAppointment;
	}
	
	@FindBy(xpath = "//div[@class='ngCanvas']/div")
	private WebElement selectTimeBlock;

	public WebElement getSelectTimeBlock() {
		return selectTimeBlock;
	}
	
	@FindBy(xpath = "//div[@id='selectAppointment']/button")
	private WebElement confirmNextButton;

	public WebElement getConfirmNextButton() {
		return confirmNextButton;
	}
	
	@FindBy(xpath = "//textarea[@id='appointmentReason']")
	private WebElement additionalNotes;

	public WebElement getAdditionalNotes() {
		return additionalNotes;
	}
	
	@FindBy(xpath = "(//button[@class='confirm right'])[2]")
	private WebElement saveAppointment;

	public WebElement getSaveAppointment() {
		return saveAppointment;
	}
	
	@FindBy(xpath = "//div[@id='confirmAppointment']/div/p[2]/span")
	private WebElement verifyDate;

	public WebElement getVerifyDate() {
		return verifyDate;
	}
	
	@FindBy(xpath = "//div[@id='confirmAppointment']/div/p[4]/span")
	private WebElement verifyProvider;

	public WebElement getVerifyProvider() {
		return verifyProvider;
	}
	
	@FindBy(xpath = "//div[@id='confirmAppointment']/div/p[6]/span")
	private WebElement verifyLocation;

	public WebElement getVerifyLocation() {
		return verifyLocation;
	}
}
