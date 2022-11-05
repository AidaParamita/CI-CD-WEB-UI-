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



class HomepageSteps {

	@When("User in homepage")
	def homepage() {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@And("User select product")
	def selectProduct() {
	}

	@And("User click button Beli")
	def clickButtonBeli() {
		WebUI.click(findTestObject('Object Repository/Homepage/Buy_Items/Page_frontend-web/button_Beli'))
	}


	@And("User choose category")
	def chooseCategory() {
	}

	@And("click category")
	def clickCategory() {
		WebUI.click(findTestObject('Object Repository/Homepage/Select_Category/Page_frontend-web/div_Sony PS5'))
		WebUI.click(findTestObject('Object Repository/Homepage/Select_Category/Page_frontend-web/div_play has no limits'))

		WebUI.click(findTestObject('Object Repository/Homepage/Select_Category/Page_frontend-web/div_Sony PS5'))
	}
	

	@And("User click button Detail")
	def clickButtonDetail() {
		WebUI.click(findTestObject('Object Repository/Homepage/View_Detail_Items/Page_frontend-web/button_Detail'))
	}

	@Then("click icon Keranjang to see product")
	def clickKeranjang() {

		WebUI.click(findTestObject('Object Repository/Homepage/Buy_Items/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
		
		WebUI.click(findTestObject('Object Repository/Homepage/Buy_Items/Page_frontend-web/div_AltaShop1'))

//		WebUI.closeBrowser()
	}

	@Then("User can see product")
	def seeProduct() {
		WebUI.click(findTestObject('Object Repository/Homepage/Select_Category/Page_frontend-web/div_play has no limits'))

		WebUI.click(findTestObject('Object Repository/Homepage/Select_Category/Page_frontend-web/div_Sony PS5'))
	}

	@Then("User can see detail product")
	def seeDetailProduct() {

		WebUI.click(findTestObject('Object Repository/Homepage/View_Detail_Items/Page_frontend-web/div_AltaShop0'))

		WebUI.closeBrowser()
	}
}