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

package com.aliyuncs.dyiotapi.transform.v20171111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dyiotapi.model.v20171111.QueryCardHistoryFlowInfoResponse;
import com.aliyuncs.dyiotapi.model.v20171111.QueryCardHistoryFlowInfoResponse.GprsMonthUsageDTO;
import com.aliyuncs.dyiotapi.model.v20171111.QueryCardHistoryFlowInfoResponse.GprsMonthUsageDTO.GprsDayUsage;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCardHistoryFlowInfoResponseUnmarshaller {

	public static QueryCardHistoryFlowInfoResponse unmarshall(QueryCardHistoryFlowInfoResponse queryCardHistoryFlowInfoResponse, UnmarshallerContext _ctx) {
		
		queryCardHistoryFlowInfoResponse.setRequestId(_ctx.stringValue("QueryCardHistoryFlowInfoResponse.RequestId"));
		queryCardHistoryFlowInfoResponse.setCode(_ctx.stringValue("QueryCardHistoryFlowInfoResponse.Code"));
		queryCardHistoryFlowInfoResponse.setMessage(_ctx.stringValue("QueryCardHistoryFlowInfoResponse.Message"));
		queryCardHistoryFlowInfoResponse.setSuccess(_ctx.booleanValue("QueryCardHistoryFlowInfoResponse.Success"));

		List<GprsMonthUsageDTO> data = new ArrayList<GprsMonthUsageDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryCardHistoryFlowInfoResponse.Data.Length"); i++) {
			GprsMonthUsageDTO gprsMonthUsageDTO = new GprsMonthUsageDTO();
			gprsMonthUsageDTO.setMonth(_ctx.longValue("QueryCardHistoryFlowInfoResponse.Data["+ i +"].Month"));
			gprsMonthUsageDTO.setCurValue(_ctx.longValue("QueryCardHistoryFlowInfoResponse.Data["+ i +"].CurValue"));

			List<GprsDayUsage> dayUsageList = new ArrayList<GprsDayUsage>();
			for (int j = 0; j < _ctx.lengthValue("QueryCardHistoryFlowInfoResponse.Data["+ i +"].DayUsageList.Length"); j++) {
				GprsDayUsage gprsDayUsage = new GprsDayUsage();
				gprsDayUsage.setDay(_ctx.integerValue("QueryCardHistoryFlowInfoResponse.Data["+ i +"].DayUsageList["+ j +"].Day"));
				gprsDayUsage.setValue(_ctx.longValue("QueryCardHistoryFlowInfoResponse.Data["+ i +"].DayUsageList["+ j +"].Value"));

				dayUsageList.add(gprsDayUsage);
			}
			gprsMonthUsageDTO.setDayUsageList(dayUsageList);

			data.add(gprsMonthUsageDTO);
		}
		queryCardHistoryFlowInfoResponse.setData(data);
	 
	 	return queryCardHistoryFlowInfoResponse;
	}
}