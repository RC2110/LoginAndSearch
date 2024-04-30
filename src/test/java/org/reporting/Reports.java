package org.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Configuration;

public class Reports {
	
	public static String getProjectPath() {
		String property = System.getProperty("user.dir");
		return property;
	}
	
	public static void generateJVMReport(String jsonFile) {
		File reportDir = new File(getProjectPath()+"\\target\\");
		
		Configuration config = new Configuration(reportDir, "LoginAndSearchFeature");
		
		config.addClassifications("Platform", "Windowa");
		config.addClassifications("Version", "8");
		config.addClassifications("Build", "2.3.2");
		config.addClassifications("author", "greens");
		config.addClassifications("sprint", "36");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder= new ReportBuilder(jsonFiles, config);
		builder.generateReports();

	}

}