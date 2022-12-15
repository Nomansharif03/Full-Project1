package CureMDApplicationProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProjectExecution {
	ProjectObjects object;
	WebDriver driver;
	
	@BeforeTest
	public void chromepage() {
		driver = new ChromeDriver();
		object = new ProjectObjects(driver);
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
	}
    
    @Test(description="Login",priority =1)
	public void LogInToPage() throws Exception {
		object.Login();
    }
    @Test(priority= 2)
    public void AddthePatient() throws Exception {
    	
    	object.AddPatient();
    	
    }
    @Test(priority=3)
    public void CreateCaseAgian() throws Exception {
    	object.CreateCase();
    }
    @Test(priority=4)
    public void CreateProvidor() throws Exception
    {
    	object.CreateProvidorOne();
    }
    @Test(priority=5)
    public void AddDiagnosisCase() throws Exception
    {
    	object.AddDiagnosis();
    }
    @Test(priority=6)
    public void AddProcedureTest() throws Exception {
    	object.AddProcedure();
    }
    @Test(priority=7)
    public void CreateTheeSuperbill() throws Exception {
    	object.CreateeSuperbill();
    	}
}