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



class TransactionSteps {

	@Then("User filtering product with click Product")
	def clickProduct() {
		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Product/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174'))

		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Product/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174_1'))

		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Product/Page_frontend-web/span_Produk'))

		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Product/Page_frontend-web/span_Produk'))
	}

	@Then("transaction will filtering by product")
	def viewUserTransactionByProduct() {
		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Product/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174'))

		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Product/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174_1'))
	}

	//	@Then("user go to login page")
	//	def viewUserTransaction() {
	//		}

	@Then("User filtering with row")
	def filterWithRow() {
		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Row/Page_frontend-web/div_10'))

		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Row/Page_frontend-web/div_5'))

		WebUI.click(findTestObject('Object Repository/Transaction/Filtering_List_Transaction_By_Row/Page_frontend-web/h1_Transactions'))
	}
}