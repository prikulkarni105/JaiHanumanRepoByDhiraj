package AllTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.StringResources;
import WPAPI.MainPOSTLogic;
import WPAPI.Utils;

public class Device4TextTests {

	    @BeforeSuite
	    public void executeBeforeAllTests() throws Exception
	    {
		   Utils.readMediaFromServer();
	    }
 
	
	    @Test(enabled = true)  
		public void Device4_FM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_FM_GroupId, StringResources.Device4FM);
		}
		
		@Test(enabled = true)
		public void Device4_DualFM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_DualFM_GroupId, StringResources.Device4DualFM);

		}
		
		@Test(enabled = true)
		public void Device4_WorkFM_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WorkFM_GroupId, StringResources.Device4WorkFM);

		}
		
		@Test(enabled = true)     
		public void Device4_GB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_GB_GroupId, StringResources.Device4GB);

		}
		
		@Test(enabled = true)
		public void Device4_DualGB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_DualGB_GroupId, StringResources.Device4DualGB);

		}
		
		@Test(enabled = true)
		public void Device4_WorkGB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WorkGB_GroupId, StringResources.Device4WorkGB);

		}
		
		@Test(enabled = true)
		public void Device4_WB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WB_GroupId, StringResources.Device4WB);

		}
		
		@Test(enabled = true)
		public void Device4_DualWB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_DualWB_GroupId, StringResources.Device4DualWB);

		}
		
		@Test(enabled = true)
		public void Device4_WorkWB_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WorkWB_GroupId, StringResources.Device4WorkWB);

		}
		
		@Test(enabled = true)
		public void Device4_AEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_AEROI_GroupId, StringResources.Device4AEROI);

		}
		
		@Test(enabled = true)
		public void Device4_DualAEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_DualAEROI_GroupId, StringResources.Device4DualAEROI);

		}
		
		@Test(enabled = true)
		public void Device4_WorkAEROI_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WorkAEROI_GroupId, StringResources.Device4WorkAEROI);

		}
	
		@Test(enabled = true)
		public void Device4_AEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_AEROII_GroupId, StringResources.Device4AEROII);
	
		}
		
		@Test(enabled = true)
		public void Device4_DualAEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_DualAEROII_GroupId, StringResources.Device4DualAEROII);

		}
		
		@Test(enabled = true)
		public void Device4_WorkAEROII_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WorkAEROII_GroupId, StringResources.Device4WorkAEROII);

		}
	
		@Test(enabled = true)
		public void Device4_WA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WA_GroupId, StringResources.Device4WA);

		}
		
		@Test(enabled = true)
		public void Device4_DualWA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_DualWA_GroupId, StringResources.Device4DualWA);

		}
		
		@Test(enabled = true)
		public void Device4_WorkWA_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WorkWA_GroupId, StringResources.Device4WorkWA);

		}
	
		@Test(enabled = true)
		public void Device4_YO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_YO_GroupId, StringResources.Device4YO);

		}
		
		@Test(enabled = true)
		public void Device4_DualYO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_DualYO_GroupId, StringResources.Device4DualYO);
	
		}
		
		@Test(enabled = true)
		public void Device4_WorkYO_Text() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"text", StringResources.Device4_WorkYO_GroupId, StringResources.Device4WorkYO);

		}

}
