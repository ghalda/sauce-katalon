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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Pages/Login Page/input-user-name'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Pages/Login Page/input-password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Pages/Login Page/login-button'))

WebUI.click(findTestObject('Object Repository/Pages/List Product Page/button-add-to-cart'))

WebUI.click(findTestObject('Object Repository/Pages/List Product Page/cart-icon'))

WebUI.click(findTestObject('Object Repository/Pages/Cart Page/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Pages/Checkout Info Page/input-firstName'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Object Repository/Pages/Checkout Info Page/input-lastName'), GlobalVariable.lastName)

WebUI.setText(findTestObject('Object Repository/Pages/Checkout Info Page/input-postalCode'), GlobalVariable.postalCode)

WebUI.click(findTestObject('Object Repository/Pages/Checkout Info Page/buttom-continue-checkout'))

WebUI.click(findTestObject('Object Repository/Pages/Checkout Preview Page/button-finish'))

WebUI.closeBrowser()

