package AllTestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Resources.StringResources;
import WPAPI.MainPOSTLogic;
import WPAPI.Utils;

public class Device6MediaTests {
	
	    @BeforeSuite
	    public void executeBeforeAllTests() throws Exception
	    {
		   Utils.readMediaFromServer();
	    }
 	
	    @Test(enabled = false)      //no groups in wp
		public void Device6_FM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_FM_GroupId, StringResources.Device6FM);
		}
		
		@Test(enabled = false)     //no groups in wp
		public void Device6_DualFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_DualFM_GroupId, StringResources.Device6DualFM);

		}
		
		@Test(enabled = false)     //no groups in wp
		public void Device6_WorkFM_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WorkFM_GroupId, StringResources.Device6WorkFM);

		}
		
		@Test(enabled = true)     
		public void Device6_GB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_GB_GroupId, StringResources.Device6GB);

		}
		
		@Test(enabled = true)
		public void Device6_DualGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_DualGB_GroupId, StringResources.Device6DualGB);

		}
		
		@Test(enabled = false)       //no groups in wp
		public void Device6_WorkGB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WorkGB_GroupId, StringResources.Device6WorkGB);

		}
		
		@Test(enabled = false)       //no groups in wp
		public void Device6_WB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WB_GroupId, StringResources.Device6WB);

		}
		
		@Test(enabled = true)
		public void Device6_DualWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_DualWB_GroupId, StringResources.Device6DualWB);

		}
		
		@Test(enabled = true)
		public void Device6_WorkWB_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WorkWB_GroupId, StringResources.Device6WorkWB);

		}
		
		@Test(enabled = false)        //no groups in wp
		public void Device6_AEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_AEROI_GroupId, StringResources.Device6AEROI);

		}
		
		@Test(enabled = false)       //no groups in wp
		public void Device6_DualAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_DualAEROI_GroupId, StringResources.Device6DualAEROI);

		}
		
		@Test(enabled = false)      //no groups in wp
		public void Device6_WorkAEROI_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WorkAEROI_GroupId, StringResources.Device6WorkAEROI);

		}
	
		@Test(enabled = false)      //no groups in wp
		public void Device6_AEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_AEROII_GroupId, StringResources.Device6AEROII);
	
		}
		
		@Test(enabled = false)      //no groups in wp
		public void Device6_DualAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_DualAEROII_GroupId, StringResources.Device6DualAEROII);

		}
		
		@Test(enabled = false)      //no groups in wp
		public void Device6_WorkAEROII_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WorkAEROII_GroupId, StringResources.Device6WorkAEROII);

		}
	
		@Test(enabled = true)
		public void Device6_WA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WA_GroupId, StringResources.Device6WA);

		}
		
		@Test(enabled = true)
		public void Device6_DualWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_DualWA_GroupId, StringResources.Device6DualWA);

		}
		
		@Test(enabled = true)
		public void Device6_WorkWA_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WorkWA_GroupId, StringResources.Device6WorkWA);

		}
	
		@Test(enabled = true)
		public void Device6_YO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_YO_GroupId, StringResources.Device6YO);

		}
		
		@Test(enabled = true)
		public void Device6_DualYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_DualYO_GroupId, StringResources.Device6DualYO);
	
		}
		
		@Test(enabled = false)       //no groups in wp
		public void Device6_WorkYO_Media() throws Exception
		{
			 MainPOSTLogic.sendMessageToGroups(new Object(){}.getClass().getEnclosingMethod().getName(),"media", StringResources.Device6_WorkYO_GroupId, StringResources.Device6WorkYO);

		}

}
