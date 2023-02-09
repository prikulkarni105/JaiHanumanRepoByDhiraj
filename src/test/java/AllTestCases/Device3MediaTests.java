package AllTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.StringResources;
import WPAPI.MainPOSTLogic;
import WPAPI.Utils;

public class Device3MediaTests {

	
	    @BeforeSuite
	    public void executeBeforeAllTests() throws Exception
	    {
		   Utils.readMediaFromServer();
	    }
	 
	    @Test(enabled = true)  
		public void Device3_FM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_FM_GroupId, StringResources.Device3FM);
		}
		
		@Test(enabled = true)
		public void Device3_DualFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_DualFM_GroupId, StringResources.Device3DualFM);

		}
		
		@Test(enabled = true)
		public void Device3_WorkFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WorkFM_GroupId, StringResources.Device3WorkFM);

		}
		
		@Test(enabled = true)     
		public void Device3_GB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_GB_GroupId, StringResources.Device3GB);

		}
		
		@Test(enabled = true)
		public void Device3_DualGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_DualGB_GroupId, StringResources.Device3DualGB);

		}
		
		@Test(enabled = true)
		public void Device3_WorkGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WorkGB_GroupId, StringResources.Device3WorkGB);

		}
		
		@Test(enabled = true)
		public void Device3_WB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WB_GroupId, StringResources.Device3WB);

		}
		
		@Test(enabled = true)
		public void Device3_DualWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_DualWB_GroupId, StringResources.Device3DualWB);

		}
		
		@Test(enabled = true)
		public void Device3_WorkWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WorkWB_GroupId, StringResources.Device3WorkWB);

		}
		
		@Test(enabled = true)
		public void Device3_AEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_AEROI_GroupId, StringResources.Device3AEROI);

		}
		
		@Test(enabled = true)
		public void Device3_DualAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_DualAEROI_GroupId, StringResources.Device3DualAEROI);

		}
		
		@Test(enabled = true)
		public void Device3_WorkAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WorkAEROI_GroupId, StringResources.Device3WorkAEROI);

		}
	
		@Test(enabled = true)
		public void Device3_AEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_AEROII_GroupId, StringResources.Device3AEROII);
	
		}
		
		@Test(enabled = true)
		public void Device3_DualAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_DualAEROII_GroupId, StringResources.Device3DualAEROII);

		}
		
		@Test(enabled = true)
		public void Device3_WorkAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WorkAEROII_GroupId, StringResources.Device3WorkAEROII);

		}
	
		@Test(enabled = true)
		public void Device3_WA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WA_GroupId, StringResources.Device3WA);

		}
		
		@Test(enabled = true)
		public void Device3_DualWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_DualWA_GroupId, StringResources.Device3DualWA);

		}
		
		@Test(enabled = true)
		public void Device3_WorkWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WorkWA_GroupId, StringResources.Device3WorkWA);

		}
	
		@Test(enabled = true)
		public void Device3_YO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_YO_GroupId, StringResources.Device3YO);

		}
		
		@Test(enabled = true)
		public void Device3_DualYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_DualYO_GroupId, StringResources.Device3DualYO);
	
		}
		
		@Test(enabled = true)
		public void Device3_WorkYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups("media", StringResources.Device3_WorkYO_GroupId, StringResources.Device3WorkYO);

		}

}
