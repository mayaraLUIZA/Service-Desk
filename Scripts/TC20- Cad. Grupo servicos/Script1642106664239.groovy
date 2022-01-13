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

WebUI.navigateToUrl('http://172.16.1.21:6200/pt/')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/form_LoginNome de usurio ou endereo de emai_c79972 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (8)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (8)'), 'yygGFEFk8bXTd/SxOMaLrQ==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (8)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk/div_LoginDesculpe, algo no deu certoUsurio _03e70d'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (8)'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (8)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Gerenciamento (3)'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Grupos de servio'))

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_Adicionar Grupo'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Cdigo_cdGrupors'), 'ALH')

WebUI.setText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/input_Descrio_dsGrupors'), 'Alinhamento')

WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/button_Salvar (3)'))

