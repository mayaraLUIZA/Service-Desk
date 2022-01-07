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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://172.16.1.21:6200/pt/account/login?returnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName'), 'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/div_Navegar para Incidentes Pendentes Novo _ca4866'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Incidente'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_OS'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Dashboard'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/select_ADM - Administrao, financeiro e RH A_fb46d5'), 
    'PRD', true)

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input_Selecionar vrios profissionais_multip_a2b070'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/th'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/input'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/button_Pesquisar'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_3'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_4'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_5'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_6'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_7'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_8'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_9'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a_'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a__1'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Pesquisa de OS/a__1_2'))

WebUI.closeBrowser()
