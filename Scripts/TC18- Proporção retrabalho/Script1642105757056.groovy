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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (5)'), 
    'mayara.moraes@dataplac.eocm.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (5)'), 'v775zEbZJQXofpwpFHZhbw==')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (5)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/app-account-root_LoginNome de usurio ou end_c25f7d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (5)'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (5)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Anlises (4)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Proporcao Retrabalho STS (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/select_Encerramento sem execuo  Projeto fut_5fa042'), 
    '6: 12', true)

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Clula P (QA e Authoring) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Pack_typeahead-pack (1)'), 
    '2020.R3')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Profissional da OS_typeahead-profissional'), 
    'ARNA')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_ARJ - Arnaldo Junior'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Profissional da OS_typeahead-profissional'), 
    'ARJ - Arnaldo Junior')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/h6_Arnaldo Junior'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_Pesquisar (1)'))

