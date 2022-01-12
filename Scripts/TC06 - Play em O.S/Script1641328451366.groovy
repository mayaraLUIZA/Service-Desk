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

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (1)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/a_Esqueci minha senha (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_E-mail_form-control col-md-12 ng-unto_5b3cff (1)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Redefinir senha (1)'))

WebUI.click(findTestObject('Object Repository/Page_outlooks - Pesquisa Google/h3_Outlook  free personal email and calenda_67a00c'))

WebUI.click(findTestObject('Object Repository/Page_Outlook  calendrio e email pessoal gra_51454d/a_Entrar'))

WebUI.setText(findTestObject('Object Repository/Page_Entrar na conta da Microsoft/input_Entrar_loginfmt'), 'mayara.moraes@dataplace.com.br')

WebUI.click(findTestObject('Object Repository/Page_Entrar na conta da Microsoft/input_Crie uma_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Entre em Outlook/input_Insira a senha_passwd'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Entre em Outlook/input_Esqueci minha senha_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Entre em Outlook/input_Esqueci minha senha_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Correio  Mayara Luiza Moraes Normandia_d2e07c/span_Dataplace Suporte Corporativo'))

WebUI.click(findTestObject('Object Repository/Page_Correio  Mayara Luiza Moraes Normandia_d2e07c/a_Redefinir senha'))

WebUI.switchToWindowTitle('Service Desk')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Nova senha_password'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Confirme a nova senha_confirmPassword'), 
    'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Enviar'))

WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName (1)'), 
    'mayara.moraes@dataplace.com.br')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password (1)'), 'yygGFEFk8bWvHiKQZ1SyaA==')

WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/div_Login realizado com sucesso (1)'), 
    'Login realizado com sucesso!')

