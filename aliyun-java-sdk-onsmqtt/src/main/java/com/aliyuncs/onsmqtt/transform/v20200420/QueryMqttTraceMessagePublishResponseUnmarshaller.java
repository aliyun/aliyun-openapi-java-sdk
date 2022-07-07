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

import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceMessagePublishResponse;
import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceMessagePublishResponse.MessageTraceListsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqttTraceMessagePublishResponseUnmarshaller {

	public static QueryMqttTraceMessagePublishResponse unmarshall(QueryMqttTraceMessagePublishResponse queryMqttTraceMessagePublishResponse, UnmarshallerContext _ctx) {
		
		queryMqttTraceMessagePublishResponse.setRequestId(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.RequestId"));
		queryMqttTraceMessagePublishResponse.setCurrentPage(_ctx.integerValue("QueryMqttTraceMessagePublishResponse.CurrentPage"));
		queryMqttTraceMessagePublishResponse.setSuccess(_ctx.booleanValue("QueryMqttTraceMessagePublishResponse.Success"));
		queryMqttTraceMessagePublishResponse.setCode(_ctx.integerValue("QueryMqttTraceMessagePublishResponse.Code"));
		queryMqttTraceMessagePublishResponse.setMessage(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.Message"));
		queryMqttTraceMessagePublishResponse.setPageSize(_ctx.integerValue("QueryMqttTraceMessagePublishResponse.PageSize"));
		queryMqttTraceMessagePublishResponse.setTotal(_ctx.longValue("QueryMqttTraceMessagePublishResponse.Total"));

		List<MessageTraceListsItem> messageTraceLists = new ArrayList<MessageTraceListsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqttTraceMessagePublishResponse.MessageTraceLists.Length"); i++) {
			MessageTraceListsItem messageTraceListsItem = new MessageTraceListsItem();
			messageTraceListsItem.setTime(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.MessageTraceLists["+ i +"].Time"));
			messageTraceListsItem.setAction(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.MessageTraceLists["+ i +"].Action"));
			messageTraceListsItem.setActionCode(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.MessageTraceLists["+ i +"].ActionCode"));
			messageTraceListsItem.setActionInfo(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.MessageTraceLists["+ i +"].ActionInfo"));
			messageTraceListsItem.setMsgId(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.MessageTraceLists["+ i +"].MsgId"));
			messageTraceListsItem.setClientId(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.MessageTraceLists["+ i +"].ClientId"));

			messageTraceLists.add(messageTraceListsItem);
		}
		queryMqttTraceMessagePublishResponse.setMessageTraceLists(messageTraceLists);
	 
	 	return queryMqttTraceMessagePublishResponse;
	}
}