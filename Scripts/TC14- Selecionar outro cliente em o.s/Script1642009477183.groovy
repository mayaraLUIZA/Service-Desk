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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk/input_Nome de usurio ou endereo de email_userName'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk/input_Senha_password'), 
    'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - Dashboard de Incidentes/a_OS'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - Dashboard de Incidentes/a_Dashboard'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - Pesquisa de OS/input_Navegar para_numero'), 
    '239555')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - Pesquisa de OS/button_Navegar para_submit'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/input_Cliente_typeahead-cliente'), 
    'data')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/ngb-highlight_0200000 - DP INFORMTICA LTDA _3f1b14'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/input_Cliente_typeahead-cliente'), 
    '0200000 - DP INFORMÁTICA LTDA - EPP - DATAPLACE')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/button_No'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/input_Centro de Alocao_typeahead-centroalocacao'), 
    'dp')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/ngb-highlight_0200000 - DP INFORMTICA LTDA _3f1b14'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/input_Centro de Alocao_typeahead-centroalocacao'), 
    '0200000 - DP INFORMÁTICA LTDA - EPP - DATAPLACE')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/Page_Service Desk - OS 239555/svg_Propriedade do Cliente_svg-inline--fa f_8427f2'))

