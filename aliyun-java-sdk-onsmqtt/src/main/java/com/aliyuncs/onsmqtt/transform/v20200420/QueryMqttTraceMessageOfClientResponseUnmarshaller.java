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

import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceMessageOfClientResponse;
import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceMessageOfClientResponse.MessageOfClientListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqttTraceMessageOfClientResponseUnmarshaller {

	public static QueryMqttTraceMessageOfClientResponse unmarshall(QueryMqttTraceMessageOfClientResponse queryMqttTraceMessageOfClientResponse, UnmarshallerContext _ctx) {
		
		queryMqttTraceMessageOfClientResponse.setRequestId(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.RequestId"));
		queryMqttTraceMessageOfClientResponse.setCurrentPage(_ctx.integerValue("QueryMqttTraceMessageOfClientResponse.CurrentPage"));
		queryMqttTraceMessageOfClientResponse.setSuccess(_ctx.booleanValue("QueryMqttTraceMessageOfClientResponse.Success"));
		queryMqttTraceMessageOfClientResponse.setCode(_ctx.integerValue("QueryMqttTraceMessageOfClientResponse.Code"));
		queryMqttTraceMessageOfClientResponse.setMessage(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.Message"));
		queryMqttTraceMessageOfClientResponse.setPageSize(_ctx.integerValue("QueryMqttTraceMessageOfClientResponse.PageSize"));
		queryMqttTraceMessageOfClientResponse.setTotal(_ctx.longValue("QueryMqttTraceMessageOfClientResponse.Total"));

		List<MessageOfClientListItem> messageOfClientList = new ArrayList<MessageOfClientListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqttTraceMessageOfClientResponse.MessageOfClientList.Length"); i++) {
			MessageOfClientListItem messageOfClientListItem = new MessageOfClientListItem();
			messageOfClientListItem.setTime(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.MessageOfClientList["+ i +"].Time"));
			messageOfClientListItem.setAction(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.MessageOfClientList["+ i +"].Action"));
			messageOfClientListItem.setActionCode(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.MessageOfClientList["+ i +"].ActionCode"));
			messageOfClientListItem.setActionInfo(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.MessageOfClientList["+ i +"].ActionInfo"));
			messageOfClientListItem.setMsgId(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.MessageOfClientList["+ i +"].MsgId"));
			messageOfClientListItem.setClientId(_ctx.stringValue("QueryMqttTraceMessageOfClientResponse.MessageOfClientList["+ i +"].ClientId"));

			messageOfClientList.add(messageOfClientListItem);
		}
		queryMqttTraceMessageOfClientResponse.setMessageOfClientList(messageOfClientList);
	 
	 	return queryMqttTraceMessageOfClientResponse;
	}
}