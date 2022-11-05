import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')

WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Email_input-18'), 'cat@gmail.com')

WebUI.setText(findTestObject('Object Repository/Auth/Login/Page_frontend-web/input_Password_input-21'), 'cataja')

WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/btn_lgn'))

WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_record not found'))

WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_record not found'))

WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/i_Login_v-icon notranslate v-alert__icon fa_862a04'))

WebUI.click(findTestObject('Object Repository/Auth/Login/Page_frontend-web/div_record not found_v-alert__border v-aler_a4fc84'))