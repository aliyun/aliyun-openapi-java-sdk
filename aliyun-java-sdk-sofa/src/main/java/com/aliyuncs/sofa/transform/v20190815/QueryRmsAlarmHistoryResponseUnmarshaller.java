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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmHistoryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmHistoryResponse.ResponseItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlarmHistoryResponseUnmarshaller {

	public static QueryRmsAlarmHistoryResponse unmarshall(QueryRmsAlarmHistoryResponse queryRmsAlarmHistoryResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlarmHistoryResponse.setRequestId(_ctx.stringValue("QueryRmsAlarmHistoryResponse.RequestId"));
		queryRmsAlarmHistoryResponse.setResultCode(_ctx.stringValue("QueryRmsAlarmHistoryResponse.ResultCode"));
		queryRmsAlarmHistoryResponse.setResultMessage(_ctx.stringValue("QueryRmsAlarmHistoryResponse.ResultMessage"));

		List<ResponseItem> response = new ArrayList<ResponseItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlarmHistoryResponse.Response.Length"); i++) {
			ResponseItem responseItem = new ResponseItem();
			responseItem.setContent(_ctx.stringValue("QueryRmsAlarmHistoryResponse.Response["+ i +"].Content"));
			responseItem.setMetricGroupId(_ctx.stringValue("QueryRmsAlarmHistoryResponse.Response["+ i +"].MetricGroupId"));
			responseItem.setPeriod(_ctx.longValue("QueryRmsAlarmHistoryResponse.Response["+ i +"].Period"));

			response.add(responseItem);
		}
		queryRmsAlarmHistoryResponse.setResponse(response);
	 
	 	return queryRmsAlarmHistoryResponse;
	}
}