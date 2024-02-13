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

// Definisikan username yang valid
def validUsername = username

// Mengganti nilai 'username' dan 'password' dengan nilai yang sesuai
def username = username

def password = password

// Mulai aplikasi
Mobile.startApplication('E:\\BFLP IT Batch 9\\9. Bootcamp\\3. Final Project Mobile\\Advantage+demo+3.2.apk', true)

// Mengetuk elemen untuk masuk
Mobile.tap(findTestObject('Object Repository/2 Login dan Checkout/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/2 Login dan Checkout/android.widget.LinearLayout'), 0)

// Memasukkan username
Mobile.setText(findTestObject('Object Repository/2 Login dan Checkout/android.widget.EditText'), username, 0)

// Memasukkan password
Mobile.setText(findTestObject('Object Repository/2 Login dan Checkout/android.widget.EditText (1)'), password, 0)

// Mengecek kondisi username sebelum login
if (username == validUsername) {
    // Jika username valid, melakukan login
    Mobile.tap(findTestObject('Object Repository/2 Login dan Checkout/android.widget.Button - LOGIN'), 0)

    Mobile.hideKeyboard()

    Mobile.delay(5)

    Mobile.closeApplication() // Jika username tidak valid, cetak pesan error
} else {
    println('Username tidak valid. Tidak dapat melakukan login.')
}

