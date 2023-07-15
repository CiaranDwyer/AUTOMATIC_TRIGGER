package com.codewithciaran.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener extends SCREENSHOTS implements ITestListener {


    /* CALL THE EXTENT REPORT OBJECT AND ADD MY TESTS TO IT */
    ExtentReports reports = create_Extent_Report.getExtentReport();
    ExtentTest myTests;

    @Override
    public void onTestStart(ITestResult result) {
        String startTest = result.getMethod().getMethodName();
        myTests = reports.createTest(startTest);
        myTests.log(Status.INFO, "Test Name : " +startTest+ "has started");
    }


    @Override
    public void onTestSuccess(ITestResult result) {

        String testName = result.getMethod().getMethodName();
        myTests.log(Status.PASS, testName + "got successfully executed");



        /*
        String PASSED_TEST = result.getMethod().getMethodName();
        String DIRECTORY = "./PASSED_TESTS/";

                    myTests = reports.createTest(PASSED_TEST).log(Status.PASS, " THIS TEST HAS PASSED")
                    .addScreenCaptureFromPath(DIRECTORY + PASSED_TEST + ".png")
                    .pass(MediaEntityBuilder.createScreenCaptureFromPath(DIRECTORY + PASSED_TEST + ".png").build()); */
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onFinish(ITestContext context) {
        reports.flush();
    }
}
