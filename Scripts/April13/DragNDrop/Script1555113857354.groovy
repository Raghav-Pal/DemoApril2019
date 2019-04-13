import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://executeautomation.com/demosite/Login.html')

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/input_Login_Login'))

WebUI.click(findTestObject('Object Repository/Page_Execute Automation/a_Drag and Drop'))

WebUI.click(findTestObject('Object Repository/Page_/li_Drag Item 2'))

WebUI.click(findTestObject('Object Repository/Page_/li_Drag Item 3'))

WebUI.click(findTestObject('Object Repository/Page_/li_Drag Item 5'))

WebUI.click(findTestObject('Object Repository/Page_/li_Drag Item 1'))

WebUI.click(findTestObject('Object Repository/Page_/li_Drag Item 4'))

WebUI.dragAndDropToObject(findTestObject('Object Repository/Page_/li_Drag Item 1'), findTestObject('Object Repository/Page_/li_Drag Item 4'))

WebUI.closeBrowser()

