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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.QueryIncomeDataResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryIncomeDataResponse.Model;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIncomeDataResponseUnmarshaller {

	public static QueryIncomeDataResponse unmarshall(QueryIncomeDataResponse queryIncomeDataResponse, UnmarshallerContext _ctx) {
		
		queryIncomeDataResponse.setRequestId(_ctx.stringValue("QueryIncomeDataResponse.RequestId"));
		queryIncomeDataResponse.setCode(_ctx.stringValue("QueryIncomeDataResponse.Code"));
		queryIncomeDataResponse.setSuccess(_ctx.booleanValue("QueryIncomeDataResponse.Success"));
		queryIncomeDataResponse.setMessage(_ctx.stringValue("QueryIncomeDataResponse.Message"));

		Model model = new Model();
		model.setStartTime(_ctx.longValue("QueryIncomeDataResponse.Model.StartTime"));
		model.setEndTime(_ctx.longValue("QueryIncomeDataResponse.Model.EndTime"));
		model.setMediaId(_ctx.stringValue("QueryIncomeDataResponse.Model.MediaId"));
		model.setMediaName(_ctx.stringValue("QueryIncomeDataResponse.Model.MediaName"));
		model.setAdSlotType(_ctx.stringValue("QueryIncomeDataResponse.Model.AdSlotType"));
		model.setAdSlotId(_ctx.stringValue("QueryIncomeDataResponse.Model.AdSlotId"));
		model.setAdSlotName(_ctx.stringValue("QueryIncomeDataResponse.Model.AdSlotName"));
		model.setEstimatedIncome(_ctx.longValue("QueryIncomeDataResponse.Model.EstimatedIncome"));
		model.setAdSlotRequests(_ctx.longValue("QueryIncomeDataResponse.Model.AdSlotRequests"));
		model.setAccessStatus(_ctx.longValue("QueryIncomeDataResponse.Model.AccessStatus"));
		model.setAdSlotHitTimes(_ctx.longValue("QueryIncomeDataResponse.Model.AdSlotHitTimes"));
		model.setShowTimes(_ctx.longValue("QueryIncomeDataResponse.Model.ShowTimes"));
		model.setClickTimes(_ctx.longValue("QueryIncomeDataResponse.Model.ClickTimes"));
		model.setLastDayEstimatedIncome(_ctx.longValue("QueryIncomeDataResponse.Model.LastDayEstimatedIncome"));
		model.setThisMonEstimatedIncome(_ctx.longValue("QueryIncomeDataResponse.Model.ThisMonEstimatedIncome"));
		model.setThisYearIncome(_ctx.longValue("QueryIncomeDataResponse.Model.ThisYearIncome"));
		model.setAccumulatedIncome(_ctx.longValue("QueryIncomeDataResponse.Model.AccumulatedIncome"));
		model.setChannelId(_ctx.stringValue("QueryIncomeDataResponse.Model.ChannelId"));
		model.setChannelName(_ctx.stringValue("QueryIncomeDataResponse.Model.ChannelName"));
		model.setThisDaysEstIncome(_ctx.longValue("QueryIncomeDataResponse.Model.ThisDaysEstIncome"));
		model.setAdSlotHitRate(_ctx.stringValue("QueryIncomeDataResponse.Model.AdSlotHitRate"));
		model.setAdSlotShowRate(_ctx.stringValue("QueryIncomeDataResponse.Model.AdSlotShowRate"));
		model.setAdSlotClickRate(_ctx.stringValue("QueryIncomeDataResponse.Model.AdSlotClickRate"));
		model.setEcpm(_ctx.longValue("QueryIncomeDataResponse.Model.Ecpm"));
		model.setEcpmRate(_ctx.stringValue("QueryIncomeDataResponse.Model.EcpmRate"));
		model.setThisDaysEstIncomeRate(_ctx.stringValue("QueryIncomeDataResponse.Model.ThisDaysEstIncomeRate"));
		model.setThisMonEstIncomeRate(_ctx.stringValue("QueryIncomeDataResponse.Model.ThisMonEstIncomeRate"));
		model.setThisYearEstIncomeRate(_ctx.stringValue("QueryIncomeDataResponse.Model.ThisYearEstIncomeRate"));
		model.setAccEstIncomeRate(_ctx.stringValue("QueryIncomeDataResponse.Model.AccEstIncomeRate"));
		queryIncomeDataResponse.setModel(model);
	 
	 	return queryIncomeDataResponse;
	}
}