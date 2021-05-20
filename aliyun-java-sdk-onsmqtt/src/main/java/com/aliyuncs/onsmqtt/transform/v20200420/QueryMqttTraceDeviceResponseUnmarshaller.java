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

import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceDeviceResponse;
import com.aliyuncs.onsmqtt.model.v20200420.QueryMqttTraceDeviceResponse.DeviceInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMqttTraceDeviceResponseUnmarshaller {

	public static QueryMqttTraceDeviceResponse unmarshall(QueryMqttTraceDeviceResponse queryMqttTraceDeviceResponse, UnmarshallerContext _ctx) {
		
		queryMqttTraceDeviceResponse.setRequestId(_ctx.stringValue("QueryMqttTraceDeviceResponse.RequestId"));
		queryMqttTraceDeviceResponse.setSuccess(_ctx.booleanValue("QueryMqttTraceDeviceResponse.Success"));
		queryMqttTraceDeviceResponse.setCode(_ctx.integerValue("QueryMqttTraceDeviceResponse.Code"));
		queryMqttTraceDeviceResponse.setMessage(_ctx.stringValue("QueryMqttTraceDeviceResponse.Message"));
		queryMqttTraceDeviceResponse.setTotal(_ctx.longValue("QueryMqttTraceDeviceResponse.Total"));
		queryMqttTraceDeviceResponse.setCurrentPage(_ctx.integerValue("QueryMqttTraceDeviceResponse.CurrentPage"));
		queryMqttTraceDeviceResponse.setPageSize(_ctx.integerValue("QueryMqttTraceDeviceResponse.PageSize"));

		List<DeviceInfoListItem> deviceInfoList = new ArrayList<DeviceInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMqttTraceDeviceResponse.DeviceInfoList.Length"); i++) {
			DeviceInfoListItem deviceInfoListItem = new DeviceInfoListItem();
			deviceInfoListItem.setActionInfo(_ctx.stringValue("QueryMqttTraceDeviceResponse.DeviceInfoList["+ i +"].ActionInfo"));
			deviceInfoListItem.setAction(_ctx.stringValue("QueryMqttTraceDeviceResponse.DeviceInfoList["+ i +"].Action"));
			deviceInfoListItem.setActionCode(_ctx.stringValue("QueryMqttTraceDeviceResponse.DeviceInfoList["+ i +"].ActionCode"));
			deviceInfoListItem.setTime(_ctx.stringValue("QueryMqttTraceDeviceResponse.DeviceInfoList["+ i +"].Time"));
			deviceInfoListItem.setChannelId(_ctx.stringValue("QueryMqttTraceDeviceResponse.DeviceInfoList["+ i +"].ChannelId"));

			deviceInfoList.add(deviceInfoListItem);
		}
		queryMqttTraceDeviceResponse.setDeviceInfoList(deviceInfoList);
	 
	 	return queryMqttTraceDeviceResponse;
	}
}