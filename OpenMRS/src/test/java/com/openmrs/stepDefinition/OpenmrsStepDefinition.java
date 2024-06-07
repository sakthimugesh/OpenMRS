package com.openmrs.stepDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.openmrs.OpenmrsBase;
import com.openmrs.runner.OpenmrsTestTRunner;
import com.pom.SingleTonDesignPattern;
import com.properties.ConfigirationHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OpenmrsStepDefinition extends OpenmrsBase {

		public static WebDriver driver = OpenmrsTestTRunner.driver;
		
		SingleTonDesignPattern s = new SingleTonDesignPattern(driver);
		
		String patientId;
		
//login
		@Given("User Launch The OpenMRS Appilication")
		public void user_launch_the_open_mrs_appilication() throws IOException {
			launchurl(ConfigirationHelper.getInstance().getUrl());
			implicit(3000);
		}
		@When("User Enters Username and password")
		public void user_enters_username_and_password() throws IOException {
			userInput(s.login().getUserName(),ConfigirationHelper.getInstance().getUserName());
			userInput(s.login().getPassword(), ConfigirationHelper.getInstance().getPassword());
			screenShot("login age");
			implicit(3000);
		}
		@Then("User Select The Resgistration Desk and click on Login")
		public void user_select_the_resgistration_desk_and_click_on_login() throws IOException {
		    clickOnElment(s.login().getRegistrationDesk());
		    clickOnElment(s.login().getLogginButton());
		    screenShot("Dashboard");
		}
		@Then("User Verify dashboard")
		public void user_verify_dashboard() {
			verifyDisplayed(s.login().getStatus());
		}

//New Register
		
		@When("User Click on Register a patient menu.")
		public void user_click_on_register_a_patient_menu() {
		   clickOnElment(s.regPatient().getRegisterPatient());
		}
		@Then("User Enters the  Patient Name,Gender,Birthdate,Address and Phone number")
		public void user_enters_the_patient_name_gender_birthdate_address_and_phone_number() throws IOException {
			userInput(s.regPatient().getGivenName(),ConfigirationHelper.getInstance().getGivenName());
			userInput(s.regPatient().getFamilyName(),ConfigirationHelper.getInstance().getFamilyName());
			clickOnElment(s.regPatient().getNextButton());
			implicit(3000);
			dropdown(s.regPatient().getGender(),"value","M");
			clickOnElment(s.regPatient().getNextButton());
			implicit(3000);
			userInput(s.regPatient().getDay(),ConfigirationHelper.getInstance().getDate());
			dropdown(s.regPatient().getMonth(), "value", "6");
			implicit(3000);
			userInput(s.regPatient().getYear(),ConfigirationHelper.getInstance().getYear());
			clickOnElment(s.regPatient().getNextButton());
			userInput(s.regPatient().getAddress(),ConfigirationHelper.getInstance().getAddress());
			userInput(s.regPatient().getCity(),ConfigirationHelper.getInstance().getCity());
			userInput(s.regPatient().getState(),ConfigirationHelper.getInstance().getState());
			userInput(s.regPatient().getCountry(),ConfigirationHelper.getInstance().getCountry());
			userInput(s.regPatient().getPincode(),ConfigirationHelper.getInstance().getPincode());
			clickOnElment(s.regPatient().getNextButton());
			userInput(s.regPatient().getPhoneNumber(),ConfigirationHelper.getInstance().getPhoneNumber());
			clickOnElment(s.regPatient().getNextButton());			
		}
		@Then("User Enters the Relation Type and Doctor Name")
		public void user_enters_the_relation_type_and_doctor_name() throws IOException {
			dropdown(s.regPatient().getRelationship(),"text","Doctor");
			userInput(s.regPatient().getPersonName(),ConfigirationHelper.getInstance().getPersonName());
			implicit(4000);
			clickOnElment(s.regPatient().getSelPersonName());
			clickOnElment(s.regPatient().getNextButton());
			screenShot("Registered Patient Details");
		}
		@Then("User verify the  given  Name,  Gender,  Birthdate, Address and Phone number")
		public void user_verify_the_given_name_gender_birthdate_address_and_phone_number() {
			verify(s.regPatient().getVerifyName(), "Name: Rajesh, Kamaraj");
			verify(s.regPatient().getVerifygender(), "Gender: Male");
			verify(s.regPatient().getVerifyDob(), "Birthdate: 23, June, 2000");
			verify(s.regPatient().getVerifyAddress(), "Address: Kamaraj Street, Thanjavur, Tamil Nadu, India, 613009");
			verify(s.regPatient().getVerifyphoneNum(), "Phone Number: 9751001946");
		}
		
		@Then("User Clicks the Confirm Button")
		public void user_clicks_the_confirm_button() throws IOException {
			clickOnElment(s.regPatient().getConfirm());
			screenShot("PatientDetails");
			patientId = getText(s.regPatient().getPatientId());
		}
		@Then("User verify the Patient details page and age is calculated correctly Based On Input Given")
		public void user_verify_the_patient_details_page_and_age_is_calculated_correctly_based_on_input_given() {
			verifyDisplayed(s.regPatient().getPatientDetailsPageStatus());
			verifyDisplayed(s.regPatient().getAgeVerifyStatus());
		}

//Create New Service
		
	

		@When("User Clicks the Home icon and Verify the page is redirected")
		public void user_clicks_the_home_icon_and_verify_the_page_is_redirected() {
			clickOnElment(s.createNewService().getHomeIcon());
			verifyDisplayed(s.createNewService().getHomePageVerify());
		}
		@Then("User Clicks the Appointment  Scheduling and  Verify the page is redirected")
		public void user_clicks_the_appointment_scheduling_and_verify_the_page_is_redirected() {
			clickOnElment(s.createNewService().getAppointmentSchedule());
			verifyDisplayed(s.createNewService().getAppointmentPageVerify());
		}
		@Then("User Clicks Manage Service Types")
		public void user_clicks_manage_service_types() {
			clickOnElment(s.createNewService().getManageServiceType());
		}
		@Then("User Clicks the New service type")
		public void user_clicks_the_new_service_type() {
			clickOnElment(s.createNewService().getNewServiceType());
		   
		}
		@Then("User Enters the Name, Duration and Description in Service Type")
		public void user_enters_the_name_duration_and_description_in_service_type() throws IOException {
		  clear(s.createNewService().getServiceName());
		  userInput(s.createNewService().getServiceName(),ConfigirationHelper.getInstance().getServiceName());
		  userInput(s.createNewService().getServiceDuration(),ConfigirationHelper.getInstance().getServiceDuration());
		  userInput(s.createNewService().getServiceDescription(),ConfigirationHelper.getInstance().getServiceDescription());
		  screenShot("Service Type");
		  implicit(3000);
		  
		}
		@Then("User Clicks Save Button")
		public void user_clicks_save_button() {
			clickOnElment(s.createNewService().getSaveServiceType());
			
		    
		}
		@Then("User verifies the added Service Type in the table")
		public void user_verifies_the_added_service_type_in_the_table() {
			implicit(3000);
			clickOnElment(s.createNewService().getClickontable());
			
			verify(s.createNewService().getVerifyServiceTypeTable(),"Z General Treatment");
			System.out.println();
		}
 
//Appointment Block	

		@When("User Clicks Appointment Scheduling on the Top Left Page")
		public void user_clicks_appointment_scheduling_on_the_top_left_page() {
		   clickOnElment(s.appointmentBlock().getManageService());
		   clickOnElment(s.appointmentBlock().getAppointmentPage());
		   implicit(3000);
		}
		@Then("User Clicks the Manage  Provider  Schedules and Verify the page is redirected")
		public void user_clicks_the_manage_provider_schedules_and_verify_the_page_is_redirected() throws IOException {
			clickOnElment(s.appointmentBlock().getManageProvider());
			verify(s.appointmentBlock().getVerifyManageProviderPage(), "Manage Appointment Blocks");
					
		}
		@Then("User Select the Current Date in the Calendar")
		public void user_select_the_current_date_in_the_calendar() throws IOException {
			clickOnElment(s.appointmentBlock().getCurrentDate());
			
			
		}
		@Then("User Verify the Create Appointment Block page is redirected")
		public void user_verify_the_create_appointment_block_page_is_redirected() {
			verify(s.appointmentBlock().getVerifyCreateAppointmentPage(), "Create Appointment Block");
			
		}
		@Then("User Enters the Provider Name and Verify Entered Date")
		public void user_enters_the_provider_name_and_verify_entered_date() throws IOException {
			clickOnElment(s.appointmentBlock().getLocation());
			dropdown(s.appointmentBlock().getSelLocation(), "text", "Registration Desk");
			implicit(3000);
			clickOnElment(s.appointmentBlock().getProviderName());
			userInput(s.appointmentBlock().getProviderName(),ConfigirationHelper.getInstance().getProviderName());
			implicit(3000);
			clickOnElment(s.appointmentBlock().getSelproviderName());
			implicit(3000);
		//	verify(s.appointmentBlock().getVerifyDate(), "07-June-2024");

		}
		@Then("User Enters the Start and End Time in Respective Fields")
		public void user_enters_the_start_and_end_time_in_respective_fields() throws IOException {
			clickOnElment(s.appointmentBlock().getStartTime());
			clickOnElment(s.appointmentBlock().getChangeStartTime());
			userInput(s.appointmentBlock().getChangeStartTime(),ConfigirationHelper.getInstance().getStartTime());
			clickOnElment(s.appointmentBlock().getEndTime());
			clickOnElment(s.appointmentBlock().getChangeEndTime());
			userInput(s.appointmentBlock().getChangeEndTime(),ConfigirationHelper.getInstance().getEndTime());
		}
		@Then("User Select the Newly Created Service Type by Clicking the View All Types")
		public void user_select_the_newly_created_service_type_by_clicking_the_view_all_types() throws IOException {
			clickOnElment(s.appointmentBlock().getViewType());
			clickOnElment(s.appointmentBlock().getSelModalWindow());
			implicit(3000);
			action(s.appointmentBlock().getSelType());
			action(s.appointmentBlock().getCloseType());
			screenShot("Create Appointment Block");
		}
		@Then("User Clicks the Save Button")
		public void user_clicks_the_save_button() throws IOException {
			clickOnElment(s.appointmentBlock().getSaveSchedule());
			screenShot("Appointment Schedule");
			implicit(5000);
		}
		@Then("User Verify the Appointment Block Created for Selected Date in the Calendar Screen")
		public void user_verify_the_appointment_block_created_for_selected_date_in_the_calendar_screen() {
		//	verifyDisplayed(s.appointmentBlock().getVerifyAppointmentBlock());
			System.out.println();
		}

//Schedule Appointment
		
	
		@When("User Clicks Home Icon on the Top Left Page")
		public void user_clicks_home_icon_on_the_top_left_page() {
		   clickOnElment(s.scheduleAppointment().getHomeIconclick());
		}
		@Then("User Clicks the Find Patient Record")
		public void user_clicks_the_find_patient_record() {
			clickOnElment(s.scheduleAppointment().getFindPatientRecord());
		}
		@Then("User Search the Patient Record by Using Patient id")
		public void user_search_the_patient_record_by_using_patient_id() throws IOException {
			clickOnElment(s.scheduleAppointment().getSearchpatientID());
			userInput(s.scheduleAppointment().getSearchpatientID(), "Rajesh");
			screenShot("Search Patient");
			implicit(6000);
			
		}
		@Then("User Clicks the Required Patient Record")
		public void user_clicks_the_required_patient_record() {
			clickOnElment(s.scheduleAppointment().getPatientClick());
		}
		@Then("User Clicks the Schedule Appointments")
		public void user_clicks_the_schedule_appointments() {
			clickOnElment(s.scheduleAppointment().getScheduleAppointment());
			implicit(3000);
		}
		@Then("User Select the Service Type by View All Types")
		public void user_select_the_service_type_by_view_all_types() {
			clickOnElment(s.scheduleAppointment().getViewAllType());
			implicit(3000);
			clickOnElment(s.scheduleAppointment().getSelServiceType());
		}
		@Then("User Select the Time frame by Calender")
		public void user_select_the_time_frame_by_calender() {
			clickOnElment(s.scheduleAppointment().getTimeFrame());
			clickOnElment(s.scheduleAppointment().getSelDate());
			clickOnElment(s.scheduleAppointment().getTimeEndFrame());
			clickOnElment(s.scheduleAppointment().getSelEndDate());
			implicit(3000);
		}
		@Then("User Search the Created Appointment Block and Verifies It")
		public void user_search_the_created_appointment_block_and_verifies_it() throws IOException {
			clickOnElment(s.scheduleAppointment().getSearchAppointment());
			screenShot("Created Appointment Block");
		}
		@Then("User Select the Appointment Block and Click Next Button")
		public void user_select_the_appointment_block_and_click_next_button() {
			clickOnElment(s.scheduleAppointment().getSelectTimeBlock());
			clickOnElment(s.scheduleAppointment().getConfirmNextButton());
			implicit(3000);
		}
		@Then("User Verify the Appointment Details")
		public void user_verify_the_appointment_details() {
            verify(s.scheduleAppointment().getVerifyDate(), "07 Jun 2024, 3:00 PM - 6:00 PM ");
            verify(s.scheduleAppointment().getVerifyProvider(), "Jake Smith");
            verify(s.scheduleAppointment().getVerifyLocation(), "Registration Desk ");
            
			
		}
		@Then("User Clicks the Additional Notes and Clicks the Save Button")
		public void user_clicks_the_additional_notes_and_clicks_the_save_button() throws IOException {
			screenShot("Confirm Appointment Details");
			clickOnElment(s.scheduleAppointment().getAdditionalNotes());
			userInput(s.scheduleAppointment().getAdditionalNotes(),ConfigirationHelper.getInstance().getAdditionalNotes() );
			clickOnElment(s.scheduleAppointment().getSaveAppointment());
			implicit(3000);
		}


//start visit
		

		@When("User Verify the Appointment details in Patient details Page")
		public void user_verify_the_appointment_details_in_patient_details_page() {
			verifyDisplayed(s.startVisit().getVerifyAppointmentDetails());
		}
		@Then("User Clicks the Start Visit and Confirm the Visit")
		public void user_clicks_the_start_visit_and_confirm_the_visit() {
			clickOnElment(s.startVisit().getStartVisit());
			implicit(4000);
			clickOnElment(s.startVisit().getConfirmVisit());
			implicit(6000);
		}
		@Then("User Clicks the Attachment and complete the document upload process")
		public void user_clicks_the_attachment_and_complete_the_document_upload_process() throws IOException {
			screenShot("Start Visit");
			clickOnElment(s.startVisit().getAttachement());
			//userInput(s.startVisit().getDropFile(),".\\OpenMRS\\Attachment\\Test");
			clickOnElment(s.startVisit().getCaption());
			userInput(s.startVisit().getCaption(),ConfigirationHelper.getInstance().getCaption());
			clickOnElment(s.startVisit().getUploadFile());
			screenShot("File Attached");
			
		}
		@Then("User Click The Patient Details Page to Verify the Attachment")
		public void user_click_the_patient_details_page_to_verify_the_attachment() {
			clickOnElment(s.startVisit().getPatientDetails());
			implicit(3000);
		}
		@Then("User Verify the Recent Visit")
		public void user_verify_the_recent_visit() {
			verifyDisplayed(s.startVisit().getVerifyRecentVisit());
			
			implicit(6000);
		}

//end visit
		
		
		@When("User Clicks the End Visit and Confirm the End Visit")
		public void user_clicks_the_end_visit_and_confirm_the_end_visit() throws IOException {
			clickOnElment(s.endVisit().getEndVisit());
			screenShot("Confirm End Visit");
			clickOnElment(s.endVisit().getConfirmEndVisit());
			implicit(3000);
			
		}
		@Then("User Clicks the Delete Patient")
		public void user_clicks_the_delete_patient() {
			clickOnElment(s.endVisit().getDeletePatient());
		}
		@Then("User Provide the Reason and Confirm the Delete Patient")
		public void user_provide_the_reason_and_confirm_the_delete_patient() throws IOException {
			clickOnElment(s.endVisit().getDeleteReason());
			userInput(s.endVisit().getDeleteReason(), ConfigirationHelper.getInstance().getDeleteReason());
			screenShot("Delete Patient");
			clickOnElment(s.endVisit().getConfirmDeletePatient());
			implicit(4000);
		}
		@Then("User Verify the Patient Record by Deleted Patient Id")
		public void user_verify_the_patient_record_by_deleted_patient_id() {
			System.out.println();
		}
		@Then("User Clicks the Home Page")
		public void user_clicks_the_home_page() {
			clickOnElment(s.endVisit().getHomePage());
			implicit(3000);
		}
		@Then("User Clicks the  Appointment Scheduling and Verify the Appointment Scheduling page is Redirected")
		public void user_clicks_the_appointment_scheduling_and_verify_the_appointment_scheduling_page_is_redirected() {
			clickOnElment(s.endVisit().getAppointmentSchedl());
		}
		@Then("User Clicks the Manage Service Types")
		public void user_clicks_the_manage_service_types() {
			clickOnElment(s.endVisit().getManageType());
		   
		}
		@Then("User Find the newly Created service types and click delete icon")
		public void user_find_the_newly_created_service_types_and_click_delete_icon() throws IOException {
			clickOnElment(s.endVisit().getSelectPage());
			clickOnElment(s.endVisit().getDeleteServiceType());
			screenShot("Delete Service Type");
			clickOnElment(s.endVisit().getConfirmDeleteService());
		}
		




		




}
