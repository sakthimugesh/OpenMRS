package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppointmentBlock {
	
static WebDriver driver;

public AppointmentBlock(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//ul[@id='breadcrumbs']/li[2]")
	private WebElement manageService;

	public WebElement getManageService() {
		return manageService;
	}
	
	@FindBy(xpath = "//ul[@id='breadcrumbs']/li[2]")
	private WebElement appointmentPage;

	public WebElement getAppointmentPage() {
		return appointmentPage;
	}
	
	@FindBy(xpath = "//div[@id='apps']/div[2]")
	private WebElement manageProvider;

	public WebElement getManageProvider() {
		return manageProvider;
	}
	
	@FindBy(xpath = "//div[@id='select-provider']/input")
	private WebElement providerName;

	public WebElement getProviderName() {
		return providerName;
	}
	
	@FindBy(xpath = "//div[@id='select-provider']/child::ul/li/a")
	private WebElement selproviderName;

	public WebElement getSelproviderName() {
		return selproviderName;
	}
	
	@FindBy(xpath = "//table[@class='fc-border-separate']/tbody/tr[2]/td[5]")
	private WebElement currentDate;

	public WebElement getCurrentDate() {
		return currentDate;
	}
	
	@FindBy(xpath = "//div[@id='start-time']")
	private WebElement startTime;

	public WebElement getStartTime() {
		return startTime;
	}
	
	@FindBy(xpath = "(//table/tbody/tr[2]/td[1])[3]/input")
	private WebElement changeStartTime;

	public WebElement getChangeStartTime() {
		return changeStartTime;
	}
	
	@FindBy(xpath = "//div[@id='end-time']")
	private WebElement endTime;

	public WebElement getEndTime() {
		return endTime;
	}
	
	@FindBy(xpath = "(//table/tbody/tr[2]/td[1])[4]/input")
	private WebElement changeEndTime;

	public WebElement getChangeEndTime() {
		return changeEndTime;
	}
	
	@FindBy(xpath = "(//div[@class='inline-box viewAllAppointmentTypes']/a)[2]")
	private WebElement viewType;

	public WebElement getViewType() {
		return viewType;
	}

	
	@FindBy(xpath = "//div[@id='modal-overlay']")
	private WebElement selModalWindow;

	public WebElement getSelModalWindow() {
		return selModalWindow;
	}
	
	@FindBy(xpath = "(//div[@class='dialog-content'])[2]/child::div/a[text()='Z General Treatment']")
	private WebElement selType;

	public WebElement getSelType() {
		return selType;
	}
	
	@FindBy(xpath = "(//span[@class='button confirm ng-binding'])[2]")
	private WebElement closeType;

	public WebElement getCloseType() {
		return closeType;
	}
	
	@FindBy(xpath = "//button[@class='confirm']")
	private WebElement saveSchedule;

	public WebElement getSaveSchedule() {
		return saveSchedule;
	}
	
	@FindBy(xpath = "//div[@class='schedule-providers ng-scope']/div/h1")
	private WebElement verifyManageProviderPage;

	public WebElement getVerifyManageProviderPage() {
		return verifyManageProviderPage;
	}
	
	@FindBy(xpath = "//div[@id='appointment-block-form-header']")
	private WebElement verifyCreateAppointmentPage;

	public WebElement getVerifyCreateAppointmentPage() {
		return verifyCreateAppointmentPage;
	}
	
	@FindBy(xpath = "//span[@class='angular-datepicker']/input")
	private WebElement verifyDate;

	public WebElement getVerifyDate() {
		return verifyDate;
	}
	
	@FindBy(xpath = "//div[@id='select-location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(xpath = "//div[@id='select-location']/select")
	private WebElement selLocation;

	public WebElement getSelLocation() {
		return selLocation;
	}
	
	@FindBy(xpath = "//div[@class='fc-event-inner']")
	private WebElement verifyAppointmentBlock;

	public WebElement getVerifyAppointmentBlock() {
		return verifyAppointmentBlock;
	}
	
	
}
