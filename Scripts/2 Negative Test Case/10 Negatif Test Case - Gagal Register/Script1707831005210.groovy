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

Mobile.startApplication('E:\\BFLP IT Batch 9\\9. Bootcamp\\3. Final Project Mobile\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/1 Register/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/1 Register/android.widget.TextView - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/1 Register/android.widget.TextView - SIGN UP TODAY'), 0)

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText'), 'dharmayudhaputu', 0)

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (1)'), 'yudhatesting@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (2)'), 'Dharmayudha1', 0)

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (3)'), 'Dharmayudha1', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (4)'), 'Dharma', 0)

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (5)'), 'Yudha', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (6)'), '081353081122', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (7)'), 'Jakarta', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (8)'), 'Jalan Medan Merdeka No 5 Jakarta', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (9)'), 'Jakarta', 0)

Mobile.setText(findTestObject('Object Repository/1 Register/android.widget.EditText (10)'), '80582', 0)

Mobile.hideKeyboard()

Mobile.scrollToText('register')

Mobile.tap(findTestObject('Object Repository/1 Register/android.widget.Button - REGISTER'), 0)

Mobile.closeApplication()

