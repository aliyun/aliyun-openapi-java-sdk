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

package com.aliyuncs.onsmqtt.transform.v20200420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceMessageSubscribeResponse;
import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceMessageSubscribeResponse.MessageTraceListsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqttTraceMessageSubscribeResponseUnmarshaller {

	public static QueryMqttTraceMessageSubscribeResponse unmarshall(QueryMqttTraceMessageSubscribeResponse queryMqttTraceMessageSubscribeResponse, UnmarshallerContext _ctx) {
		
		queryMqttTraceMessageSubscribeResponse.setRequestId(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.RequestId"));
		queryMqttTraceMessageSubscribeResponse.setSuccess(_ctx.booleanValue("QueryMqttTraceMessageSubscribeResponse.Success"));
		queryMqttTraceMessageSubscribeResponse.setCode(_ctx.integerValue("QueryMqttTraceMessageSubscribeResponse.Code"));
		queryMqttTraceMessageSubscribeResponse.setMessage(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.Message"));
		queryMqttTraceMessageSubscribeResponse.setTotal(_ctx.longValue("QueryMqttTraceMessageSubscribeResponse.Total"));
		queryMqttTraceMessageSubscribeResponse.setPageSize(_ctx.integerValue("QueryMqttTraceMessageSubscribeResponse.PageSize"));
		queryMqttTraceMessageSubscribeResponse.setCurrentPage(_ctx.integerValue("QueryMqttTraceMessageSubscribeResponse.CurrentPage"));

		List<MessageTraceListsItem> messageTraceLists = new ArrayList<MessageTraceListsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqttTraceMessageSubscribeResponse.MessageTraceLists.Length"); i++) {
			MessageTraceListsItem messageTraceListsItem = new MessageTraceListsItem();
			messageTraceListsItem.setClientId(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.MessageTraceLists["+ i +"].ClientId"));
			messageTraceListsItem.setActionInfo(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.MessageTraceLists["+ i +"].ActionInfo"));
			messageTraceListsItem.setAction(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.MessageTraceLists["+ i +"].Action"));
			messageTraceListsItem.setActionCode(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.MessageTraceLists["+ i +"].ActionCode"));
			messageTraceListsItem.setMsgId(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.MessageTraceLists["+ i +"].MsgId"));
			messageTraceListsItem.setTime(_ctx.stringValue("QueryMqttTraceMessageSubscribeResponse.MessageTraceLists["+ i +"].Time"));

			messageTraceLists.add(messageTraceListsItem);
		}
		queryMqttTraceMessageSubscribeResponse.setMessageTraceLists(messageTraceLists);
	 
	 	return queryMqttTraceMessageSubscribeResponse;
	}
}