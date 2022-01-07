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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName'), 'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Incidente'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Pesquisar Incidentes'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/input_Profissional_typeahead-profissional'), 
    'talita')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/ngb-highlight_TMM - Talita Molina Mantovani'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/input_Profissional_typeahead-profissional'), 
    'TMM - Talita Molina Mantovani')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/input_Selecionar profissionais pelo centro _f2596f'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/select_ADM - Administrao, financeiro e RH A_fb46d5'), 
    'SPT', true)

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/div_Selecione os profissionais_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/div_Selecione os profissionais_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/input'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/button_Pesquisar'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de Incidentes/a_2'))

