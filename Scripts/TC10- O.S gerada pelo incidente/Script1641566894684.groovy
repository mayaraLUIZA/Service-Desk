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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk/input_Nome de usurio ou endereo de email_userName'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk/input_Senha_password'), 
    'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Dashboard de Incidentes/a_Incidente'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Dashboard de Incidentes/a_Pendentes para escalonamento'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Pendentes para escalonamento/path'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Pendentes para escalonamento/a_Editar'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/button_Gerar OS'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/select_ADM-Administrao, financeiro e RHALFA_6cb2f0'), 
    'PRD', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/select_No conformidades, correesDocumentaoR_5a572d'), 
    'MEL', true)

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/input_MduloProjeto_typeahead-projeto'), 
    'service')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/ngb-highlight_SERVICE_DESK - Portal Datapla_cee52f'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/input_MduloProjeto_typeahead-projeto'), 
    'SERVICE_DESK - Portal Dataplace Service Desk')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/input_Verso_versao'), 
    'v1.1.5')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/input_Pack_pack'), 
    '2022')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/button_Gerar'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - Incidente/a_OS 239555'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Alocao de recursos/Page_Service Desk - OS 239555/a_OS'))

