package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import screen.SignUpPage;

public class RunnerClass extends BaseClass {
	@BeforeTest
	public void SetUp() {

		testName="Fleet Studio- Assessment(Sign_up page)";
		testDescription="Automate the SignUpPage";
		testCategory="Smoketest";
		testAuthor="Bhuvanesh";
	}
	@Test
	public void testRun() throws IOException {

		SignUpPage sp= new SignUpPage(driver);
		sp.enterFirstName()
		.enterLastName()
		.enterEmailId()
		.enterPassword()
		.enterConfirmPassword()
		.clickRadioButton()
		.clickSignUpButton();
	}

}
