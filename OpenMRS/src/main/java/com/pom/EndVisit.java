package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EndVisit {
	
static WebDriver driver;

public EndVisit(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "//div[@class='action-section col-12 order-first d-lg-none']/ul/li/a/div/div[normalize-space(text())='End Visit']")
	private WebElement endVisit;

	public WebElement getEndVisit() {
		return endVisit;
	}
	
	@FindBy(xpath = "(//button[@class='confirm right'])[5]")
	private WebElement confirmEndVisit;

	public WebElement getConfirmEndVisit() {
		return confirmEndVisit;
	}
	
	@FindBy(xpath = "//div[normalize-space(text())='Delete Patient']")
	private WebElement deletePatient;

	public WebElement getDeletePatient() {
		return deletePatient;
	}
	
	@FindBy(xpath = "//input[@id='delete-reason']")
	private WebElement deleteReason;

	public WebElement getDeleteReason() {
		return deleteReason;
	}
	
	@FindBy(xpath = "(//button[@class='confirm right'])[6]")
	private WebElement confirmDeletePatient;

	public WebElement getConfirmDeletePatient() {
		return confirmDeletePatient;
	}

	
	@FindBy(xpath = "//i[@class='icon-home small']")
	private WebElement homePage;

	public WebElement getHomePage() {
		return homePage;
	}
	
	@FindBy(xpath = "//div[@id='apps']/a[5]")
	private WebElement appointmentSchedl;

	public WebElement getAppointmentSchedl() {
		return appointmentSchedl;
	}
	
	@FindBy(xpath = "(//div[@id='apps']/div/a)[1]")
	private WebElement manageType;

	public WebElement getManageType() {
		return manageType;
	}
	
	@FindBy(xpath = "//*[@id='appointmentTypesTable_paginate']/span/a[3]")
	private WebElement selectPage;

	public WebElement getSelectPage() {
		return selectPage;
	}
	
	@FindBy(xpath = "//div[@id='appointmentTypesTable_wrapper']/table/tbody/tr[4]/td[4]/span/i[2]")
	private WebElement deleteServiceType;

	public WebElement getDeleteServiceType() {
		return deleteServiceType;
	}
	
	@FindBy(xpath = "//div[@class='simplemodal-wrap']/div/div[2]/button[1]")
	private WebElement confirmDeleteService;

	public WebElement getConfirmDeleteService() {
		return confirmDeleteService;
	}
}
