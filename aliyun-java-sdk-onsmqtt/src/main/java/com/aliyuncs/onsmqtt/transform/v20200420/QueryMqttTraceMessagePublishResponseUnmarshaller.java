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

import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceMessagePublishResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqttTraceMessagePublishResponseUnmarshaller {

	public static QueryMqttTraceMessagePublishResponse unmarshall(QueryMqttTraceMessagePublishResponse queryMqttTraceMessagePublishResponse, UnmarshallerContext _ctx) {
		
		queryMqttTraceMessagePublishResponse.setRequestId(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.RequestId"));
		queryMqttTraceMessagePublishResponse.setSuccess(_ctx.booleanValue("QueryMqttTraceMessagePublishResponse.Success"));
		queryMqttTraceMessagePublishResponse.setCode(_ctx.integerValue("QueryMqttTraceMessagePublishResponse.Code"));
		queryMqttTraceMessagePublishResponse.setMessage(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.Message"));
		queryMqttTraceMessagePublishResponse.setData(_ctx.stringValue("QueryMqttTraceMessagePublishResponse.Data"));
		queryMqttTraceMessagePublishResponse.setTotal(_ctx.longValue("QueryMqttTraceMessagePublishResponse.Total"));
		queryMqttTraceMessagePublishResponse.setCurrentPage(_ctx.integerValue("QueryMqttTraceMessagePublishResponse.CurrentPage"));
		queryMqttTraceMessagePublishResponse.setPageSize(_ctx.integerValue("QueryMqttTraceMessagePublishResponse.PageSize"));
	 
	 	return queryMqttTraceMessagePublishResponse;
	}
}