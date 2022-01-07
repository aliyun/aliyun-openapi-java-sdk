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

package com.aliyuncs.dypnsapi.transform.v20170525;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dypnsapi.model.v20170525.QueryGateVerifyStatisticPublicResponse;
import com.aliyuncs.dypnsapi.model.v20170525.QueryGateVerifyStatisticPublicResponse.Data;
import com.aliyuncs.dypnsapi.model.v20170525.QueryGateVerifyStatisticPublicResponse.Data.DayStatisticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryGateVerifyStatisticPublicResponseUnmarshaller {

	public static QueryGateVerifyStatisticPublicResponse unmarshall(QueryGateVerifyStatisticPublicResponse queryGateVerifyStatisticPublicResponse, UnmarshallerContext _ctx) {
		
		queryGateVerifyStatisticPublicResponse.setRequestId(_ctx.stringValue("QueryGateVerifyStatisticPublicResponse.RequestId"));
		queryGateVerifyStatisticPublicResponse.setCode(_ctx.stringValue("QueryGateVerifyStatisticPublicResponse.Code"));
		queryGateVerifyStatisticPublicResponse.setMessage(_ctx.stringValue("QueryGateVerifyStatisticPublicResponse.Message"));

		Data data = new Data();
		data.setTotalFail(_ctx.longValue("QueryGateVerifyStatisticPublicResponse.Data.TotalFail"));
		data.setTotal(_ctx.longValue("QueryGateVerifyStatisticPublicResponse.Data.Total"));
		data.setTotalSuccess(_ctx.longValue("QueryGateVerifyStatisticPublicResponse.Data.TotalSuccess"));
		data.setTotalUnknown(_ctx.longValue("QueryGateVerifyStatisticPublicResponse.Data.TotalUnknown"));

		List<DayStatisticItem> dayStatistic = new ArrayList<DayStatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryGateVerifyStatisticPublicResponse.Data.DayStatistic.Length"); i++) {
			DayStatisticItem dayStatisticItem = new DayStatisticItem();
			dayStatisticItem.setStatisticDateStr(_ctx.stringValue("QueryGateVerifyStatisticPublicResponse.Data.DayStatistic["+ i +"].StatisticDateStr"));
			dayStatisticItem.setTotalSuccess(_ctx.longValue("QueryGateVerifyStatisticPublicResponse.Data.DayStatistic["+ i +"].TotalSuccess"));
			dayStatisticItem.setTotalFail(_ctx.longValue("QueryGateVerifyStatisticPublicResponse.Data.DayStatistic["+ i +"].TotalFail"));
			dayStatisticItem.setTotalUnknown(_ctx.longValue("QueryGateVerifyStatisticPublicResponse.Data.DayStatistic["+ i +"].TotalUnknown"));

			dayStatistic.add(dayStatisticItem);
		}
		data.setDayStatistic(dayStatistic);
		queryGateVerifyStatisticPublicResponse.setData(data);
	 
	 	return queryGateVerifyStatisticPublicResponse;
	}
}