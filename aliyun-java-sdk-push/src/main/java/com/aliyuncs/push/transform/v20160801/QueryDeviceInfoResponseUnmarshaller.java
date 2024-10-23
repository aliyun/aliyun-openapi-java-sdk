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

package com.aliyuncs.push.transform.v20160801;

import com.aliyuncs.push.model.v20160801.QueryDeviceInfoResponse;
import com.aliyuncs.push.model.v20160801.QueryDeviceInfoResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceInfoResponseUnmarshaller {

	public static QueryDeviceInfoResponse unmarshall(QueryDeviceInfoResponse queryDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		queryDeviceInfoResponse.setRequestId(_ctx.stringValue("QueryDeviceInfoResponse.RequestId"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setAccount(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.Account"));
		deviceInfo.setAlias(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.Alias"));
		deviceInfo.setBrand(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.Brand"));
		deviceInfo.setDeviceId(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.DeviceId"));
		deviceInfo.setDeviceToken(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.DeviceToken"));
		deviceInfo.setDeviceType(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.DeviceType"));
		deviceInfo.setLastOnlineTime(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.LastOnlineTime"));
		deviceInfo.setModel(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.Model"));
		deviceInfo.setOnline(_ctx.booleanValue("QueryDeviceInfoResponse.DeviceInfo.Online"));
		deviceInfo.setPhoneNumber(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.PhoneNumber"));
		deviceInfo.setPushEnabled(_ctx.booleanValue("QueryDeviceInfoResponse.DeviceInfo.PushEnabled"));
		deviceInfo.setTags(_ctx.stringValue("QueryDeviceInfoResponse.DeviceInfo.Tags"));
		queryDeviceInfoResponse.setDeviceInfo(deviceInfo);
	 
	 	return queryDeviceInfoResponse;
	}
}