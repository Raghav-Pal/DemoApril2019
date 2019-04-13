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

WebUI.navigateToUrl('https://www.w3schools.com/html/html5_draganddrop.asp')

WebUI.click(findTestObject('Object Repository/Page_HTML5 Drag and Drop/img_Next _drag1'))

WebUI.click(findTestObject('Object Repository/Page_HTML5 Drag and Drop/div_Next _div1'))

WebUI.click(findTestObject('Object Repository/Page_HTML5 Drag and Drop/div_Next _div2'))

WebUI.click(findTestObject('Object Repository/Page_HTML5 Drag and Drop/DragNDrop'))

WebUI.click(findTestObject('Object Repository/Page_HTML5 Drag and Drop/img_Next _drag1'))

WebUI.click(findTestObject('Object Repository/Page_HTML5 Drag and Drop/div_Next _div2'))

WebUI.dragAndDropToObject(findTestObject('Object Repository/Page_HTML5 Drag and Drop/img_Next _drag1'), findTestObject('Object Repository/Page_HTML5 Drag and Drop/div_Next _div2'))

WebUI.closeBrowser()

