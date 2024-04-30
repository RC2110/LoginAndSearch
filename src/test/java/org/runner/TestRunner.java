package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Reports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="json:target\\loginsearch.json",glue="org.stepdefinitions", features="src\\test\\resources")
public class TestRunner {
	
	@AfterClass
	public static void createReport() {
		Reports.generateJVMReport(Reports.getProjectPath()+"\\target\\loginsearch.json");

	}

}
