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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (16)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (16)'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (16)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_OS (7)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Dashboard (7)'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input_Navegar para_numero (3)'), '240560')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/button_Navegar para_submit (2)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240560/a_Aes de Testes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240560/div_Recarregar_chat d-flex align-items mb-2_fcdeac'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240560/button_Excluir OS'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 240560/button_Confirmar (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Service Desk - OS 240560/li_Esta OS j possui aes de testes registrad_d5b274 (1)'), 
    0)

