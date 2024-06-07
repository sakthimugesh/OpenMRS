package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewService {
static WebDriver driver;

public CreateNewService(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//i[@class='icon-home small']")
	private WebElement homeIcon;

	public WebElement getHomeIcon() {
		return homeIcon;
	}
	
	@FindBy(xpath = "//h4[contains(text(),'Super User')]")
	private WebElement homePageVerify;

	public WebElement getHomePageVerify() {
		return homePageVerify;
	}
	
	@FindBy(xpath = "//div[@id='apps']/a[5]")
	private WebElement appointmentSchedule;

	public WebElement getAppointmentSchedule() {
		return appointmentSchedule;
	}
	
	@FindBy(xpath = "(//ul[@id='breadcrumbs']/li)[2]")
	private WebElement appointmentPageVerify;

	public WebElement getAppointmentPageVerify() {
		return appointmentPageVerify;
	}
	
	@FindBy(xpath = "(//div[@id='apps']/div/a)[1]")
	private WebElement manageServiceType;

	public WebElement getManageServiceType() {
		return manageServiceType;
	}
	
	@FindBy(xpath = "//div[@class='container']/div/button")
	private WebElement newServiceType;

	public WebElement getNewServiceType() {
		return newServiceType;
	}
	
	@FindBy(xpath = "//input[@id='name-field']")
	private WebElement serviceName;

	public WebElement getServiceName() {
		return serviceName;
	}
	
	@FindBy(xpath = "//input[@id='duration-field']")
	private WebElement serviceDuration;

	public WebElement getServiceDuration() {
		return serviceDuration;
	}
	
	@FindBy(xpath = "//textarea[@id='description-field']")
	private WebElement serviceDescription;

	public WebElement getServiceDescription() {
		return serviceDescription;
	}
	
	@FindBy(xpath = "//input[@id='save-button']")
	private WebElement saveServiceType;

	public WebElement getSaveServiceType() {
		return saveServiceType;
	}
	
	@FindBy(xpath = "//div[@id='appointmentTypesTable_paginate']/span/a[3]")
	private WebElement Clickontable;

	public WebElement getClickontable() {
		return Clickontable;
	}
	
	@FindBy(xpath = "//div[@id='appointmentTypesTable_wrapper']/table/tbody/tr[3]/td[1]")
	private WebElement verifyServiceTypeTable;

	public WebElement getVerifyServiceTypeTable() {
		return verifyServiceTypeTable;
	}

}
