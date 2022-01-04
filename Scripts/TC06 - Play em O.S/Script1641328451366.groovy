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

WebUI.navigateToUrl('http://172.16.1.21:6200/pt/helpdesk/')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName'), 'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_OS'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input_Selecionar vrios profissionais_multip_a2b070'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/select_ADM - Administrao, financeiro e RH A_fb46d5'), 
    'PRD', true)

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/button_Pesquisar'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/span_OS 237535'), 'OS 237535')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/span_OS 237535'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 237535/div_Iniciar atividade'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - OS 237535/input_Trabalho_typeahead-trabalho'), 'tst')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 237535/ngb-highlight_TST - Avaliaovalidao do produto'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - OS 237535/input_Trabalho_typeahead-trabalho'), 'TST - Avaliação/validação do produto')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - OS 237535/button_Iniciar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Service Desk - OS 237535/span_OS 237535'), 0)

