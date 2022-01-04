package mypack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {
	
	
	@Keyword
	public void getLogin() {
	int a = 2;
	for(int i=0; i<2;i++) {
	if(a == 2) {
	WebUI.navigateToUrl('http://172.16.1.21:6200/pt/helpdesk/')
	
	WebUI.setText(findTestObject('Object Repository/Page_Service Desk/input_Nome de usurio ou endereo de email_userName'), 'mayara.moraes@dataplace.com.br')
	
	WebUI.setEncryptedText(findTestObject('Object Repository/Page_Service Desk/input_Senha_password'), 'yygGFEFk8bWvHiKQZ1SyaA==')
	
	WebUI.click(findTestObject('Object Repository/Page_Service Desk/button_Login'))
	
	WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/img'))
	
	WebUI.click(findTestObject('Object Repository/Page_Service Desk - Dashboard de Incidentes/a_Sair'))
	
	}else {
		System.out.println("A condição é falsa")
	}
}
}
}
