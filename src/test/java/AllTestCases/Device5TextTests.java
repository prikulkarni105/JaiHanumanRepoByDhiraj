package AllTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.StringResources;
import WPAPI.MainPOSTLogic;
import WPAPI.Utils;

public class Device5TextTests {

	    @BeforeSuite
	    public void executeBeforeAllTests() throws Exception
	    {
		   Utils.readMediaFromServer();
	    }
	 	
	    @Test(enabled = true)  
		public void Device5_FM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_FM_GroupId, StringResources.Device5FM);
		}
		
		@Test(enabled = true)
		public void Device5_DualFM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_DualFM_GroupId, StringResources.Device5DualFM);

		}
		
		@Test(enabled = true)
		public void Device5_WorkFM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WorkFM_GroupId, StringResources.Device5WorkFM);

		}
		
		@Test(enabled = true)     
		public void Device5_GB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_GB_GroupId, StringResources.Device5GB);

		}
		
		@Test(enabled = true)
		public void Device5_DualGB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_DualGB_GroupId, StringResources.Device5DualGB);

		}
		
		@Test(enabled = true)
		public void Device5_WorkGB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WorkGB_GroupId, StringResources.Device5WorkGB);

		}
		
		@Test(enabled = true)
		public void Device5_WB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WB_GroupId, StringResources.Device5WB);

		}
		
		@Test(enabled = true)
		public void Device5_DualWB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_DualWB_GroupId, StringResources.Device5DualWB);

		}
		
		@Test(enabled = true)
		public void Device5_WorkWB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WorkWB_GroupId, StringResources.Device5WorkWB);

		}
		
		@Test(enabled = true)
		public void Device5_AEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_AEROI_GroupId, StringResources.Device5AEROI);

		}
		
		@Test(enabled = true)
		public void Device5_DualAEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_DualAEROI_GroupId, StringResources.Device5DualAEROI);

		}
		
		@Test(enabled = true)
		public void Device5_WorkAEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WorkAEROI_GroupId, StringResources.Device5WorkAEROI);

		}
	
		@Test(enabled = true)
		public void Device5_AEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_AEROII_GroupId, StringResources.Device5AEROII);
	
		}
		
		@Test(enabled = true)
		public void Device5_DualAEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_DualAEROII_GroupId, StringResources.Device5DualAEROII);

		}
		
		@Test(enabled = true)
		public void Device5_WorkAEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WorkAEROII_GroupId, StringResources.Device5WorkAEROII);

		}
	
		@Test(enabled = true)
		public void Device5_WA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WA_GroupId, StringResources.Device5WA);

		}
		
		@Test(enabled = true)
		public void Device5_DualWA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_DualWA_GroupId, StringResources.Device5DualWA);

		}
		
		@Test(enabled = true)
		public void Device5_WorkWA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WorkWA_GroupId, StringResources.Device5WorkWA);

		}
	
		@Test(enabled = true)
		public void Device5_YO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_YO_GroupId, StringResources.Device5YO);

		}
		
		@Test(enabled = true)
		public void Device5_DualYO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_DualYO_GroupId, StringResources.Device5DualYO);
	
		}
		
		@Test(enabled = true)
		public void Device5_WorkYO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device5_WorkYO_GroupId, StringResources.Device5WorkYO);

		}

}
