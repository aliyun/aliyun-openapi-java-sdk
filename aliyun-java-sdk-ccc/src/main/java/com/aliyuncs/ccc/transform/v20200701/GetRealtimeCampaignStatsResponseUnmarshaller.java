/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetRealtimeCampaignStatsResponse;
import com.aliyuncs.ccc.model.v20200701.GetRealtimeCampaignStatsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRealtimeCampaignStatsResponseUnmarshaller {

	public static GetRealtimeCampaignStatsResponse unmarshall(GetRealtimeCampaignStatsResponse getRealtimeCampaignStatsResponse, UnmarshallerContext _ctx) {
		
		getRealtimeCampaignStatsResponse.setRequestId(_ctx.stringValue("GetRealtimeCampaignStatsResponse.RequestId"));
		getRealtimeCampaignStatsResponse.setCode(_ctx.stringValue("GetRealtimeCampaignStatsResponse.Code"));
		getRealtimeCampaignStatsResponse.setHttpStatusCode(_ctx.integerValue("GetRealtimeCampaignStatsResponse.HttpStatusCode"));
		getRealtimeCampaignStatsResponse.setMessage(_ctx.stringValue("GetRealtimeCampaignStatsResponse.Message"));

		Data data = new Data();
		data.setLoggedInAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.LoggedInAgents"));
		data.setReadyAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.ReadyAgents"));
		data.setBreakingAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.BreakingAgents"));
		data.setTalkingAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.TalkingAgents"));
		data.setWorkingAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.WorkingAgents"));
		data.setCaps(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.Caps"));
		data.setTotalAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.TotalAgents"));
		data.setOutboundScenarioReadyAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.OutboundScenarioReadyAgents"));
		data.setOutboundScenarioBreakingAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.OutboundScenarioBreakingAgents"));
		data.setOutboundScenarioTalkingAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.OutboundScenarioTalkingAgents"));
		data.setOutboundScenarioWorkingAgents(_ctx.longValue("GetRealtimeCampaignStatsResponse.Data.OutboundScenarioWorkingAgents"));
		getRealtimeCampaignStatsResponse.setData(data);
	 
	 	return getRealtimeCampaignStatsResponse;
	}
}