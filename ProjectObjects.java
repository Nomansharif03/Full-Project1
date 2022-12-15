package CureMDApplicationProject;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ProjectObjects {
	 @FindBy(xpath="//input[@id='vchLogin_Name']")
 	 WebElement WriteUserName;
	
	 @FindBy(xpath="//input[@id='vchPassword']")
	 WebElement WritePassword;
	
	 @FindBy(xpath="//button[text()='Login']")
	 WebElement ClickLogIn;
	
	 @FindBy(xpath="//a[@id='patientBtn']")
	 WebElement ClickOnPatientButton;

	 @FindBy (xpath="//iframe[@id='fra_Menu_CureMD']")
	 WebElement frame1;
	
	 @FindBy(xpath="//iframe[@id='fraCureMD_Body']")
	 WebElement frame2;
	 
	 @FindBy(xpath="(//td[@class='ButtonItem'])[2]")
	 WebElement ClickOnAddPatient;
	
	 @FindBy(xpath="//select[@id='cmbVTitle']")
	 WebElement dropdown1;
	
	 @FindBy(xpath="//input[@id='txtVFNAME']")
	 WebElement FirstName;
	
	 @FindBy(xpath="//input[@id='txtVLNAME']")
	 WebElement LastName;
	
	 @FindBy(xpath="//select[@id='cmbVSEX']")
	 WebElement GenderDropDown;
	
	 @FindBy(xpath="//input[@id='txtDDOB']")
	 WebElement DOB;
	
	 @FindBy(xpath="//input[@id='txtvcity']")
	 WebElement City;
	
	 @FindBy(xpath="//span[@id='select2-cmbILOCID-container']")
	 WebElement LocationDropDown;
	
	 @FindBy(xpath="//input[@id='txtVSTATE']")
	 WebElement State;
	
	 @FindBy(xpath="//input[@id='txtVCOUNTY']")
	 WebElement Country;
	
	 @FindBy(xpath="//input[@id='txtVZIP']")
	 WebElement ZIP;
	
	 @FindBy(xpath="//input[@id='txtVEMAIL']")
	 WebElement TypeEmail;
	
	 @FindBy(xpath="//input[@class='select2-search__field']")
	 WebElement LocationField;
	
	 @FindBy(xpath="//img[@id='imgpInsurance']")
	 WebElement ClicktheCheckButton1;
	
	 @FindBy(xpath="//img[@id='imgSInsurance']")
	 WebElement ClicktheCheckButton2;
	
	 @FindBy(xpath="//select[@id='cmbIPLANID']")
	 WebElement PlanDropDown;
	
	 @FindBy(xpath="//select[@id='cmbPlanAdd']")
	 WebElement SelectAddress1;
	
	 @FindBy(xpath="//select[@id='cmbSecPlanAdd']")
	 WebElement SelectAddress2;
	
	 @FindBy(xpath="//select[@id='cmbSECPLANID']")
	 WebElement PlanDropDown2;
	
	 @FindBy(xpath="//input[@id='txtDSIGNONFILE']")
	 WebElement Date1;
	
	 @FindBy(xpath="//iframe[@id=\"DynamicBHdialogbox\"]")
	 WebElement frame3;
	
	 @FindBy(xpath="//a[@id='Provider_Notes_anchor']")
	 WebElement ClickProvidoeNotes;
	
	 @FindBy(xpath="//a[@id='Provider_Notes_New_Case_anchor']")
	 WebElement ClickNewCase;
	
	 @FindBy(xpath="//input[@id='txtVCNAME']")
	 WebElement ClickName;
	
	 @FindBy(xpath="//input[@id='txtDSTART']")
	 WebElement Date3;
	
	 @FindBy(xpath="//td[@id='cmdSubmit']")
	 WebElement ClickSaveButton2;
	
	 @FindBy(xpath="//iframe[@id='fraCureMD_Patient_Menu']")
	 WebElement Frame4;
	
	 @FindBy(xpath="//iframe[@id='fraCureMD_Body']")
	 WebElement Frame5;
	
	 @FindBy(xpath="//a[@id='Provider_Notes_Provider_Notes_anchor']")
	 WebElement ClickonProviderNotes2;
	
	 @FindBy(xpath="//td[@id='SpAdd1']")
	 WebElement ClickonProviderNotes3;
	
	 @FindBy(xpath="//input[@id='Sdate']")
	 WebElement TypeDat5;
	
	 @FindBy(xpath="//span[@id='select2-cmbProvider-container']")
	 WebElement ClickProvider;
	
	 @FindBy(xpath="//input[@class='select2-search__field']")
	 WebElement ClickProvider1;
	
	 @FindBy(xpath="//select[@id='cmbRTemplate']")
	 WebElement DropDownNoteTemplate;
	
	 @FindBy(xpath="//select[@id='txtVREASON']")
	 WebElement DropDownVisitReason;
	
	 @FindBy(xpath="//span[@id='select2-cmbLocation-container']")
	 WebElement ClickLocation;
	
	 @FindBy(xpath="//input[@class='select2-search__field']")
	 WebElement ClickLocation1;
	
	 @FindBy(xpath="//td[@id='btnSave']")
	 WebElement ClickCreate;
	 
	@FindBy(xpath="(//span[@class='mid'])[1]")
	 WebElement ProviderNote2;
	
	@FindBy (xpath="//a[@id='Clinical_Diagnoses_6_anchor']//child::a")
	WebElement DiagnosissAdd;
	
	@FindBy (xpath="//input[@id='txtKeyword']")
	WebElement ICDNumber;
	
	@FindBy (xpath="//img[@id='imgMaster']")
	WebElement ClickSearch;
	
	
	@FindBy (xpath="//a[@id='0']")
	WebElement ClickSearchResult;
	
	@FindBy (xpath="//td[@id='tdSaveDiagnosis']")
	WebElement ClickSave2;
	
	@FindBy (xpath="//td[@id='tdSoapAccept']")
	WebElement ClickAcceptButton;
	
	@FindBy (xpath="//iframe[@id='DynamicBHdialogbox']")
	WebElement Frame6;

@FindBy (xpath="//a[@id='OrderResult_8_2_anchor']//child::a")
	WebElement ProcedureAdd;

@FindBy (xpath="(//i[@class='jstree-icon jstree-ocl'])[14]")
WebElement ClickOrders;

@FindBy (xpath="//input[@id='txtSearch']")
WebElement Type99211;

@FindBy (xpath="//img[@id='SearchImg']")
WebElement clicksearch2;

@FindBy (xpath="//div[@id='divFavlist']//child::a")
WebElement clickFirstOption;

@FindBy (xpath="//td[@id='tdSaveDiagnosis']")
WebElement clickSaveAndAccept;

@FindBy (xpath="//td[@id='sp_eSuperbill']")
WebElement clickCreateSuperBill;

@FindBy (xpath="//select[@id='cmdPatType']")
WebElement PatientTypeDropDown;


@FindBy (xpath="//iframe[@id='fraCureMD_Body']")
WebElement Frame7;

@FindBy (xpath="//td[@onclick='javascript:SubmitForm()']")
WebElement ClickCreate1;

@FindBy (xpath="//select[@id='ddleandm']")
WebElement EvaluationandManagementDropDown;

@FindBy (xpath="//input[@id='chk99211']")
WebElement ClickTheCheckBox;

@FindBy (xpath="//input[@id='gvSuperBill_ctl02_txtDxPointer']")
WebElement selectpointer1;

@FindBy (xpath="//input[@id='chkDxPointer_1']")
WebElement selecthepointer1;

@FindBy (xpath="//input[@id='gvSuperBill_ctl02_txtAmount']")
WebElement EnterAmount;

@FindBy (xpath="//li[@id='tdSave']")
WebElement EnterSaveButton;

	
	 @FindBy(id="imgpInsurance")
	 WebElement primaryInsurance;
	 	@FindBy(id="imgSInsurance")
	 	WebElement secondaryInsurance;
	 	@FindBy(id="cmbIPLANID")
	 	WebElement planDropdown1;
	 	@FindBy(id="cmbPlanAdd")
	 	WebElement addressDropdown1;
	 	@FindBy(id="cmbSECPLANID")
	 	WebElement planDropdown2;
	 	@FindBy(id="cmbSecPlanAdd")
	 	WebElement addressDropdown2;
	 	@FindBy(id="txtSecDSIGNONFILE")
	 	WebElement Date2;
	 	@FindBy(id="tdsave")
	 	WebElement saveButton;
	 	
	 	@FindBy(id="saveAsNewButton")
	 	WebElement saveAsNewButton;
	 	
	    @FindBy(xpath="//td[@id='tdsave']")
	    WebElement ClickSaveButton;
	    

	    
	  
	
	 
	//ALL Methods
			WebDriver driver;
			Random random;
			Logger logger = Logger.getLogger("WeekendTaskObject");
			public ProjectObjects(WebDriver driver1){
				driver=driver1;
				PageFactory.initElements(driver1,this);}
			
	        public void Login() throws Exception {
				WriteUserName.sendKeys("ChargeClaimAtch");
				Thread.sleep(2000);
				WritePassword.sendKeys("SuPPort.2014");
				Thread.sleep(2000);
				ClickLogIn.click();
				
			}
	        public void AddPatient() throws Exception {
        	Set<String> window=driver.getWindowHandles();
        	System.out.println(window);
        	Iterator<String> iterator=window.iterator();
	        String parentwindow=iterator.next();
        	String childwindow=iterator.next();
	        	
	        driver.switchTo().window(childwindow);
	        Thread.sleep(1000);
	        driver.switchTo().frame(frame1);
	        Thread.sleep(1000);
	        ClickOnPatientButton.click();
        	Thread.sleep(1000);
        	driver.switchTo().defaultContent();
	        driver.switchTo().frame(frame2);
	        Thread.sleep(1000);
	        ClickOnAddPatient.click();
	        Select select= new Select(dropdown1);
	        Thread.sleep(1000);
	        select.selectByVisibleText("Mr");
	        Thread.sleep(1000);
	        FirstName.sendKeys("Noman");
	        Thread.sleep(1000);
	        LastName.sendKeys("Sharif");
	        Thread.sleep(1000);
	        Select select1= new Select(GenderDropDown);
	        Thread.sleep(1000);
	        select1.selectByIndex(0);
	        Thread.sleep(1000);
	        DOB.sendKeys("09/10/1999");
	        LocationDropDown.click();
	        LocationField.sendKeys("abc"+Keys.ENTER);
	        Thread.sleep(1000);
	        TypeEmail.sendKeys("nomansharif03@gmail.com");
	        City.sendKeys("Montgomery");
	        Thread.sleep(1000);
	        State.sendKeys("Alabama");
	        Thread.sleep(1000);
	        Country.sendKeys("United States");
	        Thread.sleep(1000);
	        ZIP.sendKeys("36104");
	        Thread.sleep(1000);
	        
	        Actions actions;
	        primaryInsurance.click();
			select = new Select(planDropdown1);
			select.selectByVisibleText("AARP");
			Thread.sleep(1000);
			select = new Select(addressDropdown1);
			select.selectByVisibleText("P O BOX 1017");
			Date1.sendKeys("12/14/2022");
			secondaryInsurance.click();
			select = new Select(planDropdown2);
			select.selectByVisibleText("AETNA");
			Thread.sleep(1000);
			select = new Select(addressDropdown2);
			select.selectByVisibleText("P.O. BOX 981106");
			Date2.sendKeys("12/13/2022");
			actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_UP).build().perform();
			actions.sendKeys(Keys.PAGE_UP).build().perform();
			actions.sendKeys(Keys.PAGE_UP).build().perform();
			saveButton.click();
			Thread.sleep(2000);
			driver.switchTo().frame(frame3);
			Thread.sleep(2000);
			saveAsNewButton.click();
	        }
	        public void CreateCase() throws Exception {
	        	Thread.sleep(1000);
	        	driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame4);
	        	Thread.sleep(3000);
	        	ClickProvidoeNotes.click();
	        	Thread.sleep(1000);
	        	Thread.sleep(1000);
	        	ClickNewCase.click();
	        	driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame5);
	        	Thread.sleep(1000);
	        	ClickName.sendKeys("Accident");
	        	Thread.sleep(1000);
	        	Date3.sendKeys("12/14/2022");
	        	Thread.sleep(1000);
	        	ClickSaveButton2.click();
	        }
	        public void CreateProvidorOne() throws Exception {
	        	Thread.sleep(1000);
	        	driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame4);
	        	Thread.sleep(1000);
	        	ClickonProviderNotes2.click();
	        	driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame5);
	        	Thread.sleep(1000);
	        	ClickonProviderNotes3.click();
	        	Thread.sleep(1000);
	        	TypeDat5.sendKeys("12/14/2022");
	        	Thread.sleep(1000);
	        	ClickProvider.click();
	        	Thread.sleep(1000);
	        	ClickProvider1.sendKeys("Add, Multiple"+Keys.ENTER);
	        	Thread.sleep(1000);
	        	Select select7= new Select(DropDownNoteTemplate);
		        Thread.sleep(1000);
		        select7.selectByVisibleText("Education");
		        Thread.sleep(1000);
		        Select select8= new Select(DropDownVisitReason);
		        Thread.sleep(1000);
		        select8.selectByVisibleText("abcd");
		        Thread.sleep(1000);
		        ClickLocation.click();
		        Thread.sleep(1000);
		        ClickLocation1.sendKeys("abc"+Keys.ENTER);
		        Thread.sleep(1000);
		        ClickCreate.click()	;
		        Thread.sleep(2000);
	        	
	        	
	        }
	        
	        public void AddDiagnosis() throws Exception {
	        
	        driver.switchTo().defaultContent();
	        Thread.sleep(1000);
        	driver.switchTo().frame(Frame4);
        	Thread.sleep(1000);
        	DiagnosissAdd.click();
        	Thread.sleep(1000);
        	driver.switchTo().defaultContent();
	        Thread.sleep(1000);
        	driver.switchTo().frame(Frame5);
        	Thread.sleep(1000);
        	driver.switchTo().defaultContent();
        	Thread.sleep(1000);
        	driver.switchTo().frame(Frame6);
        	Thread.sleep(1000);
        	ICDNumber.sendKeys("A00.0");
        	Thread.sleep(1000);
        	ClickSearch.click();
        	Thread.sleep(1000);
        	ClickSearchResult.click();
        	Thread.sleep(1000);
        	ClickSave2.click();
        	Thread.sleep(1000);
        	ClickAcceptButton.click();
        	Thread.sleep(1000);
        	
}
	        public void AddProcedure() throws Exception {
	        	driver.switchTo().defaultContent();
		        Thread.sleep(1000);
	        	driver.switchTo().frame(Frame4);
	        	Thread.sleep(1000);
	        	ClickOrders.click();
	        	Thread.sleep(1000);
	        	ProcedureAdd.click();
	        	Thread.sleep(1000);
	        	driver.switchTo().defaultContent();
		        Thread.sleep(1000);
	        	driver.switchTo().frame(Frame5);
	        	Thread.sleep(1000);
	        	driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame6);
	        	Thread.sleep(1000);
	        	Type99211.sendKeys("99211");;
	        	Thread.sleep(1000);
	        	clicksearch2.click();
	        	Thread.sleep(1000);
	        	clickFirstOption.click();
	        	Thread.sleep(1000);
	        	clickSaveAndAccept.click();
	        	Thread.sleep(1000);
	        }
	        public void CreateeSuperbill() throws Exception {
	        	driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame7);
	        	Thread.sleep(1000);
	        	clickCreateSuperBill.click();
	        	Thread.sleep(1000);
	        	driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame6);
	        	Select select9= new Select(PatientTypeDropDown);
		        Thread.sleep(1000);
	        	select9.selectByVisibleText("New Patient");
		        Thread.sleep(1000);
		        ClickCreate1.click();
		        Thread.sleep(1000);
		        driver.switchTo().defaultContent();
	        	Thread.sleep(1000);
	        	driver.switchTo().frame(Frame5);
	        	Select select10= new Select(EvaluationandManagementDropDown);
	        	select10.selectByIndex(2);
	        	 //Thread.sleep(1000);
	        	//ClickTheCheckBox.click();
	        	 Thread.sleep(1000);
	        	selectpointer1.click();
	        	 Thread.sleep(1000);
	        	selecthepointer1.click();
	        	 Thread.sleep(1000);
	        	 Actions actions1 = new Actions(driver);
	        	 actions1.doubleClick(EnterAmount).perform();
	        	EnterAmount.sendKeys("10"+Keys.ENTER);
	        	 Thread.sleep(1000);
		       
	        }
}