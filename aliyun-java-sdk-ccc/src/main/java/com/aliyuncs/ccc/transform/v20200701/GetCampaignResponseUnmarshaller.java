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

import com.aliyuncs.ccc.model.v20200701.GetCampaignResponse;
import com.aliyuncs.ccc.model.v20200701.GetCampaignResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCampaignResponseUnmarshaller {

	public static GetCampaignResponse unmarshall(GetCampaignResponse getCampaignResponse, UnmarshallerContext _ctx) {
		
		getCampaignResponse.setRequestId(_ctx.stringValue("GetCampaignResponse.RequestId"));
		getCampaignResponse.setHttpStatusCode(_ctx.longValue("GetCampaignResponse.HttpStatusCode"));
		getCampaignResponse.setCode(_ctx.stringValue("GetCampaignResponse.Code"));

		Data data = new Data();
		data.setActualEndTime(_ctx.longValue("GetCampaignResponse.Data.ActualEndTime"));
		data.setActualStartTime(_ctx.longValue("GetCampaignResponse.Data.ActualStartTime"));
		data.setCasesAborted(_ctx.longValue("GetCampaignResponse.Data.CasesAborted"));
		data.setCasesUncompleted(_ctx.longValue("GetCampaignResponse.Data.CasesUncompleted"));
		data.setCasesConnected(_ctx.longValue("GetCampaignResponse.Data.CasesConnected"));
		data.setMaxAttemptCount(_ctx.longValue("GetCampaignResponse.Data.MaxAttemptCount"));
		data.setMinAttemptInterval(_ctx.longValue("GetCampaignResponse.Data.MinAttemptInterval"));
		data.setName(_ctx.stringValue("GetCampaignResponse.Data.Name"));
		data.setPlanedEndTime(_ctx.longValue("GetCampaignResponse.Data.PlanedEndTime"));
		data.setPlanedStartTime(_ctx.longValue("GetCampaignResponse.Data.PlanedStartTime"));
		data.setQueueName(_ctx.stringValue("GetCampaignResponse.Data.QueueName"));
		data.setTotalCases(_ctx.longValue("GetCampaignResponse.Data.TotalCases"));
		data.setState(_ctx.stringValue("GetCampaignResponse.Data.State"));
		data.setCampaignId(_ctx.stringValue("GetCampaignResponse.Data.CampaignId"));
		data.setStrategyType(_ctx.stringValue("GetCampaignResponse.Data.StrategyType"));
		data.setStrategyParameters(_ctx.stringValue("GetCampaignResponse.Data.StrategyParameters"));
		data.setQueueId(_ctx.stringValue("GetCampaignResponse.Data.QueueId"));
		data.setSimulation(_ctx.booleanValue("GetCampaignResponse.Data.Simulation"));
		data.setSimulationParameters(_ctx.stringValue("GetCampaignResponse.Data.SimulationParameters"));
		data.setCasesUncompletedAfterAttempted(_ctx.longValue("GetCampaignResponse.Data.CasesUncompletedAfterAttempted"));
		data.setCasesUncompletedAfterAttempt(_ctx.stringValue("GetCampaignResponse.Data.CasesUncompletedAfterAttempt"));
		data.setCompletionRate(_ctx.floatValue("GetCampaignResponse.Data.CompletionRate"));
		data.setContactFlowId(_ctx.stringValue("GetCampaignResponse.Data.ContactFlowId"));
		getCampaignResponse.setData(data);
	 
	 	return getCampaignResponse;
	}
}