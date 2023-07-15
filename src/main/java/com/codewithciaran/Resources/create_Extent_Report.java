package com.codewithciaran.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class create_Extent_Report {


    /* MAKE STATIC SO I DON'T NEED TO CREATE AN OBJECT OF THE CLASS TO ACCESS METHOD */
    public static ExtentReports getExtentReport(){

        String reportPath = System.getProperty("user.dir") + "/src/Extent_Reports/Report_Index.html";

        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(reportPath);
        extentSparkReporter.config().setReportName("ZOOM - REPORT NAME");
        extentSparkReporter.config().setDocumentTitle("ZOOM DOCUMENT TITLE");

        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        extentReports.setSystemInfo("CIARAN DWYER", "SYSTEM INFO");
        return extentReports;
    }
}
