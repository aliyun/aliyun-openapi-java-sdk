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

import com.aliyuncs.sofa.model.v20190815.QueryDWSOrderStepsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryDWSOrderStepsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDWSOrderStepsResponseUnmarshaller {

	public static QueryDWSOrderStepsResponse unmarshall(QueryDWSOrderStepsResponse queryDWSOrderStepsResponse, UnmarshallerContext _ctx) {
		
		queryDWSOrderStepsResponse.setRequestId(_ctx.stringValue("QueryDWSOrderStepsResponse.RequestId"));
		queryDWSOrderStepsResponse.setResultCode(_ctx.stringValue("QueryDWSOrderStepsResponse.ResultCode"));
		queryDWSOrderStepsResponse.setResultMessage(_ctx.stringValue("QueryDWSOrderStepsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDWSOrderStepsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setErrorMessage(_ctx.stringValue("QueryDWSOrderStepsResponse.Data["+ i +"].ErrorMessage"));
			dataItem.setExecutionNode(_ctx.stringValue("QueryDWSOrderStepsResponse.Data["+ i +"].ExecutionNode"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryDWSOrderStepsResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("QueryDWSOrderStepsResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("QueryDWSOrderStepsResponse.Data["+ i +"].Id"));
			dataItem.setLevel(_ctx.longValue("QueryDWSOrderStepsResponse.Data["+ i +"].Level"));
			dataItem.setOrderId(_ctx.longValue("QueryDWSOrderStepsResponse.Data["+ i +"].OrderId"));
			dataItem.setRetryCount(_ctx.longValue("QueryDWSOrderStepsResponse.Data["+ i +"].RetryCount"));
			dataItem.setStartTime(_ctx.stringValue("QueryDWSOrderStepsResponse.Data["+ i +"].StartTime"));
			dataItem.setStatus(_ctx.stringValue("QueryDWSOrderStepsResponse.Data["+ i +"].Status"));
			dataItem.setType(_ctx.stringValue("QueryDWSOrderStepsResponse.Data["+ i +"].Type"));

			data.add(dataItem);
		}
		queryDWSOrderStepsResponse.setData(data);
	 
	 	return queryDWSOrderStepsResponse;
	}
}