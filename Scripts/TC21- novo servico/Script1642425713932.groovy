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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (10)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (10)'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (10)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Gerenciamento (4)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Servios'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_Adicionar Servio'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Cdigo_cdItemrs'), '006')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Descrio_descricaoItemrs'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Descrio_descricaoItemrs'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Descrio_descricaoItemrs'), 
    'Novo serviço')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Grupo de servio_typeahead-grupo'), 
    ' ')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_VDA - VendasFaturamento'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Grupo de servio_typeahead-grupo'), 
    'VDA - Vendas/Faturamento                                ')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/div_Classificao'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Classificao_typeahead-classificacao'), 
    ' ')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/ngb-highlight_undefined - Anlise de context_b36efe'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Classificao_typeahead-classificacao'), 
    'undefined - Análise de contexto e debug             ')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_Salvar (4)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_Salvar (4)'))

