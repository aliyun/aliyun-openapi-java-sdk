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

import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqttTraceDeviceResponseUnmarshaller {

	public static QueryMqttTraceDeviceResponse unmarshall(QueryMqttTraceDeviceResponse queryMqttTraceDeviceResponse, UnmarshallerContext _ctx) {
		
		queryMqttTraceDeviceResponse.setRequestId(_ctx.stringValue("QueryMqttTraceDeviceResponse.RequestId"));
		queryMqttTraceDeviceResponse.setSuccess(_ctx.booleanValue("QueryMqttTraceDeviceResponse.Success"));
		queryMqttTraceDeviceResponse.setCode(_ctx.integerValue("QueryMqttTraceDeviceResponse.Code"));
		queryMqttTraceDeviceResponse.setMessage(_ctx.stringValue("QueryMqttTraceDeviceResponse.Message"));
		queryMqttTraceDeviceResponse.setData(_ctx.stringValue("QueryMqttTraceDeviceResponse.Data"));
		queryMqttTraceDeviceResponse.setTotal(_ctx.longValue("QueryMqttTraceDeviceResponse.Total"));
		queryMqttTraceDeviceResponse.setCurrentPage(_ctx.integerValue("QueryMqttTraceDeviceResponse.CurrentPage"));
		queryMqttTraceDeviceResponse.setPageSize(_ctx.integerValue("QueryMqttTraceDeviceResponse.PageSize"));
	 
	 	return queryMqttTraceDeviceResponse;
	}
}