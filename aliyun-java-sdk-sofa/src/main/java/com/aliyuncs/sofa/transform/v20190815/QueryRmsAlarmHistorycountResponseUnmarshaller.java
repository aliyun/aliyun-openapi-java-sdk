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

import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmHistorycountResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsAlarmHistorycountResponse.ResponseItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsAlarmHistorycountResponseUnmarshaller {

	public static QueryRmsAlarmHistorycountResponse unmarshall(QueryRmsAlarmHistorycountResponse queryRmsAlarmHistorycountResponse, UnmarshallerContext _ctx) {
		
		queryRmsAlarmHistorycountResponse.setRequestId(_ctx.stringValue("QueryRmsAlarmHistorycountResponse.RequestId"));
		queryRmsAlarmHistorycountResponse.setResultCode(_ctx.stringValue("QueryRmsAlarmHistorycountResponse.ResultCode"));
		queryRmsAlarmHistorycountResponse.setResultMessage(_ctx.stringValue("QueryRmsAlarmHistorycountResponse.ResultMessage"));

		List<ResponseItem> response = new ArrayList<ResponseItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsAlarmHistorycountResponse.Response.Length"); i++) {
			ResponseItem responseItem = new ResponseItem();
			responseItem.setKey(_ctx.longValue("QueryRmsAlarmHistorycountResponse.Response["+ i +"].Key"));
			responseItem.setValue(_ctx.longValue("QueryRmsAlarmHistorycountResponse.Response["+ i +"].Value"));

			response.add(responseItem);
		}
		queryRmsAlarmHistorycountResponse.setResponse(response);
	 
	 	return queryRmsAlarmHistorycountResponse;
	}
}