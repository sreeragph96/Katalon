import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Bugiffy/TC_001_Login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/div_Create new project'))

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/input__vmName'), 'New ProjectF')

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/input__ipAddress'), 
    'New Description')

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/div_Bug'))

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/input__vmName_1'), 
    'xye')

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/button_Save'))

//WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/h6_New Project'), 
//    'New Project')
//WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/h6_New Project'))
List<WebElement> projectname = DriverFactory.getWebDriver().findElements(By.xpath('//h6[@class=\'mb-0 text-sm author_name cursor-pointer\']'))

List<WebElement> Descrption = DriverFactory.getWebDriver().findElements(By.xpath('//td[3]'))

List<WebElement> ProjectManager = DriverFactory.getWebDriver().findElements(By.xpath('//td[4]'))

List<WebElement> Date = DriverFactory.getWebDriver().findElements(By.xpath('//td[5]'))

for (WebElement e : projectname) {
    String text = e.getText()

    println(text)

    String Descri = projectname.indexOf(e)

    String ProManager = ProjectManager.indexOf(e)

    String Date1 = Date.indexOf(e)

    if (((text.contains('New ProjectF') && Descri.contains('New Description')) && ProManager.contains('SREERAG')) && Date1.contains(
        '10-August-2023')) {
        flag = true

        println(' if akam ' + text)

        e.click()

        break
    }
}

WebUI.verifyTextPresent('New ProjectF', true)

//WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/div_New Project'), 
//    'New ProjectF')
WebUI.closeBrowser()

