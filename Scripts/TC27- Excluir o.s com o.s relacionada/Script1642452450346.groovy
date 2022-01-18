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

WebUI.navigateToUrl('http://172.16.1.21:6200/pt/account/login?returnUrl=%2Fhelpdesk%2Fincidente%2Fdashboard')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (18)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (18)'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (18)'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_OS (9)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Dashboard (9)'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input_Navegar para_numero (5)'), '240566')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/svg_Navegar para_svg-inline--fa fa-chevron-_a27964 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240566/button_OS relacionadas'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Service Desk - OS 240566/span_240559 - Dataplace.SFA.Mobile.01'), 
    '240559 - Dataplace.SFA.Mobile.01')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240566/button_'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Service Desk - OS 240566/button_Excluir OS'), 0)

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240566/button_Excluir OS'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240566/button_Confirmar'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Service Desk - OS 240566/li_Esta OS j possui outras OSs vinculadas P_d3c09c'), 
    'Esta OS já possui outras OSs vinculadas! Processo cancelado!')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Service Desk - OS 240566/div_Desculpe, algo no deu certoEsta OS j po_e682fb'), 
    0)
WebUI.closeBrowser()
