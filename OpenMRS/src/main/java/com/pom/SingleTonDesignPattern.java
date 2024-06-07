package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {
	
	public WebDriver driver;
	
	public SingleTonDesignPattern(WebDriver driver2) {
		this.driver = driver2;
	     PageFactory.initElements(driver, this);
	}

	public Login login() {
		Login lp = new Login(driver);
		return lp;
	}
	
	public RegPatient regPatient() {
		RegPatient rp = new RegPatient(driver);
		return rp;
	}
	
	public AppointmentBlock appointmentBlock() {
		AppointmentBlock ab = new AppointmentBlock(driver);
		return ab;
	}
	
	public CreateNewService createNewService() {
		CreateNewService cns = new CreateNewService(driver);
		return cns;
	}
	
	public EndVisit endVisit() {
		EndVisit ev = new EndVisit(driver);
		return ev;
	}
	
	public ScheduleAppointment scheduleAppointment() {
		ScheduleAppointment sa = new ScheduleAppointment(driver);
		return sa;
	}
	
	public StartVisit startVisit() {
		StartVisit sv = new StartVisit(driver);
		return sv;
	}

}
