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

WebUI.callTestCase(findTestCase('Bugiffy/TC_001_Login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/h6_Test Katalon'))

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/span_Your Team'))

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/li_Invite People to Test Katalon'))

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/input_Email Id_form-control'), 
    'shyam.santhosh@xilligence.com')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/select_Choose OptionUserProject AdminProject Lead'), 
//    'Choose Option', true)
WebUI.selectOptionByValue(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/select_Choose OptionUserProject AdminProject Lead'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/button_Invite'))

WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/div_Cannot invite existing members'), 
    'Cannot invite existing members')

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/button_Cancel'))

WebUI.closeBrowser()

