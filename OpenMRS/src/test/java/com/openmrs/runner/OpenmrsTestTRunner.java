package com.openmrs.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.openmrs.OpenmrsBase;
import com.properties.ConfigirationHelper;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\openmrs\\feature\\Openmrs.feature",
glue ="com.openmrs.stepDefinition",
//tags= "@TaggedHooks",
monochrome = true, dryRun =false, publish = true,
plugin= {"pretty","html:Report/Cucumber_Report"})

public class OpenmrsTestTRunner extends OpenmrsBase {
	
	@BeforeClass
	public static void set_up() throws IOException {
    	driver = new ChromeDriver();
	}
	@AfterClass
	public static void tear_Down() {
		//quit();
	}

}
