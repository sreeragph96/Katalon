import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Bugiffy/TC_001_Login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/span_Choose Project'))

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/li_Create Project'))

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/input__vmName'), 'Test katalonD')

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/input__ipAddress'), 
    'Test Description')

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/img__img-fluid'))

WebUI.setText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/input__vmName_1'), 
    'aab')

WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/button_Save'))

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

    if (((text.equals('Test katalonC') && Descri.equals('Test Description')) && ProManager.equals('SREERAG')) && Date1.equals(
        '04-August-2023')) {
        flag = true

        e.click()

        break
    }
}

//WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/h6_Test Katalon'), 
//  'Test KatalonB')
//WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/td_Test Description'), 
//   'Test Description')
//WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/td_09-August-2023'), 
//'09-August-2023')
//WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/td_SREERAG'), 
//  'SREERAG')
//WebUI.click(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/h6_Test Katalon'))
//WebUI.verifyElementText(findTestObject('Object Repository/Bugiffy_Objects/Page_React After Login/Page_React App/div_Test Katalon'), 
 //   'Test KatalonD')

