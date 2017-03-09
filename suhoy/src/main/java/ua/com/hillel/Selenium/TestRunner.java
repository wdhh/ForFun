package ua.com.hillel.Selenium;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by dreasty on 21.12.16.
 */

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(GoogleTest.class);
        System.out.println("Total number of tests: "+ result.getRunCount());
        System.out.println("Total number of tests failed: "+ result.getFailureCount());

        for (Failure failure : result.getFailures()){
            System.out.println(failure.getMessage());
        }
        System.out.println(result.wasSuccessful());
    }
}
