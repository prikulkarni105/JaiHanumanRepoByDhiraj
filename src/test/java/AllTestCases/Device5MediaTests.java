package AllTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.StringResources;
import WPAPI.MainPOSTLogic;
import WPAPI.Utils;

public class Device5MediaTests {

	    @BeforeSuite
	    public void executeBeforeAllTests() throws Exception
	    {
		   Utils.readMediaFromServer();
	    }
 
	    @Test(enabled = true)  
		public void Device5_FM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_FM_GroupId, StringResources.Device5FM);
		}
		
		@Test(enabled = true)
		public void Device5_DualFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_DualFM_GroupId, StringResources.Device5DualFM);

		}
		
		@Test(enabled = true)
		public void Device5_WorkFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WorkFM_GroupId, StringResources.Device5WorkFM);

		}
		
		@Test(enabled = true)     
		public void Device5_GB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_GB_GroupId, StringResources.Device5GB);

		}
		
		@Test(enabled = true)
		public void Device5_DualGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_DualGB_GroupId, StringResources.Device5DualGB);

		}
		
		@Test(enabled = true)
		public void Device5_WorkGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WorkGB_GroupId, StringResources.Device5WorkGB);

		}
		
		@Test(enabled = true)
		public void Device5_WB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WB_GroupId, StringResources.Device5WB);

		}
		
		@Test(enabled = true)
		public void Device5_DualWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_DualWB_GroupId, StringResources.Device5DualWB);

		}
		
		@Test(enabled = true)
		public void Device5_WorkWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WorkWB_GroupId, StringResources.Device5WorkWB);

		}
		
		@Test(enabled = true)
		public void Device5_AEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_AEROI_GroupId, StringResources.Device5AEROI);

		}
		
		@Test(enabled = true)
		public void Device5_DualAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_DualAEROI_GroupId, StringResources.Device5DualAEROI);

		}
		
		@Test(enabled = true)
		public void Device5_WorkAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WorkAEROI_GroupId, StringResources.Device5WorkAEROI);

		}
	
		@Test(enabled = true)
		public void Device5_AEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_AEROII_GroupId, StringResources.Device5AEROII);
	
		}
		
		@Test(enabled = true)
		public void Device5_DualAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_DualAEROII_GroupId, StringResources.Device5DualAEROII);

		}
		
		@Test(enabled = true)
		public void Device5_WorkAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WorkAEROII_GroupId, StringResources.Device5WorkAEROII);

		}
	
		@Test(enabled = true)
		public void Device5_WA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WA_GroupId, StringResources.Device5WA);

		}
		
		@Test(enabled = true)
		public void Device5_DualWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_DualWA_GroupId, StringResources.Device5DualWA);

		}
		
		@Test(enabled = true)
		public void Device5_WorkWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WorkWA_GroupId, StringResources.Device5WorkWA);

		}
	
		@Test(enabled = true)
		public void Device5_YO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_YO_GroupId, StringResources.Device5YO);

		}
		
		@Test(enabled = true)
		public void Device5_DualYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_DualYO_GroupId, StringResources.Device5DualYO);
	
		}
		
		@Test(enabled = true)
		public void Device5_WorkYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device5_WorkYO_GroupId, StringResources.Device5WorkYO);

		}

}
