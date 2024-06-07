Feature: Creating Patient id And Scheduling Appointment Using OpenMRS

Scenario: User Login Into This Application
Given User Launch The OpenMRS Appilication
When User Enters Username and password
Then User Select The Resgistration Desk and click on Login
And  User Verify dashboard

Scenario: User Creates a New Register for a Patient and Verify Record
When User Click on Register a patient menu.
Then User Enters the  Patient Name,Gender,Birthdate,Address and Phone number
Then User Enters the Relation Type and Doctor Name
Then User verify the  given  Name,  Gender,  Birthdate, Address and Phone number
Then User Clicks the Confirm Button
And  User verify the Patient details page and age is calculated correctly Based On Input Given

Scenario: User Creates a New Service Type
When User Clicks the Home icon and Verify the page is redirected
Then User Clicks the Appointment  Scheduling and  Verify the page is redirected
Then User Clicks Manage Service Types
Then User Clicks the New service type
Then User Enters the Name, Duration and Description in Service Type
Then User Clicks Save Button 
And  User verifies the added Service Type in the table 

Scenario: User Creates a Appointment Block
When User Clicks Appointment Scheduling on the Top Left Page
Then User Clicks the Manage  Provider  Schedules and Verify the page is redirected
Then User Select the Current Date in the Calendar
Then User Verify the Create Appointment Block page is redirected
Then User Enters the Provider Name and Verify Entered Date
Then User Enters the Start and End Time in Respective Fields 
Then User Select the Newly Created Service Type by Clicking the View All Types
Then User Clicks the Save Button 
And  User Verify the Appointment Block Created for Selected Date in the Calendar Screen

Scenario: User Schedule Appointment for patient
When User Clicks Home Icon on the Top Left Page
Then User Clicks the Find Patient Record
Then User Search the Patient Record by Using Patient id
Then User Clicks the Required Patient Record
Then User Clicks the Schedule Appointments
Then User Select the Service Type by View All Types
Then User Select the Time frame by Calender
Then User Search the Created Appointment Block and Verifies It
Then User Select the Appointment Block and Click Next Button
Then User Verify the Appointment Details
And  User Clicks the Additional Notes and Clicks the Save Button

Scenario: User Start the Visit
When User Verify the Appointment details in Patient details Page
Then User Clicks the Start Visit and Confirm the Visit
Then User Clicks the Attachment and complete the document upload process
Then User Click The Patient Details Page to Verify the Attachment
And  User Verify the Recent Visit

Scenario: User End the Visit and Delete Record
When User Clicks the End Visit and Confirm the End Visit
Then User Clicks the Delete Patient 
Then User Provide the Reason and Confirm the Delete Patient
Then User Verify the Patient Record by Deleted Patient Id 
Then User Clicks the Home Page
Then User Clicks the  Appointment Scheduling and Verify the Appointment Scheduling page is Redirected
Then User Clicks the Manage Service Types
And User Find the newly Created service types and click delete icon 

 












