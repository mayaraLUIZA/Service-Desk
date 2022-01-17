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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (14)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (14)'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (14)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_OS (5)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Dashboard (5)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/select_ADM - Administrao, financeiro e RH A_fb46d5 (1)'), 
    'PRD', true)

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/button_Pesquisar (3)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/span_OS 238535'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/a_Aes Gerais'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/a_Atividades'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/a_Profissionais'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/a_Projeto'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/a_Aes de Testes'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/button_OS relacionadas'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/ngb-modal-window_OS RelacionadasOS Origem  _0cfffb'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/button_Excluir OS'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 238535/button_Confirmar'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Service Desk - OS 238535/li_Esta OS j possui aes registradas Process_4b379c'), 
    'Esta OS já possui ações registradas! Processo cancelado!')

