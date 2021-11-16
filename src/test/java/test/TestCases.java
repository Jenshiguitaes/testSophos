package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.TrabajaConNosotrosPage;

public class TestCases extends BaseTest{
	
	@Test
	public void checkJobs() {
		HomePage sophos = new HomePage();
		sophos.closePopUp();
		
		TrabajaConNosotrosPage opcionTrabajaConNosotros = sophos.accessTrabajaConNosotros();
		if(opcionTrabajaConNosotros.existList()) {
			opcionTrabajaConNosotros.getJobs();
		}
		
	}

}
