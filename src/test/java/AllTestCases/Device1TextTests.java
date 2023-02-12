package AllTestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.StringResources;
import WPAPI.LogMethods;
import WPAPI.MainPOSTLogic;
import WPAPI.Utils;

public class Device1TextTests {
    	
	    @BeforeSuite
	    public void executeBeforeAllTests() throws Exception
	    {
		   Utils.readMediaFromServer();
	    }
	    
	    
	    @Test(enabled = true)  
		public void Device1_FM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_FM_GroupId, StringResources.Device1FM);
		}
		
		@Test(enabled = true)
		public void Device1_DualFM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_DualFM_GroupId, StringResources.Device1DualFM);

		}
		
		@Test(enabled = true)
		public void Device1_WorkFM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WorkFM_GroupId, StringResources.Device1WorkFM);

		}
		
		@Test(enabled = false)     //test==disable
		public void Device1_GB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_GB_GroupId, StringResources.Device1GB);

		}
		
		@Test(enabled = true)
		public void Device1_DualGB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_DualGB_GroupId, StringResources.Device1DualGB);

		}
		
		@Test(enabled = true)
		public void Device1_WorkGB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WorkGB_GroupId, StringResources.Device1WorkGB);

		}
		
		@Test(enabled = true)
		public void Device1_WB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WB_GroupId, StringResources.Device1WB);

		}
		
		@Test(enabled = true)
		public void Device1_DualWB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_DualWB_GroupId, StringResources.Device1DualWB);

		}
		
		@Test(enabled = true)
		public void Device1_WorkWB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WorkWB_GroupId, StringResources.Device1WorkWB);

		}
		
		@Test(enabled = true)
		public void Device1_AEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_AEROI_GroupId, StringResources.Device1AEROI);

		}
		
		@Test(enabled = true)
		public void Device1_DualAEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_DualAEROI_GroupId, StringResources.Device1DualAEROI);

		}
		
		@Test(enabled = true)
		public void Device1_WorkAEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WorkAEROI_GroupId, StringResources.Device1WorkAEROI);

		}
	
		@Test(enabled = true)
		public void Device1_AEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_AEROII_GroupId, StringResources.Device1AEROII);
	
		}
		
		@Test(enabled = true)
		public void Device1_DualAEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_DualAEROII_GroupId, StringResources.Device1DualAEROII);

		}
		
		@Test(enabled = true)
		public void Device1_WorkAEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WorkAEROII_GroupId, StringResources.Device1WorkAEROII);

		}
	
		@Test(enabled = true)
		public void Device1_WA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WA_GroupId, StringResources.Device1WA);

		}
		
		@Test(enabled = true)
		public void Device1_DualWA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_DualWA_GroupId, StringResources.Device1DualWA);

		}
		
		@Test(enabled = true)
		public void Device1_WorkWA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WorkWA_GroupId, StringResources.Device1WorkWA);

		}
	
		@Test(enabled = true)
		public void Device1_YO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_YO_GroupId, StringResources.Device1YO);

		}
		
		@Test(enabled = true)
		public void Device1_DualYO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_DualYO_GroupId, StringResources.Device1DualYO);
	
		}
		
		@Test(enabled = true)
		public void Device1_WorkYO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device1_WorkYO_GroupId, StringResources.Device1WorkYO);

		}
	
		@AfterSuite
		public void flush() {

			LogMethods.flush();
		}
		
	
}
