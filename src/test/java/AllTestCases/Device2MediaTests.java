package AllTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.StringResources;
import WPAPI.MainPOSTLogic;
import WPAPI.Utils;

public class Device2MediaTests {
	
	   @BeforeSuite
	   public void executeBeforeAllTests() throws Exception
	   {
		   Utils.readMediaFromServer();
	   }
	
	
	    @Test(enabled = true)  
		public void Device2_FM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_FM_GroupId, StringResources.Device2FM);
		}
		
		@Test(enabled = true)
		public void Device2_DualFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_DualFM_GroupId, StringResources.Device2DualFM);

		}
		
		@Test(enabled = true)
		public void Device2_WorkFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WorkFM_GroupId, StringResources.Device2WorkFM);

		}
		
		@Test(enabled = true)     
		public void Device2_GB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_GB_GroupId, StringResources.Device2GB);

		}
		
		@Test(enabled = true)
		public void Device2_DualGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_DualGB_GroupId, StringResources.Device2DualGB);

		}
		
		@Test(enabled = true)
		public void Device2_WorkGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WorkGB_GroupId, StringResources.Device2WorkGB);

		}
		
		@Test(enabled = true)
		public void Device2_WB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WB_GroupId, StringResources.Device2WB);

		}
		
		@Test(enabled = true)
		public void Device2_DualWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_DualWB_GroupId, StringResources.Device2DualWB);

		}
		
		@Test(enabled = true)
		public void Device2_WorkWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WorkWB_GroupId, StringResources.Device2WorkWB);

		}
		
		@Test(enabled = true)
		public void Device2_AEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_AEROI_GroupId, StringResources.Device2AEROI);

		}
		
		@Test(enabled = true)
		public void Device2_DualAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_DualAEROI_GroupId, StringResources.Device2DualAEROI);

		}
		
		@Test(enabled = true)
		public void Device2_WorkAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WorkAEROI_GroupId, StringResources.Device2WorkAEROI);

		}
	
		@Test(enabled = true)
		public void Device2_AEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_AEROII_GroupId, StringResources.Device2AEROII);
	
		}
		
		@Test(enabled = true)
		public void Device2_DualAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_DualAEROII_GroupId, StringResources.Device2DualAEROII);

		}
		
		@Test(enabled = true)
		public void Device2_WorkAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WorkAEROII_GroupId, StringResources.Device2WorkAEROII);

		}
	
		@Test(enabled = true)
		public void Device2_WA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WA_GroupId, StringResources.Device2WA);

		}
		
		@Test(enabled = true)
		public void Device2_DualWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_DualWA_GroupId, StringResources.Device2DualWA);

		}
		
		@Test(enabled = true)
		public void Device2_WorkWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WorkWA_GroupId, StringResources.Device2WorkWA);

		}
	
		@Test(enabled = true)
		public void Device2_YO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_YO_GroupId, StringResources.Device2YO);

		}
		
		@Test(enabled = true)
		public void Device2_DualYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_DualYO_GroupId, StringResources.Device2DualYO);
	
		}
		
		@Test(enabled = true)
		public void Device2_WorkYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device2_WorkYO_GroupId, StringResources.Device2WorkYO);

		}

	
}
