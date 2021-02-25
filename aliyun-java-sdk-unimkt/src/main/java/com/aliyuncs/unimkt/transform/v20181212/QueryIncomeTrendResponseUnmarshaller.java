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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.QueryIncomeTrendResponse;
import com.aliyuncs.unimkt.model.v20181212.QueryIncomeTrendResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryIncomeTrendResponseUnmarshaller {

	public static QueryIncomeTrendResponse unmarshall(QueryIncomeTrendResponse queryIncomeTrendResponse, UnmarshallerContext _ctx) {
		
		queryIncomeTrendResponse.setRequestId(_ctx.stringValue("QueryIncomeTrendResponse.RequestId"));
		queryIncomeTrendResponse.setCode(_ctx.stringValue("QueryIncomeTrendResponse.Code"));
		queryIncomeTrendResponse.setSuccess(_ctx.booleanValue("QueryIncomeTrendResponse.Success"));
		queryIncomeTrendResponse.setMessage(_ctx.stringValue("QueryIncomeTrendResponse.Message"));
		queryIncomeTrendResponse.setPageNumber(_ctx.integerValue("QueryIncomeTrendResponse.PageNumber"));
		queryIncomeTrendResponse.setPageSize(_ctx.integerValue("QueryIncomeTrendResponse.PageSize"));
		queryIncomeTrendResponse.setTotal(_ctx.longValue("QueryIncomeTrendResponse.Total"));

		List<Data> model = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("QueryIncomeTrendResponse.Model.Length"); i++) {
			Data data = new Data();
			data.setStartTime(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].StartTime"));
			data.setEndTime(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].EndTime"));
			data.setMediaId(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].MediaId"));
			data.setMediaName(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].MediaName"));
			data.setAdSlotType(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotType"));
			data.setAdSlotId(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotId"));
			data.setAdSlotName(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotName"));
			data.setEstimatedIncome(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].EstimatedIncome"));
			data.setAdSlotRequests(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotRequests"));
			data.setAccessStatus(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].AccessStatus"));
			data.setAdSlotHitTimes(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotHitTimes"));
			data.setShowTimes(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].ShowTimes"));
			data.setClickTimes(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].ClickTimes"));
			data.setChannelId(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].ChannelId"));
			data.setChannelName(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].ChannelName"));
			data.setBizDate(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].BizDate"));
			data.setThisDaysEstIncome(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].ThisDaysEstIncome"));
			data.setAdSlotHitRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotHitRate"));
			data.setAdSlotShowRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotShowRate"));
			data.setAdSlotClickRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].AdSlotClickRate"));
			data.setEcpm(_ctx.longValue("QueryIncomeTrendResponse.Model["+ i +"].Ecpm"));
			data.setEcpmRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].EcpmRate"));
			data.setThisDaysEstIncomeRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].ThisDaysEstIncomeRate"));
			data.setThisMonEstIncomeRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].ThisMonEstIncomeRate"));
			data.setThisYearEstIncomeRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].ThisYearEstIncomeRate"));
			data.setAccEstIncomeRate(_ctx.stringValue("QueryIncomeTrendResponse.Model["+ i +"].AccEstIncomeRate"));

			model.add(data);
		}
		queryIncomeTrendResponse.setModel(model);
	 
	 	return queryIncomeTrendResponse;
	}
}