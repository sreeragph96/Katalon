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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.bugiffy.com/')

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React App/a_Login'))

WebUI.scrollToElement(findTestObject('Object Repository/Bugiffy_Objects/Page_React App/input_User Name_form-control'), 5)

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React App/input_User Name_form-control'), 'sreerag@xilligence.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bugiffy_Objects/Page_React App/input_Password_form-control'), 'yA741TD0bPZUIG4bnov04Q==')

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React App/button_Sign in'))

WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React App/div_Invalid Username Password'), 
    'Invalid Username/ Password')

WebUI.closeBrowser()

