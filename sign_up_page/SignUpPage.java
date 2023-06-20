package screen;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class SignUpPage extends BaseClass {
	public  RemoteWebDriver driver;
	public SignUpPage(RemoteWebDriver driver) {
        this.driver=driver;
        
    }
	
	public SignUpPage enterFirstName() throws IOException {
		try {
			driver.findElement(By.id("firstname")).sendKeys("Peterson");
			reportStep("FirstName is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("FirstName is not entered successfully"+e, "fail");

		}
		return this;
		
		
	}
	
	public SignUpPage enterLastName() throws IOException {
		try {
			driver.findElement(By.id("lastname")).sendKeys("Harry");
			reportStep("LastName is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("LastName is not entered successfully"+e, "fail");

		}
		return this;
		
		
	}
	public SignUpPage enterEmailId() throws IOException {
		try {
			driver.findElement(By.id("emailid")).sendKeys("peterson.harry@gmail.com");
			reportStep("Email Id is entered successfully", "pass");
		} catch (Exception e) {
			reportStep("Email Id is not entered successfully"+e, "fail");

		}
		return this;
		
		
	}
	public SignUpPage enterPassword() throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys("Peterson99!");
			reportStep("password  is entered successfully", "pass");
		} catch (Exception e) {

			reportStep("password is not entered successfully"+e, "fail");
		}
		return this;
	
	}
	
	public SignUpPage enterConfirmPassword() throws IOException {
		try {
			driver.findElement(By.id("confirmpassword")).sendKeys("peter");
			reportStep("password  is entered successfully", "pass");
		} catch (Exception e) {

			reportStep("password is not entered successfully"+e, "fail");
		}
		return this;
	
	}
	public SignUpPage clickRadioButton() throws IOException{
		try {
			driver.findElement(By.className("decorativeSubmit")).click();
			reportStep("Radio button is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("Radio button is not clicked successfully"+e, "fail");
		}
		return this;
		
		
	}

	public SignUpPage clickSignUpButton() throws IOException{
		try {
			driver.findElement(By.id("signupbutton")).click();
			reportStep("login button is clicked successfully", "pass");
		} catch (Exception e) {
			reportStep("login button is not clicked successfully"+e, "fail");
		}
		return this;
		
		
	}


}
