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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (1)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk/input_Senha_password (1)'), 
    'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk/button_Login (1)'))


WebUI.setViewPortSize(347, 703)

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/a_Incidente'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/a_OS (1)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/a_Dashboard_custom-dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/a_Alocao DEV Pack x T. Estimado x T.Real_cu_d34ef6'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/a_Dashboard (1)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de OS/a_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Dashboard de Incidentes/a_Pendentes para escalonamento'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pendentes para escalonamento/a_Pesquisar Incidentes'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/a_6'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/a_8'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/a_Consumo de recursos'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/span_Classificaes_navbar-toggler-icon'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/a_Consumo de recursos por projeto'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/button_Filtros'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Pesquisa de Incidentes/a_Alocao de recursos'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Alocao de recursos/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Alocao de recursos/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Alocao de recursos/a_Desempenho de Centro de custo'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/input'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/button_Pesquisar'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/a_Alocao DEV Pack x T. Estimado x T.Real'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/label_Horas do Pack'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/input_Pack_pack'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/a_Trabalhos'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/button_Classificaes_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/a_Mayara Luiza Moraes Normandia'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/svg_Classificaes_svg-inline--fa fa-bars fa-w-14'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/a_Classificaes'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/Page_Service Desk/Page_Service Desk/Page_Service Desk - Desempenho de Centro de Custo/button_Classificaes_menu-toggle'))

