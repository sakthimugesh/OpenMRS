package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigirationReader {
	public Properties p ;
	public ConfigirationReader() throws IOException {
		  File f = new File ("C:\\Users\\acer\\eclipse-workspace\\OpenMRS\\src\\main\\java\\com\\properties\\OpenmrsProperties");
		  FileInputStream fi = new FileInputStream(f);
		  p = new Properties();
		  p.load(fi);
	  }
	  public String getBrowser() {
		  String Browser = p.getProperty("browser");
		return Browser;
	
	  }
	  public String getUrl() {
		  String Url = p.getProperty("url");
		return Url;
	  }
	  
	  public String getUserName() {
		  String Username = p.getProperty("username");
		return Username;
	  }
	  
	  public String getPassword() {
		  String Password = p.getProperty("password");
		return Password;
	  }
	  
	  public String getGivenName() {
		  String GivenName = p.getProperty("givenName");
		return GivenName;
	  }

	  public String getFamilyName() {
		  String FamilyName = p.getProperty("familyName");
		return FamilyName;
	  }
	  
	  public String getDate() {
		  String Date = p.getProperty("date");
		return Date;
	  }
	  
	  public String getYear() {
		  String Year = p.getProperty("year");
		return Year;
	  }
	  
	  public String getAddress() {
		  String Address = p.getProperty("address");
		return Address;
	  }
	  
	  public String getCity() {
		  String City = p.getProperty("city");
		return City;
	  }
	  
	  public String getState() {
		  String State = p.getProperty("state");
		return State;
	  }
	  
	  public String getCountry() {
		  String Country = p.getProperty("country");
		return Country;
	  }
	  
	  public String getPincode() {
		  String Pincode = p.getProperty("pincode");
		return Pincode;
	  }
	  
	  public String getPhoneNumber() {
		  String PhoneNumber = p.getProperty("phoneNumber");
		return PhoneNumber;
	  }
	  
	  public String getPersonName() {
		  String PersonName = p.getProperty("personName");
		return PersonName;
	  }
	  
	  public String getServiceName() {
		  String ServiceName = p.getProperty("serviceName");
		return ServiceName;
	  }
	  
	  public String getServiceDuration() {
		  String ServiceDuration = p.getProperty("serviceDuration");
		return ServiceDuration;
	  }
	  
	  public String getServiceDescription() {
		  String ServiceDescription = p.getProperty("serviceDescription");
		return ServiceDescription;
	  }

	  public String getProviderName() {
		  String ProviderName = p.getProperty("providerName");
		return ProviderName;
	  }
	  
	  public String getStartTime() {
		  String StartTime = p.getProperty("startTime");
		return StartTime;
	  }
	  
	  public String getEndTime() {
		  String EndTime = p.getProperty("endTime");
		return EndTime;
	  }

	  
	  public String getAdditionalNotes() {
		  String AdditionalNotes = p.getProperty("additionalNotes");
		return AdditionalNotes;
	  }
	  
	  public String getCaption() {
		  String Caption = p.getProperty("caption");
		return Caption;
	  }
	  
	  public String getDeleteReason() {
		  String DeleteReason = p.getProperty("deleteReason");
		return DeleteReason;
	  }

}
