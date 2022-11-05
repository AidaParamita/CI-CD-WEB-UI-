import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AuthSteps {

	@Given("I open browser regis")
	def openRegis() {
		println('\nopen web')
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	}

	@Given("I open browser login")
	def openLogin() {
		println('\nopen web')
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("I fill correct fullname (.*) and email (.*) and password (.*)")
	def correctRegis(String fullname, String email, String password) {
		println('\nfill field')
		println('\n Full Name : '+fullname)
		println('\nEmail :'+email)
		println('\nPassword : '+password)

		WebUI.setText(findTestObject('Object Repository/Auth/Registrasi/Page_frontend-web/input_Nama Lengkap_input-18'), 'Taylor4')

		WebUI.setText(findTestObject('Object Repository/Auth/Registrasi/Page_frontend-web/input_Email_input-21'), 'taylor4@gmail.com')

		WebUI.setText(findTestObject('Object Repository/Auth/Registrasi/Page_frontend-web/input_Password_input-24'), 'taylor4aja')
	}

	@When("I fill correct email (.*) and password (.*)")
	def correctLogin(String email, String password) {
		println('\nfill field')
		println('\nEmail :'+email)
		println('\nPassword : '+password)

		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_AltaShop0'))

		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Email_input-18'), 'olaf@gmail.com')

		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Password_input-21'), 'olafaja')

		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_AltaShop0'))
		//
		//		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Email_input-18'), 'olaf@gmail.com')
		//
		//		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Password_input-21'), 'olafaja')

		//		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Email_input-18'), 'olaf@gmail.com')
		//
		//		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Password_input-21'), 'olafaja')

		//		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Email_input-18'), 'cat@gmail.com')
		//
		//		WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Password_input-21'), 'cataja')
	}

	@And("I click button register")
	def clickRegis() {
		println('\n click button')
		WebUI.click(findTestObject('Object Repository/Auth/Registrasi/Page_frontend-web/span_Register'))
		WebUI.click(findTestObject('Object Repository/Auth/Registrasi/Page_frontend-web/button_Register'))
	}

	@And("I click button login")
	def clicklogin() {
//		println('\n click button')

		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/btn_lgn'))

		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/button_Login'))


		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/login_button_txt'))
		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/span_Login'))
		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/button_Login'))

		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_record not found'))
		//
		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_record not found'))
	}

	@Then("I can register")
	def sucRegis() {
		println('\n Succesfully Register')
		WebUI.click(findTestObject('Object Repository/Auth/Registrasi/Page_frontend-web/div_AltaShop0'))
		WebUI.closeBrowser()
	}


	@Then("I can login")
	def sucLogin() {
		println('\n Succesfully Register')

//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_AltaShop0'))

		WebUI.closeBrowser()


		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_AltaShop0'))
		//		WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_AltaShop0'))
		//		WebUI.closeBrowser()
	}
}