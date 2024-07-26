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

WebUI.setText(findTestObject('Transaksi/input_nama pemesan'), 'Customer Retail')

WebUI.setText(findTestObject('Transaksi/input_handphone pemesan'), '081678901234')

WebUI.click(findTestObject('Transaksi/p_debit'))

WebUI.click(findTestObject('Transaksi/p_bca'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Transaksi/input_nomor ref'), 'DEBIT-2024-0001-ABCD')

WebUI.click(findTestObject('Transaksi/button_cetak receipt'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Transaksi/p_menunggu pembayaran'), 0)

WebUI.verifyElementPresent(findTestObject('Transaksi/p_nomor pesanan'), 0)

WebUI.verifyElementPresent(findTestObject('Transaksi/button_cetak struk'), 0)

