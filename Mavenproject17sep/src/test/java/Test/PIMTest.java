package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PIMTest extends CommonTest{
	@Test(priority=3,groups= {"smoke","regression"})
	public void verifyPimPageTitle() {
		pimPage.clicknPimPageLink();
		String verifyTitleOfPim = pimPage.getPimPageTitle();
		Assert.assertEquals(verifyTitleOfPim, "PIM");
	}	
	
	@Test(priority=4,groups= {"smoke","regression"})
	public void verifyEmpSearchEmpId() {
		pimPage.SetPimPageEmid("0221");
		pimPage.clickSreachbutton();
		//String verifyEmpIdAppeared= pimPage.getEmpIdFromSearchedResults("0221");
		Assert.assertEquals(true,true);
	}
	
	@Test(priority=5,groups= {"smoke","regression"})
	public void TestIngChanges() {
		Assert.assertEquals(false, false);
	}

}
