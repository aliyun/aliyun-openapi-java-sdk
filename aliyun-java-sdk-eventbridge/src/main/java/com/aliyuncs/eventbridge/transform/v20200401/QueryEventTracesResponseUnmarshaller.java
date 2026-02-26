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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.QueryEventTracesResponse;
import com.aliyuncs.eventbridge.model.v20200401.QueryEventTracesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEventTracesResponseUnmarshaller {

	public static QueryEventTracesResponse unmarshall(QueryEventTracesResponse queryEventTracesResponse, UnmarshallerContext _ctx) {
		
		queryEventTracesResponse.setRequestId(_ctx.stringValue("QueryEventTracesResponse.RequestId"));
		queryEventTracesResponse.setMessage(_ctx.stringValue("QueryEventTracesResponse.Message"));
		queryEventTracesResponse.setCode(_ctx.stringValue("QueryEventTracesResponse.Code"));
		queryEventTracesResponse.setSuccess(_ctx.booleanValue("QueryEventTracesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryEventTracesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].Action"));
			dataItem.setReceivedTime(_ctx.longValue("QueryEventTracesResponse.Data["+ i +"].ReceivedTime"));
			dataItem.setRuleMatchingTime(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].RuleMatchingTime"));
			dataItem.setActionTime(_ctx.longValue("QueryEventTracesResponse.Data["+ i +"].ActionTime"));
			dataItem.setNotifyStatus(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].NotifyStatus"));
			dataItem.setRuleName(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].RuleName"));
			dataItem.setEventId(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].EventId"));
			dataItem.setEventBusName(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].EventBusName"));
			dataItem.setEndpoint(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].Endpoint"));
			dataItem.setNotifyLatency(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].NotifyLatency"));
			dataItem.setNotifyTime(_ctx.longValue("QueryEventTracesResponse.Data["+ i +"].NotifyTime"));
			dataItem.setEventSource(_ctx.stringValue("QueryEventTracesResponse.Data["+ i +"].EventSource"));

			data.add(dataItem);
		}
		queryEventTracesResponse.setData(data);
	 
	 	return queryEventTracesResponse;
	}
}