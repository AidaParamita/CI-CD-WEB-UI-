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



class ShoppingCartSteps {

	@And("User click button Bayar")
	def clickButtonBayar() {
		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Pay_The_Items/Page_frontend-web/button_Bayar'))
	}
	
	@And("	User in homepage succesfully")
	def homepageAfterLogin() {
//WebUI.click(findTestObject('Object Repository/Auth/Registrasi/Page_frontend-web/div_AltaShop0'))
	}

	@Then("User can reduce items")
	def reduceItems() {
		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Reduce_Items/Page_frontend-web/button_-'))

		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Reduce_Items/Page_frontend-web/div_AltaShop2'))

		WebUI.closeBrowser()
	}

	@Then("User can add items")
	def addItems() {

		//		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/button_1'))

		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/div_AltaShop1'))

		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/button_'))

		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/button_'))

		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/div_AltaShop1'))


		//		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/btn_add'))

		//		WebUI.doubleClick(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/button_'))
		//
		//		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/button_'))
		//
		//		WebUI.doubleClick(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/button_'))

		//		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Add_Items/Page_frontend-web/div_AltaShop3'))
		//
		//		WebUI.closeBrowser()
	}

	@Then("user go to login page")
	def goLoginItems() {
		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Pay_The_Items/Page_frontend-web/div_AltaShop3'))

		WebUI.click(findTestObject('Object Repository/Shopping_Cart/Pay_The_Items/Page_frontend-web/div_Login'))

		WebUI.closeBrowser()
	}
}
